package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum fuh extends evh {
    public fuh() {
        super("CommentEnd", 49);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        char cF = vi2Var.f();
        cuh cuhVar = evh.z0;
        if (cF == 0) {
            mshVar.m(this);
            zrh zrhVar = mshVar.m;
            zrhVar.d.d("--");
            zrhVar.g((char) 65533);
            mshVar.o(cuhVar);
            return;
        }
        if (cF == '!') {
            mshVar.o(evh.C0);
            return;
        }
        if (cF == '-') {
            mshVar.m.g('-');
            return;
        }
        xsh xshVar = evh.E;
        if (cF == '>') {
            mshVar.i();
            mshVar.o(xshVar);
        } else if (cF == 65535) {
            mshVar.l(this);
            mshVar.i();
            mshVar.o(xshVar);
        } else {
            zrh zrhVar2 = mshVar.m;
            zrhVar2.d.d("--");
            zrhVar2.g(cF);
            mshVar.o(cuhVar);
        }
    }
}
