package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum xsh extends evh {
    public xsh() {
        super("Data", 0);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        char cR = vi2Var.R();
        if (cR == 0) {
            mshVar.m(this);
            mshVar.f(vi2Var.f());
        } else {
            if (cR == '&') {
                mshVar.a(evh.F);
                return;
            }
            if (cR == '<') {
                mshVar.a(evh.L);
            } else if (cR != 65535) {
                mshVar.h(vi2Var.i());
            } else {
                mshVar.g(new bsh());
            }
        }
    }
}
