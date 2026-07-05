package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class ide implements Serializable {
    public final Pattern E;

    public ide(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((jde) it.next()).E;
        }
        Pattern patternCompile = Pattern.compile("\\s+style\\s*=\\s*([\"'])(.*?)\\1", (i & 2) != 0 ? i | 64 : i);
        patternCompile.getClass();
        this.E = patternCompile;
    }

    public static uj7 c(ide ideVar, String str) {
        ideVar.getClass();
        str.getClass();
        if (str.length() >= 0) {
            return new uj7(new aac(ideVar, 19, str), 1, gde.E);
        }
        mr9.e(str.length(), vb7.u("Start index out of bounds: ", 0, ", input length: "));
        return null;
    }

    public final boolean a(String str) {
        str.getClass();
        return this.E.matcher(str).find();
    }

    public final ova b(CharSequence charSequence) {
        charSequence.getClass();
        Matcher matcher = this.E.matcher(charSequence);
        matcher.getClass();
        return dgj.l(matcher, 0, charSequence);
    }

    public final ova d(int i, String str) {
        str.getClass();
        Matcher matcherRegion = this.E.matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i, str.length());
        if (matcherRegion.lookingAt()) {
            return new ova(matcherRegion, str);
        }
        return null;
    }

    public final ova e(CharSequence charSequence) {
        charSequence.getClass();
        Matcher matcher = this.E.matcher(charSequence);
        matcher.getClass();
        if (matcher.matches()) {
            return new ova(matcher, charSequence);
        }
        return null;
    }

    public final boolean f(String str) {
        str.getClass();
        return this.E.matcher(str).matches();
    }

    public final String g(CharSequence charSequence, bz7 bz7Var) {
        charSequence.getClass();
        ova ovaVarB = b(charSequence);
        if (ovaVarB == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i = 0;
        do {
            sb.append(charSequence, i, ovaVarB.b().E);
            sb.append((CharSequence) bz7Var.invoke(ovaVarB));
            i = ovaVarB.b().F + 1;
            ovaVarB = ovaVarB.d();
            if (i >= length) {
                break;
            }
        } while (ovaVarB != null);
        if (i < length) {
            sb.append(charSequence, i, length);
        }
        return sb.toString();
    }

    public final String h(String str, String str2) {
        str.getClass();
        String strReplaceAll = this.E.matcher(str).replaceAll(str2);
        strReplaceAll.getClass();
        return strReplaceAll;
    }

    public final String toString() {
        String string = this.E.toString();
        string.getClass();
        return string;
    }

    public ide(String str) {
        Pattern patternCompile = Pattern.compile(str);
        patternCompile.getClass();
        this.E = patternCompile;
    }

    public ide(String str, jde jdeVar) {
        int i = jdeVar.E;
        Pattern patternCompile = Pattern.compile(str, (i & 2) != 0 ? i | 64 : i);
        patternCompile.getClass();
        this.E = patternCompile;
    }
}
