package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum pq8 extends hr8 {
    public pq8() {
        super("InSelect", 15);
    }

    @Override // defpackage.hr8
    public final boolean d(hsh hshVar, iq8 iq8Var) {
        String strL;
        int iF = sq6.F(hshVar.a);
        if (iF == 0) {
            iq8Var.k(this);
            return false;
        }
        br8 br8Var = hr8.H;
        if (iF == 1) {
            dsh dshVar = (dsh) hshVar;
            String strL2 = dshVar.l();
            if (strL2.equals("html")) {
                return hr8.K.d(dshVar, iq8Var);
            }
            if (strL2.equals("option")) {
                if (iq8Var.i("option")) {
                    iq8Var.J("option");
                }
                iq8Var.x(dshVar);
                return true;
            }
            if (strL2.equals("optgroup")) {
                if (iq8Var.i("option")) {
                    iq8Var.J("option");
                }
                if (iq8Var.i("optgroup")) {
                    iq8Var.J("optgroup");
                }
                iq8Var.x(dshVar);
                return true;
            }
            if (strL2.equals("select")) {
                iq8Var.k(this);
                return iq8Var.J("select");
            }
            if (!xrg.d(strL2, kud.E)) {
                if (strL2.equals("script") || strL2.equals("template")) {
                    return br8Var.d(hshVar, iq8Var);
                }
                iq8Var.k(this);
                return false;
            }
            iq8Var.k(this);
            if (!iq8Var.r("select")) {
                return false;
            }
            do {
                iq8Var.G("select");
                iq8Var.P();
            } while (iq8Var.r("select"));
            return iq8Var.I(dshVar);
        }
        if (iF != 2) {
            if (iF == 3) {
                iq8Var.w((zrh) hshVar);
                return true;
            }
            if (iF == 4) {
                iq8Var.u((yrh) hshVar, false);
                return true;
            }
            if (iF != 6) {
                iq8Var.k(this);
                return false;
            }
            if (!iq8Var.i("html")) {
                iq8Var.k(this);
            }
            return true;
        }
        strL = ((csh) hshVar).l();
        strL.getClass();
        switch (strL) {
            case "template":
                return br8Var.d(hshVar, iq8Var);
            case "option":
                if (iq8Var.i("option")) {
                    iq8Var.F();
                    return true;
                }
                iq8Var.k(this);
                return true;
            case "select":
                if (!iq8Var.r(strL)) {
                    iq8Var.k(this);
                    return false;
                }
                iq8Var.G(strL);
                iq8Var.P();
                return true;
            case "optgroup":
                if (iq8Var.i("option") && iq8Var.a(iq8Var.h()) != null && iq8Var.a(iq8Var.h()).w("optgroup")) {
                    iq8Var.J("option");
                }
                if (iq8Var.i("optgroup")) {
                    iq8Var.F();
                    return true;
                }
                iq8Var.k(this);
                return true;
            default:
                iq8Var.k(this);
                return false;
        }
    }
}
