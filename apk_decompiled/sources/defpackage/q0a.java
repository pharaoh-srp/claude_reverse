package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q0a implements oz9 {
    public final int a;
    public final List b;
    public final boolean c;
    public final qt d;
    public final wo1 e;
    public final fu9 f;
    public final boolean g;
    public final int h;
    public final int i;
    public final int j;
    public final long k;
    public final Object l;
    public final Object m;
    public final hz9 n;
    public final long o;
    public int p;
    public final int q;
    public final int r;
    public final int s;
    public boolean t;
    public int u = Integer.MIN_VALUE;
    public int v;
    public int w;
    public final int[] x;

    public q0a(int i, List list, boolean z, qt qtVar, wo1 wo1Var, fu9 fu9Var, boolean z2, int i2, int i3, int i4, long j, Object obj, Object obj2, hz9 hz9Var, long j2) {
        this.a = i;
        this.b = list;
        this.c = z;
        this.d = qtVar;
        this.e = wo1Var;
        this.f = fu9Var;
        this.g = z2;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = j;
        this.l = obj;
        this.m = obj2;
        this.n = hz9Var;
        this.o = j2;
        int size = list.size();
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < size; i6++) {
            c3d c3dVar = (c3d) list.get(i6);
            boolean z3 = this.c;
            i5 += z3 ? c3dVar.F : c3dVar.E;
            iMax = Math.max(iMax, !z3 ? c3dVar.F : c3dVar.E);
        }
        this.q = i5;
        int i7 = i5 + this.j;
        this.r = i7 >= 0 ? i7 : 0;
        this.s = iMax;
        this.x = new int[this.b.size() * 2];
    }

    public final int a(long j) {
        return (int) (this.c ? j & 4294967295L : j >> 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(b3d b3dVar, boolean z) {
        List list;
        int i;
        if (this.u == Integer.MIN_VALUE) {
            e39.a("position() should be called first");
        }
        List list2 = this.b;
        int i2 = 0;
        for (int size = list2.size(); i2 < size; size = i) {
            c3d c3dVar = (c3d) list2.get(i2);
            int i3 = this.v;
            boolean z2 = this.c;
            int i4 = i3 - (z2 ? c3dVar.F : c3dVar.E);
            int i5 = this.w;
            long jK = k(i2);
            bz9 bz9VarA = this.n.a(i2, this.l);
            ja8 ja8Var = null;
            Object[] objArr = 0;
            if (bz9VarA != null) {
                if (z) {
                    bz9VarA.r = jK;
                    list = list2;
                    i = size;
                } else {
                    list = list2;
                    i = size;
                    if (!y69.b(bz9VarA.r, 9223372034707292159L)) {
                        jK = bz9VarA.r;
                    }
                    long jD = y69.d(jK, ((y69) bz9VarA.q.getValue()).a);
                    if (((a(jK) <= i4 && a(jD) <= i4) || (a(jK) >= i5 && a(jD) >= i5)) && ((Boolean) bz9VarA.h.getValue()).booleanValue()) {
                        gb9.D(bz9VarA.a, null, null, new zy9(bz9VarA, objArr == true ? 1 : 0, 1), 3);
                    }
                    jK = jD;
                }
                ja8Var = bz9VarA.n;
            } else {
                list = list2;
                i = size;
            }
            if (this.g) {
                int i6 = this.u;
                if (z2) {
                    jK = (((long) ((int) (jK >> 32))) << 32) | (((long) ((i6 - ((int) (jK & 4294967295L))) - (z2 ? c3dVar.F : c3dVar.E))) & 4294967295L);
                } else {
                    jK = (((long) ((int) (jK & 4294967295L))) & 4294967295L) | (((long) ((i6 - ((int) (jK >> 32))) - (z2 ? c3dVar.F : c3dVar.E))) << 32);
                }
            }
            long jD2 = y69.d(jK, this.k);
            if (!z && bz9VarA != null) {
                bz9VarA.m = jD2;
            }
            if (z2) {
                if (ja8Var != null) {
                    b3dVar.getClass();
                    b3d.a(b3dVar, c3dVar);
                    c3dVar.a0(y69.d(jD2, c3dVar.I), MTTypesetterKt.kLineSkipLimitMultiplier, ja8Var);
                } else {
                    b3d.o(b3dVar, c3dVar, jD2, null, 6);
                }
            } else if (ja8Var == null) {
                b3d.m(b3dVar, c3dVar, jD2);
            } else if (b3dVar.d() == fu9.E || b3dVar.e() == 0) {
                b3d.a(b3dVar, c3dVar);
                c3dVar.a0(y69.d(jD2, c3dVar.I), MTTypesetterKt.kLineSkipLimitMultiplier, ja8Var);
            } else {
                b3d.a(b3dVar, c3dVar);
                c3dVar.a0(y69.d((((long) ((b3dVar.e() - c3dVar.E) - ((int) (jD2 >> 32)))) << 32) | (((long) ((int) (jD2 & 4294967295L))) & 4294967295L), c3dVar.I), MTTypesetterKt.kLineSkipLimitMultiplier, ja8Var);
            }
            i2++;
            list2 = list;
        }
    }

    @Override // defpackage.oz9
    public final int c() {
        return 1;
    }

    @Override // defpackage.oz9
    public final int d() {
        return this.b.size();
    }

    @Override // defpackage.oz9
    public final void e(int i, int i2, int i3, int i4) {
        m(i, i3, i4);
    }

    @Override // defpackage.oz9
    public final int f() {
        return this.r;
    }

    @Override // defpackage.oz9
    public final Object g(int i) {
        return ((c3d) this.b.get(i)).z();
    }

    @Override // defpackage.oz9
    public final int getIndex() {
        return this.a;
    }

    @Override // defpackage.oz9
    public final Object getKey() {
        return this.l;
    }

    @Override // defpackage.oz9
    public final long h() {
        return this.o;
    }

    @Override // defpackage.oz9
    public final boolean i() {
        return this.c;
    }

    @Override // defpackage.oz9
    public final void j() {
        this.t = true;
    }

    @Override // defpackage.oz9
    public final long k(int i) {
        if (i == 0 && this.b.size() == 0) {
            int i2 = this.p;
            return this.c ? ((long) i2) & 4294967295L : ((long) i2) << 32;
        }
        int i3 = i * 2;
        int[] iArr = this.x;
        return (((long) iArr[i3 + 1]) & 4294967295L) | (((long) iArr[i3]) << 32);
    }

    @Override // defpackage.oz9
    public final int l() {
        return 0;
    }

    public final void m(int i, int i2, int i3) {
        int i4;
        this.p = i;
        boolean z = this.c;
        this.u = z ? i3 : i2;
        List list = this.b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            c3d c3dVar = (c3d) list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.x;
            if (z) {
                qt qtVar = this.d;
                if (qtVar == null) {
                    throw vb7.x("null horizontalAlignment when isVertical == true");
                }
                iArr[i6] = qtVar.a(c3dVar.E, i2, this.f);
                iArr[i6 + 1] = i;
                i4 = c3dVar.F;
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                wo1 wo1Var = this.e;
                if (wo1Var == null) {
                    throw vb7.x("null verticalAlignment when isVertical == false");
                }
                iArr[i7] = wo1Var.a(c3dVar.F, i3);
                i4 = c3dVar.E;
            }
            i += i4;
        }
        this.v = -this.h;
        this.w = this.u + this.i;
    }
}
