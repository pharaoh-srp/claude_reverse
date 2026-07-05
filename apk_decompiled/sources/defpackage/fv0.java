package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fv0 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ zy7 G;
    public final /* synthetic */ int H;

    public /* synthetic */ fv0(int i, String str, zy7 zy7Var, int i2) {
        this.E = 0;
        this.H = i;
        this.F = str;
        this.G = zy7Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.H;
        zy7 zy7Var = this.G;
        String str = this.F;
        ld4 ld4Var = (ld4) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                euk.h(i2, str, zy7Var, ld4Var, x44.p0(1));
                break;
            case 1:
                num.intValue();
                awj.a(str, zy7Var, ld4Var, x44.p0(i2 | 1));
                break;
            case 2:
                num.getClass();
                skk.a(str, zy7Var, ld4Var, x44.p0(i2 | 1));
                break;
            case 3:
                num.getClass();
                unk.f(str, zy7Var, ld4Var, x44.p0(i2 | 1));
                break;
            default:
                num.intValue();
                ktk.f(str, zy7Var, ld4Var, x44.p0(i2 | 1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ fv0(String str, zy7 zy7Var, int i, int i2) {
        this.E = i2;
        this.F = str;
        this.G = zy7Var;
        this.H = i;
    }
}
