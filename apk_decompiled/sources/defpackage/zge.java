package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zge extends ts9 implements pz7 {
    public final /* synthetic */ px9 F;
    public final /* synthetic */ che G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ iqb I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ iqb K;
    public final /* synthetic */ ta4 L;
    public final /* synthetic */ int M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zge(px9 px9Var, che cheVar, Object obj, iqb iqbVar, boolean z, iqb iqbVar2, ta4 ta4Var, int i) {
        super(2);
        this.F = px9Var;
        this.G = cheVar;
        this.H = obj;
        this.I = iqbVar;
        this.J = z;
        this.K = iqbVar2;
        this.L = ta4Var;
        this.M = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        u00.d(this.F, this.G, this.H, this.I, this.J, this.K, this.L, (ld4) obj, x44.p0(this.M | 1));
        return iei.a;
    }
}
