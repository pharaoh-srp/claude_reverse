package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum ush extends evh {
    public ush() {
        super("ScriptDataLessthanSign", 16);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        char cF = vi2Var.f();
        if (cF == '!') {
            mshVar.h("<!");
            mshVar.o(evh.X);
            return;
        }
        if (cF == '/') {
            mshVar.e();
            mshVar.o(evh.V);
        } else if (cF != 65535) {
            mshVar.f('<');
            vi2Var.S0();
            mshVar.o(evh.J);
        } else {
            mshVar.f('<');
            mshVar.l(this);
            mshVar.o(evh.E);
        }
    }
}
