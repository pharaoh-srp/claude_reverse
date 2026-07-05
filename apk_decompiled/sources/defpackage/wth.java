package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum wth extends evh {
    public wth() {
        super("SelfClosingStartTag", 41);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        char cF = vi2Var.f();
        xsh xshVar = evh.E;
        if (cF == '>') {
            mshVar.j.f = true;
            mshVar.k();
            mshVar.o(xshVar);
        } else if (cF == 65535) {
            mshVar.l(this);
            mshVar.o(xshVar);
        } else {
            vi2Var.S0();
            mshVar.m(this);
            mshVar.o(evh.l0);
        }
    }
}
