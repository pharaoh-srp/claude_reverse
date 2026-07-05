package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dng {
    public static final u0h a = new u0h(new y1g(14));
    public static final u0h b = new u0h(new y1g(15));
    public static final ksg c = new ksg(3.111f, MTTypesetterKt.kLineSkipLimitMultiplier, 1, 1, null, 18);

    public static final void a(final long j, final float f, final m8f m8fVar, final k8f k8fVar, final iqb iqbVar, final zy7 zy7Var, ld4 ld4Var, final int i) {
        int i2;
        zy7 zy7Var2;
        l8f l8fVar;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1688128060);
        if ((i & 6) == 0) {
            i2 = (e18Var.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.c(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.d(m8fVar.ordinal()) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.d(k8fVar.ordinal()) ? 2048 : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.f(iqbVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            zy7Var2 = zy7Var;
            i2 |= e18Var.h(zy7Var2) ? 131072 : 65536;
        } else {
            zy7Var2 = zy7Var;
        }
        if (e18Var.Q(i2 & 1, (74899 & i2) != 74898)) {
            int iOrdinal = m8fVar.ordinal();
            if (iOrdinal == 0) {
                l8fVar = (l8f) a.getValue();
            } else {
                if (iOrdinal != 1) {
                    wg6.i();
                    return;
                }
                l8fVar = (l8f) b.getValue();
            }
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = f40.a();
                e18Var.k0(objN);
            }
            final c40 c40Var = (c40) objN;
            iqb iqbVarO = b.o(iqbVar, f);
            boolean zH = ((i2 & 458752) == 131072) | ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 7168) == 2048) | e18Var.h(l8fVar) | e18Var.h(c40Var);
            Object objN2 = e18Var.N();
            if (zH || objN2 == lz1Var) {
                final zy7 zy7Var3 = zy7Var2;
                final l8f l8fVar2 = l8fVar;
                bz7 bz7Var = new bz7() { // from class: cng
                    @Override // defpackage.bz7
                    public final Object invoke(Object obj) {
                        k8f k8fVar2 = k8fVar;
                        xd6 xd6Var = (xd6) obj;
                        xd6Var.getClass();
                        float fQ0 = xd6Var.q0(f) / 56.0f;
                        fj0 fj0VarB0 = xd6Var.B0();
                        long jW = fj0VarB0.w();
                        fj0VarB0.p().g();
                        try {
                            ((efe) fj0VarB0.E).C(0L, fQ0, fQ0);
                            int iOrdinal2 = k8fVar2.ordinal();
                            l8f l8fVar3 = l8fVar2;
                            c40 c40Var2 = c40Var;
                            long j2 = j;
                            zy7 zy7Var4 = zy7Var3;
                            if (iOrdinal2 == 0) {
                                dng.c(xd6Var, l8fVar3, c40Var2, j2, MTTypesetterKt.kLineSkipLimitMultiplier, wd6.d0(((Number) zy7Var4.a()).floatValue(), MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f));
                            } else {
                                if (iOrdinal2 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                float fFloatValue = ((Number) zy7Var4.a()).floatValue();
                                float f2 = 0.4f + fFloatValue;
                                dng.c(xd6Var, l8fVar3, c40Var2, j2, fFloatValue, Math.min(f2, 1.0f));
                                if (f2 > 1.0f) {
                                    dng.c(xd6Var, l8fVar3, c40Var2, j2, MTTypesetterKt.kLineSkipLimitMultiplier, f2 - 1.0f);
                                }
                            }
                            grc.y(fj0VarB0, jW);
                            return iei.a;
                        } catch (Throwable th) {
                            grc.y(fj0VarB0, jW);
                            throw th;
                        }
                    }
                };
                e18Var.k0(bz7Var);
                objN2 = bz7Var;
            }
            v40.a(0, e18Var, (bz7) objN2, iqbVarO);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: ang
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    dng.a(j, f, m8fVar, k8fVar, iqbVar, zy7Var, (ld4) obj, x44.p0(i | 1));
                    return iei.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(long r17, defpackage.iqb r19, float r20, defpackage.m8f r21, defpackage.zy7 r22, defpackage.ld4 r23, int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dng.b(long, iqb, float, m8f, zy7, ld4, int, int):void");
    }

    public static final void c(xd6 xd6Var, l8f l8fVar, c40 c40Var, long j, float f, float f2) {
        if (f2 <= f) {
            return;
        }
        c40Var.i();
        e40 e40Var = l8fVar.a;
        float f3 = l8fVar.b;
        e40Var.b(f * f3, f2 * f3, c40Var);
        xd6.c1(xd6Var, c40Var, j, MTTypesetterKt.kLineSkipLimitMultiplier, c, 52);
    }
}
