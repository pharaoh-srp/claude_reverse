package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum huh extends evh {
    public huh() {
        super("Doctype", 51);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        char cF = vi2Var.f();
        iuh iuhVar = evh.E0;
        if (cF == '\t' || cF == '\n' || cF == '\f' || cF == '\r' || cF == ' ') {
            mshVar.o(iuhVar);
            return;
        }
        if (cF != '>') {
            if (cF != 65535) {
                mshVar.m(this);
                mshVar.o(iuhVar);
                return;
            }
            mshVar.l(this);
        }
        mshVar.m(this);
        ash ashVar = mshVar.l;
        ashVar.f();
        ashVar.i = true;
        mshVar.j();
        mshVar.o(evh.E);
    }
}
