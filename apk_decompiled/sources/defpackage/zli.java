package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zli extends iwe {
    public final kli b;
    public final koi c;
    public final mn5 d;
    public final wlg e;
    public final lsc f;
    public final lsc g;
    public final lsc h;
    public final lsc i;
    public final lsc j;
    public final lsc k;

    public zli(kli kliVar, koi koiVar, mn5 mn5Var, rc8 rc8Var, h86 h86Var) {
        super(h86Var);
        this.b = kliVar;
        this.c = koiVar;
        this.d = mn5Var;
        this.e = rc8Var.m("enterprise_usage_spend_cap");
        this.f = mpk.P(Boolean.TRUE);
        Boolean bool = Boolean.FALSE;
        this.g = mpk.P(bool);
        this.h = mpk.P(bool);
        this.i = mpk.P(null);
        this.j = mpk.P(lm6.E);
        this.k = mpk.P(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
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
    public static final java.lang.Object O(defpackage.zli r12, defpackage.vp4 r13) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zli.O(zli, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.uli P(com.anthropic.claude.api.usage.UsageWindow r8, int r9, int r10, long r11) {
        /*
            java.lang.Double r0 = r8.getUtilization()
            r1 = 0
            if (r0 == 0) goto L16
            double r2 = r0.doubleValue()
            int r0 = defpackage.mwa.K(r2)
            r2 = 100
            int r0 = defpackage.wd6.e0(r0, r1, r2)
            goto L17
        L16:
            r0 = r1
        L17:
            java.util.Date r2 = r8.getResets_at()
            r3 = 0
            if (r2 != 0) goto L1f
            goto L32
        L1f:
            lz1 r4 = defpackage.uh6.F
            long r4 = r2.getTime()
            long r4 = r4 - r11
            zh6 r11 = defpackage.zh6.MILLISECONDS
            long r11 = defpackage.v40.R(r4, r11)
            boolean r4 = defpackage.uh6.l(r11)
            if (r4 == 0) goto L34
        L32:
            r1 = r3
            goto L93
        L34:
            r4 = 1
            zh6 r5 = defpackage.zh6.HOURS
            long r6 = defpackage.v40.Q(r4, r5)
            int r4 = defpackage.uh6.d(r11, r6)
            if (r4 >= 0) goto L4e
            mme r1 = new mme
            zh6 r2 = defpackage.zh6.MINUTES
            long r11 = defpackage.uh6.o(r11, r2)
            int r11 = (int) r11
            r1.<init>(r11)
            goto L93
        L4e:
            r4 = 24
            long r6 = defpackage.v40.Q(r4, r5)
            int r4 = defpackage.uh6.d(r11, r6)
            if (r4 >= 0) goto L7c
            zh6 r2 = defpackage.zh6.DAYS
            defpackage.uh6.o(r11, r2)
            boolean r2 = defpackage.uh6.k(r11)
            if (r2 == 0) goto L66
            goto L6e
        L66:
            long r1 = defpackage.uh6.o(r11, r5)
            r4 = 24
            long r1 = r1 % r4
            int r1 = (int) r1
        L6e:
            int r2 = defpackage.uh6.h(r11)
            defpackage.uh6.j(r11)
            lme r11 = new lme
            r11.<init>(r1, r2)
            r1 = r11
            goto L93
        L7c:
            java.text.SimpleDateFormat r11 = new java.text.SimpleDateFormat
            java.lang.String r12 = "E h:mm a"
            java.util.Locale r1 = java.util.Locale.getDefault()
            r11.<init>(r12, r1)
            java.lang.String r11 = r11.format(r2)
            kme r1 = new kme
            r11.getClass()
            r1.<init>(r11)
        L93:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.util.Date r8 = r8.getResets_at()
            if (r8 != 0) goto L9e
            r3 = r10
        L9e:
            uli r8 = new uli
            r8.<init>(r9, r0, r1, r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zli.P(com.anthropic.claude.api.usage.UsageWindow, int, int, long):uli");
    }
}
