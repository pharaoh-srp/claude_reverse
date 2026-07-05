package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum tuh extends evh {
    public tuh() {
        super("BeforeDoctypeSystemIdentifier", 62);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        char cF = vi2Var.f();
        if (cF == '\t' || cF == '\n' || cF == '\f' || cF == '\r' || cF == ' ') {
            return;
        }
        if (cF == '\"') {
            mshVar.o(evh.P0);
            return;
        }
        if (cF == '\'') {
            mshVar.o(evh.Q0);
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
