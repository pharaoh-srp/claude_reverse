package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lid implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ iqb F;
    public final /* synthetic */ boolean G;

    public /* synthetic */ lid(int i, iqb iqbVar, boolean z) {
        this.E = 1;
        this.F = iqbVar;
        this.G = z;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        iqb iqbVar = this.F;
        boolean z = this.G;
        ld4 ld4Var = (ld4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ywj.c(x44.p0(1), ld4Var, iqbVar, z);
                break;
            case 1:
                wsk.a(x44.p0(7), ld4Var, iqbVar, z);
                break;
            default:
                vjk.c(x44.p0(1), ld4Var, iqbVar, z);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ lid(boolean z, iqb iqbVar, int i, int i2) {
        this.E = i2;
        this.G = z;
        this.F = iqbVar;
    }
}
