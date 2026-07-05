package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y80 extends ts9 implements pz7 {
    public final /* synthetic */ a6i F;
    public final /* synthetic */ iqb G;
    public final /* synthetic */ bz7 H;
    public final /* synthetic */ tt I;
    public final /* synthetic */ bz7 J;
    public final /* synthetic */ ta4 K;
    public final /* synthetic */ int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y80(a6i a6iVar, iqb iqbVar, bz7 bz7Var, tt ttVar, bz7 bz7Var2, ta4 ta4Var, int i) {
        super(2);
        this.F = a6iVar;
        this.G = iqbVar;
        this.H = bz7Var;
        this.I = ttVar;
        this.J = bz7Var2;
        this.K = ta4Var;
        this.L = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        xn5.F(this.F, this.G, this.H, this.I, this.J, this.K, (ld4) obj, x44.p0(this.L | 1));
        return iei.a;
    }
}
