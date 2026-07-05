package defpackage;

import com.anthropic.claude.app.onboarding.OnboardingPage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nb9 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ggc F;

    public /* synthetic */ nb9(ggc ggcVar, int i) {
        this.E = i;
        this.F = ggcVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        ggc ggcVar = this.F;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ggcVar.a.q.setValue(bool);
                return ieiVar;
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                ggcVar.a.r.setValue(bool2);
                return ieiVar;
            default:
                return OnboardingPage.Name.Content$lambda$0$0(ggcVar, (String) obj);
        }
    }
}
