package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x16 implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ zy7 F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ String H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;

    public /* synthetic */ x16(zy7 zy7Var, String str, boolean z, int i, int i2) {
        this.F = zy7Var;
        this.H = str;
        this.G = z;
        this.I = i;
        this.J = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.I;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                oe5.a(x44.p0(i2 | 1), this.J, (ld4) obj, this.F, this.H, this.G);
                break;
            default:
                ((Integer) obj2).getClass();
                trk.a(x44.p0(i2 | 1), this.J, (ld4) obj, this.F, this.H, this.G);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ x16(zy7 zy7Var, boolean z, String str, int i, int i2) {
        this.F = zy7Var;
        this.G = z;
        this.H = str;
        this.I = i;
        this.J = i2;
    }
}
