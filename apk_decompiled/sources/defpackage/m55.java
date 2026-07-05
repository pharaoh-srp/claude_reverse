package defpackage;

import com.anthropic.claude.analytics.events.ElectionBannerEvents$ElectionBannerLinkClick;
import com.anthropic.claude.analytics.events.SttEvents$LanguageSelected;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m55 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ qi3 F;
    public final /* synthetic */ String G;

    public /* synthetic */ m55(qi3 qi3Var, String str, int i) {
        this.E = i;
        this.F = qi3Var;
        this.G = str;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        String str = this.G;
        qi3 qi3Var = this.F;
        String str2 = (String) obj;
        switch (i) {
            case 0:
                str2.getClass();
                qi3Var.e(new ElectionBannerEvents$ElectionBannerLinkClick(str, "cowork"), ElectionBannerEvents$ElectionBannerLinkClick.Companion.serializer());
                break;
            case 1:
                str2.getClass();
                qi3Var.e(new ElectionBannerEvents$ElectionBannerLinkClick(str, (String) null, 2, (mq5) null), iv1.J(jce.b(ElectionBannerEvents$ElectionBannerLinkClick.class)));
                break;
            default:
                str2.getClass();
                qi3Var.e(new SttEvents$LanguageSelected(str, "education_prompt", str2), iv1.J(jce.b(SttEvents$LanguageSelected.class)));
                break;
        }
        return ieiVar;
    }
}
