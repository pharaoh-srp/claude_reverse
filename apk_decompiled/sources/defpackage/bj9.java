package defpackage;

import androidx.health.platform.client.proto.g;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonEncodingException;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.RealBufferedSource;

/* JADX INFO: loaded from: classes3.dex */
public final class bj9 extends ci9 {
    public static final ByteString Q;
    public static final ByteString R;
    public static final ByteString S;
    public static final ByteString T;
    public static final ByteString U;
    public final BufferedSource K;
    public final Buffer L;
    public int M;
    public long N;
    public int O;
    public String P;

    static {
        ByteString byteString = ByteString.H;
        Q = ByteString.Companion.b("'\\");
        R = ByteString.Companion.b("\"\\");
        S = ByteString.Companion.b("{}[]:, \n\t\r\f/\\;#=");
        T = ByteString.Companion.b("\n\r");
        U = ByteString.Companion.b("*/");
    }

    public bj9(bj9 bj9Var) {
        super(bj9Var);
        this.M = 0;
        RealBufferedSource realBufferedSourcePeek = bj9Var.K.peek();
        this.K = realBufferedSourcePeek;
        this.L = realBufferedSourcePeek.F;
        this.M = bj9Var.M;
        this.N = bj9Var.N;
        this.O = bj9Var.O;
        this.P = bj9Var.P;
        try {
            realBufferedSourcePeek.I0(bj9Var.L.F);
        } catch (IOException unused) {
            mr9.u();
            throw null;
        }
    }

