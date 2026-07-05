package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum iuh extends evh {
    public iuh() {
        super("BeforeDoctypeName", 52);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        boolean zB0 = vi2Var.B0();
        juh juhVar = evh.F0;
        if (zB0) {
            mshVar.l.f();
            mshVar.o(juhVar);
            return;
        }
        char cF = vi2Var.f();
        if (cF == 0) {
            mshVar.m(this);
            ash ashVar = mshVar.l;
            ashVar.f();
            ashVar.d.c((char) 65533);
            mshVar.o(juhVar);
            return;
        }
        if (cF != ' ') {
            if (cF == 65535) {
                mshVar.l(this);
                ash ashVar2 = mshVar.l;
                ashVar2.f();
                ashVar2.i = true;
                mshVar.j();
                mshVar.o(evh.E);
                return;
            }
            if (cF == '\t' || cF == '\n' || cF == '\f' || cF == '\r') {
                return;
            }
            mshVar.l.f();
            mshVar.l.d.c(cF);
            mshVar.o(juhVar);
        }
    }
}
