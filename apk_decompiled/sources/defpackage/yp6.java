package defpackage;

import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yp6 {
    public static final char[] a = {',', ';'};
    public static final HashMap b = new HashMap();
    public static final ArrayList c = new ArrayList(106);
    public static final ThreadLocal d = ThreadLocal.withInitial(new ui2(3));
    public static final ThreadLocal e = new ThreadLocal();

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(defpackage.gjk r4, defpackage.xp6 r5, int r6) {
        /*
            int[] r0 = r5.G
            int r0 = java.util.Arrays.binarySearch(r0, r6)
            java.lang.String r1 = ""
            if (r0 < 0) goto L1f
            java.lang.String[] r2 = r5.H
            int r3 = r2.length
            int r3 = r3 + (-1)
            if (r0 >= r3) goto L1c
            int[] r5 = r5.G
            int r3 = r0 + 1
            r5 = r5[r3]
            if (r5 != r6) goto L1c
            r5 = r2[r3]
            goto L20
        L1c:
            r5 = r2[r0]
            goto L20
        L1f:
            r5 = r1
        L20:
            boolean r0 = r1.equals(r5)
            r1 = 59
            if (r0 != 0) goto L36
            r6 = 38
            gjk r4 = r4.g(r6)
            gjk r4 = r4.h(r5)
            r4.g(r1)
            return
        L36:
            java.lang.String r5 = "&#x"
            gjk r4 = r4.h(r5)
            java.lang.String r5 = java.lang.Integer.toHexString(r6)
            gjk r4 = r4.h(r5)
            r4.g(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yp6.a(gjk, xp6, int):void");
    }

    public static boolean b(int i, char c2, CharsetEncoder charsetEncoder) {
        int iF = sq6.F(i);
        if (iF != 0) {
            if (iF != 1) {
                return charsetEncoder.canEncode(c2);
            }
            if (c2 >= 55296 && c2 < 57344) {
                return false;
            }
        } else if (c2 >= 128) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0061 A[PHI: r8 r9 r10
      0x0061: PHI (r8v4 boolean) = 
      (r8v2 boolean)
      (r8v2 boolean)
      (r8v2 boolean)
      (r8v2 boolean)
      (r8v2 boolean)
      (r8v2 boolean)
      (r8v2 boolean)
      (r8v2 boolean)
      (r8v2 boolean)
      (r8v2 boolean)
      (r8v2 boolean)
      (r8v2 boolean)
      (r8v2 boolean)
      (r8v2 boolean)
      (r8v2 boolean)
      (r8v1 boolean)
      (r8v1 boolean)
     binds: [B:92:0x012f, B:91:0x012a, B:90:0x0123, B:87:0x0118, B:86:0x0111, B:85:0x010a, B:84:0x0103, B:82:0x00fa, B:81:0x00f5, B:80:0x00ee, B:79:0x00e7, B:73:0x00d9, B:72:0x00d5, B:46:0x009e, B:48:0x00a3, B:24:0x005f, B:22:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0061: PHI (r9v4 boolean) = 
      (r9v2 boolean)
      (r9v2 boolean)
      (r9v2 boolean)
      (r9v2 boolean)
      (r9v2 boolean)
      (r9v2 boolean)
      (r9v2 boolean)
      (r9v2 boolean)
      (r9v2 boolean)
      (r9v2 boolean)
      (r9v2 boolean)
      (r9v2 boolean)
      (r9v2 boolean)
      (r9v2 boolean)
      (r9v2 boolean)
      (r9v1 boolean)
      (r9v1 boolean)
     binds: [B:92:0x012f, B:91:0x012a, B:90:0x0123, B:87:0x0118, B:86:0x0111, B:85:0x010a, B:84:0x0103, B:82:0x00fa, B:81:0x00f5, B:80:0x00ee, B:79:0x00e7, B:73:0x00d9, B:72:0x00d5, B:46:0x009e, B:48:0x00a3, B:24:0x005f, B:22:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0061: PHI (r10v4 boolean) = 
      (r10v2 boolean)
      (r10v2 boolean)
      (r10v2 boolean)
      (r10v2 boolean)
      (r10v2 boolean)
      (r10v2 boolean)
      (r10v2 boolean)
      (r10v2 boolean)
      (r10v2 boolean)
      (r10v2 boolean)
      (r10v2 boolean)
      (r10v2 boolean)
      (r10v2 boolean)
      (r10v2 boolean)
      (r10v2 boolean)
      (r10v1 boolean)
      (r10v1 boolean)
     binds: [B:92:0x012f, B:91:0x012a, B:90:0x0123, B:87:0x0118, B:86:0x0111, B:85:0x010a, B:84:0x0103, B:82:0x00fa, B:81:0x00f5, B:80:0x00ee, B:79:0x00e7, B:73:0x00d9, B:72:0x00d5, B:46:0x009e, B:48:0x00a3, B:24:0x005f, B:22:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(defpackage.gjk r16, java.lang.String r17, defpackage.n96 r18, int r19) {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yp6.c(gjk, java.lang.String, n96, int):void");
    }
}
