package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nb1 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public /* synthetic */ nb1(int i, int i2, iqb iqbVar, String str, boolean z) {
        this.E = 2;
        this.H = str;
        this.I = iqbVar;
        this.G = i;
        this.F = z;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        int i2 = this.G;
        boolean z = this.F;
        iei ieiVar = iei.a;
        Object obj3 = this.I;
        Object obj4 = this.H;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                dgj.a(iP0, (ld4) obj, (zy7) obj4, (iqb) obj3, z);
                break;
            case 1:
                ((Integer) obj2).getClass();
                csg.c(z, (String) obj4, (ta4) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            default:
                ld4 ld4Var = (ld4) obj;
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(1);
                int i3 = this.G;
                zh4.g(i3, iP02, ld4Var, (iqb) obj3, (String) obj4, this.F);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ nb1(boolean z, Object obj, Object obj2, int i, int i2) {
        this.E = i2;
        this.F = z;
        this.H = obj;
        this.I = obj2;
        this.G = i;
    }
}
