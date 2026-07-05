package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fka extends hfd {
    public static final fka c = new fka(xka.a);

    @Override // defpackage.x0
    public final int d(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        return jArr.length;
    }

    @Override // defpackage.s44, defpackage.x0
    public final void f(ud4 ud4Var, int i, Object obj) {
        zja zjaVar = (zja) obj;
        zjaVar.getClass();
        zjaVar.e(ud4Var.j(this.b, i));
    }

    @Override // defpackage.x0
    public final Object g(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        return new zja(jArr);
    }

    @Override // defpackage.hfd
    public final Object j() {
        return new long[0];
    }

    @Override // defpackage.hfd
    public final void k(vd4 vd4Var, Object obj, int i) {
        long[] jArr = (long[]) obj;
        vd4Var.getClass();
        jArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            vd4Var.D(this.b, i2, jArr[i2]);
        }
    }
}
