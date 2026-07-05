package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ap7 {
    public float a;
    public float b;
    public float c;
    public float d;
    public final a80 e;
    public v79 f;
    public v79 g;

    public ap7(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = new a80(new va6(f), dgj.h, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r5v2, types: [iei, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.v79 r6, defpackage.vp4 r7) {
        /*
            r5 = this;
            a80 r0 = r5.e
            boolean r1 = r7 instanceof defpackage.yo7
            if (r1 == 0) goto L15
            r1 = r7
            yo7 r1 = (defpackage.yo7) r1
            int r2 = r1.H
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.H = r2
            goto L1a
        L15:
            yo7 r1 = new yo7
            r1.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r1.F
            int r2 = r1.H
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            v79 r6 = r1.E
            defpackage.sf5.h0(r7)     // Catch: java.lang.Throwable -> L29
            goto L6d
        L29:
            r7 = move-exception
            goto L72
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            r5 = 0
            return r5
        L32:
            defpackage.sf5.h0(r7)
            boolean r7 = r6 instanceof defpackage.odd
            if (r7 == 0) goto L3c
            float r7 = r5.b
            goto L4c
        L3c:
            boolean r7 = r6 instanceof defpackage.lp8
            if (r7 == 0) goto L43
            float r7 = r5.c
            goto L4c
        L43:
            boolean r7 = r6 instanceof defpackage.ks7
            if (r7 == 0) goto L4a
            float r7 = r5.d
            goto L4c
        L4a:
            float r7 = r5.a
        L4c:
            r5.g = r6
            lsc r2 = r0.e     // Catch: java.lang.Throwable -> L29
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L29
            va6 r2 = (defpackage.va6) r2     // Catch: java.lang.Throwable -> L29
            float r2 = r2.E     // Catch: java.lang.Throwable -> L29
            boolean r2 = defpackage.va6.b(r2, r7)     // Catch: java.lang.Throwable -> L29
            if (r2 != 0) goto L6d
            v79 r2 = r5.f     // Catch: java.lang.Throwable -> L29
            r1.E = r6     // Catch: java.lang.Throwable -> L29
            r1.H = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r7 = defpackage.lk6.a(r0, r7, r2, r6, r1)     // Catch: java.lang.Throwable -> L29
            m45 r0 = defpackage.m45.E
            if (r7 != r0) goto L6d
            return r0
        L6d:
            r5.f = r6
            iei r5 = defpackage.iei.a
            return r5
        L72:
            r5.f = r6
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ap7.a(v79, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.vp4 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.zo7
            if (r0 == 0) goto L13
            r0 = r5
            zo7 r0 = (defpackage.zo7) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            zo7 r0 = new zo7
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.E
            int r1 = r0.G
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            defpackage.sf5.h0(r5)     // Catch: java.lang.Throwable -> L25
            goto L6c
        L25:
            r5 = move-exception
            goto L71
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.sf5.h0(r5)
            v79 r5 = r4.g
            boolean r1 = r5 instanceof defpackage.odd
            if (r1 == 0) goto L3a
            float r5 = r4.b
            goto L4a
        L3a:
            boolean r1 = r5 instanceof defpackage.lp8
            if (r1 == 0) goto L41
            float r5 = r4.c
            goto L4a
        L41:
            boolean r5 = r5 instanceof defpackage.ks7
            if (r5 == 0) goto L48
            float r5 = r4.d
            goto L4a
        L48:
            float r5 = r4.a
        L4a:
            a80 r1 = r4.e
            lsc r3 = r1.e
            java.lang.Object r3 = r3.getValue()
            va6 r3 = (defpackage.va6) r3
            float r3 = r3.E
            boolean r3 = defpackage.va6.b(r3, r5)
            if (r3 != 0) goto L76
            va6 r3 = new va6     // Catch: java.lang.Throwable -> L25
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L25
            r0.G = r2     // Catch: java.lang.Throwable -> L25
            java.lang.Object r5 = r1.g(r0, r3)     // Catch: java.lang.Throwable -> L25
            m45 r0 = defpackage.m45.E
            if (r5 != r0) goto L6c
            return r0
        L6c:
            v79 r5 = r4.g
            r4.f = r5
            goto L76
        L71:
            v79 r0 = r4.g
            r4.f = r0
            throw r5
        L76:
            iei r4 = defpackage.iei.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ap7.b(vp4):java.lang.Object");
    }
}
