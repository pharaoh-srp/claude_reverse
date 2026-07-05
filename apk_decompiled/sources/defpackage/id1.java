package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class id1 {
    public static final gd1 e = new gd1(false, false, -1);
    public static final byte[] f = {13, 10};
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;

    static {
        new id1(true, false, -1);
        new id1(false, true, 76);
        new id1(false, true, 64);
    }

    public id1(boolean z, boolean z2, int i) {
        this.a = z;
        this.b = z2;
        this.c = i;
        if (z && z2) {
            sz6.p("Failed requirement.");
            throw null;
        }
        this.d = i / 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] a(defpackage.id1 r19, java.lang.CharSequence r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.id1.a(id1, java.lang.CharSequence, int, int):byte[]");
    }

    public static String b(id1 id1Var, byte[] bArr) {
        int i;
        int length = bArr.length;
        id1Var.getClass();
        int length2 = bArr.length;
        e2 e2Var = i2.Companion;
        e2Var.getClass();
        e2.a(0, length, length2);
        int iC = id1Var.c(length);
        byte[] bArr2 = new byte[iC];
        int length3 = bArr.length;
        e2Var.getClass();
        e2.a(0, length, length3);
        int iC2 = id1Var.c(length);
        if (iC < 0) {
            xh6.j(grc.p(iC, "destination offset: 0, destination size: "));
            return null;
        }
        if (iC2 < 0 || iC2 > iC) {
            xh6.j(grc.o(iC, iC2, "The destination array does not have enough capacity, destination offset: 0, destination size: ", ", capacity needed: "));
            return null;
        }
        byte[] bArr3 = id1Var.a ? ld1.c : ld1.a;
        int i2 = id1Var.b ? id1Var.d : Integer.MAX_VALUE;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = i3 + 2;
            if (i >= length) {
                break;
            }
            int iMin = Math.min((length - i3) / 3, i2);
            for (int i5 = 0; i5 < iMin; i5++) {
                int i6 = bArr[i3] & 255;
                int i7 = i3 + 2;
                int i8 = bArr[i3 + 1] & 255;
                i3 += 3;
                int i9 = (i8 << 8) | (i6 << 16) | (bArr[i7] & 255);
                bArr2[i4] = bArr3[i9 >>> 18];
                bArr2[i4 + 1] = bArr3[(i9 >>> 12) & 63];
                int i10 = i4 + 3;
                bArr2[i4 + 2] = bArr3[(i9 >>> 6) & 63];
                i4 += 4;
                bArr2[i10] = bArr3[i9 & 63];
            }
            if (iMin == i2 && i3 != length) {
                int i11 = i4 + 1;
                byte[] bArr4 = f;
                bArr2[i4] = bArr4[0];
                i4 += 2;
                bArr2[i11] = bArr4[1];
            }
        }
        int i12 = length - i3;
        if (i12 == 1) {
            int i13 = (bArr[i3] & 255) << 4;
            bArr2[i4] = bArr3[i13 >>> 6];
            bArr2[i4 + 1] = bArr3[i13 & 63];
            bArr2[i4 + 2] = 61;
            bArr2[i4 + 3] = 61;
            i3++;
        } else if (i12 == 2) {
            int i14 = ((bArr[i3 + 1] & 255) << 2) | ((bArr[i3] & 255) << 10);
            bArr2[i4] = bArr3[i14 >>> 12];
            bArr2[i4 + 1] = bArr3[(i14 >>> 6) & 63];
            bArr2[i4 + 2] = bArr3[i14 & 63];
            bArr2[i4 + 3] = 61;
            i3 = i;
        }
        if (i3 == length) {
            return new String(bArr2, dj2.d);
        }
        sz6.j("Check failed.");
        return null;
    }

    public final int c(int i) {
        int iD = (i / 3) * 4;
        if (i % 3 != 0) {
            iD += 4;
        }
        if (iD < 0) {
            sz6.p("Input is too big");
            return 0;
        }
        if (this.b) {
            iD = vb7.d(iD - 1, this.c, 2, iD);
        }
        if (iD >= 0) {
            return iD;
        }
        sz6.p("Input is too big");
        return 0;
    }
}
