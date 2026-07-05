package defpackage;

import com.anthropic.claude.api.account.CurrentUserAccess;
import com.anthropic.claude.api.account.FeatureAccessStatus;
import com.anthropic.claude.api.feature.Feature;

/* JADX INFO: loaded from: classes.dex */
public final class qf7 implements nf7 {
    public final lsc a = mpk.P(null);
    public final wz5 b = mpk.x(new p7(25, this), a5.N);
    public final lsc c = mpk.P(null);

    @Override // defpackage.nf7
    public final wlg a() {
        return this.b;
    }

    @Override // defpackage.nf7
    public final boolean b(Feature feature) {
        FeatureAccessStatus featureAccessStatusStatusFor;
        feature.getClass();
        CurrentUserAccess currentUserAccess = (CurrentUserAccess) this.a.getValue();
        return currentUserAccess == null || (featureAccessStatusStatusFor = currentUserAccess.statusFor(feature)) == null || featureAccessStatusStatusFor == FeatureAccessStatus.AVAILABLE;
    }

    @Override // defpackage.nf7
    public final wlg c(Feature feature) {
        feature.getClass();
        return mpk.x(new l80(this, 28, feature), a5.N);
    }

    @Override // defpackage.nf7
    public final void d(CurrentUserAccess currentUserAccess) {
        this.a.setValue(currentUserAccess);
    }

    @Override // defpackage.nf7
    public final lsc e() {
        return this.c;
    }

    @Override // defpackage.nf7
    public final wlg f(Feature feature) {
        feature.getClass();
        return mpk.x(new pf7(this, feature, 1), a5.N);
    }

    @Override // defpackage.nf7
    public final wlg g(Feature feature) {
        feature.getClass();
        return mpk.x(new pf7(this, feature, 0), a5.N);
    }
}
