package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum juh extends evh {
    public juh() {
        super("DoctypeName", 53);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        if (vi2Var.B0()) {
            mshVar.l.d.d(vi2Var.j());
            return;
        }
        char cF = vi2Var.f();
        if (cF == 0) {
            mshVar.m(this);
            mshVar.l.d.c((char) 65533);
            return;
        }
        if (cF != ' ') {
            xsh xshVar = evh.E;
            if (cF == '>') {
                mshVar.j();
                mshVar.o(xshVar);
                return;
            }
            if (cF == 65535) {
                mshVar.l(this);
                mshVar.l.i = true;
                mshVar.j();
                mshVar.o(xshVar);
                return;
            }
            if (cF != '\t' && cF != '\n' && cF != '\f' && cF != '\r') {
                mshVar.l.d.c(cF);
                return;
            }
        }
        mshVar.o(evh.G0);
    }
}
