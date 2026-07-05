package defpackage;

import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class oe8 implements bk6 {
    public final vff a;
    public String b;
    public y3i c;
    public ne8 d;
    public boolean e;
    public long l;
    public final boolean[] f = new boolean[3];
    public final a87 g = new a87(32);
    public final a87 h = new a87(33);
    public final a87 i = new a87(34);
    public final a87 j = new a87(39);
    public final a87 k = new a87(40);
    public long m = -9223372036854775807L;
    public final ssc n = new ssc();

    public oe8(vff vffVar) {
        this.a = vffVar;
    }

    public final void a(int i, int i2, long j, long j2) {
        ig0 ig0Var = this.a.d;
        ne8 ne8Var = this.d;
        boolean z = this.e;
        if (ne8Var.j && ne8Var.g) {
            ne8Var.m = ne8Var.c;
            ne8Var.j = false;
        } else if (ne8Var.h || ne8Var.g) {
            if (z && ne8Var.i) {
                ne8Var.a(i + ((int) (j - ne8Var.b)));
            }
            ne8Var.k = ne8Var.b;
            ne8Var.l = ne8Var.e;
            ne8Var.m = ne8Var.c;
            ne8Var.i = true;
        }
        if (!this.e) {
            a87 a87Var = this.g;
            a87Var.b(i2);
            a87 a87Var2 = this.h;
            a87Var2.b(i2);
            a87 a87Var3 = this.i;
            a87Var3.b(i2);
            if (a87Var.c && a87Var2.c && a87Var3.c) {
                String str = this.b;
                int i3 = a87Var.d;
                byte[] bArr = new byte[a87Var2.d + i3 + a87Var3.d];
                System.arraycopy((byte[]) a87Var.e, 0, bArr, 0, i3);
                System.arraycopy((byte[]) a87Var2.e, 0, bArr, a87Var.d, a87Var2.d);
                System.arraycopy((byte[]) a87Var3.e, 0, bArr, a87Var.d + a87Var2.d, a87Var3.d);
                oxb oxbVarZ = stj.z((byte[]) a87Var2.e, 3, a87Var2.d, null);
                mxb mxbVar = oxbVarZ.b;
                String strA = mxbVar != null ? q34.a(mxbVar.a, mxbVar.b, mxbVar.c, mxbVar.d, mxbVar.e, mxbVar.f) : null;
                iw7 iw7Var = new iw7();
                iw7Var.a = str;
                iw7Var.m = gkb.k("video/mp2t");
                iw7Var.n = gkb.k("video/hevc");
                iw7Var.j = strA;
                iw7Var.u = oxbVarZ.e;
                iw7Var.v = oxbVarZ.f;
                iw7Var.w = oxbVarZ.g;
                iw7Var.x = oxbVarZ.h;
                iw7Var.D = new f54(oxbVarZ.k, oxbVarZ.l, oxbVarZ.m, null, oxbVarZ.c + 8, oxbVarZ.d + 8);
                iw7Var.A = oxbVarZ.i;
                iw7Var.p = oxbVarZ.j;
                iw7Var.E = oxbVarZ.a + 1;
                iw7Var.q = Collections.singletonList(bArr);
                jw7 jw7Var = new jw7(iw7Var);
                this.c.g(jw7Var);
                int i4 = jw7Var.q;
                fd9.M(i4 != -1);
                ig0Var.r(i4);
                this.e = true;
            }
        }
        a87 a87Var4 = this.j;
        boolean zB = a87Var4.b(i2);
        ssc sscVar = this.n;
        if (zB) {
            sscVar.K((byte[]) a87Var4.e, stj.G((byte[]) a87Var4.e, a87Var4.d));
            sscVar.N(5);
            ig0Var.d(j2, sscVar);
        }
        a87 a87Var5 = this.k;
        if (a87Var5.b(i2)) {
            sscVar.K((byte[]) a87Var5.e, stj.G((byte[]) a87Var5.e, a87Var5.d));
            sscVar.N(5);
            ig0Var.d(j2, sscVar);
        }
    }

    public final void b(byte[] bArr, int i, int i2) {
        ne8 ne8Var = this.d;
        if (ne8Var.f) {
            int i3 = ne8Var.d;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                ne8Var.g = (bArr[i4] & 128) != 0;
                ne8Var.f = false;
            } else {
                ne8Var.d = (i2 - i) + i3;
            }
        }
        if (!this.e) {
            this.g.a(bArr, i, i2);
            this.h.a(bArr, i, i2);
            this.i.a(bArr, i, i2);
        }
        this.j.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }

    @Override // defpackage.bk6
    public final void c(ssc sscVar) {
        int i;
        this.c.getClass();
        String str = tpi.a;
        while (sscVar.a() > 0) {
            int i2 = sscVar.b;
            int i3 = sscVar.c;
            byte[] bArr = sscVar.a;
            this.l += (long) sscVar.a();
            this.c.e(sscVar.a(), sscVar);
            while (i2 < i3) {
                int iN = stj.n(bArr, i2, i3, this.f);
                if (iN == i3) {
                    b(bArr, i2, i3);
                    return;
                }
                int i4 = (bArr[iN + 3] & 126) >> 1;
                if (iN <= 0 || bArr[iN - 1] != 0) {
                    i = 3;
                } else {
                    iN--;
                    i = 4;
                }
                int i5 = iN;
                int i6 = i;
                int i7 = i5 - i2;
                if (i7 > 0) {
                    b(bArr, i2, i5);
                }
                int i8 = i3 - i5;
                long j = this.l - ((long) i8);
                a(i8, i7 < 0 ? -i7 : 0, j, this.m);
                h(i8, i4, j, this.m);
                i2 = i5 + i6;
            }
        }
    }

    @Override // defpackage.bk6
    public final void d() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        stj.k(this.f);
        this.g.d();
        this.h.d();
        this.i.d();
        this.j.d();
        this.k.d();
        this.a.d.g(0);
        ne8 ne8Var = this.d;
        if (ne8Var != null) {
            ne8Var.f = false;
            ne8Var.g = false;
            ne8Var.h = false;
            ne8Var.i = false;
            ne8Var.j = false;
        }
    }

    @Override // defpackage.bk6
    public final void e(boolean z) {
        this.c.getClass();
        String str = tpi.a;
        if (z) {
            this.a.d.g(0);
            a(0, 0, this.l, this.m);
            h(0, 48, this.l, this.m);
        }
    }

    @Override // defpackage.bk6
    public final void f(yd7 yd7Var, t6f t6fVar) {
        t6fVar.d();
        t6fVar.i();
        this.b = (String) t6fVar.e;
        t6fVar.i();
        y3i y3iVarN = yd7Var.n(t6fVar.c, 2);
        this.c = y3iVarN;
        this.d = new ne8(y3iVarN);
        this.a.b(yd7Var, t6fVar);
    }

    @Override // defpackage.bk6
    public final void g(int i, long j) {
        this.m = j;
    }

    public final void h(int i, int i2, long j, long j2) {
        ne8 ne8Var = this.d;
        boolean z = this.e;
        ne8Var.g = false;
        ne8Var.h = false;
        ne8Var.e = j2;
        ne8Var.d = 0;
        ne8Var.b = j;
        if (i2 >= 32 && i2 != 40) {
            if (ne8Var.i && !ne8Var.j) {
                if (z) {
                    ne8Var.a(i);
                }
                ne8Var.i = false;
            }
            if ((32 <= i2 && i2 <= 35) || i2 == 39) {
                ne8Var.h = !ne8Var.j;
                ne8Var.j = true;
            }
        }
        boolean z2 = i2 >= 16 && i2 <= 21;
        ne8Var.c = z2;
        ne8Var.f = z2 || i2 <= 9;
        if (!this.e) {
            this.g.e(i2);
            this.h.e(i2);
            this.i.e(i2);
        }
        this.j.e(i2);
        this.k.e(i2);
    }
}
