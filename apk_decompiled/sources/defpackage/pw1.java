package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pw1 implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ pw1(ad9 ad9Var, boolean z, Object obj, md9 md9Var, int i, int i2) {
        this.I = ad9Var;
        this.F = z;
        this.J = obj;
        this.K = md9Var;
        this.G = i;
        this.H = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        Object obj3 = this.J;
        iei ieiVar = iei.a;
        int i2 = this.G;
        Object obj4 = this.K;
        Object obj5 = this.I;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                xn5.H((iqb) obj5, (tt) obj3, this.F, (ta4) obj4, (ld4) obj, iP0, this.H);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                od9.a((ad9) obj5, this.F, this.J, (md9) obj4, (ld4) obj, iP02, this.H);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP03 = x44.p0(i2 | 1);
                olh.a(this.F, (af2) obj5, (km3) obj3, (pz7) obj4, (ld4) obj, iP03, this.H);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ pw1(iqb iqbVar, tt ttVar, boolean z, ta4 ta4Var, int i, int i2) {
        this.I = iqbVar;
        this.J = ttVar;
        this.F = z;
        this.K = ta4Var;
        this.G = i;
        this.H = i2;
    }

    public /* synthetic */ pw1(boolean z, af2 af2Var, km3 km3Var, pz7 pz7Var, int i, int i2) {
        this.F = z;
        this.I = af2Var;
        this.J = km3Var;
        this.K = pz7Var;
        this.G = i;
        this.H = i2;
    }
}
