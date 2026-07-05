package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum sth extends evh {
    public sth() {
        super("AttributeValue_singleQuoted", 38);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        char c;
        vi2Var.P0();
        vi2Var.d();
        int i = vi2Var.H;
        int i2 = vi2Var.I;
        char[] cArr = vi2Var.G;
        int i3 = i;
        while (i3 < i2 && (c = cArr[i3]) != 0 && c != '&' && c != '\'') {
            i3++;
        }
        vi2Var.H = i3;
        String strE = i3 > i ? vi2.e(vi2Var.G, vi2Var.E, i, i3 - i) : "";
        if (strE.length() > 0) {
            mshVar.j.i.d(strE);
        } else {
            mshVar.j.j = true;
        }
        int iP0 = vi2Var.P0();
        char cF = vi2Var.f();
        if (cF == 0) {
            mshVar.m(this);
            mshVar.j.g(iP0, vi2Var.P0(), (char) 65533);
            return;
        }
        if (cF == 65535) {
            mshVar.l(this);
            mshVar.o(evh.E);
            return;
        }
        if (cF != '&') {
            if (cF != '\'') {
                mshVar.j.g(iP0, vi2Var.P0(), cF);
                return;
            } else {
                mshVar.o(evh.s0);
                return;
            }
        }
        int[] iArrC = mshVar.c('\'', true);
        esh eshVar = mshVar.j;
        if (iArrC != null) {
            eshVar.h(iP0, vi2Var.P0(), iArrC);
        } else {
            eshVar.g(iP0, vi2Var.P0(), '&');
        }
    }
}
