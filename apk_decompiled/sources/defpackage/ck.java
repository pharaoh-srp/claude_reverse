package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ck implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ml3 F;
    public final /* synthetic */ zy7 G;
    public final /* synthetic */ bz7 H;
    public final /* synthetic */ iqb I;

    public /* synthetic */ ck(ml3 ml3Var, zy7 zy7Var, bz7 bz7Var, iqb iqbVar, int i, int i2) {
        this.E = i2;
        this.F = ml3Var;
        this.G = zy7Var;
        this.H = bz7Var;
        this.I = iqbVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(1);
                ek.a(this.F, this.G, this.H, this.I, (ld4) obj, iP0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(1);
                ek.b(this.F, this.G, this.H, this.I, (ld4) obj, iP02);
                break;
        }
        return ieiVar;
    }
}
