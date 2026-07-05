package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum bth extends evh {
    public bth() {
        super("ScriptDataEscapedDash", 22);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        if (vi2Var.S()) {
            mshVar.l(this);
            mshVar.o(evh.E);
            return;
        }
        char cF = vi2Var.f();
        ath athVar = evh.Z;
        if (cF == 0) {
            mshVar.m(this);
            mshVar.f((char) 65533);
            mshVar.o(athVar);
        } else if (cF == '-') {
            mshVar.f(cF);
            mshVar.o(evh.b0);
        } else if (cF == '<') {
            mshVar.o(evh.c0);
        } else {
            mshVar.f(cF);
            mshVar.o(athVar);
        }
    }
}
