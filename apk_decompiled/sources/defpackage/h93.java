package defpackage;

import com.anthropic.claude.chat.bottomsheet.x0;
import com.anthropic.claude.tool.model.KnowledgeSource;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h93 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ze0 F;
    public final /* synthetic */ rwe G;
    public final /* synthetic */ eli H;
    public final /* synthetic */ t53 I;

    public /* synthetic */ h93(t53 t53Var, ze0 ze0Var, rwe rweVar, eli eliVar) {
        this.E = 0;
        this.I = t53Var;
        this.F = ze0Var;
        this.G = rweVar;
        this.H = eliVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        t53 t53Var = this.I;
        eli eliVar = this.H;
        rwe rweVar = this.G;
        ze0 ze0Var = this.F;
        KnowledgeSource knowledgeSource = (KnowledgeSource) obj;
        switch (i) {
            case 0:
                knowledgeSource.getClass();
                t53Var.F1(knowledgeSource, false);
                x0.f(ze0Var, rweVar, eliVar, knowledgeSource, t53Var);
                break;
            case 1:
                knowledgeSource.getClass();
                x0.f(ze0Var, rweVar, eliVar, knowledgeSource, t53Var);
                break;
            default:
                knowledgeSource.getClass();
                x0.f(ze0Var, rweVar, eliVar, knowledgeSource, t53Var);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ h93(ze0 ze0Var, rwe rweVar, eli eliVar, t53 t53Var, int i) {
        this.E = i;
        this.F = ze0Var;
        this.G = rweVar;
        this.H = eliVar;
        this.I = t53Var;
    }
}
