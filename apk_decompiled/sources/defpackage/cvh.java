package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum cvh extends evh {
    public cvh() {
        super("TagOpen", 7);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        char cR = vi2Var.R();
        if (cR == '!') {
            mshVar.a(evh.v0);
            return;
        }
        if (cR == '/') {
            mshVar.a(evh.M);
            return;
        }
        if (cR == '?') {
            if (mshVar.g == 2) {
                mshVar.a(evh.w0);
                return;
            } else {
                mshVar.m.f();
                mshVar.o(evh.u0);
                return;
            }
        }
        if (vi2Var.B0()) {
            mshVar.d(true);
            mshVar.o(evh.N);
        } else {
            mshVar.m(this);
            mshVar.f('<');
            mshVar.o(evh.E);
        }
    }
}
