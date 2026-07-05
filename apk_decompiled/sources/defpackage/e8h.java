package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e8h {
    public static final ih9 f = u00.c(new x2h(9));
    public final kah a;
    public final x5h b;
    public final kdg c = new kdg();
    public final lsc d = mpk.P(w7h.a);
    public long e;

    public e8h(kah kahVar, x5h x5hVar) {
        this.a = kahVar;
        this.b = x5hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f1, code lost:
    
        if (r9 == null) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0053 -> B:18:0x0056). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r20, defpackage.vp4 r21) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e8h.a(java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r10, defpackage.vp4 r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.c8h
            if (r0 == 0) goto L13
            r0 = r11
            c8h r0 = (defpackage.c8h) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            c8h r0 = new c8h
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.F
            int r1 = r0.H
            r2 = 0
            lsc r3 = r9.d
            r4 = 2
            r5 = 1
            m45 r6 = defpackage.m45.E
            if (r1 == 0) goto L39
            if (r1 == r5) goto L33
            if (r1 != r4) goto L2d
            defpackage.sf5.h0(r11)
            return r11
        L2d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r9)
            return r2
        L33:
            java.lang.String r10 = r0.E
            defpackage.sf5.h0(r11)
            goto L55
        L39:
            defpackage.sf5.h0(r11)
            kdg r11 = r9.c
            r11.clear()
            r7 = 0
            r9.e = r7
            x7h r11 = defpackage.x7h.a
            r3.setValue(r11)
            r0.E = r10
            r0.H = r5
            java.lang.Object r11 = r9.a(r10, r0)
            if (r11 != r6) goto L55
            goto L64
        L55:
            y7h r11 = defpackage.y7h.a
            r3.setValue(r11)
            r0.E = r2
            r0.H = r4
            java.lang.Object r9 = r9.c(r10, r0)
            if (r9 != r6) goto L65
        L64:
            return r6
        L65:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e8h.b(java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r7, defpackage.vp4 r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.d8h
            if (r0 == 0) goto L13
            r0 = r8
            d8h r0 = (defpackage.d8h) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            d8h r0 = new d8h
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.E
            int r1 = r0.G
            lsc r2 = r6.d
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            defpackage.sf5.h0(r8)     // Catch: java.util.concurrent.CancellationException -> L28
            goto L56
        L28:
            r6 = move-exception
            goto L6f
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            return r4
        L30:
            defpackage.sf5.h0(r8)
            x5h r8 = r6.b     // Catch: java.util.concurrent.CancellationException -> L28
            w5h r8 = r8.a(r7, r4, r4)     // Catch: java.util.concurrent.CancellationException -> L28
            n23 r1 = new n23     // Catch: java.util.concurrent.CancellationException -> L28
            r5 = 5
            r1.<init>(r6, r7, r4, r5)     // Catch: java.util.concurrent.CancellationException -> L28
            yp7 r7 = new yp7     // Catch: java.util.concurrent.CancellationException -> L28
            r7.<init>(r8, r1, r3)     // Catch: java.util.concurrent.CancellationException -> L28
            i7 r8 = new i7     // Catch: java.util.concurrent.CancellationException -> L28
            r1 = 21
            r8.<init>(r1, r6)     // Catch: java.util.concurrent.CancellationException -> L28
            r0.G = r3     // Catch: java.util.concurrent.CancellationException -> L28
            java.lang.Object r6 = r7.a(r8, r0)     // Catch: java.util.concurrent.CancellationException -> L28
            m45 r7 = defpackage.m45.E
            if (r6 != r7) goto L56
            return r7
        L56:
            java.lang.Object r6 = r2.getValue()     // Catch: java.util.concurrent.CancellationException -> L28
            z7h r6 = (defpackage.z7h) r6     // Catch: java.util.concurrent.CancellationException -> L28
            y7h r7 = defpackage.y7h.a     // Catch: java.util.concurrent.CancellationException -> L28
            boolean r6 = defpackage.x44.r(r6, r7)     // Catch: java.util.concurrent.CancellationException -> L28
            if (r6 == 0) goto L6c
            v7h r6 = new v7h     // Catch: java.util.concurrent.CancellationException -> L28
            r6.<init>(r4)     // Catch: java.util.concurrent.CancellationException -> L28
            r2.setValue(r6)     // Catch: java.util.concurrent.CancellationException -> L28
        L6c:
            iei r6 = defpackage.iei.a
            return r6
        L6f:
            v7h r7 = new v7h
            r7.<init>(r4)
            r2.setValue(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e8h.c(java.lang.String, vp4):java.lang.Object");
    }
}
