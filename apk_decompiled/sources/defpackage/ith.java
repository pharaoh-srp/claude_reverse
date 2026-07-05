package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum ith extends evh {
    public ith() {
        super("CharacterReferenceInData", 1);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        int[] iArrC = mshVar.c(null, false);
        if (iArrC == null) {
            mshVar.f('&');
        } else {
            mshVar.h(new String(iArrC, 0, iArrC.length));
        }
        mshVar.o(evh.E);
    }
}
