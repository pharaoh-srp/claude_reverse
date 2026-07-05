package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vd2 {
    public static final /* synthetic */ wn9[] a = {jce.a.d(new awb(vd2.class, "previousHashCode", "<v#0>"))};
    public static final z8i b = kxk.N(500, 0, null, 6);

    public static final void a(UUID uuid, boolean z, zy7 zy7Var, ld4 ld4Var, int i) {
        int i2;
        boolean z2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1399308086);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(uuid) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.g(true) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.h(zy7Var) ? 2048 : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            lz1 lz1Var = jd4.a;
            if (z) {
                e18Var.a0(-165246812);
                c45 c45VarB = b(true);
                z2 = (i2 & 7168) == 2048;
                Object objN = e18Var.N();
                if (z2 || objN == lz1Var) {
                    objN = new es0(zy7Var, null, 3);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
            } else {
                e18Var.a0(-165164631);
                Boolean bool = Boolean.TRUE;
                z2 = (i2 & 7168) == 2048;
                Object objN2 = e18Var.N();
                if (z2 || objN2 == lz1Var) {
                    objN2 = new rd2(zy7Var, null, 0);
                    e18Var.k0(objN2);
                }
                fd9.j(uuid, bool, (pz7) objN2, e18Var);
                e18Var.p(false);
            }
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ds0(uuid, z, zy7Var, i, 3);
        }
    }

    public static final c45 b(boolean z) {
        if (!z) {
            return im6.E;
        }
        wdi wdiVar = g86.b;
        bed bedVar = bed.F;
        wdiVar.getClass();
        return nai.Z(wdiVar, bedVar);
    }
}
