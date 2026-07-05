package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lw0 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ zy7 G;
    public final /* synthetic */ int H;

    public /* synthetic */ lw0(zy7 zy7Var, boolean z, int i) {
        this.E = 2;
        this.G = zy7Var;
        this.F = z;
        this.H = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        zy7 zy7Var = this.G;
        boolean z = this.F;
        int i2 = this.H;
        ld4 ld4Var = (ld4) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.intValue();
                huk.a(x44.p0(i2 | 1), ld4Var, zy7Var, z);
                break;
            case 1:
                num.getClass();
                zni.a(x44.p0(i2 | 1), ld4Var, zy7Var, z);
                break;
            case 2:
                num.getClass();
                ev2.i(x44.p0(i2 | 1), ld4Var, zy7Var, z);
                break;
            case 3:
                num.getClass();
                prk.h(x44.p0(i2 | 1), ld4Var, zy7Var, z);
                break;
            case 4:
                num.getClass();
                kmb.a(i2, x44.p0(385), ld4Var, zy7Var, z);
                break;
            default:
                num.getClass();
                p5h.f(i2, x44.p0(1), ld4Var, zy7Var, z);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ lw0(int i, int i2, int i3, zy7 zy7Var, boolean z) {
        this.E = i3;
        this.H = i;
        this.F = z;
        this.G = zy7Var;
    }

    public /* synthetic */ lw0(boolean z, zy7 zy7Var, int i, int i2) {
        this.E = i2;
        this.F = z;
        this.G = zy7Var;
        this.H = i;
    }
}
