package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum cr8 extends hr8 {
    public cr8() {
        super("InHeadNoscript", 4);
    }

    @Override // defpackage.hr8
    public final boolean d(hsh hshVar, iq8 iq8Var) {
        if (hshVar.b()) {
            iq8Var.k(this);
            return true;
        }
        if (hshVar.e() && ((dsh) hshVar).l().equals("html")) {
            return hr8.K.d(hshVar, iq8Var);
        }
        boolean zD = hshVar.d();
        br8 br8Var = hr8.H;
        if (zD && ((csh) hshVar).l().equals("noscript")) {
            iq8Var.F();
            iq8Var.l = br8Var;
            return true;
        }
        if (hr8.a(hshVar) || hshVar.a() || (hshVar.e() && xrg.d(((dsh) hshVar).l(), kud.f))) {
            return br8Var.d(hshVar, iq8Var);
        }
        if (hshVar.d() && ((csh) hshVar).l().equals("br")) {
            iq8Var.k(this);
            yrh yrhVar = new yrh();
            String string = hshVar.toString();
            ire ireVar = yrhVar.d;
            ireVar.p();
            ireVar.F = string;
            iq8Var.u(yrhVar, false);
            return true;
        }
        if ((hshVar.e() && xrg.d(((dsh) hshVar).l(), kud.H)) || hshVar.d()) {
            iq8Var.k(this);
            return false;
        }
        iq8Var.k(this);
        yrh yrhVar2 = new yrh();
        String string2 = hshVar.toString();
        ire ireVar2 = yrhVar2.d;
        ireVar2.p();
        ireVar2.F = string2;
        iq8Var.u(yrhVar2, false);
        return true;
    }
}
