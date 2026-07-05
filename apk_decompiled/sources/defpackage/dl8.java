package defpackage;

import android.net.ConnectivityManager;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.anthropic.claude.api.events.EventLoggingRequest;
import java.io.Closeable;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class dl8 implements DefaultLifecycleObserver, Closeable {
    public static final ide T = new ide("^[A-Za-z0-9_.:-]+$");
    public static final ide U = new ide("[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}");
    public final bg9 E;
    public final uz6 F;
    public final kr9 G;
    public final h86 H;
    public final String I;
    public final String J;
    public final dg8 K;
    public final c4a L;
    public final ConnectivityManager M;
    public final l45 N;
    public final xp3 O;
    public final gg7 P;
    public final jz6 Q;
    public final ev6 R;
    public final fkg S;

    public dl8(File file, bg9 bg9Var, uz6 uz6Var, kr9 kr9Var, h86 h86Var, dg8 dg8Var, c4a c4aVar, ConnectivityManager connectivityManager, l45 l45Var) {
        k2e k2eVar = k2e.F;
        h86.a.getClass();
        ft5 ft5Var = g86.a;
        vr5 vr5Var = vr5.G;
        c4aVar.getClass();
        vr5Var.getClass();
        this.E = bg9Var;
        this.F = uz6Var;
        this.G = kr9Var;
        this.H = h86Var;
        this.I = "1.260618.10";
        this.J = "android";
        this.K = dg8Var;
        this.L = c4aVar;
        this.M = connectivityManager;
        this.N = l45Var;
        this.O = k2eVar;
        gg7 gg7Var = new gg7(15);
        this.P = gg7Var;
        int i = 1;
        jz6 jz6Var = new jz6(file, "health_metrics", EventLoggingRequest.Companion.serializer(), bg9Var, new xf7(i, gg7Var), vr5Var, k2eVar);
        this.Q = jz6Var;
        int i2 = 0;
        this.R = new ev6(jz6Var, new wv2(2, this, dl8.class, "uploadBatch", "uploadBatch(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", i2, 3), "HealthMetricEventLogger", l45Var, h86Var, new xf7(i, gg7Var), new dm(0, this, dl8.class, "isNetworkAvailable", "isNetworkAvailable()Z", i2, 14));
        this.S = gb9.D(l45Var, h86Var.a(), null, new fj(this, null, 14), 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (r6 == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (r6 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.dl8 r4, java.util.List r5, defpackage.tp4 r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof defpackage.cl8
            if (r0 == 0) goto L16
            r0 = r6
            cl8 r0 = (defpackage.cl8) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.G = r1
            goto L1b
        L16:
            cl8 r0 = new cl8
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.E
            int r1 = r0.G
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L36
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2b
            defpackage.sf5.h0(r6)
            goto L76
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L32:
            defpackage.sf5.h0(r6)
            goto L68
        L36:
            defpackage.sf5.h0(r6)
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L46
            gki r4 = new gki
            r5 = 0
            r4.<init>(r5, r5)
            return r4
        L46:
            com.anthropic.claude.api.events.BatchEventLoggingRequest r6 = new com.anthropic.claude.api.events.BatchEventLoggingRequest
            r6.<init>(r5)
            kr9 r5 = r4.G
            java.lang.Object r5 = r5.a()
            zk8 r5 = (defpackage.zk8) r5
            m45 r1 = defpackage.m45.E
            if (r5 == 0) goto L6b
            uz6 r4 = r5.a()
            java.lang.String r5 = r5.b()
            r0.G = r3
            java.lang.Object r6 = r4.a(r5, r6, r0)
            if (r6 != r1) goto L68
            goto L75
        L68:
            com.anthropic.claude.api.result.ApiResult r6 = (com.anthropic.claude.api.result.ApiResult) r6
            goto L78
        L6b:
            uz6 r4 = r4.F
            r0.G = r2
            java.lang.Object r6 = r4.b(r6, r0)
            if (r6 != r1) goto L76
        L75:
            return r1
        L76:
            com.anthropic.claude.api.result.ApiResult r6 = (com.anthropic.claude.api.result.ApiResult) r6
        L78:
            hki r4 = defpackage.cjk.m(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl8.c(dl8, java.util.List, tp4):java.lang.Object");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.S.d(null);
        ev6 ev6Var = this.R;
        lf9 lf9Var = ev6Var.j;
        if (lf9Var != null) {
            lf9Var.d(null);
        }
        ev6Var.j = null;
        this.Q.d();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(m4a m4aVar) {
        m4aVar.getClass();
        this.R.b();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(m4a m4aVar) {
        m4aVar.getClass();
        gb9.D(this.N, null, null, new al8(this, (tp4) null, 0), 3);
        ev6 ev6Var = this.R;
        lf9 lf9Var = ev6Var.j;
        if (lf9Var != null) {
            lf9Var.d(null);
        }
        ev6Var.j = null;
    }
}
