package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum luh extends evh {
    public luh() {
        super("AfterDoctypePublicKeyword", 55);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        char cF = vi2Var.f();
        if (cF == '\t' || cF == '\n' || cF == '\f' || cF == '\r' || cF == ' ') {
            mshVar.o(evh.I0);
            return;
        }
        if (cF == '\"') {
            mshVar.m(this);
            mshVar.o(evh.J0);
            return;
        }
        if (cF == '\'') {
            mshVar.m(this);
            mshVar.o(evh.K0);
            return;
        }
        xsh xshVar = evh.E;
        if (cF == '>') {
            mshVar.m(this);
            mshVar.l.i = true;
            mshVar.j();
            mshVar.o(xshVar);
            return;
        }
        if (cF != 65535) {
            mshVar.m(this);
            mshVar.l.i = true;
            mshVar.o(evh.S0);
        } else {
            mshVar.l(this);
            mshVar.l.i = true;
            mshVar.j();
            mshVar.o(xshVar);
        }
    }
}
