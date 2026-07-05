package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ij4 {
    public final xi4 a;
    public final yi4 b;
    public final h86 c;
    public final jxb d = new jxb();
    public final amg e;
    public final a4e f;
    public final amg g;
    public final amg h;

    public ij4(xi4 xi4Var, yi4 yi4Var, h86 h86Var) {
        this.a = xi4Var;
        this.b = yi4Var;
        this.c = h86Var;
        amg amgVarA = bmg.a(bj4.a);
        this.e = amgVarA;
        this.f = j8.k(amgVarA);
        this.g = bmg.a(null);
        this.h = bmg.a(new g56(null, 7));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.g56 r10, defpackage.vp4 r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.fj4
            if (r0 == 0) goto L13
            r0 = r11
            fj4 r0 = (defpackage.fj4) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            fj4 r0 = new fj4
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.G
            int r1 = r0.I
            r2 = 2
            r3 = 1
            r4 = 0
            m45 r5 = defpackage.m45.E
            if (r1 == 0) goto L3f
            if (r1 == r3) goto L37
            if (r1 != r2) goto L31
            hxb r9 = r0.F
            defpackage.sf5.h0(r11)     // Catch: java.lang.Throwable -> L2e
            goto Lb5
        L2e:
            r10 = move-exception
            goto Lbc
        L31:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r9)
            return r4
        L37:
            hxb r10 = r0.F
            g56 r1 = r0.E
            defpackage.sf5.h0(r11)
            goto L53
        L3f:
            defpackage.sf5.h0(r11)
            r0.E = r10
            jxb r11 = r9.d
            r0.F = r11
            r0.I = r3
            java.lang.Object r1 = r11.c(r0)
            if (r1 != r5) goto L51
            goto Lb3
        L51:
            r1 = r10
            r10 = r11
        L53:
            xi4 r11 = r9.a     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r11 = r11.a()     // Catch: java.lang.Throwable -> L7b
            java.lang.Iterable r11 = (java.lang.Iterable) r11     // Catch: java.lang.Throwable -> L7b
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L7b
            r3.<init>()     // Catch: java.lang.Throwable -> L7b
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L7b
        L64:
            boolean r6 = r11.hasNext()     // Catch: java.lang.Throwable -> L7b
            if (r6 == 0) goto L80
            java.lang.Object r6 = r11.next()     // Catch: java.lang.Throwable -> L7b
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L7b
            boolean r7 = defpackage.bsg.I0(r7)     // Catch: java.lang.Throwable -> L7b
            if (r7 != 0) goto L64
            r3.add(r6)     // Catch: java.lang.Throwable -> L7b
            goto L64
        L7b:
            r9 = move-exception
            r8 = r10
            r10 = r9
            r9 = r8
            goto Lbc
        L80:
            amg r11 = r9.e     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r11 = r11.getValue()     // Catch: java.lang.Throwable -> L7b
            ej4 r11 = (defpackage.ej4) r11     // Catch: java.lang.Throwable -> L7b
            boolean r6 = r11 instanceof defpackage.cj4     // Catch: java.lang.Throwable -> L7b
            if (r6 == 0) goto La7
            r6 = r11
            cj4 r6 = (defpackage.cj4) r6     // Catch: java.lang.Throwable -> L7b
            g56 r6 = r6.c()     // Catch: java.lang.Throwable -> L7b
            boolean r6 = defpackage.x44.r(r6, r1)     // Catch: java.lang.Throwable -> L7b
            if (r6 == 0) goto La7
            cj4 r11 = (defpackage.cj4) r11     // Catch: java.lang.Throwable -> L7b
            java.util.List r11 = r11.e()     // Catch: java.lang.Throwable -> L7b
            boolean r11 = defpackage.x44.r(r11, r3)     // Catch: java.lang.Throwable -> L7b
            if (r11 == 0) goto La7
            r11 = r4
            goto Lb8
        La7:
            r0.E = r4     // Catch: java.lang.Throwable -> L7b
            r0.F = r10     // Catch: java.lang.Throwable -> L7b
            r0.I = r2     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r11 = r9.b(r1, r3, r0)     // Catch: java.lang.Throwable -> L7b
            if (r11 != r5) goto Lb4
        Lb3:
            return r5
        Lb4:
            r9 = r10
        Lb5:
            nf0 r11 = (defpackage.nf0) r11     // Catch: java.lang.Throwable -> L2e
            r10 = r9
        Lb8:
            r10.d(r4)
            return r11
        Lbc:
            r9.d(r4)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ij4.a(g56, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.g56 r12, java.util.ArrayList r13, defpackage.vp4 r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ij4.b(g56, java.util.ArrayList, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008d A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002d, B:37:0x0087, B:39:0x008d, B:40:0x00a9, B:42:0x00af, B:44:0x00bc, B:45:0x00c0, B:46:0x00d9, B:48:0x00dd, B:51:0x00e4, B:52:0x00e9, B:24:0x0053, B:26:0x005b, B:30:0x0065, B:33:0x006c), top: B:55:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002d, B:37:0x0087, B:39:0x008d, B:40:0x00a9, B:42:0x00af, B:44:0x00bc, B:45:0x00c0, B:46:0x00d9, B:48:0x00dd, B:51:0x00e4, B:52:0x00e9, B:24:0x0053, B:26:0x005b, B:30:0x0065, B:33:0x006c), top: B:55:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v0, types: [hxb, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.vp4 r13) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ij4.c(vp4):java.lang.Object");
    }
}
