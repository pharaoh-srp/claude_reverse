package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum mq8 extends hr8 {
    public mq8() {
        super("InTableBody", 12);
    }

    @Override // defpackage.hr8
    public final boolean d(hsh hshVar, iq8 iq8Var) {
        int iF = sq6.F(hshVar.a);
        gr8 gr8Var = hr8.M;
        if (iF == 1) {
            dsh dshVar = (dsh) hshVar;
            String strL = dshVar.l();
            if (strL.equals("tr")) {
                iq8Var.d("tbody", "tfoot", "thead", "template");
                iq8Var.x(dshVar);
                iq8Var.l = hr8.R;
                return true;
            }
            if (!xrg.d(strL, kud.u)) {
                return xrg.d(strL, kud.A) ? e(hshVar, iq8Var) : gr8Var.d(hshVar, iq8Var);
            }
            iq8Var.k(this);
            iq8Var.K("tr");
            return iq8Var.I(dshVar);
        }
        if (iF != 2) {
            return gr8Var.d(hshVar, iq8Var);
        }
        String strL2 = ((csh) hshVar).l();
        if (!xrg.d(strL2, kud.G)) {
            if (strL2.equals("table")) {
                return e(hshVar, iq8Var);
            }
            if (!xrg.d(strL2, kud.B)) {
                return gr8Var.d(hshVar, iq8Var);
            }
            iq8Var.k(this);
            return false;
        }
        if (!iq8Var.t(strL2)) {
            iq8Var.k(this);
            return false;
        }
        iq8Var.d("tbody", "tfoot", "thead", "template");
        iq8Var.F();
        iq8Var.l = gr8Var;
        return true;
    }

    public final boolean e(hsh hshVar, iq8 iq8Var) {
        if (!iq8Var.t("tbody") && !iq8Var.t("thead") && !iq8Var.q("tfoot")) {
            iq8Var.k(this);
            return false;
        }
        iq8Var.d("tbody", "tfoot", "thead", "template");
        iq8Var.J(iq8Var.h().H.G);
        return iq8Var.I(hshVar);
    }
}
