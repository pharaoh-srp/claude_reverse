package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum oth extends evh {
    public oth() {
        super("AttributeName", 34);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        vi2Var.P0();
        String strK = vi2Var.K(evh.V0);
        esh eshVar = mshVar.j;
        eshVar.getClass();
        eshVar.h.d(strK.replace((char) 0, (char) 65533));
        char cF = vi2Var.f();
        pth pthVar = evh.n0;
        if (cF == '\t' || cF == '\n' || cF == '\f' || cF == '\r' || cF == ' ') {
            mshVar.o(pthVar);
            return;
        }
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
            switch (cF) {
                case '=':
                    mshVar.o(evh.o0);
                    return;
                case '>':
                    mshVar.k();
                    mshVar.o(xshVar);
                    return;
                case '?':
                    if (mshVar.g == 2 && (mshVar.j instanceof gsh)) {
                        mshVar.o(pthVar);
                        return;
                    }
                    break;
            }
            mshVar.j.h.c(cF);
            return;
        }
        mshVar.m(this);
        mshVar.j.h.c(cF);
    }
}
