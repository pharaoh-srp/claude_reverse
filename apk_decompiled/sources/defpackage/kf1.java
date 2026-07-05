package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kf1 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ sih F;

    public /* synthetic */ kf1(sih sihVar, int i, int i2) {
        this.E = i2;
        this.F = sihVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        sih sihVar = this.F;
        ld4 ld4Var = (ld4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                bg1.f(sihVar, ld4Var, x44.p0(1));
                break;
            default:
                bg1.e(sihVar, ld4Var, x44.p0(1));
                break;
        }
        return ieiVar;
    }
}
