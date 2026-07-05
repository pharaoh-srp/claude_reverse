package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t80 extends ts9 implements pz7 {
    public final /* synthetic */ Object F;
    public final /* synthetic */ iqb G;
    public final /* synthetic */ bz7 H;
    public final /* synthetic */ tt I;
    public final /* synthetic */ String J;
    public final /* synthetic */ bz7 K;
    public final /* synthetic */ ta4 L;
    public final /* synthetic */ int M;
    public final /* synthetic */ int N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t80(Object obj, iqb iqbVar, bz7 bz7Var, tt ttVar, String str, bz7 bz7Var2, ta4 ta4Var, int i, int i2) {
        super(2);
        this.F = obj;
        this.G = iqbVar;
        this.H = bz7Var;
        this.I = ttVar;
        this.J = str;
        this.K = bz7Var2;
        this.L = ta4Var;
        this.M = i;
        this.N = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        xn5.G(this.F, this.G, this.H, this.I, this.J, this.K, this.L, (ld4) obj, x44.p0(this.M | 1), this.N);
        return iei.a;
    }
}
