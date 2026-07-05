package defpackage;

import com.anthropic.claude.api.account.CurrentUserAccess;
import com.anthropic.claude.api.account.FeatureAccessStatus;
import com.anthropic.claude.api.feature.Feature;

/* JADX INFO: loaded from: classes2.dex */
public final class rf7 implements nf7 {
    public final lsc a = mpk.P(FeatureAccessStatus.AVAILABLE);
    public final lsc b;
    public final lsc c;
    public final lsc d;

    public rf7() {
        lsc lscVarP = mpk.P(Boolean.TRUE);
        this.b = lscVarP;
        this.c = lscVarP;
        this.d = mpk.P(null);
    }

    @Override // defpackage.nf7
    public final wlg a() {
        return this.c;
    }

    @Override // defpackage.nf7
    public final boolean b(Feature feature) {
        feature.getClass();
        return true;
    }

    @Override // defpackage.nf7
    public final wlg c(Feature feature) {
        feature.getClass();
        return this.b;
    }

    @Override // defpackage.nf7
    public final void d(CurrentUserAccess currentUserAccess) {
    }

    @Override // defpackage.nf7
    public final lsc e() {
        return this.d;
    }

    @Override // defpackage.nf7
    public final wlg f(Feature feature) {
        feature.getClass();
        return this.b;
    }

    @Override // defpackage.nf7
    public final wlg g(Feature feature) {
        feature.getClass();
        return this.a;
    }
}
