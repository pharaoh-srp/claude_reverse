package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jc5 extends ts9 implements pz7 {
    public final /* synthetic */ Object F;
    public final /* synthetic */ iqb G;
    public final /* synthetic */ kl7 H;
    public final /* synthetic */ String I;
    public final /* synthetic */ ta4 J;
    public final /* synthetic */ int K;
    public final /* synthetic */ int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc5(Object obj, iqb iqbVar, kl7 kl7Var, String str, ta4 ta4Var, int i, int i2) {
        super(2);
        this.F = obj;
        this.G = iqbVar;
        this.H = kl7Var;
        this.I = str;
        this.J = ta4Var;
        this.K = i;
        this.L = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        knk.e(this.F, this.G, this.H, this.I, this.J, (ld4) obj, x44.p0(this.K | 1), this.L);
        return iei.a;
    }
}
