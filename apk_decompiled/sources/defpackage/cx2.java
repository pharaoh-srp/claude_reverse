package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cx2 implements pz7 {
    public final /* synthetic */ int E = 2;
    public final /* synthetic */ zy7 F;
    public final /* synthetic */ iqb G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ int I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    public /* synthetic */ cx2(zy7 zy7Var, iqb iqbVar, boolean z, e0g e0gVar, wu8 wu8Var, ta4 ta4Var, int i) {
        this.F = zy7Var;
        this.G = iqbVar;
        this.H = z;
        this.J = e0gVar;
        this.K = wu8Var;
        this.L = ta4Var;
        this.I = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.I;
        Object obj3 = this.L;
        Object obj4 = this.K;
        Object obj5 = this.J;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                eve.b((String) obj5, (String) obj4, this.F, this.G, this.H, (String) obj3, (ld4) obj, iP0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                ez1.l(this.F, this.G, this.H, (e0g) obj5, (wu8) obj4, (ta4) obj3, (ld4) obj, iP02);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP03 = x44.p0(i2 | 1);
                ez1.f(this.G, this.F, this.H, (e0g) obj5, (wu8) obj4, (pz7) obj3, (ld4) obj, iP03);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ cx2(iqb iqbVar, zy7 zy7Var, boolean z, e0g e0gVar, wu8 wu8Var, pz7 pz7Var, int i) {
        this.G = iqbVar;
        this.F = zy7Var;
        this.H = z;
        this.J = e0gVar;
        this.K = wu8Var;
        this.L = pz7Var;
        this.I = i;
    }

    public /* synthetic */ cx2(String str, String str2, zy7 zy7Var, iqb iqbVar, boolean z, String str3, int i) {
        this.J = str;
        this.K = str2;
        this.F = zy7Var;
        this.G = iqbVar;
        this.H = z;
        this.L = str3;
        this.I = i;
    }
}
