package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ilh implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ iqb F;
    public final /* synthetic */ tkh G;
    public final /* synthetic */ bpc H;
    public final /* synthetic */ dv8 I;
    public final /* synthetic */ long J;
    public final /* synthetic */ float K;
    public final /* synthetic */ long L;
    public final /* synthetic */ int M;
    public final /* synthetic */ int N;
    public final /* synthetic */ int O;
    public final /* synthetic */ int P;
    public final /* synthetic */ CharSequence Q;

    public /* synthetic */ ilh(CharSequence charSequence, iqb iqbVar, tkh tkhVar, bpc bpcVar, dv8 dv8Var, long j, float f, long j2, int i, int i2, int i3, int i4, int i5) {
        this.E = i5;
        this.Q = charSequence;
        this.F = iqbVar;
        this.G = tkhVar;
        this.H = bpcVar;
        this.I = dv8Var;
        this.J = j;
        this.K = f;
        this.L = j2;
        this.M = i;
        this.N = i2;
        this.O = i3;
        this.P = i4;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.O;
        CharSequence charSequence = this.Q;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                prk.k((String) charSequence, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, (ld4) obj, iP0, this.P);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                int iP03 = x44.p0(this.P);
                prk.j((zb0) charSequence, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, (ld4) obj, iP02, iP03);
                break;
        }
        return ieiVar;
    }
}
