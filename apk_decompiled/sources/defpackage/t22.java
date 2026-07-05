package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t22 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ nwb F;
    public final /* synthetic */ nwb G;

    public /* synthetic */ t22(nwb nwbVar, nwb nwbVar2, int i) {
        this.E = i;
        this.F = nwbVar;
        this.G = nwbVar2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        nwb nwbVar = this.G;
        nwb nwbVar2 = this.F;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                nwbVar2.setValue(bool);
                nwbVar.setValue(aq8.a);
                break;
            case 1:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    boolean z = !((Boolean) nwbVar2.getValue()).booleanValue();
                    Object objN = e18Var.N();
                    if (objN == jd4.a) {
                        objN = new d29(3, nwbVar);
                        e18Var.k0(objN);
                    }
                    trk.a(6, 4, e18Var, (zy7) objN, null, z);
                }
                break;
            default:
                ((Boolean) obj2).getClass();
                nwbVar2.setValue(Boolean.TRUE);
                ((zy7) nwbVar.getValue()).a();
                break;
        }
        return ieiVar;
    }
}
