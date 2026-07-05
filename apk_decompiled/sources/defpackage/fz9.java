package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class fz9 {
    public rl4 b;
    public int c;
    public int d;
    public int f;
    public int g;
    public final /* synthetic */ hz9 h;
    public bz9[] a = knk.f;
    public int e = 1;

    public fz9(hz9 hz9Var) {
        this.h = hz9Var;
    }

    public static void b(fz9 fz9Var, oz9 oz9Var, l45 l45Var, ga8 ga8Var, int i, int i2) {
        fz9Var.h.getClass();
        long jK = oz9Var.k(0);
        fz9Var.a(oz9Var, l45Var, ga8Var, i, i2, (int) (!oz9Var.i() ? jK & 4294967295L : jK >> 32));
    }

    public final void a(oz9 oz9Var, l45 l45Var, ga8 ga8Var, int i, int i2, int i3) {
        bz9[] bz9VarArr;
        bz9[] bz9VarArr2 = this.a;
        int length = bz9VarArr2.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                this.f = i;
                this.g = i2;
                break;
            } else {
                bz9 bz9Var = bz9VarArr2[i4];
                if (bz9Var != null && bz9Var.g) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        int iD = oz9Var.d();
        int length2 = this.a.length;
        while (true) {
            bz9VarArr = this.a;
            if (iD >= length2) {
                break;
            }
            bz9 bz9Var2 = bz9VarArr[iD];
            if (bz9Var2 != null) {
                bz9Var2.c();
            }
            iD++;
        }
        if (bz9VarArr.length != oz9Var.d()) {
            this.a = (bz9[]) Arrays.copyOf(this.a, oz9Var.d());
        }
        this.b = new rl4(oz9Var.h());
        this.c = i3;
        this.d = oz9Var.l();
        this.e = oz9Var.c();
        int iD2 = oz9Var.d();
        for (int i5 = 0; i5 < iD2; i5++) {
            Object objG = oz9Var.g(i5);
            ry9 ry9Var = objG instanceof ry9 ? (ry9) objG : null;
            bz9[] bz9VarArr3 = this.a;
            if (ry9Var == null) {
                bz9 bz9Var3 = bz9VarArr3[i5];
                if (bz9Var3 != null) {
                    bz9Var3.c();
                }
                this.a[i5] = null;
            } else {
                bz9 bz9Var4 = bz9VarArr3[i5];
                if (bz9Var4 == null) {
                    bz9Var4 = new bz9(l45Var, ga8Var, new dg8(9, this.h));
                    this.a[i5] = bz9Var4;
                }
                bz9Var4.d = ry9Var.S;
                bz9Var4.e = ry9Var.T;
                bz9Var4.f = ry9Var.U;
            }
        }
    }
}
