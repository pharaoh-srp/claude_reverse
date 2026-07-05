package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h46 implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ iqb F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;
    public final /* synthetic */ int K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ qz7 N;

    public /* synthetic */ h46(cte cteVar, mte mteVar, iqb iqbVar, bz7 bz7Var, boolean z, int i, int i2, int i3, int i4) {
        this.L = cteVar;
        this.M = mteVar;
        this.F = iqbVar;
        this.N = bz7Var;
        this.G = z;
        this.H = i;
        this.I = i2;
        this.J = i3;
        this.K = i4;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.J;
        qz7 qz7Var = this.N;
        Object obj3 = this.M;
        Object obj4 = this.L;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                xsc.c((String) obj4, (String) obj3, this.H, this.I, (zy7) qz7Var, this.G, this.F, (ld4) obj, iP0, this.K);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                tpk.a((cte) obj4, (mte) obj3, this.F, (bz7) qz7Var, this.G, this.H, this.I, (ld4) obj, iP02, this.K);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ h46(String str, String str2, int i, int i2, zy7 zy7Var, boolean z, iqb iqbVar, int i3, int i4) {
        this.L = str;
        this.M = str2;
        this.H = i;
        this.I = i2;
        this.N = zy7Var;
        this.G = z;
        this.F = iqbVar;
        this.J = i3;
        this.K = i4;
    }
}
