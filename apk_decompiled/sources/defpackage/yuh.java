package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum yuh extends evh {
    public yuh() {
        super("DoctypeInternalSubset", 67);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        char c;
        ire ireVar = mshVar.l.h;
        while (true) {
            char c2 = 0;
            while (true) {
                char cF = vi2Var.f();
                if (cF == 0) {
                    mshVar.m(this);
                    ireVar.c((char) 65533);
                } else if (cF == '\"') {
                    ireVar.c(cF);
                    c = 2;
                    if (c2 == 0) {
                        c2 = c;
                    } else if (c2 == 2) {
                        break;
                    }
                } else if (cF == '\'') {
                    ireVar.c(cF);
                    c = 1;
                    if (c2 == 0) {
                        c2 = c;
                    } else if (c2 == 1) {
                        break;
                    }
                } else if (cF == '-') {
                    ireVar.c(cF);
                    if (c2 == 3 && vi2Var.b0("->")) {
                        ireVar.d("->");
                        break;
                    }
                } else if (cF == '<') {
                    ireVar.c(cF);
                    if (c2 == 0) {
                        if (vi2Var.b0("!--")) {
                            ireVar.d("!--");
                            c2 = 3;
                        } else if (vi2Var.b0("?")) {
                            ireVar.c('?');
                            c2 = 4;
                        }
                    }
                } else if (cF == '?') {
                    ireVar.c(cF);
                    if (c2 == 4 && vi2Var.r0('>')) {
                        vi2Var.c();
                        ireVar.c('>');
                        break;
                    }
                } else {
                    xsh xshVar = evh.E;
                    if (cF != ']') {
                        if (cF == 65535) {
                            mshVar.l(this);
                            mshVar.j();
                            mshVar.o(xshVar);
                            return;
                        }
                        ireVar.c(cF);
                    } else if (c2 == 0) {
                        vi2Var.d();
                        int i = vi2Var.H;
                        int i2 = vi2Var.I;
                        char[] cArr = vi2Var.G;
                        int i3 = i;
                        while (i3 < i2 && xrg.i(cArr[i3])) {
                            i3++;
                        }
                        vi2Var.H = i3;
                        String strE = i3 > i ? vi2.e(vi2Var.G, vi2Var.E, i, i3 - i) : "";
                        if (vi2Var.r0('>')) {
                            vi2Var.c();
                            mshVar.j();
                            mshVar.o(xshVar);
                            return;
                        }
                        ireVar.c(cF);
                        ireVar.d(strE);
                    } else {
                        ireVar.c(cF);
                    }
                }
            }
        }
    }
}
