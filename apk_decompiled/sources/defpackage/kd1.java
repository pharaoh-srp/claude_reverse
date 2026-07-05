package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kd1 implements pz7 {
    public final /* synthetic */ int E = 2;
    public final /* synthetic */ String F;
    public final /* synthetic */ String G;
    public final /* synthetic */ int H;
    public final /* synthetic */ iqb I;
    public final /* synthetic */ int J;
    public final /* synthetic */ int K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    public /* synthetic */ kd1(hw9 hw9Var, String str, String str2, int i, int i2, xm8 xm8Var, pz7 pz7Var, int i3) {
        this.I = hw9Var;
        this.F = str;
        this.G = str2;
        this.H = i;
        this.J = i2;
        this.L = xm8Var;
        this.M = pz7Var;
        this.K = i3;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        int i2 = this.J;
        iei ieiVar = iei.a;
        Object obj3 = this.M;
        Object obj4 = this.L;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                rvk.a(this.F, this.G, this.I, (tt) obj4, (jo4) obj3, this.H, (ld4) obj, iP0, this.K);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                rlk.a(this.F, this.G, this.H, (zy7) obj4, this.I, (zy7) obj3, (ld4) obj, iP02, this.K);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP03 = x44.p0(this.K | 1);
                ltk.h((hw9) this.I, this.F, this.G, this.H, this.J, (xm8) obj4, (pz7) obj3, (ld4) obj, iP03);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ kd1(String str, String str2, int i, zy7 zy7Var, iqb iqbVar, zy7 zy7Var2, int i2, int i3) {
        this.F = str;
        this.G = str2;
        this.H = i;
        this.L = zy7Var;
        this.I = iqbVar;
        this.M = zy7Var2;
        this.J = i2;
        this.K = i3;
    }

    public /* synthetic */ kd1(String str, String str2, iqb iqbVar, tt ttVar, jo4 jo4Var, int i, int i2, int i3) {
        this.F = str;
        this.G = str2;
        this.I = iqbVar;
        this.L = ttVar;
        this.M = jo4Var;
        this.H = i;
        this.J = i2;
        this.K = i3;
    }
}
