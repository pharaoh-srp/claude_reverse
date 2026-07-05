package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum zq8 extends hr8 {
    public zq8() {
        super("BeforeHtml", 1);
    }

    @Override // defpackage.hr8
    public final boolean d(hsh hshVar, iq8 iq8Var) {
        if (hshVar.b()) {
            iq8Var.k(this);
            return false;
        }
        if (hshVar.a()) {
            iq8Var.w((zrh) hshVar);
            return true;
        }
        if (hr8.a(hshVar)) {
            iq8Var.u((yrh) hshVar, false);
            return true;
        }
        boolean zE = hshVar.e();
        ar8 ar8Var = hr8.G;
        if (zE) {
            dsh dshVar = (dsh) hshVar;
            if (dshVar.l().equals("html")) {
                iq8Var.x(dshVar);
                iq8Var.l = ar8Var;
                return true;
            }
        }
        if (hshVar.d() && xrg.d(((csh) hshVar).l(), kud.e)) {
            iq8Var.K("html");
            iq8Var.l = ar8Var;
            return iq8Var.I(hshVar);
        }
        if (hshVar.d()) {
            iq8Var.k(this);
            return false;
        }
        iq8Var.K("html");
        iq8Var.l = ar8Var;
        return iq8Var.I(hshVar);
    }
}
