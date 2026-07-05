package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class lt9 implements kwa {
    public final xta a;

    public lt9(xta xtaVar) {
        this.a = xtaVar;
    }

    @Override // defpackage.kwa
    public final void a(String str, ld4 ld4Var, int i) {
        str.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1110106512);
        int i2 = (e18Var.f(str) ? 4 : 2) | i | (e18Var.f(this) ? 32 : 16);
        if (!e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            e18Var.T();
        } else if (((Boolean) this.a.a.getValue()).booleanValue()) {
            e18Var.a0(-65006271);
            ht9.b(str, null, false, false, 0L, 0, 0L, e18Var, i2 & 14, 254);
            e18Var.p(false);
        } else {
            e18Var.a0(-64951339);
            js5.a.a(str, e18Var, (i2 & 14) | 48);
            e18Var.p(false);
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new um5(i, 27, this, str);
        }
    }

    @Override // defpackage.kwa
    public final String b(String str) {
        str.getClass();
        return ((Boolean) this.a.a.getValue()).booleanValue() ? ht9.c(str) : str;
    }

    @Override // defpackage.kwa
    public final void c(int i, ld4 ld4Var, String str, boolean z) {
        str.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(321563585);
        int i2 = (e18Var.f(str) ? 4 : 2) | i | (e18Var.g(z) ? 32 : 16) | (e18Var.f(this) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (!e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            e18Var.T();
        } else if (((Boolean) this.a.a.getValue()).booleanValue()) {
            e18Var.a0(1923804458);
            ht9.b(str, gb9.L(b.c(fqb.E, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 1), true, z, 0L, 0, 0L, e18Var, (i2 & 14) | 432 | ((i2 << 6) & 7168), 240);
            e18Var.p(false);
        } else {
            e18Var.a0(1924059929);
            js5.a.c((i2 & 112) | (i2 & 14) | 384, e18Var, str, z);
            e18Var.p(false);
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new iv(this, str, z, i, 19);
        }
    }
}
