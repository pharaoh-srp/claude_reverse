package defpackage;

import com.google.android.gms.internal.play_billing.zzgb;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class vnk {
    public static final vnk f = new vnk(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public vnk(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static vnk b() {
        return new vnk(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iO;
        int iP;
        int iO2;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iD = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = this.b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 == 1) {
                    ((Long) this.c[i2]).getClass();
                    iO2 = xak.o(i4 << 3) + 8;
                } else if (i5 == 2) {
                    int i6 = i4 << 3;
                    w9k w9kVar = (w9k) this.c[i2];
                    int iO3 = xak.o(i6);
                    int iG = w9kVar.g();
                    iD = gkk.d(iG, iG, iO3, iD);
                } else if (i5 == 3) {
                    int iO4 = xak.o(i4 << 3);
                    iO = iO4 + iO4;
                    iP = ((vnk) this.c[i2]).a();
                } else {
                    if (i5 != 5) {
                        pmf.m(new zzgb());
                        return 0;
                    }
                    ((Integer) this.c[i2]).getClass();
                    iO2 = xak.o(i4 << 3) + 4;
                }
                iD = iO2 + iD;
            } else {
                int i7 = i4 << 3;
                long jLongValue = ((Long) this.c[i2]).longValue();
                iO = xak.o(i7);
                iP = xak.p(jLongValue);
            }
            iD = iP + iO + iD;
        }
        this.d = iD;
        return iD;
    }

    public final void c(int i, Object obj) {
        if (!this.e) {
            mr9.x();
            return;
        }
        e(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void d(w9h w9hVar) {
        xak xakVar = (xak) w9hVar.E;
        if (this.a != 0) {
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    xakVar.m(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    xakVar.f(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    xakVar.c(i4, (w9k) obj);
                } else if (i3 == 3) {
                    xakVar.j(i4, 3);
                    ((vnk) obj).d(w9hVar);
                    xakVar.j(i4, 4);
                } else {
                    if (i3 != 5) {
                        xh6.h(new zzgb());
                        return;
                    }
                    xakVar.d(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final void e(int i) {
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof vnk)) {
            vnk vnkVar = (vnk) obj;
            int i = this.a;
            if (i == vnkVar.a) {
                int[] iArr = this.b;
                int[] iArr2 = vnkVar.b;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        Object[] objArr = this.c;
                        Object[] objArr2 = vnkVar.c;
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
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = i + 527;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.c;
        int i6 = this.a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
