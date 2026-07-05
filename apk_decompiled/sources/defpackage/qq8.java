package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum qq8 extends hr8 {
    public qq8() {
        super("InSelectInTable", 16);
    }

    @Override // defpackage.hr8
    public final boolean d(hsh hshVar, iq8 iq8Var) {
        boolean zE = hshVar.e();
        String[] strArr = kud.F;
        if (zE && xrg.d(((dsh) hshVar).l(), strArr)) {
            iq8Var.k(this);
            iq8Var.G("select");
            iq8Var.P();
            return iq8Var.I(hshVar);
        }
        if (hshVar.d()) {
            csh cshVar = (csh) hshVar;
            if (xrg.d(cshVar.l(), strArr)) {
                iq8Var.k(this);
                if (!iq8Var.t(cshVar.l())) {
                    return false;
                }
                iq8Var.G("select");
                iq8Var.P();
                return iq8Var.I(hshVar);
            }
        }
        return hr8.T.d(hshVar, iq8Var);
    }
}
