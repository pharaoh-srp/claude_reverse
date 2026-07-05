package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum hth extends evh {
    public hth() {
        super("ScriptDataDoubleEscaped", 28);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        char cR = vi2Var.R();
        if (cR == 0) {
            mshVar.m(this);
            vi2Var.c();
            mshVar.f((char) 65533);
        } else if (cR == '-') {
            mshVar.f(cR);
            mshVar.a(evh.h0);
        } else if (cR == '<') {
            mshVar.f(cR);
            mshVar.a(evh.j0);
        } else if (cR != 65535) {
            mshVar.h(vi2Var.H('-', '<', 0));
        } else {
            mshVar.l(this);
            mshVar.o(evh.E);
        }
    }
}
