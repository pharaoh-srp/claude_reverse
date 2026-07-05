package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n44 implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ iqb F;
    public final /* synthetic */ float G;
    public final /* synthetic */ float H;
    public final /* synthetic */ ta4 I;
    public final /* synthetic */ int J;
    public final /* synthetic */ int K;
    public final /* synthetic */ pz7 L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;

    public /* synthetic */ n44(ta4 ta4Var, q2i q2iVar, iqb iqbVar, m2i m2iVar, ta4 ta4Var2, rz7 rz7Var, float f, float f2, int i, int i2) {
        this.I = ta4Var;
        this.M = q2iVar;
        this.F = iqbVar;
        this.N = m2iVar;
        this.L = ta4Var2;
        this.O = rz7Var;
        this.G = f;
        this.H = f2;
        this.J = i;
        this.K = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.J;
        Object obj3 = this.O;
        Object obj4 = this.N;
        Object obj5 = this.M;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                cok.f(this.I, (q2i) obj5, this.F, (m2i) obj4, (ta4) this.L, (rz7) obj3, this.G, this.H, (ld4) obj, iP0, this.K);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                kwj.e(this.L, this.F, this.G, (mnc) obj5, (pz7) obj4, (wo1) obj3, this.H, this.I, (ld4) obj, iP02, this.K);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ n44(pz7 pz7Var, iqb iqbVar, float f, mnc mncVar, pz7 pz7Var2, wo1 wo1Var, float f2, ta4 ta4Var, int i, int i2) {
        this.L = pz7Var;
        this.F = iqbVar;
        this.G = f;
        this.M = mncVar;
        this.N = pz7Var2;
        this.O = wo1Var;
        this.H = f2;
        this.I = ta4Var;
        this.J = i;
        this.K = i2;
    }
}
