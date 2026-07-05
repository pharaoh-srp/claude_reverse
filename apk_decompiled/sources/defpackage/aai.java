package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class aai {
    public final wk a;
    public final aai b;
    public final String c;
    public final String d;
    public final efa e;
    public final efa f;
    public final Map g;

    public aai(wk wkVar, aai aaiVar, List list, String str, String str2) {
        Map linkedHashMap;
        list.getClass();
        this.a = wkVar;
        this.b = aaiVar;
        this.c = str;
        this.d = str2;
        gfa gfaVar = ((r06) wkVar.d).a;
        int i = 0;
        this.e = gfaVar.c(new x9i(this, i));
        this.f = gfaVar.c(new x9i(this, 1));
        if (list.isEmpty()) {
            linkedHashMap = nm6.E;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                std stdVar = (std) it.next();
                linkedHashMap.put(Integer.valueOf(stdVar.H), new r16(this.a, stdVar, i));
                i++;
            }
        }
        this.g = linkedHashMap;
    }

    public static j7g a(j7g j7gVar, yr9 yr9Var) {
        or9 or9VarX = jwk.x(j7gVar);
        wc0 annotations = j7gVar.getAnnotations();
        yr9 yr9VarM = cpk.m(j7gVar);
        List listK = cpk.k(j7gVar);
        List listJ0 = w44.J0(1, cpk.o(j7gVar));
        ArrayList arrayList = new ArrayList(x44.y(listJ0, 10));
        Iterator it = listJ0.iterator();
        while (it.hasNext()) {
            arrayList.add(((vai) it.next()).b());
        }
        return cpk.h(or9VarX, annotations, yr9VarM, listK, arrayList, yr9Var, true).l0(j7gVar.b0());
    }

    public static final ArrayList e(ntd ntdVar, aai aaiVar) {
        List list = ntdVar.H;
        list.getClass();
        List list2 = list;
        ntd ntdVarL = ajk.l(ntdVar, (cbi) aaiVar.a.f);
        Iterable iterableE = ntdVarL != null ? e(ntdVarL, aaiVar) : null;
        if (iterableE == null) {
            iterableE = lm6.E;
        }
        return w44.a1(list2, iterableE);
    }

    public static r9i f(List list, wc0 wc0Var) {
        r9i r9iVarB;
        List list2 = list;
        ArrayList arrayList = new ArrayList(x44.y(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            ((mv5) it.next()).getClass();
            if (wc0Var.isEmpty()) {
                r9i.F.getClass();
                r9iVarB = r9i.G;
            } else {
                cbf cbfVar = r9i.F;
                List listW = x44.W(new yc0(wc0Var));
                cbfVar.getClass();
                r9iVarB = cbf.b(listW);
            }
            arrayList.add(r9iVarB);
        }
        ArrayList arrayListG = x44.G(arrayList);
        r9i.F.getClass();
        return cbf.b(arrayListG);
    }

    public static final qqb h(aai aaiVar, ntd ntdVar, int i) {
        wk wkVar = aaiVar.a;
        gh3 gh3VarU = iv1.u((txb) wkVar.e, i);
        l5i l5iVarB0 = bnf.b0(bnf.Z(new z9i(0, aaiVar), ntdVar), pgg.K);
        ArrayList arrayList = new ArrayList();
        Iterator it = l5iVarB0.iterator();
        while (true) {
            k5i k5iVar = (k5i) it;
            if (!k5iVar.hasNext()) {
                break;
            }
            arrayList.add(k5iVar.next());
        }
        int iT = bnf.T(bnf.Z(y9i.E, gh3VarU));
        while (arrayList.size() < iT) {
            arrayList.add(0);
        }
        return ((r06) wkVar.d).l.H(gh3VarU, arrayList);
    }

    public final List b() {
        return w44.p1(this.g.values());
    }

    public final qai c(int i) {
        qai qaiVar = (qai) this.g.get(Integer.valueOf(i));
        if (qaiVar != null) {
            return qaiVar;
        }
        aai aaiVar = this.b;
        if (aaiVar != null) {
            return aaiVar.c(i);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.j7g d(defpackage.ntd r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 869
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aai.d(ntd, boolean):j7g");
    }

    public final yr9 g(ntd ntdVar) {
        ntdVar.getClass();
        if ((ntdVar.G & 2) != 2) {
            return d(ntdVar, true);
        }
        wk wkVar = this.a;
        String string = ((txb) wkVar.e).getString(ntdVar.J);
        j7g j7gVarD = d(ntdVar, true);
        ntd ntdVarH = ajk.h(ntdVar, (cbi) wkVar.f);
        ntdVarH.getClass();
        return ((r06) wkVar.d).j.A(ntdVar, string, j7gVarD, d(ntdVarH, true));
    }

    public final String toString() {
        aai aaiVar = this.b;
        return this.c.concat(aaiVar == null ? "" : ". Child of ".concat(aaiVar.c));
    }
}
