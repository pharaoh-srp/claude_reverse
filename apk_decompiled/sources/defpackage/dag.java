package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dag implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ iqb F;
    public final /* synthetic */ float G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ int I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;

    public /* synthetic */ dag(float f, bz7 bz7Var, iqb iqbVar, boolean z, fq3 fq3Var, zy7 zy7Var, v9g v9gVar, zub zubVar, int i) {
        this.G = f;
        this.J = bz7Var;
        this.F = iqbVar;
        this.H = z;
        this.K = fq3Var;
        this.L = zy7Var;
        this.M = v9gVar;
        this.N = zubVar;
        this.I = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.I;
        Object obj3 = this.N;
        Object obj4 = this.M;
        Object obj5 = this.L;
        Object obj6 = this.K;
        Object obj7 = this.J;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                lag.a(this.G, (bz7) obj7, this.F, this.H, (fq3) obj6, (zy7) obj5, (v9g) obj4, (zub) obj3, (ld4) obj, iP0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                sik.b((h5e) obj7, this.F, (bpc) obj6, (String) obj5, (tt) obj4, (jo4) obj3, this.G, this.H, (ld4) obj, iP02);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ dag(h5e h5eVar, iqb iqbVar, bpc bpcVar, String str, tt ttVar, jo4 jo4Var, float f, boolean z, int i) {
        this.J = h5eVar;
        this.F = iqbVar;
        this.K = bpcVar;
        this.L = str;
        this.M = ttVar;
        this.N = jo4Var;
        this.G = f;
        this.H = z;
        this.I = i;
    }
}
