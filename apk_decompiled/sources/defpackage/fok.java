package defpackage;

import android.graphics.Typeface;
import android.view.KeyEvent;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fok {
    public static final ta4 a = new ta4(-201194853, false, new sb4(16));

    static {
        new ta4(-633392511, false, new sb4(17));
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.to r20, com.anthropic.claude.sessions.types.SessionResource r21, defpackage.zy7 r22, defpackage.zy7 r23, defpackage.iqb r24, defpackage.ld4 r25, int r26) {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fok.a(to, com.anthropic.claude.sessions.types.SessionResource, zy7, zy7, iqb, ld4, int):void");
    }

    public static final boolean b(int i, KeyEvent keyEvent) {
        return zsj.f(ssj.i(keyEvent)) == i;
    }

    public static void c(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    public static boe d(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("id").m();
            bh9 bh9VarS = qh9Var.s("name");
            String strM2 = bh9VarS != null ? bh9VarS.m() : null;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((m7a) qh9Var.E.entrySet()).iterator();
            while (((o7a) it).hasNext()) {
                p7a p7aVarA = ((l7a) it).a();
                if (!mp0.o0(p7aVarA.getKey(), boe.d)) {
                    Object key = p7aVarA.getKey();
                    key.getClass();
                    linkedHashMap.put(key, p7aVarA.getValue());
                }
            }
            strM.getClass();
            return new boe(strM, strM2, linkedHashMap);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Account", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Account", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Account", e3);
            return null;
        }
    }

    public static final xt7 e(Typeface typeface) {
        if (x44.r(typeface, Typeface.SANS_SERIF)) {
            return xt7.F;
        }
        if (x44.r(typeface, Typeface.SERIF)) {
            return xt7.G;
        }
        if (x44.r(typeface, Typeface.MONOSPACE)) {
            return xt7.H;
        }
        if (typeface == null) {
            return null;
        }
        List listAsList = Arrays.asList(new ibi(typeface));
        listAsList.getClass();
        return new cu7(listAsList);
    }

    public static final xt7 f(String str) {
        String lowerCase;
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
        } else {
            lowerCase = null;
        }
        if (x44.r(lowerCase, "sans-serif")) {
            return xt7.F;
        }
        if (x44.r(lowerCase, "serif")) {
            return xt7.G;
        }
        if (x44.r(lowerCase, "monospace")) {
            return xt7.H;
        }
        if (x44.r(lowerCase, "cursive")) {
            return xt7.I;
        }
        if (str == null) {
            return null;
        }
        Typeface typefaceCreate = Typeface.create(str, 0);
        typefaceCreate.getClass();
        List listAsList = Arrays.asList(new ibi(typefaceCreate));
        listAsList.getClass();
        return new cu7(listAsList);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(java.lang.String r7, java.util.List r8, defpackage.eli r9, defpackage.bz7 r10) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fok.g(java.lang.String, java.util.List, eli, bz7):void");
    }

    public static String h(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                    StringBuilder sbX = sq6.x("<", str2, " threw ");
                    sbX.append(e.getClass().getName());
                    sbX.append(">");
                    string = sbX.toString();
                }
            }
            objArr[i2] = string;
            i2++;
        }
        StringBuilder sb = new StringBuilder((length * 16) + str.length());
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
