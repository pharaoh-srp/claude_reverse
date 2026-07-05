package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class dua {
    public final /* synthetic */ pz7 a;

    public dua(pz7 pz7Var) {
        this.a = pz7Var;
    }

    public final void a(cte cteVar, String str, String str2, ld4 ld4Var, int i) {
        int i2;
        zy7 zy7Var;
        cteVar.getClass();
        str.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-580311379);
        if ((i & 48) == 0) {
            i2 = (e18Var.f(str) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(str2) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.f(this) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var.Q(i2 & 1, (i2 & 1169) != 1168)) {
            pz7 pz7Var = this.a;
            if (pz7Var == null) {
                e18Var.a0(-812732444);
                e18Var.p(false);
                zy7Var = null;
            } else {
                e18Var.a0(-812732443);
                boolean zF = ((i2 & 112) == 32) | e18Var.f(pz7Var) | ((i2 & 896) == 256);
                Object objN = e18Var.N();
                if (zF || objN == jd4.a) {
                    objN = new m24(pz7Var, str, str2, 1);
                    e18Var.k0(objN);
                }
                zy7Var = (zy7) objN;
                e18Var.p(false);
            }
            gjk.f(str, str2, zy7Var, null, e18Var, (i2 >> 3) & 126);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new bg6(this, cteVar, str, str2, i, 8);
        }
    }
}
