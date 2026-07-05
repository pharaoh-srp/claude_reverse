package defpackage;

import com.squareup.wire.internal.MathMethodsKt;

/* JADX INFO: loaded from: classes.dex */
public final class uh6 implements Comparable {
    public static final lz1 F = new lz1(18);
    public static final long G = v40.m(4611686018427387903L);
    public static final long H = v40.m(-4611686018427387903L);
    public static final long I = 9223372036854759646L;
    public final long E;

    public /* synthetic */ uh6(long j) {
        this.E = j;
    }

    public static final long a(long j, long j2) {
        long j3 = j2 / 1000000;
        long j4 = v40.j(j, j3);
        if (-4611686018426L > j4 || j4 >= 4611686018427L) {
            return v40.m(j4);
        }
        return v40.o((j4 * 1000000) + (j2 - (j3 * 1000000)));
    }

    public static final void b(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strO0 = bsg.O0(i3, String.valueOf(i2));
            int i4 = -1;
            int length = strO0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strO0.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((CharSequence) strO0, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strO0, 0, i6);
            }
        }
        sb.append(str);
    }

    public static final /* synthetic */ uh6 c(long j) {
        return new uh6(j);
    }

    public static int d(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return x44.A(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return l(j) ? -i : i;
    }

    public static final boolean e(long j, long j2) {
        return j == j2;
    }

    public static final long f(long j) {
        return ((((int) j) & 1) != 1 || k(j)) ? o(j, zh6.MILLISECONDS) : j >> 1;
    }

    public static final long g(long j) {
        long j2 = j >> 1;
        if ((((int) j) & 1) == 0) {
            return j2;
        }
        if (j2 > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (j2 < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return j2 * 1000000;
    }

    public static final int h(long j) {
        if (k(j)) {
            return 0;
        }
        return (int) (o(j, zh6.MINUTES) % 60);
    }

    public static final int i(long j) {
        if (k(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % 1000) * 1000000 : (j >> 1) % MathMethodsKt.NANOS_PER_SECOND);
    }

    public static final int j(long j) {
        if (k(j)) {
            return 0;
        }
        return (int) (o(j, zh6.SECONDS) % 60);
    }

    public static final boolean k(long j) {
        return j == G || j == H;
    }

    public static final boolean l(long j) {
        return j < 0;
    }

    public static final long m(long j, long j2) {
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? a(j >> 1, j2 >> 1) : a(j2 >> 1, j >> 1);
        }
        if (i == 0) {
            long j3 = (j >> 1) + (j2 >> 1);
            return (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) ? v40.m(j3 / 1000000) : v40.o(j3);
        }
        long j4 = v40.j(j >> 1, j2 >> 1);
        if (j4 != 9223372036854759646L) {
            return (j4 == 4611686018427387903L || j4 == -4611686018427387903L) ? v40.m(j4) : v40.n(j4);
        }
        sz6.p("Summing infinite durations of different signs yields an undefined result.");
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
    
        if ((java.lang.Integer.signum(2) * java.lang.Long.signum(r3)) > 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ab, code lost:
    
        if ((java.lang.Integer.signum(2) * java.lang.Long.signum(r3)) > 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00af, code lost:
    
        return defpackage.uh6.G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b2, code lost:
    
        return defpackage.uh6.H;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long n(long r19) {
        /*
            r0 = r19
            boolean r2 = k(r0)
            if (r2 == 0) goto L9
            return r0
        L9:
            r2 = 1
            long r3 = r0 >> r2
            r5 = 2
            long r7 = r3 * r5
            int r0 = (int) r0
            r0 = r0 & r2
            r1 = 2
            r9 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            r11 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            if (r0 != 0) goto L8e
            r13 = -2147483647(0xffffffff80000001, double:NaN)
            int r0 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r0 > 0) goto L34
            r13 = 2147483648(0x80000000, double:1.0609978955E-314)
            int r0 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r0 >= 0) goto L34
            long r0 = defpackage.v40.o(r7)
            return r0
        L34:
            long r13 = r7 / r5
            int r0 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            r13 = 1000000(0xf4240, double:4.940656E-318)
            if (r0 != 0) goto L5a
            r0 = -4611686018426999999(0xc00000000005eb41, double:-2.0000000001722644)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 > 0) goto L54
            r0 = 4611686018427000000(0x3ffffffffffa14c0, double:1.999999999913868)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 >= 0) goto L54
            long r0 = defpackage.v40.o(r7)
            return r0
        L54:
            long r7 = r7 / r13
            long r0 = defpackage.v40.m(r7)
            return r0
        L5a:
            long r7 = r3 / r13
            long r15 = r7 * r13
            long r15 = r3 - r15
            long r17 = r7 * r5
            long r15 = r15 * r5
            long r15 = r15 / r13
            long r13 = r15 + r17
            long r5 = r17 / r5
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L82
            long r5 = r13 ^ r17
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 < 0) goto L82
            vka r0 = new vka
            r0.<init>(r11, r9)
            long r0 = defpackage.wd6.g0(r13, r0)
            long r0 = defpackage.v40.m(r0)
            return r0
        L82:
            int r0 = java.lang.Long.signum(r3)
            int r1 = java.lang.Integer.signum(r1)
            int r1 = r1 * r0
            if (r1 <= 0) goto Lb0
            goto Lad
        L8e:
            long r5 = r7 / r5
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto La2
            vka r0 = new vka
            r0.<init>(r11, r9)
            long r0 = defpackage.wd6.g0(r7, r0)
            long r0 = defpackage.v40.m(r0)
            return r0
        La2:
            int r0 = java.lang.Long.signum(r3)
            int r1 = java.lang.Integer.signum(r1)
            int r1 = r1 * r0
            if (r1 <= 0) goto Lb0
        Lad:
            long r0 = defpackage.uh6.G
            return r0
        Lb0:
            long r0 = defpackage.uh6.H
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uh6.n(long):long");
    }

    public static final long o(long j, zh6 zh6Var) {
        if (j == G) {
            return Long.MAX_VALUE;
        }
        if (j == H) {
            return Long.MIN_VALUE;
        }
        return zh6Var.E.convert(j >> 1, ((((int) j) & 1) == 0 ? zh6.NANOSECONDS : zh6.MILLISECONDS).E);
    }

    public static String p(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == G) {
            return "Infinity";
        }
        if (j == H) {
            return "-Infinity";
        }
        boolean zL = l(j);
        StringBuilder sb = new StringBuilder();
        if (zL) {
            sb.append('-');
        }
        if (l(j)) {
            j = q(j);
        }
        long jO = o(j, zh6.DAYS);
        int i = 0;
        int iO = k(j) ? 0 : (int) (o(j, zh6.HOURS) % 24);
        int iH = h(j);
        int iJ = j(j);
        int i2 = i(j);
        boolean z = jO != 0;
        boolean z2 = iO != 0;
        boolean z3 = iH != 0;
        boolean z4 = (iJ == 0 && i2 == 0) ? false : true;
        if (z) {
            sb.append(jO);
            sb.append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iO);
            sb.append('h');
            i = i3;
        }
        if (z3 || (z4 && (z2 || z))) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iH);
            sb.append('m');
            i = i4;
        }
        if (z4) {
            int i5 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iJ != 0 || z || z2 || z3) {
                b(sb, iJ, i2, 9, "s", false);
            } else if (i2 >= 1000000) {
                b(sb, i2 / 1000000, i2 % 1000000, 6, "ms", false);
            } else if (i2 >= 1000) {
                b(sb, i2 / 1000, i2 % 1000, 3, "us", false);
            } else {
                sb.append(i2);
                sb.append("ns");
            }
            i = i5;
        }
        if (zL && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final long q(long j) {
        long j2 = ((-(j >> 1)) << 1) + ((long) (((int) j) & 1));
        int i = wh6.a;
        return j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return d(this.E, ((uh6) obj).E);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uh6) {
            return this.E == ((uh6) obj).E;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.E);
    }

    public final String toString() {
        return p(this.E);
    }
}
