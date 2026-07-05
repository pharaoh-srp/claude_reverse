package defpackage;

import com.anthropic.claude.api.account.CurrentUserAccess;
import com.anthropic.claude.api.account.FeatureAccessStatus;
import com.anthropic.claude.api.feature.Feature;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pf7 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ qf7 F;
    public final /* synthetic */ Feature G;

    public /* synthetic */ pf7(qf7 qf7Var, Feature feature, int i) {
        this.E = i;
        this.F = qf7Var;
        this.G = feature;
    }

    @Override // defpackage.zy7
    public final Object a() {
        FeatureAccessStatus featureAccessStatusAccountStatusFor;
        int i = this.E;
        Feature feature = this.G;
        qf7 qf7Var = this.F;
        switch (i) {
            case 0:
                CurrentUserAccess currentUserAccess = (CurrentUserAccess) qf7Var.a.getValue();
                if (currentUserAccess != null) {
                    return currentUserAccess.statusFor(feature);
                }
                return null;
            default:
                CurrentUserAccess currentUserAccess2 = (CurrentUserAccess) qf7Var.a.getValue();
                return Boolean.valueOf(currentUserAccess2 == null || (featureAccessStatusAccountStatusFor = currentUserAccess2.accountStatusFor(feature)) == null || featureAccessStatusAccountStatusFor == FeatureAccessStatus.AVAILABLE);
        }
    }
}
