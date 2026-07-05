package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m5h implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ e8h F;

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        e8h e8hVar = this.F;
        ld4 ld4Var = (ld4) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                p5h.k(e8hVar, ld4Var, x44.p0(1));
                break;
            default:
                int iIntValue = num.intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    p5h.k(e8hVar, e18Var, 0);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ m5h(e8h e8hVar, int i) {
        this.F = e8hVar;
    }
}
