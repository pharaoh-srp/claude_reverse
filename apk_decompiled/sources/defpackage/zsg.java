package defpackage;

import com.anthropic.claude.analytics.events.SttEvents$EducationPromptCancel;
import com.anthropic.claude.analytics.events.SttEvents$EducationPromptContinue;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zsg implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ qi3 F;
    public final /* synthetic */ String G;
    public final /* synthetic */ ysg H;
    public final /* synthetic */ zy7 I;

    public /* synthetic */ zsg(qi3 qi3Var, String str, ysg ysgVar, zy7 zy7Var, int i) {
        this.E = i;
        this.F = qi3Var;
        this.G = str;
        this.H = ysgVar;
        this.I = zy7Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        zy7 zy7Var = this.I;
        ysg ysgVar = this.H;
        String str = this.G;
        qi3 qi3Var = this.F;
        switch (i) {
            case 0:
                qi3Var.e(new SttEvents$EducationPromptCancel(str, ysgVar.c(ysgVar.b.f()).getCode()), iv1.J(jce.b(SttEvents$EducationPromptCancel.class)));
                zy7Var.a();
                break;
            default:
                qi3Var.e(new SttEvents$EducationPromptContinue(str, ysgVar.c(ysgVar.b.f()).getCode()), iv1.J(jce.b(SttEvents$EducationPromptContinue.class)));
                zy7Var.a();
                break;
        }
        return ieiVar;
    }
}
