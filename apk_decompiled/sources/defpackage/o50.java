package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o50 implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ iqb G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ long I;
    public final /* synthetic */ float J;
    public final /* synthetic */ int K;
    public final /* synthetic */ int L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;

    public /* synthetic */ o50(qcc qccVar, boolean z, lne lneVar, boolean z2, long j, float f, iqb iqbVar, int i, int i2) {
        this.M = qccVar;
        this.F = z;
        this.N = lneVar;
        this.H = z2;
        this.I = j;
        this.J = f;
        this.G = iqbVar;
        this.K = i;
        this.L = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.K;
        Object obj3 = this.N;
        Object obj4 = this.M;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                rqk.f((qcc) obj4, this.F, (lne) obj3, this.H, this.I, this.J, this.G, (ld4) obj, iP0, this.L);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                zsk.d(this.F, this.G, this.H, this.I, this.J, (p0h) obj4, (bz7) obj3, (ld4) obj, iP02, this.L);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ o50(boolean z, iqb iqbVar, boolean z2, long j, float f, p0h p0hVar, bz7 bz7Var, int i, int i2) {
        this.F = z;
        this.G = iqbVar;
        this.H = z2;
        this.I = j;
        this.J = f;
        this.M = p0hVar;
        this.N = bz7Var;
        this.K = i;
        this.L = i2;
    }
}
