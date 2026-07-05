package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wi2 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ double F;
    public final /* synthetic */ bae G;
    public final /* synthetic */ int H;
    public final /* synthetic */ Object I;

    public /* synthetic */ wi2(Object obj, double d, bae baeVar, int i, int i2) {
        this.E = i2;
        this.I = obj;
        this.F = d;
        this.G = baeVar;
        this.H = i;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        double d;
        int i;
        int i2 = this.E;
        int i3 = this.H;
        bae baeVar = this.G;
        double d2 = this.F;
        xi2 xi2Var = (xi2) this.I;
        double dDoubleValue = ((Double) obj).doubleValue();
        switch (i2) {
            case 0:
                d = ((((dDoubleValue - xi2Var.b) / d2) - xi2Var.a) * 2.0E-5d) / d2;
                i = baeVar.E;
                break;
            default:
                d = ((((dDoubleValue - xi2Var.b) / d2) - xi2Var.a) * 2.0E-5d) / d2;
                i = baeVar.E;
                break;
        }
        return Double.valueOf((1.0d / (((double) i3) - dDoubleValue)) + (d - (1.0d / (dDoubleValue - ((double) i)))));
    }
}
