package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum uth extends evh {
    public uth() {
        super("AttributeValue_unquoted", 39);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        vi2Var.P0();
        String strK = vi2Var.K(evh.W0);
        if (strK.length() > 0) {
            mshVar.j.i.d(strK);
        }
        int iP0 = vi2Var.P0();
        char cF = vi2Var.f();
        if (cF == 0) {
            mshVar.m(this);
            mshVar.j.g(iP0, vi2Var.P0(), (char) 65533);
            return;
        }
        if (cF != ' ') {
            if (cF != '\"' && cF != '`') {
                xsh xshVar = evh.E;
                if (cF == 65535) {
                    mshVar.l(this);
                    mshVar.o(xshVar);
                    return;
                }
                if (cF != '\t' && cF != '\n' && cF != '\f' && cF != '\r') {
                    if (cF == '&') {
                        int[] iArrC = mshVar.c('>', true);
                        esh eshVar = mshVar.j;
                        if (iArrC != null) {
                            eshVar.h(iP0, vi2Var.P0(), iArrC);
                            return;
                        } else {
                            eshVar.g(iP0, vi2Var.P0(), '&');
                            return;
                        }
                    }
                    if (cF != '\'') {
                        switch (cF) {
                            case '<':
                            case '=':
                                break;
                            case '>':
                                mshVar.k();
                                mshVar.o(xshVar);
                                break;
                            default:
                                mshVar.j.g(iP0, vi2Var.P0(), cF);
                                break;
                        }
                        return;
                    }
                }
            }
            mshVar.m(this);
            mshVar.j.g(iP0, vi2Var.P0(), cF);
            return;
        }
        mshVar.o(evh.l0);
    }
}
