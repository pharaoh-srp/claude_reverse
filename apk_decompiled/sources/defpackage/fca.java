package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fca extends iwe {
    public final String b;
    public final jj c;
    public final String d;
    public final o7 e;
    public final x4f f;
    public final mn5 g;
    public final fk0 h;
    public final tl0 i;
    public final qi3 j;
    public final x89 k;
    public final zy1 l;
    public final zy1 m;
    public final lsc n;
    public final lsc o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fca(String str, jj jjVar, String str2, o7 o7Var, x4f x4fVar, mn5 mn5Var, fk0 fk0Var, tl0 tl0Var, qi3 qi3Var, x89 x89Var, h86 h86Var) {
        super(h86Var);
        jjVar.getClass();
        str2.getClass();
        this.b = str;
        this.c = jjVar;
        this.d = str2;
        this.e = o7Var;
        this.f = x4fVar;
        this.g = mn5Var;
        this.h = fk0Var;
        this.i = tl0Var;
        this.j = qi3Var;
        this.k = x89Var;
        this.l = x44.a();
        this.m = x44.a();
        this.n = mpk.P(Boolean.FALSE);
        this.o = mpk.P(null);
        mpk.w(new dg8(10, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O(defpackage.fca r5, java.lang.String r6, defpackage.vp4 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.cca
            if (r0 == 0) goto L13
            r0 = r7
            cca r0 = (defpackage.cca) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            cca r0 = new cca
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.G
            int r1 = r0.I
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            dae r5 = r0.F
            java.lang.String r6 = r0.E
            defpackage.sf5.h0(r7)
            goto L46
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            return r2
        L30:
            dae r7 = defpackage.vb7.h(r7)
            r0.E = r6
            r0.F = r7
            r0.I = r3
            java.lang.Object r5 = r5.Q(r0)
            m45 r0 = defpackage.m45.E
            if (r5 != r0) goto L43
            return r0
        L43:
            r4 = r7
            r7 = r5
            r5 = r4
        L46:
            com.anthropic.claude.api.result.ApiResult r7 = (com.anthropic.claude.api.result.ApiResult) r7
            boolean r0 = r7 instanceof defpackage.of0
            if (r0 == 0) goto L74
            of0 r7 = (defpackage.of0) r7
            java.lang.Object r7 = r7.b
            com.anthropic.claude.types.strings.OrganizationId r7 = (com.anthropic.claude.types.strings.OrganizationId) r7
            java.lang.String r7 = r7.m1071unboximpl()
            boolean r0 = com.anthropic.claude.types.strings.OrganizationId.m1068equalsimpl0(r7, r6)
            if (r0 == 0) goto L71
            com.anthropic.claude.core.telemetry.SilentException r7 = new com.anthropic.claude.core.telemetry.SilentException
            java.lang.String r6 = com.anthropic.claude.types.strings.OrganizationId.m1070toStringimpl(r6)
            java.lang.String r0 = "Default org is the same as the not found org: "
            java.lang.String r6 = defpackage.ij0.i(r0, r6)
            r7.<init>(r6)
            r6 = 0
            r0 = 3
            com.anthropic.claude.core.telemetry.SilentException.a(r7, r2, r6, r0)
            goto L78
        L71:
            r5.E = r7
            goto L78
        L74:
            boolean r6 = r7 instanceof defpackage.nf0
            if (r6 == 0) goto L7d
        L78:
            java.lang.Object r5 = r5.E
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L7d:
            defpackage.mr9.b()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fca.O(fca, java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P(defpackage.fca r4, com.anthropic.claude.api.account.AppStartResponse r5, java.lang.String r6, io.sentry.p1 r7, defpackage.vp4 r8) throws java.lang.Exception {
        /*
            boolean r0 = r8 instanceof defpackage.dca
            if (r0 == 0) goto L13
            r0 = r8
            dca r0 = (defpackage.dca) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            dca r0 = new dca
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.F
            int r1 = r0.H
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            io.sentry.p1 r4 = r0.E
            defpackage.sf5.h0(r8)     // Catch: java.lang.Exception -> L27
            goto L4b
        L27:
            r5 = move-exception
            goto L5b
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L30:
            defpackage.sf5.h0(r8)
            java.lang.String r8 = "loading_app.handle_bootstrap"
            java.lang.String r1 = "Handle bootstrap"
            io.sentry.p1 r7 = defpackage.k2e.v(r8, r1, r7)
            tl0 r4 = r4.i     // Catch: java.lang.Exception -> L59
            r0.E = r7     // Catch: java.lang.Exception -> L59
            r0.H = r2     // Catch: java.lang.Exception -> L59
            java.lang.Object r4 = r4.f(r6, r5, r0)     // Catch: java.lang.Exception -> L59
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L4a
            return r5
        L4a:
            r4 = r7
        L4b:
            io.sentry.n7 r5 = r4.e()     // Catch: java.lang.Exception -> L27
            if (r5 != 0) goto L53
            io.sentry.n7 r5 = io.sentry.n7.OK     // Catch: java.lang.Exception -> L27
        L53:
            r4.m(r5)     // Catch: java.lang.Exception -> L27
            iei r4 = defpackage.iei.a
            return r4
        L59:
            r5 = move-exception
            r4 = r7
        L5b:
            io.sentry.n7 r6 = io.sentry.n7.INTERNAL_ERROR
            r4.m(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fca.P(fca, com.anthropic.claude.api.account.AppStartResponse, java.lang.String, io.sentry.p1, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q(defpackage.vp4 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.bca
            if (r0 == 0) goto L13
            r0 = r5
            bca r0 = (defpackage.bca) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            bca r0 = new bca
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.E
            int r1 = r0.G
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.sf5.h0(r5)
            goto L3c
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r2
        L2c:
            defpackage.sf5.h0(r5)
            r0.G = r3
            o7 r4 = r4.e
            java.lang.Object r5 = r4.a(r0)
            m45 r4 = defpackage.m45.E
            if (r5 != r4) goto L3c
            return r4
        L3c:
            com.anthropic.claude.api.result.ApiResult r5 = (com.anthropic.claude.api.result.ApiResult) r5
            boolean r4 = r5 instanceof defpackage.of0
            if (r4 == 0) goto L5d
            of0 r5 = (defpackage.of0) r5
            int r4 = r5.a
            java.lang.Object r5 = r5.b
            com.anthropic.claude.api.account.Account r5 = (com.anthropic.claude.api.account.Account) r5
            com.anthropic.claude.api.account.Organization r5 = defpackage.qoi.a(r5)
            java.lang.String r5 = r5.m116getUuidXjkXN6I()
            com.anthropic.claude.types.strings.OrganizationId r5 = com.anthropic.claude.types.strings.OrganizationId.m1065boximpl(r5)
            of0 r0 = new of0
            r0.<init>(r4, r5)
            r5 = r0
            goto L61
        L5d:
            boolean r4 = r5 instanceof defpackage.nf0
            if (r4 == 0) goto L94
        L61:
            boolean r4 = r5 instanceof defpackage.of0
            if (r4 != 0) goto L93
            boolean r4 = r5 instanceof defpackage.nf0
            if (r4 == 0) goto L8f
            r4 = r5
            nf0 r4 = (defpackage.nf0) r4
            boolean r0 = r4 instanceof defpackage.lf0
            if (r0 == 0) goto L86
            r4 = r5
            lf0 r4 = (defpackage.lf0) r4
            java.util.List r0 = defpackage.xah.a
            com.anthropic.claude.api.errors.ClaudeApiErrorException r0 = new com.anthropic.claude.api.errors.ClaudeApiErrorException
            bj3 r4 = r4.b()
            java.lang.String r1 = "Failed to fetch account to find an org ID"
            r0.<init>(r4, r1)
            r4 = 28
            defpackage.xah.f(r0, r1, r2, r2, r4)
            return r5
        L86:
            boolean r4 = r4 instanceof defpackage.mf0
            if (r4 == 0) goto L8b
            goto L93
        L8b:
            defpackage.mr9.b()
            return r2
        L8f:
            defpackage.mr9.b()
            return r2
        L93:
            return r5
        L94:
            defpackage.mr9.b()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fca.Q(vp4):java.lang.Object");
    }

    public final void R() {
        if (((Boolean) this.n.getValue()).booleanValue()) {
            return;
        }
        eca ecaVar = new eca(this, null);
        mp4 mp4Var = this.a;
        mp4Var.getClass();
        gb9.D(mp4Var, null, null, new wmf(ecaVar, null, 0), 3);
    }
}
