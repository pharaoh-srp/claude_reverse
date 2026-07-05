package okio;

import defpackage.gjk;
import defpackage.grc;
import defpackage.mdj;
import defpackage.mp0;
import defpackage.mr9;
import defpackage.vb7;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;

/* JADX INFO: renamed from: okio.SegmentedByteString, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/SegmentedByteString;", "Lokio/ByteString;", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class C0024SegmentedByteString extends ByteString {
    public final transient byte[][] I;
    public final transient int[] J;

    public C0024SegmentedByteString(byte[][] bArr, int[] iArr) {
        super(ByteString.H.E);
        this.I = bArr;
        this.J = iArr;
    }

    @Override // okio.ByteString
    public final String a() {
        return Base64.b(v().E);
    }

    @Override // okio.ByteString
    public final void c(int i, int i2, int i3, byte[] bArr) {
        bArr.getClass();
        long j = i3;
        SegmentedByteString.b(e(), i, j);
        SegmentedByteString.b(bArr.length, i2, j);
        int i4 = i3 + i;
        int iK = gjk.k(this, i);
        while (i < i4) {
            int[] iArr = this.J;
            int i5 = iK == 0 ? 0 : iArr[iK - 1];
            int i6 = iArr[iK] - i5;
            byte[][] bArr2 = this.I;
            int i7 = iArr[bArr2.length + iK];
            int iMin = Math.min(i4, i6 + i5) - i;
            int i8 = (i - i5) + i7;
            mp0.q0(i2, i8, i8 + iMin, bArr2[iK], bArr);
            i2 += iMin;
            i += iMin;
            iK++;
        }
    }

    @Override // okio.ByteString
    public final ByteString d(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.I;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.J;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return new ByteString(bArrDigest);
    }

    @Override // okio.ByteString
    public final int e() {
        return this.J[this.I.length - 1];
    }

    @Override // okio.ByteString
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.e() == e() && n(byteString, 0, e())) {
                return true;
            }
        }
        return false;
    }

    @Override // okio.ByteString
    public final String f() {
        return v().f();
    }

    @Override // okio.ByteString
    public final int g(byte[] bArr, int i) {
        bArr.getClass();
        return v().g(bArr, i);
    }

    @Override // okio.ByteString
    public final int hashCode() {
        int i = this.F;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.I;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.J;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.F = i3;
        return i3;
    }

    @Override // okio.ByteString
    /* JADX INFO: renamed from: i */
    public final byte[] getE() {
        return s();
    }

    @Override // okio.ByteString
    public final byte j(int i) {
        byte[][] bArr = this.I;
        int length = bArr.length - 1;
        int[] iArr = this.J;
        SegmentedByteString.b(iArr[length], i, 1L);
        int iK = gjk.k(this, i);
        return bArr[iK][(i - (iK == 0 ? 0 : iArr[iK - 1])) + iArr[bArr.length + iK]];
    }

    @Override // okio.ByteString
    public final int k(byte[] bArr, int i) {
        bArr.getClass();
        return v().k(bArr, i);
    }

    @Override // okio.ByteString
    public final boolean m(int i, int i2, int i3, byte[] bArr) {
        bArr.getClass();
        if (i < 0 || i > e() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iK = gjk.k(this, i);
        while (i < i4) {
            int[] iArr = this.J;
            int i5 = iK == 0 ? 0 : iArr[iK - 1];
            int i6 = iArr[iK] - i5;
            byte[][] bArr2 = this.I;
            int i7 = iArr[bArr2.length + iK];
            int iMin = Math.min(i4, i6 + i5) - i;
            if (!SegmentedByteString.a((i - i5) + i7, i2, iMin, bArr2[iK], bArr)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iK++;
        }
        return true;
    }

    @Override // okio.ByteString
    public final boolean n(ByteString byteString, int i, int i2) {
        byteString.getClass();
        if (i >= 0 && i <= e() - i2) {
            int i3 = i2 + i;
            int iK = gjk.k(this, i);
            int i4 = 0;
            while (i < i3) {
                int[] iArr = this.J;
                int i5 = iK == 0 ? 0 : iArr[iK - 1];
                int i6 = iArr[iK] - i5;
                byte[][] bArr = this.I;
                int i7 = iArr[bArr.length + iK];
                int iMin = Math.min(i3, i6 + i5) - i;
                if (byteString.m(i4, (i - i5) + i7, iMin, bArr[iK])) {
                    i4 += iMin;
                    i += iMin;
                    iK++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // okio.ByteString
    public final String o(Charset charset) {
        charset.getClass();
        return v().o(charset);
    }

    @Override // okio.ByteString
    public final ByteString p(int i, int i2) {
        if (i < 0) {
            mr9.q(grc.u("beginIndex=", i, " < 0"));
            return null;
        }
        if (i2 > e()) {
            StringBuilder sbU = vb7.u("endIndex=", i2, " > length(");
            sbU.append(e());
            sbU.append(')');
            throw new IllegalArgumentException(sbU.toString().toString());
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            mr9.q(grc.o(i2, i, "endIndex=", " < beginIndex="));
            return null;
        }
        if (i == 0 && i2 == e()) {
            return this;
        }
        if (i == i2) {
            return ByteString.H;
        }
        int iK = gjk.k(this, i);
        int iK2 = gjk.k(this, i2 - 1);
        byte[][] bArr = this.I;
        byte[][] bArr2 = (byte[][]) mp0.y0(bArr, iK, iK2 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.J;
        if (iK <= iK2) {
            int i4 = iK;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(iArr2[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr2.length] = iArr2[bArr.length + i4];
                if (i4 == iK2) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = iK != 0 ? iArr2[iK - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i7) + iArr[length];
        return new C0024SegmentedByteString(bArr2, iArr);
    }

    @Override // okio.ByteString
    public final ByteString r() {
        return v().r();
    }

    @Override // okio.ByteString
    public final byte[] s() {
        byte[] bArr = new byte[e()];
        byte[][] bArr2 = this.I;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.J;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            mp0.q0(i3, i4, i4 + i6, bArr2[i], bArr);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // okio.ByteString
    public final String toString() {
        return v().toString();
    }

    @Override // okio.ByteString
    public final void u(Buffer buffer, int i) {
        int iK = gjk.k(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.J;
            int i3 = iK == 0 ? 0 : iArr[iK - 1];
            int i4 = iArr[iK] - i3;
            byte[][] bArr = this.I;
            int i5 = iArr[bArr.length + iK];
            int iMin = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            Segment segment = new Segment(bArr[iK], i6, i6 + iMin, true, false);
            Segment segment2 = buffer.E;
            if (segment2 == null) {
                segment.g = segment;
                segment.f = segment;
                buffer.E = segment;
            } else {
                Segment segment3 = segment2.g;
                segment3.getClass();
                segment3.b(segment);
            }
            i2 += iMin;
            iK++;
        }
        buffer.F += (long) i;
    }

    public final ByteString v() {
        return new ByteString(s());
    }
}
