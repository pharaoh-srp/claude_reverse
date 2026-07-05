package defpackage;

import com.anthropic.claude.tool.model.KnowledgeSource;

/* JADX INFO: loaded from: classes3.dex */
public final class jzh implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ bz7 F;
    public final /* synthetic */ KnowledgeSource G;

    public /* synthetic */ jzh(bz7 bz7Var, KnowledgeSource knowledgeSource, int i) {
        this.E = i;
        this.F = bz7Var;
        this.G = knowledgeSource;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        KnowledgeSource knowledgeSource = this.G;
        bz7 bz7Var = this.F;
        switch (i) {
            case 0:
                bz7Var.invoke(knowledgeSource);
                break;
            default:
                bz7Var.invoke(knowledgeSource);
                break;
        }
        return ieiVar;
    }
}
