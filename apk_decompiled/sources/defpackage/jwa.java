package defpackage;

import androidx.compose.material3.d;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class jwa {
    public static final umg a;

    static {
        yb5.x(new rpa(8));
        a = new umg(new rpa(9));
    }

    public static final void a(n54 n54Var, zrb zrbVar, j1g j1gVar, zbi zbiVar, pz7 pz7Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(904511636);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(n54Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(zrbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(j1gVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.f(zbiVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.h(pz7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        int i3 = 0;
        if (e18Var.Q(i2 & 1, (i2 & 9363) != 9362)) {
            e18Var.V();
            if ((i & 1) != 0 && !e18Var.A()) {
                e18Var.T();
            }
            e18Var.q();
            gwa gwaVar = new gwa(n54Var, zbiVar, j1gVar, zrbVar);
            d dVarA = due.a(false, MTTypesetterKt.kLineSkipLimitMultiplier, 0L, null, false, 255);
            long j = n54Var.a;
            boolean zE = e18Var.e(j);
            Object objN = e18Var.N();
            if (zE || objN == jd4.a) {
                objN = new nkh(j, d54.b(0.4f, j));
                e18Var.k0(objN);
            }
            j8.d(new hvd[]{a.a(gwaVar), d19.a.a(dVarA), okh.a.a((nkh) objN)}, fd9.q0(-1750539308, new iwa(zbiVar, pz7Var, i3), e18Var), e18Var, 56);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new oa0(n54Var, zrbVar, j1gVar, zbiVar, pz7Var, i, 3);
        }
    }

    public static final void b(n54 n54Var, j1g j1gVar, zbi zbiVar, pz7 pz7Var, ld4 ld4Var, int i, int i2) {
        int i3;
        n54 n54Var2;
        j1g j1gVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-449719819);
        if ((i & 6) == 0) {
            i3 = (((i2 & 1) == 0 && e18Var.f(n54Var)) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= 16;
        }
        if ((i & 384) == 0) {
            i3 |= e18Var.f(zbiVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i3 |= e18Var.h(pz7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            e18Var.V();
            int i4 = i & 1;
            umg umgVar = a;
            if (i4 == 0 || e18Var.A()) {
                if ((i2 & 1) != 0) {
                    n54Var = ((gwa) e18Var.j(umgVar)).a;
                    i3 &= -15;
                }
                j1gVar = ((gwa) e18Var.j(umgVar)).c;
            } else {
                e18Var.T();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
            }
            int i5 = i3 & (-113);
            n54 n54Var3 = n54Var;
            j1g j1gVar3 = j1gVar;
            e18Var.q();
            int i6 = i5 << 3;
            a(n54Var3, ((gwa) e18Var.j(umgVar)).d, j1gVar3, zbiVar, pz7Var, e18Var, (i5 & 14) | (i6 & 7168) | (i6 & 57344));
            n54Var2 = n54Var3;
            j1gVar2 = j1gVar3;
        } else {
            e18Var.T();
            n54Var2 = n54Var;
            j1gVar2 = j1gVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new hwa(n54Var2, j1gVar2, zbiVar, pz7Var, i, i2, 0);
        }
    }
}
