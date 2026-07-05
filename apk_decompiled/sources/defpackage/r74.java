package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r74 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ sih F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ ta4 H;
    public final /* synthetic */ int I;

    public /* synthetic */ r74(sih sihVar, boolean z, ta4 ta4Var, int i, int i2) {
        this.E = i2;
        this.F = sihVar;
        this.G = z;
        this.H = ta4Var;
        this.I = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.I;
        ta4 ta4Var = this.H;
        boolean z = this.G;
        sih sihVar = this.F;
        ld4 ld4Var = (ld4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                dch.e(sihVar, z, ta4Var, ld4Var, x44.p0(i2 | 1));
                break;
            default:
                yfd.d(sihVar, z, ta4Var, ld4Var, x44.p0(i2 | 1));
                break;
        }
        return ieiVar;
    }
}
