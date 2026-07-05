package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fa0 extends ts9 implements pz7 {
    public final /* synthetic */ boolean F;
    public final /* synthetic */ iqb G;
    public final /* synthetic */ wp6 H;
    public final /* synthetic */ d77 I;
    public final /* synthetic */ String J;
    public final /* synthetic */ rz7 K;
    public final /* synthetic */ int L;
    public final /* synthetic */ int M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa0(boolean z, iqb iqbVar, wp6 wp6Var, d77 d77Var, String str, rz7 rz7Var, int i, int i2) {
        super(2);
        this.F = z;
        this.G = iqbVar;
        this.H = wp6Var;
        this.I = d77Var;
        this.J = str;
        this.K = rz7Var;
        this.L = i;
        this.M = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        wd6.M(this.F, this.G, this.H, this.I, this.J, this.K, (ld4) obj, x44.p0(this.L | 1), this.M);
        return iei.a;
    }
}
