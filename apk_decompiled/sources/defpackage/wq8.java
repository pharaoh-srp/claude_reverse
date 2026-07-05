package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum wq8 extends hr8 {
    public wq8() {
        super("AfterAfterBody", 21);
    }

    @Override // defpackage.hr8
    public final boolean d(hsh hshVar, iq8 iq8Var) {
        if (hshVar.a()) {
            iq8Var.w((zrh) hshVar);
            return true;
        }
        boolean zB = hshVar.b();
        er8 er8Var = hr8.K;
        if (zB || (hshVar.e() && ((dsh) hshVar).l().equals("html"))) {
            return er8Var.d(hshVar, iq8Var);
        }
        if (hr8.a(hshVar)) {
            iq8Var.v((yrh) hshVar, iq8Var.d);
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
