package defpackage;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class coa implements e2h, Closeable {
    public final u0h E = new u0h(new q59(28));

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.e2h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r5, defpackage.tp4 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.boa
            if (r0 == 0) goto L13
            r0 = r6
            boa r0 = (defpackage.boa) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L1a
        L13:
            boa r0 = new boa
            vp4 r6 = (defpackage.vp4) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.E
            int r1 = r0.G
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            defpackage.sf5.h0(r6)     // Catch: java.util.concurrent.CancellationException -> L62 java.lang.Exception -> L64
            goto L4d
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r3
        L2e:
            defpackage.sf5.h0(r6)
            u0h r4 = r4.E     // Catch: java.util.concurrent.CancellationException -> L62 java.lang.Exception -> L64
            java.lang.Object r4 = r4.getValue()     // Catch: java.util.concurrent.CancellationException -> L62 java.lang.Exception -> L64
            ws9 r4 = (defpackage.ws9) r4     // Catch: java.util.concurrent.CancellationException -> L62 java.lang.Exception -> L64
            zs9 r4 = (defpackage.zs9) r4     // Catch: java.util.concurrent.CancellationException -> L62 java.lang.Exception -> L64
            r5l r4 = r4.e(r5)     // Catch: java.util.concurrent.CancellationException -> L62 java.lang.Exception -> L64
            r4.getClass()     // Catch: java.util.concurrent.CancellationException -> L62 java.lang.Exception -> L64
            r0.G = r2     // Catch: java.util.concurrent.CancellationException -> L62 java.lang.Exception -> L64
            java.lang.Object r6 = defpackage.zh4.k(r4, r0)     // Catch: java.util.concurrent.CancellationException -> L62 java.lang.Exception -> L64
            m45 r4 = defpackage.m45.E
            if (r6 != r4) goto L4d
            return r4
        L4d:
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.util.concurrent.CancellationException -> L62 java.lang.Exception -> L64
            java.lang.String r4 = "und"
            boolean r4 = defpackage.x44.r(r6, r4)
            if (r4 != 0) goto L58
            goto L59
        L58:
            r6 = r3
        L59:
            if (r6 == 0) goto L64
            r4 = 45
            java.lang.String r4 = defpackage.bsg.g1(r6, r4)
            return r4
        L62:
            r4 = move-exception
            goto L65
        L64:
            return r3
        L65:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coa.c(java.lang.String, tp4):java.lang.Object");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        u0h u0hVar = this.E;
        if (u0hVar.b()) {
            ((zs9) ((ws9) u0hVar.getValue())).close();
        }
    }
}
