package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fx9 {
    public final int a;
    public final ex9[] b;
    public final epk c;
    public final List d;
    public final int e;
    public final int f;
    public final int g;

    public fx9(int i, ex9[] ex9VarArr, epk epkVar, List list, int i2) {
        this.a = i;
        this.b = ex9VarArr;
        this.c = epkVar;
        this.d = list;
        this.e = i2;
        int iMax = 0;
        for (ex9 ex9Var : ex9VarArr) {
            iMax = Math.max(iMax, ex9Var.n);
        }
        this.f = iMax;
        int i3 = iMax + this.e;
        this.g = i3 >= 0 ? i3 : 0;
    }

    public final ex9[] a(int i, int i2, int i3) {
        ex9[] ex9VarArr = this.b;
        int length = ex9VarArr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            ex9 ex9Var = ex9VarArr[i4];
            int i7 = i5 + 1;
            int i8 = (int) ((za8) this.d.get(i5)).a;
            ex9Var.b(i, ((int[]) this.c.F)[i6], i2, i3, this.a, i6);
            i6 += i8;
            i4++;
            i5 = i7;
        }
        return ex9VarArr;
    }
}
