package defpackage;

import com.anthropic.claude.api.account.BillingType;
import com.anthropic.claude.api.account.Organization;
import com.anthropic.claude.api.chat.InputMode;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ov2 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ hw2 F;

    public /* synthetic */ ov2(hw2 hw2Var, int i) {
        this.E = i;
        this.F = hw2Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        hw2 hw2Var = this.F;
        switch (i) {
            case 0:
                String str = (String) hw2Var.H.getValue();
                return (str == null || !str.contentEquals(hw2Var.D.d().G)) ? InputMode.TEXT : InputMode.SPEECH_INPUT;
            case 1:
                return (InputMode) hw2Var.I.getValue();
            case 2:
                return Boolean.valueOf(hw2Var.a0().length() == 0);
            case 3:
                return hw2Var.T();
            case 4:
                koi koiVar = hw2Var.g;
                qs2 qs2Var = hw2Var.k;
                Organization organizationE = koiVar.e();
                hw2Var.h.a();
                boolean zA = okc.a(koiVar);
                return oq5.N(organizationE.getRate_limit_upsell(), zA, zA && x44.r(organizationE.getBilling_type(), BillingType.GOOGLE_PLAY_SUBSCRIPTION.getValue()) && qs2Var.a.o("mobile_subscription_max_plan_enabled"), eve.C(organizationE) == pvg.FREE, qs2Var.a.o("mobile_rate_limit_paid_tier_upsell_v1"));
            case 5:
                if (((Boolean) hw2Var.u.getValue()).booleanValue() && !((Boolean) hw2Var.C.getValue()).booleanValue() && !hw2Var.e0() && (hw2Var.a0().length() > 0 || ((Boolean) hw2Var.f.o.getValue()).booleanValue())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 6:
                return (List) hw2Var.f.k.getValue();
            case 7:
                return Integer.valueOf(hw2Var.f.d());
            case 8:
                return Boolean.valueOf(hw2Var.f.d() <= 0);
            case 9:
                if (!((Boolean) hw2Var.w.getValue()).booleanValue() && !((Boolean) hw2Var.R.getValue()).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 10:
                return Boolean.valueOf(hw2Var.a0().length() > 0 || ((Boolean) hw2Var.f.n.getValue()).booleanValue());
            case 11:
                boolean zBooleanValue = ((Boolean) hw2Var.q.getValue()).booleanValue();
                String str2 = hw2Var.b;
                return new qv2(zBooleanValue ? str2 : null, str2);
            case 12:
                return Boolean.valueOf(hw2Var.Y() != null);
            case 13:
                return bsg.k1(hw2Var.D.d().G);
            default:
                hw2Var.K.setValue(Boolean.TRUE);
                return iei.a;
        }
    }
}
