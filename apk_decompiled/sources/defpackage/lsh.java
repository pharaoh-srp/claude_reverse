package defpackage;

import org.jsoup.helper.ValidationException;

/* JADX INFO: loaded from: classes3.dex */
public final class lsh implements AutoCloseable {
    public static final char[] F = {'*', '|', '_', '-'};
    public final vi2 E;

    public lsh(String str) {
        this.E = new vi2(str);
    }

    public static boolean i(char c) {
        return c == '-' || xrg.g(c) || c == '_' || xrg.e(c) || c >= 128;
    }

    public static String n(String str) {
        if (str.indexOf(92) == -1) {
            return str;
        }
        StringBuilder sbB = xrg.b();
        char c = 0;
        for (char c2 : str.toCharArray()) {
            if (c2 == '\\') {
                if (c == '\\') {
                    sbB.append(c2);
                    c = 0;
                }
            } else {
                sbB.append(c2);
            }
            c = c2;
        }
        return xrg.k(sbB);
    }

    public final void c() {
        vi2 vi2Var = this.E;
        if (vi2Var.S()) {
            return;
        }
        vi2Var.c();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.E.close();
    }

    public final String d(char c, char c2) {
        StringBuilder sbB = xrg.b();
        vi2 vi2Var = this.E;
        if (vi2Var.I - vi2Var.H < 1024) {
            vi2Var.J = 0;
        }
        vi2Var.d();
        vi2Var.L = vi2Var.H;
        char c3 = 0;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        boolean z3 = false;
        while (!vi2Var.S()) {
            char cF = vi2Var.f();
            if (c3 == '\\') {
                if (cF == 'Q') {
                    z3 = true;
                } else if (cF == 'E') {
                    z3 = false;
                }
                sbB.append(cF);
            } else {
                if (cF == '\'' && cF != c && !z) {
                    z2 = !z2;
                } else if (cF == '\"' && cF != c && !z2) {
                    z = !z;
                }
                if (z2 || z || z3) {
                    sbB.append(cF);
                } else if (cF == c) {
                    i++;
                    if (i > 1) {
                        sbB.append(cF);
                    }
                } else if (cF != c2 || i - 1 > 0) {
                    sbB.append(cF);
                }
            }
            if (i <= 0) {
                break;
            }
            c3 = cF;
        }
        String strK = xrg.k(sbB);
        if (i <= 0) {
            return strK;
        }
        vi2Var.R0();
        throw new ValidationException("Did not find balanced marker at '" + strK + "'");
    }

    public final String e() {
        char cR;
        vi2 vi2Var = this.E;
        if (vi2Var.S()) {
            sz6.p("CSS identifier expected, but end of input found");
            return null;
        }
        vi2Var.d();
        int i = vi2Var.H;
        int i2 = vi2Var.I;
        char[] cArr = vi2Var.G;
        int i3 = i;
        while (i3 < i2 && i(cArr[i3])) {
            i3++;
        }
        vi2Var.H = i3;
        String strE = i3 > i ? vi2.e(vi2Var.G, vi2Var.E, i, i3 - i) : "";
        char cR2 = vi2Var.R();
        if (cR2 != '\\' && cR2 != 0) {
            return strE;
        }
        StringBuilder sbB = xrg.b();
        if (!strE.isEmpty()) {
            sbB.append(strE);
        }
        while (!vi2Var.S()) {
            char cR3 = vi2Var.R();
            if (!i(cR3)) {
                if (cR3 != 0) {
                    if (cR3 != '\\') {
                        break;
                    }
                    c();
                    if (!vi2Var.S() && ((cR = vi2Var.R()) == '\n' || cR == '\r' || cR == '\f')) {
                        vi2Var.S0();
                        break;
                    }
                    if (vi2Var.S()) {
                        sbB.append((char) 65533);
                    } else {
                        char cF = vi2Var.f();
                        if (xrg.h(cF)) {
                            vi2Var.S0();
                            vi2Var.d();
                            int i4 = vi2Var.H;
                            int i5 = vi2Var.I;
                            char[] cArr2 = vi2Var.G;
                            int i6 = i4;
                            while (i6 < i5 && i6 - i4 < 6 && xrg.h(cArr2[i6])) {
                                i6++;
                            }
                            vi2Var.H = i6;
                            String strE2 = i6 > i4 ? vi2.e(vi2Var.G, vi2Var.E, i4, i6 - i4) : "";
                            try {
                                int i7 = Integer.parseInt(strE2, 16);
                                if (i7 == 0 || !Character.isValidCodePoint(i7) || Character.isSurrogate((char) i7)) {
                                    sbB.append((char) 65533);
                                } else {
                                    sbB.appendCodePoint(i7);
                                }
                                if (!vi2Var.S()) {
                                    char cR4 = vi2Var.R();
                                    if (cR4 == '\r') {
                                        c();
                                        if (!vi2Var.S() && vi2Var.R() == '\n') {
                                            c();
                                        }
                                    } else if (cR4 == ' ' || cR4 == '\t' || cR4 == '\n' || cR4 == '\r' || cR4 == '\f') {
                                        c();
                                    }
                                }
                            } catch (NumberFormatException e) {
                                throw new IllegalArgumentException("Invalid escape sequence: ".concat(strE2), e);
                            }
                        } else {
                            sbB.append(cF);
                        }
                    }
                } else {
                    c();
                    sbB.append((char) 65533);
                }
            } else {
                sbB.append(vi2Var.f());
            }
        }
        return xrg.k(sbB);
    }

    public final boolean f() {
        boolean z = false;
        while (xrg.i(this.E.R())) {
            c();
            z = true;
        }
        return z;
    }

    public final boolean j(char c) {
        vi2 vi2Var = this.E;
        if (!vi2Var.r0(c)) {
            return false;
        }
        vi2Var.f();
        return true;
    }

    public final String toString() {
        return this.E.toString();
    }
}
