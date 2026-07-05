package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class we4 extends wjc implements Serializable {
    public final Comparator[] E;

    public we4(i12 i12Var, i12 i12Var2) {
        this.E = new Comparator[]{i12Var, i12Var2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.E;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof we4) {
            return Arrays.equals(this.E, ((we4) obj).E);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.E);
    }

    public final String toString() {
        return ij0.m(new StringBuilder("Ordering.compound("), Arrays.toString(this.E), ")");
    }
}
