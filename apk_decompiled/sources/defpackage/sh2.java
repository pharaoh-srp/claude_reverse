package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sh2 implements lp7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public sh2(dae daeVar, lp7 lp7Var, String[] strArr, int[] iArr) {
        this.E = 3;
        this.F = daeVar;
        this.I = lp7Var;
        this.G = strArr;
        this.H = iArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.v79 r10, defpackage.tp4 r11) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sh2.a(v79, tp4):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (r1.g(r13, r3) == r4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0095, code lost:
    
        if (r1.g(r13, r3) == r4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0097, code lost:
    
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(int[] r14, defpackage.tp4 r15) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.G
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.lang.Object r1 = r13.I
            lp7 r1 = (defpackage.lp7) r1
            java.lang.Object r2 = r13.F
            dae r2 = (defpackage.dae) r2
            boolean r3 = r15 instanceof defpackage.h7i
            if (r3 == 0) goto L1f
            r3 = r15
            h7i r3 = (defpackage.h7i) r3
            int r4 = r3.H
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1f
            int r4 = r4 - r5
            r3.H = r4
            goto L24
        L1f:
            h7i r3 = new h7i
            r3.<init>(r13, r15)
        L24:
            java.lang.Object r15 = r3.F
            int r4 = r3.H
            r5 = 0
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L3e
            if (r4 == r7) goto L38
            if (r4 != r6) goto L32
            goto L38
        L32:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r13)
            return r5
        L38:
            int[] r14 = r3.E
            defpackage.sf5.h0(r15)
            goto L98
        L3e:
            defpackage.sf5.h0(r15)
            java.lang.Object r15 = r2.E
            m45 r4 = defpackage.m45.E
            if (r15 != 0) goto L56
            java.util.Set r13 = defpackage.mp0.Z0(r0)
            r3.E = r14
            r3.H = r7
            java.lang.Object r13 = r1.g(r13, r3)
            if (r13 != r4) goto L98
            goto L97
        L56:
            java.lang.Object r13 = r13.H
            int[] r13 = (int[]) r13
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            int r7 = r0.length
            r8 = 0
            r9 = r8
        L62:
            if (r8 >= r7) goto L83
            r10 = r0[r8]
            int r11 = r9 + 1
            java.lang.Object r12 = r2.E
            if (r12 == 0) goto L7d
            int[] r12 = (int[]) r12
            r9 = r13[r9]
            r12 = r12[r9]
            r9 = r14[r9]
            if (r12 == r9) goto L79
            r15.add(r10)
        L79:
            int r8 = r8 + 1
            r9 = r11
            goto L62
        L7d:
            java.lang.String r13 = "Required value was null."
            defpackage.sz6.j(r13)
            return r5
        L83:
            boolean r13 = r15.isEmpty()
            if (r13 != 0) goto L98
            java.util.Set r13 = defpackage.w44.t1(r15)
            r3.E = r14
            r3.H = r6
            java.lang.Object r13 = r1.g(r13, r3)
            if (r13 != r4) goto L98
        L97:
            return r4
        L98:
            r2.E = r14
            iei r13 = defpackage.iei.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sh2.b(int[], tp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    @Override // defpackage.lp7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.Object r10, defpackage.tp4 r11) {
        /*
            r9 = this;
            int r0 = r9.E
            iei r1 = defpackage.iei.a
            java.lang.Object r2 = r9.I
            java.lang.Object r3 = r9.G
            java.lang.Object r4 = r9.F
            java.lang.Object r5 = r9.H
            switch(r0) {
                case 0: goto L41;
                case 1: goto L1d;
                case 2: goto L16;
                default: goto Lf;
            }
        Lf:
            int[] r10 = (int[]) r10
            java.lang.Object r9 = r9.b(r10, r11)
            return r9
        L16:
            v79 r10 = (defpackage.v79) r10
            java.lang.Object r9 = r9.a(r10, r11)
            return r9
        L1d:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r9 = r10.booleanValue()
            zhh r5 = (defpackage.zhh) r5
            m2a r4 = (defpackage.m2a) r4
            if (r9 == 0) goto L3d
            boolean r9 = r4.b()
            if (r9 == 0) goto L3d
            jjh r3 = (defpackage.jjh) r3
            cjh r9 = r5.t()
            xy8 r2 = (defpackage.xy8) r2
            occ r10 = r5.b
            defpackage.dch.R(r3, r4, r9, r2, r10)
            goto L40
        L3d:
            defpackage.dch.t(r4)
        L40:
            return r1
        L41:
            dae r4 = (defpackage.dae) r4
            boolean r0 = r11 instanceof defpackage.rh2
            if (r0 == 0) goto L56
            r0 = r11
            rh2 r0 = (defpackage.rh2) r0
            int r6 = r0.H
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L56
            int r6 = r6 - r7
            r0.H = r6
            goto L5b
        L56:
            rh2 r0 = new rh2
            r0.<init>(r9, r11)
        L5b:
            java.lang.Object r9 = r0.F
            int r11 = r0.H
            r6 = 0
            r7 = 1
            if (r11 == 0) goto L72
            if (r11 != r7) goto L6b
            java.lang.Object r10 = r0.E
            defpackage.sf5.h0(r9)
            goto L91
        L6b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r9)
            r1 = r6
            goto La4
        L72:
            defpackage.sf5.h0(r9)
            java.lang.Object r9 = r4.E
            lf9 r9 = (defpackage.lf9) r9
            if (r9 == 0) goto L91
            kotlinx.coroutines.flow.internal.ChildCancelledException r11 = new kotlinx.coroutines.flow.internal.ChildCancelledException
            r11.<init>()
            r9.d(r11)
            r0.E = r10
            r0.H = r7
            java.lang.Object r9 = r9.n(r0)
            m45 r11 = defpackage.m45.E
            if (r9 != r11) goto L91
            r1 = r11
            goto La4
        L91:
            l45 r3 = (defpackage.l45) r3
            qh2 r9 = new qh2
            th2 r5 = (defpackage.th2) r5
            lp7 r2 = (defpackage.lp7) r2
            r9.<init>(r5, r2, r10, r6)
            o45 r10 = defpackage.o45.H
            fkg r9 = defpackage.gb9.D(r3, r6, r10, r9, r7)
            r4.E = r9
        La4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sh2.g(java.lang.Object, tp4):java.lang.Object");
    }

    public /* synthetic */ sh2(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
        this.I = obj4;
    }
}
