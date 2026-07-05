package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class iv8 extends yuj {
    public static final rl7 i = new rl7(10);
    public final rl7 h;

    public iv8(rl7 rl7Var) {
        this.h = rl7Var;
    }

    public static int A(int i2) {
        return (i2 == 0 || i2 == 3) ? 1 : 2;
    }

    public static Charset B(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    public static String C(int i2, int i3, int i4, int i5, int i6) {
        return i2 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
    }

    public static int D(byte[] bArr, int i2, int i3) {
        int iE = E(bArr, i2);
        if (i3 == 0 || i3 == 3) {
            return iE;
        }
        while (iE < bArr.length - 1) {
            if ((iE - i2) % 2 == 0 && bArr[iE + 1] == 0) {
                return iE;
            }
            iE = E(bArr, iE + 1);
        }
        return bArr.length;
    }

    public static int E(byte[] bArr, int i2) {
        while (i2 < bArr.length) {
            if (bArr[i2] == 0) {
                return i2;
            }
            i2++;
        }
        return bArr.length;
    }

    public static int F(int i2, ssc sscVar) {
        byte[] bArr = sscVar.a;
        int i3 = sscVar.b;
        int i4 = i3;
        while (true) {
            int i5 = i4 + 1;
            if (i5 >= i3 + i2) {
                return i2;
            }
            if ((bArr[i4] & 255) == 255 && bArr[i5] == 0) {
                System.arraycopy(bArr, i4 + 2, bArr, i5, (i2 - (i4 - i3)) - 2);
                i2--;
            }
            i4 = i5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007a A[PHI: r3
      0x007a: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0087, B:33:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean G(defpackage.ssc r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.b
        L6:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lac
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L23
            int r7 = r1.m()     // Catch: java.lang.Throwable -> L20
            long r8 = r1.B()     // Catch: java.lang.Throwable -> L20
            int r10 = r1.G()     // Catch: java.lang.Throwable -> L20
            goto L2d
        L20:
            r0 = move-exception
            goto Lb0
        L23:
            int r7 = r1.C()     // Catch: java.lang.Throwable -> L20
            int r8 = r1.C()     // Catch: java.lang.Throwable -> L20
            long r8 = (long) r8
            r10 = r6
        L2d:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 != 0) goto L3b
            r1.M(r2)
            return r4
        L3b:
            r7 = 4
            if (r0 != r7) goto L6c
            if (r21 != 0) goto L6c
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4c
            r1.M(r2)
            return r6
        L4c:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6c:
            if (r0 != r7) goto L7c
            r3 = r10 & 64
            if (r3 == 0) goto L74
            r3 = r4
            goto L75
        L74:
            r3 = r6
        L75:
            r7 = r10 & 1
            if (r7 == 0) goto L7a
            goto L8c
        L7a:
            r4 = r6
            goto L8c
        L7c:
            if (r0 != r3) goto L8a
            r3 = r10 & 32
            if (r3 == 0) goto L84
            r3 = r4
            goto L85
        L84:
            r3 = r6
        L85:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L7a
            goto L8c
        L8a:
            r3 = r6
            r4 = r3
        L8c:
            if (r4 == 0) goto L90
            int r3 = r3 + 4
        L90:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L99
            r1.M(r2)
            return r6
        L99:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L20
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La6
            r1.M(r2)
            return r6
        La6:
            int r3 = (int) r8
            r1.N(r3)     // Catch: java.lang.Throwable -> L20
            goto L6
        Lac:
            r1.M(r2)
            return r4
        Lb0:
            r1.M(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iv8.G(ssc, int, int, boolean):boolean");
    }

    public static vf0 m(ssc sscVar, int i2, int i3) {
        int iE;
        String strConcat;
        int iZ = sscVar.z();
        Charset charsetB = B(iZ);
        int i4 = i2 - 1;
        byte[] bArr = new byte[i4];
        sscVar.k(bArr, 0, i4);
        if (i3 == 2) {
            strConcat = "image/" + auk.m(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iE = 2;
        } else {
            iE = E(bArr, 0);
            String strM = auk.m(new String(bArr, 0, iE, StandardCharsets.ISO_8859_1));
            strConcat = strM.indexOf(47) == -1 ? "image/".concat(strM) : strM;
        }
        int i5 = bArr[iE + 1] & 255;
        int i6 = iE + 2;
        int iD = D(bArr, i6, iZ);
        String str = new String(bArr, i6, iD - i6, charsetB);
        int iA = A(iZ) + iD;
        return new vf0(i5, strConcat, str, i4 <= iA ? tpi.b : Arrays.copyOfRange(bArr, iA, i4));
    }

    public static ci2 n(ssc sscVar, int i2, int i3, boolean z, int i4, rl7 rl7Var) throws Throwable {
        int i5 = sscVar.b;
        int iE = E(sscVar.a, i5);
        String str = new String(sscVar.a, i5, iE - i5, StandardCharsets.ISO_8859_1);
        sscVar.M(iE + 1);
        int iM = sscVar.m();
        int iM2 = sscVar.m();
        long jB = sscVar.B();
        if (jB == 4294967295L) {
            jB = -1;
        }
        long jB2 = sscVar.B();
        long j = jB2 == 4294967295L ? -1L : jB2;
        ArrayList arrayList = new ArrayList();
        int i6 = i5 + i2;
        while (sscVar.b < i6) {
            jv8 jv8VarQ = q(i3, sscVar, z, i4, rl7Var);
            if (jv8VarQ != null) {
                arrayList.add(jv8VarQ);
            }
        }
        return new ci2(str, iM, iM2, jB, j, (jv8[]) arrayList.toArray(new jv8[0]));
    }

    public static di2 o(ssc sscVar, int i2, int i3, boolean z, int i4, rl7 rl7Var) throws Throwable {
        int i5 = sscVar.b;
        int iE = E(sscVar.a, i5);
        String str = new String(sscVar.a, i5, iE - i5, StandardCharsets.ISO_8859_1);
        sscVar.M(iE + 1);
        int iZ = sscVar.z();
        boolean z2 = (iZ & 2) != 0;
        boolean z3 = (iZ & 1) != 0;
        int iZ2 = sscVar.z();
        String[] strArr = new String[iZ2];
        for (int i6 = 0; i6 < iZ2; i6++) {
            int i7 = sscVar.b;
            int iE2 = E(sscVar.a, i7);
            strArr[i6] = new String(sscVar.a, i7, iE2 - i7, StandardCharsets.ISO_8859_1);
            sscVar.M(iE2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i8 = i5 + i2;
        while (sscVar.b < i8) {
            jv8 jv8VarQ = q(i3, sscVar, z, i4, rl7Var);
            if (jv8VarQ != null) {
                arrayList.add(jv8VarQ);
            }
        }
        return new di2(str, z2, z3, strArr, (jv8[]) arrayList.toArray(new jv8[0]));
    }

    public static m74 p(int i2, ssc sscVar) {
        if (i2 < 4) {
            return null;
        }
        int iZ = sscVar.z();
        Charset charsetB = B(iZ);
        byte[] bArr = new byte[3];
        sscVar.k(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i3 = i2 - 4;
        byte[] bArr2 = new byte[i3];
        sscVar.k(bArr2, 0, i3);
        int iD = D(bArr2, 0, iZ);
        String str2 = new String(bArr2, 0, iD, charsetB);
        int iA = A(iZ) + iD;
        return new m74(str, str2, u(bArr2, iA, D(bArr2, iA, iZ), charsetB));
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x014d A[Catch: all -> 0x0142, Exception -> 0x0145, OutOfMemoryError -> 0x0149, TryCatch #0 {all -> 0x0142, blocks: (B:107:0x013b, B:116:0x014d, B:123:0x0162, B:125:0x0169, B:133:0x0182, B:142:0x0197, B:153:0x01af, B:160:0x01c0, B:182:0x0200, B:193:0x0219, B:194:0x021e), top: B:205:0x012d }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x021e A[Catch: all -> 0x0142, Exception -> 0x0205, OutOfMemoryError -> 0x0207, TRY_LEAVE, TryCatch #0 {all -> 0x0142, blocks: (B:107:0x013b, B:116:0x014d, B:123:0x0162, B:125:0x0169, B:133:0x0182, B:142:0x0197, B:153:0x01af, B:160:0x01c0, B:182:0x0200, B:193:0x0219, B:194:0x021e), top: B:205:0x012d }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0240  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.jv8 q(int r22, defpackage.ssc r23, boolean r24, int r25, defpackage.rl7 r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iv8.q(int, ssc, boolean, int, rl7):jv8");
    }

    public static c38 r(int i2, ssc sscVar) {
        int iZ = sscVar.z();
        Charset charsetB = B(iZ);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        sscVar.k(bArr, 0, i3);
        int iE = E(bArr, 0);
        String strK = gkb.k(new String(bArr, 0, iE, StandardCharsets.ISO_8859_1));
        int i4 = iE + 1;
        int iD = D(bArr, i4, iZ);
        String strU = u(bArr, i4, iD, charsetB);
        int iA = A(iZ) + iD;
        int iD2 = D(bArr, iA, iZ);
        String strU2 = u(bArr, iA, iD2, charsetB);
        int iA2 = A(iZ) + iD2;
        return new c38(strK, strU, strU2, i3 <= iA2 ? tpi.b : Arrays.copyOfRange(bArr, iA2, i3));
    }

    public static ykb s(int i2, ssc sscVar) {
        int iG = sscVar.G();
        int iC = sscVar.C();
        int iC2 = sscVar.C();
        int iZ = sscVar.z();
        int iZ2 = sscVar.z();
        dg2 dg2Var = new dg2();
        dg2Var.k(sscVar);
        int i3 = ((i2 - 10) * 8) / (iZ + iZ2);
        int[] iArr = new int[i3];
        int[] iArr2 = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int iG2 = dg2Var.g(iZ);
            int iG3 = dg2Var.g(iZ2);
            iArr[i4] = iG2;
            iArr2[i4] = iG3;
        }
        return new ykb(iG, iC, iC2, iArr, iArr2);
    }

    public static egd t(int i2, ssc sscVar) {
        byte[] bArr = new byte[i2];
        sscVar.k(bArr, 0, i2);
        int iE = E(bArr, 0);
        String str = new String(bArr, 0, iE, StandardCharsets.ISO_8859_1);
        int i3 = iE + 1;
        return new egd(str, i2 <= i3 ? tpi.b : Arrays.copyOfRange(bArr, i3, i2));
    }

    public static String u(byte[] bArr, int i2, int i3, Charset charset) {
        return (i3 <= i2 || i3 > bArr.length) ? "" : new String(bArr, i2, i3 - i2, charset);
    }

    public static ijh v(int i2, ssc sscVar, String str) {
        if (i2 < 1) {
            return null;
        }
        int iZ = sscVar.z();
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        sscVar.k(bArr, 0, i3);
        return new ijh(str, null, w(bArr, iZ, 0));
    }

    public static vde w(byte[] bArr, int i2, int i3) {
        if (i3 >= bArr.length) {
            return nz8.u("");
        }
        hz8 hz8VarO = nz8.o();
        int iD = D(bArr, i3, i2);
        while (i3 < iD) {
            hz8VarO.b(new String(bArr, i3, iD - i3, B(i2)));
            i3 = A(i2) + iD;
            iD = D(bArr, i3, i2);
        }
        vde vdeVarG = hz8VarO.g();
        return vdeVarG.isEmpty() ? nz8.u("") : vdeVarG;
    }

    public static ijh x(int i2, ssc sscVar) {
        if (i2 < 1) {
            return null;
        }
        int iZ = sscVar.z();
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        sscVar.k(bArr, 0, i3);
        int iD = D(bArr, 0, iZ);
        return new ijh("TXXX", new String(bArr, 0, iD, B(iZ)), w(bArr, iZ, A(iZ) + iD));
    }

    public static ili y(int i2, ssc sscVar, String str) {
        byte[] bArr = new byte[i2];
        sscVar.k(bArr, 0, i2);
        return new ili(str, null, new String(bArr, 0, E(bArr, 0), StandardCharsets.ISO_8859_1));
    }

    public static ili z(int i2, ssc sscVar) {
        if (i2 < 1) {
            return null;
        }
        int iZ = sscVar.z();
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        sscVar.k(bArr, 0, i3);
        int iD = D(bArr, 0, iZ);
        String str = new String(bArr, 0, iD, B(iZ));
        int iA = A(iZ) + iD;
        return new ili("WXXX", str, u(bArr, iA, E(bArr, iA), StandardCharsets.ISO_8859_1));
    }

    @Override // defpackage.yuj
    public final gjb d(mjb mjbVar, ByteBuffer byteBuffer) {
        return l(byteBuffer.array(), byteBuffer.limit());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.gjb l(byte[] r13, int r14) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iv8.l(byte[], int):gjb");
    }
}
