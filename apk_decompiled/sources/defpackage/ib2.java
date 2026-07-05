package defpackage;

import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public final class ib2 implements xd6 {
    public final hb2 E;
    public final fj0 F;
    public v30 G;
    public v30 H;

    public ib2() {
        fz5 fz5Var = nai.f;
        hb2 hb2Var = new hb2();
        hb2Var.a = fz5Var;
        hb2Var.b = fu9.E;
        hb2Var.c = gm6.a;
        hb2Var.d = 0L;
        this.E = hb2Var;
        fj0 fj0Var = new fj0();
        fj0Var.G = this;
        fj0Var.E = new efe(7, fj0Var);
        this.F = fj0Var;
    }

    public static v30 a(ib2 ib2Var, long j, yd6 yd6Var, float f, hr1 hr1Var, int i) {
        v30 v30VarD = ib2Var.d(yd6Var);
        Paint paint = v30VarD.a;
        if (f != 1.0f) {
            j = d54.b(d54.d(j) * f, j);
        }
        if (!d54.c(d4c.m(paint.getColor()), j)) {
            v30VarD.e(j);
        }
        if (v30VarD.c != null) {
            v30VarD.i(null);
        }
        if (!x44.r(v30VarD.d, hr1Var)) {
            v30VarD.f(hr1Var);
        }
        if (v30VarD.b != i) {
            v30VarD.d(i);
        }
        if (paint.isFilterBitmap()) {
            return v30VarD;
        }
        v30VarD.g(1);
        return v30VarD;
    }

    @Override // defpackage.xd6
    public final fj0 B0() {
        return this.F;
    }

    @Override // defpackage.xd6
    public final void L0(r20 r20Var, long j, long j2, long j3, float f, hr1 hr1Var, int i) {
        this.E.c.d(r20Var, j, j2, j3, b(null, qk7.a, f, hr1Var, 3, i));
    }

    @Override // defpackage.xd6
    public final void M(long j, long j2, long j3, float f, int i) {
        fb2 fb2Var = this.E.c;
        v30 v30VarJ = this.H;
        if (v30VarJ == null) {
            v30VarJ = dch.j();
            v30VarJ.m(1);
            this.H = v30VarJ;
        }
        Paint paint = v30VarJ.a;
        if (!d54.c(d4c.m(paint.getColor()), j)) {
            v30VarJ.e(j);
        }
        if (v30VarJ.c != null) {
            v30VarJ.i(null);
        }
        if (!x44.r(v30VarJ.d, null)) {
            v30VarJ.f(null);
        }
        if (v30VarJ.b != 3) {
            v30VarJ.d(3);
        }
        if (paint.getStrokeWidth() != f) {
            v30VarJ.l(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (v30VarJ.a() != i) {
            v30VarJ.j(i);
        }
        if (v30VarJ.b() != 0) {
            v30VarJ.k(0);
        }
        if (!x44.r(v30VarJ.e, null)) {
            v30VarJ.h(null);
        }
        if (!paint.isFilterBitmap()) {
            v30VarJ.g(1);
        }
        fb2Var.h(j2, j3, v30VarJ);
    }

    @Override // defpackage.xd6
    public final void T0(long j, long j2, long j3, float f, yd6 yd6Var, hr1 hr1Var, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.E.c.j(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3), a(this, j, yd6Var, f, hr1Var, i));
    }

    @Override // defpackage.xd6
    public final void V(long j, float f, long j2, yd6 yd6Var) {
        this.E.c.c(f, j2, a(this, j, yd6Var, 1.0f, null, 3));
    }

    public final v30 b(jy1 jy1Var, yd6 yd6Var, float f, hr1 hr1Var, int i, int i2) {
        v30 v30VarD = d(yd6Var);
        Paint paint = v30VarD.a;
        if (jy1Var != null) {
            jy1Var.a(f, g(), v30VarD);
        } else {
            if (v30VarD.c != null) {
                v30VarD.i(null);
            }
            long jM = d4c.m(paint.getColor());
            long j = d54.b;
            if (!d54.c(jM, j)) {
                v30VarD.e(j);
            }
            if (paint.getAlpha() / 255.0f != f) {
                v30VarD.c(f);
            }
        }
        if (!x44.r(v30VarD.d, hr1Var)) {
            v30VarD.f(hr1Var);
        }
        if (v30VarD.b != i) {
            v30VarD.d(i);
        }
        if (paint.isFilterBitmap() == i2) {
            return v30VarD;
        }
        v30VarD.g(i2);
        return v30VarD;
    }

    @Override // defpackage.xd6
    public final void b1(jy1 jy1Var, long j, long j2, float f, yd6 yd6Var, hr1 hr1Var, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.E.c.j(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j2)) + Float.intBitsToFloat(i3), b(jy1Var, yd6Var, f, hr1Var, i, 1));
    }

    public final void c(jy1 jy1Var, long j, long j2, float f, float f2) {
        fb2 fb2Var = this.E.c;
        v30 v30VarJ = this.H;
        if (v30VarJ == null) {
            v30VarJ = dch.j();
            v30VarJ.m(1);
            this.H = v30VarJ;
        }
        Paint paint = v30VarJ.a;
        if (jy1Var != null) {
            jy1Var.a(f2, g(), v30VarJ);
        } else if (paint.getAlpha() / 255.0f != f2) {
            v30VarJ.c(f2);
        }
        if (!x44.r(v30VarJ.d, null)) {
            v30VarJ.f(null);
        }
        if (v30VarJ.b != 3) {
            v30VarJ.d(3);
        }
        if (paint.getStrokeWidth() != f) {
            v30VarJ.l(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (v30VarJ.a() != 0) {
            v30VarJ.j(0);
        }
        if (v30VarJ.b() != 0) {
            v30VarJ.k(0);
        }
        if (!x44.r(v30VarJ.e, null)) {
            v30VarJ.h(null);
        }
        if (!paint.isFilterBitmap()) {
            v30VarJ.g(1);
        }
        fb2Var.h(j, j2, v30VarJ);
    }

    public final v30 d(yd6 yd6Var) {
        if (x44.r(yd6Var, qk7.a)) {
            v30 v30Var = this.G;
            if (v30Var != null) {
                return v30Var;
            }
            v30 v30VarJ = dch.j();
            v30VarJ.m(0);
            this.G = v30VarJ;
            return v30VarJ;
        }
        if (!(yd6Var instanceof ksg)) {
            mr9.b();
            return null;
        }
        v30 v30VarJ2 = this.H;
        if (v30VarJ2 == null) {
            v30VarJ2 = dch.j();
            v30VarJ2.m(1);
            this.H = v30VarJ2;
        }
        Paint paint = v30VarJ2.a;
        float strokeWidth = paint.getStrokeWidth();
        ksg ksgVar = (ksg) yd6Var;
        ruc rucVar = ksgVar.e;
        float f = ksgVar.a;
        if (strokeWidth != f) {
            v30VarJ2.l(f);
        }
        int iA = v30VarJ2.a();
        int i = ksgVar.c;
        if (iA != i) {
            v30VarJ2.j(i);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f2 = ksgVar.b;
        if (strokeMiter != f2) {
            paint.setStrokeMiter(f2);
        }
        int iB = v30VarJ2.b();
        int i2 = ksgVar.d;
        if (iB != i2) {
            v30VarJ2.k(i2);
        }
        if (!x44.r(v30VarJ2.e, rucVar)) {
            v30VarJ2.h(rucVar);
        }
        return v30VarJ2;
    }

    @Override // defpackage.cz5
    public final float getDensity() {
        return this.E.a.getDensity();
    }

    @Override // defpackage.xd6
    public final fu9 getLayoutDirection() {
        return this.E.b;
    }

    @Override // defpackage.xd6
    public final void i(c40 c40Var, long j, float f, yd6 yd6Var) {
        this.E.c.e(c40Var, a(this, j, yd6Var, f, null, 3));
    }

    @Override // defpackage.cz5
    public final float k0() {
        return this.E.a.k0();
    }

    @Override // defpackage.xd6
    public final void p0(long j, long j2, long j3, long j4, yd6 yd6Var, float f) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.E.c.f(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), a(this, j, yd6Var, f, null, 3));
    }

    @Override // defpackage.xd6
    public final void t0(c40 c40Var, jy1 jy1Var, float f, yd6 yd6Var, hr1 hr1Var, int i) {
        this.E.c.e(c40Var, b(jy1Var, yd6Var, f, hr1Var, i, 1));
    }

    @Override // defpackage.xd6
    public final void w0(jy1 jy1Var, long j, long j2, long j3, float f, yd6 yd6Var, hr1 hr1Var, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.E.c.f(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), b(jy1Var, yd6Var, f, hr1Var, i, 1));
    }

    @Override // defpackage.xd6
    public final void x(r20 r20Var, long j, float f, hr1 hr1Var, int i) {
        this.E.c.o(r20Var, j, b(null, qk7.a, f, hr1Var, i, 1));
    }

    @Override // defpackage.xd6
    public final void y0(long j, float f, float f2, long j2, long j3, float f3, ksg ksgVar) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.E.c.t(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), f, f2, a(this, j, ksgVar, f3, null, 3));
    }

    @Override // defpackage.xd6
    public final void z0(w0e w0eVar, float f, long j) {
        this.E.c.c(f, j, b(w0eVar, qk7.a, 1.0f, null, 3, 1));
    }
}
