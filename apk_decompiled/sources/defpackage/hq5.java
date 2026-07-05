package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hq5 extends pd implements bz7 {
    public final /* synthetic */ int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hq5(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.L = i3;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.L;
        iei ieiVar = iei.a;
        Object obj2 = this.E;
        switch (i) {
            case 0:
                za1 za1Var = (za1) obj;
                za1Var.getClass();
                wp5 wp5Var = (wp5) obj2;
                wp5Var.getClass();
                wa1 wa1VarF = uuj.f(wp5Var.a);
                if (wa1VarF != null) {
                    wp5Var.b = new i49(za1Var, wa1VarF);
                    wa1VarF.d(za1Var);
                }
                break;
            default:
                String str = (String) obj;
                str.getClass();
                ((qk5) obj2).getClass();
                if (kj5.b()) {
                    t78.a(kj5.a(null)).r(str, nm6.E);
                }
                break;
        }
        return ieiVar;
    }
}
