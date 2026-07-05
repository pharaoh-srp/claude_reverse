package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum tth extends evh {
    public tth() {
        super("Rcdata", 2);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        char cR = vi2Var.R();
        if (cR == 0) {
            mshVar.m(this);
            vi2Var.c();
            mshVar.f((char) 65533);
        } else {
            if (cR == '&') {
                mshVar.a(evh.H);
                return;
            }
            if (cR == '<') {
                mshVar.a(evh.O);
            } else if (cR != 65535) {
                mshVar.h(vi2Var.i());
            } else {
                mshVar.g(new bsh());
            }
        }
    }
}
