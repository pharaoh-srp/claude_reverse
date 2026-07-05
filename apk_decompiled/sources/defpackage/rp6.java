package defpackage;

import com.anthropic.claude.analytics.events.AnalyticsEvent;
import com.anthropic.claude.analytics.events.OnboardingEvents$PhoneVerificationValidationError;
import java.time.LocalDate;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class rp6 extends iwe {
    public final lsc A;
    public final lsc B;
    public final lsc C;
    public final lsc D;
    public final q7 b;
    public final q1d c;
    public final j2d d;
    public final o7 e;
    public final qi3 f;
    public final pkc g;
    public final u2a h;
    public final t96 i;
    public final q2a j;
    public final zy1 k;
    public final zy1 l;
    public final lsc m;
    public final lsc n;
    public final lsc o;
    public final lsc p;
    public final lsc q;
    public final lsc r;
    public final wz5 s;
    public final lsc t;
    public final lsc u;
    public final lsc v;
    public final lsc w;
    public final wz5 x;
    public final wz5 y;
    public final lsc z;

    /* JADX WARN: Multi-variable type inference failed */
    public rp6(String str, q7 q7Var, q1d q1dVar, j2d j2dVar, o7 o7Var, qi3 qi3Var, pkc pkcVar, mn5 mn5Var, u2a u2aVar, t96 t96Var, q2a q2aVar, h86 h86Var) {
        super(h86Var);
        this.b = q7Var;
        this.c = q1dVar;
        this.d = j2dVar;
        this.e = o7Var;
        this.f = qi3Var;
        this.g = pkcVar;
        this.h = u2aVar;
        this.i = t96Var;
        this.j = q2aVar;
        this.k = x44.a();
        this.l = x44.a();
        this.m = mpk.P(lm6.E);
        final int i = 1;
        this.n = mpk.P(new t45(1, "US"));
        this.o = mpk.P("🇺🇸");
        LocalDate localDate = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        final int i2 = 7;
        this.p = mpk.P(new cjh((String) null, 0L, 7));
        this.q = mpk.P(null);
        this.r = mpk.P("");
        final int i3 = 0;
        this.s = mpk.w(new zy7(this) { // from class: mp6
            public final /* synthetic */ rp6 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i4 = i3;
                boolean z = false;
                hng hngVar = hng.F;
                rp6 rp6Var = this.F;
                switch (i4) {
                    case 0:
                        okc okcVarA = rp6Var.g.a();
                        hng.E.getClass();
                        return ((Boolean) okcVarA.v.getValue()).booleanValue() ? hng.G : hngVar;
                    case 1:
                        if (rp6Var.U() == hngVar && ((Boolean) rp6Var.g.a().t.getValue()).booleanValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 2:
                        if (rp6Var.U() == hngVar && ((Boolean) rp6Var.g.a().s.getValue()).booleanValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 3:
                        return rp6Var.Q();
                    case 4:
                        return Integer.valueOf(rp6Var.Q().E);
                    case 5:
                        return new cpc(rp6Var.S(), rp6Var.Q());
                    case 6:
                        return rp6Var.R();
                    case 7:
                        return (Set) rp6Var.g.a().w.getValue();
                    default:
                        return rp6Var.S();
                }
            }
        });
        boolean zBooleanValue = ((Boolean) pkcVar.a().u.getValue()).booleanValue();
        final int i4 = 6;
        this.t = mpk.P(zBooleanValue ? new fi(mn5Var, localDate, i4) : new gi(false, false));
        this.u = mpk.P("");
        Boolean bool = Boolean.FALSE;
        this.v = mpk.P(bool);
        this.w = mpk.P(bool);
        this.x = mpk.w(new zy7(this) { // from class: mp6
            public final /* synthetic */ rp6 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i42 = i;
                boolean z = false;
                hng hngVar = hng.F;
                rp6 rp6Var = this.F;
                switch (i42) {
                    case 0:
                        okc okcVarA = rp6Var.g.a();
                        hng.E.getClass();
                        return ((Boolean) okcVarA.v.getValue()).booleanValue() ? hng.G : hngVar;
                    case 1:
                        if (rp6Var.U() == hngVar && ((Boolean) rp6Var.g.a().t.getValue()).booleanValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 2:
                        if (rp6Var.U() == hngVar && ((Boolean) rp6Var.g.a().s.getValue()).booleanValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 3:
                        return rp6Var.Q();
                    case 4:
                        return Integer.valueOf(rp6Var.Q().E);
                    case 5:
                        return new cpc(rp6Var.S(), rp6Var.Q());
                    case 6:
                        return rp6Var.R();
                    case 7:
                        return (Set) rp6Var.g.a().w.getValue();
                    default:
                        return rp6Var.S();
                }
            }
        });
        final int i5 = 2;
        this.y = mpk.w(new zy7(this) { // from class: mp6
            public final /* synthetic */ rp6 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i42 = i5;
                boolean z = false;
                hng hngVar = hng.F;
                rp6 rp6Var = this.F;
                switch (i42) {
                    case 0:
                        okc okcVarA = rp6Var.g.a();
                        hng.E.getClass();
                        return ((Boolean) okcVarA.v.getValue()).booleanValue() ? hng.G : hngVar;
                    case 1:
                        if (rp6Var.U() == hngVar && ((Boolean) rp6Var.g.a().t.getValue()).booleanValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 2:
                        if (rp6Var.U() == hngVar && ((Boolean) rp6Var.g.a().s.getValue()).booleanValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 3:
                        return rp6Var.Q();
                    case 4:
                        return Integer.valueOf(rp6Var.Q().E);
                    case 5:
                        return new cpc(rp6Var.S(), rp6Var.Q());
                    case 6:
                        return rp6Var.R();
                    case 7:
                        return (Set) rp6Var.g.a().w.getValue();
                    default:
                        return rp6Var.S();
                }
            }
        });
        this.z = mpk.P(bool);
        this.A = mpk.P(bool);
        this.B = mpk.P(bool);
        this.C = mpk.P(bool);
        this.D = mpk.P(bool);
        final int i6 = 3;
        j8.T(new gq7(mpk.d0(new zy7(this) { // from class: mp6
            public final /* synthetic */ rp6 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i42 = i6;
                boolean z = false;
                hng hngVar = hng.F;
                rp6 rp6Var = this.F;
                switch (i42) {
                    case 0:
                        okc okcVarA = rp6Var.g.a();
                        hng.E.getClass();
                        return ((Boolean) okcVarA.v.getValue()).booleanValue() ? hng.G : hngVar;
                    case 1:
                        if (rp6Var.U() == hngVar && ((Boolean) rp6Var.g.a().t.getValue()).booleanValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 2:
                        if (rp6Var.U() == hngVar && ((Boolean) rp6Var.g.a().s.getValue()).booleanValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 3:
                        return rp6Var.Q();
                    case 4:
                        return Integer.valueOf(rp6Var.Q().E);
                    case 5:
                        return new cpc(rp6Var.S(), rp6Var.Q());
                    case 6:
                        return rp6Var.R();
                    case 7:
                        return (Set) rp6Var.g.a().w.getValue();
                    default:
                        return rp6Var.S();
                }
            }
        }), new np6(this, objArr6 == true ? 1 : 0, i3), 2), this.a);
        final int i7 = 4;
        j8.T(new gq7(new v70(mpk.d0(new zy7(this) { // from class: mp6
            public final /* synthetic */ rp6 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i42 = i7;
                boolean z = false;
                hng hngVar = hng.F;
                rp6 rp6Var = this.F;
                switch (i42) {
                    case 0:
                        okc okcVarA = rp6Var.g.a();
                        hng.E.getClass();
                        return ((Boolean) okcVarA.v.getValue()).booleanValue() ? hng.G : hngVar;
                    case 1:
                        if (rp6Var.U() == hngVar && ((Boolean) rp6Var.g.a().t.getValue()).booleanValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 2:
                        if (rp6Var.U() == hngVar && ((Boolean) rp6Var.g.a().s.getValue()).booleanValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 3:
                        return rp6Var.Q();
                    case 4:
                        return Integer.valueOf(rp6Var.Q().E);
                    case 5:
                        return new cpc(rp6Var.S(), rp6Var.Q());
                    case 6:
                        return rp6Var.R();
                    case 7:
                        return (Set) rp6Var.g.a().w.getValue();
                    default:
                        return rp6Var.S();
                }
            }
        }), 1), new kk0(this, objArr5 == true ? 1 : 0, 26), 2), this.a);
        final int i8 = 5;
        j8.T(new gq7(mpk.d0(new zy7(this) { // from class: mp6
            public final /* synthetic */ rp6 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i42 = i8;
                boolean z = false;
                hng hngVar = hng.F;
                rp6 rp6Var = this.F;
                switch (i42) {
                    case 0:
                        okc okcVarA = rp6Var.g.a();
                        hng.E.getClass();
                        return ((Boolean) okcVarA.v.getValue()).booleanValue() ? hng.G : hngVar;
                    case 1:
                        if (rp6Var.U() == hngVar && ((Boolean) rp6Var.g.a().t.getValue()).booleanValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 2:
                        if (rp6Var.U() == hngVar && ((Boolean) rp6Var.g.a().s.getValue()).booleanValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 3:
                        return rp6Var.Q();
                    case 4:
                        return Integer.valueOf(rp6Var.Q().E);
                    case 5:
                        return new cpc(rp6Var.S(), rp6Var.Q());
                    case 6:
                        return rp6Var.R();
                    case 7:
                        return (Set) rp6Var.g.a().w.getValue();
                    default:
                        return rp6Var.S();
                }
            }
        }), new mt4(this, objArr4 == true ? 1 : 0, i2), 2), this.a);
        j8.T(new gq7(mpk.d0(new zy7(this) { // from class: mp6
            public final /* synthetic */ rp6 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i42 = i4;
                boolean z = false;
                hng hngVar = hng.F;
                rp6 rp6Var = this.F;
                switch (i42) {
                    case 0:
                        okc okcVarA = rp6Var.g.a();
                        hng.E.getClass();
                        return ((Boolean) okcVarA.v.getValue()).booleanValue() ? hng.G : hngVar;
                    case 1:
                        if (rp6Var.U() == hngVar && ((Boolean) rp6Var.g.a().t.getValue()).booleanValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 2:
                        if (rp6Var.U() == hngVar && ((Boolean) rp6Var.g.a().s.getValue()).booleanValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 3:
                        return rp6Var.Q();
                    case 4:
                        return Integer.valueOf(rp6Var.Q().E);
                    case 5:
                        return new cpc(rp6Var.S(), rp6Var.Q());
                    case 6:
                        return rp6Var.R();
                    case 7:
                        return (Set) rp6Var.g.a().w.getValue();
                    default:
                        return rp6Var.S();
                }
            }
        }), new np6(this, objArr3 == true ? 1 : 0, i), 2), this.a);
        z9e z9eVar = new z9e();
        z9eVar.E = true;
        j8.T(new gq7(mpk.d0(new zy7(this) { // from class: mp6
            public final /* synthetic */ rp6 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i42 = i2;
                boolean z = false;
                hng hngVar = hng.F;
                rp6 rp6Var = this.F;
                switch (i42) {
                    case 0:
                        okc okcVarA = rp6Var.g.a();
                        hng.E.getClass();
                        return ((Boolean) okcVarA.v.getValue()).booleanValue() ? hng.G : hngVar;
                    case 1:
                        if (rp6Var.U() == hngVar && ((Boolean) rp6Var.g.a().t.getValue()).booleanValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 2:
                        if (rp6Var.U() == hngVar && ((Boolean) rp6Var.g.a().s.getValue()).booleanValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 3:
                        return rp6Var.Q();
                    case 4:
                        return Integer.valueOf(rp6Var.Q().E);
                    case 5:
                        return new cpc(rp6Var.S(), rp6Var.Q());
                    case 6:
                        return rp6Var.R();
                    case 7:
                        return (Set) rp6Var.g.a().w.getValue();
                    default:
                        return rp6Var.S();
                }
            }
        }), new b9(this, z9eVar, str, objArr2 == true ? 1 : 0, 18), 2), this.a);
        final int i9 = 8;
        j8.T(new gq7(j8.g0(new xl1(mpk.d0(new zy7(this) { // from class: mp6
            public final /* synthetic */ rp6 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i42 = i9;
                boolean z = false;
                hng hngVar = hng.F;
                rp6 rp6Var = this.F;
                switch (i42) {
                    case 0:
                        okc okcVarA = rp6Var.g.a();
                        hng.E.getClass();
                        return ((Boolean) okcVarA.v.getValue()).booleanValue() ? hng.G : hngVar;
                    case 1:
                        if (rp6Var.U() == hngVar && ((Boolean) rp6Var.g.a().t.getValue()).booleanValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 2:
                        if (rp6Var.U() == hngVar && ((Boolean) rp6Var.g.a().s.getValue()).booleanValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 3:
                        return rp6Var.Q();
                    case 4:
                        return Integer.valueOf(rp6Var.Q().E);
                    case 5:
                        return new cpc(rp6Var.S(), rp6Var.Q());
                    case 6:
                        return rp6Var.R();
                    case 7:
                        return (Set) rp6Var.g.a().w.getValue();
                    default:
                        return rp6Var.S();
                }
            }
        }), 2), 1), new u73(this, objArr == true ? 1 : 0, 20), 2), this.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O(defpackage.rp6 r4, java.lang.String r5, defpackage.vp4 r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof defpackage.op6
            if (r0 == 0) goto L13
            r0 = r6
            op6 r0 = (defpackage.op6) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            op6 r0 = new op6
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.E
            int r1 = r0.G
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L26
            defpackage.sf5.h0(r6)
            goto L48
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r3
        L2c:
            defpackage.sf5.h0(r6)
            q1d r4 = r4.c
            r0.G = r2
            h86 r6 = r4.a
            e45 r6 = r6.b()
            p1d r1 = new p1d
            r2 = 3
            r1.<init>(r4, r5, r3, r2)
            java.lang.Object r6 = defpackage.gb9.c0(r6, r1, r0)
            m45 r4 = defpackage.m45.E
            if (r6 != r4) goto L48
            return r4
        L48:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L51
            java.lang.String r4 = defpackage.ytk.g(r6)
            return r4
        L51:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rp6.O(rp6, java.lang.String, vp4):java.lang.Object");
    }

    public static final void P(rp6 rp6Var, boolean z) {
        rp6Var.w.setValue(Boolean.valueOf(z));
    }

    public final t45 Q() {
        return (t45) this.n.getValue();
    }

    public final String R() {
        return (String) this.u.getValue();
    }

    public final cjh S() {
        return (cjh) this.p.getValue();
    }

    public final boolean T() {
        return ((Boolean) this.B.getValue()).booleanValue();
    }

    public final hng U() {
        return (hng) this.s.getValue();
    }

    public final void V() {
        if (((Boolean) this.w.getValue()).booleanValue()) {
            return;
        }
        X();
        if (T()) {
            return;
        }
        gb9.D(this.a, null, null, new ix5(this, null, 3), 3);
    }

    public final void W(cjh cjhVar) {
        cjhVar.getClass();
        zb0 zb0Var = cjhVar.a;
        zb0 zb0VarI = dpk.i(cjhVar, zb0Var.F.length());
        String str = dpk.g(cjhVar).F;
        StringBuilder sb = new StringBuilder();
        String str2 = zb0VarI.F;
        int length = str2.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str2.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        int length2 = sb.length() - str2.length();
        StringBuilder sb2 = new StringBuilder();
        int length3 = str.length();
        for (int i2 = 0; i2 < length3; i2++) {
            char cCharAt2 = str.charAt(i2);
            if (Character.isDigit(cCharAt2)) {
                sb2.append(cCharAt2);
            }
        }
        int length4 = sb2.length() - str.length();
        String str3 = zb0Var.F;
        StringBuilder sb3 = new StringBuilder();
        int length5 = str3.length();
        for (int i3 = 0; i3 < length5; i3++) {
            char cCharAt3 = str3.charAt(i3);
            if (Character.isDigit(cCharAt3)) {
                sb3.append(cCharAt3);
            }
        }
        String string = sb3.toString();
        long j = cjhVar.b;
        this.p.setValue(cjh.b(cjhVar, string, mwa.m(((int) (j >> 32)) + length2, ((int) (j & 4294967295L)) + length2 + length4), 4));
    }

    public final void X() {
        this.B.setValue(Boolean.valueOf(!((Boolean) this.v.getValue()).booleanValue()));
        if (T()) {
            this.f.e(new OnboardingEvents$PhoneVerificationValidationError("claude-android", 2, Q().E, R().length()), AnalyticsEvent.Companion.serializer());
        }
    }
}
