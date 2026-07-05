package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum auh extends evh {
    public auh() {
        super("CommentStart", 45);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        char cF = vi2Var.f();
        cuh cuhVar = evh.z0;
        if (cF == 0) {
            mshVar.m(this);
            mshVar.m.g((char) 65533);
            mshVar.o(cuhVar);
            return;
        }
        if (cF == '-') {
            mshVar.o(evh.y0);
            return;
        }
        xsh xshVar = evh.E;
        if (cF == '>') {
            mshVar.m(this);
            mshVar.i();
            mshVar.o(xshVar);
        } else if (cF != 65535) {
            vi2Var.S0();
            mshVar.o(cuhVar);
        } else {
            mshVar.l(this);
            mshVar.i();
            mshVar.o(xshVar);
        }
    }
}
