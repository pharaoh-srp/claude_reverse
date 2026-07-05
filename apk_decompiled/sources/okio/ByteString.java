package okio;

import defpackage.dj2;
import defpackage.grc;
import defpackage.isg;
import defpackage.j8;
import defpackage.mdj;
import defpackage.mp0;
import defpackage.mr9;
import defpackage.sz6;
import defpackage.vb7;
import defpackage.zh4;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lokio/ByteString;", "Ljava/io/Serializable;", "", "Companion", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public class ByteString implements Serializable, Comparable<ByteString> {
    public static final ByteString H = new ByteString(new byte[0]);
    public final byte[] E;
    public transient int F;
    public transient String G;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lokio/ByteString$Companion;", "", "", "serialVersionUID", "J", "Lokio/ByteString;", "EMPTY", "Lokio/ByteString;", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
    public static final class Companion {
        public static ByteString a(String str) {
            if (str.length() % 2 != 0) {
                mr9.q("Unexpected hex string: ".concat(str));
                return null;
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) (zh4.i(str.charAt(i2 + 1)) + (zh4.i(str.charAt(i2)) << 4));
            }
            return new ByteString(bArr);
        }

        public static ByteString b(String str) {
            str.getClass();
            byte[] bytes = str.getBytes(dj2.a);
            bytes.getClass();
            ByteString byteString = new ByteString(bytes);
            byteString.G = str;
            return byteString;
        }

        public static ByteString c(byte[] bArr) {
            int length = bArr.length;
            bArr.getClass();
            SegmentedByteString.b(bArr.length, 0L, length);
            return new ByteString(mp0.x0(bArr, 0, length));
        }
    }

    public ByteString(byte[] bArr) {
        bArr.getClass();
        this.E = bArr;
    }

    public static int h(ByteString byteString, ByteString byteString2) {
        byteString.getClass();
        byteString2.getClass();
        return byteString.g(byteString2.getE(), 0);
    }

    public static int l(ByteString byteString, ByteString byteString2) {
        int iE = byteString.e();
        byteString.getClass();
        byteString2.getClass();
        return byteString.k(byteString2.getE(), iE);
    }

    public static ByteString q(ByteString byteString, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = byteString.e();
        }
        return byteString.p(i, i2);
    }

    public String a() {
        return Base64.b(this.E);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ByteString byteString) {
        byteString.getClass();
        int iE = e();
        int iE2 = byteString.e();
        int iMin = Math.min(iE, iE2);
        for (int i = 0; i < iMin; i++) {
            int iJ = j(i) & 255;
            int iJ2 = byteString.j(i) & 255;
            if (iJ != iJ2) {
                return iJ < iJ2 ? -1 : 1;
            }
        }
        if (iE == iE2) {
            return 0;
        }
        return iE < iE2 ? -1 : 1;
    }

    public void c(int i, int i2, int i3, byte[] bArr) {
        bArr.getClass();
        mp0.q0(i2, i, i3 + i, this.E, bArr);
    }

    public ByteString d(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.E, 0, e());
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return new ByteString(bArrDigest);
    }

    public int e() {
        return this.E.length;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            int iE = byteString.e();
            byte[] bArr = this.E;
            if (iE == bArr.length && byteString.m(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        byte[] bArr = this.E;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = j8.a;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public int g(byte[] bArr, int i) {
        bArr.getClass();
        byte[] bArr2 = this.E;
        int length = bArr2.length - bArr.length;
        int iMax = Math.max(i, 0);
        if (iMax > length) {
            return -1;
        }
        while (!SegmentedByteString.a(iMax, 0, bArr.length, bArr2, bArr)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public int hashCode() {
        int i = this.F;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.E);
        this.F = iHashCode;
        return iHashCode;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public byte[] getE() {
        return this.E;
    }

    public byte j(int i) {
        return this.E[i];
    }

    public int k(byte[] bArr, int i) {
        bArr.getClass();
        byte[] bArr2 = this.E;
        for (int iMin = Math.min(i, bArr2.length - bArr.length); -1 < iMin; iMin--) {
            if (SegmentedByteString.a(iMin, 0, bArr.length, bArr2, bArr)) {
                return iMin;
            }
        }
        return -1;
    }

    public boolean m(int i, int i2, int i3, byte[] bArr) {
        bArr.getClass();
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.E;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && SegmentedByteString.a(i, i2, i3, bArr2, bArr);
    }

    public boolean n(ByteString byteString, int i, int i2) {
        byteString.getClass();
        return byteString.m(0, i, i2, this.E);
    }

    public String o(Charset charset) {
        charset.getClass();
        return new String(this.E, charset);
    }

    public ByteString p(int i, int i2) {
        if (i < 0) {
            sz6.p("beginIndex < 0");
            return null;
        }
        byte[] bArr = this.E;
        if (i2 > bArr.length) {
            mr9.q(vb7.r(new StringBuilder("endIndex > length("), bArr.length, ')'));
            return null;
        }
        if (i2 - i >= 0) {
            return (i == 0 && i2 == bArr.length) ? this : new ByteString(mp0.x0(bArr, i, i2));
        }
        sz6.p("endIndex < beginIndex");
        return null;
    }

    public ByteString r() {
        int i = 0;
        while (true) {
            byte[] bArr = this.E;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                bArrCopyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b2 = bArrCopyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArrCopyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new ByteString(bArrCopyOf);
            }
            i++;
        }
    }

    public byte[] s() {
        byte[] bArr = this.E;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final String t() {
        String str = this.G;
        if (str != null) {
            return str;
        }
        byte[] e = getE();
        e.getClass();
        String str2 = new String(e, dj2.a);
        this.G = str2;
        return str2;
    }

    public String toString() {
        byte b;
        int i;
        ByteString byteString = this;
        byte[] bArr = byteString.E;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            if (i2 >= length) {
                break;
            }
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                int i5 = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 < 32) || (127 <= b2 && b2 < 160))) || b2 == 65533) {
                    break;
                }
                i3 += b2 < 65536 ? 1 : 2;
                i2++;
                while (true) {
                    i4 = i5;
                    if (i2 < length && (b = bArr[i2]) >= 0) {
                        i2++;
                        i5 = i4 + 1;
                        if (i4 == 64) {
                            break loop0;
                        }
                        if ((b != 10 && b != 13 && ((b >= 0 && b < 32) || (127 <= b && b < 160))) || b == 65533) {
                            break loop0;
                        }
                        i3 += b < 65536 ? 1 : 2;
                    } else {
                        break;
                    }
                }
            } else if ((b2 >> 5) == -2) {
                int i6 = i2 + 1;
                if (length > i6) {
                    byte b3 = bArr[i6];
                    if ((b3 & 192) == 128) {
                        int i7 = (b3 ^ 3968) ^ (b2 << 6);
                        if (i7 >= 128) {
                            i = i4 + 1;
                            if (i4 == 64) {
                                break;
                            }
                            if ((i7 != 10 && i7 != 13 && ((i7 >= 0 && i7 < 32) || (127 <= i7 && i7 < 160))) || i7 == 65533) {
                                break;
                            }
                            i3 += i7 < 65536 ? 1 : 2;
                            i2 += 2;
                            i4 = i;
                        } else if (i4 != 64) {
                            break;
                        }
                    } else if (i4 != 64) {
                        break;
                    }
                } else if (i4 != 64) {
                    break;
                }
            } else if ((b2 >> 4) == -2) {
                int i8 = i2 + 2;
                if (length > i8) {
                    byte b4 = bArr[i2 + 1];
                    if ((b4 & 192) == 128) {
                        byte b5 = bArr[i8];
                        if ((b5 & 192) == 128) {
                            int i9 = ((b5 ^ (-123008)) ^ (b4 << 6)) ^ (b2 << 12);
                            if (i9 < 2048) {
                                if (i4 != 64) {
                                    break;
                                }
                            } else if (55296 > i9 || i9 >= 57344) {
                                i = i4 + 1;
                                if (i4 == 64) {
                                    break;
                                }
                                if ((i9 != 10 && i9 != 13 && ((i9 >= 0 && i9 < 32) || (127 <= i9 && i9 < 160))) || i9 == 65533) {
                                    break;
                                }
                                i3 += i9 < 65536 ? 1 : 2;
                                i2 += 3;
                                i4 = i;
                            } else if (i4 != 64) {
                                break;
                            }
                        } else if (i4 != 64) {
                            break;
                        }
                    } else if (i4 != 64) {
                        break;
                    }
                } else if (i4 != 64) {
                    break;
                }
            } else if ((b2 >> 3) == -2) {
                int i10 = i2 + 3;
                if (length > i10) {
                    byte b6 = bArr[i2 + 1];
                    if ((b6 & 192) == 128) {
                        byte b7 = bArr[i2 + 2];
                        if ((b7 & 192) == 128) {
                            byte b8 = bArr[i10];
                            if ((b8 & 192) == 128) {
                                int i11 = (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12)) ^ (b2 << 18);
                                if (i11 > 1114111) {
                                    if (i4 != 64) {
                                        break;
                                    }
                                } else if (55296 > i11 || i11 >= 57344) {
                                    if (i11 >= 65536) {
                                        i = i4 + 1;
                                        if (i4 == 64) {
                                            break;
                                        }
                                        if ((i11 != 10 && i11 != 13 && ((i11 >= 0 && i11 < 32) || (127 <= i11 && i11 < 160))) || i11 == 65533) {
                                            break;
                                        }
                                        i3 += i11 < 65536 ? 1 : 2;
                                        i2 += 4;
                                        i4 = i;
                                    } else if (i4 != 64) {
                                        break;
                                    }
                                } else if (i4 != 64) {
                                    break;
                                }
                            } else if (i4 != 64) {
                                break;
                            }
                        } else if (i4 != 64) {
                            break;
                        }
                    } else if (i4 != 64) {
                        break;
                    }
                } else if (i4 != 64) {
                    break;
                }
            } else if (i4 != 64) {
                break;
            }
        }
        i3 = -1;
        if (i3 != -1) {
            String strT = byteString.t();
            String strN0 = isg.n0(isg.n0(isg.n0(strT.substring(0, i3), "\\", "\\\\", false), "\n", "\\n", false), "\r", "\\r", false);
            if (i3 >= strT.length()) {
                return grc.n(']', "[text=", strN0);
            }
            return "[size=" + bArr.length + " text=" + strN0 + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + byteString.f() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 > bArr.length) {
            mr9.q(vb7.r(new StringBuilder("endIndex > length("), bArr.length, ')'));
            return null;
        }
        if (64 != bArr.length) {
            byteString = new ByteString(mp0.x0(bArr, 0, 64));
        }
        sb.append(byteString.f());
        sb.append("…]");
        return sb.toString();
    }

    public void u(Buffer buffer, int i) {
        buffer.m1202write(this.E, 0, i);
    }
}
