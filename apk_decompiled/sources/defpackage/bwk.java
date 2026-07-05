package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bwk {
    public static final float[] a = {0.6f, 0.85f, 1.0f, 0.9f, 0.7f, 0.55f, 0.4f};
    public static final float[] b = {1.3f, 1.7f, 2.1f, 1.9f, 2.3f, 1.5f, 2.7f};

    public static final void a(iqb iqbVar, fvd fvdVar, ta4 ta4Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-714464401);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(iqbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(fvdVar) ? 32 : 16;
        }
        int i3 = i & 384;
        ta4 ta4Var2 = kkk.a;
        if (i3 == 0) {
            i2 |= e18Var.h(ta4Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.h(ta4Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                lsc lscVar = new lsc(null, ql8.J);
                e18Var.k0(lscVar);
                objN = lscVar;
            }
            hf1 hf1VarB = b(ta4Var2, e18Var, (i2 >> 6) & 14);
            j8.c(fvdVar.a(hf1VarB), fd9.q0(274270255, new fn(iqbVar, (nwb) objN, ta4Var, hf1VarB), e18Var), e18Var, 56);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ji(iqbVar, fvdVar, ta4Var, i);
        }
    }

    public static final hf1 b(ta4 ta4Var, ld4 ld4Var, int i) {
        boolean z = (((i & 14) ^ 6) > 4 && ((e18) ld4Var).f(ta4Var)) || (i & 6) == 4;
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (z || objN == lz1Var) {
            objN = new hf1(ta4Var);
            e18Var.k0(objN);
        }
        hf1 hf1Var = (hf1) objN;
        boolean zF = e18Var.f(hf1Var);
        Object objN2 = e18Var.N();
        if (zF || objN2 == lz1Var) {
            objN2 = new v0(13, hf1Var);
            e18Var.k0(objN2);
        }
        fd9.d(hf1Var, (bz7) objN2, e18Var);
        return hf1Var;
    }

    public static final Object c(Object obj, boolean z) {
        nk9 nk9Var;
        obj.getClass();
        if (z) {
            obj = (jl9) obj;
            if ((obj instanceof il9) && (nk9Var = ((il9) obj).i) != null) {
                String strE = zj9.c(nk9Var.d()).e();
                strE.getClass();
                return new hl9(strE);
            }
        }
        return obj;
    }

    public static int d(int i, int i2) {
        long j = ((long) i) + ((long) i2);
        int i3 = (int) j;
        if (j == ((long) i3)) {
            return i3;
        }
        throw new ArithmeticException(vb7.q("overflow: checkedAdd(", ", ", i, i2, ")"));
    }

    public static final double e(int i, int i2, int i3, int i4, j6f j6fVar) {
        double d = ((double) i3) / ((double) i);
        double d2 = ((double) i4) / ((double) i2);
        int iOrdinal = j6fVar.ordinal();
        if (iOrdinal == 0) {
            return Math.max(d, d2);
        }
        if (iOrdinal == 1) {
            return Math.min(d, d2);
        }
        wg6.i();
        return 0.0d;
    }

    public static long f(long j, ov9 ov9Var) {
        ov9 ov9Var2 = ov9.E;
        return sl4.a(ov9Var == ov9Var2 ? rl4.j(j) : rl4.i(j), ov9Var == ov9Var2 ? rl4.h(j) : rl4.g(j), ov9Var == ov9Var2 ? rl4.i(j) : rl4.j(j), ov9Var == ov9Var2 ? rl4.g(j) : rl4.h(j));
    }

    public static long g(int i, long j) {
        return sl4.a(0, rl4.h(j), (i & 4) != 0 ? rl4.i(j) : 0, rl4.g(j));
    }

    public static int h(int i, int i2) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i2 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 == 0) {
            return i3;
        }
        int i5 = ((i ^ i2) >> 31) | 1;
        switch (v69.a[roundingMode.ordinal()]) {
            case 1:
                zmk.j(i4 == 0);
                return i3;
            case 2:
                return i3;
            case 3:
                if (i5 >= 0) {
                    return i3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i5 <= 0) {
                    return i3;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i4);
                int iAbs2 = iAbs - (Math.abs(i2) - iAbs);
                if (iAbs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i3;
                }
                if (iAbs2 <= 0) {
                    return i3;
                }
                break;
            default:
                mr9.u();
                return 0;
        }
        return i3 + i5;
    }

    public static final lne i(yjh yjhVar, int i) {
        xjh xjhVar = yjhVar.a;
        qtb qtbVar = yjhVar.b;
        if (xjhVar.a.F.length() != 0) {
            int iD = qtbVar.d(i);
            if ((i != 0 && iD == qtbVar.d(i - 1)) || (i != xjhVar.a.F.length() && iD == qtbVar.d(i + 1))) {
                return yjhVar.a(i);
            }
        }
        return yjhVar.i(i);
    }

    public static final long j(long j) {
        return sl4.a(rl4.j(j), rl4.h(j), rl4.i(j), rl4.g(j));
    }
}
