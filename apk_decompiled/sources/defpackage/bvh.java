package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum bvh extends evh {
    public bvh() {
        super("PLAINTEXT", 6);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        char cR = vi2Var.R();
        if (cR == 0) {
            mshVar.m(this);
            vi2Var.c();
            mshVar.f((char) 65533);
        } else if (cR != 65535) {
            mshVar.h(vi2Var.x((char) 0));
        } else {
            mshVar.g(new bsh());
        }
    }
}
