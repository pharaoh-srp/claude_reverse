package com.anthropic.claude.chat.bottomsheet;

import com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination;
import com.anthropic.claude.tool.model.KnowledgeSource;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.a73;
import defpackage.bz7;
import defpackage.e18;
import defpackage.eli;
import defpackage.fd9;
import defpackage.fv;
import defpackage.gb9;
import defpackage.hw2;
import defpackage.im6;
import defpackage.isg;
import defpackage.iv1;
import defpackage.j83;
import defpackage.j93;
import defpackage.jce;
import defpackage.jd4;
import defpackage.ka0;
import defpackage.kxk;
import defpackage.l45;
import defpackage.l93;
import defpackage.ld4;
import defpackage.lz1;
import defpackage.m7f;
import defpackage.op3;
import defpackage.r7e;
import defpackage.rwe;
import defpackage.sq6;
import defpackage.t53;
import defpackage.ve4;
import defpackage.wvj;
import defpackage.x44;
import defpackage.ze0;

/* JADX INFO: loaded from: classes.dex */
public abstract class x0 {
    public static final void a(t53 t53Var, hw2 hw2Var, rwe rweVar, rwe rweVar2, bz7 bz7Var, ze0 ze0Var, ld4 ld4Var, int i) {
        ze0 ze0Var2;
        int i2;
        bz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(286136556);
        int i3 = i | (e18Var.f(t53Var) ? 4 : 2) | (e18Var.h(hw2Var) ? 32 : 16) | (e18Var.f(rweVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.f(rweVar2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.h(bz7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | 65536;
        if (e18Var.Q(i3 & 1, (74899 & i3) != 74898)) {
            e18Var.V();
            int i4 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i4 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(ze0.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                i2 = i3 & (-458753);
                ze0Var2 = (ze0) objN;
            } else {
                e18Var.T();
                i2 = i3 & (-458753);
                ze0Var2 = ze0Var;
            }
            e18Var.q();
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = fd9.O(im6.E, e18Var);
                e18Var.k0(objN2);
            }
            l45 l45Var = (l45) objN2;
            op3 op3Var = (op3) e18Var.j(ve4.f);
            eli eliVar = (eli) e18Var.j(ve4.t);
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = new a73(7);
                e18Var.k0(objN3);
            }
            kxk.h(rweVar, "chat.modal_bottom_sheet", null, null, (bz7) objN3, fd9.q0(1075830335, new j93(rweVar, t53Var, hw2Var, op3Var, l45Var, ze0Var2, eliVar, rweVar2, bz7Var), e18Var), e18Var, ((i2 >> 6) & 14) | 221232, 12);
        } else {
            e18Var.T();
            ze0Var2 = ze0Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ka0(t53Var, hw2Var, rweVar, rweVar2, bz7Var, ze0Var2, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0565  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.iei b(defpackage.rwe r32, defpackage.t53 r33, defpackage.hw2 r34, final defpackage.op3 r35, final defpackage.l45 r36, defpackage.ze0 r37, defpackage.eli r38, defpackage.rwe r39, defpackage.bz7 r40, defpackage.ia0 r41, com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination r42, defpackage.ld4 r43, int r44) {
        /*
            Method dump skipped, instruction units count: 3965
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.chat.bottomsheet.x0.b(rwe, t53, hw2, op3, l45, ze0, eli, rwe, bz7, ia0, com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination, ld4, int):iei");
    }

    public static final void c(op3 op3Var, KnowledgeSource knowledgeSource, l45 l45Var) {
        String url = knowledgeSource.getUrl();
        if (url != null) {
            gb9.D(l45Var, null, null, new l93(knowledgeSource, url, op3Var, null, 0), 3);
        }
    }

    public static final void d(rwe rweVar) {
        rweVar.getClass();
        rweVar.E.m(new fv(26, new ChatScreenModalBottomSheetDestination[]{ChatScreenModalBottomSheetDestination.Closed.INSTANCE}), new j83(11));
    }

    public static final boolean e(rwe rweVar) {
        return x44.r(iv1.t(rweVar), ChatScreenModalBottomSheetDestination.Closed.INSTANCE);
    }

    public static final void f(ze0 ze0Var, rwe rweVar, eli eliVar, KnowledgeSource knowledgeSource, t53 t53Var) {
        String url = knowledgeSource.getUrl();
        if (url != null) {
            if (!knowledgeSource.isTrusted()) {
                t53Var.U1.setValue(url);
                return;
            }
            String url2 = knowledgeSource.getUrl();
            if (url2 != null) {
                if (isg.q0(url2, ze0Var.a() + "/chat/", false)) {
                    d(rweVar);
                }
            }
            wvj.f(eliVar, knowledgeSource);
        }
    }
}
