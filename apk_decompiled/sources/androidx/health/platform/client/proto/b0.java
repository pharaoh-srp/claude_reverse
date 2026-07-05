package androidx.health.platform.client.proto;

import androidx.health.platform.client.proto.InvalidProtocolBufferException;
import defpackage.f22;
import defpackage.mr9;
import defpackage.pmf;
import defpackage.poj;
import defpackage.xh6;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 {
    public static final b0 f = new b0(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public b0(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static b0 c() {
        return new b0(0, new int[8], new Object[8], true);
    }

    public final void a(int i) {
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

    public final int b() {
        int iE;
        int iG;
        int iE2;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.c[i3]).getClass();
                    iE2 = b.e(i5) + 8;
                } else if (i6 == 2) {
                    iE2 = b.a(i5, (f22) this.c[i3]);
                } else if (i6 == 3) {
                    iE = b.e(i5) * 2;
                    iG = ((b0) this.c[i3]).b();
                } else {
                    if (i6 != 5) {
                        pmf.m(new InvalidProtocolBufferException.InvalidWireTypeException("Protocol message tag had invalid wire type."));
                        return 0;
                    }
                    ((Integer) this.c[i3]).getClass();
                    iE2 = b.e(i5) + 4;
                }
                i2 = iE2 + i2;
            } else {
                long jLongValue = ((Long) this.c[i3]).longValue();
                iE = b.e(i5);
                iG = b.g(jLongValue);
            }
            i2 = iG + iE + i2;
        }
        this.d = i2;
        return i2;
    }

    public final void d(int i, Object obj) {
        if (!this.e) {
            mr9.x();
            return;
        }
        a(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void e(poj pojVar) {
        if (this.a == 0) {
            return;
        }
        pojVar.getClass();
        b bVar = (b) pojVar.E;
        for (int i = 0; i < this.a; i++) {
            int i2 = this.b[i];
            Object obj = this.c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                bVar.u(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                bVar.m(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                bVar.r(i3, 2);
                bVar.j((f22) obj);
            } else if (i4 == 3) {
                bVar.r(i3, 3);
                ((b0) obj).e(pojVar);
                bVar.r(i3, 4);
            } else {
                if (i4 != 5) {
                    xh6.h(new InvalidProtocolBufferException.InvalidWireTypeException("Protocol message tag had invalid wire type."));
                    return;
                }
                bVar.k(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        int i = this.a;
        if (i == b0Var.a) {
            int[] iArr = this.b;
            int[] iArr2 = b0Var.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = b0Var.c;
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
        int i2 = (527 + i) * 31;
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
