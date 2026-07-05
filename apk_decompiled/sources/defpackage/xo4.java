package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xo4 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ qz7 J;

    public /* synthetic */ xo4(fu5 fu5Var, ib0 ib0Var, zy7 zy7Var, ta4 ta4Var, int i) {
        this.E = 1;
        this.H = fu5Var;
        this.I = ib0Var;
        this.F = zy7Var;
        this.J = ta4Var;
        this.G = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        Object obj3 = this.F;
        Object obj4 = this.H;
        iei ieiVar = iei.a;
        int i2 = this.G;
        Object obj5 = this.I;
        qz7 qz7Var = this.J;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                d4c.q((hp4) obj4, (zy7) obj3, (iqb) obj5, (bz7) qz7Var, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((fu5) obj4).c((ib0) obj5, (zy7) obj3, (ta4) qz7Var, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                mwa.i(this.H, this.F, (m4a) obj5, (bz7) qz7Var, (ld4) obj, iP0);
                break;
            default:
                ((Integer) obj2).getClass();
                fd9.n((fca) obj4, (zy7) obj3, (zy7) qz7Var, (iqb) obj5, (ld4) obj, x44.p0(i2 | 1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ xo4(fca fcaVar, zy7 zy7Var, zy7 zy7Var2, iqb iqbVar, int i) {
        this.E = 3;
        this.H = fcaVar;
        this.F = zy7Var;
        this.J = zy7Var2;
        this.I = iqbVar;
        this.G = i;
    }

    public /* synthetic */ xo4(Object obj, Object obj2, Object obj3, bz7 bz7Var, int i, int i2) {
        this.E = i2;
        this.H = obj;
        this.F = obj2;
        this.I = obj3;
        this.J = bz7Var;
        this.G = i;
    }
}
