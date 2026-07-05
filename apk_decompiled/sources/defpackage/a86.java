package defpackage;

import kotlinx.coroutines.DispatchException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a86 {
    public static final sqb a = new sqb("UNDEFINED", 1);
    public static final sqb b = new sqb("REUSABLE_CLAIMED", 1);

    /* JADX WARN: Removed duplicated region for block: B:32:0x008a A[Catch: all -> 0x0069, DONT_GENERATE, TryCatch #2 {all -> 0x0069, blocks: (B:16:0x0049, B:18:0x0057, B:20:0x005d, B:33:0x008d, B:23:0x006b, B:25:0x0079, B:30:0x0084, B:32:0x008a, B:38:0x009a, B:41:0x00a3, B:40:0x00a0, B:28:0x007f), top: B:54:0x0049, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.tp4 r9, java.lang.Object r10) {
        /*
            boolean r0 = r9 instanceof defpackage.z76
            if (r0 == 0) goto Lae
            z76 r9 = (defpackage.z76) r9
            e45 r0 = r9.H
            vp4 r1 = r9.I
            java.lang.Throwable r2 = defpackage.jre.a(r10)
            if (r2 != 0) goto L12
            r3 = r10
            goto L18
        L12:
            e94 r3 = new e94
            r4 = 0
            r3.<init>(r2, r4)
        L18:
            c45 r2 = r1.getContext()
            boolean r2 = c(r0, r2)
            r4 = 1
            if (r2 == 0) goto L2f
            r9.J = r3
            r9.G = r4
            c45 r10 = r1.getContext()
            b(r0, r10, r9)
            return
        L2f:
            vz6 r0 = defpackage.vnh.a()
            long r5 = r0.G
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L46
            r9.J = r3
            r9.G = r4
            r0.T0(r9)
            goto La8
        L46:
            r0.U0(r4)
            c45 r2 = r1.getContext()     // Catch: java.lang.Throwable -> L69
            dd8 r3 = defpackage.dd8.J     // Catch: java.lang.Throwable -> L69
            a45 r2 = r2.x0(r3)     // Catch: java.lang.Throwable -> L69
            lf9 r2 = (defpackage.lf9) r2     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto L6b
            boolean r3 = r2.c()     // Catch: java.lang.Throwable -> L69
            if (r3 != 0) goto L6b
            java.util.concurrent.CancellationException r10 = r2.H()     // Catch: java.lang.Throwable -> L69
            hre r10 = defpackage.sf5.u(r10)     // Catch: java.lang.Throwable -> L69
            r9.resumeWith(r10)     // Catch: java.lang.Throwable -> L69
            goto L8d
        L69:
            r10 = move-exception
            goto La4
        L6b:
            java.lang.Object r2 = r9.K     // Catch: java.lang.Throwable -> L69
            c45 r3 = r1.getContext()     // Catch: java.lang.Throwable -> L69
            java.lang.Object r2 = defpackage.qnh.c(r3, r2)     // Catch: java.lang.Throwable -> L69
            sqb r5 = defpackage.qnh.a     // Catch: java.lang.Throwable -> L69
            if (r2 == r5) goto L7e
            ydi r5 = defpackage.zni.d0(r1, r3, r2)     // Catch: java.lang.Throwable -> L69
            goto L7f
        L7e:
            r5 = 0
        L7f:
            r1.resumeWith(r10)     // Catch: java.lang.Throwable -> L97
            if (r5 == 0) goto L8a
            boolean r10 = r5.z0()     // Catch: java.lang.Throwable -> L69
            if (r10 == 0) goto L8d
        L8a:
            defpackage.qnh.a(r3, r2)     // Catch: java.lang.Throwable -> L69
        L8d:
            boolean r10 = r0.W0()     // Catch: java.lang.Throwable -> L69
            if (r10 != 0) goto L8d
        L93:
            r0.S0(r4)
            goto La8
        L97:
            r10 = move-exception
            if (r5 == 0) goto La0
            boolean r1 = r5.z0()     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto La3
        La0:
            defpackage.qnh.a(r3, r2)     // Catch: java.lang.Throwable -> L69
        La3:
            throw r10     // Catch: java.lang.Throwable -> L69
        La4:
            r9.f(r10)     // Catch: java.lang.Throwable -> La9
            goto L93
        La8:
            return
        La9:
            r9 = move-exception
            r0.S0(r4)
            throw r9
        Lae:
            r9.resumeWith(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a86.a(tp4, java.lang.Object):void");
    }

    public static final void b(e45 e45Var, c45 c45Var, Runnable runnable) {
        try {
            e45Var.O0(c45Var, runnable);
        } catch (Throwable th) {
            throw new DispatchException(th, e45Var, c45Var);
        }
    }

    public static final boolean c(e45 e45Var, c45 c45Var) throws DispatchException {
        try {
            return e45Var.Q0(c45Var);
        } catch (Throwable th) {
            throw new DispatchException(th, e45Var, c45Var);
        }
    }
}
