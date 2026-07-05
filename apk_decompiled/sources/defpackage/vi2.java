package defpackage;

import java.io.IOException;
import java.io.StringReader;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class vi2 implements AutoCloseable {
    public static final dke R = new dke(new ui2(0));
    public static final dke S = new dke(new ui2(1));
    public String[] E;
    public StringReader F;
    public char[] G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public ArrayList N;
    public int O;
    public String P;
    public int Q;

    public vi2(StringReader stringReader) {
        this.J = 0;
        this.L = -1;
        this.N = null;
        this.O = 1;
        this.F = stringReader;
        this.G = (char[]) S.z();
        this.E = (String[]) R.z();
        d();
    }

    public static String e(char[] cArr, String[] strArr, int i, int i2) {
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        if (i2 < 1) {
            return "";
        }
        int i3 = i2 + i;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = i; i6 < i3; i6++) {
            i5 = (i5 * 31) + cArr[i6];
        }
        int i7 = i5 & 511;
        String str = strArr[i7];
        if (str != null && i2 == str.length()) {
            int i8 = i;
            int i9 = i2;
            while (true) {
                int i10 = i9 - 1;
                if (i9 == 0) {
                    return str;
                }
                int i11 = i8 + 1;
                int i12 = i4 + 1;
                if (cArr[i8] != str.charAt(i4)) {
                    break;
                }
                i8 = i11;
                i9 = i10;
                i4 = i12;
            }
        }
        String str2 = new String(cArr, i, i2);
        strArr[i7] = str2;
        return str2;
    }

    public final boolean B0() {
        if (S()) {
            return false;
        }
        return xrg.e(this.G[this.H]);
    }

    public final boolean D0(String str) {
        d();
        int length = str.length();
        if (length > this.I - this.H) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            char c = this.G[this.H + i];
            if (cCharAt != c && Character.toUpperCase(cCharAt) != Character.toUpperCase(c)) {
                return false;
            }
        }
        return true;
    }

    public final String H(char... cArr) {
        d();
        int i = this.H;
        int i2 = this.I;
        char[] cArr2 = this.G;
        int i3 = i;
        loop0: while (i3 < i2) {
            char c = cArr2[i3];
            for (char c2 : cArr) {
                if (c == c2) {
                    break loop0;
                }
            }
            i3++;
        }
        this.H = i3;
        return i3 > i ? e(this.G, this.E, i, i3 - i) : "";
    }

    public final String K(char... cArr) {
        d();
        int i = this.H;
        int i2 = this.I;
        char[] cArr2 = this.G;
        int i3 = i;
        while (i3 < i2 && Arrays.binarySearch(cArr, cArr2[i3]) < 0) {
            i3++;
        }
        this.H = i3;
        return i3 > i ? e(this.G, this.E, i, i3 - i) : "";
    }

    public final int O0(String str) {
        d();
        char cCharAt = str.charAt(0);
        int i = this.H;
        while (i < this.I) {
            if (cCharAt != this.G[i]) {
                do {
                    i++;
                    if (i >= this.I) {
                        break;
                    }
                } while (cCharAt != this.G[i]);
            }
            int i2 = i + 1;
            int length = (str.length() + i2) - 1;
            int i3 = this.I;
            if (i < i3 && length <= i3) {
                int i4 = i2;
                for (int i5 = 1; i4 < length && str.charAt(i5) == this.G[i4]; i5++) {
                    i4++;
                }
                if (i4 == length) {
                    return i - this.H;
                }
            }
            i = i2;
        }
        return -1;
    }

    public final String P() {
        d();
        char[] cArr = this.G;
        String[] strArr = this.E;
        int i = this.H;
        String strE = e(cArr, strArr, i, this.I - i);
        this.H = this.I;
        return strE;
    }

    public final int P0() {
        return this.K + this.H;
    }

    public final String Q0() {
        int i;
        int iT;
        StringBuilder sb = new StringBuilder();
        int iP0 = P0();
        if (this.N != null) {
            int iT2 = T(iP0);
            i = this.O;
            if (iT2 != -1) {
                i = iT2 + i + 1;
            }
        } else {
            i = 1;
        }
        sb.append(i);
        sb.append(":");
        int iP02 = P0();
        if (this.N != null && (iT = T(iP02)) != -1) {
            iP02 -= ((Integer) this.N.get(iT)).intValue();
        }
        sb.append(iP02 + 1);
        return sb.toString();
    }

    public final char R() {
        d();
        int i = this.H;
        if (i >= this.I) {
            return (char) 65535;
        }
        return this.G[i];
    }

    public final void R0() {
        int i = this.L;
        if (i == -1) {
            throw new UncheckedIOException(new IOException("Mark invalid"));
        }
        this.H = i;
        this.L = -1;
    }

    public final boolean S() {
        d();
        return this.H >= this.I;
    }

    public final void S0() {
        int i = this.H;
        if (i < 1) {
            throw new UncheckedIOException(new IOException("WTF: No buffer left to unconsume."));
        }
        this.H = i - 1;
    }

    public final int T(int i) {
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            return 0;
        }
        int iBinarySearch = Collections.binarySearch(arrayList, Integer.valueOf(i));
        return iBinarySearch < -1 ? Math.abs(iBinarySearch) - 2 : iBinarySearch;
    }

    public final boolean b0(String str) {
        d();
        d();
        int length = str.length();
        if (length <= this.I - this.H) {
            for (int i = 0; i < length; i++) {
                if (str.charAt(i) == this.G[this.H + i]) {
                }
            }
            this.H = str.length() + this.H;
            return true;
        }
        return false;
    }

    public final void c() {
        this.H++;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        dke dkeVar = R;
        dke dkeVar2 = S;
        StringReader stringReader = this.F;
        if (stringReader == null) {
            return;
        }
        try {
            stringReader.close();
            this.F = null;
            Arrays.fill(this.G, (char) 0);
            dkeVar2.D(this.G);
            this.G = null;
            dkeVar.D(this.E);
        } catch (IOException unused) {
            this.F = null;
            Arrays.fill(this.G, (char) 0);
            dkeVar2.D(this.G);
            this.G = null;
            dkeVar.D(this.E);
        } catch (Throwable th) {
            this.F = null;
            Arrays.fill(this.G, (char) 0);
            dkeVar2.D(this.G);
            this.G = null;
            dkeVar.D(this.E);
            this.E = null;
            throw th;
        }
        this.E = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        r7.M = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r7 = this;
            boolean r0 = r7.M
            if (r0 != 0) goto La4
            int r0 = r7.H
            int r1 = r7.J
            if (r0 < r1) goto La4
            int r1 = r7.L
            r2 = -1
            if (r1 == r2) goto L11
            goto La4
        L11:
            int r1 = r7.K
            int r1 = r1 + r0
            r7.K = r1
            int r1 = r7.I
            int r1 = r1 - r0
            r7.I = r1
            r3 = 0
            if (r1 <= 0) goto L23
            char[] r4 = r7.G
            java.lang.System.arraycopy(r4, r0, r4, r3, r1)
        L23:
            r7.H = r3
        L25:
            int r0 = r7.I
            r1 = 2048(0x800, float:2.87E-42)
            r4 = 1
            if (r0 >= r1) goto L4b
            java.io.StringReader r1 = r7.F     // Catch: java.io.IOException -> L44
            char[] r5 = r7.G     // Catch: java.io.IOException -> L44
            int r6 = r5.length     // Catch: java.io.IOException -> L44
            int r6 = r6 - r0
            int r0 = r1.read(r5, r0, r6)     // Catch: java.io.IOException -> L44
            if (r0 != r2) goto L3b
            r7.M = r4     // Catch: java.io.IOException -> L44
            goto L4b
        L3b:
            if (r0 != 0) goto L3e
            goto L4b
        L3e:
            int r1 = r7.I     // Catch: java.io.IOException -> L44
            int r1 = r1 + r0
            r7.I = r1     // Catch: java.io.IOException -> L44
            goto L25
        L44:
            r7 = move-exception
            java.io.UncheckedIOException r0 = new java.io.UncheckedIOException
            r0.<init>(r7)
            throw r0
        L4b:
            int r0 = r7.I
            r1 = 1024(0x400, float:1.435E-42)
            int r0 = java.lang.Math.min(r0, r1)
            r7.J = r0
            java.util.ArrayList r0 = r7.N
            if (r0 == 0) goto La1
            int r0 = r0.size()
            if (r0 <= 0) goto L83
            int r0 = r7.K
            int r0 = r7.T(r0)
            if (r0 != r2) goto L68
            goto L69
        L68:
            r3 = r0
        L69:
            java.util.ArrayList r0 = r7.N
            java.lang.Object r0 = r0.get(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r0.getClass()
            int r1 = r7.O
            int r1 = r1 + r3
            r7.O = r1
            java.util.ArrayList r1 = r7.N
            r1.clear()
            java.util.ArrayList r1 = r7.N
            r1.add(r0)
        L83:
            int r0 = r7.H
        L85:
            int r1 = r7.I
            if (r0 >= r1) goto La1
            char[] r1 = r7.G
            char r1 = r1[r0]
            r2 = 10
            if (r1 != r2) goto L9e
            java.util.ArrayList r1 = r7.N
            int r2 = r7.K
            int r2 = r2 + r4
            int r2 = r2 + r0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.add(r2)
        L9e:
            int r0 = r0 + 1
            goto L85
        La1:
            r0 = 0
            r7.P = r0
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vi2.d():void");
    }

    public final char f() {
        d();
        int i = this.H;
        char c = i >= this.I ? (char) 65535 : this.G[i];
        this.H = i + 1;
        return c;
    }

    public final String i() {
        d();
        int i = this.H;
        int i2 = this.I;
        char[] cArr = this.G;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (!((c == '&' || c == '<' || c == 0) ? false : true)) {
                break;
            }
            i3++;
        }
        this.H = i3;
        return i3 > i ? e(this.G, this.E, i, i3 - i) : "";
    }

    public final String j() {
        d();
        int i = this.H;
        int i2 = this.I;
        char[] cArr = this.G;
        int i3 = i;
        while (i3 < i2 && Character.isLetter(cArr[i3])) {
            i3++;
        }
        this.H = i3;
        return i3 > i ? e(this.G, this.E, i, i3 - i) : "";
    }

    public final boolean l0(String str) {
        if (!D0(str)) {
            return false;
        }
        this.H = str.length() + this.H;
        return true;
    }

    public final String n(wg6 wg6Var) {
        d();
        int i = this.H;
        int i2 = this.I;
        char[] cArr = this.G;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (!((c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ' || c == '/' || c == '>') ? false : true)) {
                break;
            }
            i3++;
        }
        this.H = i3;
        return i3 > i ? e(this.G, this.E, i, i3 - i) : "";
    }

    public final boolean r0(char c) {
        return !S() && this.G[this.H] == c;
    }

    public final String toString() {
        int i = this.I;
        int i2 = this.H;
        return i - i2 < 0 ? "" : new String(this.G, i2, i - i2);
    }

    public final String x(char c) {
        int i;
        d();
        int i2 = this.H;
        while (true) {
            if (i2 >= this.I) {
                i = -1;
                break;
            }
            if (c == this.G[i2]) {
                i = i2 - this.H;
                break;
            }
            i2++;
        }
        if (i == -1) {
            return P();
        }
        String strE = e(this.G, this.E, this.H, i);
        this.H += i;
        return strE;
    }

    public final boolean x0(char... cArr) {
        if (!S()) {
            d();
            char c = this.G[this.H];
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
        }
        return false;
    }

    public vi2(String str) {
        this(new StringReader(str));
    }
}
