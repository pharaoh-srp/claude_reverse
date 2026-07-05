package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vp implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ zy7 F;
    public final /* synthetic */ iqb G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;

    public /* synthetic */ vp(int i, int i2, int i3, zy7 zy7Var, iqb iqbVar) {
        this.E = i3;
        this.F = zy7Var;
        this.G = iqbVar;
        this.H = i;
        this.I = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        int i2 = this.I;
        int i3 = this.H;
        iqb iqbVar = this.G;
        zy7 zy7Var = this.F;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                wp.b(x44.p0(i3 | 1), i2, (ld4) obj, zy7Var, iqbVar);
                break;
            case 1:
                ((Integer) obj2).getClass();
                es1.e(x44.p0(i3 | 1), i2, (ld4) obj, zy7Var, iqbVar);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(1);
                tw8.d(this.H, this.I, this.F, this.G, (ld4) obj, iP0);
                break;
            case 3:
                ((Integer) obj2).getClass();
                lsk.b(x44.p0(i3 | 1), i2, (ld4) obj, zy7Var, iqbVar);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(385);
                x41.e(this.H, this.I, this.F, this.G, (ld4) obj, iP02);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ vp(int i, int i2, zy7 zy7Var, iqb iqbVar, int i3, int i4) {
        this.E = i4;
        this.H = i;
        this.I = i2;
        this.F = zy7Var;
        this.G = iqbVar;
    }
}
