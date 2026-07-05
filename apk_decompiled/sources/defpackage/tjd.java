package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class tjd {
    public static final ad5 a = csb.a;
    public static final ad5 b = csb.c;

    /* JADX WARN: Removed duplicated region for block: B:106:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.iqb r28, long r29, float r31, long r32, int r34, float r35, defpackage.ld4 r36, final int r37, final int r38) {
        /*
            Method dump skipped, instruction units count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tjd.a(iqb, long, float, long, int, float, ld4, int, int):void");
    }

    public static final void b(final zy7 zy7Var, final iqb iqbVar, final long j, final float f, final long j2, int i, float f2, ld4 ld4Var, final int i2) {
        int i3;
        final int i4;
        final float f3;
        float f4;
        int i5;
        Object obj;
        iqb iqbVar2;
        int i6;
        final float f5;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1798883595);
        if ((i2 & 6) == 0) {
            i3 = (e18Var.h(zy7Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= e18Var.e(j) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i2 & 3072) == 0) {
            i3 |= e18Var.c(f) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i2 & 24576) == 0) {
            i3 |= e18Var.e(j2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        int i7 = i3 | 1769472;
        if (e18Var.Q(i7 & 1, (599187 & i7) != 599186)) {
            e18Var.V();
            if ((i2 & 1) == 0 || e18Var.A()) {
                f4 = 4.0f;
                i5 = 1;
            } else {
                e18Var.T();
                i5 = i;
                f4 = f2;
            }
            e18Var.q();
            boolean z = (i7 & 14) == 4;
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (z || objN == lz1Var) {
                objN = new kl1(19, zy7Var);
                e18Var.k0(objN);
            }
            final zy7 zy7Var2 = (zy7) objN;
            final ksg ksgVar = new ksg(((cz5) e18Var.j(ve4.h)).q0(f), MTTypesetterKt.kLineSkipLimitMultiplier, i5, 0, null, 26);
            boolean zF = e18Var.f(zy7Var2);
            Object objN2 = e18Var.N();
            if (zF || objN2 == lz1Var) {
                objN2 = new kw0(14, zy7Var2);
                e18Var.k0(objN2);
            }
            iqb iqbVarO = b.o(tjf.b(iqbVar, true, (bz7) objN2), 40.0f);
            boolean zF2 = ((i7 & 458752) == 131072) | e18Var.f(zy7Var2) | ((3670016 & i7) == 1048576) | ((i7 & 7168) == 2048) | ((((57344 & i7) ^ 24576) > 16384 && e18Var.e(j2)) || (i7 & 24576) == 16384) | e18Var.h(ksgVar) | ((((i7 & 896) ^ 384) > 256 && e18Var.e(j)) || (i7 & 384) == 256);
            Object objN3 = e18Var.N();
            if (zF2 || objN3 == lz1Var) {
                iqbVar2 = iqbVarO;
                i6 = 0;
                f5 = f4;
                final int i8 = i5;
                obj = new bz7() { // from class: rjd
                    @Override // defpackage.bz7
                    public final Object invoke(Object obj2) {
                        xd6 xd6Var = (xd6) obj2;
                        float fFloatValue = ((Number) zy7Var2.a()).floatValue() * 360.0f;
                        int i9 = i8;
                        float f6 = f5;
                        if (i9 != 0 && Float.intBitsToFloat((int) (xd6Var.g() & 4294967295L)) <= Float.intBitsToFloat((int) (xd6Var.g() >> 32))) {
                            f6 += f;
                        }
                        float fG0 = (f6 / ((float) (((double) xd6Var.g0(Float.intBitsToFloat((int) (xd6Var.g() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fMin = Math.min(fFloatValue, fG0) + 270.0f + fFloatValue;
                        float fMin2 = (360.0f - fFloatValue) - (Math.min(fFloatValue, fG0) * 2.0f);
                        long j3 = j2;
                        ksg ksgVar2 = ksgVar;
                        tjd.d(xd6Var, fMin, fMin2, j3, ksgVar2);
                        tjd.d(xd6Var, 270.0f, fFloatValue, j, ksgVar2);
                        return iei.a;
                    }
                };
                e18Var.k0(obj);
            } else {
                obj = objN3;
                f5 = f4;
                iqbVar2 = iqbVarO;
                i6 = 0;
            }
            v40.a(i6, e18Var, (bz7) obj, iqbVar2);
            f3 = f5;
            i4 = i5;
        } else {
            e18Var.T();
            i4 = i;
            f3 = f2;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: sjd
                @Override // defpackage.pz7
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    tjd.b(zy7Var, iqbVar, j, f, j2, i4, f3, (ld4) obj2, x44.p0(i2 | 1));
                    return iei.a;
                }
            };
        }
    }

    public static final void c(iqb iqbVar, long j, final long j2, int i, float f, ld4 ld4Var, final int i2) {
        iqb iqbVar2;
        final long j3;
        final int i3;
        final float f2;
        int i4;
        long jD;
        final float f3;
        final int i5;
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(MTTypesetterKt.kLineSkipLimitMultiplier);
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(567589233);
        int i6 = i2 | 27664;
        if (e18Var.Q(i6 & 1, (i6 & 9363) != 9362)) {
            e18Var.V();
            if ((i2 & 1) == 0 || e18Var.A()) {
                i4 = 1;
                jD = p54.d(ovj.e(), e18Var);
                f3 = 4.0f;
            } else {
                e18Var.T();
                jD = j;
                i4 = i;
                f3 = f;
            }
            e18Var.q();
            b29 b29VarR = gb9.R(null, e18Var, 1);
            wp9 wp9Var = new wp9();
            wp9Var.a = 1750;
            vp9 vp9VarA = wp9Var.a(fValueOf2, 0);
            ad5 ad5Var = a;
            vp9VarA.b = ad5Var;
            wp9Var.a(fValueOf, 1000);
            final long j4 = jD;
            final z19 z19VarJ = gb9.j(b29VarR, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f, kxk.z(new xp9(wp9Var), null, 6), null, e18Var, 4536, 8);
            wp9 wp9Var2 = new wp9();
            wp9Var2.a = 1750;
            wp9Var2.a(fValueOf2, 250).b = ad5Var;
            wp9Var2.a(fValueOf, 1250);
            final z19 z19VarJ2 = gb9.j(b29VarR, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f, kxk.z(new xp9(wp9Var2), null, 6), null, e18Var, 4536, 8);
            wp9 wp9Var3 = new wp9();
            wp9Var3.a = 1750;
            wp9Var3.a(fValueOf2, 650).b = ad5Var;
            wp9Var3.a(fValueOf, 1500);
            final z19 z19VarJ3 = gb9.j(b29VarR, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f, kxk.z(new xp9(wp9Var3), null, 6), null, e18Var, 4536, 8);
            wp9 wp9Var4 = new wp9();
            wp9Var4.a = 1750;
            wp9Var4.a(fValueOf2, 900).b = ad5Var;
            wp9Var4.a(fValueOf, 1750);
            final z19 z19VarJ4 = gb9.j(b29VarR, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f, kxk.z(new xp9(wp9Var4), null, 6), null, e18Var, 4536, 8);
            iqbVar2 = iqbVar;
            iqb iqbVarQ = b.q(tjf.b(iqbVar2.B(s6.a()), true, new f9c(21)), 240.0f, 4.0f);
            boolean zF = e18Var.f(z19VarJ) | e18Var.f(z19VarJ2) | e18Var.e(j4) | e18Var.f(z19VarJ3) | e18Var.f(z19VarJ4);
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                i5 = i4;
                bz7 bz7Var = new bz7() { // from class: njd
                    @Override // defpackage.bz7
                    public final Object invoke(Object obj) {
                        long j5;
                        xd6 xd6Var = (xd6) obj;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (xd6Var.g() & 4294967295L));
                        int i7 = i5;
                        float fG0 = f3;
                        if (i7 != 0 && Float.intBitsToFloat((int) (4294967295L & xd6Var.g())) <= Float.intBitsToFloat((int) (xd6Var.g() >> 32))) {
                            fG0 += xd6Var.g0(fIntBitsToFloat);
                        }
                        float fG02 = fG0 / xd6Var.g0(Float.intBitsToFloat((int) (xd6Var.g() >> 32)));
                        wlg wlgVar = z19VarJ;
                        float fFloatValue = ((Number) wlgVar.getValue()).floatValue();
                        float f4 = 1.0f - fG02;
                        long j6 = j2;
                        if (fFloatValue < f4) {
                            tjd.e(xd6Var, ((Number) wlgVar.getValue()).floatValue() > MTTypesetterKt.kLineSkipLimitMultiplier ? ((Number) wlgVar.getValue()).floatValue() + fG02 : 0.0f, 1.0f, j6, fIntBitsToFloat, i7);
                        }
                        long j7 = j6;
                        float fFloatValue2 = ((Number) wlgVar.getValue()).floatValue();
                        wlg wlgVar2 = z19VarJ2;
                        float fFloatValue3 = fFloatValue2 - ((Number) wlgVar2.getValue()).floatValue();
                        long j8 = j4;
                        if (fFloatValue3 > MTTypesetterKt.kLineSkipLimitMultiplier) {
                            tjd.e(xd6Var, ((Number) wlgVar.getValue()).floatValue(), ((Number) wlgVar2.getValue()).floatValue(), j8, fIntBitsToFloat, i7);
                            j5 = j8;
                        } else {
                            j5 = j8;
                        }
                        float fFloatValue4 = ((Number) wlgVar2.getValue()).floatValue();
                        wlg wlgVar3 = z19VarJ3;
                        if (fFloatValue4 > fG02) {
                            tjd.e(xd6Var, ((Number) wlgVar3.getValue()).floatValue() > MTTypesetterKt.kLineSkipLimitMultiplier ? ((Number) wlgVar3.getValue()).floatValue() + fG02 : 0.0f, ((Number) wlgVar2.getValue()).floatValue() < 1.0f ? ((Number) wlgVar2.getValue()).floatValue() - fG02 : 1.0f, j7, fIntBitsToFloat, i7);
                            j7 = j7;
                        }
                        float fFloatValue5 = ((Number) wlgVar3.getValue()).floatValue();
                        wlg wlgVar4 = z19VarJ4;
                        if (fFloatValue5 - ((Number) wlgVar4.getValue()).floatValue() > MTTypesetterKt.kLineSkipLimitMultiplier) {
                            tjd.e(xd6Var, ((Number) wlgVar3.getValue()).floatValue(), ((Number) wlgVar4.getValue()).floatValue(), j5, fIntBitsToFloat, i7);
                            xd6Var = xd6Var;
                            fIntBitsToFloat = fIntBitsToFloat;
                        }
                        if (((Number) wlgVar4.getValue()).floatValue() > fG02) {
                            tjd.e(xd6Var, MTTypesetterKt.kLineSkipLimitMultiplier, ((Number) wlgVar4.getValue()).floatValue() < 1.0f ? ((Number) wlgVar4.getValue()).floatValue() - fG02 : 1.0f, j7, fIntBitsToFloat, i7);
                        }
                        return iei.a;
                    }
                };
                e18Var.k0(bz7Var);
                objN = bz7Var;
            } else {
                i5 = i4;
            }
            v40.a(0, e18Var, (bz7) objN, iqbVarQ);
            j3 = j4;
            i3 = i5;
            f2 = f3;
        } else {
            iqbVar2 = iqbVar;
            e18Var.T();
            j3 = j;
            i3 = i;
            f2 = f;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            final iqb iqbVar3 = iqbVar2;
            r7eVarS.d = new pz7(j3, j2, i3, f2, i2) { // from class: ojd
                public final /* synthetic */ long F;
                public final /* synthetic */ long G;
                public final /* synthetic */ int H;
                public final /* synthetic */ float I;

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(391);
                    tjd.c(this.E, this.F, this.G, this.H, this.I, (ld4) obj, iP0);
                    return iei.a;
                }
            };
        }
    }

    public static final void d(xd6 xd6Var, float f, float f2, long j, ksg ksgVar) {
        float f3 = ksgVar.a / 2.0f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (xd6Var.g() >> 32)) - (2.0f * f3);
        xd6Var.y0(j, f, f2, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (832 & 64) != 0 ? 1.0f : MTTypesetterKt.kLineSkipLimitMultiplier, ksgVar);
    }

    public static final void e(xd6 xd6Var, float f, float f2, long j, float f3, int i) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (xd6Var.g() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (xd6Var.g() & 4294967295L));
        float f4 = fIntBitsToFloat2 / 2.0f;
        boolean z = xd6Var.getLayoutDirection() == fu9.E;
        float f5 = (z ? f : 1.0f - f2) * fIntBitsToFloat;
        float f6 = (z ? f2 : 1.0f - f) * fIntBitsToFloat;
        if (i == 0 || fIntBitsToFloat2 > fIntBitsToFloat) {
            xd6Var.M(j, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (504 & 8) != 0 ? 0.0f : f3, (504 & 16) != 0 ? 0 : 0);
            return;
        }
        float f7 = f3 / 2.0f;
        float f8 = fIntBitsToFloat - f7;
        if (f5 < f7) {
            f5 = f7;
        }
        if (f5 > f8) {
            f5 = f8;
        }
        if (f6 < f7) {
            f6 = f7;
        }
        if (f6 <= f8) {
            f8 = f6;
        }
        if (Math.abs(f2 - f) > MTTypesetterKt.kLineSkipLimitMultiplier) {
            xd6Var.M(j, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (504 & 8) != 0 ? 0.0f : f3, (504 & 16) != 0 ? 0 : i);
        }
    }
}
