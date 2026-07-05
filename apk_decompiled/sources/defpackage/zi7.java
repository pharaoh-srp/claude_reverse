package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zi7 implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ Float F;

    public /* synthetic */ zi7(Float f) {
        this.F = f;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        Float f = this.F;
        ld4 ld4Var = (ld4) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int iIntValue = num.intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    bj7.a(f, e18Var, 0);
                }
                break;
            default:
                num.getClass();
                bj7.a(f, ld4Var, x44.p0(1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ zi7(Float f, int i) {
        this.F = f;
    }
}
