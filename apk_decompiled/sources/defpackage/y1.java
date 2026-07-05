package defpackage;

import kotlinx.serialization.json.JsonDecodingException;

/* JADX INFO: loaded from: classes.dex */
public abstract class y1 {
    public final rg9 a;
    public int b;
    public final zu2 c;
    public String d;
    public final StringBuilder e = new StringBuilder();

    public y1(rg9 rg9Var) {
        this.a = rg9Var;
        this.c = new zu2(rg9Var);
    }

    public static /* synthetic */ void q(y1 y1Var, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = y1Var.b;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        y1Var.p(str, i, str2);
        throw null;
    }

    public static boolean t(char c) {
        return (c == ',' || c == ':' || c == ']' || c == '}') ? false : true;
    }

    public final boolean A() {
        int iY = y();
        CharSequence charSequenceS = s();
        if (iY >= charSequenceS.length() || iY == -1 || charSequenceS.charAt(iY) != ',') {
            return false;
        }
        this.b++;
        return true;
    }

    public final void B(char c) {
        int i = this.b;
        if (i > 0 && c == '\"') {
            try {
                this.b = i - 1;
                String strL = l();
                this.b = i;
                if (x44.r(strL, "null")) {
                    p("Expected string literal but 'null' literal was found", this.b - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.b = i;
                throw th;
            }
        }
        String strT = oq5.T(oq5.t(c));
        int i2 = this.b;
        int i3 = i2 > 0 ? i2 - 1 : i2;
        q(this, ij0.l("Expected ", strT, ", but had '", (i2 == s().length() || i3 < 0) ? "EOF" : String.valueOf(s().charAt(i3)), "' instead"), i3, null, 4);
        throw null;
    }

    public final int a(int i, CharSequence charSequence) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            this.e.append((char) (r(i + 3, charSequence) + (r(i, charSequence) << 12) + (r(i + 1, charSequence) << 8) + (r(i + 2, charSequence) << 4)));
            return i2;
        }
        this.b = i;
        n();
        if (this.b + 4 < charSequence.length()) {
            return a(this.b, charSequence);
        }
        q(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public void b(int i, int i2) {
        this.e.append(s(), i, i2);
    }

    public abstract boolean c();

    public final void d(int i, String str) {
        if (s().length() - i < str.length()) {
            q(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (s().charAt(i + i2) | ' ')) {
                q(this, "Expected valid boolean literal prefix, but had '" + l() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.b = str.length() + i;
    }

    public abstract String e();

    public abstract byte f();

    public final byte g(byte b) {
        byte bF = f();
        if (bF == b) {
            return bF;
        }
        String strT = oq5.T(b);
        int i = this.b;
        int i2 = i > 0 ? i - 1 : i;
        q(this, ij0.l("Expected ", strT, ", but had '", (i == s().length() || i2 < 0) ? "EOF" : String.valueOf(s().charAt(i2)), "' instead"), i2, null, 4);
        throw null;
    }

    public abstract void h(char c);

    /* JADX WARN: Code restructure failed: missing block: B:100:0x019a, code lost:
    
        q(r22, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01b3, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b4, code lost:
    
        q(r22, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01ba, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01bb, code lost:
    
        defpackage.mr9.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01be, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01bf, code lost:
    
        if (r21 == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01c1, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01c6, code lost:
    
        if (r14 == Long.MIN_VALUE) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c9, code lost:
    
        return -r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01ca, code lost:
    
        q(r22, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01cf, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01d0, code lost:
    
        q(r22, "Expected numeric literal", r11, null, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01d6, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x011c, code lost:
    
        q(r22, "Unexpected symbol '" + r7 + "' in numeric literal", r11, null, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0130, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0137, code lost:
    
        if (r11 == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0139, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013b, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x013c, code lost:
    
        if (r1 == r11) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x013e, code lost:
    
        if (r21 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0142, code lost:
    
        if (r1 == (r11 - 1)) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0148, code lost:
    
        if (r19 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x014a, code lost:
    
        if (r2 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0156, code lost:
    
        if (s().charAt(r11) != '\"') goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0158, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x015b, code lost:
    
        q(r22, "Expected closing quotation mark", r11, null, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0162, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0163, code lost:
    
        q(r22, "EOF", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0169, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x016a, code lost:
    
        r22.b = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x016c, code lost:
    
        if (r20 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x016e, code lost:
    
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0171, code lost:
    
        if (r8 != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0173, code lost:
    
        r5 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x017b, code lost:
    
        if (r8 != true) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x017d, code lost:
    
        r5 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0182, code lost:
    
        r1 = r1 * r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0187, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x018d, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0195, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0197, code lost:
    
        r14 = (long) r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long i() {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y1.i():long");
    }

    public final String j() {
        String str = this.d;
        if (str == null) {
            return e();
        }
        str.getClass();
        this.d = null;
        return str;
    }

    public final String k(int i, int i2, CharSequence charSequence) {
        String string;
        charSequence.getClass();
        char cCharAt = charSequence.charAt(i2);
        boolean z = false;
        while (true) {
            StringBuilder sb = this.e;
            if (cCharAt == '\"') {
                if (z) {
                    b(i, i2);
                    string = sb.toString();
                    sb.setLength(0);
                } else {
                    string = z(i, i2);
                }
                this.b = i2 + 1;
                return string;
            }
            if (cCharAt == '\\') {
                b(i, i2);
                int iX = x(i2 + 1);
                if (iX == -1) {
                    q(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                    throw null;
                }
                int iA = iX + 1;
                char cCharAt2 = s().charAt(iX);
                if (cCharAt2 == 'u') {
                    iA = a(iA, s());
                } else {
                    char c = cCharAt2 < 'u' ? ji2.a[cCharAt2] : (char) 0;
                    if (c == 0) {
                        q(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                        throw null;
                    }
                    sb.append(c);
                }
                i = x(iA);
                if (i == -1) {
                    q(this, "Unexpected EOF", i, null, 4);
                    throw null;
                }
            } else {
                i2++;
                if (i2 >= charSequence.length()) {
                    b(i, i2);
                    i = x(i2);
                    if (i == -1) {
                        q(this, "Unexpected EOF", i, null, 4);
                        throw null;
                    }
                } else {
                    continue;
                    cCharAt = charSequence.charAt(i2);
                }
            }
            i2 = i;
            z = true;
            cCharAt = charSequence.charAt(i2);
        }
    }

    public final String l() {
        String string;
        String str = this.d;
        if (str != null) {
            str.getClass();
            this.d = null;
            return str;
        }
        int iY = y();
        if (iY >= s().length() || iY == -1) {
            q(this, "EOF", iY, null, 4);
            throw null;
        }
        byte bT = oq5.t(s().charAt(iY));
        if (bT == 1) {
            return j();
        }
        if (bT != 0) {
            q(this, "Expected beginning of the string, but got " + s().charAt(iY), 0, null, 6);
            throw null;
        }
        boolean z = false;
        while (true) {
            byte bT2 = oq5.t(s().charAt(iY));
            StringBuilder sb = this.e;
            if (bT2 != 0) {
                int i = this.b;
                if (z) {
                    b(i, iY);
                    string = sb.toString();
                    sb.setLength(0);
                } else {
                    string = z(i, iY);
                }
                this.b = iY;
                return string;
            }
            iY++;
            if (iY >= s().length()) {
                b(this.b, iY);
                int iX = x(iY);
                if (iX == -1) {
                    this.b = iY;
                    b(0, 0);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    return string2;
                }
                iY = iX;
                z = true;
            }
        }
    }

    public final String m() {
        String strL = l();
        if (!x44.r(strL, "null") || s().charAt(this.b - 1) == '\"') {
            return strL;
        }
        q(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
        throw null;
    }

    public void n() {
    }

    public final void o() {
        if (f() == 10) {
            return;
        }
        q(this, "Expected EOF after parsing, but had " + s().charAt(this.b - 1) + " instead", 0, null, 6);
        throw null;
    }

    public final void p(String str, int i, String str2) {
        String strL = this.c.l();
        CharSequence charSequenceS = s();
        charSequenceS.getClass();
        throw new JsonDecodingException(j8.L(str, strL, i, str2, this.a.k ? j8.V(i, charSequenceS).toString() : null));
    }

    public final int r(int i, CharSequence charSequence) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        q(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public abstract CharSequence s();

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonReader(source='");
        sb.append((Object) s());
        sb.append("', currentPosition=");
        return vb7.r(sb, this.b, ')');
    }

    public abstract String u(String str, boolean z);

    public byte v() {
        CharSequence charSequenceS = s();
        int i = this.b;
        while (true) {
            int iX = x(i);
            if (iX == -1) {
                this.b = iX;
                return (byte) 10;
            }
            char cCharAt = charSequenceS.charAt(iX);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.b = iX;
                return oq5.t(cCharAt);
            }
            i = iX + 1;
        }
    }

    public final String w(boolean z) {
        String strJ;
        byte bV = v();
        if (z) {
            if (bV != 1 && bV != 0) {
                return null;
            }
            strJ = l();
        } else {
            if (bV != 1) {
                return null;
            }
            strJ = j();
        }
        this.d = strJ;
        return strJ;
    }

    public abstract int x(int i);

    public abstract int y();

    public String z(int i, int i2) {
        return s().subSequence(i, i2).toString();
    }
}
