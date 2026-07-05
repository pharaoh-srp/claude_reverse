package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class koc implements aaf {
    public final uz9 A;
    public final nwb B;
    public final nwb C;
    public final lsc D;
    public final lsc E;
    public final lsc F;
    public final lsc G;
    public boolean a;
    public coc b;
    public final lsc c;
    public final eoc d;
    public int e;
    public int f;
    public long g;
    public long h;
    public float i;
    public float j;
    public final it5 k;
    public final boolean l;
    public final lsc m;
    public cz5 n;
    public int o;
    public final zub p;
    public final isc q;
    public final isc r;
    public final wz5 s;
    public final wz5 t;
    public final xz9 u;
    public final xnc v;
    public final n78 w;
    public final ia1 x;
    public final lsc y;
    public final jx9 z;

    public koc(int i, float f) {
        double d = f;
        if (-0.5d > d || d > 0.5d) {
            e39.a("currentPageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        }
        this.c = mpk.P(new fcc(0L));
        this.d = new eoc(i, f, this);
        this.e = i;
        this.g = Long.MAX_VALUE;
        final int i2 = 0;
        this.k = new it5(new bz7(this) { // from class: goc
            public final /* synthetic */ koc F;

            {
                this.F = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x00e6  */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v7 */
            /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Long] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // defpackage.bz7
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r15) {
                /*
                    Method dump skipped, instruction units count: 250
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.goc.invoke(java.lang.Object):java.lang.Object");
            }
        });
        final int i3 = 1;
        this.l = true;
        this.m = new lsc(moc.b, ql8.J);
        this.n = moc.a;
        this.p = new zub();
        this.q = new isc(-1);
        this.r = new isc(i);
        a5 a5Var = a5.N;
        this.s = mpk.x(new ow8(this, 4), a5Var);
        this.t = mpk.x(new ow8(this, 5), a5Var);
        xz9 xz9Var = new xz9(new bz7(this) { // from class: goc
            public final /* synthetic */ koc F;

            {
                this.F = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x00e6  */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v7 */
            /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Long] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // defpackage.bz7
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r15) {
                /*
                    Method dump skipped, instruction units count: 250
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.goc.invoke(java.lang.Object):java.lang.Object");
            }
        });
        this.u = xz9Var;
        this.v = new xnc(new ax5(26, this), xz9Var, new ow8(this, 6));
        this.w = new n78(17);
        this.x = new ia1();
        this.y = mpk.P(null);
        this.z = new jx9(this, i3);
        sl4.b(0, 0, 0, 0, 15);
        this.A = new uz9();
        this.B = mwa.v();
        this.C = mwa.v();
        Boolean bool = Boolean.FALSE;
        this.D = mpk.P(bool);
        this.E = mpk.P(bool);
        this.F = mpk.P(bool);
        this.G = mpk.P(bool);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        if (r9.c(r7, r8, r0) == r5) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object q(defpackage.koc r6, defpackage.zwb r7, defpackage.pz7 r8, defpackage.tp4 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.joc
            if (r0 == 0) goto L13
            r0 = r9
            joc r0 = (defpackage.joc) r0
            int r1 = r0.J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.J = r1
            goto L18
        L13:
            joc r0 = new joc
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.H
            int r1 = r0.J
            r2 = 0
            r3 = 2
            r4 = 1
            m45 r5 = defpackage.m45.E
            if (r1 == 0) goto L40
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            koc r6 = r0.E
            defpackage.sf5.h0(r9)
            goto L7d
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            return r2
        L33:
            xzg r6 = r0.G
            r8 = r6
            pz7 r8 = (defpackage.pz7) r8
            zwb r7 = r0.F
            koc r6 = r0.E
            defpackage.sf5.h0(r9)
            goto L55
        L40:
            defpackage.sf5.h0(r9)
            r0.E = r6
            r0.F = r7
            r9 = r8
            xzg r9 = (defpackage.xzg) r9
            r0.G = r9
            r0.J = r4
            java.lang.Object r9 = r6.i(r0)
            if (r9 != r5) goto L55
            goto L7c
        L55:
            it5 r9 = r6.k
            boolean r9 = r9.a()
            if (r9 != 0) goto L6c
            eoc r9 = r6.d
            java.lang.Object r9 = r9.G
            isc r9 = (defpackage.isc) r9
            int r9 = r9.h()
            isc r1 = r6.r
            r1.i(r9)
        L6c:
            it5 r9 = r6.k
            r0.E = r6
            r0.F = r2
            r0.G = r2
            r0.J = r3
            java.lang.Object r7 = r9.c(r7, r8, r0)
            if (r7 != r5) goto L7d
        L7c:
            return r5
        L7d:
            r7 = -1
            isc r6 = r6.q
            r6.i(r7)
            iei r6 = defpackage.iei.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.koc.q(koc, zwb, pz7, tp4):java.lang.Object");
    }

    public static Object r(koc kocVar, int i, xzg xzgVar) {
        kocVar.getClass();
        Object objC = kocVar.c(zwb.E, new rra(kocVar, i, null, 2), xzgVar);
        return objC == m45.E ? objC : iei.a;
    }

    @Override // defpackage.aaf
    public final boolean a() {
        return this.k.a();
    }

    @Override // defpackage.aaf
    public final boolean b() {
        return ((Boolean) this.E.getValue()).booleanValue();
    }

    @Override // defpackage.aaf
    public final Object c(zwb zwbVar, pz7 pz7Var, tp4 tp4Var) {
        return q(this, zwbVar, pz7Var, tp4Var);
    }

    @Override // defpackage.aaf
    public final boolean d() {
        return ((Boolean) this.D.getValue()).booleanValue();
    }

    @Override // defpackage.aaf
    public final float e(float f) {
        return this.k.e(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(int r12, defpackage.yig r13, defpackage.tp4 r14) {
        /*
            r11 = this;
            boolean r3 = r14 instanceof defpackage.hoc
            if (r3 == 0) goto L14
            r3 = r14
            hoc r3 = (defpackage.hoc) r3
            int r4 = r3.I
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L14
            int r4 = r4 - r5
            r3.I = r4
        L12:
            r6 = r3
            goto L1a
        L14:
            hoc r3 = new hoc
            r3.<init>(r11, r14)
            goto L12
        L1a:
            java.lang.Object r2 = r6.G
            int r3 = r6.I
            r7 = 0
            r4 = 0
            iei r8 = defpackage.iei.a
            r9 = 2
            r5 = 1
            m45 r10 = defpackage.m45.E
            if (r3 == 0) goto L40
            if (r3 == r5) goto L36
            if (r3 != r9) goto L30
            defpackage.sf5.h0(r2)
            return r8
        L30:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r0)
            return r7
        L36:
            int r0 = r6.E
            yig r3 = r6.F
            defpackage.sf5.h0(r2)
            r2 = r4
            r4 = r3
            goto L73
        L40:
            defpackage.sf5.h0(r2)
            eoc r2 = r11.d
            java.lang.Object r3 = r2.G
            isc r3 = (defpackage.isc) r3
            int r3 = r3.h()
            if (r12 != r3) goto L5c
            java.lang.Object r2 = r2.H
            hsc r2 = (defpackage.hsc) r2
            float r2 = r2.h()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L5c
            goto L92
        L5c:
            int r2 = r11.l()
            if (r2 != 0) goto L63
            goto L92
        L63:
            r6.F = r13
            r6.E = r12
            r6.I = r5
            java.lang.Object r3 = r11.i(r6)
            if (r3 != r10) goto L70
            goto L91
        L70:
            r0 = r12
            r2 = r4
            r4 = r13
        L73:
            int r0 = r11.j(r0)
            int r3 = r11.n()
            float r3 = (float) r3
            float r3 = r3 * r2
            r2 = r0
            ioc r0 = new ioc
            r5 = 0
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r6.F = r7
            r6.I = r9
            zwb r2 = defpackage.zwb.E
            java.lang.Object r0 = r11.c(r2, r0, r6)
            if (r0 != r10) goto L92
        L91:
            return r10
        L92:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.koc.f(int, yig, tp4):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x033d A[Catch: all -> 0x0349, TryCatch #0 {all -> 0x0349, blocks: (B:137:0x02eb, B:140:0x02f4, B:143:0x0301, B:145:0x030d, B:153:0x0343, B:151:0x033d, B:148:0x0325), top: B:169:0x02eb }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0238 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021f  */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r5v22, types: [int] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v56 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(defpackage.coc r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 905
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.koc.h(coc, boolean, boolean):void");
    }

    public final Object i(vp4 vp4Var) {
        Object objC;
        return (this.m.getValue() == moc.b && (objC = this.x.c(vp4Var)) == m45.E) ? objC : iei.a;
    }

    public final int j(int i) {
        if (l() > 0) {
            return wd6.e0(i, 0, l() - 1);
        }
        return 0;
    }

    public final coc k() {
        return (coc) this.m.getValue();
    }

    public abstract int l();

    public final int m() {
        return ((coc) this.m.getValue()).b;
    }

    public final int n() {
        return ((coc) this.m.getValue()).c + m();
    }

    public final long o() {
        return ((fcc) this.c.getValue()).a;
    }

    public final boolean p() {
        return ((int) Float.intBitsToFloat((int) (o() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (o() & 4294967295L))) == 0;
    }

    public final void s(int i, float f, boolean z) {
        eoc eocVar = this.d;
        isc iscVar = (isc) eocVar.G;
        hsc hscVar = (hsc) eocVar.H;
        if (iscVar.h() != i || hscVar.h() != f) {
            this.v.i();
        }
        ((isc) eocVar.G).i(i);
        ((pz9) eocVar.J).a(i);
        hscVar.i(f);
        eocVar.I = null;
        if (!z) {
            this.C.setValue(iei.a);
            return;
        }
        av9 av9Var = (av9) this.y.getValue();
        if (av9Var != null) {
            av9Var.m();
        }
    }
}
