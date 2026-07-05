package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class wp1 {
    public final int[] a;
    public final int b;
    public final int c;
    public final int d;
    public final List e;

    public wp1(int... iArr) {
        List listP1;
        this.a = iArr;
        Integer numH0 = mp0.H0(0, iArr);
        this.b = numH0 != null ? numH0.intValue() : -1;
        int i = 1;
        Integer numH02 = mp0.H0(1, iArr);
        this.c = numH02 != null ? numH02.intValue() : -1;
        Integer numH03 = mp0.H0(2, iArr);
        this.d = numH03 != null ? numH03.intValue() : -1;
        if (iArr.length <= 3) {
            listP1 = lm6.E;
        } else {
            if (iArr.length > 1024) {
                sz6.p(vb7.r(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), iArr.length, '.'));
                throw null;
            }
            listP1 = w44.p1(new np0(i, iArr).subList(3, iArr.length));
        }
        this.e = listP1;
    }

    public final boolean a(int i, int i2, int i3) {
        int i4 = this.b;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.c;
        if (i5 > i2) {
            return true;
        }
        return i5 >= i2 && this.d >= i3;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        wp1 wp1Var = (wp1) obj;
        return this.b == wp1Var.b && this.c == wp1Var.c && this.d == wp1Var.d && x44.r(this.e, wp1Var.e);
    }

    public final int hashCode() {
        int i = this.b;
        int i2 = (i * 31) + this.c + i;
        int i3 = (i2 * 31) + this.d + i2;
        return this.e.hashCode() + (i3 * 31) + i3;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        for (int i : this.a) {
            if (i == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList.isEmpty() ? "unknown" : w44.S0(arrayList, ".", null, null, null, 62);
    }
}
