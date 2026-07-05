package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lp1 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ int G;

    public /* synthetic */ lp1(String str, int i, int i2) {
        this.E = 3;
        this.F = str;
        this.G = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        String str = this.F;
        int i2 = this.G;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                xzk.h(str, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 1:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    tjh.b(this.F, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, this.G, 0, null, null, e18Var, 0, 384, 241662);
                }
                break;
            case 2:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    q64 q64VarA = p64.a(ko0.c, lja.S, e18Var2, 0);
                    int iHashCode = Long.hashCode(e18Var2.T);
                    hyc hycVarL = e18Var2.l();
                    fqb fqbVar = fqb.E;
                    iqb iqbVarE = kxk.E(e18Var2, fqbVar);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var2.e0();
                    if (e18Var2.S) {
                        e18Var2.k(re4Var);
                    } else {
                        e18Var2.n0();
                    }
                    d4c.i0(e18Var2, cd4.f, q64VarA);
                    d4c.i0(e18Var2, cd4.e, hycVarL);
                    d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var2, cd4.h);
                    d4c.i0(e18Var2, cd4.d, iqbVarE);
                    tjh.b(this.F, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).j, e18Var2, 0, 0, 131070);
                    kxk.g(e18Var2, b.g(fqbVar, 12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2).B(new hw9(1.0f, true)));
                    if (i2 == 0) {
                        e18Var2.a0(2130860306);
                        x2k.f(d4c.j0(R.string.project_details_knowledge_empty_label, e18Var2), null, e18Var2, 0);
                        e18Var2.p(false);
                    } else {
                        e18Var2.a0(2131043795);
                        tjh.b(d4c.f0(R.plurals.project_details_knowledge_file_count, i2, new Object[]{Integer.valueOf(i2)}, e18Var2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var2, 0, 0, 131070);
                        e18Var2.p(false);
                    }
                    e18Var2.p(true);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                qik.e(i2, x44.p0(1), (ld4) obj, str);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ lp1(String str, int i, int i2, byte b) {
        this.E = i2;
        this.F = str;
        this.G = i;
    }
}
