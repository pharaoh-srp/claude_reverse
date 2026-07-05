package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ze1 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ cte F;
    public final /* synthetic */ jz0 G;
    public final /* synthetic */ int H;

    public /* synthetic */ ze1(cte cteVar, jz0 jz0Var, int i, int i2) {
        this.E = i2;
        this.F = cteVar;
        this.G = jz0Var;
        this.H = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.H;
        jz0 jz0Var = this.G;
        cte cteVar = this.F;
        ld4 ld4Var = (ld4) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.intValue();
                wvk.b(cteVar, jz0Var, ld4Var, x44.p0(i2 | 1));
                break;
            case 1:
                num.intValue();
                wvk.b(cteVar, jz0Var, ld4Var, x44.p0(i2 | 1));
                break;
            case 2:
                num.intValue();
                wvk.o(cteVar, jz0Var, ld4Var, x44.p0(i2 | 1));
                break;
            default:
                num.getClass();
                pmk.d(cteVar, jz0Var, ld4Var, x44.p0(i2 | 1));
                break;
        }
        return ieiVar;
    }
}
