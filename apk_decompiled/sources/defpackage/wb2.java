package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$SafeguardsLearnMoreSurface;
import com.anthropic.claude.analytics.events.ChatEvents$SafeguardsLearnMoreTapped;
import com.anthropic.claude.analytics.events.MemoryEvents$MemoryEditOnWeb;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wb2 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ qi3 G;
    public final /* synthetic */ eli H;

    public /* synthetic */ wb2(String str, qi3 qi3Var, eli eliVar) {
        this.E = 1;
        this.F = str;
        this.G = qi3Var;
        this.H = eliVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        String strA = this.F;
        eli eliVar = this.H;
        qi3 qi3Var = this.G;
        switch (i) {
            case 0:
                qi3Var.e(new MemoryEvents$MemoryEditOnWeb(), MemoryEvents$MemoryEditOnWeb.Companion.serializer());
                eliVar.a(strA);
                break;
            case 1:
                if (strA == null || bsg.I0(strA)) {
                    strA = null;
                }
                qi3Var.e(new ChatEvents$SafeguardsLearnMoreTapped(ChatEvents$SafeguardsLearnMoreSurface.MODEL_CHANGE, strA != null), ChatEvents$SafeguardsLearnMoreTapped.Companion.serializer());
                if (strA == null) {
                    strA = tyg.REAL_TIME_SAFEGUARDS.a();
                }
                eliVar.a(strA);
                break;
            default:
                qi3Var.e(new ChatEvents$SafeguardsLearnMoreTapped(ChatEvents$SafeguardsLearnMoreSurface.REFUSAL, true), ChatEvents$SafeguardsLearnMoreTapped.Companion.serializer());
                eliVar.a(strA);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ wb2(qi3 qi3Var, eli eliVar, String str, int i) {
        this.E = i;
        this.G = qi3Var;
        this.H = eliVar;
        this.F = str;
    }
}
