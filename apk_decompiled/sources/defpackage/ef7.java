package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ef7 implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ iqb F;
    public final /* synthetic */ float G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;

    public /* synthetic */ ef7(iqb iqbVar, pz7 pz7Var, pz7 pz7Var2, rz7 rz7Var, float f, wbj wbjVar, m2i m2iVar, int i, int i2) {
        this.F = iqbVar;
        this.J = pz7Var;
        this.K = pz7Var2;
        this.L = rz7Var;
        this.G = f;
        this.M = wbjVar;
        this.N = m2iVar;
        this.H = i;
        this.I = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.H;
        Object obj3 = this.N;
        Object obj4 = this.M;
        Object obj5 = this.L;
        Object obj6 = this.K;
        Object obj7 = this.J;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                zni.e(this.F, (pz7) obj7, (pz7) obj6, (rz7) obj5, this.G, (wbj) obj4, (m2i) obj3, (ld4) obj, iP0, this.I);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                xn5.N((bpc) obj7, (String) obj6, this.F, (tt) obj5, (jo4) obj4, this.G, (hr1) obj3, (ld4) obj, iP02, this.I);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ ef7(bpc bpcVar, String str, iqb iqbVar, tt ttVar, jo4 jo4Var, float f, hr1 hr1Var, int i, int i2) {
        this.J = bpcVar;
        this.K = str;
        this.F = iqbVar;
        this.L = ttVar;
        this.M = jo4Var;
        this.G = f;
        this.N = hr1Var;
        this.H = i;
        this.I = i2;
    }
}
