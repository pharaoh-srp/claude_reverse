package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ja3 implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ float F;
    public final /* synthetic */ iqb G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ qz7 J;

    public /* synthetic */ ja3(ta4 ta4Var, ta4 ta4Var2, ta4 ta4Var3, iqb iqbVar, float f, int i) {
        this.H = ta4Var;
        this.I = ta4Var2;
        this.J = ta4Var3;
        this.G = iqbVar;
        this.F = f;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        qz7 qz7Var = this.J;
        Object obj3 = this.I;
        Object obj4 = this.H;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(439);
                fd9.b((ta4) obj4, (ta4) obj3, (ta4) qz7Var, this.G, this.F, (ld4) obj, iP0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(1);
                csg.h((zxa) obj4, (fj0) obj3, this.F, (zy7) qz7Var, this.G, (ld4) obj, iP02);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ ja3(zxa zxaVar, fj0 fj0Var, float f, zy7 zy7Var, iqb iqbVar, int i) {
        this.H = zxaVar;
        this.I = fj0Var;
        this.F = f;
        this.J = zy7Var;
        this.G = iqbVar;
    }
}
