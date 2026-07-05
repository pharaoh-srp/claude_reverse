package io.sentry.vendor.gson.stream;

import androidx.health.platform.client.proto.g;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.mr9;
import defpackage.vb7;
import io.sentry.e0;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Closeable {
    public final Reader E;
    public long M;
    public int N;
    public String O;
    public int[] P;
    public String[] R;
    public int[] S;
    public boolean F = false;
    public final char[] G = new char[FreeTypeConstants.FT_LOAD_NO_RECURSE];
    public int H = 0;
    public int I = 0;
    public int J = 0;
    public int K = 0;
    public int L = 0;
    public int Q = 1;

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.P = iArr;
        iArr[0] = 6;
        this.R = new String[32];
        this.S = new int[32];
        this.E = reader;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        r10.H = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        r1.append(r7, r3, r2 - r3);
        r10.H = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String H(char r11) throws io.sentry.vendor.gson.stream.MalformedJsonException {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r10.H
            int r3 = r10.I
        L6:
            r4 = r3
            r3 = r2
        L8:
            r5 = 16
            r6 = 1
            char[] r7 = r10.G
            if (r2 >= r4) goto L5b
            int r8 = r2 + 1
            char r2 = r7[r2]
            if (r2 != r11) goto L29
            r10.H = r8
            int r8 = r8 - r3
            int r8 = r8 - r6
            if (r1 != 0) goto L21
            java.lang.String r10 = new java.lang.String
            r10.<init>(r7, r3, r8)
            return r10
        L21:
            r1.append(r7, r3, r8)
            java.lang.String r10 = r1.toString()
            return r10
        L29:
            r9 = 92
            if (r2 != r9) goto L4e
            r10.H = r8
            int r8 = r8 - r3
            int r2 = r8 + (-1)
            if (r1 != 0) goto L3f
            int r8 = r8 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r8, r5)
            r1.<init>(r4)
        L3f:
            r1.append(r7, r3, r2)
            char r2 = r10.R()
            r1.append(r2)
            int r2 = r10.H
            int r3 = r10.I
            goto L6
        L4e:
            r5 = 10
            if (r2 != r5) goto L59
            int r2 = r10.J
            int r2 = r2 + r6
            r10.J = r2
            r10.K = r8
        L59:
            r2 = r8
            goto L8
        L5b:
            if (r1 != 0) goto L6b
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L6b:
            int r4 = r2 - r3
            r1.append(r7, r3, r4)
            r10.H = r2
            boolean r2 = r10.e(r6)
            if (r2 == 0) goto L79
            goto L2
        L79:
            java.lang.String r11 = "Unterminated string"
            r10.b0(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.a.H(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
    
        c();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0042. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String K() throws io.sentry.vendor.gson.stream.MalformedJsonException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r6.H
            int r3 = r3 + r2
            int r4 = r6.I
            char[] r5 = r6.G
            if (r3 >= r4) goto L4c
            char r3 = r5[r3]
            r4 = 9
            if (r3 == r4) goto L58
            r4 = 10
            if (r3 == r4) goto L58
            r4 = 12
            if (r3 == r4) goto L58
            r4 = 13
            if (r3 == r4) goto L58
            r4 = 32
            if (r3 == r4) goto L58
            r4 = 35
            if (r3 == r4) goto L48
            r4 = 44
            if (r3 == r4) goto L58
            r4 = 47
            if (r3 == r4) goto L48
            r4 = 61
            if (r3 == r4) goto L48
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L58
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L58
            r4 = 58
            if (r3 == r4) goto L58
            r4 = 59
            if (r3 == r4) goto L48
            switch(r3) {
                case 91: goto L58;
                case 92: goto L48;
                case 93: goto L58;
                default: goto L45;
            }
        L45:
            int r2 = r2 + 1
            goto L3
        L48:
            r6.c()
            goto L58
        L4c:
            int r3 = r5.length
            if (r2 >= r3) goto L5a
            int r3 = r2 + 1
            boolean r3 = r6.e(r3)
            if (r3 == 0) goto L58
            goto L3
        L58:
            r1 = r2
            goto L78
        L5a:
            if (r0 != 0) goto L67
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L67:
            int r3 = r6.H
            r0.append(r5, r3, r2)
            int r3 = r6.H
            int r3 = r3 + r2
            r6.H = r3
            r2 = 1
            boolean r2 = r6.e(r2)
            if (r2 != 0) goto L2
        L78:
            int r2 = r6.H
            if (r0 != 0) goto L82
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r2, r1)
            goto L89
        L82:
            r0.append(r5, r2, r1)
            java.lang.String r0 = r0.toString()
        L89:
            int r2 = r6.H
            int r2 = r2 + r1
            r6.H = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.a.K():java.lang.String");
    }

    public final void P(int i) {
        int i2 = this.Q;
        int[] iArr = this.P;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.P = Arrays.copyOf(iArr, i3);
            this.S = Arrays.copyOf(this.S, i3);
            this.R = (String[]) Arrays.copyOf(this.R, i3);
        }
        int[] iArr2 = this.P;
        int i4 = this.Q;
        this.Q = i4 + 1;
        iArr2[i4] = i;
    }

    public final char R() throws MalformedJsonException {
        int i;
        if (this.H == this.I && !e(1)) {
            b0("Unterminated escape sequence");
            throw null;
        }
        int i2 = this.H;
        int i3 = i2 + 1;
        this.H = i3;
        char[] cArr = this.G;
        char c = cArr[i2];
        if (c == '\n') {
            this.J++;
            this.K = i3;
            return c;
        }
        if (c == '\"' || c == '\'' || c == '/' || c == '\\') {
            return c;
        }
        if (c == 'b') {
            return '\b';
        }
        if (c == 'f') {
            return '\f';
        }
        if (c == 'n') {
            return '\n';
        }
        if (c == 'r') {
            return '\r';
        }
        if (c == 't') {
            return '\t';
        }
        if (c != 'u') {
            b0("Invalid escape sequence");
            throw null;
        }
        if (i2 + 5 > this.I && !e(4)) {
            b0("Unterminated escape sequence");
            throw null;
        }
        int i4 = this.H;
        int i5 = i4 + 4;
        char c2 = 0;
        while (i4 < i5) {
            char c3 = cArr[i4];
            char c4 = (char) (c2 << 4);
            if (c3 >= '0' && c3 <= '9') {
                i = c3 - '0';
            } else if (c3 >= 'a' && c3 <= 'f') {
                i = c3 - 'W';
            } else {
                if (c3 < 'A' || c3 > 'F') {
                    throw new NumberFormatException("\\u".concat(new String(cArr, this.H, 4)));
                }
                i = c3 - '7';
            }
            c2 = (char) (i + c4);
            i4++;
        }
        this.H += 4;
        return c2;
    }

    public final void S(char c) throws MalformedJsonException {
        do {
            int i = this.H;
            int i2 = this.I;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = this.G[i];
                if (c2 == c) {
                    this.H = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.H = i3;
                    R();
                    i = this.H;
                    i2 = this.I;
                } else {
                    if (c2 == '\n') {
                        this.J++;
                        this.K = i3;
                    }
                    i = i3;
                }
            }
            this.H = i;
        } while (e(1));
        b0("Unterminated string");
        throw null;
    }

    public final void T() {
        char c;
        do {
            if (this.H >= this.I && !e(1)) {
                return;
            }
            int i = this.H;
            int i2 = i + 1;
            this.H = i2;
            c = this.G[i];
            if (c == '\n') {
                this.J++;
                this.K = i2;
                return;
            }
        } while (c != '\r');
    }

    public final void b0(String str) throws MalformedJsonException {
        throw new MalformedJsonException(str.concat(i()));
    }

    public final void beginArray() {
        int iD = this.L;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 3) {
            P(1);
            this.S[this.Q - 1] = 0;
            this.L = 0;
        } else {
            StringBuilder sb = new StringBuilder("Expected BEGIN_ARRAY but was ");
            sb.append(peek());
            e0.h(sb, i());
        }
    }

    public final void beginObject() {
        int iD = this.L;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 1) {
            P(3);
            this.L = 0;
        } else {
            StringBuilder sb = new StringBuilder("Expected BEGIN_OBJECT but was ");
            sb.append(peek());
            e0.h(sb, i());
        }
    }

    public final void c() throws MalformedJsonException {
        if (this.F) {
            return;
        }
        b0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.L = 0;
        this.P[0] = 8;
        this.Q = 1;
        this.E.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:166:0x020a, code lost:
    
        if (f(r9) != false) goto L121;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0179 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0265 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0266  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 781
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.a.d():int");
    }

    public final boolean e(int i) throws IOException {
        int i2;
        int i3;
        int i4 = this.K;
        int i5 = this.H;
        this.K = i4 - i5;
        int i6 = this.I;
        char[] cArr = this.G;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.I = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.I = 0;
        }
        this.H = 0;
        do {
            int i8 = this.I;
            int i9 = this.E.read(cArr, i8, cArr.length - i8);
            if (i9 == -1) {
                return false;
            }
            i2 = this.I + i9;
            this.I = i2;
            if (this.J == 0 && (i3 = this.K) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.H++;
                this.K = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    public final void endArray() {
        int iD = this.L;
        if (iD == 0) {
            iD = d();
        }
        if (iD != 4) {
            StringBuilder sb = new StringBuilder("Expected END_ARRAY but was ");
            sb.append(peek());
            e0.h(sb, i());
        } else {
            int i = this.Q;
            this.Q = i - 1;
            int[] iArr = this.S;
            int i2 = i - 2;
            iArr[i2] = iArr[i2] + 1;
            this.L = 0;
        }
    }

    public final void endObject() {
        int iD = this.L;
        if (iD == 0) {
            iD = d();
        }
        if (iD != 2) {
            StringBuilder sb = new StringBuilder("Expected END_OBJECT but was ");
            sb.append(peek());
            e0.h(sb, i());
            return;
        }
        int i = this.Q;
        int i2 = i - 1;
        this.Q = i2;
        this.R[i2] = null;
        int[] iArr = this.S;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.L = 0;
    }

    public final boolean f(char c) throws MalformedJsonException {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        c();
        return false;
    }

    public final boolean hasNext() throws IOException {
        int iD = this.L;
        if (iD == 0) {
            iD = d();
        }
        return (iD == 2 || iD == 4) ? false : true;
    }

    public final String i() {
        StringBuilder sbV = vb7.v(" at line ", " column ", this.J + 1, (this.H - this.K) + 1, " path ");
        StringBuilder sb = new StringBuilder("$");
        int i = this.Q;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.P[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(this.S[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = this.R[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        sbV.append(sb.toString());
        return sbV.toString();
    }

    public final boolean j() throws IOException {
        int iD = this.L;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 5) {
            this.L = 0;
            int[] iArr = this.S;
            int i = this.Q - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iD != 6) {
            StringBuilder sb = new StringBuilder("Expected a boolean but was ");
            sb.append(peek());
            e0.h(sb, i());
            return false;
        }
        this.L = 0;
        int[] iArr2 = this.S;
        int i2 = this.Q - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int n(boolean r10) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.a.n(boolean):int");
    }

    public final double nextDouble() throws IOException {
        int iD = this.L;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 15) {
            this.L = 0;
            int[] iArr = this.S;
            int i = this.Q - 1;
            iArr[i] = iArr[i] + 1;
            return this.M;
        }
        if (iD == 16) {
            this.O = new String(this.G, this.H, this.N);
            this.H += this.N;
        } else if (iD == 8 || iD == 9) {
            this.O = H(iD == 8 ? '\'' : '\"');
        } else if (iD == 10) {
            this.O = K();
        } else if (iD != 11) {
            StringBuilder sb = new StringBuilder("Expected a double but was ");
            sb.append(peek());
            e0.h(sb, i());
            return 0.0d;
        }
        this.L = 11;
        double d = Double.parseDouble(this.O);
        if (!this.F && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + d + i());
        }
        this.O = null;
        this.L = 0;
        int[] iArr2 = this.S;
        int i2 = this.Q - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return d;
    }

    public final String nextName() throws IOException {
        String strH;
        int iD = this.L;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 14) {
            strH = K();
        } else if (iD == 12) {
            strH = H('\'');
        } else {
            if (iD != 13) {
                StringBuilder sb = new StringBuilder("Expected a name but was ");
                sb.append(peek());
                e0.h(sb, i());
                return null;
            }
            strH = H('\"');
        }
        this.L = 0;
        this.R[this.Q - 1] = strH;
        return strH;
    }

    public final String nextString() throws IOException {
        String str;
        int iD = this.L;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 10) {
            str = K();
        } else if (iD == 8) {
            str = H('\'');
        } else if (iD == 9) {
            str = H('\"');
        } else if (iD == 11) {
            str = this.O;
            this.O = null;
        } else if (iD == 15) {
            str = Long.toString(this.M);
        } else {
            if (iD != 16) {
                StringBuilder sb = new StringBuilder("Expected a string but was ");
                sb.append(peek());
                e0.h(sb, i());
                return null;
            }
            str = new String(this.G, this.H, this.N);
            this.H += this.N;
        }
        this.L = 0;
        int[] iArr = this.S;
        int i = this.Q - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    public final b peek() throws IOException {
        int iD = this.L;
        if (iD == 0) {
            iD = d();
        }
        switch (iD) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case 16:
                return b.NUMBER;
            case g.MAX_FIELD_NUMBER /* 17 */:
                return b.END_DOCUMENT;
            default:
                mr9.u();
                return null;
        }
    }

    public final String toString() {
        return a.class.getSimpleName().concat(i());
    }

    public final void x() {
        int iD = this.L;
        if (iD == 0) {
            iD = d();
        }
        if (iD != 7) {
            StringBuilder sb = new StringBuilder("Expected null but was ");
            sb.append(peek());
            e0.h(sb, i());
        } else {
            this.L = 0;
            int[] iArr = this.S;
            int i = this.Q - 1;
            iArr[i] = iArr[i] + 1;
        }
    }
}
