package defpackage;

import com.anthropic.claude.analytics.events.ElectionBannerEvents$ElectionBannerView;
import com.anthropic.claude.analytics.events.SelfHarmBannerEvents$SelfHarmBannerFindResources;
import com.anthropic.claude.analytics.events.SelfHarmBannerEvents$SelfHarmBannerView;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j55 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ qi3 F;
    public final /* synthetic */ String G;

    public /* synthetic */ j55(qi3 qi3Var, String str, int i) {
        this.E = i;
        this.F = qi3Var;
        this.G = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        int i2 = 2;
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        iei ieiVar = iei.a;
        String str2 = this.G;
        qi3 qi3Var = this.F;
        switch (i) {
            case 0:
                qi3Var.e(new SelfHarmBannerEvents$SelfHarmBannerFindResources(str2, "cowork"), SelfHarmBannerEvents$SelfHarmBannerFindResources.Companion.serializer());
                break;
            case 1:
                qi3Var.e(new SelfHarmBannerEvents$SelfHarmBannerView(str2, "cowork"), SelfHarmBannerEvents$SelfHarmBannerView.Companion.serializer());
                break;
            case 2:
                qi3Var.e(new ElectionBannerEvents$ElectionBannerView(str2, "cowork"), ElectionBannerEvents$ElectionBannerView.Companion.serializer());
                break;
            case 3:
                qi3Var.e(new ElectionBannerEvents$ElectionBannerView(str2, (String) (objArr2 == true ? 1 : 0), i2, (mq5) (objArr == true ? 1 : 0)), iv1.J(jce.b(ElectionBannerEvents$ElectionBannerView.class)));
                break;
            case 4:
                qi3Var.e(new SelfHarmBannerEvents$SelfHarmBannerFindResources(str2, (String) (objArr4 == true ? 1 : 0), i2, (mq5) (objArr3 == true ? 1 : 0)), iv1.J(jce.b(SelfHarmBannerEvents$SelfHarmBannerFindResources.class)));
                break;
            default:
                qi3Var.e(new SelfHarmBannerEvents$SelfHarmBannerView(str2, str, i2, (mq5) (objArr5 == true ? 1 : 0)), iv1.J(jce.b(SelfHarmBannerEvents$SelfHarmBannerView.class)));
                break;
        }
        return ieiVar;
    }
}
