package defpackage;

import com.anthropic.claude.analytics.events.DispatchEvents$OnboardingCompleted;
import com.anthropic.claude.analytics.events.ProUpsellEvents$StoreViewDismissed;
import com.anthropic.claude.analytics.events.ProUpsellEvents$UpsellButtonTapped;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dl implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ qi3 F;
    public final /* synthetic */ zy7 G;

    public /* synthetic */ dl(qi3 qi3Var, zy7 zy7Var, int i) {
        this.E = i;
        this.F = qi3Var;
        this.G = zy7Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        zy7 zy7Var = this.G;
        qi3 qi3Var = this.F;
        switch (i) {
            case 0:
                qi3Var.e(new DispatchEvents$OnboardingCompleted(), DispatchEvents$OnboardingCompleted.Companion.serializer());
                zy7Var.a();
                break;
            case 1:
                qi3Var.e(new ProUpsellEvents$UpsellButtonTapped("billing"), ProUpsellEvents$UpsellButtonTapped.Companion.serializer());
                zy7Var.a();
                break;
            case 2:
                qi3Var.e(new ProUpsellEvents$UpsellButtonTapped("settings"), ProUpsellEvents$UpsellButtonTapped.Companion.serializer());
                zy7Var.a();
                break;
            default:
                qi3Var.e(new ProUpsellEvents$StoreViewDismissed(), ProUpsellEvents$StoreViewDismissed.Companion.serializer());
                zy7Var.a();
                break;
        }
        return ieiVar;
    }
}
