package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ns8 extends os8 {
    public final x82 d;

    public ns8(nd5 nd5Var, t82 t82Var, br4 br4Var, x82 x82Var) {
        super(nd5Var, t82Var, br4Var);
        this.d = x82Var;
    }

    @Override // defpackage.os8
    public final Object a(fdc fdcVar, Object[] objArr) {
        u82 u82Var = (u82) this.d.i(fdcVar);
        tp4 tp4Var = (tp4) objArr[objArr.length - 1];
        try {
            ua2 ua2Var = new ua2(1, zni.I(tp4Var));
            ua2Var.t();
            ua2Var.w(new qr9(u82Var, 1));
            u82Var.e(new bt4(ua2Var));
            return ua2Var.r();
        } catch (Exception e) {
            d4c.m0(e, tp4Var);
            return m45.E;
        }
    }
}
