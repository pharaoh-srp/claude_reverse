package defpackage;

import androidx.compose.foundation.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import com.anthropic.claude.settings.internal.growthbook.GateKind;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pd8 {
    public static final ide a = new ide("[\\s_]+");
    public static final List b = x44.X(GateKind.BOOLEAN, GateKind.STRING, GateKind.NUMBER, GateKind.JSON);

    public static final void a(zy7 zy7Var, pz7 pz7Var, ld4 ld4Var, int i) {
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(253951121);
        int i2 = i | (e18Var2.h(pz7Var) ? 32 : 16);
        if (e18Var2.Q(i2 & 1, (i2 & 19) != 18)) {
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new yih((String) null, 3);
                e18Var2.k0(objN);
            }
            yih yihVar = (yih) objN;
            Object objN2 = e18Var2.N();
            if (objN2 == lz1Var) {
                objN2 = mpk.P(GateKind.JSON);
                e18Var2.k0(objN2);
            }
            nwb nwbVar = (nwb) objN2;
            e18Var = e18Var2;
            ppk.a(zy7Var, fd9.q0(30076633, new ra7(pz7Var, yihVar, nwbVar, 4), e18Var2), null, fd9.q0(374904795, new wh(27, zy7Var), e18Var2), null, dmk.e, fd9.q0(892147038, new um5(yihVar, 19, nwbVar), e18Var2), null, 0L, 0L, 0L, 0L, null, e18Var, 1772598, 0, 16276);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new um5(zy7Var, pz7Var, i, 20);
        }
    }

    public static final void b(String str, Boolean bool, boolean z, boolean z2, bz7 bz7Var, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        boolean z3;
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1184085343);
        if ((i & 6) == 0) {
            i2 = (e18Var2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.f(bool) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z3 = z;
            i2 |= e18Var2.g(z3) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            z3 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.g(z2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var2.h(bz7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var2.h(zy7Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= e18Var2.f(iqbVar) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        int i3 = i2;
        if (e18Var2.Q(i3 & 1, (599187 & i3) != 599186)) {
            long j = gm3.a(e18Var2).j;
            long j2 = gm3.a(e18Var2).b;
            e18Var = e18Var2;
            ybi.b(null, fd9.q0(-1460982169, new yi7(str, 7), e18Var2), iqbVar, fd9.q0(838682405, new jd8(z3, j, j2, zy7Var, bool, z2), e18Var2), fd9.q0(1988514692, new jd8(z, j, bool == null && z2, j2, bool, bz7Var), e18Var2), 0L, qf2.a, 56.0f, null, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, false, null, null, e18Var, ((i3 >> 12) & 896) | 27702, 0, 16160);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new wk1(str, bool, z, z2, bz7Var, zy7Var, iqbVar, i);
        }
    }

    public static final void c(n18 n18Var, boolean z, bz7 bz7Var, zy7 zy7Var, zy7 zy7Var2, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1379364328);
        int i2 = (e18Var.h(n18Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= e18Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.h(zy7Var2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        int i3 = i2 | (e18Var.f(iqbVar) ? 131072 : 65536);
        if (e18Var.Q(i3 & 1, (74899 & i3) != 74898)) {
            GateKind gateKindA = n18Var.a();
            if (gateKindA == GateKind.BOOLEAN || gateKindA == GateKind.UNKNOWN) {
                e18Var.a0(-1604079516);
                String str = n18Var.a;
                JsonElement jsonElement = n18Var.b;
                Boolean boolE = null;
                JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
                if (jsonPrimitive != null) {
                    if (jsonPrimitive.isString()) {
                        jsonPrimitive = null;
                    }
                    if (jsonPrimitive != null) {
                        boolE = ch9.e(jsonPrimitive);
                    }
                }
                b(str, boolE, n18Var.c, z, bz7Var, zy7Var, iqbVar, e18Var, ((i3 << 6) & 523264) | ((i3 << 3) & 3670016));
                e18Var.p(false);
            } else {
                e18Var.a0(-1603739229);
                g(n18Var, zy7Var2, zy7Var, iqbVar, e18Var, ((i3 >> 6) & 7168) | (i3 & 14) | 8 | ((i3 >> 9) & 112) | ((i3 >> 3) & 896));
                e18Var.p(false);
            }
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pg1(n18Var, z, bz7Var, zy7Var, zy7Var2, iqbVar, i, 9);
        }
    }

    public static final void d(String str, ld4 ld4Var, int i) {
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-343949229);
        int i2 = i | (e18Var2.f(str) ? 4 : 2);
        if (e18Var2.Q(i2 & 1, (i2 & 3) != 2)) {
            e18Var = e18Var2;
            tjh.b(str, null, gm3.a(e18Var2).M, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, ((jm3) gm3.c(e18Var2).e.E).e, e18Var, i2 & 14, 24960, 110586);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new yi7(str, i, 8);
        }
    }

    public static final void e(zy7 zy7Var, bz7 bz7Var, iqb iqbVar, qi3 qi3Var, id8 id8Var, ld4 ld4Var, int i) {
        iqb iqbVar2;
        qi3 qi3Var2;
        id8 id8Var2;
        iqb iqbVar3;
        int i2;
        qi3 qi3Var3;
        id8 id8Var3;
        nwb nwbVar;
        zy7Var.getClass();
        bz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(572687723);
        int i3 = i | (e18Var.h(zy7Var) ? 4 : 2) | (e18Var.h(bz7Var) ? 32 : 16) | 9600;
        int i4 = 1;
        if (e18Var.Q(i3 & 1, (i3 & 9363) != 9362)) {
            e18Var.V();
            int i5 = i & 1;
            tp4 tp4Var = null;
            lz1 lz1Var = jd4.a;
            if (i5 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(qi3.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                qi3 qi3Var4 = (qi3) objN;
                m7f m7fVarB = gr9.b(e18Var);
                boolean zH = e18Var.h(m7fVarB);
                Object objN2 = e18Var.N();
                if (zH || objN2 == lz1Var) {
                    objN2 = new di(m7fVarB, 14);
                    e18Var.k0(objN2);
                }
                kce kceVar = jce.a;
                id8 id8Var4 = (id8) fd9.r0(kceVar.b(id8.class), oq5.B(kceVar.b(id8.class)), (bz7) objN2, e18Var);
                iqbVar3 = fqb.E;
                i2 = i3 & (-64513);
                qi3Var3 = qi3Var4;
                id8Var3 = id8Var4;
            } else {
                e18Var.T();
                iqbVar3 = iqbVar;
                id8Var3 = id8Var;
                i2 = i3 & (-64513);
                qi3Var3 = qi3Var;
            }
            e18Var.q();
            boolean zH2 = e18Var.h(qi3Var3) | e18Var.f(id8Var3);
            Object objN3 = e18Var.N();
            if (zH2 || objN3 == lz1Var) {
                objN3 = new dv(qi3Var3, id8Var3, tp4Var, 7);
                e18Var.k0(objN3);
            }
            csg.g((bz7) objN3, e18Var, 0, 1);
            Object objN4 = e18Var.N();
            if (objN4 == lz1Var) {
                objN4 = mpk.P(Boolean.FALSE);
                e18Var.k0(objN4);
            }
            nwb nwbVar2 = (nwb) objN4;
            id8 id8Var5 = id8Var3;
            iqb iqbVar4 = iqbVar3;
            ssj.c(d4c.j0(R.string.internal_setting_growthbook_override_title, e18Var), zy7Var, iqbVar4, fd9.q0(-1004909158, new dl1(5, nwbVar2), e18Var), null, 0L, fd9.q0(529314364, new nw7(id8Var3, i4, bz7Var), e18Var), e18Var, ((i2 << 3) & 112) | 1576320, 48);
            if (((Boolean) nwbVar2.getValue()).booleanValue()) {
                e18Var.a0(1334538950);
                Object objN5 = e18Var.N();
                if (objN5 == lz1Var) {
                    nwbVar = nwbVar2;
                    objN5 = new sy4(27, nwbVar);
                    e18Var.k0(objN5);
                } else {
                    nwbVar = nwbVar2;
                }
                zy7 zy7Var2 = (zy7) objN5;
                boolean zF2 = e18Var.f(id8Var5) | ((i2 & 112) == 32);
                Object objN6 = e18Var.N();
                if (zF2 || objN6 == lz1Var) {
                    objN6 = new ra7(id8Var5, bz7Var, nwbVar, 3);
                    e18Var.k0(objN6);
                }
                a(zy7Var2, (pz7) objN6, e18Var, 6);
                e18Var.p(false);
            } else {
                e18Var.a0(1334893559);
                e18Var.p(false);
            }
            qi3Var2 = qi3Var3;
            iqbVar2 = iqbVar4;
            id8Var2 = id8Var5;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            qi3Var2 = qi3Var;
            id8Var2 = id8Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new uo(zy7Var, bz7Var, iqbVar2, (Object) qi3Var2, (Object) id8Var2, i, 23);
        }
    }

    public static final void f(GateKind gateKind, boolean z, zy7 zy7Var, ld4 ld4Var, int i) {
        e18 e18Var;
        int i2;
        long j;
        long j2;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1059897049);
        int i3 = i | (e18Var2.d(gateKind.ordinal()) ? 4 : 2) | (e18Var2.g(z) ? 32 : 16) | (e18Var2.h(zy7Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var2.Q(i3 & 1, (i3 & 147) != 146)) {
            int i4 = nd8.a[gateKind.ordinal()];
            if (i4 == 1) {
                i2 = R.string.internal_setting_growthbook_kind_bool;
            } else if (i4 == 2) {
                i2 = R.string.internal_setting_growthbook_kind_string;
            } else if (i4 == 3) {
                i2 = R.string.internal_setting_growthbook_kind_number;
            } else if (i4 == 4) {
                i2 = R.string.internal_setting_growthbook_kind_json;
            } else {
                if (i4 != 5) {
                    wg6.i();
                    return;
                }
                i2 = R.string.internal_setting_growthbook_kind_unknown;
            }
            String strJ0 = d4c.j0(i2, e18Var2);
            if (z) {
                e18Var2.a0(653834694);
                j = gm3.a(e18Var2).b;
            } else {
                e18Var2.a0(653835902);
                j = gm3.a(e18Var2).o;
            }
            e18Var2.p(false);
            if (z) {
                e18Var2.a0(653837886);
                j2 = gm3.a(e18Var2).n;
            } else {
                e18Var2.a0(653838848);
                j2 = gm3.a(e18Var2).N;
            }
            e18Var2.p(false);
            iqb iqbVarP = yfd.p(fqb.E, j, xve.b(14.0f));
            boolean z2 = (i3 & 896) == 256;
            Object objN = e18Var2.N();
            if (z2 || objN == jd4.a) {
                objN = new kl1(13, zy7Var);
                e18Var2.k0(objN);
            }
            iqb iqbVarK = gb9.K(b.c(iqbVarP, false, null, null, null, (zy7) objN, 15), 12.0f, 6.0f);
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarK);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, cd4.f, o5bVarD);
            d4c.i0(e18Var2, cd4.e, hycVarL);
            d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var2, cd4.h);
            d4c.i0(e18Var2, cd4.d, iqbVarE);
            tjh.b(strJ0, null, j2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).j, e18Var2, 0, 0, 131066);
            e18Var = e18Var2;
            e18Var.p(true);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new iv((Object) gateKind, z, zy7Var, i, 17);
        }
    }

    public static final void g(n18 n18Var, zy7 zy7Var, zy7 zy7Var2, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(411439744);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var2.f(n18Var) : e18Var2.h(n18Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.h(zy7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.h(zy7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.f(iqbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        int i3 = i2;
        int i4 = 1;
        if (e18Var2.Q(i3 & 1, (i3 & 1171) != 1170)) {
            long j = gm3.a(e18Var2).j;
            long j2 = gm3.a(e18Var2).b;
            e18Var = e18Var2;
            ybi.b(null, fd9.q0(798934408, new mk4(23, n18Var), e18Var2), iqbVar, fd9.q0(-704163898, new kd8(n18Var, bsg.j1(80, isg.o0(cc8.a(n18Var.b), '\n', ' ')), j, j2, zy7Var2), e18Var2), fd9.q0(-1455713051, new me(zy7Var, j2, i4), e18Var2), 0L, qf2.a, 56.0f, null, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, false, null, null, e18Var, ((i3 >> 3) & 896) | 27702, 0, 16160);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new bg6(n18Var, zy7Var, zy7Var2, iqbVar, i, 1);
        }
    }

    public static final void h(long j, long j2, zy7 zy7Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(552936785);
        int i2 = i | (e18Var.e(j) ? 4 : 2) | (e18Var.e(j2) ? 32 : 16) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        int i3 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            cxe cxeVarA = axe.a(ko0.a, lja.Q, e18Var, 48);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, fqb.E);
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
            j(d4c.j0(R.string.internal_setting_growthbook_local_override_subtitle, e18Var), j, e18Var, (i2 << 3) & 112, 0);
            kxk.g(e18Var, new hw9(1.0f, true));
            lnk.d(zy7Var, null, false, null, null, gb9.b(8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), null, fd9.q0(-1632874800, new ld8(j2, i3), e18Var), e18Var, ((i2 >> 6) & 14) | 806879232, 446);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new k66(j, j2, zy7Var, i, 1);
        }
    }

    public static final void i(zy7 zy7Var, ld4 ld4Var, int i) {
        zy7 zy7Var2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1351815522);
        if (e18Var.Q(i & 1, (i & 3) != 2)) {
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = mpk.P(Boolean.FALSE);
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            fqb fqbVar = fqb.E;
            iqb iqbVarE = kxk.E(e18Var, fqbVar);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, o5bVarD);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            xo1 xo1Var = lja.K;
            iqb iqbVarO = androidx.compose.foundation.layout.b.o(fqbVar, 40.0f);
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = new sy4(25, nwbVar);
                e18Var.k0(objN2);
            }
            iqb iqbVarC = b.c(iqbVarO, false, null, null, null, (zy7) objN2, 15);
            o5b o5bVarD2 = dw1.d(xo1Var, false);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarC);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, o5bVarD2);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            cv8.b(a.a(ud0.c0, e18Var), d4c.j0(R.string.generic_button_more_options, e18Var), androidx.compose.foundation.layout.b.o(fqbVar, 20.0f), gm3.a(e18Var).M, e18Var, 392, 0);
            e18Var.p(true);
            boolean zBooleanValue = ((Boolean) nwbVar.getValue()).booleanValue();
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = new sy4(26, nwbVar);
                e18Var.k0(objN3);
            }
            zy7Var2 = zy7Var;
            t30.a(zBooleanValue, (zy7) objN3, null, 0L, null, null, null, gm3.a(e18Var).o, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(-209055145, new dk1(zy7Var, nwbVar, 1), e18Var), e18Var, 48, 48, 1916);
            e18Var.p(true);
        } else {
            zy7Var2 = zy7Var;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new wh(i, 26, zy7Var2);
        }
    }

    public static final void j(final String str, long j, ld4 ld4Var, final int i, final int i2) {
        int i3;
        long j2;
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(34408374);
        if ((i & 6) == 0) {
            i3 = i | (e18Var2.f(str) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                j2 = j;
                int i4 = e18Var2.e(j2) ? 32 : 16;
                i3 |= i4;
            } else {
                j2 = j;
            }
            i3 |= i4;
        } else {
            j2 = j;
        }
        if (e18Var2.Q(i3 & 1, (i3 & 19) != 18)) {
            e18Var2.V();
            if ((i & 1) == 0 || e18Var2.A()) {
                if ((i2 & 2) != 0) {
                    j2 = gm3.a(e18Var2).O;
                    i3 &= -113;
                }
                e18Var2.q();
                e18Var = e18Var2;
                tjh.b(str, null, j2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).g, e18Var, (i3 & 14) | ((i3 << 3) & 896), 0, 131066);
            } else {
                e18Var2.T();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                e18Var2.q();
                e18Var = e18Var2;
                tjh.b(str, null, j2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).g, e18Var, (i3 & 14) | ((i3 << 3) & 896), 0, 131066);
            }
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        final long j3 = j2;
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: md8
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    pd8.j(str, j3, (ld4) obj, x44.p0(i | 1), i2);
                    return iei.a;
                }
            };
        }
    }

    public static final void k(int i, ld4 ld4Var) {
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1390746361);
        if (e18Var2.Q(i & 1, i != 0)) {
            cxe cxeVarA = axe.a(ko0.a, lja.Q, e18Var2, 48);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            fqb fqbVar = fqb.E;
            iqb iqbVarE = kxk.E(e18Var2, fqbVar);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, cd4.f, cxeVarA);
            d4c.i0(e18Var2, cd4.e, hycVarL);
            d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var2, cd4.h);
            d4c.i0(e18Var2, cd4.d, iqbVarE);
            e18Var = e18Var2;
            iv1.b(ud0.K1, null, sf5.N(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, -1.0f, 1), ef2.F, 0L, e18Var, 3504, 16);
            kxk.g(e18Var, androidx.compose.foundation.layout.b.t(fqbVar, 4.0f));
            j(d4c.j0(R.string.internal_setting_growthbook_undefined_value_subtitle, e18Var), 0L, e18Var, 0, 2);
            e18Var.p(true);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new lc4(i, 26);
        }
    }

    public static final p0h l(long j, e18 e18Var) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        p0h p0hVarE = djk.e(e18Var);
        boolean zF = e18Var.f(p0hVarE);
        Object objN = e18Var.N();
        if (zF || objN == jd4.a) {
            long j8 = p0hVarE.a;
            long j9 = p0hVarE.d;
            long j10 = p0hVarE.e;
            long j11 = p0hVarE.f;
            long j12 = p0hVarE.h;
            long j13 = p0hVarE.i;
            long j14 = p0hVarE.j;
            long j15 = p0hVarE.k;
            long j16 = p0hVarE.l;
            long j17 = p0hVarE.m;
            long j18 = p0hVarE.n;
            long j19 = p0hVarE.o;
            long j20 = p0hVarE.p;
            if (j != 16) {
                j2 = j20;
                j3 = j;
            } else {
                j2 = j20;
                j3 = p0hVarE.b;
            }
            if (j != 16) {
                j4 = j3;
                j5 = j;
            } else {
                j4 = j3;
                j5 = p0hVarE.c;
            }
            if (j != 16) {
                j6 = j5;
                j7 = j;
            } else {
                j6 = j5;
                j7 = p0hVarE.g;
            }
            Object p0hVar = new p0h(j8, j4, j6, j9, j10, j11, j7, j12, j13, j14, j15, j16, j17, j18, j19, j2);
            e18Var.k0(p0hVar);
            objN = p0hVar;
        }
        return (p0h) objN;
    }
}
