package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum vth extends evh {
    public vth() {
        super("AfterAttributeValue_quoted", 40);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        char cF = vi2Var.f();
        nth nthVar = evh.l0;
        if (cF == '\t' || cF == '\n' || cF == '\f' || cF == '\r' || cF == ' ') {
            mshVar.o(nthVar);
            return;
        }
        if (cF == '/') {
            mshVar.o(evh.t0);
            return;
        }
        xsh xshVar = evh.E;
        if (cF == 65535) {
            mshVar.l(this);
            mshVar.o(xshVar);
        } else if (cF == '>') {
            mshVar.k();
            mshVar.o(xshVar);
        } else {
            if (cF == '?' && (mshVar.j instanceof gsh)) {
                return;
            }
            vi2Var.S0();
            mshVar.m(this);
            mshVar.o(nthVar);
        }
    }
}
