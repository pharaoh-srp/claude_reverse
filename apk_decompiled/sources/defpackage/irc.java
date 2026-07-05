package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class irc extends f0 {
    public final arc a = new arc();
    public final z6a b = new z6a();

    @Override // defpackage.f0
    public final void a(xeg xegVar) {
        String str;
        z6a z6aVar = this.b;
        ArrayList arrayList = z6aVar.b;
        arrayList.add(xegVar);
        if (z6aVar.a == 6) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(xegVar);
        t6f t6fVar = new t6f(arrayList2);
        while (t6fVar.f()) {
            int iF = sq6.F(z6aVar.a);
            if (iF == 0) {
                t6fVar.s();
                if (!t6fVar.k('[')) {
                    z6aVar.a = 6;
                    return;
                }
                z6aVar.a = 2;
                z6aVar.e = new StringBuilder();
                if (!t6fVar.f()) {
                    z6aVar.e.append('\n');
                }
            } else {
                if (iF == 1) {
                    l42 l42VarQ = t6fVar.q();
                    if (bwj.n(t6fVar)) {
                        z6aVar.e.append(t6fVar.e(l42VarQ, t6fVar.q()).g());
                        if (!t6fVar.f()) {
                            z6aVar.e.append('\n');
                        } else if (t6fVar.k(']') && t6fVar.k(':') && z6aVar.e.length() <= 999 && !pu6.b(z6aVar.e.toString()).isEmpty()) {
                            z6aVar.a = 3;
                            t6fVar.s();
                        }
                    }
                    z6aVar.a = 6;
                    return;
                }
                if (iF == 2) {
                    t6fVar.s();
                    l42 l42VarQ2 = t6fVar.q();
                    if (bwj.m(t6fVar)) {
                        String strG = t6fVar.e(l42VarQ2, t6fVar.q()).g();
                        if (strG.startsWith("<")) {
                            strG = vb7.j(1, 1, strG);
                        }
                        z6aVar.f = strG;
                        int iS = t6fVar.s();
                        if (!t6fVar.f()) {
                            z6aVar.i = true;
                            arrayList.clear();
                        } else if (iS == 0) {
                        }
                        z6aVar.a = 4;
                    }
                    z6aVar.a = 6;
                    return;
                }
                if (iF != 3) {
                    if (iF == 4) {
                        l42 l42VarQ3 = t6fVar.q();
                        if (bwj.p(t6fVar, z6aVar.g)) {
                            z6aVar.h.append(t6fVar.e(l42VarQ3, t6fVar.q()).g());
                            if (t6fVar.f()) {
                                t6fVar.j();
                                t6fVar.s();
                                if (!t6fVar.f()) {
                                    z6aVar.i = true;
                                    z6aVar.a();
                                    arrayList.clear();
                                    z6aVar.a = 1;
                                }
                            } else {
                                z6aVar.h.append('\n');
                            }
                        }
                        z6aVar.a = 6;
                        return;
                    }
                    switch (z6aVar.a) {
                        case 1:
                            str = "START_DEFINITION";
                            break;
                        case 2:
                            str = "LABEL";
                            break;
                        case 3:
                            str = "DESTINATION";
                            break;
                        case 4:
                            str = "START_TITLE";
                            break;
                        case 5:
                            str = "TITLE";
                            break;
                        case 6:
                            str = "PARAGRAPH";
                            break;
                        default:
                            str = "null";
                            break;
                    }
                    sz6.j("Unknown parsing state: ".concat(str));
                    return;
                }
                t6fVar.s();
                if (t6fVar.f()) {
                    z6aVar.g = (char) 0;
                    char cN = t6fVar.n();
                    if (cN == '\"' || cN == '\'') {
                        z6aVar.g = cN;
                    } else if (cN == '(') {
                        z6aVar.g = ')';
                    }
                    if (z6aVar.g != 0) {
                        z6aVar.a = 5;
                        z6aVar.h = new StringBuilder();
                        t6fVar.j();
                        if (!t6fVar.f()) {
                            z6aVar.h.append('\n');
                        }
                    } else {
                        z6aVar.a();
                        z6aVar.a = 1;
                    }
                } else {
                    z6aVar.a = 1;
                }
            }
        }
    }

    @Override // defpackage.f0
    public final void b(cfg cfgVar) {
        this.b.d.add(cfgVar);
    }

    @Override // defpackage.f0
    public final void e() {
        z6a z6aVar = this.b;
        ArrayList arrayList = z6aVar.b;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        boolean zIsEmpty = arrayList2.isEmpty();
        arc arcVar = this.a;
        if (zIsEmpty) {
            arcVar.i();
        } else {
            arcVar.g(z6aVar.d);
        }
    }

    @Override // defpackage.f0
    public final jr1 f() {
        return this.a;
    }

    @Override // defpackage.f0
    public final void h(s39 s39Var) {
        ArrayList arrayList = this.b.b;
        d80 d80Var = new d80(5);
        ArrayList arrayList2 = d80Var.F;
        arrayList2.addAll(arrayList);
        if (arrayList2.isEmpty()) {
            return;
        }
        s39Var.e(d80Var, this.a);
    }

    @Override // defpackage.f0
    public final kr1 i(z96 z96Var) {
        if (z96Var.i) {
            return null;
        }
        return kr1.a(z96Var.c);
    }

    public final ArrayList j() {
        z6a z6aVar = this.b;
        z6aVar.a();
        return z6aVar.c;
    }
}
