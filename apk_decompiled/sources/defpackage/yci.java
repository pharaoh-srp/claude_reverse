package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yci extends hfd {
    public static final yci c = new yci(zci.a);

    @Override // defpackage.x0
    public final int d(Object obj) {
        return ((wci) obj).E.length;
    }

    @Override // defpackage.s44, defpackage.x0
    public final void f(ud4 ud4Var, int i, Object obj) {
        xci xciVar = (xci) obj;
        xciVar.getClass();
        xciVar.e(ud4Var.e(this.b, i).B());
    }

    @Override // defpackage.x0
    public final Object g(Object obj) {
        return new xci(((wci) obj).E);
    }

    @Override // defpackage.hfd
    public final Object j() {
        return new wci(new short[0]);
    }

    @Override // defpackage.hfd
    public final void k(vd4 vd4Var, Object obj, int i) {
        short[] sArr = ((wci) obj).E;
        vd4Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            vd4Var.C(this.b, i2).g(sArr[i2]);
        }
    }
}
