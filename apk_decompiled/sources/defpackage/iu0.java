package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iu0 {
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a1, code lost:
    
        if (defpackage.gb9.c0(r0, r9, r3) == r8) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(android.app.Activity r16, defpackage.tp0 r17, defpackage.h86 r18, defpackage.vp4 r19) {
        /*
            r0 = r16
            r1 = r17
            r2 = r19
            boolean r3 = r2 instanceof defpackage.hu0
            if (r3 == 0) goto L19
            r3 = r2
            hu0 r3 = (defpackage.hu0) r3
            int r4 = r3.J
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.J = r4
            goto L1e
        L19:
            hu0 r3 = new hu0
            r3.<init>(r2)
        L1e:
            java.lang.Object r2 = r3.I
            int r4 = r3.J
            r5 = 2
            r6 = 1
            r7 = 0
            m45 r8 = defpackage.m45.E
            if (r4 == 0) goto L4a
            if (r4 == r6) goto L3b
            if (r4 != r5) goto L35
            defpackage.sf5.h0(r2)     // Catch: java.lang.Throwable -> L32 java.util.concurrent.CancellationException -> Lb5
            goto Lb0
        L32:
            r0 = move-exception
            goto La4
        L35:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r0)
            return r7
        L3b:
            android.print.PrintManager r0 = r3.H
            h86 r1 = r3.G
            tp0 r4 = r3.F
            android.app.Activity r9 = r3.E
            defpackage.sf5.h0(r2)     // Catch: java.lang.Throwable -> L32 java.util.concurrent.CancellationException -> Lb5
            r13 = r0
            r11 = r4
            r10 = r9
            goto L85
        L4a:
            defpackage.sf5.h0(r2)
            if (r0 == 0) goto L56
            java.lang.String r2 = "print"
            java.lang.Object r2 = r0.getSystemService(r2)
            goto L57
        L56:
            r2 = r7
        L57:
            boolean r4 = r2 instanceof android.print.PrintManager
            if (r4 == 0) goto L5e
            android.print.PrintManager r2 = (android.print.PrintManager) r2
            goto L5f
        L5e:
            r2 = r7
        L5f:
            if (r2 != 0) goto L64
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L64:
            e45 r4 = r18.b()     // Catch: java.lang.Throwable -> L32 java.util.concurrent.CancellationException -> Lb5
            kk0 r9 = new kk0     // Catch: java.lang.Throwable -> L32 java.util.concurrent.CancellationException -> Lb5
            r9.<init>(r1, r7, r5)     // Catch: java.lang.Throwable -> L32 java.util.concurrent.CancellationException -> Lb5
            r3.E = r0     // Catch: java.lang.Throwable -> L32 java.util.concurrent.CancellationException -> Lb5
            r3.F = r1     // Catch: java.lang.Throwable -> L32 java.util.concurrent.CancellationException -> Lb5
            r10 = r18
            r3.G = r10     // Catch: java.lang.Throwable -> L32 java.util.concurrent.CancellationException -> Lb5
            r3.H = r2     // Catch: java.lang.Throwable -> L32 java.util.concurrent.CancellationException -> Lb5
            r3.J = r6     // Catch: java.lang.Throwable -> L32 java.util.concurrent.CancellationException -> Lb5
            java.lang.Object r4 = defpackage.gb9.c0(r4, r9, r3)     // Catch: java.lang.Throwable -> L32 java.util.concurrent.CancellationException -> Lb5
            if (r4 != r8) goto L80
            goto La3
        L80:
            r11 = r1
            r13 = r2
            r2 = r4
            r1 = r10
            r10 = r0
        L85:
            r12 = r2
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Throwable -> L32 java.util.concurrent.CancellationException -> Lb5
            e45 r0 = r1.a()     // Catch: java.lang.Throwable -> L32 java.util.concurrent.CancellationException -> Lb5
            qq0 r9 = new qq0     // Catch: java.lang.Throwable -> L32 java.util.concurrent.CancellationException -> Lb5
            r14 = 0
            r15 = 4
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L32 java.util.concurrent.CancellationException -> Lb5
            r3.E = r7     // Catch: java.lang.Throwable -> L32 java.util.concurrent.CancellationException -> Lb5
            r3.F = r7     // Catch: java.lang.Throwable -> L32 java.util.concurrent.CancellationException -> Lb5
            r3.G = r7     // Catch: java.lang.Throwable -> L32 java.util.concurrent.CancellationException -> Lb5
            r3.H = r7     // Catch: java.lang.Throwable -> L32 java.util.concurrent.CancellationException -> Lb5
            r3.J = r5     // Catch: java.lang.Throwable -> L32 java.util.concurrent.CancellationException -> Lb5
            java.lang.Object r0 = defpackage.gb9.c0(r0, r9, r3)     // Catch: java.lang.Throwable -> L32 java.util.concurrent.CancellationException -> Lb5
            if (r0 != r8) goto Lb0
        La3:
            return r8
        La4:
            java.util.List r1 = defpackage.xah.a
            ozf r1 = defpackage.ozf.F
            r2 = 24
            java.lang.String r3 = "Failed to launch print dialog for artifact"
            defpackage.xah.f(r0, r3, r1, r7, r2)
            r6 = 0
        Lb0:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            return r0
        Lb5:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iu0.a(android.app.Activity, tp0, h86, vp4):java.lang.Object");
    }
}
