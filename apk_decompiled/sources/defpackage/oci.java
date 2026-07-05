package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oci extends hfd {
    public static final oci c = new oci(pci.a);

    @Override // defpackage.x0
    public final int d(Object obj) {
        return ((mci) obj).E.length;
    }

    @Override // defpackage.s44, defpackage.x0
    public final void f(ud4 ud4Var, int i, Object obj) {
        nci nciVar = (nci) obj;
        nciVar.getClass();
        nciVar.e(ud4Var.e(this.b, i).p());
    }

    @Override // defpackage.x0
    public final Object g(Object obj) {
        return new nci(((mci) obj).E);
    }

    @Override // defpackage.hfd
    public final Object j() {
        return new mci(new int[0]);
    }

    @Override // defpackage.hfd
    public final void k(vd4 vd4Var, Object obj, int i) {
        int[] iArr = ((mci) obj).E;
        vd4Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            vd4Var.C(this.b, i2).w(iArr[i2]);
        }
    }
}
