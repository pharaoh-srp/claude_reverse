package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aa0 extends ts9 implements pz7 {
    public final /* synthetic */ a6i F;
    public final /* synthetic */ bz7 G;
    public final /* synthetic */ iqb H;
    public final /* synthetic */ wp6 I;
    public final /* synthetic */ d77 J;
    public final /* synthetic */ pz7 K;
    public final /* synthetic */ rz7 L;
    public final /* synthetic */ int M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa0(a6i a6iVar, bz7 bz7Var, iqb iqbVar, wp6 wp6Var, d77 d77Var, pz7 pz7Var, rz7 rz7Var, int i) {
        super(2);
        this.F = a6iVar;
        this.G = bz7Var;
        this.H = iqbVar;
        this.I = wp6Var;
        this.J = d77Var;
        this.K = pz7Var;
        this.L = rz7Var;
        this.M = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        wd6.G(this.F, this.G, this.H, this.I, this.J, this.K, this.L, (ld4) obj, x44.p0(this.M | 1));
        return iei.a;
    }
}
