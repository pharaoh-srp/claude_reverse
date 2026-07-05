package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class q70 extends ts9 implements pz7 {
    public final /* synthetic */ bz7 F;
    public final /* synthetic */ iqb G;
    public final /* synthetic */ bz7 H;
    public final /* synthetic */ bz7 I;
    public final /* synthetic */ bz7 J;
    public final /* synthetic */ int K;
    public final /* synthetic */ int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q70(bz7 bz7Var, iqb iqbVar, bz7 bz7Var2, bz7 bz7Var3, bz7 bz7Var4, int i, int i2) {
        super(2);
        this.F = bz7Var;
        this.G = iqbVar;
        this.H = bz7Var2;
        this.I = bz7Var3;
        this.J = bz7Var4;
        this.K = i;
        this.L = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        uj5.b(this.F, this.G, this.H, this.I, this.J, (ld4) obj, x44.p0(this.K | 1), this.L);
        return iei.a;
    }
}
