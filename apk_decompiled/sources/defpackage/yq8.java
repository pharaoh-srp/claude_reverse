package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public enum yq8 extends hr8 {
    public yq8() {
        super("ForeignContent", 23);
    }

    @Override // defpackage.hr8
    public final boolean d(hsh hshVar, iq8 iq8Var) {
        n31 n31Var;
        n31 n31Var2;
        n31 n31Var3;
        yj6 yj6VarH;
        int iF = sq6.F(hshVar.a);
        if (iF == 0) {
            iq8Var.k(this);
            return true;
        }
        if (iF == 1) {
            dsh dshVar = (dsh) hshVar;
            if (xrg.c(dshVar.e, kud.L)) {
                return iq8Var.l.d(hshVar, iq8Var);
            }
            if (dshVar.e.equals("font") && (((n31Var = dshVar.g) != null && n31Var.r("color") != -1) || (((n31Var2 = dshVar.g) != null && n31Var2.r("face") != -1) || ((n31Var3 = dshVar.g) != null && n31Var3.r("size") != -1)))) {
                return iq8Var.l.d(hshVar, iq8Var);
            }
            String str = iq8Var.h().H.E;
            iq8Var.z(dshVar, str);
            evh evhVarG = iq8Var.i.d(dshVar.d.s(), dshVar.e, str, iq8Var.h.a).g();
            if (evhVarG != null) {
                boolean zEquals = dshVar.e.equals("script");
                msh mshVar = iq8Var.c;
                if (zEquals) {
                    mshVar.o(evh.J);
                    return true;
                }
                mshVar.o(evhVarG);
            }
        } else {
            if (iF == 2) {
                csh cshVar = (csh) hshVar;
                if (cshVar.e.equals("br") || cshVar.e.equals("p")) {
                    return iq8Var.l.d(hshVar, iq8Var);
                }
                if (cshVar.e.equals("script") && iq8Var.e.size() != 0 && (yj6VarH = iq8Var.h()) != null) {
                    z3h z3hVar = yj6VarH.H;
                    if (z3hVar.G.equals("script") && z3hVar.E.equals("http://www.w3.org/2000/svg")) {
                        iq8Var.F();
                        return true;
                    }
                }
                ArrayList arrayList = iq8Var.e;
                if (arrayList.isEmpty()) {
                    sz6.j("Stack unexpectedly empty");
                    return false;
                }
                int size = arrayList.size() - 1;
                yj6 yj6Var = (yj6) arrayList.get(size);
                if (!yj6Var.w(cshVar.e)) {
                    iq8Var.k(this);
                }
                do {
                    if (size != 0) {
                        if (yj6Var.w(cshVar.e)) {
                            String str2 = yj6Var.H.G;
                            for (int size2 = iq8Var.e.size() - 1; size2 >= 0 && !iq8Var.F().w(str2); size2--) {
                            }
                        } else {
                            size--;
                            yj6Var = (yj6) arrayList.get(size);
                        }
                    }
                } while (!yj6Var.H.E.equals("http://www.w3.org/1999/xhtml"));
                return iq8Var.l.d(hshVar, iq8Var);
            }
            if (iF == 3) {
                iq8Var.w((zrh) hshVar);
                return true;
            }
            if (iF == 4) {
                yrh yrhVar = (yrh) hshVar;
                if (hr8.a(yrhVar)) {
                    iq8Var.u(yrhVar, false);
                    return true;
                }
                iq8Var.u(yrhVar, true);
                iq8Var.v = false;
                return true;
            }
            if (iF != 6) {
                sz6.j("Unexpected state: ".concat(fsh.D(hshVar.a)));
                return false;
            }
        }
        return true;
    }
}
