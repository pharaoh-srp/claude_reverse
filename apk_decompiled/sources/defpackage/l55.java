package defpackage;

import com.anthropic.claude.analytics.events.ElectionBannerEvents$ElectionBannerDismiss;
import com.anthropic.claude.analytics.events.SelfHarmBannerEvents$SelfHarmBannerDismiss;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l55 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ qi3 F;
    public final /* synthetic */ String G;
    public final /* synthetic */ pz7 H;

    public /* synthetic */ l55(qi3 qi3Var, String str, pz7 pz7Var, int i) {
        this.E = i;
        this.F = qi3Var;
        this.G = str;
        this.H = pz7Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        pz7 pz7Var = this.H;
        String str = this.G;
        qi3 qi3Var = this.F;
        switch (i) {
            case 0:
                qi3Var.e(new SelfHarmBannerEvents$SelfHarmBannerDismiss(str, "cowork"), SelfHarmBannerEvents$SelfHarmBannerDismiss.Companion.serializer());
                pz7Var.invoke(str, "self_harm_risk");
                break;
            default:
                qi3Var.e(new ElectionBannerEvents$ElectionBannerDismiss(str, "cowork"), ElectionBannerEvents$ElectionBannerDismiss.Companion.serializer());
                pz7Var.invoke(str, "election");
                break;
        }
        return ieiVar;
    }
}
