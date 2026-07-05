package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jf1 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ yih F;
    public final /* synthetic */ iqb G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ k6e I;
    public final /* synthetic */ tkh J;
    public final /* synthetic */ mp9 K;
    public final /* synthetic */ dhh L;
    public final /* synthetic */ zub M;
    public final /* synthetic */ jy1 N;
    public final /* synthetic */ lfh O;
    public final /* synthetic */ j9f P;
    public final /* synthetic */ int Q;
    public final /* synthetic */ int R;

    public /* synthetic */ jf1(yih yihVar, iqb iqbVar, boolean z, k6e k6eVar, tkh tkhVar, mp9 mp9Var, dhh dhhVar, zub zubVar, jy1 jy1Var, lfh lfhVar, j9f j9fVar, int i, int i2, int i3) {
        this.E = i3;
        this.F = yihVar;
        this.G = iqbVar;
        this.H = z;
        this.I = k6eVar;
        this.J = tkhVar;
        this.K = mp9Var;
        this.L = dhhVar;
        this.M = zubVar;
        this.N = jy1Var;
        this.O = lfhVar;
        this.P = j9fVar;
        this.Q = i;
        this.R = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.Q;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                bg1.a(this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, (ld4) obj, iP0, this.R);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                int iP03 = x44.p0(this.R);
                bg1.d(this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, (ld4) obj, iP02, iP03);
                break;
        }
        return ieiVar;
    }
}
