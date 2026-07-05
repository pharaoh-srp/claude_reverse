package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class nd6 {
    public static final id6 a;
    public static final id6 b;

    static {
        int i = 3;
        tp4 tp4Var = null;
        a = new id6(i, tp4Var, 0);
        b = new id6(i, tp4Var, 1);
    }

    public static iqb a(iqb iqbVar, pd6 pd6Var, ukc ukcVar, boolean z, zub zubVar, boolean z2, rz7 rz7Var, rz7 rz7Var2, boolean z3, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            zubVar = null;
        }
        return iqbVar.B(new hd6(pd6Var, ukcVar, z4, zubVar, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? a : rz7Var, rz7Var2, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? false : z3));
    }

    public static final pd6 b(bz7 bz7Var, ld4 ld4Var, int i) {
        nwb nwbVarZ = mpk.Z(bz7Var, ld4Var);
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        if (objN == jd4.a) {
            xq5 xq5Var = new xq5(new ol5(2, nwbVarZ));
            e18Var.k0(xq5Var);
            objN = xq5Var;
        }
        return (pd6) objN;
    }

    public static final long c(long j) {
        boolean zIsNaN = Float.isNaN(qsi.d(j));
        float fE = MTTypesetterKt.kLineSkipLimitMultiplier;
        float fD = zIsNaN ? 0.0f : qsi.d(j);
        if (!Float.isNaN(qsi.e(j))) {
            fE = qsi.e(j);
        }
        return lvj.e(fD, fE);
    }
}
