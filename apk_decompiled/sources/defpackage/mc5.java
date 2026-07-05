package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mc5 extends ts9 implements pz7 {
    public final /* synthetic */ a6i F;
    public final /* synthetic */ iqb G;
    public final /* synthetic */ kl7 H;
    public final /* synthetic */ bz7 I;
    public final /* synthetic */ ta4 J;
    public final /* synthetic */ int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc5(a6i a6iVar, iqb iqbVar, kl7 kl7Var, bz7 bz7Var, ta4 ta4Var, int i) {
        super(2);
        this.F = a6iVar;
        this.G = iqbVar;
        this.H = kl7Var;
        this.I = bz7Var;
        this.J = ta4Var;
        this.K = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        knk.d(this.F, this.G, this.H, this.I, this.J, (ld4) obj, x44.p0(this.K | 1));
        return iei.a;
    }
}
