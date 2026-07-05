package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q69 extends hfd {
    public static final q69 c = new q69(e79.a);

    @Override // defpackage.x0
    public final int d(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return iArr.length;
    }

    @Override // defpackage.s44, defpackage.x0
    public final void f(ud4 ud4Var, int i, Object obj) {
        k69 k69Var = (k69) obj;
        k69Var.getClass();
        k69Var.e(ud4Var.r(this.b, i));
    }

    @Override // defpackage.x0
    public final Object g(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return new k69(iArr);
    }

    @Override // defpackage.hfd
    public final Object j() {
        return new int[0];
    }

    @Override // defpackage.hfd
    public final void k(vd4 vd4Var, Object obj, int i) {
        int[] iArr = (int[]) obj;
        vd4Var.getClass();
        iArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            vd4Var.l(i2, iArr[i2], this.b);
        }
    }
}
