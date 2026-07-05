package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum wuh extends evh {
    public wuh() {
        super("AfterDoctypeSystemIdentifier", 65);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        char cF = vi2Var.f();
        if (cF == '\t' || cF == '\n' || cF == '\f' || cF == '\r' || cF == ' ') {
            return;
        }
        xsh xshVar = evh.E;
        if (cF == '>') {
            mshVar.j();
            mshVar.o(xshVar);
            return;
        }
        xuh xuhVar = evh.S0;
        if (cF == '[') {
            if (mshVar.g == 2) {
                mshVar.l.getClass();
                mshVar.o(evh.T0);
                return;
            } else {
                mshVar.m(this);
                mshVar.o(xuhVar);
                return;
            }
        }
        if (cF != 65535) {
            mshVar.m(this);
            mshVar.o(xuhVar);
        } else {
            mshVar.l(this);
            mshVar.l.i = true;
            mshVar.j();
            mshVar.o(xshVar);
        }
    }
}
