package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class og4 implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ List F;
    public final /* synthetic */ eyh G;
    public final /* synthetic */ bz7 H;
    public final /* synthetic */ pz7 I;
    public final /* synthetic */ bz7 J;
    public final /* synthetic */ bz7 K;
    public final /* synthetic */ pl3 L;

    public /* synthetic */ og4(List list, eyh eyhVar, bz7 bz7Var, pz7 pz7Var, bz7 bz7Var2, bz7 bz7Var3, pl3 pl3Var) {
        this.F = list;
        this.G = eyhVar;
        this.H = bz7Var;
        this.I = pz7Var;
        this.J = bz7Var2;
        this.K = bz7Var3;
        this.L = pl3Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    ug4.b(this.F, this.G, this.H, this.I, this.J, this.K, this.L, e18Var, 0);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ug4.b(this.F, this.G, this.H, this.I, this.J, this.K, this.L, (ld4) obj, x44.p0(1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ og4(List list, eyh eyhVar, bz7 bz7Var, pz7 pz7Var, bz7 bz7Var2, bz7 bz7Var3, pl3 pl3Var, int i) {
        this.F = list;
        this.G = eyhVar;
        this.H = bz7Var;
        this.I = pz7Var;
        this.J = bz7Var2;
        this.K = bz7Var3;
        this.L = pl3Var;
    }
}
