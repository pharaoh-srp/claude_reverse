package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bv0 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ zy7 H;
    public final /* synthetic */ int I;

    public /* synthetic */ bv0(boolean z, boolean z2, zy7 zy7Var, int i, int i2) {
        this.E = i2;
        this.F = z;
        this.G = z2;
        this.H = zy7Var;
        this.I = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.I;
        zy7 zy7Var = this.H;
        boolean z = this.G;
        boolean z2 = this.F;
        ld4 ld4Var = (ld4) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.intValue();
                euk.g(z2, z, zy7Var, ld4Var, x44.p0(i2 | 1));
                break;
            default:
                num.getClass();
                ev2.h(z2, z, zy7Var, ld4Var, x44.p0(i2 | 1));
                break;
        }
        return ieiVar;
    }
}
