package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rf2 implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ iqb F;
    public final /* synthetic */ int G;
    public final /* synthetic */ rz7 H;

    public /* synthetic */ rf2(iqb iqbVar, int i, rz7 rz7Var) {
        this.F = iqbVar;
        this.G = i;
        this.H = rz7Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.G;
        iqb iqbVar = this.F;
        ld4 ld4Var = (ld4) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                yhk.a(iqbVar, this.H, ld4Var, x44.p0(i2 | 1));
                break;
            default:
                int iIntValue = num.intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    boolean zD = e18Var.d(i2);
                    Object objN = e18Var.N();
                    if (zD || objN == jd4.a) {
                        objN = new sm5(i2, 5);
                        e18Var.k0(objN);
                    }
                    xvk.a(tjf.b(iqbVar, false, (bz7) objN), null, this.H, e18Var, 0, 6);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ rf2(iqb iqbVar, rz7 rz7Var, int i) {
        this.F = iqbVar;
        this.H = rz7Var;
        this.G = i;
    }
}
