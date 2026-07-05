package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum fr8 extends hr8 {
    public fr8() {
        super("Text", 7);
    }

    @Override // defpackage.hr8
    public final boolean d(hsh hshVar, iq8 iq8Var) {
        if (hshVar.a == 5) {
            iq8Var.u((yrh) hshVar, false);
            return true;
        }
        if (!hshVar.c()) {
            if (!hshVar.d()) {
                return true;
            }
            iq8Var.F();
            iq8Var.l = iq8Var.m;
            return true;
        }
        iq8Var.k(this);
        iq8Var.F();
        hr8 hr8Var = iq8Var.m;
        iq8Var.l = hr8Var;
        if (hr8Var == hr8.L) {
            iq8Var.l = hr8.K;
        }
        return iq8Var.I(hshVar);
    }
}
