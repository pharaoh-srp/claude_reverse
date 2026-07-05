package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class knd implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ lyk F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ zy7 H;

    public /* synthetic */ knd(lyk lykVar, boolean z, zy7 zy7Var, int i, int i2) {
        this.E = i2;
        this.F = lykVar;
        this.G = z;
        this.H = zy7Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        zy7 zy7Var = this.H;
        boolean z = this.G;
        lyk lykVar = this.F;
        ld4 ld4Var = (ld4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                lykVar.e(x44.p0(385), ld4Var, zy7Var, z);
                break;
            default:
                lykVar.a(x44.p0(385), ld4Var, zy7Var, z);
                break;
        }
        return ieiVar;
    }
}
