package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class db0 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ Object G;

    public /* synthetic */ db0(zy7 zy7Var, boolean z) {
        this.E = 3;
        this.F = z;
        this.G = zy7Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj3 = this.G;
        boolean z = this.F;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                oq5.c((k3g) obj3, z, (ld4) obj, x44.p0(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                zni.h(z, (pz7) obj3, (ld4) obj, x44.p0(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                dch.k((zhh) obj3, z, (ld4) obj, x44.p0(1));
                break;
            default:
                zy7 zy7Var = (zy7) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    dgj.a(0, e18Var, zy7Var, null, z);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ db0(int i, int i2, Object obj, boolean z) {
        this.E = i2;
        this.G = obj;
        this.F = z;
    }

    public /* synthetic */ db0(boolean z, pz7 pz7Var, int i) {
        this.E = 1;
        this.F = z;
        this.G = pz7Var;
    }
}
