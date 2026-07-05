package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum xuh extends evh {
    public xuh() {
        super("BogusDoctype", 66);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        char cF = vi2Var.f();
        xsh xshVar = evh.E;
        if (cF == '>') {
            mshVar.j();
            mshVar.o(xshVar);
        } else {
            if (cF != 65535) {
                return;
            }
            mshVar.j();
            mshVar.o(xshVar);
        }
    }
}
