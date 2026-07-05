package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum kth extends evh {
    public kth() {
        super("ScriptDataDoubleEscapedDashDash", 30);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        char cF = vi2Var.f();
        hth hthVar = evh.g0;
        if (cF == 0) {
            mshVar.m(this);
            mshVar.f((char) 65533);
            mshVar.o(hthVar);
            return;
        }
        if (cF == '-') {
            mshVar.f(cF);
            return;
        }
        if (cF == '<') {
            mshVar.f(cF);
            mshVar.o(evh.j0);
        } else if (cF == '>') {
            mshVar.f(cF);
            mshVar.o(evh.J);
        } else if (cF != 65535) {
            mshVar.f(cF);
            mshVar.o(hthVar);
        } else {
            mshVar.l(this);
            mshVar.o(evh.E);
        }
    }
}
