package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum zuh extends evh {
    public zuh() {
        super("CdataSection", 68);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        String strE;
        int iO0 = vi2Var.O0("]]>");
        if (iO0 != -1) {
            strE = vi2.e(vi2Var.G, vi2Var.E, vi2Var.H, iO0);
            vi2Var.H += iO0;
        } else {
            int i = vi2Var.I;
            int i2 = vi2Var.H;
            if (i - i2 < 3) {
                strE = vi2Var.P();
            } else {
                int i3 = i - 2;
                strE = vi2.e(vi2Var.G, vi2Var.E, i2, i3 - i2);
                vi2Var.H = i3;
            }
        }
        mshVar.f.d(strE);
        if (vi2Var.b0("]]>") || vi2Var.S()) {
            String strS = mshVar.f.s();
            xrh xrhVar = new xrh();
            ire ireVar = xrhVar.d;
            ireVar.p();
            ireVar.F = strS;
            mshVar.g(xrhVar);
            mshVar.o(evh.E);
        }
    }
}
