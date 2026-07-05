package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum lq8 extends hr8 {
    public lq8() {
        super("InColumnGroup", 11);
    }

    @Override // defpackage.hr8
    public final boolean d(hsh hshVar, iq8 iq8Var) {
        dsh dshVar;
        if (hr8.a(hshVar)) {
            iq8Var.u((yrh) hshVar, false);
            return true;
        }
        int iF = sq6.F(hshVar.a);
        if (iF == 0) {
            iq8Var.k(this);
            return true;
        }
        br8 br8Var = hr8.H;
        if (iF != 1) {
            if (iF != 2) {
                if (iF == 3) {
                    iq8Var.w((zrh) hshVar);
                    return true;
                }
                if (iF == 6 && iq8Var.i("html")) {
                    return true;
                }
                return e(hshVar, iq8Var);
            }
            String strL = ((csh) hshVar).l();
            strL.getClass();
            if (strL.equals("template")) {
                br8Var.d(hshVar, iq8Var);
                return true;
            }
            if (!strL.equals("colgroup")) {
                return e(hshVar, iq8Var);
            }
            if (!iq8Var.i(strL)) {
                iq8Var.k(this);
                return false;
            }
            iq8Var.F();
            iq8Var.l = hr8.M;
            return true;
        }
        dshVar = (dsh) hshVar;
        String strL2 = dshVar.l();
        strL2.getClass();
        switch (strL2) {
            case "template":
                br8Var.d(hshVar, iq8Var);
                return true;
            case "col":
                iq8Var.y(dshVar);
                return true;
            case "html":
                return hr8.K.d(hshVar, iq8Var);
            default:
                return e(hshVar, iq8Var);
        }
    }

    public final boolean e(hsh hshVar, iq8 iq8Var) {
        if (!iq8Var.i("colgroup")) {
            iq8Var.k(this);
            return false;
        }
        iq8Var.F();
        iq8Var.l = hr8.M;
        iq8Var.I(hshVar);
        return true;
    }
}
