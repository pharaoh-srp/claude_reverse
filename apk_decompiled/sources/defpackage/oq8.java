package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum oq8 extends hr8 {
    public oq8() {
        super("InCell", 14);
    }

    @Override // defpackage.hr8
    public final boolean d(hsh hshVar, iq8 iq8Var) {
        boolean zD = hshVar.d();
        er8 er8Var = hr8.K;
        if (!zD) {
            if (!hshVar.e() || !xrg.d(((dsh) hshVar).l(), kud.x)) {
                return er8Var.d(hshVar, iq8Var);
            }
            if (!iq8Var.t("td") && !iq8Var.t("th")) {
                iq8Var.k(this);
                return false;
            }
            if (iq8Var.t("td")) {
                iq8Var.J("td");
            } else {
                iq8Var.J("th");
            }
            return iq8Var.I(hshVar);
        }
        String strL = ((csh) hshVar).l();
        if (!xrg.d(strL, kud.u)) {
            if (xrg.d(strL, kud.v)) {
                iq8Var.k(this);
                return false;
            }
            if (!xrg.d(strL, kud.w)) {
                return er8Var.d(hshVar, iq8Var);
            }
            if (!iq8Var.t(strL)) {
                iq8Var.k(this);
                return false;
            }
            if (iq8Var.t("td")) {
                iq8Var.J("td");
            } else {
                iq8Var.J("th");
            }
            return iq8Var.I(hshVar);
        }
        boolean zT = iq8Var.t(strL);
        nq8 nq8Var = hr8.R;
        if (!zT) {
            iq8Var.k(this);
            iq8Var.l = nq8Var;
            return false;
        }
        iq8Var.n(false);
        if (!iq8Var.i(strL)) {
            iq8Var.k(this);
        }
        iq8Var.G(strL);
        iq8Var.c();
        iq8Var.l = nq8Var;
        return true;
    }
}
