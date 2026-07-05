package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum nuh extends evh {
    public nuh() {
        super("DoctypePublicIdentifier_doubleQuoted", 57);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        char cF = vi2Var.f();
        if (cF == 0) {
            mshVar.m(this);
            mshVar.l.f.c((char) 65533);
            return;
        }
        if (cF == '\"') {
            mshVar.o(evh.L0);
            return;
        }
        xsh xshVar = evh.E;
        if (cF == '>') {
            mshVar.m(this);
            mshVar.l.i = true;
            mshVar.j();
            mshVar.o(xshVar);
            return;
        }
        if (cF != 65535) {
            mshVar.l.f.c(cF);
            return;
        }
        mshVar.l(this);
        mshVar.l.i = true;
        mshVar.j();
        mshVar.o(xshVar);
    }
}
