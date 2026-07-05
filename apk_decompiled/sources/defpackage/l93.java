package defpackage;

import android.content.ClipData;
import com.anthropic.claude.tool.model.KnowledgeSource;

/* JADX INFO: loaded from: classes3.dex */
public final class l93 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ KnowledgeSource G;
    public final /* synthetic */ String H;
    public final /* synthetic */ op3 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l93(KnowledgeSource knowledgeSource, String str, op3 op3Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = knowledgeSource;
        this.H = str;
        this.I = op3Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new l93(this.G, this.H, this.I, tp4Var, 0);
            default:
                return new l93(this.G, this.H, this.I, tp4Var, 1);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((l93) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        op3 op3Var = this.I;
        String str = this.H;
        KnowledgeSource knowledgeSource = this.G;
        m45 m45Var = m45.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    ClipData clipDataNewPlainText = ClipData.newPlainText(knowledgeSource.getTitle(), str);
                    clipDataNewPlainText.getClass();
                    this.F = 1;
                    ((mz) op3Var).a.a().setPrimaryClip(clipDataNewPlainText);
                    if (ieiVar == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    ClipData clipDataNewPlainText2 = ClipData.newPlainText(knowledgeSource.getTitle(), str);
                    clipDataNewPlainText2.getClass();
                    this.F = 1;
                    ((mz) op3Var).a.a().setPrimaryClip(clipDataNewPlainText2);
                    if (ieiVar == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return m45Var;
    }
}
