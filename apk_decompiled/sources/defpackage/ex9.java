package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ex9 implements oz9 {
    public final int a;
    public final Object b;
    public final int c;
    public final fu9 d;
    public final int e;
    public final int f;
    public final List g;
    public final long h;
    public final Object i;
    public final hz9 j;
    public final long k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public int p = Integer.MIN_VALUE;
    public int q;
    public int r;
    public final long s;
    public long t;
    public int u;
    public int v;
    public boolean w;

    public ex9(int i, Object obj, int i2, int i3, fu9 fu9Var, int i4, int i5, List list, long j, Object obj2, hz9 hz9Var, long j2, int i6, int i7) {
        this.a = i;
        this.b = obj;
        this.c = i2;
        this.d = fu9Var;
        this.e = i4;
        this.f = i5;
        this.g = list;
        this.h = j;
        this.i = obj2;
        this.j = hz9Var;
        this.k = j2;
        this.l = i6;
        this.m = i7;
        int size = list.size();
        int iMax = 0;
        for (int i8 = 0; i8 < size; i8++) {
            iMax = Math.max(iMax, ((c3d) list.get(i8)).F);
        }
        this.n = iMax;
        int i9 = i3 + iMax;
        this.o = i9 >= 0 ? i9 : 0;
        this.s = (((long) this.c) << 32) | (((long) iMax) & 4294967295L);
        this.t = 0L;
        this.u = -1;
        this.v = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(b3d b3dVar, boolean z) {
        if (this.p == Integer.MIN_VALUE) {
            e39.a("position() should be called first");
        }
        List list = this.g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            c3d c3dVar = (c3d) list.get(i);
            int i2 = this.q - c3dVar.F;
            int i3 = this.r;
            long j = this.t;
            bz9 bz9VarA = this.j.a(i, this.b);
            ja8 ja8Var = null;
            Object[] objArr = 0;
            if (bz9VarA != null) {
                if (z) {
                    bz9VarA.r = j;
                } else {
                    long jD = y69.d(!y69.b(bz9VarA.r, 9223372034707292159L) ? bz9VarA.r : j, ((y69) bz9VarA.q.getValue()).a);
                    int i4 = (int) (j & 4294967295L);
                    if (((i4 <= i2 && ((int) (jD & 4294967295L)) <= i2) || (i4 >= i3 && ((int) (jD & 4294967295L)) >= i3)) && ((Boolean) bz9VarA.h.getValue()).booleanValue()) {
                        gb9.D(bz9VarA.a, null, null, new zy9(bz9VarA, objArr == true ? 1 : 0, 1), 3);
                    }
                    j = jD;
                }
                ja8Var = bz9VarA.n;
            }
            long jD2 = y69.d(j, this.h);
            if (!z && bz9VarA != null) {
                bz9VarA.m = jD2;
            }
            if (ja8Var != null) {
                b3dVar.getClass();
                b3d.a(b3dVar, c3dVar);
                c3dVar.a0(y69.d(jD2, c3dVar.I), MTTypesetterKt.kLineSkipLimitMultiplier, ja8Var);
            } else {
                b3d.o(b3dVar, c3dVar, jD2, null, 6);
            }
        }
    }

    public final void b(int i, int i2, int i3, int i4, int i5, int i6) {
        this.p = i4;
        if (this.d == fu9.F) {
            i2 = (i3 - i2) - this.c;
        }
        this.t = (((long) i2) << 32) | (((long) i) & 4294967295L);
        this.u = i5;
        this.v = i6;
        this.q = -this.e;
        this.r = i4 + this.f;
    }

    @Override // defpackage.oz9
    public final int c() {
        return this.m;
    }

    @Override // defpackage.oz9
    public final int d() {
        return this.g.size();
    }

    @Override // defpackage.oz9
    public final void e(int i, int i2, int i3, int i4) {
        b(i, i2, i3, i4, -1, -1);
    }

    @Override // defpackage.oz9
    public final int f() {
        return this.o;
    }

    @Override // defpackage.oz9
    public final Object g(int i) {
        return ((c3d) this.g.get(i)).z();
    }

    @Override // defpackage.oz9
    public final int getIndex() {
        return this.a;
    }

    @Override // defpackage.oz9
    public final Object getKey() {
        return this.b;
    }

    @Override // defpackage.oz9
    public final long h() {
        return this.k;
    }

    @Override // defpackage.oz9
    public final boolean i() {
        return true;
    }

    @Override // defpackage.oz9
    public final void j() {
        this.w = true;
    }

    @Override // defpackage.oz9
    public final long k(int i) {
        return this.t;
    }

    @Override // defpackage.oz9
    public final int l() {
        return this.l;
    }
}
