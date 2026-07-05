package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hi2 extends hfd {
    public static final hi2 c = new hi2(si2.a);

    @Override // defpackage.x0
    public final int d(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return cArr.length;
    }

    @Override // defpackage.s44, defpackage.x0
    public final void f(ud4 ud4Var, int i, Object obj) {
        ei2 ei2Var = (ei2) obj;
        ei2Var.getClass();
        ei2Var.e(ud4Var.k(this.b, i));
    }

    @Override // defpackage.x0
    public final Object g(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return new ei2(cArr);
    }

    @Override // defpackage.hfd
    public final Object j() {
        return new char[0];
    }

    @Override // defpackage.hfd
    public final void k(vd4 vd4Var, Object obj, int i) {
        char[] cArr = (char[]) obj;
        vd4Var.getClass();
        cArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            vd4Var.v(this.b, i2, cArr[i2]);
        }
    }
}
