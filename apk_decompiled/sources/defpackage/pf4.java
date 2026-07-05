package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pf4 {
    public static final ho3 a = new ho3(3, null, 1);

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f A[LOOP:0: B:19:0x004d->B:20:0x004f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.d0h r7, defpackage.vd1 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.kf4
            if (r0 == 0) goto L13
            r0 = r8
            kf4 r0 = (defpackage.kf4) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            kf4 r0 = new kf4
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.F
            int r1 = r0.G
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            d0h r7 = r0.E
            defpackage.sf5.h0(r8)
            goto L40
        L27:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            r7 = 0
            return r7
        L2e:
            defpackage.sf5.h0(r8)
        L31:
            r0.E = r7
            r0.G = r2
            u7d r8 = defpackage.u7d.F
            java.lang.Object r8 = r7.a(r8, r0)
            m45 r1 = defpackage.m45.E
            if (r8 != r1) goto L40
            return r1
        L40:
            t7d r8 = (defpackage.t7d) r8
            java.util.List r1 = r8.a
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            r4 = 0
            r5 = r4
        L4d:
            if (r5 >= r3) goto L5b
            java.lang.Object r6 = r1.get(r5)
            z7d r6 = (defpackage.z7d) r6
            r6.a()
            int r5 = r5 + 1
            goto L4d
        L5b:
            java.util.List r8 = r8.a
            r1 = r8
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
        L64:
            if (r4 >= r1) goto L74
            java.lang.Object r3 = r8.get(r4)
            z7d r3 = (defpackage.z7d) r3
            boolean r3 = r3.d
            if (r3 == 0) goto L71
            goto L31
        L71:
            int r4 = r4 + 1
            goto L64
        L74:
            iei r7 = defpackage.iei.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pf4.a(d0h, vd1):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0097, code lost:
    
        if (r14 == r6) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b A[PHI: r13 r14
      0x004b: PHI (r13v1 d0h) = (r13v3 d0h), (r13v5 d0h) binds: [B:18:0x0048, B:15:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x004b: PHI (r14v2 java.lang.Object) = (r14v8 java.lang.Object), (r14v1 java.lang.Object) binds: [B:18:0x0048, B:15:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0097 -> B:35:0x009a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.d0h r13, defpackage.vd1 r14) {
        /*
            boolean r0 = r14 instanceof defpackage.of4
            if (r0 == 0) goto L13
            r0 = r14
            of4 r0 = (defpackage.of4) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            of4 r0 = new of4
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.F
            int r1 = r0.G
            r2 = 2
            r3 = 0
            r4 = 0
            r5 = 1
            m45 r6 = defpackage.m45.E
            if (r1 == 0) goto L3b
            if (r1 == r5) goto L35
            if (r1 != r2) goto L2f
            d0h r13 = r0.E
            defpackage.sf5.h0(r14)
            goto L9a
        L2f:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r13)
            return r4
        L35:
            d0h r13 = r0.E
            defpackage.sf5.h0(r14)
            goto L4b
        L3b:
            defpackage.sf5.h0(r14)
        L3e:
            r0.E = r13
            r0.G = r5
            u7d r14 = defpackage.u7d.F
            java.lang.Object r14 = r13.a(r14, r0)
            if (r14 != r6) goto L4b
            goto L99
        L4b:
            t7d r14 = (defpackage.t7d) r14
            java.util.List r14 = r14.a
            r1 = r14
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r7 = r3
        L57:
            if (r7 >= r1) goto Lbb
            java.lang.Object r8 = r14.get(r7)
            z7d r8 = (defpackage.z7d) r8
            boolean r8 = defpackage.hvj.i(r8)
            if (r8 != 0) goto Lb8
            r1 = r14
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r7 = r3
        L6d:
            if (r7 >= r1) goto L8d
            java.lang.Object r8 = r14.get(r7)
            z7d r8 = (defpackage.z7d) r8
            boolean r9 = r8.l()
            if (r9 != 0) goto Lb4
            e0h r9 = r13.J
            long r9 = r9.d0
            long r11 = r13.b()
            boolean r8 = defpackage.hvj.l(r8, r9, r11)
            if (r8 == 0) goto L8a
            goto Lb4
        L8a:
            int r7 = r7 + 1
            goto L6d
        L8d:
            r0.E = r13
            r0.G = r2
            u7d r14 = defpackage.u7d.G
            java.lang.Object r14 = r13.a(r14, r0)
            if (r14 != r6) goto L9a
        L99:
            return r6
        L9a:
            t7d r14 = (defpackage.t7d) r14
            java.util.List r14 = r14.a
            r1 = r14
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r7 = r3
        La6:
            if (r7 >= r1) goto L3e
            java.lang.Object r8 = r14.get(r7)
            z7d r8 = (defpackage.z7d) r8
            boolean r8 = r8.l()
            if (r8 == 0) goto Lb5
        Lb4:
            return r4
        Lb5:
            int r7 = r7 + 1
            goto La6
        Lb8:
            int r7 = r7 + 1
            goto L57
        Lbb:
            java.lang.Object r13 = r14.get(r3)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pf4.b(d0h, vd1):java.lang.Object");
    }
}
