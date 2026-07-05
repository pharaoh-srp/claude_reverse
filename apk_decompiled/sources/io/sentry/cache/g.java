package io.sentry.cache;

import defpackage.cd;
import defpackage.fy1;
import defpackage.j01;
import defpackage.tui;
import defpackage.y0;
import io.sentry.h4;
import io.sentry.j7;
import io.sentry.k4;
import io.sentry.protocol.i0;
import io.sentry.protocol.w;
import io.sentry.t5;
import io.sentry.util.h;
import io.sentry.w6;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g extends k4 {
    public static final Charset c = Charset.forName("UTF-8");
    public final w6 a;
    public final h b = new h(new cd(23, this));

    public g(w6 w6Var) {
        this.a = w6Var;
    }

    public final void a(String str) {
        a.a(this.a, ".scope-cache", str);
    }

    public final Object b(w6 w6Var, String str, Class cls) {
        if (!str.equals("breadcrumbs.json")) {
            return a.c(w6Var, ".scope-cache", str, cls);
        }
        try {
            return cls.cast(((io.sentry.cache.tape.g) this.b.a()).l0());
        } catch (IOException unused) {
            w6Var.getLogger().h(t5.ERROR, "Unable to read serialized breadcrumbs from QueueFile", new Object[0]);
            return null;
        }
    }

    public final void c(Runnable runnable) {
        w6 w6Var = this.a;
        if (w6Var.isEnableScopePersistence()) {
            if (Thread.currentThread().getName().contains("SentryExecutor")) {
                try {
                    runnable.run();
                    return;
                } catch (Throwable th) {
                    w6Var.getLogger().d(t5.ERROR, "Serialization task failed", th);
                    return;
                }
            }
            try {
                w6Var.getExecutorService().submit(new j01(this, 28, runnable));
            } catch (Throwable th2) {
                w6Var.getLogger().d(t5.ERROR, "Serialization task could not be scheduled", th2);
            }
        }
    }

    public final void d(String str, Object obj) {
        a.d(this.a, obj, ".scope-cache", str);
    }

    @Override // io.sentry.g1
    public final void e(i0 i0Var) {
        c(new j01(this, 25, i0Var));
    }

    @Override // io.sentry.g1
    public final void m(io.sentry.g gVar) {
        c(new f(this, gVar, 1));
    }

    @Override // io.sentry.k4, io.sentry.g1
    public final void n(Collection collection) {
        if (collection.isEmpty()) {
            c(new y0(17, this));
        }
    }

    @Override // io.sentry.k4, io.sentry.g1
    public final void o(List list) {
        c(new tui(this, list));
    }

    @Override // io.sentry.k4, io.sentry.g1
    public final void q(w wVar) {
        c(new tui(this, 20, wVar));
    }

    @Override // io.sentry.k4, io.sentry.g1
    public final void u(ConcurrentHashMap concurrentHashMap) {
        c(new j01(this, 27, concurrentHashMap));
    }

    @Override // io.sentry.g1
    public final void v(j7 j7Var, h4 h4Var) {
        c(new fy1(this, j7Var, h4Var, 6));
    }

    @Override // io.sentry.k4, io.sentry.g1
    public final void w(t5 t5Var) {
        c(new tui(this, 21, t5Var));
    }

    @Override // io.sentry.k4, io.sentry.g1
    public final void x(io.sentry.protocol.e eVar) {
        c(new j01(this, 26, eVar));
    }

    @Override // io.sentry.k4, io.sentry.g1
    public final void y(ConcurrentHashMap concurrentHashMap) {
        c(new tui(this, 18, concurrentHashMap));
    }

    @Override // io.sentry.k4, io.sentry.g1
    public final void z(String str) {
        c(new f(this, str, 0));
    }
}
