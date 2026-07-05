package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qge extends ts9 implements pz7 {
    public final /* synthetic */ che F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ iqb H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ ta4 K;
    public final /* synthetic */ int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qge(che cheVar, Object obj, iqb iqbVar, boolean z, boolean z2, ta4 ta4Var, int i) {
        super(2);
        this.F = cheVar;
        this.G = obj;
        this.H = iqbVar;
        this.I = z;
        this.J = z2;
        this.K = ta4Var;
        this.L = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        j8.i(this.F, this.G, this.H, this.I, this.J, this.K, (ld4) obj, x44.p0(this.L | 1));
        return iei.a;
    }
}
