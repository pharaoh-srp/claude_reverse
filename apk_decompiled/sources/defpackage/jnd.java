package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jnd implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ lyk F;
    public final /* synthetic */ zy7 G;

    public /* synthetic */ jnd(lyk lykVar, zy7 zy7Var, int i, int i2) {
        this.E = i2;
        this.F = lykVar;
        this.G = zy7Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        zy7 zy7Var = this.G;
        lyk lykVar = this.F;
        ld4 ld4Var = (ld4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                lykVar.b(zy7Var, ld4Var, x44.p0(49));
                break;
            default:
                lykVar.c(zy7Var, ld4Var, x44.p0(49));
                break;
        }
        return ieiVar;
    }
}
