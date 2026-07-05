package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ici extends hfd {
    public static final ici c = new ici(jci.a);

    @Override // defpackage.x0
    public final int d(Object obj) {
        return ((gci) obj).E.length;
    }

    @Override // defpackage.s44, defpackage.x0
    public final void f(ud4 ud4Var, int i, Object obj) {
        hci hciVar = (hci) obj;
        hciVar.getClass();
        hciVar.e(ud4Var.e(this.b, i).A());
    }

    @Override // defpackage.x0
    public final Object g(Object obj) {
        return new hci(((gci) obj).E);
    }

    @Override // defpackage.hfd
    public final Object j() {
        return new gci(new byte[0]);
    }

    @Override // defpackage.hfd
    public final void k(vd4 vd4Var, Object obj, int i) {
        byte[] bArr = ((gci) obj).E;
        vd4Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            vd4Var.C(this.b, i2).i(bArr[i2]);
        }
    }
}
