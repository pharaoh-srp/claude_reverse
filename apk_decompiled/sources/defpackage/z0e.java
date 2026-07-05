package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class z0e implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ iqb F;
    public final /* synthetic */ bz7 G;

    public /* synthetic */ z0e(bz7 bz7Var, iqb iqbVar, int i) {
        this.G = bz7Var;
        this.F = iqbVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        bz7 bz7Var = this.G;
        iqb iqbVar = this.F;
        ld4 ld4Var = (ld4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                b1e.e(x44.p0(1), ld4Var, bz7Var, iqbVar);
                break;
            default:
                nik.e(x44.p0(391), ld4Var, bz7Var, iqbVar);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ z0e(iqb iqbVar, bz7 bz7Var, int i) {
        this.F = iqbVar;
        this.G = bz7Var;
    }
}
