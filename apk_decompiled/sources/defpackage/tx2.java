package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tx2 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ iqb F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;

    public /* synthetic */ tx2(iqb iqbVar, boolean z, int i, int i2, int i3) {
        this.E = i3;
        this.F = iqbVar;
        this.G = z;
        this.H = i;
        this.I = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.I;
        int i3 = this.H;
        boolean z = this.G;
        iqb iqbVar = this.F;
        ld4 ld4Var = (ld4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                uik.a(iqbVar, z, ld4Var, x44.p0(i3 | 1), i2);
                break;
            case 1:
                flk.a(iqbVar, z, ld4Var, x44.p0(i3 | 1), i2);
                break;
            default:
                flk.a(iqbVar, z, ld4Var, x44.p0(i3 | 1), i2);
                break;
        }
        return ieiVar;
    }
}
