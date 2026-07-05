package okio;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.d;
import defpackage.dj2;
import defpackage.grc;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.mp0;
import defpackage.mr9;
import defpackage.pmf;
import defpackage.sz6;
import defpackage.vb7;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lokio/Buffer;", "Lokio/BufferedSource;", "Lokio/BufferedSink;", "", "Ljava/nio/channels/ByteChannel;", "UnsafeCursor", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class Buffer implements BufferedSource, BufferedSink, Cloneable, ByteChannel {
    public Segment E;
    public long F;

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/Buffer$UnsafeCursor;", "Ljava/io/Closeable;", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
    public static final class UnsafeCursor implements Closeable {
        public Buffer E;
        public boolean F;
        public Segment G;
        public byte[] I;
        public long H = -1;
        public int J = -1;
        public int K = -1;

        public final void c(long j) {
            Buffer buffer = this.E;
            if (buffer == null) {
                sz6.j("not attached to a buffer");
                return;
            }
            if (!this.F) {
                sz6.j("resizeBuffer() only permitted for read/write buffers");
                return;
            }
            long j2 = buffer.F;
            if (j <= j2) {
                if (j < 0) {
                    mr9.q(vb7.m(j, "newSize < 0: "));
                    return;
                }
                long j3 = j2 - j;
                while (true) {
                    if (j3 <= 0) {
                        break;
                    }
                    Segment segment = buffer.E;
                    segment.getClass();
                    Segment segment2 = segment.g;
                    segment2.getClass();
                    int i = segment2.c;
                    long j4 = i - segment2.b;
                    if (j4 > j3) {
                        segment2.c = i - ((int) j3);
                        break;
                    } else {
                        buffer.E = segment2.a();
                        SegmentPool.a(segment2);
                        j3 -= j4;
                    }
                }
                this.G = null;
                this.H = j;
                this.I = null;
                this.J = -1;
                this.K = -1;
            } else if (j > j2) {
                long j5 = j - j2;
                int i2 = 1;
                boolean z = true;
                for (long j6 = 0; j5 > j6; j6 = 0) {
                    Segment segmentB0 = buffer.b0(i2);
                    int iMin = (int) Math.min(j5, 8192 - segmentB0.c);
                    int i3 = segmentB0.c + iMin;
                    segmentB0.c = i3;
                    j5 -= (long) iMin;
                    if (z) {
                        this.G = segmentB0;
                        this.H = j2;
                        this.I = segmentB0.a;
                        this.J = i3 - iMin;
                        this.K = i3;
                        z = false;
                    }
                    i2 = 1;
                }
            }
            buffer.F = j;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.E == null) {
                sz6.j("not attached to a buffer");
                return;
            }
            this.E = null;
            this.G = null;
            this.H = -1L;
            this.I = null;
            this.J = -1;
            this.K = -1;
        }

        public final int d(long j) {
            Buffer buffer = this.E;
            if (buffer == null) {
                sz6.j("not attached to a buffer");
                return 0;
            }
            if (j >= -1) {
                long j2 = buffer.F;
                if (j <= j2) {
                    if (j == -1 || j == j2) {
                        this.G = null;
                        this.H = j;
                        this.I = null;
                        this.J = -1;
                        this.K = -1;
                        return -1;
                    }
                    Segment segment = buffer.E;
                    Segment segment2 = this.G;
                    long j3 = 0;
                    if (segment2 != null) {
                        long j4 = this.H - ((long) (this.J - segment2.b));
                        if (j4 > j) {
                            segment2 = segment;
                            segment = segment2;
                            j2 = j4;
                        } else {
                            j3 = j4;
                        }
                    } else {
                        segment2 = segment;
                    }
                    if (j2 - j > j - j3) {
                        while (true) {
                            segment2.getClass();
                            long j5 = ((long) (segment2.c - segment2.b)) + j3;
                            if (j < j5) {
                                break;
                            }
                            segment2 = segment2.f;
                            j3 = j5;
                        }
                    } else {
                        while (j2 > j) {
                            segment.getClass();
                            segment = segment.g;
                            segment.getClass();
                            j2 -= (long) (segment.c - segment.b);
                        }
                        segment2 = segment;
                        j3 = j2;
                    }
                    if (this.F) {
                        segment2.getClass();
                        if (segment2.d) {
                            byte[] bArr = segment2.a;
                            Segment segment3 = new Segment(Arrays.copyOf(bArr, bArr.length), segment2.b, segment2.c, false, true);
                            if (buffer.E == segment2) {
                                buffer.E = segment3;
                            }
                            segment2.b(segment3);
                            Segment segment4 = segment3.g;
                            segment4.getClass();
                            segment4.a();
                            segment2 = segment3;
                        }
                    }
                    this.G = segment2;
                    this.H = j;
                    segment2.getClass();
                    this.I = segment2.a;
                    int i = segment2.b + ((int) (j - j3));
                    this.J = i;
                    int i2 = segment2.c;
                    this.K = i2;
                    return i2 - i;
                }
            }
            StringBuilder sbW = grc.w(j, "offset=", " > size=");
            sbW.append(buffer.F);
            throw new ArrayIndexOutOfBoundsException(sbW.toString());
        }
    }

    @Override // okio.Source
    public final long A0(Buffer buffer, long j) {
        buffer.getClass();
        if (j < 0) {
            mr9.q(vb7.m(j, "byteCount < 0: "));
            return 0L;
        }
        long j2 = this.F;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        buffer.c0(this, j);
        return j;
    }

    @Override // okio.BufferedSource
    public final byte[] B() {
        return K(this.F);
    }

    public final void B0(int i) {
        Segment segmentB0 = b0(1);
        byte[] bArr = segmentB0.a;
        int i2 = segmentB0.c;
        segmentB0.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.F++;
    }

    @Override // okio.BufferedSource
    public final long C(ByteString byteString) {
        byteString.getClass();
        return u0(Long.MAX_VALUE, byteString);
    }

    @Override // okio.BufferedSource
    public final long C0() {
        return SegmentedByteString.d(readLong());
    }

    public final void D0(long j) {
        boolean z;
        if (j == 0) {
            B0(48);
            return;
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                T0("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = d.a;
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i = iNumberOfLeadingZeros + (j > d.b[iNumberOfLeadingZeros] ? 1 : 0);
        if (z) {
            i++;
        }
        Segment segmentB0 = b0(i);
        byte[] bArr2 = segmentB0.a;
        int i2 = segmentB0.c + i;
        while (j != 0) {
            i2--;
            bArr2[i2] = d.a[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr2[i2 - 1] = 45;
        }
        segmentB0.c += i;
        this.F += (long) i;
    }

    @Override // okio.BufferedSink
    public final BufferedSink E(int i) {
        P0(SegmentedByteString.c(i));
        return this;
    }

    @Override // okio.BufferedSource
    public final boolean F() {
        return this.F == 0;
    }

    @Override // okio.BufferedSource
    public final long F0(BufferedSink bufferedSink) {
        long j = this.F;
        if (j > 0) {
            bufferedSink.c0(this, j);
        }
        return j;
    }

    public final void H(UnsafeCursor unsafeCursor) {
        unsafeCursor.getClass();
        byte[] bArr = d.a;
        if (unsafeCursor.E != null) {
            sz6.j("already attached to a buffer");
        } else {
            unsafeCursor.E = this;
            unsafeCursor.F = true;
        }
    }

    @Override // okio.BufferedSource
    public final void I0(long j) throws EOFException {
        if (this.F >= j) {
            return;
        }
        sz6.n();
    }

    @Override // okio.BufferedSource
    public final void J(Buffer buffer, long j) throws EOFException {
        long j2 = this.F;
        if (j2 >= j) {
            buffer.c0(this, j);
        } else {
            buffer.c0(this, j2);
            sz6.n();
        }
    }

    public final byte[] K(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            mr9.q(vb7.m(j, "byteCount: "));
            return null;
        }
        if (this.F < j) {
            sz6.n();
            return null;
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    @Override // okio.BufferedSink
    public final OutputStream K0() {
        return new OutputStream() { // from class: okio.Buffer$outputStream$1
            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public final void flush() {
            }

            public final String toString() {
                return this.E + ".outputStream()";
            }

            @Override // java.io.OutputStream
            public final void write(byte[] bArr, int i, int i2) {
                bArr.getClass();
                this.E.m1202write(bArr, i, i2);
            }

            @Override // java.io.OutputStream
            public final void write(int i) {
                this.E.B0(i);
            }
        };
    }

    @Override // okio.BufferedSource
    public final long L(ByteString byteString) {
        byteString.getClass();
        return n(0L, byteString);
    }

    @Override // okio.BufferedSource
    public final InputStream M0() {
        return new InputStream() { // from class: okio.Buffer$inputStream$1
            @Override // java.io.InputStream
            public final int available() {
                return (int) Math.min(this.E.F, 2147483647L);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }

            @Override // java.io.InputStream
            public final int read() {
                Buffer buffer = this.E;
                if (buffer.F > 0) {
                    return buffer.readByte() & 255;
                }
                return -1;
            }

            public final String toString() {
                return this.E + ".inputStream()";
            }

            @Override // java.io.InputStream
            public final int read(byte[] bArr, int i, int i2) {
                bArr.getClass();
                return this.E.read(bArr, i, i2);
            }
        };
    }

    @Override // okio.BufferedSource
    public final int N0(Options options) throws EOFException {
        options.getClass();
        int iD = d.d(this, options, false);
        if (iD == -1) {
            return -1;
        }
        skip(options.E[iD].e());
        return iD;
    }

    @Override // okio.BufferedSource
    public final String O(long j) throws EOFException {
        if (j < 0) {
            mr9.q(vb7.m(j, "limit < 0: "));
            return null;
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long j3 = j((byte) 10, 0L, j2);
        if (j3 != -1) {
            return d.c(this, j3);
        }
        if (j2 < this.F && i(j2 - 1) == 13 && i(j2) == 10) {
            return d.c(this, j2);
        }
        Buffer buffer = new Buffer();
        f(buffer, 0L, Math.min(32L, this.F));
        throw new EOFException("\\n not found: limit=" + Math.min(this.F, j) + " content=" + buffer.t(buffer.F).f() + (char) 8230);
    }

    public final void O0(long j) {
        if (j == 0) {
            B0(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        Segment segmentB0 = b0(i);
        byte[] bArr = segmentB0.a;
        int i2 = segmentB0.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = d.a[(int) (15 & j)];
            j >>>= 4;
        }
        segmentB0.c += i;
        this.F += (long) i;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2 A[EDGE_INSN: B:44:0x00a2->B:38:0x00a2 BREAK  A[LOOP:0: B:5:0x000c->B:46:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long P() throws java.io.EOFException {
        /*
            r15 = this;
            long r0 = r15.F
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto La9
            r0 = 0
            r1 = r0
            r6 = r1
            r4 = r2
        Lc:
            okio.Segment r7 = r15.E
            r7.getClass()
            byte[] r8 = r7.a
            int r9 = r7.b
            int r10 = r7.c
        L17:
            if (r9 >= r10) goto L8e
            r11 = r8[r9]
            r12 = 48
            if (r11 < r12) goto L26
            r12 = 57
            if (r11 > r12) goto L26
            int r12 = r11 + (-48)
            goto L3b
        L26:
            r12 = 97
            if (r11 < r12) goto L31
            r12 = 102(0x66, float:1.43E-43)
            if (r11 > r12) goto L31
            int r12 = r11 + (-87)
            goto L3b
        L31:
            r12 = 65
            if (r11 < r12) goto L66
            r12 = 70
            if (r11 > r12) goto L66
            int r12 = r11 + (-55)
        L3b:
            r13 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r13 = r13 & r4
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 != 0) goto L4b
            r11 = 4
            long r4 = r4 << r11
            long r11 = (long) r12
            long r4 = r4 | r11
            int r9 = r9 + 1
            int r1 = r1 + 1
            goto L17
        L4b:
            okio.Buffer r15 = new okio.Buffer
            r15.<init>()
            r15.O0(r4)
            r15.B0(r11)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r15 = r15.t0()
            java.lang.String r1 = "Number too large: "
            java.lang.String r15 = r1.concat(r15)
            r0.<init>(r15)
            throw r0
        L66:
            r6 = 1
            if (r1 == 0) goto L6a
            goto L8e
        L6a:
            java.lang.NumberFormatException r15 = new java.lang.NumberFormatException
            char[] r1 = defpackage.j8.a
            int r2 = r11 >> 4
            r2 = r2 & 15
            char r2 = r1[r2]
            r3 = r11 & 15
            char r1 = r1[r3]
            r3 = 2
            char[] r3 = new char[r3]
            r3[r0] = r2
            r3[r6] = r1
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r0 = r1.concat(r0)
            r15.<init>(r0)
            throw r15
        L8e:
            if (r9 != r10) goto L9a
            okio.Segment r8 = r7.a()
            r15.E = r8
            okio.SegmentPool.a(r7)
            goto L9c
        L9a:
            r7.b = r9
        L9c:
            if (r6 != 0) goto La2
            okio.Segment r7 = r15.E
            if (r7 != 0) goto Lc
        La2:
            long r2 = r15.F
            long r0 = (long) r1
            long r2 = r2 - r0
            r15.F = r2
            return r4
        La9:
            defpackage.sz6.n()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Buffer.P():long");
    }

    public final void P0(int i) {
        Segment segmentB0 = b0(4);
        byte[] bArr = segmentB0.a;
        int i2 = segmentB0.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        segmentB0.c = i2 + 4;
        this.F += 4;
    }

    public final void Q0(long j) {
        Segment segmentB0 = b0(8);
        byte[] bArr = segmentB0.a;
        int i = segmentB0.c;
        bArr[i] = (byte) ((j >>> 56) & 255);
        bArr[i + 1] = (byte) ((j >>> 48) & 255);
        bArr[i + 2] = (byte) ((j >>> 40) & 255);
        bArr[i + 3] = (byte) ((j >>> 32) & 255);
        bArr[i + 4] = (byte) ((j >>> 24) & 255);
        bArr[i + 5] = (byte) ((j >>> 16) & 255);
        bArr[i + 6] = (byte) ((j >>> 8) & 255);
        bArr[i + 7] = (byte) (j & 255);
        segmentB0.c = i + 8;
        this.F += 8;
    }

    public final short R() throws EOFException {
        short s = readShort();
        return (short) (((s & 255) << 8) | ((65280 & s) >>> 8));
    }

    public final void R0(int i) {
        Segment segmentB0 = b0(2);
        byte[] bArr = segmentB0.a;
        int i2 = segmentB0.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        segmentB0.c = i2 + 2;
        this.F += 2;
    }

    public final String S(long j, Charset charset) throws EOFException {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            mr9.q(vb7.m(j, "byteCount: "));
            return null;
        }
        if (this.F < j) {
            sz6.n();
            return null;
        }
        if (j == 0) {
            return "";
        }
        Segment segment = this.E;
        segment.getClass();
        int i = segment.b;
        if (((long) i) + j > segment.c) {
            return new String(K(j), charset);
        }
        int i2 = (int) j;
        String str = new String(segment.a, i, i2, charset);
        int i3 = segment.b + i2;
        segment.b = i3;
        this.F -= j;
        if (i3 == segment.c) {
            this.E = segment.a();
            SegmentPool.a(segment);
        }
        return str;
    }

    public final void S0(int i, int i2, String str) {
        char cCharAt;
        str.getClass();
        if (i < 0) {
            mr9.q(grc.p(i, "beginIndex < 0: "));
            return;
        }
        if (i2 < i) {
            mr9.q(grc.o(i2, i, "endIndex < beginIndex: ", " < "));
            return;
        }
        if (i2 > str.length()) {
            pmf.f(str.length(), vb7.u("endIndex > string.length: ", i2, " > "));
            return;
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                Segment segmentB0 = b0(1);
                byte[] bArr = segmentB0.a;
                int i3 = segmentB0.c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = segmentB0.c;
                int i6 = (i3 + i) - i5;
                segmentB0.c = i5 + i6;
                this.F += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    Segment segmentB02 = b0(2);
                    byte[] bArr2 = segmentB02.a;
                    int i7 = segmentB02.c;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | FreeTypeConstants.FT_LOAD_PEDANTIC);
                    segmentB02.c = i7 + 2;
                    this.F += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    Segment segmentB03 = b0(3);
                    byte[] bArr3 = segmentB03.a;
                    int i8 = segmentB03.c;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | FreeTypeConstants.FT_LOAD_PEDANTIC);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | FreeTypeConstants.FT_LOAD_PEDANTIC);
                    segmentB03.c = i8 + 3;
                    this.F += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        B0(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        Segment segmentB04 = b0(4);
                        byte[] bArr4 = segmentB04.a;
                        int i11 = segmentB04.c;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | FreeTypeConstants.FT_LOAD_PEDANTIC);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | FreeTypeConstants.FT_LOAD_PEDANTIC);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | FreeTypeConstants.FT_LOAD_PEDANTIC);
                        segmentB04.c = i11 + 4;
                        this.F += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    public final ByteString T(int i) {
        if (i == 0) {
            return ByteString.H;
        }
        SegmentedByteString.b(this.F, 0L, i);
        Segment segment = this.E;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            segment.getClass();
            int i5 = segment.c;
            int i6 = segment.b;
            if (i5 == i6) {
                sz6.h("s.limit == s.pos");
                return null;
            }
            i3 += i5 - i6;
            i4++;
            segment = segment.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        Segment segment2 = this.E;
        int i7 = 0;
        while (i2 < i) {
            segment2.getClass();
            bArr[i7] = segment2.a;
            i2 += segment2.c - segment2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = segment2.b;
            segment2.d = true;
            i7++;
            segment2 = segment2.f;
        }
        return new C0024SegmentedByteString(bArr, iArr);
    }

    public final void T0(String str) {
        str.getClass();
        S0(0, str.length(), str);
    }

    public final void U0(int i) {
        if (i < 128) {
            B0(i);
            return;
        }
        if (i < 2048) {
            Segment segmentB0 = b0(2);
            byte[] bArr = segmentB0.a;
            int i2 = segmentB0.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | FreeTypeConstants.FT_LOAD_PEDANTIC);
            segmentB0.c = i2 + 2;
            this.F += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            B0(63);
            return;
        }
        if (i < 65536) {
            Segment segmentB02 = b0(3);
            byte[] bArr2 = segmentB02.a;
            int i3 = segmentB02.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | FreeTypeConstants.FT_LOAD_PEDANTIC);
            bArr2[i3 + 2] = (byte) ((i & 63) | FreeTypeConstants.FT_LOAD_PEDANTIC);
            segmentB02.c = i3 + 3;
            this.F += 3;
            return;
        }
        if (i > 1114111) {
            sz6.p("Unexpected code point: 0x".concat(SegmentedByteString.e(i)));
            return;
        }
        Segment segmentB03 = b0(4);
        byte[] bArr3 = segmentB03.a;
        int i4 = segmentB03.c;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | FreeTypeConstants.FT_LOAD_PEDANTIC);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | FreeTypeConstants.FT_LOAD_PEDANTIC);
        bArr3[i4 + 3] = (byte) ((i & 63) | FreeTypeConstants.FT_LOAD_PEDANTIC);
        segmentB03.c = i4 + 4;
        this.F += 4;
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink W(String str) {
        T0(str);
        return this;
    }

    @Override // okio.BufferedSource
    public final boolean Y(long j, ByteString byteString) {
        byteString.getClass();
        return x(byteString.e(), j, byteString);
    }

    @Override // okio.BufferedSource
    public final String Z(Charset charset) {
        charset.getClass();
        return S(this.F, charset);
    }

    public final Segment b0(int i) {
        if (i < 1 || i > 8192) {
            sz6.p("unexpected capacity");
            return null;
        }
        Segment segment = this.E;
        if (segment == null) {
            Segment segmentB = SegmentPool.b();
            this.E = segmentB;
            segmentB.g = segmentB;
            segmentB.f = segmentB;
            return segmentB;
        }
        Segment segment2 = segment.g;
        segment2.getClass();
        if (segment2.c + i <= 8192 && segment2.e) {
            return segment2;
        }
        Segment segmentB2 = SegmentPool.b();
        segment2.b(segmentB2);
        return segmentB2;
    }

    public final void c() throws EOFException {
        skip(this.F);
    }

    @Override // okio.Sink
    public final void c0(Buffer buffer, long j) {
        Segment segmentB;
        buffer.getClass();
        if (buffer == this) {
            sz6.p("source == this");
            return;
        }
        SegmentedByteString.b(buffer.F, 0L, j);
        while (j > 0) {
            Segment segment = buffer.E;
            segment.getClass();
            int i = segment.c;
            Segment segment2 = buffer.E;
            segment2.getClass();
            long j2 = i - segment2.b;
            int i2 = 0;
            if (j < j2) {
                Segment segment3 = this.E;
                Segment segment4 = segment3 != null ? segment3.g : null;
                if (segment4 != null && segment4.e) {
                    if ((((long) segment4.c) + j) - ((long) (segment4.d ? 0 : segment4.b)) <= 8192) {
                        Segment segment5 = buffer.E;
                        segment5.getClass();
                        segment5.d(segment4, (int) j);
                        buffer.F -= j;
                        this.F += j;
                        return;
                    }
                }
                Segment segment6 = buffer.E;
                segment6.getClass();
                int i3 = (int) j;
                if (i3 <= 0 || i3 > segment6.c - segment6.b) {
                    sz6.p("byteCount out of range");
                    return;
                }
                if (i3 >= 1024) {
                    segmentB = segment6.c();
                } else {
                    segmentB = SegmentPool.b();
                    byte[] bArr = segment6.a;
                    byte[] bArr2 = segmentB.a;
                    int i4 = segment6.b;
                    mp0.w0(bArr, bArr2, 0, i4, i4 + i3, 2);
                }
                segmentB.c = segmentB.b + i3;
                segment6.b += i3;
                Segment segment7 = segment6.g;
                segment7.getClass();
                segment7.b(segmentB);
                buffer.E = segmentB;
            }
            Segment segment8 = buffer.E;
            segment8.getClass();
            long j3 = segment8.c - segment8.b;
            buffer.E = segment8.a();
            Segment segment9 = this.E;
            if (segment9 == null) {
                this.E = segment8;
                segment8.g = segment8;
                segment8.f = segment8;
            } else {
                Segment segment10 = segment9.g;
                segment10.getClass();
                segment10.b(segment8);
                Segment segment11 = segment8.g;
                if (segment11 == segment8) {
                    sz6.j("cannot compact");
                    return;
                }
                segment11.getClass();
                if (segment11.e) {
                    int i5 = segment8.c - segment8.b;
                    Segment segment12 = segment8.g;
                    segment12.getClass();
                    int i6 = 8192 - segment12.c;
                    Segment segment13 = segment8.g;
                    segment13.getClass();
                    if (!segment13.d) {
                        Segment segment14 = segment8.g;
                        segment14.getClass();
                        i2 = segment14.b;
                    }
                    if (i5 <= i6 + i2) {
                        Segment segment15 = segment8.g;
                        segment15.getClass();
                        segment8.d(segment15, i5);
                        segment8.a();
                        SegmentPool.a(segment8);
                    }
                }
            }
            buffer.F -= j3;
            this.F += j3;
            j -= j3;
        }
    }

    public final Object clone() {
        Buffer buffer = new Buffer();
        if (this.F == 0) {
            return buffer;
        }
        Segment segment = this.E;
        segment.getClass();
        Segment segmentC = segment.c();
        buffer.E = segmentC;
        segmentC.g = segmentC;
        segmentC.f = segmentC;
        for (Segment segment2 = segment.f; segment2 != segment; segment2 = segment2.f) {
            Segment segment3 = segmentC.g;
            segment3.getClass();
            segment2.getClass();
            segment3.b(segment2.c());
        }
        buffer.F = this.F;
        return buffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, okio.Sink
    public final void close() {
    }

    public final long d() {
        long j = this.F;
        if (j == 0) {
            return 0L;
        }
        Segment segment = this.E;
        segment.getClass();
        Segment segment2 = segment.g;
        segment2.getClass();
        int i = segment2.c;
        return (i >= 8192 || !segment2.e) ? j : j - ((long) (i - segment2.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Buffer)) {
            return false;
        }
        long j = this.F;
        Buffer buffer = (Buffer) obj;
        if (j != buffer.F) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        Segment segment = this.E;
        segment.getClass();
        Segment segment2 = buffer.E;
        segment2.getClass();
        int i = segment.b;
        int i2 = segment2.b;
        long j2 = 0;
        while (j2 < this.F) {
            long jMin = Math.min(segment.c - i, segment2.c - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (segment.a[i] != segment2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == segment.c) {
                segment = segment.f;
                segment.getClass();
                i = segment.b;
            }
            if (i2 == segment2.c) {
                segment2 = segment2.f;
                segment2.getClass();
                i2 = segment2.b;
            }
            j2 += jMin;
        }
        return true;
    }

    public final void f(Buffer buffer, long j, long j2) {
        buffer.getClass();
        long j3 = j;
        SegmentedByteString.b(this.F, j3, j2);
        if (j2 == 0) {
            return;
        }
        buffer.F += j2;
        Segment segment = this.E;
        while (true) {
            segment.getClass();
            long j4 = segment.c - segment.b;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            segment = segment.f;
        }
        long j5 = j2;
        while (j5 > 0) {
            segment.getClass();
            Segment segmentC = segment.c();
            int i = segmentC.b + ((int) j3);
            segmentC.b = i;
            segmentC.c = Math.min(i + ((int) j5), segmentC.c);
            Segment segment2 = buffer.E;
            if (segment2 == null) {
                segmentC.g = segmentC;
                segmentC.f = segmentC;
                buffer.E = segmentC;
            } else {
                Segment segment3 = segment2.g;
                segment3.getClass();
                segment3.b(segmentC);
            }
            j5 -= (long) (segmentC.c - segmentC.b);
            segment = segment.f;
            j3 = 0;
        }
    }

    @Override // okio.BufferedSink
    public final long f0(Source source) {
        source.getClass();
        long j = 0;
        while (true) {
            long jA0 = source.A0(this, 8192L);
            if (jA0 == -1) {
                return j;
            }
            j += jA0;
        }
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public final void flush() {
    }

    public final int hashCode() {
        Segment segment = this.E;
        if (segment == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = segment.c;
            for (int i3 = segment.b; i3 < i2; i3++) {
                i = (i * 31) + segment.a[i3];
            }
            segment = segment.f;
            segment.getClass();
        } while (segment != this.E);
        return i;
    }

    public final byte i(long j) {
        SegmentedByteString.b(this.F, j, 1L);
        Segment segment = this.E;
        segment.getClass();
        long j2 = this.F;
        if (j2 - j < j) {
            while (j2 > j) {
                segment = segment.g;
                segment.getClass();
                j2 -= (long) (segment.c - segment.b);
            }
            return segment.a[(int) ((((long) segment.b) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = segment.c;
            int i2 = segment.b;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return segment.a[(int) ((((long) i2) + j) - j3)];
            }
            segment = segment.f;
            segment.getClass();
            j3 = j4;
        }
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink i0(int i, int i2, String str) {
        S0(i, i2, str);
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final long j(byte b, long j, long j2) {
        Segment segment;
        long j3 = 0;
        if (0 > j || j > j2) {
            StringBuilder sb = new StringBuilder("size=");
            sb.append(this.F);
            ij0.u(j, " fromIndex=", " toIndex=", sb);
            sb.append(j2);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        long j4 = this.F;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j == j2 || (segment = this.E) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                segment = segment.g;
                segment.getClass();
                j4 -= (long) (segment.c - segment.b);
            }
            while (j4 < j2) {
                byte[] bArr = segment.a;
                int iMin = (int) Math.min(segment.c, (((long) segment.b) + j2) - j4);
                for (int i = (int) ((((long) segment.b) + j) - j4); i < iMin; i++) {
                    if (bArr[i] == b) {
                        return ((long) (i - segment.b)) + j4;
                    }
                }
                j4 += (long) (segment.c - segment.b);
                segment = segment.f;
                segment.getClass();
                j = j4;
            }
            return -1L;
        }
        while (true) {
            long j5 = ((long) (segment.c - segment.b)) + j3;
            if (j5 > j) {
                break;
            }
            segment = segment.f;
            segment.getClass();
            j3 = j5;
        }
        while (j3 < j2) {
            byte[] bArr2 = segment.a;
            int iMin2 = (int) Math.min(segment.c, (((long) segment.b) + j2) - j3);
            for (int i2 = (int) ((((long) segment.b) + j) - j3); i2 < iMin2; i2++) {
                if (bArr2[i2] == b) {
                    return ((long) (i2 - segment.b)) + j3;
                }
            }
            j3 += (long) (segment.c - segment.b);
            segment = segment.f;
            segment.getClass();
            j = j3;
        }
        return -1L;
    }

    @Override // okio.BufferedSource
    public final boolean j0(long j) {
        return this.F >= j;
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    /* JADX INFO: renamed from: k */
    public final Buffer getF() {
        return this;
    }

    @Override // okio.Source
    public final Timeout l() {
        return Timeout.e;
    }

    public final long n(long j, ByteString byteString) {
        byteString.getClass();
        long j2 = 0;
        if (j < 0) {
            mr9.q(vb7.m(j, "fromIndex < 0: "));
            return 0L;
        }
        Segment segment = this.E;
        if (segment == null) {
            return -1L;
        }
        long j3 = this.F;
        if (j3 - j < j) {
            while (j3 > j) {
                segment = segment.g;
                segment.getClass();
                j3 -= (long) (segment.c - segment.b);
            }
            if (byteString.e() == 2) {
                byte bJ = byteString.j(0);
                byte bJ2 = byteString.j(1);
                while (j3 < this.F) {
                    byte[] bArr = segment.a;
                    int i = segment.c;
                    for (int i2 = (int) ((((long) segment.b) + j) - j3); i2 < i; i2++) {
                        byte b = bArr[i2];
                        if (b == bJ || b == bJ2) {
                            return ((long) (i2 - segment.b)) + j3;
                        }
                    }
                    j3 += (long) (segment.c - segment.b);
                    segment = segment.f;
                    segment.getClass();
                    j = j3;
                }
            } else {
                byte[] bArrI = byteString.getE();
                while (j3 < this.F) {
                    byte[] bArr2 = segment.a;
                    int i3 = segment.c;
                    for (int i4 = (int) ((((long) segment.b) + j) - j3); i4 < i3; i4++) {
                        byte b2 = bArr2[i4];
                        for (byte b3 : bArrI) {
                            if (b2 == b3) {
                                return ((long) (i4 - segment.b)) + j3;
                            }
                        }
                    }
                    j3 += (long) (segment.c - segment.b);
                    segment = segment.f;
                    segment.getClass();
                    j = j3;
                }
            }
            return -1L;
        }
        while (true) {
            long j4 = ((long) (segment.c - segment.b)) + j2;
            if (j4 > j) {
                break;
            }
            segment = segment.f;
            segment.getClass();
            j2 = j4;
        }
        if (byteString.e() == 2) {
            byte bJ3 = byteString.j(0);
            byte bJ4 = byteString.j(1);
            while (j2 < this.F) {
                byte[] bArr3 = segment.a;
                int i5 = segment.c;
                for (int i6 = (int) ((((long) segment.b) + j) - j2); i6 < i5; i6++) {
                    byte b4 = bArr3[i6];
                    if (b4 == bJ3 || b4 == bJ4) {
                        return ((long) (i6 - segment.b)) + j2;
                    }
                }
                j2 += (long) (segment.c - segment.b);
                segment = segment.f;
                segment.getClass();
                j = j2;
            }
        } else {
            byte[] bArrI2 = byteString.getE();
            while (j2 < this.F) {
                byte[] bArr4 = segment.a;
                int i7 = segment.c;
                for (int i8 = (int) ((((long) segment.b) + j) - j2); i8 < i7; i8++) {
                    byte b5 = bArr4[i8];
                    for (byte b6 : bArrI2) {
                        if (b5 == b6) {
                            return ((long) (i8 - segment.b)) + j2;
                        }
                    }
                }
                j2 += (long) (segment.c - segment.b);
                segment = segment.f;
                segment.getClass();
                j = j2;
            }
        }
        return -1L;
    }

    @Override // okio.BufferedSource
    public final String p0() {
        return O(Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public final RealBufferedSource peek() {
        return new RealBufferedSource(new PeekSource(this));
    }

    @Override // okio.BufferedSource
    public final int q0() {
        return SegmentedByteString.c(readInt());
    }

    public final void r0(ByteString byteString) {
        byteString.getClass();
        byteString.u(this, byteString.e());
    }

    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        SegmentedByteString.b(bArr.length, i, i2);
        Segment segment = this.E;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(i2, segment.c - segment.b);
        byte[] bArr2 = segment.a;
        int i3 = segment.b;
        mp0.q0(i, i3, i3 + iMin, bArr2, bArr);
        int i4 = segment.b + iMin;
        segment.b = i4;
        this.F -= (long) iMin;
        if (i4 == segment.c) {
            this.E = segment.a();
            SegmentPool.a(segment);
        }
        return iMin;
    }

    @Override // okio.BufferedSource
    public final byte readByte() {
        if (this.F == 0) {
            sz6.n();
            return (byte) 0;
        }
        Segment segment = this.E;
        segment.getClass();
        int i = segment.b;
        int i2 = segment.c;
        int i3 = i + 1;
        byte b = segment.a[i];
        this.F--;
        if (i3 != i2) {
            segment.b = i3;
            return b;
        }
        this.E = segment.a();
        SegmentPool.a(segment);
        return b;
    }

    @Override // okio.BufferedSource
    public final void readFully(byte[] bArr) throws EOFException {
        bArr.getClass();
        int i = 0;
        while (i < bArr.length) {
            int i2 = read(bArr, i, bArr.length - i);
            if (i2 == -1) {
                sz6.n();
                return;
            }
            i += i2;
        }
    }

    @Override // okio.BufferedSource
    public final int readInt() throws EOFException {
        if (this.F < 4) {
            sz6.n();
            return 0;
        }
        Segment segment = this.E;
        segment.getClass();
        int i = segment.b;
        int i2 = segment.c;
        if (i2 - i < 4) {
            return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
        }
        byte[] bArr = segment.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.F -= 4;
        if (i5 != i2) {
            segment.b = i5;
            return i6;
        }
        this.E = segment.a();
        SegmentPool.a(segment);
        return i6;
    }

    @Override // okio.BufferedSource
    public final long readLong() throws EOFException {
        if (this.F < 8) {
            sz6.n();
            return 0L;
        }
        Segment segment = this.E;
        segment.getClass();
        int i = segment.b;
        int i2 = segment.c;
        if (i2 - i < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = segment.a;
        int i3 = i + 7;
        long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
        int i4 = i + 8;
        long j2 = j | (((long) bArr[i3]) & 255);
        this.F -= 8;
        if (i4 != i2) {
            segment.b = i4;
            return j2;
        }
        this.E = segment.a();
        SegmentPool.a(segment);
        return j2;
    }

    @Override // okio.BufferedSource
    public final short readShort() throws EOFException {
        if (this.F < 2) {
            sz6.n();
            return (short) 0;
        }
        Segment segment = this.E;
        segment.getClass();
        int i = segment.b;
        int i2 = segment.c;
        if (i2 - i < 2) {
            return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
        }
        byte[] bArr = segment.a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.F -= 2;
        if (i5 == i2) {
            this.E = segment.a();
            SegmentPool.a(segment);
        } else {
            segment.b = i5;
        }
        return (short) i6;
    }

    @Override // okio.BufferedSource
    public final String s(long j) {
        return S(j, dj2.a);
    }

    @Override // okio.BufferedSource
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            Segment segment = this.E;
            if (segment == null) {
                sz6.n();
                return;
            }
            int iMin = (int) Math.min(j, segment.c - segment.b);
            long j2 = iMin;
            this.F -= j2;
            j -= j2;
            int i = segment.b + iMin;
            segment.b = i;
            if (i == segment.c) {
                this.E = segment.a();
                SegmentPool.a(segment);
            }
        }
    }

    @Override // okio.BufferedSource
    public final ByteString t(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            mr9.q(vb7.m(j, "byteCount: "));
            return null;
        }
        if (this.F < j) {
            sz6.n();
            return null;
        }
        if (j < 4096) {
            return new ByteString(K(j));
        }
        ByteString byteStringT = T((int) j);
        skip(j);
        return byteStringT;
    }

    @Override // okio.BufferedSource
    public final String t0() {
        return S(this.F, dj2.a);
    }

    public final String toString() {
        long j = this.F;
        if (j <= 2147483647L) {
            return T((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.F).toString());
    }

    @Override // okio.BufferedSource
    public final long u0(long j, ByteString byteString) {
        byteString.getClass();
        byte[] bArr = d.a;
        return d.a(this, byteString, 0L, j, byteString.e());
    }

    /* JADX INFO: renamed from: write, reason: collision with other method in class */
    public final void m1202write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        long j = i2;
        SegmentedByteString.b(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            Segment segmentB0 = b0(1);
            int iMin = Math.min(i3 - i, 8192 - segmentB0.c);
            int i4 = i + iMin;
            mp0.q0(segmentB0.c, i, i4, bArr, segmentB0.a);
            segmentB0.c += iMin;
            i = i4;
        }
        this.F += j;
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeByte(int i) {
        B0(i);
        return this;
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeInt(int i) {
        P0(i);
        return this;
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeShort(int i) {
        R0(i);
        return this;
    }

    public final boolean x(int i, long j, ByteString byteString) {
        byteString.getClass();
        if (i >= 0 && j >= 0 && ((long) i) + j <= this.F && i <= byteString.e()) {
            return i == 0 || d.a(this, byteString, j, j + 1, i) != -1;
        }
        return false;
    }

    public final void x0(Source source, long j) {
        source.getClass();
        while (j > 0) {
            long jA0 = source.A0(this, j);
            if (jA0 == -1) {
                sz6.n();
                return;
            }
            j -= jA0;
        }
    }

    @Override // okio.BufferedSink
    public final BufferedSink y(long j) {
        Q0(SegmentedByteString.d(j));
        return this;
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink z0(ByteString byteString) {
        r0(byteString);
        return this;
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink write(byte[] bArr, int i, int i2) {
        m1202write(bArr, i, i2);
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            Segment segmentB0 = b0(1);
            int iMin = Math.min(i, 8192 - segmentB0.c);
            byteBuffer.get(segmentB0.a, segmentB0.c, iMin);
            i -= iMin;
            segmentB0.c += iMin;
        }
        this.F += (long) iRemaining;
        return iRemaining;
    }

    @Override // okio.BufferedSink
    public final BufferedSink write(byte[] bArr) {
        bArr.getClass();
        m1202write(bArr, 0, bArr.length);
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        Segment segment = this.E;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), segment.c - segment.b);
        byteBuffer.put(segment.a, segment.b, iMin);
        int i = segment.b + iMin;
        segment.b = i;
        this.F -= (long) iMin;
        if (i == segment.c) {
            this.E = segment.a();
            SegmentPool.a(segment);
        }
        return iMin;
    }
}
