package defpackage;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class uag {
    public static final int a(ArrayList arrayList, int i, int i2) {
        int iE = e(arrayList, i, i2);
        return iE >= 0 ? iE : -(iE + 1);
    }

    public static final int b(int i, int[] iArr) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    public static final void c(int i, int i2, int[] iArr) {
        if (i2 >= 0) {
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    public static final sag d(sag sagVar) {
        if (!(sagVar instanceof sag)) {
            sagVar = null;
        }
        if (sagVar != null) {
            return sagVar;
        }
        pd4.b("Inconsistent composition");
        sz6.r();
        return null;
    }

    public static final int e(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((y08) arrayList.get(i4)).a;
            if (i5 < 0) {
                i5 += i2;
            }
            int iZ = x44.z(i5, i);
            if (iZ < 0) {
                i3 = i4 + 1;
            } else {
                if (iZ <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final void f() {
        throw new ConcurrentModificationException();
    }
}
