package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.b;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.tool.ResearchStatus;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ime {
    public static final void a(jme jmeVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-184600481);
        int i2 = (e18Var.f(jmeVar) ? 4 : 2) | i;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            ResearchStatus researchStatus = jmeVar != null ? jmeVar.f : null;
            int i3 = researchStatus == null ? -1 : hme.a[researchStatus.ordinal()];
            String strN = i3 != 1 ? i3 != 4 ? vb7.n(e18Var, -1874448690, R.string.generic_error_something_went_wrong, e18Var, false) : vb7.n(e18Var, -1874635806, R.string.research_timeout, e18Var, false) : vb7.n(e18Var, -1874533568, R.string.research_cancelled, e18Var, false);
            iqb iqbVarC = b.c(fqb.E, 1.0f);
            cxe cxeVarA = axe.a(ko0.a, lja.Q, e18Var, 48);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarC);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, cxeVarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            tjh.b(strN, null, gm3.a(e18Var).x, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 0, 131066);
            e18Var = e18Var;
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new tke(jmeVar, i, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.jme r20, boolean r21, defpackage.zy7 r22, defpackage.ld4 r23, int r24) {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ime.b(jme, boolean, zy7, ld4, int):void");
    }

    public static final void c(jme jmeVar, boolean z, iqb iqbVar, boolean z2, zy7 zy7Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1556515879);
        int i2 = i | (e18Var.f(jmeVar) ? 4 : 2) | (e18Var.g(z) ? 32 : 16) | (e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.g(z2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.h(zy7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
        if (e18Var.Q(i2 & 1, (i2 & 9363) != 9362)) {
            Context context = (Context) e18Var.j(w00.b);
            wxc wxcVarO = oq5.O(e18Var);
            boolean z3 = (!z2 || jmeVar == null || jmeVar.b || x44.r(wxcVarO.e(), yxc.a)) ? false : true;
            iqb iqbVarC = b.c(iqbVar, 1.0f);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarC);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, q64VarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            b(jmeVar, z, zy7Var, e18Var, ((i2 >> 6) & 896) | (i2 & 126));
            wd6.H(s64.a, z3, null, null, null, null, fd9.q0(-957380199, new u3e(context, 3, wxcVarO), e18Var), e18Var, 1572870, 30);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new iw0(jmeVar, z, iqbVar, z2, zy7Var, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x020d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(defpackage.jme r31, boolean r32, defpackage.ld4 r33, int r34) {
        /*
            Method dump skipped, instruction units count: 854
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ime.d(jme, boolean, ld4, int):void");
    }
}
