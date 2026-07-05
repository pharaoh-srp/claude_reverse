package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum duh extends evh {
    public duh() {
        super("CommentEndDash", 48);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        char cF = vi2Var.f();
        cuh cuhVar = evh.z0;
        if (cF == 0) {
            mshVar.m(this);
            zrh zrhVar = mshVar.m;
            zrhVar.d.c('-');
            zrhVar.g((char) 65533);
            mshVar.o(cuhVar);
            return;
        }
        if (cF == '-') {
            mshVar.o(evh.B0);
            return;
        }
        if (cF == 65535) {
            mshVar.l(this);
            mshVar.i();
            mshVar.o(evh.E);
        } else {
            zrh zrhVar2 = mshVar.m;
            zrhVar2.d.c('-');
            zrhVar2.g(cF);
            mshVar.o(cuhVar);
        }
    }
}
