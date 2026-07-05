package defpackage;

import androidx.compose.foundation.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.chat.tool.Tool;
import com.anthropic.claude.design.icon.a;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t1i {
    public static final void a(iyh iyhVar, zy7 zy7Var, mnc mncVar, iqb iqbVar, ld4 ld4Var, int i) {
        long j;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(430941323);
        int i2 = i | (e18Var.f(iyhVar) ? 4 : 2) | (e18Var.h(zy7Var) ? 32 : 16) | (e18Var.f(mncVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            wo1 wo1Var = lja.Q;
            iqb iqbVarI = gb9.I(b.c(iqbVar, false, null, null, null, zy7Var, 15), mncVar);
            cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var, 48);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarI);
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
            bpc bpcVarD = u00.D(iyhVar.c, 0, e18Var);
            d54 d54Var = iyhVar.d;
            if (d54Var == null) {
                e18Var.a0(1927527158);
                j = gm3.a(e18Var).N;
                e18Var.p(false);
            } else {
                e18Var.a0(1927526042);
                e18Var.p(false);
                j = d54Var.a;
            }
            nuj.j(bpcVarD, j, null, e18Var, 8);
            kxk.g(e18Var, androidx.compose.foundation.layout.b.t(fqb.E, 10.0f));
            tjh.b(iyhVar.b, new hw9(1.0f, true), gm3.a(e18Var).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 0, 0, 131064);
            ckk.a((iyhVar.e && iyhVar.f == null) ? false : true, null, null, false, null, e18Var, 3120, 52);
            e18Var = e18Var;
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v3e(iyhVar, zy7Var, mncVar, iqbVar, i, 13);
        }
    }

    public static final void b(mnc mncVar, iqb iqbVar, ld4 ld4Var, int i) {
        mncVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1318069810);
        int i2 = (e18Var.f(mncVar) ? 4 : 2) | i | (e18Var.f(iqbVar) ? 32 : 16);
        int i3 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
            boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                objN = m7fVarN.a(jce.a.b(myh.class), null, null);
                e18Var.k0(objN);
            }
            e18Var.p(false);
            e18Var.p(false);
            c((List) ((myh) objN).v.getValue(), mncVar, iqbVar, e18Var, (i2 << 3) & 1008);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new nwh(mncVar, iqbVar, i, i3);
        }
    }

    public static final void c(List list, mnc mncVar, iqb iqbVar, ld4 ld4Var, int i) {
        List list2;
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(905438074);
        int i3 = (i & 6) == 0 ? ((i & 8) == 0 ? e18Var.f(list) : e18Var.h(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= e18Var.f(mncVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = mpk.P(null);
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = mpk.P(Boolean.FALSE);
                e18Var.k0(objN2);
            }
            nwb nwbVar2 = (nwb) objN2;
            wlg wlgVarB = n80.b(((Boolean) nwbVar2.getValue()).booleanValue() ? 90.0f : 0.0f, null, "chevron_rotation", e18Var, 3072, 22);
            List<iyh> list3 = list;
            if ((list3 instanceof Collection) && list3.isEmpty()) {
                i2 = 0;
            } else {
                i2 = 0;
                for (iyh iyhVar : list3) {
                    if (!iyhVar.e || iyhVar.f != null) {
                        i2++;
                        if (i2 < 0) {
                            x44.m0();
                            throw null;
                        }
                    }
                }
            }
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVar);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, q64VarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            wo1 wo1Var = lja.Q;
            fqb fqbVar = fqb.E;
            int i4 = i2;
            iqb iqbVarG = androidx.compose.foundation.layout.b.g(androidx.compose.foundation.layout.b.c(fqbVar, 1.0f), 56.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = new lxf(26, nwbVar2);
                e18Var.k0(objN3);
            }
            iqb iqbVarI = gb9.I(b.c(iqbVarG, false, null, null, null, (zy7) objN3, 15), mncVar);
            cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var, 48);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarI);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, cxeVarA);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            nuj.j(a.a(ud0.g, e18Var), gm3.a(e18Var).N, null, e18Var, 8);
            kxk.g(e18Var, androidx.compose.foundation.layout.b.t(fqbVar, 10.0f));
            tjh.b(vb7.q("Local Tools (", "/", i4, list.size(), ")"), null, gm3.a(e18Var).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).e, e18Var, 0, 0, 131066);
            kxk.g(e18Var, new hw9(1.0f, true));
            iv1.b(ud0.C, ((Boolean) nwbVar2.getValue()).booleanValue() ? "Collapse" : "Expand", ysk.f(fqbVar, ((Number) wlgVarB.getValue()).floatValue()), ef2.F, gm3.a(e18Var).N, e18Var, 3072, 0);
            e18Var.p(true);
            list2 = list;
            wd6.H(s64.a, ((Boolean) nwbVar2.getValue()).booleanValue(), null, null, null, null, fd9.q0(2025768648, new zee(list2, mncVar, nwbVar, 4), e18Var), e18Var, 1572870, 30);
            e18Var = e18Var;
            e18Var.p(true);
            iyh iyhVar2 = (iyh) nwbVar.getValue();
            if (iyhVar2 == null) {
                e18Var.a0(1513185197);
                e18Var.p(false);
            } else {
                e18Var.a0(1513185198);
                String str = iyhVar2.b;
                Tool.CustomTool customTool = iyhVar2.f;
                String str2 = iyhVar2.e ? "Tool is not active (no GrowthBook config)" : "Backend-controlled tool";
                Object objN4 = e18Var.N();
                if (objN4 == lz1Var) {
                    objN4 = new lxf(27, nwbVar);
                    e18Var.k0(objN4);
                }
                pwh.d(str, customTool, (zy7) objN4, null, str2, e18Var, 384, 8);
                e18Var = e18Var;
                e18Var.p(false);
            }
        } else {
            list2 = list;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new c3g(list2, i, mncVar, iqbVar, 6);
        }
    }
}
