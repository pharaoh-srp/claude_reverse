package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qgc extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ jt7 G;
    public final /* synthetic */ jt7 H;
    public final /* synthetic */ int I;
    public final /* synthetic */ j70 J;
    public final /* synthetic */ Object K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qgc(jt7 jt7Var, jt7 jt7Var2, Object obj, int i, j70 j70Var, int i2) {
        super(1);
        this.F = i2;
        this.G = jt7Var;
        this.H = jt7Var2;
        this.K = obj;
        this.I = i;
        this.J = j70Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.F;
        j70 j70Var = this.J;
        int i2 = this.I;
        Object obj2 = this.K;
        jt7 jt7Var = this.H;
        jt7 jt7Var2 = this.G;
        switch (i) {
            case 0:
                ro1 ro1Var = (ro1) obj;
                if (jt7Var2 != ((ts7) yfd.X(jt7Var).getFocusOwner()).h()) {
                    return Boolean.TRUE;
                }
                boolean zJ = qvk.j(jt7Var, (jt7) obj2, i2, j70Var);
                Boolean boolValueOf = Boolean.valueOf(zJ);
                if (zJ || !ro1Var.a()) {
                    return boolValueOf;
                }
                return null;
            default:
                ro1 ro1Var2 = (ro1) obj;
                if (jt7Var2 != ((ts7) yfd.X(jt7Var).getFocusOwner()).h()) {
                    return Boolean.TRUE;
                }
                boolean zU = nvk.u(i2, j70Var, jt7Var, (l9e) obj2);
                Boolean boolValueOf2 = Boolean.valueOf(zU);
                if (zU || !ro1Var2.a()) {
                    return boolValueOf2;
                }
                return null;
        }
    }
}
