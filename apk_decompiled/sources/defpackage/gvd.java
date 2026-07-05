package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gvd implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ long F;
    public final /* synthetic */ tkh G;
    public final /* synthetic */ pz7 H;
    public final /* synthetic */ int I;

    public /* synthetic */ gvd(long j, tkh tkhVar, pz7 pz7Var, int i, int i2) {
        this.E = i2;
        this.F = j;
        this.G = tkhVar;
        this.H = pz7Var;
        this.I = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.I;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                int iP0 = x44.p0(i2 | 1);
                zh4.h(this.F, this.G, this.H, (ld4) obj, iP0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                xn5.K(this.F, this.G, this.H, (ld4) obj, iP02);
                break;
        }
        return ieiVar;
    }
}
