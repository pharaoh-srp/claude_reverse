package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum dth extends evh {
    public dth() {
        super("ScriptDataEscapedLessthanSign", 24);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        if (vi2Var.B0()) {
            mshVar.e();
            mshVar.f.c(vi2Var.R());
            mshVar.f('<');
            mshVar.f(vi2Var.R());
            mshVar.a(evh.f0);
            return;
        }
        if (vi2Var.r0('/')) {
            mshVar.e();
            mshVar.a(evh.d0);
        } else {
            mshVar.f('<');
            mshVar.o(evh.Z);
        }
    }
}
