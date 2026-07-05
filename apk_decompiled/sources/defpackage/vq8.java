package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum vq8 extends hr8 {
    public vq8() {
        super("AfterFrameset", 20);
    }

    @Override // defpackage.hr8
    public final boolean d(hsh hshVar, iq8 iq8Var) {
        if (hr8.a(hshVar)) {
            iq8Var.u((yrh) hshVar, false);
            return true;
        }
        if (hshVar.a()) {
            iq8Var.w((zrh) hshVar);
            return true;
        }
        if (hshVar.b()) {
            iq8Var.k(this);
            return false;
        }
        if (hshVar.e() && ((dsh) hshVar).l().equals("html")) {
            return hr8.K.d(hshVar, iq8Var);
        }
        if (hshVar.d() && ((csh) hshVar).l().equals("html")) {
            iq8Var.l = hr8.a0;
            return true;
        }
        if (hshVar.e() && ((dsh) hshVar).l().equals("noframes")) {
            return hr8.H.d(hshVar, iq8Var);
        }
        if (hshVar.c()) {
            return true;
        }
        iq8Var.k(this);
        return false;
    }
}
