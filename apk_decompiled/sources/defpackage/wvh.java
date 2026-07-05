package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wvh implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ rvh F;
    public final /* synthetic */ i4g G;
    public final /* synthetic */ int H;

    public /* synthetic */ wvh(rvh rvhVar, i4g i4gVar, int i, int i2) {
        this.E = i2;
        this.F = rvhVar;
        this.G = i4gVar;
        this.H = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.H;
        i4g i4gVar = this.G;
        rvh rvhVar = this.F;
        ld4 ld4Var = (ld4) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                ktk.g(rvhVar, i4gVar, ld4Var, x44.p0(i2 | 1));
                break;
            default:
                ktk.n(rvhVar, i4gVar, ld4Var, x44.p0(i2 | 1));
                break;
        }
        return ieiVar;
    }
}
