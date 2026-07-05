package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r32 implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ String F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ iqb H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ int J;
    public final /* synthetic */ int K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ qz7 M;
    public final /* synthetic */ Object N;

    public /* synthetic */ r32(bpc bpcVar, String str, boolean z, bz7 bz7Var, iqb iqbVar, zb0 zb0Var, boolean z2, int i, int i2) {
        this.L = bpcVar;
        this.F = str;
        this.G = z;
        this.M = bz7Var;
        this.H = iqbVar;
        this.N = zb0Var;
        this.I = z2;
        this.J = i;
        this.K = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.J;
        qz7 qz7Var = this.M;
        Object obj3 = this.N;
        Object obj4 = this.L;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                nuj.g(this.F, (String) obj4, this.G, this.I, (zy7) qz7Var, this.H, (ud0) obj3, (ld4) obj, iP0, this.K);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                yhk.d((bpc) obj4, this.F, this.G, (bz7) qz7Var, this.H, (zb0) obj3, this.I, (ld4) obj, iP02, this.K);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP03 = x44.p0(i2 | 1);
                cok.g(this.F, (String) obj4, (String) obj3, this.G, this.H, this.I, (zy7) qz7Var, (ld4) obj, iP03, this.K);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ r32(String str, String str2, String str3, boolean z, iqb iqbVar, boolean z2, zy7 zy7Var, int i, int i2) {
        this.F = str;
        this.L = str2;
        this.N = str3;
        this.G = z;
        this.H = iqbVar;
        this.I = z2;
        this.M = zy7Var;
        this.J = i;
        this.K = i2;
    }

    public /* synthetic */ r32(String str, String str2, boolean z, boolean z2, zy7 zy7Var, iqb iqbVar, ud0 ud0Var, int i, int i2) {
        this.F = str;
        this.L = str2;
        this.G = z;
        this.I = z2;
        this.M = zy7Var;
        this.H = iqbVar;
        this.N = ud0Var;
        this.J = i;
        this.K = i2;
    }
}
