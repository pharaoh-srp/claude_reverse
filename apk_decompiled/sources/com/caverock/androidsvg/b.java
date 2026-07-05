package com.caverock.androidsvg;

import android.util.Log;
import defpackage.b1f;
import defpackage.bi0;
import defpackage.d80;
import defpackage.f1f;
import defpackage.h1f;
import defpackage.j1f;
import defpackage.k42;
import defpackage.m42;
import defpackage.n42;
import defpackage.q2f;
import defpackage.u42;
import defpackage.v42;
import defpackage.w42;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public final int b;
    public boolean c = false;
    public final m42 a = m42.F;

    public b(int i) {
        this.b = i;
    }

    public static int a(ArrayList arrayList, int i, h1f h1fVar) {
        int i2 = 0;
        if (i < 0) {
            return 0;
        }
        Object obj = arrayList.get(i);
        f1f f1fVar = h1fVar.b;
        if (obj != f1fVar) {
            return -1;
        }
        Iterator it = f1fVar.a().iterator();
        while (it.hasNext()) {
            if (((j1f) it.next()) == h1fVar) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static ArrayList c(a aVar) {
        ArrayList arrayList = new ArrayList();
        while (!aVar.q()) {
            String str = (String) aVar.d;
            String strSubstring = null;
            if (!aVar.q()) {
                int i = aVar.b;
                char cCharAt = str.charAt(i);
                if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                    aVar.b = i;
                } else {
                    int iH = aVar.h();
                    while (true) {
                        if ((iH < 65 || iH > 90) && (iH < 97 || iH > 122)) {
                            break;
                        }
                        iH = aVar.h();
                    }
                    strSubstring = str.substring(i, aVar.b);
                }
            }
            if (strSubstring == null) {
                break;
            }
            try {
                arrayList.add(m42.valueOf(strSubstring));
            } catch (IllegalArgumentException unused) {
            }
            if (!aVar.R()) {
                break;
            }
        }
        return arrayList;
    }

    public static boolean f(v42 v42Var, int i, ArrayList arrayList, int i2, h1f h1fVar) {
        w42 w42Var = (w42) v42Var.a.get(i);
        if (!i(w42Var, h1fVar)) {
            return false;
        }
        int i3 = w42Var.a;
        if (i3 == 1) {
            if (i != 0) {
                while (i2 >= 0) {
                    if (!h(v42Var, i - 1, arrayList, i2)) {
                        i2--;
                    }
                }
                return false;
            }
            return true;
        }
        if (i3 == 2) {
            return h(v42Var, i - 1, arrayList, i2);
        }
        int iA = a(arrayList, i2, h1fVar);
        if (iA <= 0) {
            return false;
        }
        return f(v42Var, i - 1, arrayList, i2, (h1f) h1fVar.b.a().get(iA - 1));
    }

    public static boolean g(v42 v42Var, h1f h1fVar) {
        ArrayList arrayList = new ArrayList();
        Object obj = h1fVar.b;
        while (true) {
            if (obj == null) {
                break;
            }
            arrayList.add(0, obj);
            obj = ((j1f) obj).b;
        }
        int size = arrayList.size() - 1;
        ArrayList arrayList2 = v42Var.a;
        int size2 = arrayList2 == null ? 0 : arrayList2.size();
        ArrayList arrayList3 = v42Var.a;
        if (size2 == 1) {
            return i((w42) arrayList3.get(0), h1fVar);
        }
        return f(v42Var, (arrayList3 != null ? arrayList3.size() : 0) - 1, arrayList, size, h1fVar);
    }

    public static boolean h(v42 v42Var, int i, ArrayList arrayList, int i2) {
        w42 w42Var = (w42) v42Var.a.get(i);
        h1f h1fVar = (h1f) arrayList.get(i2);
        if (!i(w42Var, h1fVar)) {
            return false;
        }
        int i3 = w42Var.a;
        if (i3 == 1) {
            if (i != 0) {
                while (i2 > 0) {
                    i2--;
                    if (h(v42Var, i - 1, arrayList, i2)) {
                    }
                }
                return false;
            }
            return true;
        }
        if (i3 == 2) {
            return h(v42Var, i - 1, arrayList, i2 - 1);
        }
        int iA = a(arrayList, i2, h1fVar);
        if (iA <= 0) {
            return false;
        }
        return f(v42Var, i - 1, arrayList, i2, (h1f) h1fVar.b.a().get(iA - 1));
    }

    public static boolean i(w42 w42Var, h1f h1fVar) {
        ArrayList arrayList;
        String str = w42Var.b;
        if (str != null && !str.equals(h1fVar.o().toLowerCase(Locale.US))) {
            return false;
        }
        ArrayList<k42> arrayList2 = w42Var.c;
        if (arrayList2 != null) {
            for (k42 k42Var : arrayList2) {
                String str2 = k42Var.a;
                String str3 = k42Var.c;
                if (str2.equals("id")) {
                    if (!str3.equals(h1fVar.c)) {
                        return false;
                    }
                } else if (!str2.equals("class") || (arrayList = h1fVar.g) == null || !arrayList.contains(str3)) {
                    return false;
                }
            }
        }
        ArrayList arrayList3 = w42Var.d;
        if (arrayList3 == null) {
            return true;
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            if (!((n42) it.next()).a(h1fVar)) {
                return false;
            }
        }
        return true;
    }

    public final void b(d80 d80Var, a aVar) throws CSSParseException {
        int iIntValue;
        char cCharAt;
        int iT;
        String strV = aVar.V();
        aVar.S();
        if (strV == null) {
            throw new CSSParseException("Invalid '@' rule");
        }
        int i = 0;
        if (!this.c && strV.equals("media")) {
            ArrayList<m42> arrayListC = c(aVar);
            if (!aVar.m('{')) {
                throw new CSSParseException("Invalid @media rule: missing rule set");
            }
            aVar.S();
            for (m42 m42Var : arrayListC) {
                if (m42Var == m42.E || m42Var == this.a) {
                    this.c = true;
                    d80Var.e(e(aVar));
                    this.c = false;
                    break;
                }
            }
            e(aVar);
            if (!aVar.q() && !aVar.m('}')) {
                throw new CSSParseException("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.c || !strV.equals("import")) {
            Log.w("CSSParser", "Ignoring @" + strV + " rule");
            while (!aVar.q() && ((iIntValue = aVar.B().intValue()) != 59 || i != 0)) {
                if (iIntValue != 123) {
                    if (iIntValue == 125 && i > 0 && i - 1 == 0) {
                        break;
                    }
                } else {
                    i++;
                }
            }
        } else {
            String strU = null;
            if (!aVar.q()) {
                int i2 = aVar.b;
                if (aVar.n("url(")) {
                    aVar.S();
                    String strU2 = aVar.U();
                    if (strU2 == null) {
                        String str = (String) aVar.d;
                        StringBuilder sb = new StringBuilder();
                        while (!aVar.q() && (cCharAt = str.charAt(aVar.b)) != '\'' && cCharAt != '\"' && cCharAt != '(' && cCharAt != ')' && !bi0.z(cCharAt) && !Character.isISOControl((int) cCharAt)) {
                            aVar.b++;
                            if (cCharAt == '\\') {
                                if (!aVar.q()) {
                                    int i3 = aVar.b;
                                    aVar.b = i3 + 1;
                                    cCharAt = str.charAt(i3);
                                    if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\f') {
                                        int iT2 = a.T(cCharAt);
                                        if (iT2 != -1) {
                                            for (int i4 = 1; i4 <= 5 && !aVar.q() && (iT = a.T(str.charAt(aVar.b))) != -1; i4++) {
                                                aVar.b++;
                                                iT2 = (iT2 * 16) + iT;
                                            }
                                            sb.append((char) iT2);
                                        }
                                    }
                                }
                            }
                            sb.append(cCharAt);
                        }
                        strU2 = sb.length() == 0 ? null : sb.toString();
                    }
                    if (strU2 == null) {
                        aVar.b = i2;
                    } else {
                        aVar.S();
                        if (aVar.q() || aVar.n(")")) {
                            strU = strU2;
                        } else {
                            aVar.b = i2;
                        }
                    }
                }
            }
            if (strU == null) {
                strU = aVar.U();
            }
            if (strU == null) {
                throw new CSSParseException("Invalid @import rule: expected string or url()");
            }
            aVar.S();
            c(aVar);
            if (!aVar.q() && !aVar.m(';')) {
                throw new CSSParseException("Invalid @media rule: expected '}' at end of rule set");
            }
        }
        aVar.S();
    }

    public final boolean d(d80 d80Var, a aVar) throws CSSParseException {
        ArrayList<v42> arrayListW = aVar.W();
        if (arrayListW == null || arrayListW.isEmpty()) {
            return false;
        }
        if (!aVar.m('{')) {
            throw new CSSParseException("Malformed rule block: expected '{'");
        }
        aVar.S();
        b1f b1fVar = new b1f();
        do {
            String strV = aVar.V();
            aVar.S();
            if (!aVar.m(':')) {
                throw new CSSParseException("Expected ':'");
            }
            aVar.S();
            String str = (String) aVar.d;
            String strSubstring = null;
            if (!aVar.q()) {
                int i = aVar.b;
                int iCharAt = str.charAt(i);
                int i2 = i;
                while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && iCharAt != 10 && iCharAt != 13) {
                    if (!bi0.z(iCharAt)) {
                        i2 = aVar.b + 1;
                    }
                    iCharAt = aVar.h();
                }
                if (aVar.b > i) {
                    strSubstring = str.substring(i, i2);
                } else {
                    aVar.b = i;
                }
            }
            if (strSubstring == null) {
                throw new CSSParseException("Expected property value");
            }
            aVar.S();
            if (aVar.m('!')) {
                aVar.S();
                if (!aVar.n("important")) {
                    throw new CSSParseException("Malformed rule set: found unexpected '!'");
                }
                aVar.S();
            }
            aVar.m(';');
            q2f.C(b1fVar, strV, strSubstring);
            aVar.S();
            if (aVar.q()) {
                break;
            }
        } while (!aVar.m('}'));
        aVar.S();
        for (v42 v42Var : arrayListW) {
            u42 u42Var = new u42();
            u42Var.a = v42Var;
            u42Var.b = b1fVar;
            u42Var.c = this.b;
            d80Var.d(u42Var);
        }
        return true;
    }

    public final d80 e(a aVar) {
        d80 d80Var = new d80(2);
        while (!aVar.q()) {
            try {
                if (!aVar.n("<!--") && !aVar.n("-->")) {
                    if (!aVar.m('@')) {
                        if (!d(d80Var, aVar)) {
                            break;
                        }
                    } else {
                        b(d80Var, aVar);
                    }
                }
            } catch (CSSParseException e) {
                Log.e("CSSParser", "CSS parser terminated early due to error: " + e.getMessage());
                return d80Var;
            }
        }
        return d80Var;
    }
}
