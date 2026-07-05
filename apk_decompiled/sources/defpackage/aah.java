package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aah extends iwe {
    public final kah b;
    public final mn5 c;
    public final jsc d;
    public final wz5 e;
    public final lsc f;
    public final lsc g;
    public boolean h;
    public final zy1 i;
    public final isc j;

    public aah(kah kahVar, mn5 mn5Var, h86 h86Var) {
        super(h86Var);
        this.b = kahVar;
        this.c = mn5Var;
        this.d = new jsc(mn5Var.a());
        this.e = mpk.w(new g2h(2, this));
        this.f = mpk.P(Boolean.FALSE);
        this.g = mpk.P(Boolean.TRUE);
        this.i = x44.a();
        this.j = new isc(0);
        if (this.h) {
            return;
        }
        gb9.D(this.a, null, null, new z9h(this, null, 1), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O(defpackage.aah r8, int r9, defpackage.vp4 r10) {
        /*
            r8.getClass()
            lsc r0 = r8.g
            boolean r1 = r10 instanceof defpackage.y9h
            if (r1 == 0) goto L18
            r1 = r10
            y9h r1 = (defpackage.y9h) r1
            int r2 = r1.H
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.H = r2
            goto L1d
        L18:
            y9h r1 = new y9h
            r1.<init>(r8, r10)
        L1d:
            java.lang.Object r10 = r1.F
            int r2 = r1.H
            r3 = 50
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 != r5) goto L31
            int r9 = r1.E
            defpackage.sf5.h0(r10)     // Catch: java.lang.Throwable -> L2f
            goto L5a
        L2f:
            r9 = move-exception
            goto L9e
        L31:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r8)
            r8 = 0
            return r8
        L38:
            defpackage.sf5.h0(r10)
            r8.h = r5
            kah r10 = r8.b     // Catch: java.lang.Throwable -> L2f
            java.lang.Integer r2 = new java.lang.Integer     // Catch: java.lang.Throwable -> L2f
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2f
            java.lang.Integer r6 = new java.lang.Integer     // Catch: java.lang.Throwable -> L2f
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L2f
            r1.E = r9     // Catch: java.lang.Throwable -> L2f
            r1.H = r5     // Catch: java.lang.Throwable -> L2f
            jah r7 = defpackage.kah.a     // Catch: java.lang.Throwable -> L2f
            uah r10 = (defpackage.uah) r10     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r10 = r10.g(r2, r6, r1)     // Catch: java.lang.Throwable -> L2f
            m45 r1 = defpackage.m45.E
            if (r10 != r1) goto L5a
            return r1
        L5a:
            com.anthropic.claude.api.result.ApiResult r10 = (com.anthropic.claude.api.result.ApiResult) r10     // Catch: java.lang.Throwable -> L2f
            boolean r1 = r10 instanceof defpackage.of0     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L87
            r1 = r10
            of0 r1 = (defpackage.of0) r1     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r1 = r1.b     // Catch: java.lang.Throwable -> L2f
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L2f
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L2f
            int r9 = r9 + r1
            isc r1 = r8.j     // Catch: java.lang.Throwable -> L2f
            r1.i(r9)     // Catch: java.lang.Throwable -> L2f
            of0 r10 = (defpackage.of0) r10     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r9 = r10.b     // Catch: java.lang.Throwable -> L2f
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Throwable -> L2f
            int r9 = r9.size()     // Catch: java.lang.Throwable -> L2f
            if (r9 != r3) goto L7e
            goto L7f
        L7e:
            r5 = r4
        L7f:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L2f
            r0.setValue(r9)     // Catch: java.lang.Throwable -> L2f
            goto L99
        L87:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L2f
            r0.setValue(r9)     // Catch: java.lang.Throwable -> L2f
            zy1 r9 = r8.i     // Catch: java.lang.Throwable -> L2f
            pt6 r10 = new pt6     // Catch: java.lang.Throwable -> L2f
            r0 = 2131888598(0x7f1209d6, float:1.9411836E38)
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L2f
            r9.r(r10)     // Catch: java.lang.Throwable -> L2f
        L99:
            r8.h = r4
            iei r8 = defpackage.iei.a
            return r8
        L9e:
            r8.h = r4
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aah.O(aah, int, vp4):java.lang.Object");
    }
}
