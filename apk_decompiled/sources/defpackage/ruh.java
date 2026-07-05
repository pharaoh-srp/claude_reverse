package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum ruh extends evh {
    public ruh() {
        super("BetweenDoctypePublicAndSystemIdentifiers", 60);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        char cF = vi2Var.f();
        if (cF == '\t' || cF == '\n' || cF == '\f' || cF == '\r' || cF == ' ') {
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
            mshVar.j();
            mshVar.o(xshVar);
            return;
        }
        xuh xuhVar = evh.S0;
        if (cF != '[') {
            if (cF != 65535) {
                mshVar.m(this);
                mshVar.l.i = true;
                mshVar.o(xuhVar);
                return;
            } else {
                mshVar.l(this);
                mshVar.l.i = true;
                mshVar.j();
                mshVar.o(xshVar);
                return;
            }
        }
        int i = mshVar.g;
        ash ashVar = mshVar.l;
        if (i == 2) {
            ashVar.getClass();
            mshVar.o(evh.T0);
        } else {
            mshVar.m(this);
            ashVar.i = true;
            mshVar.o(xuhVar);
        }
    }
}
