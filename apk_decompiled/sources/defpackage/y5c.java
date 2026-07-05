package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public interface y5c {
    void f(c5c c5cVar, int i);

    default void j(c5c c5cVar) {
        c5c c5cVarZ = c5cVar.z();
        char c = 0;
        int i = 0;
        while (true) {
            if (c == 0) {
                yj6 yj6Var = c5cVar.E;
                c5c c5cVarZ2 = c5cVar.z();
                int iN = yj6Var != null ? c5cVar.N() : 0;
                f(c5cVar, i);
                if (yj6Var != null && c5cVar.E != yj6Var) {
                    c5cVar = iN < yj6Var.I.size() ? yj6Var.m(iN) : null;
                    c5c c5cVar2 = i == 0 ? c5cVarZ : c5cVarZ2;
                    if (c5cVar == null || c5cVar == c5cVar2) {
                        if (i == 0) {
                            return;
                        }
                        if (c5cVarZ2 == null || c5cVarZ2.E != yj6Var) {
                            i--;
                            c = 2;
                            c5cVar = yj6Var;
                        } else {
                            c5cVar = c5cVarZ2;
                        }
                    }
                }
                c = 1;
            } else {
                if (c != 1 || c5cVar.o() <= 0) {
                    m(c5cVar, i);
                    c5c c5cVarZ3 = c5cVar.z();
                    if (i == 0) {
                        if (c5cVarZ3 == null || c5cVarZ3 == c5cVarZ) {
                            return;
                        }
                    } else if (c5cVarZ3 == null) {
                        c5cVar = c5cVar.E;
                        i--;
                        c = 2;
                    }
                    c5cVar = c5cVarZ3;
                } else {
                    c5cVar = c5cVar.m(0);
                    i++;
                }
                c = 0;
            }
        }
    }

    default void m(c5c c5cVar, int i) {
    }
}
