package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class dx9 implements p5b {
    public final fx9 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final p5b e;
    public final float f;
    public final boolean g;
    public final l45 h;
    public final cz5 i;
    public final int j;
    public final bz7 k;
    public final bz7 l;
    public final List m;
    public final int n;
    public final int o;
    public final int p;
    public final ukc q;
    public final int r;
    public final int s;

    public dx9(fx9 fx9Var, int i, boolean z, float f, p5b p5bVar, float f2, boolean z2, l45 l45Var, cz5 cz5Var, int i2, bz7 bz7Var, bz7 bz7Var2, List list, int i3, int i4, int i5, ukc ukcVar, int i6, int i7) {
        this.a = fx9Var;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = p5bVar;
        this.f = f2;
        this.g = z2;
        this.h = l45Var;
        this.i = cz5Var;
        this.j = i2;
        this.k = bz7Var;
        this.l = bz7Var2;
        this.m = list;
        this.n = i3;
        this.o = i4;
        this.p = i5;
        this.q = ukcVar;
        this.r = i6;
        this.s = i7;
    }

    @Override // defpackage.p5b
    public final int a() {
        return this.e.a();
    }

    @Override // defpackage.p5b
    public final int b() {
        return this.e.b();
    }

    @Override // defpackage.p5b
    public final Map c() {
        return this.e.c();
    }

    @Override // defpackage.p5b
    public final void d() {
        this.e.d();
    }

    @Override // defpackage.p5b
    public final bz7 e() {
        return this.e.e();
    }

    public final dx9 f(int i, boolean z) {
        fx9 fx9Var;
        int i2;
        List list;
        int i3;
        int i4;
        long j;
        List list2;
        if (this.g) {
            return null;
        }
        List list3 = this.m;
        if (list3.isEmpty() || (fx9Var = this.a) == null) {
            return null;
        }
        int i5 = fx9Var.g;
        int i6 = this.b - i;
        if (i6 < 0 || i6 >= i5) {
            return null;
        }
        ex9 ex9Var = (ex9) w44.L0(list3);
        ex9 ex9Var2 = (ex9) w44.U0(list3);
        if (ex9Var.w || ex9Var2.w) {
            return null;
        }
        int i7 = this.o;
        int i8 = this.n;
        ukc ukcVar = this.q;
        if (i < 0) {
            if (Math.min((dvj.g(ex9Var, ukcVar) + ex9Var.o) - i8, (dvj.g(ex9Var2, ukcVar) + ex9Var2.o) - i7) <= (-i)) {
                return null;
            }
        } else if (Math.min(i8 - dvj.g(ex9Var, ukcVar), i7 - dvj.g(ex9Var2, ukcVar)) <= i) {
            return null;
        }
        int size = list3.size();
        int i9 = 0;
        while (i9 < size) {
            ex9 ex9Var3 = (ex9) list3.get(i9);
            ex9Var3.getClass();
            if (ex9Var3.w) {
                list = list3;
                i3 = size;
                i2 = i6;
            } else {
                long j2 = ex9Var3.t;
                long j3 = 4294967295L;
                i2 = i6;
                ex9Var3.t = (((long) ((int) (j2 >> 32))) << 32) | (((long) (((int) (j2 & 4294967295L)) + i)) & 4294967295L);
                if (z) {
                    int size2 = ex9Var3.g.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        bz9 bz9VarA = ex9Var3.j.a(i10, ex9Var3.b);
                        if (bz9VarA != null) {
                            long j4 = bz9VarA.l;
                            j = j3;
                            list2 = list3;
                            i4 = size;
                            bz9VarA.l = (((long) (((int) (j4 & j)) + i)) & j) | (((long) ((int) (j4 >> 32))) << 32);
                        } else {
                            i4 = size;
                            j = j3;
                            list2 = list3;
                        }
                        i10++;
                        list3 = list2;
                        j3 = j;
                        size = i4;
                    }
                }
                list = list3;
                i3 = size;
            }
            i9++;
            i6 = i2;
            list3 = list;
            size = i3;
        }
        return new dx9(this.a, i6, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, list3, this.n, this.o, this.p, ukcVar, this.r, this.s);
    }

    public final long g() {
        p5b p5bVar = this.e;
        return (((long) p5bVar.b()) << 32) | (((long) p5bVar.a()) & 4294967295L);
    }
}
