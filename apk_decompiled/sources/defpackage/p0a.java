package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class p0a implements p5b {
    public final q0a a;
    public final int b;
    public final boolean c;
    public final float d;
    public final p5b e;
    public final float f;
    public final boolean g;
    public final l45 h;
    public final cz5 i;
    public final long j;
    public final List k;
    public final int l;
    public final int m;
    public final int n;
    public final boolean o;
    public final ukc p;
    public final int q;
    public final int r;

    public p0a(q0a q0aVar, int i, boolean z, float f, p5b p5bVar, float f2, boolean z2, l45 l45Var, cz5 cz5Var, long j, List list, int i2, int i3, int i4, boolean z3, ukc ukcVar, int i5, int i6) {
        this.a = q0aVar;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = p5bVar;
        this.f = f2;
        this.g = z2;
        this.h = l45Var;
        this.i = cz5Var;
        this.j = j;
        this.k = list;
        this.l = i2;
        this.m = i3;
        this.n = i4;
        this.o = z3;
        this.p = ukcVar;
        this.q = i5;
        this.r = i6;
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

    public final p0a f(int i, boolean z) {
        q0a q0aVar;
        int i2;
        int i3;
        int i4;
        if (this.g) {
            return null;
        }
        List list = this.k;
        if (list.isEmpty() || (q0aVar = this.a) == null) {
            return null;
        }
        int i5 = q0aVar.r;
        int i6 = this.b - i;
        if (i6 < 0 || i6 >= i5) {
            return null;
        }
        q0a q0aVar2 = (q0a) w44.L0(list);
        q0a q0aVar3 = (q0a) w44.U0(list);
        if (q0aVar2.t || q0aVar3.t) {
            return null;
        }
        int i7 = q0aVar2.p;
        int i8 = this.m;
        int i9 = this.l;
        if (i < 0) {
            if (Math.min((i7 + q0aVar2.r) - i9, (q0aVar3.p + q0aVar3.r) - i8) <= (-i)) {
                return null;
            }
        } else if (Math.min(i9 - i7, i8 - q0aVar3.p) <= i) {
            return null;
        }
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            q0a q0aVar4 = (q0a) list.get(i10);
            boolean z2 = q0aVar4.c;
            int[] iArr = q0aVar4.x;
            if (!q0aVar4.t) {
                q0aVar4.p += i;
                int length = iArr.length;
                for (int i11 = 0; i11 < length; i11++) {
                    int i12 = i11 & 1;
                    if ((z2 && i12 != 0) || (!z2 && i12 == 0)) {
                        iArr[i11] = iArr[i11] + i;
                    }
                }
                if (z) {
                    int size2 = q0aVar4.b.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        bz9 bz9VarA = q0aVar4.n.a(i13, q0aVar4.l);
                        if (bz9VarA != null) {
                            long j = bz9VarA.l;
                            if (z2) {
                                i2 = i10;
                                i3 = (int) (j >> 32);
                                i4 = ((int) (j & 4294967295L)) + i;
                            } else {
                                i2 = i10;
                                i3 = ((int) (j >> 32)) + i;
                                i4 = (int) (j & 4294967295L);
                            }
                            bz9VarA.l = (((long) i4) & 4294967295L) | (((long) i3) << 32);
                        } else {
                            i2 = i10;
                        }
                        i13++;
                        i10 = i2;
                    }
                }
            }
            i10++;
        }
        return new p0a(this.a, i6, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, list, this.l, this.m, this.n, this.o, this.p, this.q, this.r);
    }

    public final long g() {
        p5b p5bVar = this.e;
        return (((long) p5bVar.b()) << 32) | (((long) p5bVar.a()) & 4294967295L);
    }
}
