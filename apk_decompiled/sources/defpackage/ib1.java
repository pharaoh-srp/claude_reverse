package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ib1 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ zy7 G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;

    public /* synthetic */ ib1(int i, int i2, int i3, zy7 zy7Var, boolean z) {
        this.E = i3;
        this.F = z;
        this.G = zy7Var;
        this.H = i;
        this.I = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.I;
        int i3 = this.H;
        zy7 zy7Var = this.G;
        boolean z = this.F;
        ld4 ld4Var = (ld4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                nai.a(x44.p0(i3 | 1), i2, ld4Var, zy7Var, z);
                break;
            default:
                yb5.c(x44.p0(i3 | 1), i2, ld4Var, zy7Var, z);
                break;
        }
        return ieiVar;
    }
}
