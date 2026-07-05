package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e23 implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ zy7 G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;
    public final /* synthetic */ Object J;

    public /* synthetic */ e23(int i, int i2, zy7 zy7Var, iqb iqbVar, boolean z) {
        this.F = z;
        this.J = iqbVar;
        this.G = zy7Var;
        this.H = i;
        this.I = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj3 = this.J;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                int iP0 = x44.p0(this.I | 1);
                z23.b(this.F, (x0a) obj3, this.H, this.G, (ld4) obj, iP0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(this.H | 1);
                int i2 = this.I;
                yb5.d(iP02, i2, (ld4) obj, this.G, (iqb) obj3, this.F);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ e23(boolean z, x0a x0aVar, int i, zy7 zy7Var, int i2) {
        this.F = z;
        this.J = x0aVar;
        this.H = i;
        this.G = zy7Var;
        this.I = i2;
    }
}
