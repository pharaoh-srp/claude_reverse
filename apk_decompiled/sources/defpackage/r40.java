package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class r40 extends ts9 implements pz7 {
    public final /* synthetic */ u9d F;
    public final /* synthetic */ zy7 G;
    public final /* synthetic */ v9d H;
    public final /* synthetic */ ta4 I;
    public final /* synthetic */ int J;
    public final /* synthetic */ int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r40(u9d u9dVar, zy7 zy7Var, v9d v9dVar, ta4 ta4Var, int i, int i2) {
        super(2);
        this.F = u9dVar;
        this.G = zy7Var;
        this.H = v9dVar;
        this.I = ta4Var;
        this.J = i;
        this.K = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        u40.a(this.F, this.G, this.H, this.I, (ld4) obj, x44.p0(this.J | 1), this.K);
        return iei.a;
    }
}
