package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tci extends hfd {
    public static final tci c = new tci(uci.a);

    @Override // defpackage.x0
    public final int d(Object obj) {
        return ((rci) obj).E.length;
    }

    @Override // defpackage.s44, defpackage.x0
    public final void f(ud4 ud4Var, int i, Object obj) {
        sci sciVar = (sci) obj;
        sciVar.getClass();
        sciVar.e(ud4Var.e(this.b, i).t());
    }

    @Override // defpackage.x0
    public final Object g(Object obj) {
        return new sci(((rci) obj).E);
    }

    @Override // defpackage.hfd
    public final Object j() {
        return new rci(new long[0]);
    }

    @Override // defpackage.hfd
    public final void k(vd4 vd4Var, Object obj, int i) {
        long[] jArr = ((rci) obj).E;
        vd4Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            vd4Var.C(this.b, i2).A(jArr[i2]);
        }
    }
}
