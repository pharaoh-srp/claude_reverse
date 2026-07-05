package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class bsg extends isg {
    public static boolean A0(CharSequence charSequence, String str) {
        charSequence.getClass();
        return charSequence instanceof String ? isg.h0((String) charSequence, str, false) : Q0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static char B0(String str) {
        str.getClass();
        if (str.length() != 0) {
            return str.charAt(0);
        }
        pmf.h("Char sequence is empty.");
        return (char) 0;
    }

    public static Character C0(int i, CharSequence charSequence) {
        charSequence.getClass();
        if (i < 0 || i >= charSequence.length()) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i));
    }

    public static final int D0(CharSequence charSequence, String str, int i, boolean z) {
        charSequence.getClass();
        str.getClass();
        return (z || !(charSequence instanceof String)) ? E0(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    public static final int E0(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        z69 z69Var;
        if (z2) {
            charSequence.getClass();
            int length = charSequence.length() - 1;
            if (i > length) {
                i = length;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            z69Var = new z69(i, i2, -1);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length2 = charSequence.length();
            if (i2 > length2) {
                i2 = length2;
            }
            z69Var = new b79(i, i2, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i3 = z69Var.G;
        int i4 = z69Var.F;
        int i5 = z69Var.E;
        if (!z3 || !(charSequence2 instanceof String)) {
            boolean z4 = z;
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                while (true) {
                    CharSequence charSequence3 = charSequence;
                    CharSequence charSequence4 = charSequence2;
                    boolean z5 = z4;
                    z4 = z5;
                    if (!Q0(charSequence4, 0, charSequence3, i5, charSequence2.length(), z5)) {
                        if (i5 == i4) {
                            break;
                        }
                        i5 += i3;
                        charSequence2 = charSequence4;
                        charSequence = charSequence3;
                    } else {
                        return i5;
                    }
                }
            }
        } else if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
            int i6 = i5;
            while (true) {
                String str = (String) charSequence2;
                boolean z6 = z;
                if (!isg.l0(0, i6, str.length(), str, (String) charSequence, z6)) {
                    if (i6 == i4) {
                        break;
                    }
                    i6 += i3;
                    z = z6;
                } else {
                    return i6;
                }
            }
        }
        return -1;
    }

    public static int F0(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        return !(charSequence instanceof String) ? H0(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int G0(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return D0(charSequence, str, i, z);
    }

    public static final int H0(CharSequence charSequence, char[] cArr, int i, boolean z) {
        charSequence.getClass();
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(mp0.S0(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (gb9.w(c, cCharAt, z)) {
                    return i;
                }
            }
            if (i == length) {
                return -1;
            }
            i++;
        }
    }

    public static boolean I0(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!gb9.B(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static char J0(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() != 0) {
            return charSequence.charAt(charSequence.length() - 1);
        }
        pmf.h("Char sequence is empty.");
        return (char) 0;
    }

    public static int K0(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            charSequence.getClass();
            i = charSequence.length() - 1;
        }
        charSequence.getClass();
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(mp0.S0(cArr), i);
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            i = length;
        }
        while (-1 < i) {
            if (gb9.w(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static int L0(String str, int i, String str2) {
        int length;
        if ((i & 2) != 0) {
            str.getClass();
            length = str.length() - 1;
        } else {
            length = 0;
        }
        str.getClass();
        str2.getClass();
        return str.lastIndexOf(str2, length);
    }

    public static Character M0(String str) {
        if (str.length() == 0) {
            return null;
        }
        return Character.valueOf(str.charAt(str.length() - 1));
    }

    public static List N0(CharSequence charSequence) {
        charSequence.getClass();
        j6a j6aVar = new j6a(charSequence);
        if (!j6aVar.hasNext()) {
            return lm6.E;
        }
        Object next = j6aVar.next();
        if (!j6aVar.hasNext()) {
            return x44.W(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (j6aVar.hasNext()) {
            arrayList.add(j6aVar.next());
        }
        return arrayList;
    }

    public static String O0(int i, String str) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        if (i < 0) {
            sz6.p(grc.u("Desired length ", i, " is less than zero."));
            return null;
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static xy5 P0(CharSequence charSequence, char[] cArr, int i) {
        V0(i);
        return new xy5(charSequence, i, new jsg(0, cArr));
    }

    public static final boolean Q0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!gb9.w(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String R0(String str, String str2) {
        str.getClass();
        str2.getClass();
        return Z0(str2, str) ? str.substring(str2.length()) : str;
    }

    public static CharSequence S0(int i, int i2, String str) {
        if (i2 < i) {
            xh6.j(vb7.q("End index (", ") is less than start index (", i2, i, ")."));
            return null;
        }
        if (i2 == i) {
            return str.subSequence(0, str.length());
        }
        StringBuilder sb = new StringBuilder(str.length() - (i2 - i));
        sb.append((CharSequence) str, 0, i);
        sb.append((CharSequence) str, i2, str.length());
        return sb;
    }

    public static String T0(String str, String str2) {
        str.getClass();
        return A0(str, str2) ? str.substring(0, str.length() - str2.length()) : str;
    }

    public static StringBuilder U0(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < i) {
            xh6.j(vb7.q("End index (", ") is less than start index (", i2, i, ")."));
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence, 0, i);
        sb.append(charSequence2);
        sb.append(charSequence, i2, charSequence.length());
        return sb;
    }

    public static final void V0(int i) {
        if (i >= 0) {
            return;
        }
        mr9.q(grc.p(i, "Limit must be non-negative, but was "));
    }

    public static final List W0(CharSequence charSequence, String str, int i) {
        V0(i);
        int iD0 = D0(charSequence, str, 0, false);
        if (iD0 == -1 || i == 1) {
            return x44.W(charSequence.toString());
        }
        boolean z = i > 0;
        int i2 = 10;
        if (z && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iD0).toString());
            length = str.length() + iD0;
            if (z && arrayList.size() == i - 1) {
                break;
            }
            iD0 = D0(charSequence, str, length, false);
        } while (iD0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List X0(CharSequence charSequence, char[] cArr, int i) {
        int i2 = (i & 4) != 0 ? 0 : 2;
        charSequence.getClass();
        int i3 = 1;
        if (cArr.length == 1) {
            return W0(charSequence, String.valueOf(cArr[0]), i2);
        }
        op0 op0Var = new op0(i3, P0(charSequence, cArr, i2));
        ArrayList arrayList = new ArrayList(x44.y(op0Var, 10));
        Iterator it = op0Var.iterator();
        while (it.hasNext()) {
            arrayList.add(b1(charSequence, (b79) it.next()));
        }
        return arrayList;
    }

    public static List Y0(CharSequence charSequence, String[] strArr, int i) {
        int i2 = (i & 4) != 0 ? 0 : 2;
        charSequence.getClass();
        int i3 = 1;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() > 0) {
                return W0(charSequence, str, i2);
            }
        }
        V0(i2);
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        op0 op0Var = new op0(i3, new xy5(charSequence, i2, new ss2(listAsList, i3)));
        ArrayList arrayList = new ArrayList(x44.y(op0Var, 10));
        Iterator it = op0Var.iterator();
        while (it.hasNext()) {
            arrayList.add(b1(charSequence, (b79) it.next()));
        }
        return arrayList;
    }

    public static boolean Z0(CharSequence charSequence, String str) {
        str.getClass();
        charSequence.getClass();
        return charSequence instanceof String ? isg.q0(str, (String) charSequence, false) : Q0(str, 0, charSequence, 0, charSequence.length(), false);
    }

    public static boolean a1(String str, char c) {
        str.getClass();
        return str.length() > 0 && gb9.w(str.charAt(0), c, false);
    }

    public static final String b1(CharSequence charSequence, b79 b79Var) {
        charSequence.getClass();
        b79Var.getClass();
        return charSequence.subSequence(b79Var.E, b79Var.F + 1).toString();
    }

    public static String c1(String str, String str2, String str3) {
        grc.B(str, str2, str3);
        int iG0 = G0(str, str2, 0, false, 6);
        return iG0 == -1 ? str3 : str.substring(str2.length() + iG0, str.length());
    }

    public static String d1(char c, String str, String str2) {
        str.getClass();
        str2.getClass();
        int iK0 = K0(str, c, 0, 6);
        return iK0 == -1 ? str2 : str.substring(iK0 + 1, str.length());
    }

    public static String e1(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        int iL0 = L0(str, 6, str2);
        return iL0 == -1 ? str3 : str.substring(str2.length() + iL0, str.length());
    }

    public static String g1(String str, char c) {
        str.getClass();
        str.getClass();
        int iF0 = F0(str, c, 0, 6);
        return iF0 == -1 ? str : str.substring(0, iF0);
    }

    public static String h1(String str, String str2) {
        str.getClass();
        str.getClass();
        int iG0 = G0(str, str2, 0, false, 6);
        return iG0 == -1 ? str : str.substring(0, iG0);
    }

    public static String i1(char c, String str, String str2) {
        str.getClass();
        str2.getClass();
        int iK0 = K0(str, c, 0, 6);
        return iK0 == -1 ? str2 : str.substring(0, iK0);
    }

    public static String j1(int i, String str) {
        str.getClass();
        if (i < 0) {
            mr9.q(grc.u("Requested character count ", i, " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    public static CharSequence k1(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zB = gb9.B(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zB) {
                    break;
                }
                length--;
            } else if (zB) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static String l1(String str, char... cArr) {
        str.getClass();
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            char cCharAt = str.charAt(!z ? i : length);
            int length2 = cArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    i2 = -1;
                    break;
                }
                if (cCharAt == cArr[i2]) {
                    break;
                }
                i2++;
            }
            boolean z2 = i2 >= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }

    public static CharSequence m1(String str) {
        str.getClass();
        int length = str.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i = length - 1;
            if (!gb9.B(str.charAt(length))) {
                return str.subSequence(0, length + 1);
            }
            if (i < 0) {
                return "";
            }
            length = i;
        }
    }

    public static String n1(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                char cCharAt = str.charAt(length);
                int length2 = cArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        i2 = -1;
                        break;
                    }
                    if (cCharAt == cArr[i2]) {
                        break;
                    }
                    i2++;
                }
                if (i2 < 0) {
                    charSequenceSubSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
            charSequenceSubSequence = "";
        } else {
            charSequenceSubSequence = "";
        }
        return charSequenceSubSequence.toString();
    }

    public static CharSequence o1(String str) {
        str.getClass();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!gb9.B(str.charAt(i))) {
                return str.subSequence(i, str.length());
            }
        }
        return "";
    }

    public static boolean u0(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (charSequence2 instanceof String) {
            if (G0(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (E0(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean v0(CharSequence charSequence, char c) {
        charSequence.getClass();
        return F0(charSequence, c, 0, 2) >= 0;
    }

    public static String x0(int i, String str) {
        str.getClass();
        if (i < 0) {
            mr9.q(grc.u("Requested character count ", i, " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(i);
    }

    public static String y0(int i, String str) {
        if (i < 0) {
            mr9.q(grc.u("Requested character count ", i, " is less than zero."));
            return null;
        }
        int length = str.length() - i;
        if (length < 0) {
            length = 0;
        }
        return j1(length, str);
    }

    public static boolean z0(CharSequence charSequence, char c) {
        charSequence.getClass();
        return charSequence.length() > 0 && gb9.w(charSequence.charAt(charSequence.length() - 1), c, false);
    }
}
