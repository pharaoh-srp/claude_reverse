package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class whg implements shg {
    public final kw9 a;
    public final akb b;
    public final y31 c;
    public final fk0 d;
    public final ysg e;
    public final h86 f;
    public final StringBuilder g = new StringBuilder();
    public String h = "";
    public final nyj i = new nyj();
    public final lsc j;
    public final lsc k;
    public final lsc l;
    public final lsc m;
    public final lsc n;
    public a0f o;

    public whg(kw9 kw9Var, akb akbVar, y31 y31Var, fk0 fk0Var, ysg ysgVar, h86 h86Var) {
        this.a = kw9Var;
        this.b = akbVar;
        this.c = y31Var;
        this.d = fk0Var;
        this.e = ysgVar;
        this.f = h86Var;
        lsc lscVarP = mpk.P(null);
        this.j = lscVarP;
        this.k = lscVarP;
        this.l = mpk.P(null);
        this.m = mpk.P(null);
        this.n = mpk.P(Boolean.FALSE);
    }

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
    public final java.lang.Object a(defpackage.vp4 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.thg
            if (r0 == 0) goto L13
            r0 = r8
            thg r0 = (defpackage.thg) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            thg r0 = new thg
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.E
            int r1 = r0.G
            lsc r2 = r7.m
            lsc r3 = r7.l
            iei r4 = defpackage.iei.a
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L34
            if (r1 != r5) goto L2e
            defpackage.sf5.h0(r8)     // Catch: java.lang.Throwable -> L2c
            goto L57
        L2c:
            r8 = move-exception
            goto L60
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return r6
        L34:
            defpackage.sf5.h0(r8)
            java.lang.Object r8 = r3.getValue()
            lf9 r8 = (defpackage.lf9) r8
            r1 = 0
            if (r8 == 0) goto L47
            java.lang.String r7 = "Can't start recording while already recording"
            r8 = 3
            defpackage.ij0.y(r7, r6, r1, r8)
            return r4
        L47:
            uhg r8 = new uhg     // Catch: java.lang.Throwable -> L2c
            r8.<init>(r7, r6, r1)     // Catch: java.lang.Throwable -> L2c
            r0.G = r5     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r8 = defpackage.fd9.N(r8, r0)     // Catch: java.lang.Throwable -> L2c
            m45 r0 = defpackage.m45.E
            if (r8 != r0) goto L57
            return r0
        L57:
            r2.setValue(r6)
            r3.setValue(r6)
            r7.o = r6
            return r4
        L60:
            r2.setValue(r6)
            r3.setValue(r6)
            r7.o = r6
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.whg.a(vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(boolean r8, defpackage.vp4 r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.vhg
            if (r0 == 0) goto L13
            r0 = r9
            vhg r0 = (defpackage.vhg) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            vhg r0 = new vhg
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.G
            int r1 = r0.I
            lsc r2 = r7.n
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L35
            if (r1 != r3) goto L2f
            lf9 r7 = r0.F
            a0f r8 = r0.E
            defpackage.sf5.h0(r9)     // Catch: java.lang.Throwable -> L2c
            goto L7f
        L2c:
            r9 = move-exception
            goto L93
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return r4
        L35:
            defpackage.sf5.h0(r9)
            a0f r9 = r7.o
            lsc r1 = r7.l
            java.lang.Object r1 = r1.getValue()
            lf9 r1 = (defpackage.lf9) r1
            lsc r7 = r7.m
            java.lang.Object r5 = r7.getValue()
            lf9 r5 = (defpackage.lf9) r5
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r2.setValue(r6)
            if (r5 == 0) goto L5a
            r5.d(r4)     // Catch: java.lang.Throwable -> L55
            goto L5a
        L55:
            r7 = move-exception
            r8 = r9
            r9 = r7
            r7 = r1
            goto L93
        L5a:
            r7.setValue(r4)     // Catch: java.lang.Throwable -> L55
            if (r8 != 0) goto L81
            if (r9 == 0) goto L64
            r9.t()     // Catch: java.lang.Throwable -> L55
        L64:
            if (r1 == 0) goto L81
            aj1 r7 = new aj1     // Catch: java.lang.Throwable -> L55
            r8 = 2
            r7.<init>(r1, r4, r8)     // Catch: java.lang.Throwable -> L55
            r0.E = r9     // Catch: java.lang.Throwable -> L55
            r0.F = r1     // Catch: java.lang.Throwable -> L55
            r0.I = r3     // Catch: java.lang.Throwable -> L55
            r5 = 8000(0x1f40, double:3.9525E-320)
            java.lang.Object r7 = defpackage.iuj.Q(r5, r7, r0)     // Catch: java.lang.Throwable -> L55
            m45 r8 = defpackage.m45.E
            if (r7 != r8) goto L7d
            return r8
        L7d:
            r8 = r9
            r7 = r1
        L7f:
            r1 = r7
            r9 = r8
        L81:
            if (r9 == 0) goto L86
            defpackage.a0f.r(r9)
        L86:
            if (r1 == 0) goto L8b
            r1.d(r4)
        L8b:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r2.setValue(r7)
            iei r7 = defpackage.iei.a
            return r7
        L93:
            if (r8 == 0) goto L98
            defpackage.a0f.r(r8)
        L98:
            if (r7 == 0) goto L9d
            r7.d(r4)
        L9d:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r2.setValue(r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.whg.b(boolean, vp4):java.lang.Object");
    }

    public final String c() {
        StringBuilder sb = this.g;
        String str = sb.toString() + this.h;
        sb.setLength(0);
        this.h = "";
        this.j.setValue(null);
        return str;
    }
}
