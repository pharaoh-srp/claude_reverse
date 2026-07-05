package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum qsh extends evh {
    public qsh() {
        super("RCDATAEndTagName", 12);
    }

    public static void e(msh mshVar, vi2 vi2Var) {
        mshVar.h("</");
        mshVar.h(mshVar.f.s());
        vi2Var.S0();
        mshVar.o(evh.G);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        if (vi2Var.B0()) {
            String strN = vi2Var.n(new wg6(27));
            mshVar.j.i(strN);
            mshVar.f.d(strN);
            return;
        }
        char cF = vi2Var.f();
        if (cF == '\t' || cF == '\n' || cF == '\f' || cF == '\r' || cF == ' ') {
            if (mshVar.n()) {
                mshVar.o(evh.l0);
                return;
            } else {
                e(mshVar, vi2Var);
                return;
            }
        }
        if (cF == '/') {
            if (mshVar.n()) {
                mshVar.o(evh.t0);
                return;
            } else {
                e(mshVar, vi2Var);
                return;
            }
        }
        if (cF != '>') {
            e(mshVar, vi2Var);
        } else if (!mshVar.n()) {
            e(mshVar, vi2Var);
        } else {
            mshVar.k();
            mshVar.o(evh.E);
        }
    }
}
