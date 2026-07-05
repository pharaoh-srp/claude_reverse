package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.project.details.custominstructions.CustomInstructionsDialogRoute;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ce5 {
    public static final void a(String str, String str2, String str3, bz7 bz7Var, iqb iqbVar, ld4 ld4Var, int i) {
        str.getClass();
        str2.getClass();
        bz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-792765450);
        int i2 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.f(str2) ? 32 : 16) | (e18Var.f(str3) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(bz7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.f(iqbVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
        if (e18Var.Q(i2 & 1, (i2 & 9363) != 9362)) {
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new h85(4);
                e18Var.k0(objN);
            }
            kce kceVar = jce.a;
            rwe rweVarP = eve.P(kceVar.b(CustomInstructionsDialogRoute.class), oq5.B(kceVar.b(CustomInstructionsDialogRoute.class)), true, iv1.M(kceVar.b(CustomInstructionsDialogRoute.class)), (zy7) objN, e18Var);
            int i3 = CustomInstructionsDialogRoute.$stable;
            x44.q0(rweVarP, e18Var);
            boolean zH = e18Var.h(rweVarP) | ((i2 & 14) == 4) | ((i2 & 896) == 256);
            Object objN2 = e18Var.N();
            if (zH || objN2 == lz1Var) {
                objN2 = new yg4(rweVarP, str, str3, 14);
                e18Var.k0(objN2);
            }
            x2k.e((zy7) objN2, jvk.k(iqbVar, d4c.j0(bsg.I0(str3) ? R.string.project_details_custom_instructions_item_click_label_add : R.string.project_details_custom_instructions_item_click_label, e18Var)), 0L, 0L, null, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, fd9.q0(1599859988, new rq(str3, 24), e18Var), e18Var, 100663296, 252);
            e18Var = e18Var;
            mwa.l(rweVarP, null, null, fd9.q0(1501954496, new wd((Object) str2, (Object) rweVarP, bz7Var, 5), e18Var), e18Var, i3 | 3080, 6);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new uo(str, str2, str3, bz7Var, iqbVar, i, 16);
        }
    }
}
