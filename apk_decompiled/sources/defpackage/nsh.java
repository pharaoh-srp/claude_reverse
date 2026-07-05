package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum nsh extends evh {
    public nsh() {
        super("TagName", 9);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        mshVar.j.i(vi2Var.n(new wg6(27)));
        char cF = vi2Var.f();
        if (cF == 0) {
            mshVar.j.i(evh.X0);
            return;
        }
        if (cF != ' ') {
            if (cF == '/') {
                mshVar.o(evh.t0);
                return;
            }
            xsh xshVar = evh.E;
            if (cF == '>') {
                mshVar.k();
                mshVar.o(xshVar);
                return;
            }
            if (cF == 65535) {
                mshVar.l(this);
                mshVar.o(xshVar);
                return;
            } else if (cF != '\t' && cF != '\n' && cF != '\f' && cF != '\r') {
                esh eshVar = mshVar.j;
                eshVar.getClass();
                eshVar.i(String.valueOf(cF));
                return;
            }
        }
        mshVar.o(evh.l0);
    }
}
