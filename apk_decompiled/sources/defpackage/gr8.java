package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum gr8 extends hr8 {
    public gr8() {
        super("InTable", 8);
    }

    @Override // defpackage.hr8
    public final boolean d(hsh hshVar, iq8 iq8Var) {
        if (hshVar.a == 5 && xrg.d(iq8Var.h().H.G, kud.z)) {
            iq8Var.t.clear();
            iq8Var.m = iq8Var.l;
            iq8Var.l = hr8.N;
            return iq8Var.I(hshVar);
        }
        if (hshVar.a()) {
            iq8Var.w((zrh) hshVar);
            return true;
        }
        if (hshVar.b()) {
            iq8Var.k(this);
            return false;
        }
        boolean zE = hshVar.e();
        br8 br8Var = hr8.H;
        if (!zE) {
            if (!hshVar.d()) {
                if (!hshVar.c()) {
                    e(hshVar, iq8Var);
                    return true;
                }
                if (iq8Var.i("html")) {
                    iq8Var.k(this);
                }
                return true;
            }
            String strL = ((csh) hshVar).l();
            if (strL.equals("table")) {
                if (!iq8Var.t(strL)) {
                    iq8Var.k(this);
                    return false;
                }
                iq8Var.G("table");
                iq8Var.P();
                return true;
            }
            if (xrg.d(strL, kud.y)) {
                iq8Var.k(this);
                return false;
            }
            if (strL.equals("template")) {
                br8Var.d(hshVar, iq8Var);
                return true;
            }
            e(hshVar, iq8Var);
            return true;
        }
        dsh dshVar = (dsh) hshVar;
        String strL2 = dshVar.l();
        if (strL2.equals("caption")) {
            iq8Var.e();
            iq8Var.r.add(null);
            iq8Var.x(dshVar);
            iq8Var.l = hr8.O;
            return true;
        }
        if (strL2.equals("colgroup")) {
            iq8Var.e();
            iq8Var.x(dshVar);
            iq8Var.l = hr8.P;
            return true;
        }
        if (strL2.equals("col")) {
            iq8Var.e();
            iq8Var.K("colgroup");
            return iq8Var.I(hshVar);
        }
        if (xrg.d(strL2, kud.r)) {
            iq8Var.e();
            iq8Var.x(dshVar);
            iq8Var.l = hr8.Q;
            return true;
        }
        if (xrg.d(strL2, kud.s)) {
            iq8Var.e();
            iq8Var.K("tbody");
            return iq8Var.I(hshVar);
        }
        if (strL2.equals("table")) {
            iq8Var.k(this);
            if (iq8Var.t(strL2)) {
                iq8Var.G(strL2);
                if (iq8Var.P()) {
                    return iq8Var.I(hshVar);
                }
                iq8Var.x(dshVar);
                return true;
            }
        } else {
            if (xrg.d(strL2, kud.t)) {
                return br8Var.d(hshVar, iq8Var);
            }
            if (strL2.equals("input")) {
                n31 n31Var = dshVar.g;
                if (n31Var == null || !n31Var.l("type").equalsIgnoreCase("hidden")) {
                    e(hshVar, iq8Var);
                    return true;
                }
                iq8Var.y(dshVar);
                return true;
            }
            if (!strL2.equals("form")) {
                e(hshVar, iq8Var);
                return true;
            }
            iq8Var.k(this);
            if (iq8Var.p == null && !iq8Var.C("template")) {
                iq8Var.A(dshVar, false, false);
                return true;
            }
        }
        return false;
    }

    public final void e(hsh hshVar, iq8 iq8Var) {
        iq8Var.k(this);
        iq8Var.w = true;
        hr8.K.d(hshVar, iq8Var);
        iq8Var.w = false;
    }
}
