package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nq0 {
    public static final void a(tp0 tp0Var, yt0 yt0Var, String str, kg3 kg3Var, iqb iqbVar, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, ld4 ld4Var, int i) {
        int i2;
        iqb iqbVar2;
        tp0Var.getClass();
        yt0Var.getClass();
        str.getClass();
        kg3Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-257594467);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(tp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.d(yt0Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(str) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0 ? e18Var.f(kg3Var) : e18Var.h(kg3Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            iqbVar2 = iqbVar;
            i2 |= e18Var.f(iqbVar2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        } else {
            iqbVar2 = iqbVar;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var.h(zy7Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= e18Var.h(zy7Var2) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= e18Var.h(zy7Var3) ? 8388608 : 4194304;
        }
        if (e18Var.Q(i2 & 1, (4793491 & i2) != 4793490)) {
            tjh.a(tkh.b(((jm3) gm3.c(e18Var).e.E).e, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, 0, 0L, null, 0, 16777214), fd9.q0(-1918022388, new mq0(tp0Var, iqbVar2, kg3Var, yt0Var, str, zy7Var, zy7Var2, zy7Var3, 0), e18Var), e18Var, 48);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new we(tp0Var, yt0Var, str, kg3Var, iqbVar, zy7Var, zy7Var2, zy7Var3, i);
        }
    }
}
