package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ea0 extends ts9 implements pz7 {
    public final /* synthetic */ int F = 1;
    public final /* synthetic */ a6i G;
    public final /* synthetic */ bz7 H;
    public final /* synthetic */ iqb I;
    public final /* synthetic */ wp6 J;
    public final /* synthetic */ d77 K;
    public final /* synthetic */ int L;
    public final /* synthetic */ rz7 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea0(a6i a6iVar, bz7 bz7Var, iqb iqbVar, wp6 wp6Var, d77 d77Var, ta4 ta4Var, int i, int i2) {
        super(2);
        this.G = a6iVar;
        this.H = bz7Var;
        this.I = iqbVar;
        this.J = wp6Var;
        this.K = d77Var;
        this.M = ta4Var;
        this.L = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.F;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                ta4 ta4Var = (ta4) this.M;
                int iP0 = x44.p0(196609);
                int i2 = this.L;
                wd6.L(this.G, this.H, this.I, this.J, this.K, ta4Var, (ld4) obj, iP0, i2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP02 = x44.p0(this.L | 1);
                wd6.O(this.G, this.H, this.I, this.J, this.K, this.M, (ld4) obj, iP02);
                break;
        }
        return ieiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea0(a6i a6iVar, bz7 bz7Var, iqb iqbVar, wp6 wp6Var, d77 d77Var, rz7 rz7Var, int i) {
        super(2);
        this.G = a6iVar;
        this.H = bz7Var;
        this.I = iqbVar;
        this.J = wp6Var;
        this.K = d77Var;
        this.M = rz7Var;
        this.L = i;
    }
}
