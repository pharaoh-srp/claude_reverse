package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class gz8 implements Serializable {
    public static final gz8 G = new gz8(new int[0]);
    public final int[] E;
    public final int F;

    public gz8(int[] iArr) {
        int length = iArr.length;
        this.E = iArr;
        this.F = length;
    }

    public final boolean equals(Object obj) {
        gz8 gz8Var;
        int i;
        int i2;
        if (obj == this) {
            return true;
        }
        if ((obj instanceof gz8) && (i2 = this.F) == (i = (gz8Var = (gz8) obj).F)) {
            for (int i3 = 0; i3 < i2; i3++) {
                fd9.G(i3, i2);
                int i4 = this.E[i3];
                fd9.G(i3, i);
                if (i4 == gz8Var.E[i3]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.F; i2++) {
            i = (i * 31) + this.E[i2];
        }
        return i;
    }

    public final String toString() {
        int i = this.F;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.E;
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(iArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }
}
