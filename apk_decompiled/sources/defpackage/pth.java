package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum pth extends evh {
    public pth() {
        super("AfterAttributeName", 35);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        char cF = vi2Var.f();
        oth othVar = evh.m0;
        if (cF == 0) {
            mshVar.m(this);
            mshVar.j.h.c((char) 65533);
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
                    case '<':
                        break;
                    case '=':
                        mshVar.o(evh.o0);
                        break;
                    case '>':
                        mshVar.k();
                        mshVar.o(xshVar);
                        break;
                    default:
                        mshVar.j.k();
                        vi2Var.S0();
                        mshVar.o(othVar);
                        break;
                }
                return;
            }
            mshVar.m(this);
            mshVar.j.k();
            mshVar.j.h.c(cF);
            mshVar.o(othVar);
        }
    }
}
