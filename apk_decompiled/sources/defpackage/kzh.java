package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.tool.model.KnowledgeSource;

/* JADX INFO: loaded from: classes3.dex */
public final class kzh implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ KnowledgeSource F;

    public /* synthetic */ kzh(KnowledgeSource knowledgeSource, int i) {
        this.E = i;
        this.F = knowledgeSource;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        fqb fqbVar = fqb.E;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Number) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e18Var.T();
                } else {
                    etj.e(this.F, b.c(fqbVar, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 0L, null, 0, null, null, 0, null, e18Var, 48, 1020);
                }
                break;
            default:
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e18Var2.T();
                } else {
                    etj.e(this.F, b.c(fqbVar, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 0L, null, 0, null, null, 0, null, e18Var2, 48, 1020);
                }
                break;
        }
        return ieiVar;
    }
}
