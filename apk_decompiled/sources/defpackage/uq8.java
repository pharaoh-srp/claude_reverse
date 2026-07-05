package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum uq8 extends hr8 {
    public uq8() {
        super("InFrameset", 19);
    }

    @Override // defpackage.hr8
    public final boolean d(hsh hshVar, iq8 iq8Var) {
        dsh dshVar;
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
        if (!hshVar.e()) {
            if (hshVar.d() && ((csh) hshVar).l().equals("frameset")) {
                if (!iq8Var.i("frameset")) {
                    iq8Var.k(this);
                    return false;
                }
                iq8Var.F();
                if (!iq8Var.x && !iq8Var.i("frameset")) {
                    iq8Var.l = hr8.Y;
                    return true;
                }
            } else {
                if (!hshVar.c()) {
                    iq8Var.k(this);
                    return false;
                }
                if (!iq8Var.i("html")) {
                    iq8Var.k(this);
                }
            }
            return true;
        }
        dshVar = (dsh) hshVar;
        String strL = dshVar.l();
        strL.getClass();
        switch (strL) {
            case "frameset":
                iq8Var.x(dshVar);
                break;
            case "html":
                break;
            case "frame":
                iq8Var.y(dshVar);
                break;
            case "noframes":
                break;
            default:
                iq8Var.k(this);
                break;
        }
        return true;
    }
}
