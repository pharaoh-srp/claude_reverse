package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum kuh extends evh {
    public kuh() {
        super("AfterDoctypeName", 54);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        boolean zS = vi2Var.S();
        xsh xshVar = evh.E;
        if (zS) {
            mshVar.l(this);
            mshVar.l.i = true;
            mshVar.j();
            mshVar.o(xshVar);
            return;
        }
        if (vi2Var.x0('\t', '\n', '\r', '\f', ' ')) {
            vi2Var.c();
            return;
        }
        if (vi2Var.r0('>')) {
            mshVar.j();
            mshVar.a(xshVar);
            return;
        }
        int i = mshVar.g;
        ash ashVar = mshVar.l;
        if (i == 2 && vi2Var.r0('[')) {
            ashVar.getClass();
            mshVar.a(evh.T0);
            return;
        }
        if (vi2Var.l0("PUBLIC")) {
            ashVar.e = "PUBLIC";
            mshVar.o(evh.H0);
        } else if (vi2Var.l0("SYSTEM")) {
            ashVar.e = "SYSTEM";
            mshVar.o(evh.N0);
        } else {
            mshVar.m(this);
            ashVar.i = true;
            mshVar.a(evh.S0);
        }
    }
}
