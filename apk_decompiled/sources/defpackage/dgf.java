package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dgf implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ String F;
    public final /* synthetic */ nxf G;

    public /* synthetic */ dgf(nxf nxfVar, String str) {
        this.G = nxfVar;
        this.F = str;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        nxf nxfVar = this.G;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    tjh.b(this.F, null, nxfVar.a, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var).e.E).e, e18Var, 0, 24960, 110586);
                }
                break;
            default:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    tjh.b(this.F, null, nxfVar.c, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, ((jm3) gm3.c(e18Var2).e.E).g, e18Var2, 0, 24960, 110586);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ dgf(String str, nxf nxfVar) {
        this.F = str;
        this.G = nxfVar;
    }
}
