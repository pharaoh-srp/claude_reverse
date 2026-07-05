package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rlg implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ iqb F;
    public final /* synthetic */ String G;
    public final /* synthetic */ String H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ zy7 K;
    public final /* synthetic */ int L;

    public /* synthetic */ rlg(iqb iqbVar, String str, String str2, boolean z, boolean z2, zy7 zy7Var, int i) {
        this.F = iqbVar;
        this.G = str;
        this.H = str2;
        this.I = z;
        this.J = z2;
        this.K = zy7Var;
        this.L = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.L;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                kzj.c(x44.p0(i2 | 1), (ld4) obj, this.K, this.F, this.G, this.H, this.I, this.J);
                break;
            default:
                ((Integer) obj2).getClass();
                svh.b(x44.p0(i2 | 1), (ld4) obj, this.K, this.F, this.G, this.H, this.I, this.J);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ rlg(String str, String str2, boolean z, boolean z2, zy7 zy7Var, iqb iqbVar, int i) {
        this.G = str;
        this.H = str2;
        this.I = z;
        this.J = z2;
        this.K = zy7Var;
        this.F = iqbVar;
        this.L = i;
    }
}
