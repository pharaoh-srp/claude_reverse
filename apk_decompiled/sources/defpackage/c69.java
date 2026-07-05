package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class c69 implements Comparable, Serializable {
    public static final c69 G = new c69(-31557014167219200L, 0);
    public static final c69 H = new c69(31556889864403199L, 999999999);
    public final long E;
    public final int F;

    public c69(long j, int i) {
        this.E = j;
        this.F = i;
        if (-31557014167219200L > j || j >= 31556889864403200L) {
            sz6.p("Instant exceeds minimum or maximum instant");
            throw null;
        }
    }

    public final long a(c69 c69Var) {
        c69Var.getClass();
        lz1 lz1Var = uh6.F;
        return uh6.m(v40.R(this.E - c69Var.E, zh6.SECONDS), v40.Q(this.F - c69Var.F, zh6.NANOSECONDS));
    }

    public final long b() {
        long j = this.E;
        int i = this.F;
        long j2 = 1000;
        if (j >= 0) {
            if (j != 1) {
                if (j != 0) {
                    long j3 = j * 1000;
                    if (j3 / 1000 != j) {
                        return Long.MAX_VALUE;
                    }
                    j2 = j3;
                } else {
                    j2 = 0;
                }
            }
            long j4 = i / 1000000;
            long j5 = j2 + j4;
            if ((j2 ^ j5) >= 0 || (j4 ^ j2) < 0) {
                return j5;
            }
            return Long.MAX_VALUE;
        }
        long j6 = j + 1;
        if (j6 != 1) {
            if (j6 != 0) {
                long j7 = j6 * 1000;
                if (j7 / 1000 != j6) {
                    return Long.MIN_VALUE;
                }
                j2 = j7;
            } else {
                j2 = 0;
            }
        }
        long j8 = (i / 1000000) - 1000;
        long j9 = j2 + j8;
        if ((j2 ^ j9) >= 0 || (j8 ^ j2) < 0) {
            return j9;
        }
        return Long.MIN_VALUE;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c69 c69Var = (c69) obj;
        c69Var.getClass();
        int iA = x44.A(this.E, c69Var.E);
        return iA != 0 ? iA : x44.z(this.F, c69Var.F);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c69)) {
            return false;
        }
        c69 c69Var = (c69) obj;
        return this.E == c69Var.E && this.F == c69Var.F;
    }

    public final int hashCode() {
        return (this.F * 51) + Long.hashCode(this.E);
    }

    public final String toString() {
        long j;
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        long j2 = this.E;
        long j3 = j2 / 86400;
        if ((j2 ^ 86400) < 0 && j3 * 86400 != j2) {
            j3--;
        }
        long j4 = j2 % 86400;
        int i = (int) (j4 + (86400 & (((j4 ^ 86400) & ((-j4) | j4)) >> 63)));
        long j5 = 719468 + j3;
        if (j5 < 0) {
            long j6 = ((j3 + 719469) / 146097) - 1;
            j = j6 * 400;
            j5 += (-j6) * 146097;
        } else {
            j = 0;
        }
        long j7 = ((400 * j5) + 591) / 146097;
        long j8 = j5 - ((j7 / 400) + (((j7 / 4) + (365 * j7)) - (j7 / 100)));
        if (j8 < 0) {
            j7--;
            j8 = j5 - ((j7 / 400) + (((j7 / 4) + (365 * j7)) - (j7 / 100)));
        }
        int i2 = (int) j8;
        int i3 = ((i2 * 5) + 2) / 153;
        int i4 = ((i3 + 2) % 12) + 1;
        int i5 = (i2 - (((i3 * 306) + 5) / 10)) + 1;
        int i6 = (int) (j7 + j + ((long) (i3 / 10)));
        int i7 = i / 3600;
        int i8 = i - (i7 * 3600);
        int i9 = i8 / 60;
        int i10 = i8 - (i9 * 60);
        int i11 = 0;
        if (Math.abs(i6) < 1000) {
            StringBuilder sb2 = new StringBuilder();
            if (i6 >= 0) {
                sb2.append(i6 + yr6.INVALID_OWNERSHIP);
                sb2.deleteCharAt(0).getClass();
            } else {
                sb2.append(i6 - yr6.INVALID_OWNERSHIP);
                sb2.deleteCharAt(1).getClass();
            }
            sb.append((CharSequence) sb2);
        } else {
            if (i6 >= 10000) {
                sb.append('+');
            }
            sb.append(i6);
        }
        sb.append('-');
        csg.w(sb, sb, i4);
        sb.append('-');
        csg.w(sb, sb, i5);
        sb.append('T');
        csg.w(sb, sb, i7);
        sb.append(':');
        csg.w(sb, sb, i9);
        sb.append(':');
        csg.w(sb, sb, i10);
        int i12 = this.F;
        if (i12 != 0) {
            sb.append('.');
            while (true) {
                iArr = csg.c;
                int i13 = i11 + 1;
                if (i12 % iArr[i13] != 0) {
                    break;
                }
                i11 = i13;
            }
            int i14 = i11 - (i11 % 3);
            String strValueOf = String.valueOf((i12 / iArr[i14]) + iArr[9 - i14]);
            strValueOf.getClass();
            sb.append(strValueOf.substring(1));
        }
        sb.append('Z');
        return sb.toString();
    }
}
