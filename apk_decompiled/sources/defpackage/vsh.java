package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum vsh extends evh {
    public vsh() {
        super("ScriptDataEndTagOpen", 17);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        if (vi2Var.B0()) {
            mshVar.d(false);
            mshVar.o(evh.W);
        } else {
            mshVar.h("</");
            mshVar.o(evh.J);
        }
    }
}
