package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class b3h extends f0 {
    public final a3h a = new a3h();
    public final ArrayList b;
    public final ArrayList c;
    public boolean d;

    public b3h(ArrayList arrayList, xeg xegVar) {
        ArrayList arrayList2 = new ArrayList();
        this.b = arrayList2;
        this.d = true;
        this.c = arrayList;
        arrayList2.add(xegVar);
    }

    public static ArrayList j(CharSequence charSequence) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            f3h f3hVar = null;
            if (i >= charSequence.length()) {
                if (!z2) {
                    break;
                }
                return arrayList;
            }
            char cCharAt = charSequence.charAt(i);
            if (cCharAt == '\t' || cCharAt == ' ') {
                i++;
            } else {
                boolean z3 = true;
                if (cCharAt == '-' || cCharAt == ':') {
                    if (i2 == 0 && !arrayList.isEmpty()) {
                        break;
                    }
                    if (cCharAt == ':') {
                        i++;
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean z4 = false;
                    while (i < charSequence.length() && charSequence.charAt(i) == '-') {
                        i++;
                        z4 = true;
                    }
                    if (!z4) {
                        break;
                    }
                    if (i >= charSequence.length() || charSequence.charAt(i) != ':') {
                        z3 = false;
                    } else {
                        i++;
                    }
                    if (z && z3) {
                        f3hVar = f3h.F;
                    } else if (z) {
                        f3hVar = f3h.E;
                    } else if (z3) {
                        f3hVar = f3h.G;
                    }
                    arrayList.add(f3hVar);
                    i2 = 0;
                } else {
                    if (cCharAt != '|') {
                        break;
                    }
                    i++;
                    i2++;
                    if (i2 > 1) {
                        break;
                    }
                    z2 = true;
                }
            }
        }
        return null;
    }

    public static ArrayList m(xeg xegVar) {
        CharSequence charSequence = xegVar.a;
        int iR = ybi.r(0, charSequence.length(), charSequence);
        int length = charSequence.length();
        if (charSequence.charAt(iR) == '|') {
            iR++;
            length = ybi.s(charSequence.length() - 1, iR, charSequence) + 1;
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i = iR;
        while (iR < length) {
            char cCharAt = charSequence.charAt(iR);
            if (cCharAt == '\\') {
                int i2 = iR + 1;
                if (i2 >= length || charSequence.charAt(i2) != '|') {
                    sb.append('\\');
                } else {
                    sb.append('|');
                    iR = i2;
                }
            } else if (cCharAt != '|') {
                sb.append(cCharAt);
            } else {
                arrayList.add(new xeg(sb.toString(), xegVar.c(i, iR).b));
                sb.setLength(0);
                i = iR + 1;
            }
            iR++;
        }
        if (sb.length() > 0) {
            arrayList.add(new xeg(sb.toString(), xegVar.c(i, xegVar.a.length()).b));
        }
        return arrayList;
    }

    @Override // defpackage.f0
    public final void a(xeg xegVar) {
        this.b.add(xegVar);
    }

    @Override // defpackage.f0
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.f0
    public final jr1 f() {
        return this.a;
    }

    @Override // defpackage.f0
    public final void h(s39 s39Var) {
        a3h a3hVar = this.a;
        List listD = a3hVar.d();
        cfg cfgVar = !listD.isEmpty() ? (cfg) listD.get(0) : null;
        j3h j3hVar = new j3h();
        if (cfgVar != null) {
            j3hVar.b(cfgVar);
        }
        a3hVar.c(j3hVar);
        u3h u3hVar = new u3h();
        u3hVar.g(j3hVar.d());
        j3hVar.c(u3hVar);
        ArrayList arrayList = this.b;
        ArrayList arrayListM = m((xeg) arrayList.get(0));
        int size = arrayListM.size();
        for (int i = 0; i < size; i++) {
            g3h g3hVarL = l((xeg) arrayListM.get(i), i, s39Var);
            g3hVarL.g = true;
            u3hVar.c(g3hVarL);
        }
        int i2 = 2;
        c3h c3hVar = null;
        while (i2 < arrayList.size()) {
            xeg xegVar = (xeg) arrayList.get(i2);
            cfg cfgVar2 = i2 < listD.size() ? (cfg) listD.get(i2) : null;
            ArrayList arrayListM2 = m(xegVar);
            u3h u3hVar2 = new u3h();
            if (cfgVar2 != null) {
                u3hVar2.b(cfgVar2);
            }
            int i3 = 0;
            while (i3 < size) {
                u3hVar2.c(l(i3 < arrayListM2.size() ? (xeg) arrayListM2.get(i3) : new xeg("", null), i3, s39Var));
                i3++;
            }
            if (c3hVar == null) {
                c3hVar = new c3h();
                a3hVar.c(c3hVar);
            }
            c3hVar.c(u3hVar2);
            c3hVar.b(cfgVar2);
            i2++;
        }
    }

    @Override // defpackage.f0
    public final kr1 i(z96 z96Var) {
        CharSequence charSequence = z96Var.a.a;
        int iG = ybi.g('|', charSequence, z96Var.f);
        if (iG == -1) {
            return null;
        }
        if (iG != z96Var.f || ybi.r(iG + 1, charSequence.length(), charSequence) != charSequence.length()) {
            return kr1.a(z96Var.c);
        }
        this.d = false;
        return null;
    }

    public final g3h l(xeg xegVar, int i, s39 s39Var) {
        g3h g3hVar = new g3h();
        cfg cfgVar = xegVar.b;
        if (cfgVar != null) {
            g3hVar.b(cfgVar);
        }
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            g3hVar.h = (f3h) arrayList.get(i);
        }
        CharSequence charSequence = xegVar.a;
        int iR = ybi.r(0, charSequence.length(), charSequence);
        xeg xegVarC = xegVar.c(iR, ybi.s(charSequence.length() - 1, iR, charSequence) + 1);
        d80 d80Var = new d80(5);
        d80Var.F.add(xegVarC);
        s39Var.e(d80Var, g3hVar);
        return g3hVar;
    }
}
