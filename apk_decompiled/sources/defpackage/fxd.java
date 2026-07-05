package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class fxd {
    public static final /* synthetic */ int a = 0;

    static {
        int i = mca.a;
    }

    public static final void a(final to7 to7Var, final long j, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1353562852);
        int i2 = (e18Var.f(to7Var) ? 4 : 2) | i | (e18Var.e(j) ? 32 : 16);
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            Object obj = objN;
            if (objN == lz1Var) {
                c40 c40VarA = f40.a();
                c40VarA.k(1);
                e18Var.k0(c40VarA);
                obj = c40VarA;
            }
            final c40 c40Var = (c40) obj;
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = mpk.w(new dg8(24, to7Var));
                e18Var.k0(objN2);
            }
            final wlg wlgVarB = n80.b(((Number) ((wlg) objN2).getValue()).floatValue(), u00.P(asb.G, e18Var), null, e18Var, 0, 28);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objN3 = e18Var.N();
            if (z || objN3 == lz1Var) {
                objN3 = new tz9(16, to7Var);
                e18Var.k0(objN3);
            }
            iqb iqbVarO = b.o(tjf.a(fqb.E, (bz7) objN3), 16.0f);
            boolean zF = e18Var.f(wlgVarB) | (i3 == 4) | ((i2 & 112) == 32) | e18Var.h(c40Var);
            Object objN4 = e18Var.N();
            if (zF || objN4 == lz1Var) {
                bz7 bz7Var = new bz7() { // from class: exd
                    @Override // defpackage.bz7
                    public final Object invoke(Object obj2) throws Throwable {
                        long j2;
                        long j3 = j;
                        c40 c40Var2 = c40Var;
                        xd6 xd6Var = (xd6) obj2;
                        float fA = to7Var.a();
                        float fMax = (Math.max(Math.min(1.0f, fA) - 0.4f, MTTypesetterKt.kLineSkipLimitMultiplier) * 5.0f) / 3.0f;
                        float fD0 = wd6.d0(Math.abs(fA) - 1.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2.0f);
                        float fPow = (((0.4f * fMax) - 0.25f) + (fD0 - (((float) Math.pow(fD0, 2.0d)) / 4.0f))) * 0.5f;
                        sp0 sp0Var = new sp0(fPow, fPow * 360.0f, ((0.8f * fMax) + fPow) * 360.0f, Math.min(1.0f, fMax), 0);
                        float fFloatValue = ((Number) wlgVarB.getValue()).floatValue();
                        float fD = sp0Var.d();
                        long jP0 = xd6Var.P0();
                        fj0 fj0VarB0 = xd6Var.B0();
                        long jW = fj0VarB0.w();
                        fj0VarB0.p().g();
                        try {
                            ((efe) fj0VarB0.E).B(fD, jP0);
                            l9e l9eVarW = d4c.w((xd6Var.q0(2.5f) / 2.0f) + xd6Var.q0(5.5f), eve.x(xd6Var.g()));
                            j2 = jW;
                            try {
                                xd6Var.y0(j3, sp0Var.f(), sp0Var.c() - sp0Var.f(), l9eVarW.h(), l9eVarW.g(), (832 & 64) != 0 ? 1.0f : fFloatValue, new ksg(xd6Var.q0(2.5f), MTTypesetterKt.kLineSkipLimitMultiplier, 0, 0, null, 26));
                                fxd.c(xd6Var, c40Var2, l9eVarW, j3, fFloatValue, sp0Var);
                                grc.y(fj0VarB0, j2);
                                return iei.a;
                            } catch (Throwable th) {
                                th = th;
                                grc.y(fj0VarB0, j2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            j2 = jW;
                        }
                    }
                };
                e18Var.k0(bz7Var);
                objN4 = bz7Var;
            }
            v40.a(0, e18Var, (bz7) objN4, iqbVarO);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new jg6(to7Var, j, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final boolean r16, final defpackage.zy7 r17, final defpackage.iqb r18, defpackage.mxd r19, defpackage.tt r20, defpackage.rz7 r21, boolean r22, float r23, final defpackage.ta4 r24, defpackage.ld4 r25, final int r26, final int r27) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fxd.b(boolean, zy7, iqb, mxd, tt, rz7, boolean, float, ta4, ld4, int, int):void");
    }

    public static final void c(xd6 xd6Var, c40 c40Var, l9e l9eVar, long j, float f, sp0 sp0Var) {
        c40Var.i();
        c40Var.g(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier);
        c40Var.f((sp0Var.e() * xd6Var.q0(10.0f)) / 2.0f, sp0Var.e() * xd6Var.q0(5.0f));
        c40Var.f(sp0Var.e() * xd6Var.q0(10.0f), MTTypesetterKt.kLineSkipLimitMultiplier);
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (l9eVar.f() >> 32)) + (Math.min(l9eVar.c - l9eVar.a, l9eVar.d - l9eVar.b) / 2.0f)) - ((sp0Var.e() * xd6Var.q0(10.0f)) / 2.0f);
        c40Var.l((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (l9eVar.f() & 4294967295L)) - xd6Var.q0(2.5f))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
        float fC = sp0Var.c() - xd6Var.q0(2.5f);
        long jP0 = xd6Var.P0();
        fj0 fj0VarB0 = xd6Var.B0();
        long jW = fj0VarB0.w();
        fj0VarB0.p().g();
        try {
            ((efe) fj0VarB0.E).B(fC, jP0);
            xd6.c1(xd6Var, c40Var, j, f, new ksg(xd6Var.q0(2.5f), MTTypesetterKt.kLineSkipLimitMultiplier, 0, 0, null, 30), 48);
        } finally {
            grc.y(fj0VarB0, jW);
        }
    }

    public static final mxd d(ld4 ld4Var) {
        Object[] objArr = new Object[0];
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        if (objN == jd4.a) {
            objN = new zcd(1);
            e18Var.k0(objN);
        }
        return (mxd) iuj.K(objArr, mxd.b, (zy7) objN, e18Var, 384);
    }
}