    public final boolean B0(int i) {
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
        b0();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0026, code lost:
    
        r1.skip(r3);
        r2 = defpackage.bj9.T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r6 != 47) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (r5.j0(2) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        b0();
        r10 = r1.i(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r10 == 42) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r10 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        r1.readByte();
        r1.readByte();
        r5 = r5.L(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        if (r5 == (-1)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        r5 = r1.F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
    
        r1.skip(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
    
        r1.readByte();
        r1.readByte();
        r2 = defpackage.bj9.U;
        r5 = r5.C(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
    
        if (r5 == (-1)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        if (r3 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        r5 = r5 + ((long) r2.E.length);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
    
        r5 = r1.F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
    
        r1.skip(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
    
        if (r3 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0085, code lost:
    
        S("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008e, code lost:
    
        if (r6 != 35) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0090, code lost:
    
        b0();
        r5 = r5.L(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0099, code lost:
    
        if (r5 == (-1)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009d, code lost:
    
        r5 = r1.F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009f, code lost:
    
        r1.skip(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int D0(boolean r13) throws java.io.EOFException {
        /*
            r12 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            int r2 = r1 + 1
            long r3 = (long) r2
            okio.BufferedSource r5 = r12.K
            boolean r3 = r5.j0(r3)
            if (r3 == 0) goto La8
            long r3 = (long) r1
            okio.Buffer r1 = r12.L
            byte r6 = r1.i(r3)
            r7 = 10
            if (r6 == r7) goto La5
            r7 = 32
            if (r6 == r7) goto La5
            r7 = 13
            if (r6 == r7) goto La5
            r7 = 9
            if (r6 != r7) goto L26
            goto La5
        L26:
            r1.skip(r3)
            okio.ByteString r2 = defpackage.bj9.T
            r3 = -1
            r7 = 1
            r9 = 47
            if (r6 != r9) goto L8c
            r10 = 2
            boolean r10 = r5.j0(r10)
            if (r10 != 0) goto L3d
            goto La4
        L3d:
            r12.b0()
            byte r10 = r1.i(r7)
            r11 = 42
            if (r10 == r11) goto L61
            if (r10 == r9) goto L4b
            goto La4
        L4b:
            r1.readByte()
            r1.readByte()
            long r5 = r5.L(r2)
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L5b
            long r5 = r5 + r7
            goto L5d
        L5b:
            long r5 = r1.F
        L5d:
            r1.skip(r5)
            goto L1
        L61:
            r1.readByte()
            r1.readByte()
            okio.ByteString r2 = defpackage.bj9.U
            long r5 = r5.C(r2)
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 == 0) goto L73
            r3 = 1
            goto L74
        L73:
            r3 = r0
        L74:
            if (r3 == 0) goto L7c
            byte[] r2 = r2.E
            int r2 = r2.length
            long r7 = (long) r2
            long r5 = r5 + r7
            goto L7e
        L7c:
            long r5 = r1.F
        L7e:
            r1.skip(r5)
            if (r3 == 0) goto L85
            goto L1
        L85:
            java.lang.String r13 = "Unterminated comment"
            r12.S(r13)
            r12 = 0
            throw r12
        L8c:
            r9 = 35
            if (r6 != r9) goto La4
            r12.b0()
            long r5 = r5.L(r2)
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L9d
            long r5 = r5 + r7
            goto L9f
        L9d:
            long r5 = r1.F
        L9f:
            r1.skip(r5)
            goto L1
        La4:
            return r6
        La5:
            r1 = r2
            goto L2
        La8:
            if (r13 != 0) goto Lac
            r12 = -1
            return r12
        Lac:
            java.io.EOFException r12 = new java.io.EOFException
            java.lang.String r13 = "End of input"
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bj9.D0(boolean):int");
    }

    @Override // defpackage.ci9
    public final int K(ai9 ai9Var) throws EOFException {
        int iL0 = this.M;
        if (iL0 == 0) {
            iL0 = l0();
        }
        if (iL0 < 12 || iL0 > 15) {
            return -1;
        }
        if (iL0 == 15) {
            return r0(this.P, ai9Var);
        }
        int iN0 = this.K.N0(ai9Var.b);
        if (iN0 != -1) {
            this.M = 0;
            this.G[this.E - 1] = ai9Var.a[iN0];
            return iN0;
        }
        String str = this.G[this.E - 1];
        String strNextName = nextName();
        int iR0 = r0(strNextName, ai9Var);
        if (iR0 == -1) {
            this.M = 15;
            this.P = strNextName;
            this.G[this.E - 1] = str;
        }
        return iR0;
    }

    public final String O0(ByteString byteString) throws EOFException {
        StringBuilder sb = null;
        while (true) {
            long jL = this.K.L(byteString);
            if (jL == -1) {
                S("Unterminated string");
                throw null;
            }
            Buffer buffer = this.L;
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
            sb.append(Q0());
        }
    }

    @Override // defpackage.ci9
    public final int P(ai9 ai9Var) throws EOFException {
        int iL0 = this.M;
        if (iL0 == 0) {
            iL0 = l0();
        }
        if (iL0 < 8 || iL0 > 11) {
            return -1;
        }
        if (iL0 == 11) {
            return x0(this.P, ai9Var);
        }
        int iN0 = this.K.N0(ai9Var.b);
        if (iN0 != -1) {
            this.M = 0;
            int[] iArr = this.H;
            int i = this.E - 1;
            iArr[i] = iArr[i] + 1;
            return iN0;
        }
        String strNextString = nextString();
        int iX0 = x0(strNextString, ai9Var);
        if (iX0 == -1) {
            this.M = 11;
            this.P = strNextString;
            this.H[this.E - 1] = r0[r4] - 1;
        }
        return iX0;
    }

    public final String P0() {
        long jL = this.K.L(S);
        Buffer buffer = this.L;
        if (jL == -1) {
            return buffer.t0();
        }
        buffer.getClass();
        return buffer.S(jL, dj2.a);
    }

    public final char Q0() throws EOFException {
        int i;
        BufferedSource bufferedSource = this.K;
        if (!bufferedSource.j0(1L)) {
            S("Unterminated escape sequence");
            throw null;
        }
        Buffer buffer = this.L;
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
            if (this.I) {
                return (char) b;
            }
            S("Invalid escape sequence: \\" + ((char) b));
            throw null;
        }
        if (!bufferedSource.j0(4L)) {
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
                    S("\\u".concat(buffer.S(4L, dj2.a)));
                    throw null;
                }
                i = bI - 55;
            }
            c = (char) (i + c2);
        }
        buffer.skip(4L);
        return c;
    }

    @Override // defpackage.ci9
    public final void R() throws EOFException {
        if (this.J) {
            bi9 bi9VarJ = j();
            nextName();
            StringBuilder sb = new StringBuilder("Cannot skip unexpected ");
            sb.append(bi9VarJ);
            rl7.m(sb, " at ", c());
            return;
        }
        int iL0 = this.M;
        if (iL0 == 0) {
            iL0 = l0();
        }
        if (iL0 == 14) {
            long jL = this.K.L(S);
            Buffer buffer = this.L;
            if (jL == -1) {
                jL = buffer.F;
            }
            buffer.skip(jL);
        } else if (iL0 == 13) {
            R0(R);
        } else if (iL0 == 12) {
            R0(Q);
        } else if (iL0 != 15) {
            StringBuilder sb2 = new StringBuilder("Expected a name but was ");
            sb2.append(j());
            rl7.m(sb2, " at path ", c());
            return;
        }
        this.M = 0;
        this.G[this.E - 1] = "null";
    }

    public final void R0(ByteString byteString) throws EOFException {
        while (true) {
            long jL = this.K.L(byteString);
            if (jL == -1) {
                S("Unterminated string");
                throw null;
            }
            Buffer buffer = this.L;
            if (buffer.i(jL) != 92) {
                buffer.skip(jL + 1);
                return;
            } else {
                buffer.skip(jL + 1);
                Q0();
            }
        }
    }

    public final void b0() {
        if (this.I) {
            return;
        }
        S("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    @Override // defpackage.ci9
    public final void beginArray() throws EOFException {
        int iL0 = this.M;
        if (iL0 == 0) {
            iL0 = l0();
        }
        if (iL0 == 3) {
            H(1);
            this.H[this.E - 1] = 0;
            this.M = 0;
        } else {
            StringBuilder sb = new StringBuilder("Expected BEGIN_ARRAY but was ");
            sb.append(j());
            rl7.m(sb, " at path ", c());
        }
    }

    @Override // defpackage.ci9
    public final void beginObject() throws EOFException {
        int iL0 = this.M;
        if (iL0 == 0) {
            iL0 = l0();
        }
        if (iL0 == 1) {
            H(3);
            this.M = 0;
        } else {
            StringBuilder sb = new StringBuilder("Expected BEGIN_OBJECT but was ");
            sb.append(j());
            rl7.m(sb, " at path ", c());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.M = 0;
        this.F[0] = 8;
        this.E = 1;
        this.L.c();
        this.K.close();
    }

    @Override // defpackage.ci9
    public final boolean e() throws EOFException {
        int iL0 = this.M;
        if (iL0 == 0) {
            iL0 = l0();
        }
        if (iL0 == 5) {
            this.M = 0;
            int[] iArr = this.H;
            int i = this.E - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iL0 != 6) {
            StringBuilder sb = new StringBuilder("Expected a boolean but was ");
            sb.append(j());
            rl7.m(sb, " at path ", c());
            return false;
        }
        this.M = 0;
        int[] iArr2 = this.H;
        int i2 = this.E - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    @Override // defpackage.ci9
    public final void endArray() throws EOFException {
        int iL0 = this.M;
        if (iL0 == 0) {
            iL0 = l0();
        }
        if (iL0 != 4) {
            StringBuilder sb = new StringBuilder("Expected END_ARRAY but was ");
            sb.append(j());
            rl7.m(sb, " at path ", c());
        } else {
            int i = this.E;
            this.E = i - 1;
            int[] iArr = this.H;
            int i2 = i - 2;
            iArr[i2] = iArr[i2] + 1;
            this.M = 0;
        }
    }

    @Override // defpackage.ci9
    public final void endObject() throws EOFException {
        int iL0 = this.M;
        if (iL0 == 0) {
            iL0 = l0();
        }
        if (iL0 != 2) {
            StringBuilder sb = new StringBuilder("Expected END_OBJECT but was ");
            sb.append(j());
            rl7.m(sb, " at path ", c());
            return;
        }
        int i = this.E;
        int i2 = i - 1;
        this.E = i2;
        this.G[i2] = null;
        int[] iArr = this.H;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.M = 0;
    }

    @Override // defpackage.ci9
    public final void f() throws EOFException {
        int iL0 = this.M;
        if (iL0 == 0) {
            iL0 = l0();
        }
        if (iL0 != 7) {
            StringBuilder sb = new StringBuilder("Expected null but was ");
            sb.append(j());
            rl7.m(sb, " at path ", c());
        } else {
            this.M = 0;
            int[] iArr = this.H;
            int i = this.E - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    @Override // defpackage.ci9
    public final boolean hasNext() throws EOFException {
        int iL0 = this.M;
        if (iL0 == 0) {
            iL0 = l0();
        }
        return (iL0 == 2 || iL0 == 4 || iL0 == 18) ? false : true;
    }

    @Override // defpackage.ci9
    public final bi9 j() throws EOFException {
        int iL0 = this.M;
        if (iL0 == 0) {
            iL0 = l0();
        }
        switch (iL0) {
            case 1:
                return bi9.G;
            case 2:
                return bi9.H;
            case 3:
                return bi9.E;
            case 4:
                return bi9.F;
            case 5:
            case 6:
                return bi9.L;
            case 7:
                return bi9.M;
            case 8:
            case 9:
            case 10:
            case 11:
                return bi9.J;
            case 12:
            case 13:
            case 14:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return bi9.I;
            case 16:
            case g.MAX_FIELD_NUMBER /* 17 */:
                return bi9.K;
            case g.AVG_FIELD_NUMBER /* 18 */:
                return bi9.N;
            default:
                mr9.u();
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x01ad, code lost:
    
        if (B0(r14) != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01af, code lost:
    
        if (r4 != 2) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01b1, code lost:
    
        if (r5 == false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01b7, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01b9, code lost:
    
        if (r2 == false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01bd, code lost:
    
        if (r8 != r16) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01bf, code lost:
    
        if (r2 != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01c1, code lost:
    
        if (r2 == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01c4, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01c5, code lost:
    
        r24.N = r8;
        r11.skip(r1);
        r10 = 16;
        r24.M = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01d0, code lost:
    
        if (r4 == 2) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01d3, code lost:
    
        if (r4 == 4) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01d6, code lost:
    
        if (r4 != 7) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01d8, code lost:
    
        r24.O = r1;
        r10 = 17;
        r24.M = 17;
     */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01ff A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0132 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int l0() throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bj9.l0():int");
    }

    @Override // defpackage.ci9
    public final ci9 n() {
        return new bj9(this);
    }

    @Override // defpackage.ci9
    public final double nextDouble() throws EOFException, JsonEncodingException {
        int iL0 = this.M;
        if (iL0 == 0) {
            iL0 = l0();
        }
        if (iL0 == 16) {
            this.M = 0;
            int[] iArr = this.H;
            int i = this.E - 1;
            iArr[i] = iArr[i] + 1;
            return this.N;
        }
        if (iL0 == 17) {
            long j = this.O;
            Buffer buffer = this.L;
            buffer.getClass();
            this.P = buffer.S(j, dj2.a);
        } else if (iL0 == 9) {
            this.P = O0(R);
        } else if (iL0 == 8) {
            this.P = O0(Q);
        } else if (iL0 == 10) {
            this.P = P0();
        } else if (iL0 != 11) {
            StringBuilder sb = new StringBuilder("Expected a double but was ");
            sb.append(j());
            rl7.m(sb, " at path ", c());
            return 0.0d;
        }
        this.M = 11;
        try {
            double d = Double.parseDouble(this.P);
            if (this.I || !(Double.isNaN(d) || Double.isInfinite(d))) {
                this.P = null;
                this.M = 0;
                int[] iArr2 = this.H;
                int i2 = this.E - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return d;
            }
            throw new JsonEncodingException("JSON forbids NaN and infinities: " + d + " at path " + c());
        } catch (NumberFormatException unused) {
            rl7.l("Expected a double but was ", this.P, " at path ", c());
            return 0.0d;
        }
    }

    @Override // defpackage.ci9
    public final int nextInt() throws EOFException {
        int iL0 = this.M;
        if (iL0 == 0) {
            iL0 = l0();
        }
        if (iL0 == 16) {
            long j = this.N;
            int i = (int) j;
            if (j == i) {
                this.M = 0;
                int[] iArr = this.H;
                int i2 = this.E - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new JsonDataException("Expected an int but was " + this.N + " at path " + c());
        }
        if (iL0 == 17) {
            long j2 = this.O;
            Buffer buffer = this.L;
            buffer.getClass();
            this.P = buffer.S(j2, dj2.a);
        } else if (iL0 == 9 || iL0 == 8) {
            String strO0 = iL0 == 9 ? O0(R) : O0(Q);
            this.P = strO0;
            try {
                int i3 = Integer.parseInt(strO0);
                this.M = 0;
                int[] iArr2 = this.H;
                int i4 = this.E - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else if (iL0 != 11) {
            StringBuilder sb = new StringBuilder("Expected an int but was ");
            sb.append(j());
            rl7.m(sb, " at path ", c());
            return 0;
        }
        this.M = 11;
        try {
            double d = Double.parseDouble(this.P);
            int i5 = (int) d;
            if (i5 != d) {
                rl7.l("Expected an int but was ", this.P, " at path ", c());
                return 0;
            }
            this.P = null;
            this.M = 0;
            int[] iArr3 = this.H;
            int i6 = this.E - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            rl7.l("Expected an int but was ", this.P, " at path ", c());
            return 0;
        }
    }

    @Override // defpackage.ci9
    public final long nextLong() throws EOFException {
        int iL0 = this.M;
        if (iL0 == 0) {
            iL0 = l0();
        }
        if (iL0 == 16) {
            this.M = 0;
            int[] iArr = this.H;
            int i = this.E - 1;
            iArr[i] = iArr[i] + 1;
            return this.N;
        }
        if (iL0 == 17) {
            long j = this.O;
            Buffer buffer = this.L;
            buffer.getClass();
            this.P = buffer.S(j, dj2.a);
        } else if (iL0 == 9 || iL0 == 8) {
            String strO0 = iL0 == 9 ? O0(R) : O0(Q);
            this.P = strO0;
            try {
                long j2 = Long.parseLong(strO0);
                this.M = 0;
                int[] iArr2 = this.H;
                int i2 = this.E - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return j2;
            } catch (NumberFormatException unused) {
            }
        } else if (iL0 != 11) {
            StringBuilder sb = new StringBuilder("Expected a long but was ");
            sb.append(j());
            rl7.m(sb, " at path ", c());
            return 0L;
        }
        this.M = 11;
        try {
            long jLongValueExact = new BigDecimal(this.P).longValueExact();
            this.P = null;
            this.M = 0;
            int[] iArr3 = this.H;
            int i3 = this.E - 1;
            iArr3[i3] = iArr3[i3] + 1;
            return jLongValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            rl7.l("Expected a long but was ", this.P, " at path ", c());
            return 0L;
        }
    }

    @Override // defpackage.ci9
    public final String nextName() throws EOFException {
        String strO0;
        int iL0 = this.M;
        if (iL0 == 0) {
            iL0 = l0();
        }
        if (iL0 == 14) {
            strO0 = P0();
        } else if (iL0 == 13) {
            strO0 = O0(R);
        } else if (iL0 == 12) {
            strO0 = O0(Q);
        } else {
            if (iL0 != 15) {
                StringBuilder sb = new StringBuilder("Expected a name but was ");
                sb.append(j());
                rl7.m(sb, " at path ", c());
                return null;
            }
            strO0 = this.P;
            this.P = null;
        }
        this.M = 0;
        this.G[this.E - 1] = strO0;
        return strO0;
    }

    @Override // defpackage.ci9
    public final String nextString() throws EOFException {
        String strS;
        int iL0 = this.M;
        if (iL0 == 0) {
            iL0 = l0();
        }
        if (iL0 == 10) {
            strS = P0();
        } else if (iL0 == 9) {
            strS = O0(R);
        } else if (iL0 == 8) {
            strS = O0(Q);
        } else if (iL0 == 11) {
            strS = this.P;
            this.P = null;
        } else if (iL0 == 16) {
            strS = Long.toString(this.N);
        } else {
            if (iL0 != 17) {
                StringBuilder sb = new StringBuilder("Expected a string but was ");
                sb.append(j());
                rl7.m(sb, " at path ", c());
                return null;
            }
            long j = this.O;
            Buffer buffer = this.L;
            buffer.getClass();
            strS = buffer.S(j, dj2.a);
        }
        this.M = 0;
        int[] iArr = this.H;
        int i = this.E - 1;
        iArr[i] = iArr[i] + 1;
        return strS;
    }

    public final int r0(String str, ai9 ai9Var) {
        int length = ai9Var.a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(ai9Var.a[i])) {
                this.M = 0;
                this.G[this.E - 1] = str;
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.ci9
    public final void skipValue() throws EOFException {
        if (this.J) {
            StringBuilder sb = new StringBuilder("Cannot skip unexpected ");
            sb.append(j());
            rl7.m(sb, " at ", c());
            return;
        }
        int i = 0;
        do {
            int iL0 = this.M;
            if (iL0 == 0) {
                iL0 = l0();
            }
            if (iL0 == 3) {
                H(1);
            } else if (iL0 == 1) {
                H(3);
            } else {
                if (iL0 == 4) {
                    i--;
                    if (i < 0) {
                        StringBuilder sb2 = new StringBuilder("Expected a value but was ");
                        sb2.append(j());
                        rl7.m(sb2, " at path ", c());
                        return;
                    }
                    this.E--;
                } else if (iL0 == 2) {
                    i--;
                    if (i < 0) {
                        StringBuilder sb3 = new StringBuilder("Expected a value but was ");
                        sb3.append(j());
                        rl7.m(sb3, " at path ", c());
                        return;
                    }
                    this.E--;
                } else {
                    Buffer buffer = this.L;
                    if (iL0 == 14 || iL0 == 10) {
                        long jL = this.K.L(S);
                        if (jL == -1) {
                            jL = buffer.F;
                        }
                        buffer.skip(jL);
                    } else if (iL0 == 9 || iL0 == 13) {
                        R0(R);
                    } else if (iL0 == 8 || iL0 == 12) {
                        R0(Q);
                    } else if (iL0 == 17) {
                        buffer.skip(this.O);
                    } else if (iL0 == 18) {
                        StringBuilder sb4 = new StringBuilder("Expected a value but was ");
                        sb4.append(j());
                        rl7.m(sb4, " at path ", c());
                        return;
                    }
                }
                this.M = 0;
            }
            i++;
            this.M = 0;
        } while (i != 0);
        int[] iArr = this.H;
        int i2 = this.E - 1;
        iArr[i2] = iArr[i2] + 1;
        this.G[i2] = "null";
    }

    public final String toString() {
        return "JsonReader(" + this.K + ")";
    }

    @Override // defpackage.ci9
    public final void x() {
        if (hasNext()) {
            this.P = nextName();
            this.M = 11;
        }
    }

    public final int x0(String str, ai9 ai9Var) {
        int length = ai9Var.a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(ai9Var.a[i])) {
                this.M = 0;
                int[] iArr = this.H;
                int i2 = this.E - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
        }
        return -1;
    }

    public bj9(BufferedSource bufferedSource) {
        this.M = 0;
        if (bufferedSource != null) {
            this.K = bufferedSource;
            this.L = bufferedSource.getF();
            H(6);
            return;
        }
        mr9.h("source == null");
        throw null;
    }
}
