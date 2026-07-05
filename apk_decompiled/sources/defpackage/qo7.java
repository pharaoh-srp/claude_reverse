package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qo7 extends hfd {
    public static final qo7 c = new qo7(uo7.a);

    @Override // defpackage.x0
    public final int d(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return fArr.length;
    }

    @Override // defpackage.s44, defpackage.x0
    public final void f(ud4 ud4Var, int i, Object obj) {
        ko7 ko7Var = (ko7) obj;
        ko7Var.getClass();
        ko7Var.e(ud4Var.D(this.b, i));
    }

    @Override // defpackage.x0
    public final Object g(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return new ko7(fArr);
    }

    @Override // defpackage.hfd
    public final Object j() {
        return new float[0];
    }

    @Override // defpackage.hfd
    public final void k(vd4 vd4Var, Object obj, int i) {
        float[] fArr = (float[]) obj;
        vd4Var.getClass();
        fArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            vd4Var.k(this.b, i2, fArr[i2]);
        }
    }
}
