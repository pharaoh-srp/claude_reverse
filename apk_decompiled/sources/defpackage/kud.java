package defpackage;

import androidx.compose.foundation.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import okio.Path;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kud {
    public static final String[] a = {"base", "basefont", "bgsound", "command", "link"};
    public static final String[] b = {"noframes", "style"};
    public static final String[] c = {"body", "br", "html"};
    public static final String[] d = {"body", "br", "html"};
    public static final String[] e = {"body", "br", "head", "html"};
    public static final String[] f = {"basefont", "bgsound", "link", "meta", "noframes", "style"};
    public static final String[] g = {"base", "basefont", "bgsound", "command", "link", "meta", "noframes", "script", "style", "template", "title"};
    public static final String[] h = {"address", "article", "aside", "blockquote", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "menu", "nav", "ol", "p", "section", "summary", "ul"};
    public static final String[] i = {"h1", "h2", "h3", "h4", "h5", "h6"};
    public static final String[] j = {"address", "div", "p"};
    public static final String[] k = {"dd", "dt"};
    public static final String[] l = {"applet", "marquee", "object"};
    public static final String[] m = {"param", "source", "track"};
    public static final String[] n = {"caption", "col", "colgroup", "frame", "head", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] o = {"address", "article", "aside", "blockquote", "button", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "listing", "menu", "nav", "ol", "pre", "section", "summary", "ul"};
    public static final String[] p = {"body", "dd", "dt", "html", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] q = {"a", "b", "big", "code", "em", "font", "i", "nobr", "s", "small", "strike", "strong", "tt", "u"};
    public static final String[] r = {"tbody", "tfoot", "thead"};
    public static final String[] s = {"td", "th", "tr"};
    public static final String[] t = {"script", "style", "template"};
    public static final String[] u = {"td", "th"};
    public static final String[] v = {"body", "caption", "col", "colgroup", "html"};
    public static final String[] w = {"table", "tbody", "tfoot", "thead", "tr"};
    public static final String[] x = {"caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] y = {"body", "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] z = {"table", "tbody", "tfoot", "thead", "tr"};
    public static final String[] A = {"caption", "col", "colgroup", "tbody", "tfoot", "thead"};
    public static final String[] B = {"body", "caption", "col", "colgroup", "html", "td", "th", "tr"};
    public static final String[] C = {"caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr"};
    public static final String[] D = {"body", "caption", "col", "colgroup", "html", "td", "th"};
    public static final String[] E = {"input", "keygen", "textarea"};
    public static final String[] F = {"caption", "table", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] G = {"tbody", "tfoot", "thead"};
    public static final String[] H = {"head", "noscript"};
    public static final String[] I = {"body", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] J = {"base", "basefont", "bgsound", "link", "meta", "noframes", "script", "style", "template", "title"};
    public static final String[] K = {"caption", "colgroup", "tbody", "tfoot", "thead"};
    public static final String[] L = {"b", "big", "blockquote", "body", "br", "center", "code", "dd", "div", "dl", "dt", "em", "embed", "h1", "h2", "h3", "h4", "h5", "h6", "head", "hr", "i", "img", "li", "listing", "menu", "meta", "nobr", "ol", "p", "pre", "ruby", "s", "small", "span", "strike", "strong", "sub", "sup", "table", "tt", "u", "ul", "var"};

    public static final void a(q68 q68Var, st stVar, ta4 ta4Var, ld4 ld4Var, int i2) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(227045628);
        if ((((e18Var.f(q68Var) ? 4 : 2) | i2 | (e18Var.f(stVar) ? 32 : 16)) & 147) == 146 && e18Var.C()) {
            e18Var.T();
        } else {
            e18Var.b0(1849434622);
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = bw1.E;
                e18Var.k0(objN);
            }
            e18Var.p(false);
            zy7 zy7Var = (zy7) ((jm9) objN);
            e18Var.b0(-683746039);
            e18Var.b0(-548224868);
            if (!(e18Var.a instanceof gn0)) {
                iuj.A();
                throw null;
            }
            e18Var.Y();
            if (e18Var.S) {
                e18Var.k(zy7Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, new te(10), q68Var);
            d4c.i0(e18Var, new te(11), stVar);
            ta4Var.invoke(e18Var, 6);
            e18Var.p(true);
            e18Var.p(false);
            e18Var.p(false);
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new m6(q68Var, i2, stVar, ta4Var, 16);
        }
    }

    public static final void b(bpc bpcVar, String str, ta4 ta4Var, iqb iqbVar, String str2, boolean z2, nxf nxfVar, oxf oxfVar, mnc mncVar, float f2, wo1 wo1Var, mnc mncVar2, float f3, long j2, tkh tkhVar, int i2, tkh tkhVar2, int i3, ld4 ld4Var, int i4, int i5) {
        int i6;
        int i7;
        e18 e18Var;
        float f4;
        tkh tkhVar3;
        tkh tkhVar4;
        int i8;
        tkh tkhVar5;
        tkh tkhVar6;
        int i9;
        float f5;
        int i10;
        nxf nxfVar2;
        int i11;
        tkh tkhVar7;
        ta4 ta4Var2;
        bpcVar.getClass();
        str.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(738791907);
        if ((i4 & 6) == 0) {
            i6 = ((i4 & 8) == 0 ? e18Var2.f(bpcVar) : e18Var2.h(bpcVar) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= e18Var2.f(str) ? 32 : 16;
        }
        int i12 = i4 & 384;
        int i13 = FreeTypeConstants.FT_LOAD_PEDANTIC;
        if (i12 == 0) {
            i6 |= e18Var2.h(ta4Var) ? 256 : 128;
        }
        int i14 = i4 & 3072;
        int i15 = FreeTypeConstants.FT_LOAD_NO_RECURSE;
        if (i14 == 0) {
            i6 |= e18Var2.f(iqbVar) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= e18Var2.h(null) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((i4 & 196608) == 0) {
            i6 |= e18Var2.f(str2) ? 131072 : 65536;
        }
        if ((i4 & 1572864) == 0) {
            i6 |= e18Var2.g(z2) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i6 |= e18Var2.h(null) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i6 |= (i4 & 134217728) == 0 ? e18Var2.f(nxfVar) : e18Var2.h(nxfVar) ? 67108864 : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i6 |= e18Var2.f(oxfVar) ? 536870912 : 268435456;
        }
        int i16 = i6;
        if ((i5 & 6) == 0) {
            i7 = i5 | (e18Var2.f(mncVar) ? 4 : 2);
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= e18Var2.c(f2) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            if (e18Var2.f(wo1Var)) {
                i13 = 256;
            }
            i7 |= i13;
        }
        if ((i5 & 3072) == 0) {
            if (e18Var2.f(mncVar2)) {
                i15 = 2048;
            }
            i7 |= i15;
        }
        int i17 = i7;
        if ((i5 & 24576) == 0) {
            i17 |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((i5 & 196608) == 0) {
            i17 |= e18Var2.e(j2) ? 131072 : 65536;
        }
        if ((i5 & 1572864) == 0) {
            i17 |= 524288;
        }
        if ((i5 & 12582912) == 0) {
            i17 |= e18Var2.d(i2) ? 8388608 : 4194304;
        }
        if ((i5 & 100663296) == 0) {
            i17 |= 33554432;
        }
        int i18 = i17 | 805306368;
        int i19 = 0;
        if (e18Var2.Q(i16 & 1, ((i16 & 306783379) == 306783378 && (i18 & 306783379) == 306783378) ? false : true)) {
            e18Var2.V();
            if ((i4 & 1) == 0 || e18Var2.A()) {
                tkhVar5 = ((jm3) gm3.c(e18Var2).e.E).e;
                tkhVar6 = ((jm3) gm3.c(e18Var2).e.E).g;
                i9 = i18 & (-238608385);
                f5 = 10.0f;
                i10 = 1;
            } else {
                e18Var2.T();
                int i20 = i18 & (-238608385);
                f5 = f3;
                tkhVar5 = tkhVar;
                tkhVar6 = tkhVar2;
                i10 = i3;
                i9 = i20;
            }
            e18Var2.q();
            Object[] objArr = new Object[0];
            Object objN = e18Var2.N();
            Object obj = jd4.a;
            if (objN == obj) {
                objN = new ztf(5);
                e18Var2.k0(objN);
            }
            nwb nwbVar = (nwb) iuj.I(objArr, (zy7) objN, e18Var2, 48);
            if (str2 != null) {
                e18Var2.a0(1938926617);
                nxfVar2 = nxfVar;
                i11 = i10;
                tkhVar7 = tkhVar6;
                ta4 ta4VarQ0 = fd9.q0(303289001, new en3(str2, nxfVar, z2, i10, tkhVar6), e18Var2);
                e18Var2.p(false);
                ta4Var2 = ta4VarQ0;
            } else {
                nxfVar2 = nxfVar;
                i11 = i10;
                tkhVar7 = tkhVar6;
                e18Var2.a0(1939246723);
                e18Var2.p(false);
                ta4Var2 = null;
            }
            long jA = nxfVar2.a(z2);
            iqb iqbVarP = ybi.p(iqbVar, oxfVar);
            boolean zF = e18Var2.f(nwbVar) | ((i16 & 29360128) == 8388608);
            Object objN2 = e18Var2.N();
            if (zF || objN2 == obj) {
                objN2 = new k3c(29, nwbVar);
                e18Var2.k0(objN2);
            }
            tkh tkhVar8 = tkhVar5;
            int i21 = i9 << 18;
            float f6 = f5;
            ybi.b(fd9.q0(1344532108, new hxf(bpcVar, nxfVar2, z2, mncVar2, j2, 1), e18Var2), fd9.q0(2076707563, new ff2(str, mncVar2, j2, tkhVar5, i2), e18Var2), b.c(iqbVarP, z2, null, null, null, (zy7) objN2, 14), ta4Var2, null, jA, mncVar, f2, wo1Var, f6, MTTypesetterKt.kLineSkipLimitMultiplier, false, null, null, e18Var2, (i21 & 234881024) | (3670016 & i21) | 54 | (i21 & 29360128), 0, 15376);
            e18Var = e18Var2;
            if (((Boolean) nwbVar.getValue()).booleanValue()) {
                e18Var.a0(1939715753);
                boolean zF2 = e18Var.f(nwbVar);
                Object objN3 = e18Var.N();
                if (zF2 || objN3 == obj) {
                    objN3 = new lxf(i19, nwbVar);
                    e18Var.k0(objN3);
                }
                ta4Var.invoke((zy7) objN3, e18Var, Integer.valueOf((i16 >> 3) & 112));
                e18Var.p(false);
            } else {
                e18Var.a0(1939798399);
                e18Var.p(false);
            }
            tkhVar3 = tkhVar8;
            f4 = f6;
            i8 = i11;
            tkhVar4 = tkhVar7;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            f4 = f3;
            tkhVar3 = tkhVar;
            tkhVar4 = tkhVar2;
            i8 = i3;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new jxf(bpcVar, str, ta4Var, iqbVar, str2, z2, nxfVar, oxfVar, mncVar, f2, wo1Var, mncVar2, f4, j2, tkhVar3, i2, tkhVar4, i8, i4, i5);
        }
    }

    public static dli c(String str) {
        String str2 = Path.F;
        StringBuilder sb = new StringBuilder();
        sb.append("file");
        sb.append(':');
        if (str != null) {
            sb.append(str);
        }
        return new dli(sb.toString(), str2, "file", null, str);
    }

    public static final iqb d(iqb iqbVar, float f2, boolean z2) {
        return iqbVar.B(new uw0(f2, z2));
    }

    public static final auc f(List list) {
        dae daeVar = new dae();
        lm6 lm6Var = lm6.E;
        daeVar.E = new auc(lm6Var, lm6Var);
        ArrayList arrayList = new ArrayList();
        Iterator it = new mva(list).iterator();
        while (true) {
            ListIterator listIterator = ((fse) it).E;
            if (!listIterator.hasPrevious()) {
                g(arrayList, daeVar);
                return (auc) daeVar.E;
            }
            auc aucVar = (auc) listIterator.previous();
            if (aucVar.b.isEmpty()) {
                arrayList.add(aucVar.a);
            } else {
                g(arrayList, daeVar);
                daeVar.E = i(aucVar, (auc) daeVar.E);
            }
        }
    }

    public static final void g(ArrayList arrayList, dae daeVar) {
        if (arrayList.isEmpty()) {
            return;
        }
        d8a d8aVarE = x44.E();
        Iterator it = new ese(arrayList).iterator();
        while (true) {
            ListIterator listIterator = (ListIterator) ((dse) it).F;
            if (!listIterator.hasPrevious()) {
                daeVar.E = i(new auc(x44.v(d8aVarE), lm6.E), (auc) daeVar.E);
                arrayList.clear();
                return;
            }
            d8aVarE.addAll((List) listIterator.previous());
        }
    }

    public static final auc h(List list, ArrayList arrayList, ArrayList arrayList2, auc aucVar) {
        List list2 = aucVar.a;
        ztc ztcVar = (ztc) w44.N0(list2);
        d8a d8aVarE = x44.E();
        d8aVarE.addAll(list);
        if (arrayList == null) {
            d8aVarE.addAll(list2);
        } else if (ztcVar instanceof bac) {
            d8aVarE.add(new bac(w44.a1(arrayList, ((bac) ztcVar).a)));
            int i2 = 1;
            int size = list2.size() - 1;
            if (1 <= size) {
                while (true) {
                    d8aVarE.add(list2.get(i2));
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            d8aVarE.add(new bac(arrayList));
            d8aVarE.addAll(list2);
        }
        d8aVarE.addAll(arrayList2);
        return new auc(x44.v(d8aVarE), aucVar.b);
    }

    public static final auc i(auc aucVar, auc aucVar2) {
        List listW;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayListQ1 = null;
        for (ztc ztcVar : aucVar.a) {
            if (ztcVar instanceof bac) {
                if (arrayListQ1 != null) {
                    arrayListQ1.addAll(((bac) ztcVar).a);
                } else {
                    arrayListQ1 = w44.q1(((bac) ztcVar).a);
                }
            } else if (ztcVar instanceof vdi) {
                arrayList2.add(ztcVar);
            } else {
                if (arrayListQ1 != null) {
                    arrayList.add(new bac(arrayListQ1));
                    arrayList.addAll(arrayList2);
                    arrayList2.clear();
                    arrayListQ1 = null;
                }
                arrayList.add(ztcVar);
            }
        }
        List list = aucVar.b;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            auc aucVarI = i((auc) it.next(), aucVar2);
            if (aucVarI.a.isEmpty()) {
                List listW2 = aucVarI.b;
                if (listW2.isEmpty()) {
                    listW2 = x44.W(aucVarI);
                }
                listW = listW2;
            } else {
                listW = x44.W(aucVarI);
            }
            b54.t0(arrayList3, listW);
        }
        boolean zIsEmpty = arrayList3.isEmpty();
        List list2 = arrayList3;
        if (zIsEmpty) {
            if (!aucVar2.a.isEmpty()) {
                return h(arrayList, arrayListQ1, arrayList2, aucVar2);
            }
            list2 = aucVar2.b;
        }
        List list3 = list2;
        if (arrayListQ1 != null || arrayList.isEmpty()) {
            List list4 = list3;
            if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    if (w44.N0(((auc) it2.next()).a) instanceof bac) {
                        ArrayList arrayList4 = new ArrayList(x44.y(list4, 10));
                        Iterator it3 = list4.iterator();
                        while (it3.hasNext()) {
                            arrayList4.add(h(lm6.E, arrayListQ1, arrayList2, (auc) it3.next()));
                        }
                        return new auc(arrayList, arrayList4);
                    }
                }
            }
        }
        if (arrayListQ1 != null) {
            arrayList.add(new bac(arrayListQ1));
        }
        arrayList.addAll(arrayList2);
        return new auc(arrayList, list3);
    }

    public static final String j(dli dliVar) {
        List listM = m(dliVar);
        String str = dliVar.b;
        if (listM.isEmpty()) {
            return null;
        }
        String str2 = dliVar.e;
        str2.getClass();
        if (!isg.q0(str2, str, false)) {
            str = "";
        }
        return w44.S0(listM, dliVar.b, str, null, null, 60);
    }

    public static final pl9 k(cm9 cm9Var) {
        if (cm9Var instanceof pl9) {
            return (pl9) cm9Var;
        }
        Object obj = null;
        if (!(cm9Var instanceof go9)) {
            rl7.n("Cannot calculate JVM erasure for type: ", cm9Var);
            return null;
        }
        ece eceVar = ((go9) cm9Var).F;
        wn9 wn9Var = go9.H[0];
        Object objA = eceVar.a();
        objA.getClass();
        List list = (List) objA;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            eo9 eo9Var = (eo9) next;
            eo9Var.getClass();
            xh3 xh3VarA = ((fo9) eo9Var).E.O().a();
            qqb qqbVar = xh3VarA instanceof qqb ? (qqb) xh3VarA : null;
            if (qqbVar != null && qqbVar.m() != 2 && qqbVar.m() != 5) {
                obj = next;
                break;
            }
        }
        eo9 eo9Var2 = (eo9) obj;
        if (eo9Var2 == null) {
            eo9Var2 = (eo9) w44.N0(list);
        }
        return eo9Var2 != null ? l(eo9Var2) : jce.a.b(Object.class);
    }

    public static final pl9 l(eo9 eo9Var) {
        cm9 cm9VarH = eo9Var.h();
        if (cm9VarH != null) {
            return k(cm9VarH);
        }
        rl7.n("Cannot calculate JVM erasure for type: ", eo9Var);
        return null;
    }

    public static final List m(dli dliVar) {
        String str = dliVar.e;
        if (str == null) {
            return lm6.E;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = -1;
        while (i2 < str.length()) {
            int i3 = i2 + 1;
            int iF0 = bsg.F0(str, '/', i3, 4);
            if (iF0 == -1) {
                iF0 = str.length();
            }
            String strSubstring = str.substring(i3, iF0);
            if (strSubstring.length() > 0) {
                arrayList.add(strSubstring);
            }
            i2 = iF0;
        }
        return arrayList;
    }

    public static final boolean n(int i2, int i3, long j2) {
        int iJ = rl4.j(j2);
        if (i2 > rl4.h(j2) || iJ > i2) {
            return false;
        }
        return i3 <= rl4.g(j2) && rl4.i(j2) <= i3;
    }

    public static final String o(String str, byte[] bArr) {
        int length = str.length();
        int iMax = Math.max(0, length - 2);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= iMax) {
                if (i2 == i3) {
                    return str;
                }
                if (i2 >= length) {
                    return isg.f0(0, i3, 5, bArr);
                }
            } else if (str.charAt(i2) == '%') {
                int i4 = i2 + 3;
                try {
                    String strSubstring = str.substring(i2 + 1, i4);
                    gb9.q(16);
                    bArr[i3] = (byte) Integer.parseInt(strSubstring, 16);
                    i3++;
                    i2 = i4;
                } catch (NumberFormatException unused) {
                    bArr[i3] = (byte) str.charAt(i2);
                    i3++;
                    i2++;
                }
            }
            bArr[i3] = (byte) str.charAt(i2);
            i3++;
            i2++;
        }
    }

    public static dli p(String str) {
        String strSubstring;
        String strSubstring2;
        String str2 = Path.F;
        String strN0 = !x44.r(str2, "/") ? isg.n0(str, str2, "/", false) : str;
        boolean z2 = true;
        int i2 = 0;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        while (i2 < strN0.length()) {
            char cCharAt = strN0.charAt(i2);
            if (cCharAt != '#') {
                if (cCharAt != '/') {
                    if (cCharAt != ':') {
                        if (cCharAt == '?' && i5 == -1 && i3 == -1) {
                            i5 = i2 + 1;
                        }
                    } else if (z2 && i5 == -1 && i3 == -1) {
                        int i8 = i2 + 2;
                        if (i8 < str.length() && str.charAt(i2 + 1) == '/' && str.charAt(i8) == '/') {
                            i6 = i2 + 3;
                            z2 = false;
                            i7 = i2;
                            i2 = i8;
                        } else if (strN0.equals(str)) {
                            i4 = i2 + 1;
                            i7 = i2;
                            i2 = i4;
                            i6 = i2;
                        }
                    }
                } else if (i4 == -1 && i5 == -1 && i3 == -1) {
                    i4 = i6 == -1 ? 0 : i2;
                    z2 = false;
                }
            } else if (i3 == -1) {
                i3 = i2 + 1;
            }
            i2++;
        }
        int iMin = Math.min(i3 == -1 ? Integer.MAX_VALUE : i3 - 1, strN0.length());
        int iMin2 = Math.min(i5 == -1 ? Integer.MAX_VALUE : i5 - 1, iMin);
        if (i6 != -1) {
            strSubstring2 = strN0.substring(0, i7);
            strSubstring = strN0.substring(i6, Math.min(i4 != -1 ? i4 : Integer.MAX_VALUE, iMin2));
        } else {
            strSubstring = null;
            strSubstring2 = null;
        }
        String strSubstring3 = i4 != -1 ? strN0.substring(i4, iMin2) : null;
        String strSubstring4 = i5 != -1 ? strN0.substring(i5, iMin) : null;
        String strSubstring5 = i3 != -1 ? strN0.substring(i3, strN0.length()) : null;
        byte[] bArr = new byte[Math.max(0, Math.max(strSubstring2 != null ? strSubstring2.length() : 0, Math.max(strSubstring != null ? strSubstring.length() : 0, Math.max(strSubstring3 != null ? strSubstring3.length() : 0, Math.max(strSubstring4 != null ? strSubstring4.length() : 0, strSubstring5 != null ? strSubstring5.length() : 0)))) - 2)];
        String str3 = strSubstring4;
        String strO = strSubstring2 != null ? o(strSubstring2, bArr) : null;
        String strO2 = strSubstring != null ? o(strSubstring, bArr) : null;
        String strO3 = strSubstring3 != null ? o(strSubstring3, bArr) : null;
        if (str3 != null) {
            o(str3, bArr);
        }
        if (strSubstring5 != null) {
            o(strSubstring5, bArr);
        }
        return new dli(strN0, str2, strO, strO2, strO3);
    }
}
