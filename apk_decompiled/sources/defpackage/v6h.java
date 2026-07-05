package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v6h {
    public static final List a = x44.X("standard", "fast");

    public static final void a(String str, String str2, List list, bz7 bz7Var, ld4 ld4Var, int i) {
        nwb nwbVar;
        long j;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-425832446);
        int i2 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.f(str2) ? 32 : 16) | (e18Var.f(list) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(bz7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = mpk.P(Boolean.FALSE);
                e18Var.k0(objN);
            }
            nwb nwbVar2 = (nwb) objN;
            String strJ0 = d4c.j0(R.string.task_propose_debug_default_option, e18Var);
            wo1 wo1Var = lja.Q;
            ho0 ho0Var = new ho0(12.0f, true, new sz6(1));
            fqb fqbVar = fqb.E;
            iqb iqbVarC = b.c(fqbVar, 1.0f);
            cxe cxeVarA = axe.a(ho0Var, wo1Var, e18Var, 54);
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
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, cxeVarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            tjh.b(str, new hw9(1.0f, true), gm3.a(e18Var).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, i2 & 14, 0, 131064);
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, fqbVar);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, o5bVarD);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            ho0 ho0Var2 = new ho0(4.0f, true, new sz6(1));
            iqb iqbVarV = xn5.V(fqbVar, gm3.b(e18Var).f);
            qu1 qu1VarA = sf5.a(0.5f, gm3.a(e18Var).v);
            iqb iqbVarU = ez1.u(iqbVarV, qu1VarA.a, qu1VarA.b, gm3.b(e18Var).f);
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                nwbVar = nwbVar2;
                objN2 = new lxf(18, nwbVar);
                e18Var.k0(objN2);
            } else {
                nwbVar = nwbVar2;
            }
            iqb iqbVarK = gb9.K(androidx.compose.foundation.b.c(iqbVarU, false, null, null, null, (zy7) objN2, 15), 10.0f, 6.0f);
            cxe cxeVarA2 = axe.a(ho0Var2, wo1Var, e18Var, 54);
            int iHashCode3 = Long.hashCode(e18Var.T);
            hyc hycVarL3 = e18Var.l();
            iqb iqbVarE3 = kxk.E(e18Var, iqbVarK);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, cxeVarA2);
            d4c.i0(e18Var, z80Var2, hycVarL3);
            ij0.t(iHashCode3, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE3);
            String str3 = str2 == null ? strJ0 : str2;
            tkh tkhVar = ((jm3) gm3.c(e18Var).e.E).i;
            if (str2 == null) {
                e18Var.a0(-1336883753);
                j = gm3.a(e18Var).O;
            } else {
                e18Var.a0(-1336882729);
                j = gm3.a(e18Var).M;
            }
            e18Var.p(false);
            nwb nwbVar3 = nwbVar;
            tjh.b(str3, null, j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar, e18Var, 0, 0, 131066);
            iv1.b(ud0.B, null, null, ef2.F, gm3.a(e18Var).O, e18Var, 3120, 4);
            e18Var.p(true);
            boolean zBooleanValue = ((Boolean) nwbVar3.getValue()).booleanValue();
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = new lxf(19, nwbVar3);
                e18Var.k0(objN3);
            }
            j8.b(zBooleanValue, (zy7) objN3, null, 0L, null, null, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(35112143, new h9a(strJ0, (Object) bz7Var, (Object) list, (Object) nwbVar3, 11), e18Var), e18Var, 48, 2044);
            e18Var = e18Var;
            e18Var.p(true);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v3e(i, 12, str, str2, list, bz7Var, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(com.anthropic.claude.api.tasks.ApproveTaskAgentOverrides r47, final defpackage.bz7 r48, java.util.List r49, defpackage.iqb r50, defpackage.ld4 r51, int r52, int r53) {
        /*
            Method dump skipped, instruction units count: 1137
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v6h.b(com.anthropic.claude.api.tasks.ApproveTaskAgentOverrides, bz7, java.util.List, iqb, ld4, int, int):void");
    }
}
