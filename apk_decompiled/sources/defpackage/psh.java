package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum psh extends evh {
    public psh() {
        super("RCDATAEndTagOpen", 11);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        if (!vi2Var.B0()) {
            mshVar.h("</");
            mshVar.o(evh.G);
            return;
        }
        mshVar.d(false);
        esh eshVar = mshVar.j;
        char cR = vi2Var.R();
        eshVar.getClass();
        eshVar.i(String.valueOf(cR));
        mshVar.f.c(vi2Var.R());
        mshVar.a(evh.Q);
    }
}
