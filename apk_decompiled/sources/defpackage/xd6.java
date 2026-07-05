package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public interface xd6 extends cz5 {
    static /* synthetic */ void C0(xd6 xd6Var, long j, float f, long j2, yd6 yd6Var, int i) {
        if ((i & 4) != 0) {
            j2 = xd6Var.P0();
        }
        long j3 = j2;
        if ((i & 16) != 0) {
            yd6Var = qk7.a;
        }
        xd6Var.V(j, f, j3, yd6Var);
    }

    static /* synthetic */ void I(xd6 xd6Var, w0e w0eVar, float f, long j, int i) {
        if ((i & 2) != 0) {
            f = k8g.d(xd6Var.g()) / 2.0f;
        }
        if ((i & 4) != 0) {
            j = xd6Var.P0();
        }
        xd6Var.z0(w0eVar, f, j);
    }

    static void P(xd6 xd6Var, r20 r20Var, long j, long j2, long j3, float f, hr1 hr1Var, int i, int i2) {
        xd6Var.L0(r20Var, (i2 & 2) != 0 ? 0L : j, j2, (i2 & 16) != 0 ? j2 : j3, (i2 & 32) != 0 ? 1.0f : f, hr1Var, (i2 & 512) != 0 ? 1 : i);
    }

    static void Q0(cv9 cv9Var, ja8 ja8Var, bz7 bz7Var) {
        cv9Var.t(csg.R(cv9Var.E.g()), bz7Var, ja8Var);
    }

    static /* synthetic */ void S0(xd6 xd6Var, jy1 jy1Var, long j, long j2, float f, yd6 yd6Var, hr1 hr1Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        xd6Var.b1(jy1Var, j3, (i2 & 4) != 0 ? h0(xd6Var.g(), j3) : j2, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? qk7.a : yd6Var, (i2 & 32) != 0 ? null : hr1Var, (i2 & 64) != 0 ? 3 : i);
    }

    static /* synthetic */ void Y0(xd6 xd6Var, c40 c40Var, jy1 jy1Var, float f, ksg ksgVar, hr1 hr1Var, int i, int i2) {
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        yd6 yd6Var = ksgVar;
        if ((i2 & 8) != 0) {
            yd6Var = qk7.a;
        }
        yd6 yd6Var2 = yd6Var;
        if ((i2 & 16) != 0) {
            hr1Var = null;
        }
        hr1 hr1Var2 = hr1Var;
        if ((i2 & 32) != 0) {
            i = 3;
        }
        xd6Var.t0(c40Var, jy1Var, f2, yd6Var2, hr1Var2, i);
    }

    static /* synthetic */ void c1(xd6 xd6Var, c40 c40Var, long j, float f, yd6 yd6Var, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 8) != 0) {
            yd6Var = qk7.a;
        }
        xd6Var.i(c40Var, j, f2, yd6Var);
    }

    static /* synthetic */ void e0(xd6 xd6Var, r20 r20Var, long j, float f, hr1 hr1Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i2 & 16) != 0) {
            hr1Var = null;
        }
        hr1 hr1Var2 = hr1Var;
        if ((i2 & 32) != 0) {
            i = 3;
        }
        xd6Var.x(r20Var, j2, f2, hr1Var2, i);
    }

    static long h0(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    static /* synthetic */ void r0(xd6 xd6Var, jy1 jy1Var, long j, long j2, long j3, float f, yd6 yd6Var, hr1 hr1Var, int i, int i2) {
        long j4 = (i2 & 2) != 0 ? 0L : j;
        xd6Var.w0(jy1Var, j4, (i2 & 4) != 0 ? h0(xd6Var.g(), j4) : j2, j3, (i2 & 16) != 0 ? 1.0f : f, (i2 & 32) != 0 ? qk7.a : yd6Var, (i2 & 64) != 0 ? null : hr1Var, (i2 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? 3 : i);
    }

    static /* synthetic */ void y(xd6 xd6Var, long j, long j2, long j3, long j4, yd6 yd6Var, float f, int i) {
        long j5 = (i & 2) != 0 ? 0L : j2;
        xd6Var.p0(j, j5, (i & 4) != 0 ? h0(xd6Var.g(), j5) : j3, j4, (i & 16) != 0 ? qk7.a : yd6Var, (i & 32) != 0 ? 1.0f : f);
    }

    fj0 B0();

    void L0(r20 r20Var, long j, long j2, long j3, float f, hr1 hr1Var, int i);

    void M(long j, long j2, long j3, float f, int i);

    default long P0() {
        return eve.x(B0().w());
    }

    void T0(long j, long j2, long j3, float f, yd6 yd6Var, hr1 hr1Var, int i);

    void V(long j, float f, long j2, yd6 yd6Var);

    void b1(jy1 jy1Var, long j, long j2, float f, yd6 yd6Var, hr1 hr1Var, int i);

    default long g() {
        return B0().w();
    }

    fu9 getLayoutDirection();

    void i(c40 c40Var, long j, float f, yd6 yd6Var);

    void p0(long j, long j2, long j3, long j4, yd6 yd6Var, float f);

    default void t(long j, bz7 bz7Var, ja8 ja8Var) {
        ja8Var.f(this, getLayoutDirection(), j, new g4(this, 7, bz7Var));
    }

    void t0(c40 c40Var, jy1 jy1Var, float f, yd6 yd6Var, hr1 hr1Var, int i);

    void w0(jy1 jy1Var, long j, long j2, long j3, float f, yd6 yd6Var, hr1 hr1Var, int i);

    void x(r20 r20Var, long j, float f, hr1 hr1Var, int i);

    void y0(long j, float f, float f2, long j2, long j3, float f3, ksg ksgVar);

    void z0(w0e w0eVar, float f, long j);
}
