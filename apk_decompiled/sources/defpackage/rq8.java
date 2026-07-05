package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum rq8 extends hr8 {
    public rq8() {
        super("InTemplate", 17);
    }

    @Override // defpackage.hr8
    public final boolean d(hsh hshVar, iq8 iq8Var) {
        int iF = sq6.F(hshVar.a);
        er8 er8Var = hr8.K;
        if (iF != 0) {
            br8 br8Var = hr8.H;
            if (iF == 1) {
                String strL = ((dsh) hshVar).l();
                if (xrg.d(strL, kud.J)) {
                    br8Var.d(hshVar, iq8Var);
                    return true;
                }
                if (xrg.d(strL, kud.K)) {
                    iq8Var.H();
                    gr8 gr8Var = hr8.M;
                    iq8Var.L(gr8Var);
                    iq8Var.l = gr8Var;
                    return iq8Var.I(hshVar);
                }
                if (strL.equals("col")) {
                    iq8Var.H();
                    lq8 lq8Var = hr8.P;
                    iq8Var.L(lq8Var);
                    iq8Var.l = lq8Var;
                    return iq8Var.I(hshVar);
                }
                if (strL.equals("tr")) {
                    iq8Var.H();
                    mq8 mq8Var = hr8.Q;
                    iq8Var.L(mq8Var);
                    iq8Var.l = mq8Var;
                    return iq8Var.I(hshVar);
                }
                if (!strL.equals("td") && !strL.equals("th")) {
                    iq8Var.H();
                    iq8Var.L(er8Var);
                    iq8Var.l = er8Var;
                    return iq8Var.I(hshVar);
                }
                iq8Var.H();
                nq8 nq8Var = hr8.R;
                iq8Var.L(nq8Var);
                iq8Var.l = nq8Var;
                return iq8Var.I(hshVar);
            }
            if (iF == 2) {
                if (((csh) hshVar).l().equals("template")) {
                    br8Var.d(hshVar, iq8Var);
                    return true;
                }
                iq8Var.k(this);
                return false;
            }
            if (iF != 3 && iF != 4) {
                if (iF != 6) {
                    sz6.j("Unexpected state: ".concat(fsh.D(hshVar.a)));
                    return false;
                }
                if (iq8Var.C("template")) {
                    iq8Var.k(this);
                    iq8Var.G("template");
                    iq8Var.c();
                    iq8Var.H();
                    iq8Var.P();
                    if (iq8Var.l != hr8.V && iq8Var.s.size() < 12) {
                        return iq8Var.I(hshVar);
                    }
                }
                return true;
            }
        }
        er8Var.d(hshVar, iq8Var);
        return true;
    }
}
