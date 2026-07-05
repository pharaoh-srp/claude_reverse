package defpackage;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class l31 implements Map.Entry, Cloneable {
    public static final String[] H = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};
    public static final Pattern I = Pattern.compile("[^-a-zA-Z0-9_:.]+");
    public static final Pattern J = Pattern.compile("[\\x00-\\x1f\\x7f-\\x9f \"'/=]+");
    public final String E;
    public String F;
    public n31 G;

    public l31(String str, String str2, n31 n31Var) {
        pqi.p(str);
        String strTrim = str.trim();
        pqi.n(strTrim);
        this.E = strTrim;
        this.F = str2;
        this.G = n31Var;
    }

    public static String a(int i, String str) {
        if (i == 2 && !d(str)) {
            String strReplaceAll = I.matcher(str).replaceAll("_");
            if (d(strReplaceAll)) {
                return strReplaceAll;
            }
            return null;
        }
        if (i != 1 || c(str)) {
            return str;
        }
        String strReplaceAll2 = J.matcher(str).replaceAll("_");
        if (c(strReplaceAll2)) {
            return strReplaceAll2;
        }
        return null;
    }

    public static void b(String str, String str2, gjk gjkVar, n96 n96Var) {
        gjkVar.h(str);
        if (n96Var.J == 1) {
            if (str2 == null) {
                return;
            }
            if ((str2.isEmpty() || str2.equalsIgnoreCase(str)) && Arrays.binarySearch(H, ouk.g(str)) >= 0) {
                return;
            }
        }
        gjkVar.h("=\"");
        yp6.c(gjkVar, n31.h(str2), n96Var, 2);
        gjkVar.g('\"');
    }

    public static boolean c(String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= 31 || ((cCharAt >= 127 && cCharAt <= 159) || cCharAt == ' ' || cCharAt == '\"' || cCharAt == '\'' || cCharAt == '/' || cCharAt == '=')) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        char cCharAt = str.charAt(0);
        if ((cCharAt < 'a' || cCharAt > 'z') && !((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == '_' || cCharAt == ':')) {
            return false;
        }
        for (int i = 1; i < length; i++) {
            char cCharAt2 = str.charAt(i);
            if ((cCharAt2 < 'a' || cCharAt2 > 'z') && ((cCharAt2 < 'A' || cCharAt2 > 'Z') && !((cCharAt2 >= '0' && cCharAt2 <= '9') || cCharAt2 == '-' || cCharAt2 == '_' || cCharAt2 == ':' || cCharAt2 == '.'))) {
                return false;
            }
        }
        return true;
    }

    public final Object clone() {
        try {
            return (l31) super.clone();
        } catch (CloneNotSupportedException e) {
            xh6.h(e);
            return null;
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l31.class == obj.getClass()) {
            l31 l31Var = (l31) obj;
            if (Objects.equals(this.E, l31Var.E) && Objects.equals(this.F, l31Var.F)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.E;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return n31.h(this.F);
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return Objects.hash(this.E, this.F);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        String str;
        int iQ;
        String str2 = (String) obj;
        String strL = this.F;
        n31 n31Var = this.G;
        if (n31Var != null && (iQ = n31Var.q((str = this.E))) != -1) {
            strL = this.G.l(str);
            this.G.G[iQ] = str2;
        }
        this.F = str2;
        return n31.h(strL);
    }

    public final String toString() {
        StringBuilder sbB = xrg.b();
        gjk gjkVarM = gjk.m(sbB);
        n96 n96Var = new n96();
        String str = this.F;
        String strA = a(n96Var.J, this.E);
        if (strA != null) {
            b(strA, str, gjkVarM, n96Var);
        }
        return xrg.k(sbB);
    }
}
