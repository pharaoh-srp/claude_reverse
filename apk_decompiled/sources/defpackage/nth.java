package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum nth extends evh {
    public nth() {
        super("BeforeAttributeName", 33);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        char cF = vi2Var.f();
        oth othVar = evh.m0;
        if (cF == 0) {
            vi2Var.S0();
            mshVar.m(this);
            mshVar.j.k();
            mshVar.o(othVar);
            return;
        }
        if (cF != ' ') {
            if (cF != '\"' && cF != '\'') {
                if (cF == '/') {
                    mshVar.o(evh.t0);
                    return;
                }
                xsh xshVar = evh.E;
                if (cF == 65535) {
                    mshVar.l(this);
                    mshVar.o(xshVar);
                    return;
                }
                if (cF == '\t' || cF == '\n' || cF == '\f' || cF == '\r') {
                    return;
                }
                switch (cF) {
                    case '>':
                        mshVar.k();
                        mshVar.o(xshVar);
                        return;
                    case '?':
                        if (mshVar.j instanceof gsh) {
                            return;
                        }
                        break;
                }
                mshVar.j.k();
                vi2Var.S0();
                mshVar.o(othVar);
                return;
            }
            mshVar.m(this);
            mshVar.j.k();
            mshVar.j.h.c(cF);
            mshVar.o(othVar);
        }
    }
}
