package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class g4h extends b4h {
    public static final g11 H = new g11(FreeTypeConstants.FT_LOAD_PEDANTIC, 4);
    public final CharSequence[] E;
    public final int F;
    public final int G;

    static {
        a4h a4hVar = a4h.DATADOG;
    }

    public g4h(a4h a4hVar, int i, CharSequence charSequence, int i2, int i3) {
        CharSequence[] charSequenceArr = new CharSequence[a4h.I];
        this.E = charSequenceArr;
        int iOrdinal = a4hVar.ordinal();
        this.F = iOrdinal;
        this.G = i;
        if (i2 != 0 || i3 != charSequence.length()) {
            StringBuilder sb = new StringBuilder(i3 - i2);
            sb.append(charSequence, i2, i3);
            charSequence = sb.toString();
        }
        charSequenceArr[iOrdinal] = charSequence;
    }

    public static char b(char c) {
        if (c == ',' || c == ';' || c == '~') {
            return '_';
        }
        if (c == '=') {
            return '~';
        }
        return c;
    }

    public static char c(char c) {
        if (c == '~') {
            return '=';
        }
        return c;
    }

    public static g4h d(CharSequence charSequence) {
        a4h a4hVar = a4h.DATADOG;
        int i = charSequence == null ? -1 : 0;
        int length = charSequence != null ? charSequence.length() : -1;
        if (charSequence == null || i < 0 || length <= 0 || charSequence.length() < length) {
            return null;
        }
        return (g4h) H.i(charSequence, i, length, new pmf(11), new pmf(12), new pmf(13));
    }

    @Override // defpackage.b4h
    public final CharSequence a(a4h a4hVar) {
        int iOrdinal = a4hVar.ordinal();
        CharSequence[] charSequenceArr = this.E;
        CharSequence string = charSequenceArr[iOrdinal];
        if (string == null) {
            int i = this.F;
            string = charSequenceArr[i];
            int length = string.length();
            pmf pmfVar = i == 0 ? new pmf(10) : new pmf(9);
            StringBuilder sb = null;
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = string.charAt(i2);
                char c = pmfVar.c(cCharAt);
                if (c != cCharAt && sb == null) {
                    sb = new StringBuilder(length);
                    sb.append(string, 0, i2);
                }
                if (sb != null) {
                    sb.append(c);
                }
            }
            if (sb != null) {
                string = sb.toString();
            }
            charSequenceArr[iOrdinal] = string;
        }
        return string;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        int i2 = this.F;
        CharSequence[] charSequenceArr = this.E;
        return i2 == 0 ? charSequenceArr[i2].charAt(i) : c(charSequenceArr[i2].charAt(i));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g4h.class == obj.getClass()) {
            g4h g4hVar = (g4h) obj;
            int i = g4hVar.F;
            if (this.G == g4hVar.G) {
                CharSequence[] charSequenceArr = this.E;
                int i2 = this.F;
                CharSequence charSequence = charSequenceArr[i2];
                CharSequence charSequence2 = g4hVar.E[i];
                int length = charSequence.length();
                if (length == charSequence2.length()) {
                    if (i2 == i) {
                        for (int i3 = 0; i3 < length; i3++) {
                            if (charSequence.charAt(i3) == charSequence2.charAt(i3)) {
                            }
                        }
                        return true;
                    }
                    pmf pmfVar = i2 == 0 ? new pmf(8) : new pmf(9);
                    pmf pmfVar2 = i == 0 ? new pmf(8) : new pmf(9);
                    for (int i4 = 0; i4 < length; i4++) {
                        if (pmfVar.c(charSequence.charAt(i4)) == pmfVar2.c(charSequence2.charAt(i4))) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.G;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.E[this.F].length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.E[this.F].subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.E[this.F].toString();
    }
}
