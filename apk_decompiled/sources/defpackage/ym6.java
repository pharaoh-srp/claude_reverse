package defpackage;

import androidx.compose.foundation.layout.b;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ym6 implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ ta4 F;
    public final /* synthetic */ ta4 G;

    public /* synthetic */ ym6(ta4 ta4Var, ta4 ta4Var2) {
        this.F = ta4Var;
        this.G = ta4Var2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        ta4 ta4Var = this.G;
        ta4 ta4Var2 = this.F;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    ta4Var2.invoke(e18Var, 0);
                    kxk.g(e18Var, b.e(fqb.E, 12.0f));
                    tjh.a(tkh.b(((jm3) gm3.c(e18Var).e.E).e, 0L, 0L, null, null, null, 0L, null, 3, 0L, null, 0, 16744447), fd9.q0(861542572, new rx0(ta4Var, 15), e18Var), e18Var, 48);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                wsk.c(ta4Var2, ta4Var, (ld4) obj, x44.p0(55));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ ym6(ta4 ta4Var, ta4 ta4Var2, int i) {
        this.F = ta4Var;
        this.G = ta4Var2;
    }
}
