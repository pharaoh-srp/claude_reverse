package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum br8 extends hr8 {
    public br8() {
        super("InHead", 3);
    }

    @Override // defpackage.hr8
    public final boolean d(hsh hshVar, iq8 iq8Var) {
        if (hr8.a(hshVar)) {
            iq8Var.u((yrh) hshVar, false);
            return true;
        }
        int iF = sq6.F(hshVar.a);
        if (iF == 0) {
            iq8Var.k(this);
            return false;
        }
        if (iF != 1) {
            if (iF != 2) {
                if (iF != 3) {
                    iq8Var.J("head");
                    return iq8Var.I(hshVar);
                }
                iq8Var.w((zrh) hshVar);
                return true;
            }
            String strL = ((csh) hshVar).l();
            if (strL.equals("head")) {
                iq8Var.F();
                iq8Var.l = hr8.J;
                return true;
            }
            if (xrg.d(strL, kud.c)) {
                iq8Var.J("head");
                return iq8Var.I(hshVar);
            }
            if (!strL.equals("template")) {
                iq8Var.k(this);
                return false;
            }
            if (!iq8Var.C(strL)) {
                iq8Var.k(this);
                return true;
            }
            iq8Var.n(true);
            if (!iq8Var.i(strL)) {
                iq8Var.k(this);
            }
            iq8Var.G(strL);
            iq8Var.c();
            iq8Var.H();
            iq8Var.P();
            return true;
        }
        dsh dshVar = (dsh) hshVar;
        String strL2 = dshVar.l();
        if (strL2.equals("html")) {
            return hr8.K.d(hshVar, iq8Var);
        }
        if (xrg.d(strL2, kud.a)) {
            yj6 yj6VarY = iq8Var.y(dshVar);
            if (strL2.equals("base") && yj6VarY.u("href") && !iq8Var.n) {
                String strA = yj6VarY.a("href");
                if (strA.length() != 0) {
                    iq8Var.f = strA;
                    iq8Var.n = true;
                    o96 o96Var = iq8Var.d;
                    o96Var.getClass();
                    o96Var.Y(strA);
                }
            }
            return true;
        }
        if (strL2.equals("meta")) {
            iq8Var.y(dshVar);
            return true;
        }
        if (strL2.equals("title")) {
            hr8.b(dshVar, iq8Var, iq8Var.Q(dshVar).g());
            return true;
        }
        if (xrg.d(strL2, kud.b)) {
            hr8.b(dshVar, iq8Var, iq8Var.Q(dshVar).g());
            return true;
        }
        if (strL2.equals("noscript")) {
            iq8Var.x(dshVar);
            iq8Var.l = hr8.I;
            return true;
        }
        if (strL2.equals("script")) {
            iq8Var.c.o(evh.J);
            iq8Var.m = iq8Var.l;
            iq8Var.l = hr8.L;
            iq8Var.x(dshVar);
            return true;
        }
        if (strL2.equals("head")) {
            iq8Var.k(this);
            return false;
        }
        if (!strL2.equals("template")) {
            iq8Var.J("head");
            return iq8Var.I(hshVar);
        }
        iq8Var.x(dshVar);
        iq8Var.r.add(null);
        iq8Var.v = false;
        rq8 rq8Var = hr8.V;
        iq8Var.l = rq8Var;
        iq8Var.L(rq8Var);
        return true;
    }
}
