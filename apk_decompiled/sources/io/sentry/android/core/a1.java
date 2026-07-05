package io.sentry.android.core;

import defpackage.cd;
import io.sentry.n4;
import io.sentry.t4;
import io.sentry.t5;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class a1 implements c0 {
    public final long F;
    public io.sentry.r G;
    public final boolean K;
    public final boolean L;
    public final AtomicLong E = new AtomicLong(0);
    public final io.sentry.util.h H = new io.sentry.util.h(new io.sentry.e0(15));
    public final io.sentry.util.a I = new io.sentry.util.a();
    public final n4 J = n4.a;
    public final io.sentry.transport.c M = io.sentry.transport.c.E;

    public a1(long j, boolean z, boolean z2) {
        this.F = j;
        this.K = z;
        this.L = z2;
    }

    public final void a(String str) {
        if (this.L) {
            io.sentry.g gVar = new io.sentry.g();
            gVar.I = "navigation";
            gVar.c("state", str);
            gVar.K = "app.lifecycle";
            gVar.M = t5.INFO;
            this.J.m(gVar);
        }
    }

    public final void b() {
        io.sentry.v vVarA = this.I.a();
        try {
            io.sentry.r rVar = this.G;
            if (rVar != null) {
                rVar.cancel();
                this.G = null;
            }
            vVarA.close();
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.android.core.c0
    public final void i() {
        b();
        this.M.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        cd cdVar = new cd(20, this);
        n4 n4Var = this.J;
        n4Var.getClass();
        t4.e(cdVar);
        AtomicLong atomicLong = this.E;
        long j = atomicLong.get();
        if (j == 0 || j + this.F <= jCurrentTimeMillis) {
            if (this.K) {
                n4Var.v();
            }
            n4Var.r().getReplayController().K();
        }
        n4Var.r().getReplayController().f();
        atomicLong.set(jCurrentTimeMillis);
        a("foreground");
    }

    @Override // io.sentry.android.core.c0
    public final void x() {
        this.M.getClass();
        this.E.set(System.currentTimeMillis());
        this.J.r().getReplayController().x();
        io.sentry.v vVarA = this.I.a();
        try {
            b();
            this.G = new io.sentry.r(1, this);
            ((Timer) this.H.a()).schedule(this.G, this.F);
            vVarA.close();
            a("background");
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
