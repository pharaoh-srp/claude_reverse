package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum yth extends evh {
    public yth() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        if (vi2Var.b0("--")) {
            mshVar.m.f();
            mshVar.o(evh.x0);
            return;
        }
        if (vi2Var.l0("DOCTYPE")) {
            mshVar.o(evh.D0);
            return;
        }
        if (vi2Var.b0("[CDATA[")) {
            mshVar.e();
            mshVar.o(evh.U0);
            return;
        }
        if (mshVar.g != 2 || !vi2Var.B0()) {
            mshVar.m(this);
            mshVar.m.f();
            mshVar.o(evh.u0);
        } else {
            gsh gshVar = mshVar.n;
            gshVar.f();
            gshVar.k = true;
            mshVar.j = gshVar;
            mshVar.o(evh.N);
        }
    }
}
