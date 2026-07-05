package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class da0 extends ts9 implements pz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ swb G;
    public final /* synthetic */ iqb H;
    public final /* synthetic */ wp6 I;
    public final /* synthetic */ d77 J;
    public final /* synthetic */ String K;
    public final /* synthetic */ ta4 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ da0(swb swbVar, iqb iqbVar, wp6 wp6Var, d77 d77Var, String str, ta4 ta4Var, int i, int i2) {
        super(2);
        this.F = i2;
        this.G = swbVar;
        this.H = iqbVar;
        this.I = wp6Var;
        this.J = d77Var;
        this.K = str;
        this.L = ta4Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.F;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int iP0 = x44.p0(1600519);
                wd6.N(this.G, this.H, this.I, this.J, this.K, this.L, (ld4) obj, iP0);
                break;
            default:
                ((Number) obj2).intValue();
                int iP02 = x44.p0(200065);
                wd6.I(this.G, this.H, this.I, this.J, this.K, this.L, (ld4) obj, iP02);
                break;
        }
        return ieiVar;
    }
}
