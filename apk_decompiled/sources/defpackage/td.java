package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class td implements f87 {
    public final v3i a;
    public final int b;
    public final int[] c;
    public final jw7[] d;
    public int e;
    public final /* synthetic */ int f;

    public td(int i, v3i v3iVar, int[] iArr) {
        jw7[] jw7VarArr;
        this.f = i;
        fd9.M(iArr.length > 0);
        v3iVar.getClass();
        jw7[] jw7VarArr2 = v3iVar.d;
        this.a = v3iVar;
        int length = iArr.length;
        this.b = length;
        this.d = new jw7[length];
        int i2 = 0;
        while (true) {
            int length2 = iArr.length;
            jw7VarArr = this.d;
            if (i2 >= length2) {
                break;
            }
            jw7VarArr[i2] = jw7VarArr2[iArr[i2]];
            i2++;
        }
        Arrays.sort(jw7VarArr, new z31(1));
        this.c = new int[this.b];
        int i3 = 0;
        while (true) {
            int i4 = this.b;
            if (i3 >= i4) {
                long[] jArr = new long[i4];
                return;
            }
            int[] iArr2 = this.c;
            jw7 jw7Var = this.d[i3];
            int i5 = 0;
            while (true) {
                if (i5 >= jw7VarArr2.length) {
                    i5 = -1;
                    break;
                } else if (jw7Var == jw7VarArr2[i5]) {
                    break;
                } else {
                    i5++;
                }
            }
            iArr2[i3] = i5;
            i3++;
        }
    }

    public static void m(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            hz8 hz8Var = (hz8) arrayList.get(i);
            if (hz8Var != null) {
                hz8Var.b(new sd(j, jArr[i]));
            }
        }
    }

    private final void n() {
    }

    private final void p() {
    }

    private final void r(float f) {
    }

    @Override // defpackage.f87
    public final v3i a() {
        return this.a;
    }

    @Override // defpackage.f87
    public final void b(boolean z) {
    }

    @Override // defpackage.f87
    public final jw7 c(int i) {
        return this.d[i];
    }

    @Override // defpackage.f87
    public void d() {
        int i = this.f;
    }

    @Override // defpackage.f87
    public final int e(int i) {
        return this.c[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            td tdVar = (td) obj;
            if (this.a.equals(tdVar.a) && Arrays.equals(this.c, tdVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.f87
    public void f() {
        int i = this.f;
    }

    @Override // defpackage.f87
    public final int g() {
        return this.c[0];
    }

    @Override // defpackage.f87
    public final jw7 h() {
        return this.d[0];
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        }
        return this.e;
    }

    @Override // defpackage.f87
    public void i(float f) {
        int i = this.f;
    }

    @Override // defpackage.f87
    public final int l(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.f87
    public final int length() {
        return this.c.length;
    }

    public final void o() {
    }

    public final void q() {
    }

    public final void s(float f) {
    }
}
