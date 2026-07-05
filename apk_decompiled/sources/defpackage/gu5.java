package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gu5 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ iqb F;

    public /* synthetic */ gu5(iqb iqbVar) {
        this.E = 2;
        this.F = iqbVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        iqb iqbVar = this.F;
        ld4 ld4Var = (ld4) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                x44.g(iqbVar, ld4Var, x44.p0(1));
                break;
            case 1:
                num.getClass();
                ho8.c(iqbVar, ld4Var, x44.p0(1));
                break;
            case 2:
                int iIntValue = num.intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    unk.g(iqbVar, null, null, e18Var, 0);
                }
                break;
            default:
                num.getClass();
                foi.b(iqbVar, ld4Var, x44.p0(1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ gu5(int i, int i2, iqb iqbVar) {
        this.E = i2;
        this.F = iqbVar;
    }
}
