package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum cuh extends evh {
    public cuh() {
        super("Comment", 47);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        char cR = vi2Var.R();
        if (cR == 0) {
            mshVar.m(this);
            vi2Var.c();
            mshVar.m.g((char) 65533);
        } else {
            if (cR == '-') {
                mshVar.a(evh.A0);
                return;
            }
            if (cR != 65535) {
                zrh zrhVar = mshVar.m;
                zrhVar.d.d(vi2Var.H('-', 0));
            } else {
                mshVar.l(this);
                mshVar.i();
                mshVar.o(evh.E);
            }
        }
    }
}
