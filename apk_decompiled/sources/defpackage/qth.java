package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum qth extends evh {
    public qth() {
        super("BeforeAttributeValue", 36);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        char cF = vi2Var.f();
        uth uthVar = evh.r0;
        if (cF == 0) {
            mshVar.m(this);
            mshVar.j.g(vi2Var.P0() - 1, vi2Var.P0(), (char) 65533);
            mshVar.o(uthVar);
            return;
        }
        if (cF != ' ') {
            if (cF == '\"') {
                mshVar.o(evh.p0);
                return;
            }
            if (cF != '`') {
                xsh xshVar = evh.E;
                if (cF == 65535) {
                    mshVar.l(this);
                    mshVar.k();
                    mshVar.o(xshVar);
                    return;
                }
                if (cF == '\t' || cF == '\n' || cF == '\f' || cF == '\r') {
                    return;
                }
                if (cF == '&') {
                    vi2Var.S0();
                    mshVar.o(uthVar);
                    return;
                }
                if (cF == '\'') {
                    mshVar.o(evh.q0);
                    return;
                }
                switch (cF) {
                    case '<':
                    case '=':
                        break;
                    case '>':
                        mshVar.m(this);
                        mshVar.k();
                        mshVar.o(xshVar);
                        break;
                    default:
                        vi2Var.S0();
                        mshVar.o(uthVar);
                        break;
                }
                return;
            }
            mshVar.m(this);
            mshVar.j.g(vi2Var.P0() - 1, vi2Var.P0(), cF);
            mshVar.o(uthVar);
        }
    }
}
