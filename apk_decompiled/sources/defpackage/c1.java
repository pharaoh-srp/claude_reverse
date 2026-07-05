package defpackage;

import coil3.compose.AsyncImagePainter;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c1 extends hqb implements vd6, pu9, ujf {
    public tt S;
    public jo4 T;
    public float U;
    public hr1 V;
    public boolean W;
    public String X;
    public ul4 Y;

    public c1(tt ttVar, jo4 jo4Var, float f, hr1 hr1Var, boolean z, String str, ul4 ul4Var) {
        this.S = ttVar;
        this.T = jo4Var;
        this.U = f;
        this.V = hr1Var;
        this.W = z;
        this.X = str;
        this.Y = ul4Var;
    }

    @Override // defpackage.pu9
    public final int A0(fma fmaVar, h5b h5bVar, int i) {
        long jB = sl4.b(0, i, 0, 0, 13);
        ul4 ul4Var = this.Y;
        if (ul4Var != null) {
            ul4Var.f(jB);
        }
        if (q1().getM() == 9205357640488583168L) {
            return h5bVar.Q(i);
        }
        long jR1 = r1(jB);
        return Math.max(rl4.i(jR1), h5bVar.Q(i));
    }

    @Override // defpackage.vd6
    public final void I0(cv9 cv9Var) {
        long j;
        float fIntBitsToFloat;
        ib2 ib2Var = cv9Var.E;
        long jP1 = p1(ib2Var.g());
        long jA = this.S.a(fqi.e(jP1), fqi.e(ib2Var.g()), cv9Var.getLayoutDirection());
        int i = (int) (jA >> 32);
        int i2 = (int) (jA & 4294967295L);
        fj0 fj0Var = ib2Var.F;
        long jW = fj0Var.w();
        fj0Var.p().g();
        try {
            efe efeVar = (efe) fj0Var.E;
            if (this.W) {
                fj0 fj0Var2 = (fj0) efeVar.F;
                int i3 = 31 & 4;
                float fIntBitsToFloat2 = MTTypesetterKt.kLineSkipLimitMultiplier;
                if (i3 != 0) {
                    j = 4294967295L;
                    fIntBitsToFloat = Float.intBitsToFloat((int) (fj0Var2.w() >> 32));
                } else {
                    j = 4294967295L;
                    fIntBitsToFloat = 0.0f;
                }
                if ((31 & 8) != 0) {
                    fIntBitsToFloat2 = Float.intBitsToFloat((int) (fj0Var2.w() & j));
                }
                efeVar.k(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, fIntBitsToFloat, fIntBitsToFloat2, 1);
            }
            efeVar.G(i, i2);
            q1().f(cv9Var, jP1, this.U, this.V);
            fj0Var.p().p();
            fj0Var.N(jW);
            cv9Var.a();
        } catch (Throwable th) {
            grc.y(fj0Var, jW);
            throw th;
        }
    }

    @Override // defpackage.pu9
    public final int N0(fma fmaVar, h5b h5bVar, int i) {
        long jB = sl4.b(0, 0, 0, i, 7);
        ul4 ul4Var = this.Y;
        if (ul4Var != null) {
            ul4Var.f(jB);
        }
        if (q1().getM() == 9205357640488583168L) {
            return h5bVar.l(i);
        }
        long jR1 = r1(jB);
        return Math.max(rl4.j(jR1), h5bVar.l(i));
    }

    @Override // defpackage.ujf
    public final void X0(ekf ekfVar) {
        String str = this.X;
        if (str != null) {
            ckf.l(ekfVar, str);
            ckf.s(ekfVar, 5);
        }
    }

    @Override // defpackage.pu9
    public final p5b b(q5b q5bVar, h5b h5bVar, long j) {
        ul4 ul4Var = this.Y;
        if (ul4Var != null) {
            ul4Var.f(j);
        }
        c3d c3dVarU = h5bVar.u(r1(j));
        return q5bVar.U(c3dVarU.E, c3dVarU.F, nm6.E, new b1(c3dVarU, 0));
    }

    @Override // defpackage.hqb
    public final boolean e1() {
        return false;
    }

    @Override // defpackage.pu9
    public final int h(fma fmaVar, h5b h5bVar, int i) {
        long jB = sl4.b(0, 0, 0, i, 7);
        ul4 ul4Var = this.Y;
        if (ul4Var != null) {
            ul4Var.f(jB);
        }
        if (q1().getM() == 9205357640488583168L) {
            return h5bVar.o(i);
        }
        long jR1 = r1(jB);
        return Math.max(rl4.j(jR1), h5bVar.o(i));
    }

    @Override // defpackage.pu9
    public final int l0(fma fmaVar, h5b h5bVar, int i) {
        long jB = sl4.b(0, i, 0, 0, 13);
        ul4 ul4Var = this.Y;
        if (ul4Var != null) {
            ul4Var.f(jB);
        }
        if (q1().getM() == 9205357640488583168L) {
            return h5bVar.a(i);
        }
        long jR1 = r1(jB);
        return Math.max(rl4.i(jR1), h5bVar.a(i));
    }

    public final long p1(long j) {
        if (k8g.f(j)) {
            return 0L;
        }
        long m = q1().getM();
        if (m != 9205357640488583168L) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (m >> 32));
            if (Math.abs(fIntBitsToFloat) > Float.MAX_VALUE) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            }
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (m & 4294967295L));
            if (Math.abs(fIntBitsToFloat2) > Float.MAX_VALUE) {
                fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            }
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
            long jB = this.T.b(jFloatToRawIntBits, j);
            if (Math.abs(Float.intBitsToFloat((int) (jB >> 32))) <= Float.MAX_VALUE && Math.abs(Float.intBitsToFloat((int) (4294967295L & jB))) <= Float.MAX_VALUE) {
                return gb9.Z(jFloatToRawIntBits, jB);
            }
        }
        return j;
    }

    public abstract bpc q1();

    public final long r1(long j) {
        float fJ;
        int i;
        float fD0;
        boolean zF = rl4.f(j);
        boolean zE = rl4.e(j);
        if (!zF || !zE) {
            bpc bpcVarQ1 = q1();
            boolean z = rl4.d(j) && rl4.c(j);
            long m = bpcVarQ1.getM();
            if (m != 9205357640488583168L) {
                if (z && (zF || zE)) {
                    fJ = rl4.h(j);
                    i = rl4.g(j);
                } else {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (m >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (m & 4294967295L));
                    if (Math.abs(fIntBitsToFloat) <= Float.MAX_VALUE) {
                        int i2 = fqi.b;
                        fJ = wd6.d0(fIntBitsToFloat, rl4.j(j), rl4.h(j));
                    } else {
                        fJ = rl4.j(j);
                    }
                    if (Math.abs(fIntBitsToFloat2) <= Float.MAX_VALUE) {
                        int i3 = fqi.b;
                        fD0 = wd6.d0(fIntBitsToFloat2, rl4.i(j), rl4.g(j));
                        long jP1 = p1((((long) Float.floatToRawIntBits(fD0)) & 4294967295L) | (((long) Float.floatToRawIntBits(fJ)) << 32));
                        return rl4.a(sl4.g(mwa.L(Float.intBitsToFloat((int) (jP1 >> 32))), j), 0, sl4.f(mwa.L(Float.intBitsToFloat((int) (jP1 & 4294967295L))), j), 0, 10, j);
                    }
                    i = rl4.i(j);
                }
                fD0 = i;
                long jP12 = p1((((long) Float.floatToRawIntBits(fD0)) & 4294967295L) | (((long) Float.floatToRawIntBits(fJ)) << 32));
                return rl4.a(sl4.g(mwa.L(Float.intBitsToFloat((int) (jP12 >> 32))), j), 0, sl4.f(mwa.L(Float.intBitsToFloat((int) (jP12 & 4294967295L))), j), 0, 10, j);
            }
            if (z && (!(bpcVarQ1 instanceof AsyncImagePainter) || ((t01) ((AsyncImagePainter) bpcVarQ1).Y.E.getValue()).getPainter() != null)) {
                return rl4.a(rl4.h(j), 0, rl4.g(j), 0, 10, j);
            }
        }
        return j;
    }
}
