package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class py5 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ String G;
    public final /* synthetic */ zy7 H;
    public final /* synthetic */ zy7 I;
    public final /* synthetic */ int J;

    public /* synthetic */ py5(String str, String str2, zy7 zy7Var, zy7 zy7Var2, int i, int i2) {
        this.E = i2;
        this.F = str;
        this.G = str2;
        this.H = zy7Var;
        this.I = zy7Var2;
        this.J = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.J;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                int iP0 = x44.p0(i2 | 1);
                wwk.b(this.F, this.G, this.H, this.I, (ld4) obj, iP0);
                break;
            default:
                ((Integer) obj2).intValue();
                int iP02 = x44.p0(i2 | 1);
                wwk.a(this.F, this.G, this.H, this.I, (ld4) obj, iP02);
                break;
        }
        return ieiVar;
    }
}
