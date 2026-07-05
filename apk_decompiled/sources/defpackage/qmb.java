package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qmb implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ myh F;
    public final /* synthetic */ String G;
    public final /* synthetic */ String H;
    public final /* synthetic */ String I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ dlb K;
    public final /* synthetic */ lvh L;
    public final /* synthetic */ boolean M;
    public final /* synthetic */ boolean N;
    public final /* synthetic */ iqb O;
    public final /* synthetic */ int P;

    public /* synthetic */ qmb(myh myhVar, String str, String str2, String str3, boolean z, dlb dlbVar, lvh lvhVar, boolean z2, boolean z3, iqb iqbVar, int i) {
        this.F = myhVar;
        this.G = str;
        this.H = str2;
        this.I = str3;
        this.J = z;
        this.K = dlbVar;
        this.L = lvhVar;
        this.M = z2;
        this.N = z3;
        this.O = iqbVar;
        this.P = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.P;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                psk.e(this.G, this.K, this.J, this.H, this.L, this.M, this.I, this.N, this.O, this.F, (ld4) obj, iP0);
                break;
            default:
                ((Integer) obj2).intValue();
                int iP02 = x44.p0(i2 | 1);
                this.F.b(this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, (ld4) obj, iP02);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ qmb(String str, dlb dlbVar, boolean z, String str2, lvh lvhVar, boolean z2, String str3, boolean z3, iqb iqbVar, myh myhVar, int i) {
        this.G = str;
        this.K = dlbVar;
        this.J = z;
        this.H = str2;
        this.L = lvhVar;
        this.M = z2;
        this.I = str3;
        this.N = z3;
        this.O = iqbVar;
        this.F = myhVar;
        this.P = i;
    }
}
