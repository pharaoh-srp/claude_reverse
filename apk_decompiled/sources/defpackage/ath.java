package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum ath extends evh {
    public ath() {
        super("ScriptDataEscaped", 21);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        if (vi2Var.S()) {
            mshVar.l(this);
            mshVar.o(evh.E);
            return;
        }
        char cR = vi2Var.R();
        if (cR == 0) {
            mshVar.m(this);
            vi2Var.c();
            mshVar.f((char) 65533);
        } else if (cR == '-') {
            mshVar.f('-');
            mshVar.a(evh.a0);
        } else if (cR != '<') {
            mshVar.h(vi2Var.H('-', '<', 0));
        } else {
            mshVar.a(evh.c0);
        }
    }
}
