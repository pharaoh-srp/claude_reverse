package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum euh extends evh {
    public euh() {
        super("CharacterReferenceInRcdata", 3);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        int[] iArrC = mshVar.c(null, false);
        if (iArrC == null) {
            mshVar.f('&');
        } else {
            mshVar.h(new String(iArrC, 0, iArrC.length));
        }
        mshVar.o(evh.G);
    }
}
