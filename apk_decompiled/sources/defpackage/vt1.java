package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vt1 extends hfd {
    public static final vt1 c = new vt1(zt1.a);

    @Override // defpackage.x0
    public final int d(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        return zArr.length;
    }

    @Override // defpackage.s44, defpackage.x0
    public final void f(ud4 ud4Var, int i, Object obj) {
        pt1 pt1Var = (pt1) obj;
        pt1Var.getClass();
        pt1Var.e(ud4Var.u(this.b, i));
    }

    @Override // defpackage.x0
    public final Object g(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        return new pt1(zArr);
    }

    @Override // defpackage.hfd
    public final Object j() {
        return new boolean[0];
    }

    @Override // defpackage.hfd
    public final void k(vd4 vd4Var, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        vd4Var.getClass();
        zArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            vd4Var.p(this.b, i2, zArr[i2]);
        }
    }
}
