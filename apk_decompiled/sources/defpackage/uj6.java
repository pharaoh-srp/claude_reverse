package defpackage;

import com.anthropic.claude.analytics.events.ElectionBannerEvents$ElectionBannerDismiss;
import com.anthropic.claude.analytics.events.SelfHarmBannerEvents$SelfHarmBannerDismiss;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class uj6 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ qi3 F;
    public final /* synthetic */ String G;
    public final /* synthetic */ zy7 H;
    public final /* synthetic */ nwb I;

    public /* synthetic */ uj6(qi3 qi3Var, String str, zy7 zy7Var, nwb nwbVar, int i) {
        this.E = i;
        this.F = qi3Var;
        this.G = str;
        this.H = zy7Var;
        this.I = nwbVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        nwb nwbVar = this.I;
        zy7 zy7Var = this.H;
        String str = this.G;
        qi3 qi3Var = this.F;
        switch (i) {
            case 0:
                nwbVar.setValue(Boolean.TRUE);
                qi3Var.e(new ElectionBannerEvents$ElectionBannerDismiss(str, (String) null, 2, (mq5) null), iv1.J(jce.b(ElectionBannerEvents$ElectionBannerDismiss.class)));
                zy7Var.a();
                break;
            default:
                nwbVar.setValue(Boolean.TRUE);
                qi3Var.e(new SelfHarmBannerEvents$SelfHarmBannerDismiss(str, (String) null, 2, (mq5) null), iv1.J(jce.b(SelfHarmBannerEvents$SelfHarmBannerDismiss.class)));
                zy7Var.a();
                break;
        }
        return ieiVar;
    }
}
