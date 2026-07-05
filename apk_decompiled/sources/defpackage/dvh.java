package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum dvh extends evh {
    public dvh() {
        super("EndTagOpen", 8);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        boolean zS = vi2Var.S();
        xsh xshVar = evh.E;
        if (zS) {
            mshVar.l(this);
            mshVar.h("</");
            mshVar.o(xshVar);
        } else if (vi2Var.B0()) {
            mshVar.d(false);
            mshVar.o(evh.N);
        } else {
            if (vi2Var.r0('>')) {
                mshVar.m(this);
                mshVar.a(xshVar);
                return;
            }
            mshVar.m(this);
            zrh zrhVar = mshVar.m;
            zrhVar.f();
            zrhVar.g('/');
            mshVar.o(evh.u0);
        }
    }
}
