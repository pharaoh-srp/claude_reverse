package defpackage;

import com.google.android.gms.internal.measurement.m0;
import com.google.android.gms.internal.measurement.zzkl$zzb;
import com.google.android.gms.internal.measurement.zzln;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class p0l {
    public static final p0l f = new p0l(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public p0l(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static p0l e() {
        return new p0l(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iT;
        int iR;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iE = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = this.b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 == 1) {
                    ((Long) this.c[i2]).getClass();
                    iE = gkk.e(i4 << 3, 8, iE);
                } else if (i5 == 2) {
                    iE = m0.m(i4, (suk) this.c[i2]) + iE;
                } else if (i5 == 3) {
                    iT = m0.s(i4) << 1;
                    iR = ((p0l) this.c[i2]).a();
                } else {
                    if (i5 != 5) {
                        pmf.m(new zzln("Protocol message tag had invalid wire type."));
                        return 0;
                    }
                    ((Integer) this.c[i2]).getClass();
                    iE = gkk.e(i4 << 3, 4, iE);
                }
            } else {
                long jLongValue = ((Long) this.c[i2]).longValue();
                iT = m0.t(i4 << 3);
                iR = m0.r(jLongValue);
            }
            iE = iR + iT + iE;
        }
        this.d = iE;
        return iE;
    }

    public final void b(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    public final void c(int i, Object obj) {
        if (!this.e) {
            mr9.x();
            return;
        }
        b(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void d(bnh bnhVar) throws zzkl$zzb {
        if (this.a == 0) {
            return;
        }
        bnhVar.getClass();
        m0 m0Var = (m0) bnhVar.F;
        for (int i = 0; i < this.a; i++) {
            int i2 = this.b[i];
            Object obj = this.c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                m0Var.k(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                m0Var.d(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                suk sukVar = (suk) obj;
                m0Var.o(i3, 2);
                m0Var.n(sukVar.h());
                m0Var.p(sukVar.F, sukVar.k(), sukVar.h());
            } else if (i4 == 3) {
                m0Var.o(i3, 3);
                ((p0l) obj).d(bnhVar);
                m0Var.o(i3, 4);
            } else {
                if (i4 != 5) {
                    xh6.h(new zzln("Protocol message tag had invalid wire type."));
                    return;
                }
                m0Var.c(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof p0l)) {
            return false;
        }
        p0l p0lVar = (p0l) obj;
        int i = this.a;
        if (i == p0lVar.a) {
            int[] iArr = this.b;
            int[] iArr2 = p0lVar.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = p0lVar.c;
                    int i3 = this.a;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.c;
        int i6 = this.a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
