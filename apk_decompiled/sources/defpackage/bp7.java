package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bp7 implements pz7 {
    public final /* synthetic */ int E = 2;
    public final /* synthetic */ zy7 F;
    public final /* synthetic */ iqb G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ long I;
    public final /* synthetic */ long J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ ta4 L;
    public final /* synthetic */ int M;

    public /* synthetic */ bp7(ud0 ud0Var, ta4 ta4Var, ta4 ta4Var2, zy7 zy7Var, iqb iqbVar, long j, long j2, int i) {
        this.H = ud0Var;
        this.L = ta4Var;
        this.K = ta4Var2;
        this.F = zy7Var;
        this.G = iqbVar;
        this.I = j;
        this.J = j2;
        this.M = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        int i2 = this.M;
        iei ieiVar = iei.a;
        Object obj3 = this.K;
        Object obj4 = this.H;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                zmk.e(this.F, this.G, (e0g) obj4, this.I, this.J, (xo7) obj3, this.L, (ld4) obj, iP0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(12582913);
                zmk.b(this.F, this.G, (e0g) obj4, this.I, this.J, (xo7) obj3, this.L, (ld4) obj, iP02, this.M);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP03 = x44.p0(i2 | 1);
                i5h.c((ud0) obj4, this.L, (ta4) obj3, this.F, this.G, this.I, this.J, (ld4) obj, iP03);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ bp7(zy7 zy7Var, iqb iqbVar, e0g e0gVar, long j, long j2, xo7 xo7Var, ta4 ta4Var, int i) {
        this.F = zy7Var;
        this.G = iqbVar;
        this.H = e0gVar;
        this.I = j;
        this.J = j2;
        this.K = xo7Var;
        this.L = ta4Var;
        this.M = i;
    }

    public /* synthetic */ bp7(zy7 zy7Var, iqb iqbVar, e0g e0gVar, long j, long j2, xo7 xo7Var, ta4 ta4Var, int i, int i2) {
        this.F = zy7Var;
        this.G = iqbVar;
        this.H = e0gVar;
        this.I = j;
        this.J = j2;
        this.K = xo7Var;
        this.L = ta4Var;
        this.M = i2;
    }
}
