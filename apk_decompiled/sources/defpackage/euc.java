package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class euc implements CharSequence {
    public CharSequence E;
    public z08 F;
    public int G;
    public int H;

    public final void a(int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (i > i2) {
            e39.a("start=" + i + " > end=" + i2);
        }
        if (i3 > i4) {
            e39.a("textStart=" + i3 + " > textEnd=" + i4);
        }
        if (i < 0) {
            e39.a("start must be non-negative, but was " + i);
        }
        if (i3 < 0) {
            e39.a("textStart must be non-negative, but was " + i3);
        }
        z08 z08Var = this.F;
        int i5 = i4 - i3;
        if (z08Var != null) {
            int i6 = this.G;
            int i7 = i - i6;
            int i8 = i2 - i6;
            if (i7 >= 0 && i8 <= z08Var.d()) {
                z08Var.e(i7, i8, charSequence, i3, i4);
                return;
            }
            this.E = toString();
            this.F = null;
            this.G = -1;
            this.H = -1;
            a(i, i2, charSequence, i3, i4);
            return;
        }
        int iMax = Math.max(255, i5 + FreeTypeConstants.FT_LOAD_PEDANTIC);
        char[] cArr = new char[iMax];
        int iMin = Math.min(i, 64);
        int iMin2 = Math.min(this.E.length() - i2, 64);
        int i9 = i - iMin;
        vsk.g(this.E, cArr, 0, i9, i);
        int i10 = iMax - iMin2;
        int i11 = iMin2 + i2;
        vsk.g(this.E, cArr, i10, i2, i11);
        vsk.g(charSequence, cArr, iMin, i3, i4);
        this.F = new z08(cArr, iMin + i5, i10, 1);
        this.G = i9;
        this.H = i11;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        z08 z08Var = this.F;
        if (z08Var != null && i >= this.G) {
            int iD = z08Var.d();
            int i2 = this.G;
            return i < iD + i2 ? z08Var.c(i - i2) : this.E.charAt(i - ((iD - this.H) + i2));
        }
        return this.E.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        z08 z08Var = this.F;
        CharSequence charSequence = this.E;
        if (z08Var == null) {
            return charSequence.length();
        }
        return z08Var.d() + (charSequence.length() - (this.H - this.G));
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return toString().subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        z08 z08Var = this.F;
        CharSequence charSequence = this.E;
        if (z08Var == null) {
            return charSequence.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence, 0, this.G);
        z08Var.a(sb);
        CharSequence charSequence2 = this.E;
        sb.append(charSequence2, this.H, charSequence2.length());
        return sb.toString();
    }
}
