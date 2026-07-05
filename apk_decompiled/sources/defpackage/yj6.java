package defpackage;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jsoup.helper.ValidationException;

/* JADX INFO: loaded from: classes3.dex */
public class yj6 extends c5c implements Iterable {
    public static final List K = Collections.EMPTY_LIST;
    public static final xj6 L = new xj6(0);
    public static final String M;
    public final z3h H;
    public xj6 I;
    public n31 J;

    static {
        Pattern.compile("\\s+");
        M = "/".concat("baseUri");
    }

    public yj6(z3h z3hVar, String str, n31 n31Var) {
        pqi.p(z3hVar);
        this.I = L;
        this.J = n31Var;
        this.H = z3hVar;
        if (xrg.f(str)) {
            return;
        }
        pqi.p(str);
        Y(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void U(java.lang.StringBuilder r4, defpackage.ikh r5) {
        /*
            java.lang.String r0 = r5.O()
            yj6 r1 = r5.E
            if (r1 == 0) goto L1b
            r2 = 0
        L9:
            z3h r3 = r1.H
            int r3 = r3.H
            r3 = r3 & 64
            if (r3 == 0) goto L12
            goto L1f
        L12:
            yj6 r1 = r1.E
            int r2 = r2 + 1
            r3 = 6
            if (r2 >= r3) goto L1b
            if (r1 != 0) goto L9
        L1b:
            boolean r5 = r5 instanceof defpackage.h42
            if (r5 == 0) goto L23
        L1f:
            r4.append(r0)
            return
        L23:
            boolean r5 = defpackage.ikh.V(r4)
            defpackage.xrg.a(r0, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj6.U(java.lang.StringBuilder, ikh):void");
    }

    @Override // defpackage.c5c
    public String A() {
        return this.H.F;
    }

    @Override // defpackage.c5c
    public final String B() {
        Stream map = this.I.stream().map(new a41(2));
        String[] strArr = xrg.a;
        return (String) map.collect(Collector.of(new trg(""), new urg(), new vrg(), new a41(7), new Collector.Characteristics[0]));
    }

    @Override // defpackage.c5c
    public final String C() {
        return this.H.G;
    }

    @Override // defpackage.c5c
    public void E(gjk gjkVar, n96 n96Var) {
        int i = n96Var.J;
        z3h z3hVar = this.H;
        String strA = i == 2 ? l31.a(2, z3hVar.F) : z3hVar.F;
        gjkVar.g('<').h(strA);
        n31 n31Var = this.J;
        if (n31Var != null) {
            n31Var.p(gjkVar, n96Var);
        }
        if (!this.I.isEmpty()) {
            gjkVar.g('>');
            return;
        }
        boolean z = i == 2 || !z3hVar.E.equals("http://www.w3.org/1999/xhtml");
        if (z && (z3hVar.b(32) || ((1 & z3hVar.H) != 0 && (z3hVar.c() || z3hVar.d())))) {
            gjkVar.h(" />");
        } else if (z || !z3hVar.c()) {
            gjkVar.h("></").h(strA).g('>');
        } else {
            gjkVar.g('>');
        }
    }

    @Override // defpackage.c5c
    public final yj6 G() {
        return this.E;
    }

    public final void O(c5c c5cVar) {
        pqi.p(c5cVar);
        yj6 yj6Var = c5cVar.E;
        if (yj6Var != null) {
            yj6Var.L(c5cVar);
        }
        c5cVar.E = this;
        s();
        this.I.add(c5cVar);
        c5cVar.F = this.I.size() - 1;
    }

    public final yj6 Q(String str) {
        String str2 = this.H.E;
        o96 o96VarF = F();
        xtc xtcVar = o96VarF != null ? o96VarF.O : new xtc(new iq8());
        f4h f4hVarB = xtcVar.b();
        wsc wscVar = xtcVar.G;
        f4hVarB.getClass();
        yj6 yj6Var = new yj6(f4hVarB.d(str, null, str2, wscVar.a), l(), null);
        O(yj6Var);
        return yj6Var;
    }

    public final List V() {
        List list;
        Integer num;
        n31 n31Var = this.J;
        if (n31Var != null && n31Var.o("/jsoup.userdata")) {
            Map mapV = this.J.v();
            WeakReference weakReference = (WeakReference) mapV.get("jsoup.childEls");
            if (weakReference != null && (list = (List) weakReference.get()) != null && (num = (Integer) mapV.get("jsoup.childElsMod")) != null && num.intValue() == this.I.b()) {
                return list;
            }
        }
        return null;
    }

    public final List W() {
        List listV;
        if (this.I.size() == 0) {
            return K;
        }
        synchronized (this.I) {
            try {
                listV = V();
                if (listV == null) {
                    listV = a0(yj6.class);
                    Map mapV = k().v();
                    mapV.put("jsoup.childEls", new WeakReference(listV));
                    mapV.put("jsoup.childElsMod", Integer.valueOf(this.I.b()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return listV;
    }

    @Override // defpackage.c5c
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public yj6 clone() {
        return (yj6) super.clone();
    }

    public final void Y(String str) {
        k().t(M, str);
    }

    public final int Z() {
        yj6 yj6Var = this.E;
        if (yj6Var == null) {
            return 0;
        }
        List listW = yj6Var.W();
        int size = listW.size();
        for (int i = 0; i < size; i++) {
            if (listW.get(i) == this) {
                return i;
            }
        }
        return 0;
    }

    public final List a0(Class cls) {
        int i = 1;
        return (List) this.I.stream().filter(new wj6(0, cls)).map(new mt5(i, cls)).collect(Collectors.collectingAndThen(Collectors.toList(), new a41(i)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final yj6 c0() {
        int size = this.I.size();
        for (int i = 0; i < size; i++) {
            c5c c5cVar = (c5c) this.I.get(i);
            if (c5cVar instanceof yj6) {
                return (yj6) c5cVar;
            }
        }
        return null;
    }

    public final boolean d0(String str) {
        String str2;
        n31 n31Var = this.J;
        if (n31Var == null) {
            return false;
        }
        String strM = n31Var.m("class");
        int length = strM.length();
        int length2 = str.length();
        if (length != 0 && length >= length2) {
            if (length == length2) {
                return str.equalsIgnoreCase(strM);
            }
            int i = 0;
            boolean z = false;
            int i2 = 0;
            while (i < length) {
                if (!Character.isWhitespace(strM.charAt(i))) {
                    str2 = str;
                    if (!z) {
                        i2 = i;
                        z = true;
                    }
                } else if (z) {
                    if (i - i2 == length2) {
                        str2 = str;
                        if (strM.regionMatches(true, i2, str2, 0, length2)) {
                            return true;
                        }
                    } else {
                        str2 = str;
                    }
                    z = false;
                } else {
                    str2 = str;
                }
                i++;
                str = str2;
            }
            String str3 = str;
            if (z && length - i2 == length2) {
                return strM.regionMatches(true, i2, str3, 0, length2);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [lrb] */
    /* JADX WARN: Type inference failed for: r6v2, types: [y5c] */
    /* JADX WARN: Type inference failed for: r6v3, types: [lrb, zfd] */
    public final String e0() {
        ?? lrbVar;
        StringBuilder sbB = xrg.b();
        c5c c5cVarT = t();
        if (c5cVarT != null) {
            gjk gjkVarM = gjk.m(sbB);
            o96 o96VarF = c5cVarT.F();
            if (o96VarF == null) {
                o96VarF = new o96("", 0);
            }
            n96 n96Var = o96VarF.N;
            n96Var.getClass();
            int i = 7;
            if (n96Var.G) {
                lrbVar = new zfd(c5cVarT, gjkVarM, n96Var, i);
                lrbVar.J = false;
                c5c c5cVar = c5cVarT;
                while (true) {
                    if (c5cVar != null) {
                        if ((c5cVar instanceof yj6) && ((yj6) c5cVar).H.b(64)) {
                            lrbVar.J = true;
                            break;
                        }
                        c5cVar = c5cVar.E;
                    } else {
                        break;
                    }
                }
            } else {
                lrbVar = new lrb(c5cVarT, gjkVarM, n96Var, i);
            }
            while (c5cVarT != null) {
                lrbVar.j(c5cVarT);
                c5cVarT = c5cVarT.z();
            }
        }
        String strK = xrg.k(sbB);
        o96 o96VarF2 = F();
        if (o96VarF2 == null) {
            o96VarF2 = new o96("", 0);
        }
        return o96VarF2.N.G ? strK.trim() : strK;
    }

    public final void f0(List list) {
        if (list == null) {
            throw new ValidationException("Children collection to be inserted must not be null.");
        }
        int size = this.I.size();
        pqi.l("Insert position out of bounds.", size >= 0);
        b(size, (c5c[]) list.toArray(new c5c[0]));
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        euk.s(this, yj6.class).forEach(consumer);
    }

    public final boolean g0() {
        return (this.H.H & 4) != 0;
    }

    public void h0(gjk gjkVar, n96 n96Var) {
        if (this.I.isEmpty()) {
            return;
        }
        gjk gjkVarH = gjkVar.h("</");
        int i = n96Var.J;
        z3h z3hVar = this.H;
        gjkVarH.h(i == 2 ? l31.a(2, z3hVar.F) : z3hVar.F).g('>');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String i0() {
        StringBuilder sbB = xrg.b();
        for (int i = 0; i < this.I.size(); i++) {
            c5c c5cVar = (c5c) this.I.get(i);
            if (c5cVar instanceof ikh) {
                U(sbB, (ikh) c5cVar);
            } else if (c5cVar.w("br") && !ikh.V(sbB)) {
                sbB.append(" ");
            }
        }
        return xrg.k(sbB).trim();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new r5c(this, yj6.class);
    }

    public yj6 j0() {
        String strL = l();
        if (strL.isEmpty()) {
            strL = null;
        }
        n31 n31Var = this.J;
        return new yj6(this.H, strL, n31Var != null ? n31Var.clone() : null);
    }

    @Override // defpackage.c5c
    public final n31 k() {
        if (this.J == null) {
            this.J = new n31();
        }
        return this.J;
    }

    public final String k0() {
        StringBuilder sbB = xrg.b();
        new poj(sbB).j(this);
        return xrg.k(sbB).trim();
    }

    @Override // defpackage.c5c
    public final String l() {
        String strL;
        while (true) {
            if (this == null) {
                strL = null;
                break;
            }
            n31 n31Var = this.J;
            if (n31Var != null) {
                String str = M;
                if (n31Var.o(str)) {
                    strL = this.J.l(str);
                    break;
                }
            }
            this = this.E;
        }
        return strL != null ? strL : "";
    }

    @Override // defpackage.c5c
    public final int o() {
        return this.I.size();
    }

    @Override // defpackage.c5c
    public final c5c r(c5c c5cVar) {
        yj6 yj6Var = (yj6) super.r(c5cVar);
        xj6 xj6Var = new xj6(this.I.size());
        yj6Var.I = xj6Var;
        xj6Var.addAll(this.I);
        n31 n31Var = this.J;
        if (n31Var != null) {
            n31 n31VarK = n31Var.clone();
            yj6Var.J = n31VarK;
            if (n31VarK.o("/jsoup.userdata")) {
                n31VarK.v().remove("jsoup.childEls");
            }
        }
        return yj6Var;
    }

    @Override // defpackage.c5c
    public final List s() {
        if (this.I == L) {
            this.I = new xj6(4);
        }
        return this.I;
    }

    @Override // defpackage.c5c
    public final boolean v() {
        return this.J != null;
    }
}
