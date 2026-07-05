package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hgh implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ long F;
    public final /* synthetic */ pz7 G;

    public /* synthetic */ hgh(long j, pz7 pz7Var, int i) {
        this.E = 2;
        this.F = j;
        this.G = pz7Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        pz7 pz7Var = this.G;
        long j = this.F;
        ld4 ld4Var = (ld4) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int iIntValue = num.intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    xn5.L(j, pz7Var, e18Var, 0);
                }
                break;
            case 1:
                int iIntValue2 = num.intValue();
                e18 e18Var2 = (e18) ld4Var;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    xn5.L(j, pz7Var, e18Var2, 0);
                }
                break;
            default:
                num.getClass();
                xn5.L(j, pz7Var, ld4Var, x44.p0(1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ hgh(long j, pz7 pz7Var, int i, byte b) {
        this.E = i;
        this.F = j;
        this.G = pz7Var;
    }
}
