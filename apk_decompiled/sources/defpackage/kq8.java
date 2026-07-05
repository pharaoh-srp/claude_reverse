package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum kq8 extends hr8 {
    public kq8() {
        super("InCaption", 10);
    }

    @Override // defpackage.hr8
    public final boolean d(hsh hshVar, iq8 iq8Var) {
        boolean zD = hshVar.d();
        gr8 gr8Var = hr8.M;
        if (zD && ((csh) hshVar).l().equals("caption")) {
            if (!iq8Var.t("caption")) {
                iq8Var.k(this);
                return false;
            }
            iq8Var.n(false);
            if (!iq8Var.i("caption")) {
                iq8Var.k(this);
            }
            iq8Var.G("caption");
            iq8Var.c();
            iq8Var.l = gr8Var;
            return true;
        }
        if ((!hshVar.e() || !xrg.d(((dsh) hshVar).l(), kud.x)) && (!hshVar.d() || !((csh) hshVar).l().equals("table"))) {
            if (!hshVar.d() || !xrg.d(((csh) hshVar).l(), kud.I)) {
                return hr8.K.d(hshVar, iq8Var);
            }
            iq8Var.k(this);
            return false;
        }
        if (!iq8Var.t("caption")) {
            iq8Var.k(this);
            return false;
        }
        iq8Var.n(false);
        if (!iq8Var.i("caption")) {
            iq8Var.k(this);
        }
        iq8Var.G("caption");
        iq8Var.c();
        iq8Var.l = gr8Var;
        gr8Var.d(hshVar, iq8Var);
        return true;
    }
}
