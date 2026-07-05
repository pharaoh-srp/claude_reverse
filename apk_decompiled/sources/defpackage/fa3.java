package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fa3 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;

    public /* synthetic */ fa3(int i, int i2, Object obj, boolean z) {
        this.E = i2;
        this.F = z;
        this.H = obj;
        this.G = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.G;
        Object obj3 = this.H;
        boolean z = this.F;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                dgj.c(iP0, (ld4) obj, (iqb) obj3, z);
                break;
            default:
                ((Integer) obj2).getClass();
                mpk.g(z, (pz7) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
        }
        return ieiVar;
    }
}
