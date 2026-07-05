package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum suh extends evh {
    public suh() {
        super("AfterDoctypeSystemKeyword", 61);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        char cF = vi2Var.f();
        if (cF == '\t' || cF == '\n' || cF == '\f' || cF == '\r' || cF == ' ') {
            mshVar.o(evh.O0);
            return;
        }
        if (cF == '\"') {
            mshVar.m(this);
            mshVar.o(evh.P0);
            return;
        }
        if (cF == '\'') {
            mshVar.m(this);
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
            mshVar.j();
        } else {
            mshVar.l(this);
            mshVar.l.i = true;
            mshVar.j();
            mshVar.o(xshVar);
        }
    }
}
