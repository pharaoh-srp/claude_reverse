package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.tool.model.KnowledgeSource;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class izh implements sz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ List F;
    public final /* synthetic */ mnc G;
    public final /* synthetic */ bz7 H;
    public final /* synthetic */ List I;

    public /* synthetic */ izh(List list, mnc mncVar, bz7 bz7Var, List list2, int i) {
        this.E = i;
        this.F = list;
        this.G = mncVar;
        this.H = bz7Var;
        this.I = list2;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2 = this.E;
        iei ieiVar = iei.a;
        List list = this.I;
        lz1 lz1Var = jd4.a;
        fqb fqbVar = fqb.E;
        List list2 = this.F;
        mnc mncVar = this.G;
        bz7 bz7Var = this.H;
        int i3 = 1;
        switch (i2) {
            case 0:
                px9 px9Var = (px9) obj;
                int iIntValue = ((Number) obj2).intValue();
                ld4 ld4Var = (ld4) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i4 = (iIntValue2 & 6) == 0 ? iIntValue2 | (((e18) ld4Var).f(px9Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i4 |= ((e18) ld4Var).d(iIntValue) ? 32 : 16;
                }
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(i4 & 1, (i4 & 147) != 146)) {
                    e18Var.T();
                } else {
                    KnowledgeSource knowledgeSource = (KnowledgeSource) list2.get(iIntValue);
                    e18Var.a0(370336618);
                    qnc qncVarQ0 = xn5.q0(mncVar, gb9.b(MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, 1));
                    iqb iqbVarC = b.c(fqbVar, 1.0f);
                    String url = knowledgeSource.getUrl();
                    boolean z2 = !(url == null || url.length() == 0);
                    boolean zF = e18Var.f(bz7Var) | e18Var.f(knowledgeSource);
                    Object objN = e18Var.N();
                    if (zF || objN == lz1Var) {
                        i = 0;
                        objN = new jzh(bz7Var, knowledgeSource, 0);
                        e18Var.k0(objN);
                    } else {
                        i = 0;
                    }
                    kwj.c(androidx.compose.foundation.b.c(iqbVarC, z2, null, null, null, (zy7) objN, 14), MTTypesetterKt.kLineSkipLimitMultiplier, qncVarQ0, fd9.q0(1093976401, new kzh(knowledgeSource, i), e18Var), e18Var, 3072, 2);
                    if (iIntValue < x44.M(list)) {
                        e18Var.a0(370849481);
                        iuj.e(gb9.I(fqbVar, mncVar), MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var).v, e18Var, 48, 0);
                        z = false;
                        e18Var.p(false);
                    } else {
                        z = false;
                        e18Var.a0(371039108);
                        e18Var.p(false);
                    }
                    e18Var.p(z);
                }
                break;
            default:
                px9 px9Var2 = (px9) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                ld4 ld4Var2 = (ld4) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i5 = (iIntValue4 & 6) == 0 ? iIntValue4 | (((e18) ld4Var2).f(px9Var2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i5 |= ((e18) ld4Var2).d(iIntValue3) ? 32 : 16;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(i5 & 1, (i5 & 147) != 146)) {
                    e18Var2.T();
                } else {
                    KnowledgeSource knowledgeSource2 = (KnowledgeSource) list2.get(iIntValue3);
                    e18Var2.a0(-1603149596);
                    qnc qncVarQ02 = xn5.q0(mncVar, gb9.b(MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, 1));
                    iqb iqbVarC2 = b.c(fqbVar, 1.0f);
                    String url2 = knowledgeSource2.getUrl();
                    boolean z3 = !(url2 == null || url2.length() == 0);
                    vue vueVar = new vue(0);
                    boolean zF2 = e18Var2.f(bz7Var) | e18Var2.f(knowledgeSource2);
                    Object objN2 = e18Var2.N();
                    if (zF2 || objN2 == lz1Var) {
                        objN2 = new jzh(bz7Var, knowledgeSource2, 1);
                        e18Var2.k0(objN2);
                    }
                    kwj.c(androidx.compose.foundation.b.c(iqbVarC2, z3, null, vueVar, null, (zy7) objN2, 10), MTTypesetterKt.kLineSkipLimitMultiplier, qncVarQ02, fd9.q0(1068835821, new kzh(knowledgeSource2, i3), e18Var2), e18Var2, 3072, 2);
                    if (iIntValue3 < x44.M(list)) {
                        e18Var2.a0(-1602602137);
                        iuj.e(gb9.I(fqbVar, mncVar), MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var2).v, e18Var2, 48, 0);
                        e18Var2.p(false);
                    } else {
                        e18Var2.a0(-1602412510);
                        e18Var2.p(false);
                    }
                    e18Var2.p(false);
                }
                break;
        }
        return ieiVar;
    }
}
