package com.airbnb.lottie.parser.moshi;

import androidx.health.platform.client.proto.g;
import defpackage.dj2;
import defpackage.epk;
import defpackage.mr9;
import defpackage.ms6;
import java.io.EOFException;
import java.io.IOException;
import okio.Buffer;
import okio.ByteString;
import okio.Options;
import okio.RealBufferedSource;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends a {
    public static final ByteString P;
    public static final ByteString Q;
    public static final ByteString R;
    public final RealBufferedSource J;
    public final Buffer K;
    public int L;
    public long M;
    public int N;
    public String O;

    static {
        ByteString byteString = ByteString.H;
        P = ByteString.Companion.b("'\\");
        Q = ByteString.Companion.b("\"\\");
        R = ByteString.Companion.b("{}[]:, \n\t\r\f/\\;#=");
        ByteString.Companion.b("\n\r");
        ByteString.Companion.b("*/");
    }

    public c(RealBufferedSource realBufferedSource) {
        this.F = new int[32];
        this.G = new String[32];
        this.H = new int[32];
        this.L = 0;
        this.J = realBufferedSource;
        this.K = realBufferedSource.F;
        f(6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x01a2, code lost:
    
        if (P(r10) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01a4, code lost:
    
        if (r1 != 2) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01a6, code lost:
    
        if (r4 == 0) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01ac, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01ae, code lost:
    
        if (r13 == 0) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01b2, code lost:
    
        if (r8 != r18) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01b4, code lost:
    
        if (r13 != 0) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01b6, code lost:
    
        if (r13 == 0) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01b9, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01ba, code lost:
    
        r23.M = r8;
        r7.skip(r2);
        r9 = 16;
        r23.L = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01c5, code lost:
    
        if (r1 == 2) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01c8, code lost:
    
        if (r1 == 4) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01cb, code lost:
    
        if (r1 != 7) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01cd, code lost:
    
        r23.N = r2;
        r9 = 17;
        r23.L = 17;
     */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int H() throws com.airbnb.lottie.parser.moshi.JsonEncodingException, java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.c.H():int");
    }

    public final int K(String str, epk epkVar) {
        int length = ((String[]) epkVar.E).length;
        for (int i = 0; i < length; i++) {
            if (str.equals(((String[]) epkVar.E)[i])) {
                this.L = 0;
                this.G[this.E - 1] = str;
                return i;
            }
        }
        return -1;
    }

    public final boolean P(int i) throws JsonEncodingException {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        x();
        throw null;
    }

    public final int R(boolean z) throws JsonEncodingException, EOFException {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            RealBufferedSource realBufferedSource = this.J;
            if (!realBufferedSource.j0(i2)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j = i;
            Buffer buffer = this.K;
            byte bI = buffer.i(j);
            if (bI != 10 && bI != 32 && bI != 13 && bI != 9) {
                buffer.skip(j);
                if (bI == 47) {
                    if (realBufferedSource.j0(2L)) {
                        x();
                        throw null;
                    }
                } else if (bI == 35) {
                    x();
                    throw null;
                }
                return bI;
            }
            i = i2;
        }
    }

    public final String S(ByteString byteString) throws JsonEncodingException, EOFException {
        StringBuilder sb = null;
        while (true) {
            long jL = this.J.L(byteString);
            if (jL == -1) {
                n("Unterminated string");
                throw null;
            }
            Buffer buffer = this.K;
            if (buffer.i(jL) != 92) {
                if (sb == null) {
                    String strS = buffer.S(jL, dj2.a);
                    buffer.readByte();
                    return strS;
                }
                sb.append(buffer.S(jL, dj2.a));
                buffer.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(buffer.S(jL, dj2.a));
            buffer.readByte();
            sb.append(b0());
        }
    }

    public final String T() {
        long jL = this.J.L(R);
        Buffer buffer = this.K;
        if (jL == -1) {
            return buffer.t0();
        }
        buffer.getClass();
        return buffer.S(jL, dj2.a);
    }

    public final char b0() throws JsonEncodingException, EOFException {
        int i;
        RealBufferedSource realBufferedSource = this.J;
        if (!realBufferedSource.j0(1L)) {
            n("Unterminated escape sequence");
            throw null;
        }
        Buffer buffer = this.K;
        byte b = buffer.readByte();
        if (b == 10 || b == 34 || b == 39 || b == 47 || b == 92) {
            return (char) b;
        }
        if (b == 98) {
            return '\b';
        }
        if (b == 102) {
            return '\f';
        }
        if (b == 110) {
            return '\n';
        }
        if (b == 114) {
            return '\r';
        }
        if (b == 116) {
            return '\t';
        }
        if (b != 117) {
            n("Invalid escape sequence: \\" + ((char) b));
            throw null;
        }
        if (!realBufferedSource.j0(4L)) {
            throw new EOFException("Unterminated escape sequence at path ".concat(c()));
        }
        char c = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            byte bI = buffer.i(i2);
            char c2 = (char) (c << 4);
            if (bI >= 48 && bI <= 57) {
                i = bI - 48;
            } else if (bI >= 97 && bI <= 102) {
                i = bI - 87;
            } else {
                if (bI < 65 || bI > 70) {
                    n("\\u".concat(buffer.S(4L, dj2.a)));
                    throw null;
                }
                i = bI - 55;
            }
            c = (char) (i + c2);
        }
        buffer.skip(4L);
        return c;
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final void beginArray() {
        int iH = this.L;
        if (iH == 0) {
            iH = H();
        }
        if (iH != 3) {
            b.a(ms6.A(e()), c(), "Expected BEGIN_ARRAY but was ");
            return;
        }
        f(1);
        this.H[this.E - 1] = 0;
        this.L = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final void beginObject() {
        int iH = this.L;
        if (iH == 0) {
            iH = H();
        }
        if (iH != 1) {
            b.a(ms6.A(e()), c(), "Expected BEGIN_OBJECT but was ");
        } else {
            f(3);
            this.L = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.L = 0;
        this.F[0] = 8;
        this.E = 1;
        this.K.c();
        this.J.close();
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final boolean d() {
        int iH = this.L;
        if (iH == 0) {
            iH = H();
        }
        if (iH == 5) {
            this.L = 0;
            int[] iArr = this.H;
            int i = this.E - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iH != 6) {
            b.a(ms6.A(e()), c(), "Expected a boolean but was ");
            return false;
        }
        this.L = 0;
        int[] iArr2 = this.H;
        int i2 = this.E - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final int e() throws JsonEncodingException, EOFException {
        int iH = this.L;
        if (iH == 0) {
            iH = H();
        }
        switch (iH) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return 5;
            case 16:
            case g.MAX_FIELD_NUMBER /* 17 */:
                return 7;
            case g.AVG_FIELD_NUMBER /* 18 */:
                return 10;
            default:
                mr9.u();
                return 0;
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final void endArray() {
        int iH = this.L;
        if (iH == 0) {
            iH = H();
        }
        if (iH != 4) {
            b.a(ms6.A(e()), c(), "Expected END_ARRAY but was ");
            return;
        }
        int i = this.E;
        this.E = i - 1;
        int[] iArr = this.H;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.L = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final void endObject() {
        int iH = this.L;
        if (iH == 0) {
            iH = H();
        }
        if (iH != 2) {
            b.a(ms6.A(e()), c(), "Expected END_OBJECT but was ");
            return;
        }
        int i = this.E;
        int i2 = i - 1;
        this.E = i2;
        this.G[i2] = null;
        int[] iArr = this.H;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.L = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final boolean hasNext() throws JsonEncodingException, EOFException {
        int iH = this.L;
        if (iH == 0) {
            iH = H();
        }
        return (iH == 2 || iH == 4 || iH == 18) ? false : true;
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final int i(epk epkVar) {
        int iH = this.L;
        if (iH == 0) {
            iH = H();
        }
        if (iH < 12 || iH > 15) {
            return -1;
        }
        if (iH == 15) {
            return K(this.O, epkVar);
        }
        int iN0 = this.J.N0((Options) epkVar.F);
        if (iN0 != -1) {
            this.L = 0;
            this.G[this.E - 1] = ((String[]) epkVar.E)[iN0];
            return iN0;
        }
        String str = this.G[this.E - 1];
        String strNextName = nextName();
        int iK = K(strNextName, epkVar);
        if (iK == -1) {
            this.L = 15;
            this.O = strNextName;
            this.G[this.E - 1] = str;
        }
        return iK;
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final void j() {
        int iH = this.L;
        if (iH == 0) {
            iH = H();
        }
        if (iH == 14) {
            long jL = this.J.L(R);
            Buffer buffer = this.K;
            if (jL == -1) {
                jL = buffer.F;
            }
            buffer.skip(jL);
        } else if (iH == 13) {
            l0(Q);
        } else if (iH == 12) {
            l0(P);
        } else if (iH != 15) {
            b.a(ms6.A(e()), c(), "Expected a name but was ");
            return;
        }
        this.L = 0;
        this.G[this.E - 1] = "null";
    }

    public final void l0(ByteString byteString) throws JsonEncodingException, EOFException {
        while (true) {
            long jL = this.J.L(byteString);
            if (jL == -1) {
                n("Unterminated string");
                throw null;
            }
            Buffer buffer = this.K;
            if (buffer.i(jL) != 92) {
                buffer.skip(jL + 1);
                return;
            } else {
                buffer.skip(jL + 1);
                b0();
            }
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final double nextDouble() throws JsonEncodingException, EOFException {
        int iH = this.L;
        if (iH == 0) {
            iH = H();
        }
        if (iH == 16) {
            this.L = 0;
            int[] iArr = this.H;
            int i = this.E - 1;
            iArr[i] = iArr[i] + 1;
            return this.M;
        }
        if (iH == 17) {
            long j = this.N;
            Buffer buffer = this.K;
            buffer.getClass();
            this.O = buffer.S(j, dj2.a);
        } else if (iH == 9) {
            this.O = S(Q);
        } else if (iH == 8) {
            this.O = S(P);
        } else if (iH == 10) {
            this.O = T();
        } else if (iH != 11) {
            b.a(ms6.A(e()), c(), "Expected a double but was ");
            return 0.0d;
        }
        this.L = 11;
        try {
            double d = Double.parseDouble(this.O);
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                throw new JsonEncodingException("JSON forbids NaN and infinities: " + d + " at path " + c());
            }
            this.O = null;
            this.L = 0;
            int[] iArr2 = this.H;
            int i2 = this.E - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return d;
        } catch (NumberFormatException unused) {
            b.a(this.O, c(), "Expected a double but was ");
            return 0.0d;
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final int nextInt() {
        int iH = this.L;
        if (iH == 0) {
            iH = H();
        }
        if (iH == 16) {
            long j = this.M;
            int i = (int) j;
            if (j == i) {
                this.L = 0;
                int[] iArr = this.H;
                int i2 = this.E - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new JsonDataException("Expected an int but was " + this.M + " at path " + c());
        }
        if (iH == 17) {
            long j2 = this.N;
            Buffer buffer = this.K;
            buffer.getClass();
            this.O = buffer.S(j2, dj2.a);
        } else if (iH == 9 || iH == 8) {
            String strS = iH == 9 ? S(Q) : S(P);
            this.O = strS;
            try {
                int i3 = Integer.parseInt(strS);
                this.L = 0;
                int[] iArr2 = this.H;
                int i4 = this.E - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else if (iH != 11) {
            b.a(ms6.A(e()), c(), "Expected an int but was ");
            return 0;
        }
        this.L = 11;
        try {
            double d = Double.parseDouble(this.O);
            int i5 = (int) d;
            if (i5 != d) {
                b.a(this.O, c(), "Expected an int but was ");
                return 0;
            }
            this.O = null;
            this.L = 0;
            int[] iArr3 = this.H;
            int i6 = this.E - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            b.a(this.O, c(), "Expected an int but was ");
            return 0;
        }
    }

    public final String nextName() {
        String strS;
        int iH = this.L;
        if (iH == 0) {
            iH = H();
        }
        if (iH == 14) {
            strS = T();
        } else if (iH == 13) {
            strS = S(Q);
        } else if (iH == 12) {
            strS = S(P);
        } else {
            if (iH != 15) {
                b.a(ms6.A(e()), c(), "Expected a name but was ");
                return null;
            }
            strS = this.O;
        }
        this.L = 0;
        this.G[this.E - 1] = strS;
        return strS;
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final String nextString() {
        String strS;
        int iH = this.L;
        if (iH == 0) {
            iH = H();
        }
        if (iH == 10) {
            strS = T();
        } else if (iH == 9) {
            strS = S(Q);
        } else if (iH == 8) {
            strS = S(P);
        } else if (iH == 11) {
            strS = this.O;
            this.O = null;
        } else if (iH == 16) {
            strS = Long.toString(this.M);
        } else {
            if (iH != 17) {
                b.a(ms6.A(e()), c(), "Expected a string but was ");
                return null;
            }
            long j = this.N;
            Buffer buffer = this.K;
            buffer.getClass();
            strS = buffer.S(j, dj2.a);
        }
        this.L = 0;
        int[] iArr = this.H;
        int i = this.E - 1;
        iArr[i] = iArr[i] + 1;
        return strS;
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final void skipValue() {
        int i = 0;
        do {
            int iH = this.L;
            if (iH == 0) {
                iH = H();
            }
            if (iH == 3) {
                f(1);
            } else if (iH == 1) {
                f(3);
            } else {
                if (iH == 4) {
                    i--;
                    if (i < 0) {
                        b.a(ms6.A(e()), c(), "Expected a value but was ");
                        return;
                    }
                    this.E--;
                } else if (iH == 2) {
                    i--;
                    if (i < 0) {
                        b.a(ms6.A(e()), c(), "Expected a value but was ");
                        return;
                    }
                    this.E--;
                } else {
                    Buffer buffer = this.K;
                    if (iH == 14 || iH == 10) {
                        long jL = this.J.L(R);
                        if (jL == -1) {
                            jL = buffer.F;
                        }
                        buffer.skip(jL);
                    } else if (iH == 9 || iH == 13) {
                        l0(Q);
                    } else if (iH == 8 || iH == 12) {
                        l0(P);
                    } else if (iH == 17) {
                        buffer.skip(this.N);
                    } else if (iH == 18) {
                        b.a(ms6.A(e()), c(), "Expected a value but was ");
                        return;
                    }
                }
                this.L = 0;
            }
            i++;
            this.L = 0;
        } while (i != 0);
        int[] iArr = this.H;
        int i2 = this.E - 1;
        iArr[i2] = iArr[i2] + 1;
        this.G[i2] = "null";
    }

    public final String toString() {
        return "JsonReader(" + this.J + ")";
    }

    public final void x() throws JsonEncodingException {
        n("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }
}
