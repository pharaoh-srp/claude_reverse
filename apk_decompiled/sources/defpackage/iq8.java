package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class iq8 {
    public xtc a;
    public vi2 b;
    public msh c;
    public o96 d;
    public ArrayList e;
    public String f;
    public hsh g;
    public wsc h;
    public f4h i;
    public dsh j;
    public hr8 l;
    public hr8 m;
    public boolean n;
    public yj6 o;
    public gw7 p;
    public yj6 q;
    public ArrayList r;
    public ArrayList s;
    public ArrayList t;
    public csh u;
    public boolean v;
    public boolean w;
    public boolean x;
    public static final String[] z = {"applet", "caption", "html", "marquee", "object", "table", "td", "template", "th"};
    public static final String[] A = {"annotation-xml", "mi", "mn", "mo", "ms", "mtext"};
    public static final String[] B = {"desc", "foreignobject", "title"};
    public static final String[] C = {"ol", "ul"};
    public static final String[] D = {"button"};
    public static final String[] E = {"html", "table"};
    public static final String[] F = {"optgroup", "option"};
    public static final String[] G = {"dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc"};
    public static final String[] H = {"caption", "colgroup", "dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] I = {"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "keygen", "li", "link", "listing", "main", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "search", "section", "select", "source", "style", "summary", "table", "tbody", "td", "template", "textarea", "tfoot", "th", "thead", "title", "tr", "track", "ul", "wbr", "xmp"};
    public static final String[] J = {"annotation-xml", "mi", "mn", "mo", "ms", "mtext"};
    public static final String[] K = {"mi", "mn", "mo", "ms", "mtext"};
    public static final String[] L = {"desc", "foreignObject", "title"};
    public static final String[] M = {"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};
    public final csh k = new csh(3, this);
    public final String[] y = {null};

    public static boolean B(yj6 yj6Var) {
        String str;
        z3h z3hVar = yj6Var.H;
        String str2 = z3hVar.E;
        str = z3hVar.G;
        str2.getClass();
        switch (str2) {
            case "http://www.w3.org/1999/xhtml":
                return xrg.d(str, I);
            case "http://www.w3.org/2000/svg":
                return xrg.d(str, L);
            case "http://www.w3.org/1998/Math/MathML":
                return xrg.d(str, J);
            default:
                return false;
        }
    }

    public static boolean D(ArrayList arrayList, yj6 yj6Var) {
        int size = arrayList.size();
        int i = size - 1;
        int i2 = i >= 256 ? size - 257 : 0;
        while (i >= i2) {
            if (((yj6) arrayList.get(i)) == yj6Var) {
                return true;
            }
            i--;
        }
        return false;
    }

    public final void A(dsh dshVar, boolean z2, boolean z3) {
        gw7 gw7Var = (gw7) g(dshVar, "http://www.w3.org/1999/xhtml", false);
        if (!z3 || !C("template")) {
            this.p = gw7Var;
        }
        j(gw7Var);
        if (z2) {
            return;
        }
        F();
    }

    public final boolean C(String str) {
        return o(str) != null;
    }

    public final boolean E(String[] strArr) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            if (!xrg.d(((yj6) this.e.get(size)).H.G, strArr)) {
                return true;
            }
        }
        return false;
    }

    public final yj6 F() {
        return (yj6) this.e.remove(this.e.size() - 1);
    }

    public final void G(String str) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            z3h z3hVar = F().H;
            if (z3hVar.G.equals(str) && z3hVar.E.equals("http://www.w3.org/1999/xhtml")) {
                return;
            }
        }
    }

    public final void H() {
        if (this.s.size() > 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean I(defpackage.hsh r11) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iq8.I(hsh):boolean");
    }

    public final boolean J(String str) {
        hsh hshVar = this.g;
        csh cshVar = this.k;
        if (hshVar == cshVar) {
            csh cshVar2 = new csh(3, this);
            cshVar2.j(str);
            return I(cshVar2);
        }
        cshVar.f();
        cshVar.j(str);
        return I(cshVar);
    }

    public final void K(String str) {
        dsh dshVar = this.j;
        if (this.g == dshVar) {
            dsh dshVar2 = new dsh(2, this);
            dshVar2.j(str);
            I(dshVar2);
        } else {
            dshVar.f();
            dshVar.j(str);
            I(dshVar);
        }
    }

    public final void L(hr8 hr8Var) {
        this.s.add(hr8Var);
    }

    public final void M() {
        yj6 yj6Var;
        if (this.e.size() > 256) {
            return;
        }
        boolean z2 = true;
        if (this.r.size() > 0) {
            ArrayList arrayList = this.r;
            yj6Var = (yj6) arrayList.get(arrayList.size() - 1);
        } else {
            yj6Var = null;
        }
        if (yj6Var == null || D(this.e, yj6Var)) {
            return;
        }
        int size = this.r.size();
        int i = size - 12;
        if (i < 0) {
            i = 0;
        }
        int i2 = size - 1;
        int i3 = i2;
        while (i3 != i) {
            i3--;
            yj6Var = (yj6) this.r.get(i3);
            if (yj6Var == null || D(this.e, yj6Var)) {
                z2 = false;
                break;
            }
        }
        while (true) {
            if (!z2) {
                i3++;
                yj6Var = (yj6) this.r.get(i3);
            }
            pqi.p(yj6Var);
            yj6 yj6Var2 = new yj6(this.i.d(yj6Var.A(), yj6Var.H.G, "http://www.w3.org/1999/xhtml", this.h.a), null, yj6Var.k().clone());
            j(yj6Var2);
            this.r.set(i3, yj6Var2);
            if (i3 == i2) {
                return;
            } else {
                z2 = false;
            }
        }
    }

    public final void N(yj6 yj6Var) {
        for (int size = this.r.size() - 1; size >= 0; size--) {
            if (((yj6) this.r.get(size)) == yj6Var) {
                this.r.remove(size);
                return;
            }
        }
    }

    public final void O(yj6 yj6Var) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            if (((yj6) this.e.get(size)) == yj6Var) {
                this.e.remove(size);
                return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0053. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:103:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean P() {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iq8.P():boolean");
    }

    public final z3h Q(dsh dshVar) {
        return this.i.d(dshVar.d.s(), dshVar.e, "http://www.w3.org/1999/xhtml", this.h.a);
    }

    public final yj6 a(yj6 yj6Var) {
        if (!D(this.e, yj6Var)) {
            return null;
        }
        for (int size = this.e.size() - 1; size > 0; size--) {
            if (((yj6) this.e.get(size)) == yj6Var) {
                return (yj6) this.e.get(size - 1);
            }
        }
        return null;
    }

    public final void b(yj6 yj6Var) {
        int size = this.r.size();
        int i = size - 13;
        int i2 = 0;
        if (i < 0) {
            i = 0;
        }
        for (int i3 = size - 1; i3 >= i; i3--) {
            yj6 yj6Var2 = (yj6) this.r.get(i3);
            if (yj6Var2 == null) {
                return;
            }
            if (yj6Var.H.G.equals(yj6Var2.H.G) && yj6Var.k().equals(yj6Var2.k())) {
                i2++;
            }
            if (i2 == 3) {
                this.r.remove(i3);
                return;
            }
        }
    }

    public final void c() {
        while (!this.r.isEmpty()) {
            int size = this.r.size();
            if ((size > 0 ? (yj6) this.r.remove(size - 1) : null) == null) {
                return;
            }
        }
    }

    public final void d(String... strArr) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            yj6 yj6Var = (yj6) this.e.get(size);
            if ("http://www.w3.org/1999/xhtml".equals(yj6Var.H.E) && (xrg.c(yj6Var.H.G, strArr) || yj6Var.w("html"))) {
                return;
            }
            F();
        }
    }

    public final void e() {
        d("table", "template");
    }

    public final void f() {
        d("tr", "template");
    }

    public final yj6 g(dsh dshVar, String str, boolean z2) {
        n31 n31Var = dshVar.g;
        if (n31Var != null && n31Var.size() != 0) {
            int i = 0;
            if (!z2 && !this.h.b) {
                for (int i2 = 0; i2 < n31Var.E; i2++) {
                    String str2 = n31Var.F[i2];
                    if (!n31.s(str2)) {
                        n31Var.F[i2] = ouk.g(str2);
                    }
                }
            }
            wsc wscVar = this.h;
            if (n31Var.E != 0) {
                boolean z3 = wscVar.b;
                int i3 = 0;
                while (i < n31Var.E) {
                    String str3 = n31Var.F[i];
                    i++;
                    int i4 = i;
                    while (i4 < n31Var.E) {
                        if ((z3 && str3.equals(n31Var.F[i4])) || (!z3 && str3.equalsIgnoreCase(n31Var.F[i4]))) {
                            i3++;
                            n31Var.u(i4);
                            i4--;
                        }
                        i4++;
                    }
                }
                i = i3;
            }
            if (i > 0) {
                l("Dropped duplicate attribute(s) in tag [%s]", dshVar.e);
            }
        }
        z3h z3hVarD = this.i.d(dshVar.d.s(), dshVar.e, str, (z2 ? wsc.d : this.h).a);
        return z3hVarD.G.equals("form") ? new gw7(z3hVarD, n31Var) : new yj6(z3hVarD, null, n31Var);
    }

    public final yj6 h() {
        int size = this.e.size();
        return size > 0 ? (yj6) this.e.get(size - 1) : this.d;
    }

    public final boolean i(String str) {
        yj6 yj6VarH;
        if (this.e.size() == 0 || (yj6VarH = h()) == null) {
            return false;
        }
        z3h z3hVar = yj6VarH.H;
        return z3hVar.G.equals(str) && z3hVar.E.equals("http://www.w3.org/1999/xhtml");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(defpackage.yj6 r6) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iq8.j(yj6):void");
    }

    public final void k(hr8 hr8Var) {
        if (this.a.F.a()) {
            this.a.F.add(new c88(this.b, "Unexpected %s token [%s] when in state [%s]", new Object[]{this.g.getClass().getSimpleName(), this.g, hr8Var}));
        }
    }

    public final void l(String str, Object... objArr) {
        vsc vscVar = this.a.F;
        if (vscVar.a()) {
            vscVar.add(new c88(this.b, str, objArr));
        }
    }

    public final void m(String str) {
        while (xrg.d(h().H.G, G)) {
            if (str != null && i(str)) {
                return;
            } else {
                F();
            }
        }
    }

    public final void n(boolean z2) {
        String[] strArr = z2 ? H : G;
        while ("http://www.w3.org/1999/xhtml".equals(h().H.E) && xrg.d(h().H.G, strArr)) {
            F();
        }
    }

    public final yj6 o(String str) {
        int size = this.e.size();
        int i = size - 1;
        int i2 = i >= 256 ? size - 257 : 0;
        while (i >= i2) {
            yj6 yj6Var = (yj6) this.e.get(i);
            z3h z3hVar = yj6Var.H;
            if (z3hVar.G.equals(str) && z3hVar.E.equals("http://www.w3.org/1999/xhtml")) {
                return yj6Var;
            }
            i--;
        }
        return null;
    }

    public final boolean p(String str) {
        String[] strArr = this.y;
        strArr[0] = str;
        return s(strArr, z, D);
    }

    public final boolean q(String str) {
        String[] strArr = this.y;
        strArr[0] = str;
        return s(strArr, z, null);
    }

    public final boolean r(String str) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            String str2 = ((yj6) this.e.get(size)).H.G;
            if (str2.equals(str)) {
                return true;
            }
            if (!xrg.d(str2, F)) {
                return false;
            }
        }
        return false;
    }

    public final boolean s(String[] strArr, String[] strArr2, String[] strArr3) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            z3h z3hVar = ((yj6) this.e.get(size)).H;
            String str = z3hVar.G;
            String str2 = z3hVar.E;
            if (str2.equals("http://www.w3.org/1999/xhtml")) {
                if (xrg.d(str, strArr)) {
                    return true;
                }
                if (xrg.d(str, strArr2)) {
                    return false;
                }
                if (strArr3 != null && xrg.d(str, strArr3)) {
                    return false;
                }
            } else if (strArr2 != z) {
                continue;
            } else {
                if (str2.equals("http://www.w3.org/1998/Math/MathML") && xrg.d(str, A)) {
                    return false;
                }
                if (str2.equals("http://www.w3.org/2000/svg") && xrg.d(str, B)) {
                    return false;
                }
            }
        }
        return false;
    }

    public final boolean t(String str) {
        String[] strArr = this.y;
        strArr[0] = str;
        return s(strArr, E, null);
    }

    public final String toString() {
        return "TreeBuilder{currentToken=" + this.g + ", state=" + this.l + ", currentElement=" + h() + '}';
    }

    public final void u(yrh yrhVar, boolean z2) {
        ire ireVar = yrhVar.d;
        String strS = ireVar.s();
        if (strS.indexOf(0) != -1) {
            String strReplace = z2 ? strS.replace((char) 0, (char) 65533) : strS.replace(yrh.e, "");
            ireVar.p();
            ireVar.F = strReplace;
        }
        v(yrhVar, h());
    }

    public final void v(yrh yrhVar, yj6 yj6Var) {
        String strS = yrhVar.d.s();
        yj6Var.O(yrhVar instanceof xrh ? new h42(strS) : yj6Var.H.b(FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) ? new xf5(strS) : new ikh(strS));
    }

    public final void w(zrh zrhVar) {
        h().O(new l74(zrhVar.d.s()));
    }

    public final yj6 x(dsh dshVar) {
        yj6 yj6VarG = g(dshVar, "http://www.w3.org/1999/xhtml", false);
        z3h z3hVar = yj6VarG.H;
        j(yj6VarG);
        if (dshVar.f) {
            z3hVar.H |= 32;
            if (!z3hVar.c()) {
                if ((z3hVar.H & 1) == 0 || !z3hVar.d()) {
                    msh mshVar = this.c;
                    Object[] objArr = {z3hVar.G};
                    vsc vscVar = mshVar.b;
                    if (vscVar.a()) {
                        vscVar.add(new c88(mshVar.a, "Tag [%s] cannot be self-closing; not a void tag", objArr));
                    }
                } else {
                    this.c.o(evh.E);
                    msh mshVar2 = this.c;
                    csh cshVar = this.u;
                    cshVar.f();
                    cshVar.j(z3hVar.F);
                    mshVar2.g(cshVar);
                }
            }
        }
        if (z3hVar.c()) {
            F();
        }
        return yj6VarG;
    }

    public final yj6 y(dsh dshVar) {
        yj6 yj6VarG = g(dshVar, "http://www.w3.org/1999/xhtml", false);
        j(yj6VarG);
        F();
        return yj6VarG;
    }

    public final void z(dsh dshVar, String str) {
        yj6 yj6VarG = g(dshVar, str, true);
        j(yj6VarG);
        if (dshVar.f) {
            yj6VarG.H.H |= 32;
            F();
        }
    }
}
