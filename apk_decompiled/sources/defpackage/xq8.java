package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum xq8 extends hr8 {
    public xq8() {
        super("AfterAfterFrameset", 22);
    }

    @Override // defpackage.hr8
    public final boolean d(hsh hshVar, iq8 iq8Var) {
        if (hshVar.a()) {
            iq8Var.w((zrh) hshVar);
            return true;
        }
        if (hshVar.b() || hr8.a(hshVar) || (hshVar.e() && ((dsh) hshVar).l().equals("html"))) {
            return hr8.K.d(hshVar, iq8Var);
        }
        if (hshVar.c()) {
            return true;
        }
        if (hshVar.e() && ((dsh) hshVar).l().equals("noframes")) {
            return hr8.H.d(hshVar, iq8Var);
        }
        iq8Var.k(this);
        return false;
    }
}
