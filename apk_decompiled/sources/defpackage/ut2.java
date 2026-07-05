package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ut2 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ hw2 F;

    public /* synthetic */ ut2(hw2 hw2Var, int i) {
        this.E = i;
        this.F = hw2Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        hw2 hw2Var = this.F;
        switch (i) {
            case 0:
                hw2Var.m0(false);
                return ieiVar;
            case 1:
                return Boolean.valueOf(hw2Var.D.d().G.length() == 0);
            case 2:
                return Boolean.valueOf(bsg.I0(hw2Var.D.d().G));
            case 3:
                sn8 sn8VarZ = hw2Var.Z();
                if (sn8VarZ != null && sn8VarZ.a() == null) {
                    sn8VarZ.d.setValue(qn8.F);
                }
                return ieiVar;
            default:
                Boolean bool = (Boolean) hw2Var.f.m.getValue();
                bool.booleanValue();
                return bool;
        }
    }
}
