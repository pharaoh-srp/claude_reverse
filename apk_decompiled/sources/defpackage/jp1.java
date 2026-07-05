package defpackage;

import com.anthropic.claude.api.account.BillingType;
import com.anthropic.claude.api.account.Organization;

/* JADX INFO: loaded from: classes3.dex */
public final class jp1 extends iwe {
    public final koi b;
    public final rvg c;
    public final pkc d;
    public final String e;
    public final wz5 f;
    public final wz5 g;
    public final wlg h;
    public final lsc i;
    public final lsc j;
    public final lsc k;

    public jp1(koi koiVar, rvg rvgVar, pkc pkcVar, rc8 rc8Var, String str, h86 h86Var) {
        super(h86Var);
        this.b = koiVar;
        this.c = rvgVar;
        this.d = pkcVar;
        this.e = str;
        final int i = 0;
        this.f = mpk.w(new zy7(this) { // from class: ip1
            public final /* synthetic */ jp1 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i2 = i;
                jp1 jp1Var = this.F;
                switch (i2) {
                    case 0:
                        Organization organizationE = jp1Var.b.e();
                        organizationE.getClass();
                        String billing_type = organizationE.getBilling_type();
                        return x44.r(billing_type, BillingType.GOOGLE_PLAY_SUBSCRIPTION.getValue()) ? qvg.E : (x44.r(billing_type, BillingType.STRIPE_SELF_SERVE_SUBSCRIPTION.getValue()) || x44.r(billing_type, BillingType.STRIPE_SUBSCRIPTION_ENTERPRISE_SELF_SERVE.getValue())) ? qvg.F : qvg.G;
                    default:
                        jp1Var.d.a();
                        return Boolean.valueOf(okc.a(jp1Var.b));
                }
            }
        });
        final int i2 = 1;
        this.g = mpk.w(new zy7(this) { // from class: ip1
            public final /* synthetic */ jp1 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i22 = i2;
                jp1 jp1Var = this.F;
                switch (i22) {
                    case 0:
                        Organization organizationE = jp1Var.b.e();
                        organizationE.getClass();
                        String billing_type = organizationE.getBilling_type();
                        return x44.r(billing_type, BillingType.GOOGLE_PLAY_SUBSCRIPTION.getValue()) ? qvg.E : (x44.r(billing_type, BillingType.STRIPE_SELF_SERVE_SUBSCRIPTION.getValue()) || x44.r(billing_type, BillingType.STRIPE_SUBSCRIPTION_ENTERPRISE_SELF_SERVE.getValue())) ? qvg.F : qvg.G;
                    default:
                        jp1Var.d.a();
                        return Boolean.valueOf(okc.a(jp1Var.b));
                }
            }
        });
        this.h = rc8Var.m("mobile_subscription_max_plan_enabled");
        this.i = mpk.P(Boolean.TRUE);
        this.j = mpk.P(null);
        this.k = mpk.P(null);
    }
}
