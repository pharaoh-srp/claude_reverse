package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h18 {
    public final ArrayList a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final xub e;
    public final u0h f;

    public h18(int i, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
        if (i < 0) {
            zad.a("Invalid start index");
        }
        this.d = new ArrayList();
        xub xubVar = new xub();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            uo9 uo9Var = (uo9) this.a.get(i3);
            int i4 = uo9Var.c;
            int i5 = uo9Var.d;
            xubVar.i(i4, new cb8(i3, i2, i5));
            i2 += i5;
        }
        this.e = xubVar;
        this.f = new u0h(new im(2, this));
    }

    public final boolean a(int i, int i2) {
        cb8 cb8Var;
        int i3;
        int i4;
        xub xubVar = this.e;
        cb8 cb8Var2 = (cb8) xubVar.b(i);
        if (cb8Var2 == null) {
            return false;
        }
        int i5 = cb8Var2.b;
        int i6 = i2 - cb8Var2.c;
        cb8Var2.c = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = xubVar.c;
        long[] jArr = xubVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j) < 128 && (i3 = (cb8Var = (cb8) objArr[(i7 << 3) + i9]).b) >= i5 && cb8Var != cb8Var2 && (i4 = i3 + i6) >= 0) {
                        cb8Var.b = i4;
                    }
                    j >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}
