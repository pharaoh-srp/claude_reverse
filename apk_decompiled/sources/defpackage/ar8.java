package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum ar8 extends hr8 {
    public ar8() {
        super("BeforeHead", 2);
    }

    @Override // defpackage.hr8
    public final boolean d(hsh hshVar, iq8 iq8Var) {
        if (hr8.a(hshVar)) {
            iq8Var.u((yrh) hshVar, false);
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
            return hr8.K.d(hshVar, iq8Var);
        }
        if (hshVar.e()) {
            dsh dshVar = (dsh) hshVar;
            if (dshVar.l().equals("head")) {
                iq8Var.o = iq8Var.x(dshVar);
                iq8Var.l = hr8.H;
                return true;
            }
        }
        if (hshVar.d() && xrg.d(((csh) hshVar).l(), kud.e)) {
            iq8Var.K("head");
            return iq8Var.I(hshVar);
        }
        if (hshVar.d()) {
            iq8Var.k(this);
            return false;
        }
        iq8Var.K("head");
        return iq8Var.I(hshVar);
    }
}
