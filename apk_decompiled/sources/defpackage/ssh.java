package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum ssh extends evh {
    public ssh() {
        super("RawtextEndTagOpen", 14);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        if (vi2Var.B0()) {
            mshVar.d(false);
            mshVar.o(evh.T);
        } else {
            mshVar.h("</");
            mshVar.o(evh.I);
        }
    }
}
