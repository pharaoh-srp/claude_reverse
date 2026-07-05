package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eg1 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ dkh F;

    public /* synthetic */ eg1(dkh dkhVar, int i) {
        this.E = i;
        this.F = dkhVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        int i2 = 2;
        dkh dkhVar = this.F;
        switch (i) {
            case 0:
                return Boolean.valueOf(dkhVar != null ? ((Boolean) new eg1(dkhVar, i2).a()).booleanValue() : false);
            case 1:
                return Boolean.valueOf(dkhVar != null ? ((Boolean) new eg1(dkhVar, i2).a()).booleanValue() : false);
            default:
                zb0 zb0Var = dkhVar.b;
                yjh yjhVar = (yjh) dkhVar.a.getValue();
                return Boolean.valueOf(x44.r(zb0Var, yjhVar != null ? yjhVar.a.a : null));
        }
    }
}
