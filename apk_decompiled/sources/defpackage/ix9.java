package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ix9 {
    public final yw9 a;
    public final ArrayList b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final ArrayList g;
    public List h;
    public int i;

    public ix9(yw9 yw9Var) {
        this.a = yw9Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new gx9(0, 0));
        this.b = arrayList;
        this.f = -1;
        this.g = new ArrayList();
        this.h = lm6.E;
    }

    public final int a() {
        return ((int) Math.sqrt((((double) d()) * 1.0d) / ((double) this.i))) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.iv7 b(int r13) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ix9.b(int):iv7");
    }

    public final int c(int i) {
        int i2;
        if (d() <= 0) {
            return 0;
        }
        if (i >= d()) {
            e39.a("ItemIndex > total count");
        }
        if (!this.a.n) {
            return i / this.i;
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        x44.d0(arrayList.size(), size);
        int i3 = size - 1;
        int i4 = 0;
        while (true) {
            if (i4 > i3) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + i3) >>> 1;
            int i5 = ((gx9) arrayList.get(i2)).a - i;
            if (i5 >= 0) {
                if (i5 <= 0) {
                    break;
                }
                i3 = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 < 0) {
            i2 = (-i2) - 2;
        }
        int iA = a() * i2;
        int i6 = ((gx9) arrayList.get(i2)).a;
        if (i6 > i) {
            e39.a("currentItemIndex > itemIndex");
        }
        int i7 = 0;
        while (i6 < i) {
            int i8 = i6 + 1;
            int iE = e(i6);
            i7 += iE;
            int i9 = this.i;
            if (i7 >= i9) {
                if (i7 == i9) {
                    iA++;
                    i7 = 0;
                } else {
                    iA++;
                    i7 = iE;
                }
            }
            if (iA % a() == 0 && iA / a() >= arrayList.size()) {
                arrayList.add(new gx9(i8 - (i7 > 0 ? 1 : 0), 0));
            }
            i6 = i8;
        }
        return e(i) + i7 > this.i ? iA + 1 : iA;
    }

    public final int d() {
        return this.a.m.b;
    }

    public final int e(int i) {
        hx9.b = this.i;
        ra9 ra9VarC = this.a.m.c(i);
        int i2 = i - ra9VarC.a;
        return (int) ((za8) ((vw9) ra9VarC.c).b.invoke(hx9.a, Integer.valueOf(i2))).a;
    }
}
