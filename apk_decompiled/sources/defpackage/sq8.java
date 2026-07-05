package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum sq8 extends hr8 {
    public sq8() {
        super("AfterBody", 18);
    }

    @Override // defpackage.hr8
    public final boolean d(hsh hshVar, iq8 iq8Var) {
        yj6 yj6VarO = iq8Var.o("html");
        boolean zA = hr8.a(hshVar);
        er8 er8Var = hr8.K;
        if (zA) {
            if (yj6VarO != null) {
                iq8Var.v((yrh) hshVar, yj6VarO);
                return true;
            }
            er8Var.d(hshVar, iq8Var);
            return true;
        }
        if (hshVar.a()) {
            iq8Var.w((zrh) hshVar);
            return true;
        }
        if (hshVar.b()) {
            iq8Var.k(this);
            return false;
        }
        if (hshVar.e() && ((dsh) hshVar).l().equals("html")) {
            return er8Var.d(hshVar, iq8Var);
        }
        if (hshVar.d() && ((csh) hshVar).l().equals("html")) {
            if (iq8Var.x) {
                iq8Var.k(this);
                return false;
            }
            iq8Var.l = hr8.Z;
            return true;
        }
        if (hshVar.c()) {
            return true;
        }
        iq8Var.k(this);
        if (!iq8Var.C("body")) {
            iq8Var.e.add(iq8Var.d.m0());
        }
        iq8Var.l = er8Var;
        return iq8Var.I(hshVar);
    }
}
