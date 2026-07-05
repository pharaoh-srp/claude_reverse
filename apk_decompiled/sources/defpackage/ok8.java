package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ok8 implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ kl8 F;
    public final /* synthetic */ zy7 G;
    public final /* synthetic */ eyh H;

    public /* synthetic */ ok8(kl8 kl8Var, zy7 zy7Var, eyh eyhVar, int i) {
        this.F = kl8Var;
        this.G = zy7Var;
        this.H = eyhVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        eyh eyhVar = this.H;
        zy7 zy7Var = this.G;
        kl8 kl8Var = this.F;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    boolean zH = e18Var.h(kl8Var) | e18Var.d(eyhVar.ordinal()) | e18Var.f(zy7Var);
                    Object objN = e18Var.N();
                    if (zH || objN == jd4.a) {
                        objN = new yg4(kl8Var, eyhVar, zy7Var, 22);
                        e18Var.k0(objN);
                    }
                    csg.j((zy7) objN, null, false, null, null, null, null, gmk.a, e18Var, 805306368, 510);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                esk.a(kl8Var, zy7Var, eyhVar, (ld4) obj, x44.p0(57));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ ok8(kl8 kl8Var, eyh eyhVar, zy7 zy7Var) {
        this.F = kl8Var;
        this.H = eyhVar;
        this.G = zy7Var;
    }
}
