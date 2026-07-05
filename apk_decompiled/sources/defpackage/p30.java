package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p30 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ nwb F;

    public /* synthetic */ p30(int i, nwb nwbVar) {
        this.E = i;
        this.F = nwbVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        nwb nwbVar = this.F;
        switch (i) {
            case 0:
                nwbVar.setValue(new d5i(ldb.f((c79) obj, (c79) obj2)));
                break;
            default:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    d4c.h((zy7) nwbVar.getValue(), vz8.E(gm3.a(e18Var).M, gm3.a(e18Var).n, e18Var, 24576), null, false, dgj.a, e18Var, 24576, 12);
                }
                break;
        }
        return ieiVar;
    }
}
