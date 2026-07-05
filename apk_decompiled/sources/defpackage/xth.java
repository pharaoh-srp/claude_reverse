package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum xth extends evh {
    public xth() {
        super("BogusComment", 42);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        zrh zrhVar = mshVar.m;
        zrhVar.d.d(vi2Var.x('>'));
        char cR = vi2Var.R();
        if (cR == '>' || cR == 65535) {
            vi2Var.f();
            mshVar.i();
            mshVar.o(evh.E);
        }
    }
}
