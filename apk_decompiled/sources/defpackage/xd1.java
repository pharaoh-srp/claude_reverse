package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class xd1 {
    public final String a;
    public final char[] b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;
    public final boolean h;

    /* JADX WARN: Removed duplicated region for block: B:25:0x007c A[LOOP:0: B:23:0x0078->B:25:0x007c, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public xd1(java.lang.String r5, char[] r6, byte[] r7, boolean r8) {
        /*
            r4 = this;
            r4.<init>()
            r4.a = r5
            r6.getClass()
            r4.b = r6
            int r5 = r6.length     // Catch: java.lang.ArithmeticException -> L8e
            java.math.RoundingMode r0 = java.math.RoundingMode.UNNECESSARY     // Catch: java.lang.ArithmeticException -> L8e
            java.math.RoundingMode r0 = java.math.RoundingMode.UNNECESSARY     // Catch: java.lang.ArithmeticException -> L8e
            r1 = 0
            r2 = 1
            if (r5 <= 0) goto L54
            int[] r3 = defpackage.v69.a     // Catch: java.lang.ArithmeticException -> L8e
            int r0 = r0.ordinal()     // Catch: java.lang.ArithmeticException -> L8e
            r0 = r3[r0]     // Catch: java.lang.ArithmeticException -> L8e
            switch(r0) {
                case 1: goto L3c;
                case 2: goto L4d;
                case 3: goto L4d;
                case 4: goto L34;
                case 5: goto L34;
                case 6: goto L23;
                case 7: goto L23;
                case 8: goto L23;
                default: goto L1e;
            }     // Catch: java.lang.ArithmeticException -> L8e
        L1e:
            defpackage.mr9.u()     // Catch: java.lang.ArithmeticException -> L8e
        L21:
            r0 = r1
            goto L60
        L23:
            int r0 = java.lang.Integer.numberOfLeadingZeros(r5)     // Catch: java.lang.ArithmeticException -> L8e
            r3 = -1257966797(0xffffffffb504f333, float:-4.9527733E-7)
            int r3 = r3 >>> r0
            int r0 = 31 - r0
            int r3 = r3 - r5
            int r5 = ~r3     // Catch: java.lang.ArithmeticException -> L8e
            int r5 = ~r5     // Catch: java.lang.ArithmeticException -> L8e
            int r5 = r5 >>> 31
            int r0 = r0 + r5
            goto L60
        L34:
            int r5 = r5 - r2
            int r5 = java.lang.Integer.numberOfLeadingZeros(r5)     // Catch: java.lang.ArithmeticException -> L8e
            int r0 = 32 - r5
            goto L60
        L3c:
            if (r5 <= 0) goto L40
            r0 = r2
            goto L41
        L40:
            r0 = r1
        L41:
            int r3 = r5 + (-1)
            r3 = r3 & r5
            if (r3 != 0) goto L48
            r3 = r2
            goto L49
        L48:
            r3 = r1
        L49:
            r0 = r0 & r3
            defpackage.zmk.j(r0)     // Catch: java.lang.ArithmeticException -> L8e
        L4d:
            int r5 = java.lang.Integer.numberOfLeadingZeros(r5)     // Catch: java.lang.ArithmeticException -> L8e
            int r0 = 31 - r5
            goto L60
        L54:
            java.lang.String r0 = "x ("
            java.lang.String r3 = ") must be > 0"
            java.lang.String r5 = defpackage.grc.u(r0, r5, r3)     // Catch: java.lang.ArithmeticException -> L8e
            defpackage.sz6.p(r5)     // Catch: java.lang.ArithmeticException -> L8e
            goto L21
        L60:
            r4.d = r0     // Catch: java.lang.ArithmeticException -> L8e
            int r5 = java.lang.Integer.numberOfTrailingZeros(r0)
            int r3 = 3 - r5
            int r3 = r2 << r3
            r4.e = r3
            int r5 = r0 >> r5
            r4.f = r5
            int r5 = r6.length
            int r5 = r5 - r2
            r4.c = r5
            r4.g = r7
            boolean[] r5 = new boolean[r3]
        L78:
            int r6 = r4.f
            if (r1 >= r6) goto L8b
            int r6 = r1 * 8
            int r7 = r4.d
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            int r6 = defpackage.bwk.h(r6, r7)
            r5[r6] = r2
            int r1 = r1 + 1
            goto L78
        L8b:
            r4.h = r8
            return
        L8e:
            r4 = move-exception
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            int r6 = r6.length
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Illegal alphabet length "
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.<init>(r6, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xd1.<init>(java.lang.String, char[], byte[], boolean):void");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xd1)) {
            return false;
        }
        xd1 xd1Var = (xd1) obj;
        return this.h == xd1Var.h && Arrays.equals(this.b, xd1Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.h ? 1231 : 1237);
    }

    public final String toString() {
        return this.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public xd1(String str, char[] cArr) {
        byte[] bArr = new byte[FreeTypeConstants.FT_LOAD_PEDANTIC];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            if (c < 128) {
                if (bArr[c] == -1) {
                    bArr[c] = (byte) i;
                } else {
                    sz6.p(iik.g("Duplicate character: %s", Character.valueOf(c)));
                    throw null;
                }
            } else {
                sz6.p(iik.g("Non-ASCII character: %s", Character.valueOf(c)));
                throw null;
            }
        }
        this(str, cArr, bArr, false);
    }
}
