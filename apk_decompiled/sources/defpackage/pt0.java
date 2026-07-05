package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pt0 implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ String F;
    public final /* synthetic */ iqb G;
    public final /* synthetic */ float H;

    public /* synthetic */ pt0(String str, iqb iqbVar, float f) {
        this.F = str;
        this.G = iqbVar;
        this.H = f;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        float f = this.H;
        iqb iqbVar = this.G;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    tjh.b(this.F, gb9.J(mpk.b0(iqbVar, mpk.Y(e18Var), true), f), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var, 0, 0, 262140);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                wtk.a(this.F, iqbVar, f, (ld4) obj, x44.p0(1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ pt0(String str, iqb iqbVar, float f, int i) {
        this.F = str;
        this.G = iqbVar;
        this.H = f;
    }
}
