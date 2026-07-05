package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ia6 extends hfd {
    public static final ia6 c = new ia6(na6.a);

    @Override // defpackage.x0
    public final int d(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        return dArr.length;
    }

    @Override // defpackage.s44, defpackage.x0
    public final void f(ud4 ud4Var, int i, Object obj) {
        ca6 ca6Var = (ca6) obj;
        ca6Var.getClass();
        ca6Var.e(ud4Var.z(this.b, i));
    }

    @Override // defpackage.x0
    public final Object g(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        return new ca6(dArr);
    }

    @Override // defpackage.hfd
    public final Object j() {
        return new double[0];
    }

    @Override // defpackage.hfd
    public final void k(vd4 vd4Var, Object obj, int i) {
        double[] dArr = (double[]) obj;
        vd4Var.getClass();
        dArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            vd4Var.z(this.b, i2, dArr[i2]);
        }
    }
}
