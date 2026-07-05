package defpackage;

import androidx.compose.foundation.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class svh {
    public static final vve a = xve.d(8.0f, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 12);
    public static final vve b = xve.d(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 8.0f, 3);
    public static final vve c = xve.b(8.0f);

    public static final void a(String str, ld4 ld4Var, int i) {
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(254503447);
        int i2 = i | (e18Var2.f(str) ? 4 : 2);
        if (e18Var2.Q(i2 & 1, (i2 & 3) != 2)) {
            e18Var = e18Var2;
            tjh.b(str, gb9.J(puk.i(0.4f, e18Var2, 54, 2), 8.0f), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 5, 0, null, tkh.b((tkh) ((wk) gm3.c(e18Var2).e.F).c, gm3.a(e18Var2).O, 0L, null, null, null, 0L, null, 0, 0L, null, 0, 16777214), e18Var, i2 & 14, 24576, 114684);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ngf(str, i, 10);
        }
    }

    public static final void b(int i, ld4 ld4Var, zy7 zy7Var, iqb iqbVar, String str, String str2, boolean z, boolean z2) {
        int i2;
        e18 e18Var;
        str.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1276875566);
        if ((i & 6) == 0) {
            i2 = (e18Var2.f(iqbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.f(str2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i3 = i2 | 27648;
        if ((196608 & i) == 0) {
            i3 |= e18Var2.g(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= e18Var2.g(z2) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= e18Var2.h(zy7Var) ? 8388608 : 4194304;
        }
        int i4 = i3 | 100663296;
        if (e18Var2.Q(i4 & 1, (38347923 & i4) != 38347922)) {
            e18Var = e18Var2;
            c(iqbVar, str, fd9.q0(1730161990, new fj2(str2, (wk) gm3.c(e18Var2).e.F, gm3.a(e18Var2).N, 8), e18Var2), false, false, z, z2, zy7Var, null, e18Var, (i4 & 14) | 384 | (i4 & 112) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4) | (i4 & 234881024));
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new rlg(iqbVar, str, str2, z, z2, zy7Var, i);
        }
    }

    public static final void c(iqb iqbVar, String str, ta4 ta4Var, boolean z, boolean z2, boolean z3, boolean z4, zy7 zy7Var, pz7 pz7Var, ld4 ld4Var, int i) {
        int i2;
        pz7 pz7Var2;
        e18 e18Var;
        wo8 wo8Var;
        jl3 jl3Var;
        wk wkVar;
        String str2;
        fqb fqbVar;
        int i3;
        iqb iqbVarC;
        vo1 vo1Var;
        bx bxVar;
        z80 z80Var;
        lz1 lz1Var;
        eo0 eo0Var;
        re4 re4Var;
        e18 e18Var2;
        vo1 vo1Var2;
        jl3 jl3Var2;
        z80 z80Var2;
        z80 z80Var3;
        wo8 wo8Var2 = zni.b;
        str.getClass();
        e18 e18Var3 = (e18) ld4Var;
        e18Var3.c0(-101350534);
        if ((i & 6) == 0) {
            i2 = (e18Var3.f(iqbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var3.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var3.h(ta4Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var3.g(z2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var3.g(z3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= e18Var3.g(z4) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= e18Var3.h(zy7Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= e18Var3.h(pz7Var) ? 67108864 : 33554432;
        }
        int i4 = i2;
        if (e18Var3.Q(i4 & 1, (i4 & 38346899) != 38346898)) {
            jl3 jl3VarA = gm3.a(e18Var3);
            wk wkVar2 = (wk) gm3.c(e18Var3).e.F;
            vve vveVar = b;
            vve vveVar2 = a;
            e0g e0gVar = (z3 && z4) ? c : z3 ? vveVar2 : z4 ? vveVar : wo8Var2;
            long j = z2 ? jl3VarA.y : jl3VarA.M;
            String strJ0 = d4c.j0(R.string.tool_call_state_error, e18Var3);
            fqb fqbVar2 = fqb.E;
            if (zy7Var != null) {
                wo8Var = wo8Var2;
                str2 = strJ0;
                jl3Var = jl3VarA;
                wkVar = wkVar2;
                i3 = 16384;
                fqbVar = fqbVar2;
                iqbVarC = b.c(fqbVar, false, null, null, null, zy7Var, 15);
            } else {
                wo8Var = wo8Var2;
                jl3Var = jl3VarA;
                wkVar = wkVar2;
                str2 = strJ0;
                fqbVar = fqbVar2;
                i3 = 16384;
                iqbVarC = fqbVar;
            }
            iqb iqbVarB = iqbVar.B(iqbVarC);
            boolean zF = e18Var3.f(str2) | ((i4 & 57344) == i3);
            Object objN = e18Var3.N();
            lz1 lz1Var2 = jd4.a;
            if (zF || objN == lz1Var2) {
                objN = new xj4(z2, str2, 6);
                e18Var3.k0(objN);
            }
            iqb iqbVarB2 = tjf.b(iqbVarB, false, (bz7) objN);
            jl3 jl3Var3 = jl3Var;
            iqb iqbVarT = ez1.t(iqbVarB2, MTTypesetterKt.kLineSkipLimitMultiplier, jl3Var3.t, e0gVar);
            vo1 vo1Var3 = lja.S;
            eo0 eo0Var2 = ko0.c;
            q64 q64VarA = p64.a(eo0Var2, vo1Var3, e18Var3, 0);
            int iHashCode = Long.hashCode(e18Var3.T);
            hyc hycVarL = e18Var3.l();
            iqb iqbVarE = kxk.E(e18Var3, iqbVarT);
            dd4.e.getClass();
            re4 re4Var2 = cd4.b;
            e18Var3.e0();
            if (e18Var3.S) {
                e18Var3.k(re4Var2);
            } else {
                e18Var3.n0();
            }
            z80 z80Var4 = cd4.f;
            d4c.i0(e18Var3, z80Var4, q64VarA);
            z80 z80Var5 = cd4.e;
            d4c.i0(e18Var3, z80Var5, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var6 = cd4.g;
            d4c.i0(e18Var3, z80Var6, numValueOf);
            bx bxVar2 = cd4.h;
            d4c.h0(e18Var3, bxVar2);
            z80 z80Var7 = cd4.d;
            d4c.i0(e18Var3, z80Var7, iqbVarE);
            iqb iqbVarC2 = androidx.compose.foundation.layout.b.c(fqbVar, 1.0f);
            boolean z5 = zy7Var == null;
            fqb fqbVar3 = fqbVar;
            Object objN2 = e18Var3.N();
            if (objN2 == lz1Var2) {
                vo1Var = vo1Var3;
                objN2 = new x2h(26);
                e18Var3.k0(objN2);
            } else {
                vo1Var = vo1Var3;
            }
            iqb iqbVarJ = gb9.J(yfd.p(tjf.b(iqbVarC2, z5, (bz7) objN2), jl3Var3.n, z3 ? vveVar2 : wo8Var), 8.0f);
            cxe cxeVarA = axe.a(ko0.a, lja.Q, e18Var3, 48);
            int iHashCode2 = Long.hashCode(e18Var3.T);
            hyc hycVarL2 = e18Var3.l();
            iqb iqbVarE2 = kxk.E(e18Var3, iqbVarJ);
            e18Var3.e0();
            if (e18Var3.S) {
                e18Var3.k(re4Var2);
            } else {
                e18Var3.n0();
            }
            d4c.i0(e18Var3, z80Var4, cxeVarA);
            d4c.i0(e18Var3, z80Var5, hycVarL2);
            ij0.t(iHashCode2, e18Var3, z80Var6, e18Var3, bxVar2);
            d4c.i0(e18Var3, z80Var7, iqbVarE2);
            if (z2) {
                e18Var3.a0(979373630);
                bxVar = bxVar2;
                lz1Var = lz1Var2;
                z80Var = z80Var6;
                eo0Var = eo0Var2;
                re4Var = re4Var2;
                vo1Var2 = vo1Var;
                e18Var2 = e18Var3;
                jl3Var2 = jl3Var3;
                z80Var2 = z80Var7;
                z80Var3 = z80Var5;
                iv1.b(ud0.K1, null, gb9.N(fqbVar3, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 4.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 11), ef2.F, j, e18Var2, 3504, 0);
                e18Var2.p(false);
            } else {
                bxVar = bxVar2;
                z80Var = z80Var6;
                lz1Var = lz1Var2;
                eo0Var = eo0Var2;
                re4Var = re4Var2;
                e18Var2 = e18Var3;
                vo1Var2 = vo1Var;
                jl3Var2 = jl3Var3;
                z80Var2 = z80Var7;
                z80Var3 = z80Var5;
                e18Var2.a0(979648910);
                e18Var2.p(false);
            }
            e18 e18Var4 = e18Var2;
            tjh.b(str, gb9.N(fqbVar3, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 11), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkh.b((tkh) wkVar.g, j, 0L, null, null, null, 0L, null, 0, 0L, null, 0, 16777214), e18Var4, ((i4 >> 3) & 14) | 48, 0, 131068);
            e18Var = e18Var4;
            vb7.y((i4 >> 6) & 14, ta4Var, e18Var, true);
            if (pz7Var != null) {
                e18Var.a0(-1913784414);
                iqb iqbVarC3 = androidx.compose.foundation.layout.b.c(fqbVar3, 1.0f);
                boolean zF2 = e18Var.f(jl3Var2);
                Object objN3 = e18Var.N();
                if (zF2 || objN3 == lz1Var) {
                    objN3 = new d6d(27, jl3Var2);
                    e18Var.k0(objN3);
                }
                v40.a(6, e18Var, (bz7) objN3, iqbVarC3);
                iqb iqbVarP = yfd.p(gb9.i(androidx.compose.foundation.layout.b.c(fqbVar3, 1.0f), null, 3), jl3Var2.o, z4 ? vveVar : wo8Var);
                q64 q64VarA2 = p64.a(eo0Var, vo1Var2, e18Var, 0);
                int iHashCode3 = Long.hashCode(e18Var.T);
                hyc hycVarL3 = e18Var.l();
                iqb iqbVarE3 = kxk.E(e18Var, iqbVarP);
                e18Var.e0();
                if (e18Var.S) {
                    e18Var.k(re4Var);
                } else {
                    e18Var.n0();
                }
                d4c.i0(e18Var, z80Var4, q64VarA2);
                d4c.i0(e18Var, z80Var3, hycVarL3);
                ij0.t(iHashCode3, e18Var, z80Var, e18Var, bxVar);
                d4c.i0(e18Var, z80Var2, iqbVarE3);
                pz7Var2 = pz7Var;
                vb7.z((i4 >> 24) & 14, pz7Var2, e18Var, true, false);
            } else {
                pz7Var2 = pz7Var;
                e18Var.a0(-1913338510);
                e18Var.p(false);
            }
            e18Var.p(true);
        } else {
            pz7Var2 = pz7Var;
            e18Var = e18Var3;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new km5(iqbVar, str, ta4Var, z, z2, z3, z4, zy7Var, pz7Var2, i);
        }
    }
}
