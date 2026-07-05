package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q54 {
    public static final int[] a;
    public static final om8 b;
    public static final om8 c;

    static {
        Iterator<E> it = ish.I.iterator();
        if (!it.hasNext()) {
            pmf.d();
            return;
        }
        int i = ((ish) it.next()).E;
        while (it.hasNext()) {
            int i2 = ((ish) it.next()).E;
            if (i < i2) {
                i = i2;
            }
        }
        int i3 = i + 1;
        int[] iArr = new int[i3];
        Arrays.fill(iArr, 0, i3, 0);
        yl4 yl4Var = ish.F;
        iArr[3] = 1;
        iArr[36] = 1;
        iArr[1] = 2;
        iArr[21] = 2;
        iArr[39] = 2;
        iArr[25] = 3;
        iArr[30] = 3;
        iArr[26] = 3;
        iArr[32] = 3;
        iArr[24] = 3;
        iArr[29] = 3;
        iArr[5] = 4;
        iArr[2] = 5;
        iArr[17] = 5;
        iArr[31] = 5;
        iArr[13] = 5;
        iArr[40] = 5;
        iArr[41] = 5;
        iArr[12] = 6;
        iArr[11] = 6;
        iArr[23] = 6;
        iArr[7] = 6;
        iArr[4] = 6;
        iArr[28] = 6;
        iArr[18] = 7;
        iArr[38] = 7;
        iArr[35] = 7;
        iArr[14] = 7;
        iArr[27] = 7;
        iArr[9] = 7;
        iArr[6] = 8;
        iArr[19] = 8;
        iArr[8] = 8;
        a = iArr;
        b = new om8(-5524801, -10722448, -3770147, -2069387, -11094334, -6765703, -3040666, -10375442, -1654661, -15522017, -13666797, -14280675, -4902093, -12767206);
        c = new om8(-13092286, -6250073, -5888348, -1812919, -16677701, -11493041, -6789119, -12551950, -4094975, -1313567, -13666796, -398100, -4902349, -1851);
    }
}
