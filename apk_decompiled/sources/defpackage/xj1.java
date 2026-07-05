package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xj1 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ fn1 F;

    public /* synthetic */ xj1(fn1 fn1Var, int i) {
        this.E = i;
        this.F = fn1Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        fn1 fn1Var = this.F;
        switch (i) {
            case 0:
                if (fn1Var != null) {
                    ((tn1) fn1Var).O();
                }
                break;
            case 1:
                if (fn1Var != null) {
                    ((tn1) fn1Var).g();
                }
                break;
            case 2:
                if (fn1Var != null) {
                    ((tn1) fn1Var).O();
                }
                break;
            case 3:
                Boolean bool = (Boolean) ((tn1) fn1Var).T.getValue();
                bool.booleanValue();
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                Boolean bool2 = (Boolean) ((tn1) fn1Var).T.getValue();
                bool2.booleanValue();
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                int iOrdinal = ((tn1) fn1Var).o().ordinal();
                break;
            case 10:
                if (fn1Var != null) {
                    ((tn1) fn1Var).O();
                }
                break;
            default:
                ((tn1) fn1Var).I();
                break;
        }
        return ieiVar;
    }
}
