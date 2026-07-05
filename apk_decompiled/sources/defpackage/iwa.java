package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iwa implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ zbi F;
    public final /* synthetic */ pz7 G;

    public /* synthetic */ iwa(zbi zbiVar, pz7 pz7Var, int i) {
        this.E = i;
        this.F = zbiVar;
        this.G = pz7Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        pz7 pz7Var = this.G;
        zbi zbiVar = this.F;
        int i2 = 1;
        ld4 ld4Var = (ld4) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    wad.a(fd9.q0(-241536773, new iwa(zbiVar, pz7Var, i2), e18Var), e18Var, 6);
                }
                break;
            default:
                e18 e18Var2 = (e18) ld4Var;
                if (!e18Var2.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var2.T();
                } else {
                    tjh.a(zbiVar.j, pz7Var, e18Var2, 0);
                }
                break;
        }
        return ieiVar;
    }
}
