package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ga0 extends ts9 implements pz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ iqb H;
    public final /* synthetic */ wp6 I;
    public final /* synthetic */ d77 J;
    public final /* synthetic */ String K;
    public final /* synthetic */ ta4 L;
    public final /* synthetic */ int M;
    public final /* synthetic */ int N;
    public final /* synthetic */ Object O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ga0(Object obj, boolean z, iqb iqbVar, wp6 wp6Var, d77 d77Var, String str, ta4 ta4Var, int i, int i2, int i3) {
        super(2);
        this.F = i3;
        this.O = obj;
        this.G = z;
        this.H = iqbVar;
        this.I = wp6Var;
        this.J = d77Var;
        this.K = str;
        this.L = ta4Var;
        this.M = i;
        this.N = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.F;
        iei ieiVar = iei.a;
        int i2 = this.M;
        Object obj3 = this.O;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int iP0 = x44.p0(i2 | 1);
                int i3 = this.N;
                wd6.K((dxe) obj3, this.G, this.H, this.I, this.J, this.K, this.L, (ld4) obj, iP0, i3);
                break;
            default:
                ((Number) obj2).intValue();
                int iP02 = x44.p0(i2 | 1);
                int i4 = this.N;
                wd6.H((s64) obj3, this.G, this.H, this.I, this.J, this.K, this.L, (ld4) obj, iP02, i4);
                break;
        }
        return ieiVar;
    }
}
