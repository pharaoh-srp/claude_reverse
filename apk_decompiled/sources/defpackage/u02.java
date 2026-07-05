package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u02 implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ String F;
    public final /* synthetic */ a12 G;
    public final /* synthetic */ iqb H;
    public final /* synthetic */ h12 I;
    public final /* synthetic */ z02 J;
    public final /* synthetic */ long K;
    public final /* synthetic */ zub L;
    public final /* synthetic */ zy7 M;
    public final /* synthetic */ int N;
    public final /* synthetic */ Object O;

    public /* synthetic */ u02(bpc bpcVar, String str, a12 a12Var, iqb iqbVar, h12 h12Var, z02 z02Var, long j, zub zubVar, zy7 zy7Var, int i) {
        this.O = bpcVar;
        this.F = str;
        this.G = a12Var;
        this.H = iqbVar;
        this.I = h12Var;
        this.J = z02Var;
        this.K = j;
        this.L = zubVar;
        this.M = zy7Var;
        this.N = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.N;
        Object obj3 = this.O;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                dtj.b(this.F, this.G, this.H, (pz7) obj3, this.I, this.J, this.K, this.L, this.M, (ld4) obj, iP0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                ktk.i((bpc) obj3, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, (ld4) obj, iP02);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ u02(String str, a12 a12Var, iqb iqbVar, pz7 pz7Var, h12 h12Var, z02 z02Var, long j, zub zubVar, zy7 zy7Var, int i) {
        this.F = str;
        this.G = a12Var;
        this.H = iqbVar;
        this.O = pz7Var;
        this.I = h12Var;
        this.J = z02Var;
        this.K = j;
        this.L = zubVar;
        this.M = zy7Var;
        this.N = i;
    }
}
