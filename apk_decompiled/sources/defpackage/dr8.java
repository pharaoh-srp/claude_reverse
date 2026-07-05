package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum dr8 extends hr8 {
    public dr8() {
        super("AfterHead", 5);
    }

    @Override // defpackage.hr8
    public final boolean d(hsh hshVar, iq8 iq8Var) {
        if (hr8.a(hshVar)) {
            iq8Var.u((yrh) hshVar, false);
        } else if (hshVar.a()) {
            iq8Var.w((zrh) hshVar);
        } else if (hshVar.b()) {
            iq8Var.k(this);
        } else {
            boolean zE = hshVar.e();
            br8 br8Var = hr8.H;
            if (zE) {
                dsh dshVar = (dsh) hshVar;
                String strL = dshVar.l();
                boolean zEquals = strL.equals("html");
                er8 er8Var = hr8.K;
                if (zEquals) {
                    return er8Var.d(hshVar, iq8Var);
                }
                if (strL.equals("body")) {
                    iq8Var.x(dshVar);
                    iq8Var.v = false;
                    iq8Var.l = er8Var;
                } else if (strL.equals("frameset")) {
                    iq8Var.x(dshVar);
                    iq8Var.l = hr8.X;
                } else if (xrg.d(strL, kud.g)) {
                    iq8Var.k(this);
                    yj6 yj6Var = iq8Var.o;
                    iq8Var.e.add(yj6Var);
                    br8Var.d(hshVar, iq8Var);
                    iq8Var.O(yj6Var);
                } else {
                    if (strL.equals("head")) {
                        iq8Var.k(this);
                        return false;
                    }
                    iq8Var.K("body");
                    iq8Var.v = true;
                    iq8Var.I(hshVar);
                }
            } else if (hshVar.d()) {
                String strL2 = ((csh) hshVar).l();
                if (xrg.d(strL2, kud.d)) {
                    iq8Var.K("body");
                    iq8Var.v = true;
                    iq8Var.I(hshVar);
                } else {
                    if (!strL2.equals("template")) {
                        iq8Var.k(this);
                        return false;
                    }
                    br8Var.d(hshVar, iq8Var);
                }
            } else {
                iq8Var.K("body");
                iq8Var.v = true;
                iq8Var.I(hshVar);
            }
        }
        return true;
    }
}
