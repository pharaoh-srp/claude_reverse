package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum nq8 extends hr8 {
    public nq8() {
        super("InRow", 13);
    }

    @Override // defpackage.hr8
    public final boolean d(hsh hshVar, iq8 iq8Var) {
        boolean zE = hshVar.e();
        gr8 gr8Var = hr8.M;
        mq8 mq8Var = hr8.Q;
        if (zE) {
            dsh dshVar = (dsh) hshVar;
            String strL = dshVar.l();
            if (xrg.d(strL, kud.u)) {
                iq8Var.f();
                iq8Var.x(dshVar);
                iq8Var.l = hr8.S;
                iq8Var.r.add(null);
                return true;
            }
            if (!xrg.d(strL, kud.C)) {
                return gr8Var.d(hshVar, iq8Var);
            }
            if (!iq8Var.t("tr")) {
                iq8Var.k(this);
                return false;
            }
            iq8Var.f();
            iq8Var.F();
            iq8Var.l = mq8Var;
            return iq8Var.I(hshVar);
        }
        if (!hshVar.d()) {
            return gr8Var.d(hshVar, iq8Var);
        }
        String strL2 = ((csh) hshVar).l();
        if (strL2.equals("tr")) {
            if (!iq8Var.t(strL2)) {
                iq8Var.k(this);
                return false;
            }
            iq8Var.f();
            iq8Var.F();
            iq8Var.l = mq8Var;
            return true;
        }
        if (strL2.equals("table")) {
            if (!iq8Var.t("tr")) {
                iq8Var.k(this);
                return false;
            }
            iq8Var.f();
            iq8Var.F();
            iq8Var.l = mq8Var;
            return iq8Var.I(hshVar);
        }
        if (!xrg.d(strL2, kud.r)) {
            if (!xrg.d(strL2, kud.D)) {
                return gr8Var.d(hshVar, iq8Var);
            }
            iq8Var.k(this);
            return false;
        }
        if (!iq8Var.t(strL2)) {
            iq8Var.k(this);
            return false;
        }
        if (!iq8Var.t("tr")) {
            return false;
        }
        iq8Var.f();
        iq8Var.F();
        iq8Var.l = mq8Var;
        return iq8Var.I(hshVar);
    }
}
