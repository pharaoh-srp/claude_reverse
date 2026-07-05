package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.tool.Tool;
import com.anthropic.claude.design.icon.a;
import com.anthropic.claude.models.organization.configtypes.OctopusConfig;
import com.anthropic.claude.types.strings._ServerLocalizedString;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ah4 {
    public static final void a(String str, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-798760946);
        if ((i & 6) == 0) {
            i2 = i | (e18Var.f(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        int i3 = i2;
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            ho0 ho0Var = new ho0(12.0f, true, new sz6(1));
            iqb iqbVarJ = gb9.J(yfd.p(xn5.V(iqbVar, gm3.b(e18Var).f), gm3.a(e18Var).A, zni.b), 12.0f);
            cxe cxeVarA = axe.a(ho0Var, lja.P, e18Var, 6);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarJ);
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
            bpc bpcVarA = a.a(ud0.H1, e18Var);
            long j = gm3.a(e18Var).x;
            fqb fqbVar = fqb.E;
            cv8.b(bpcVarA, null, b.o(fqbVar, 20.0f), j, e18Var, 440, 0);
            q64 q64VarA = p64.a(new ho0(4.0f, true, new sz6(1)), lja.S, e18Var, 6);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, fqbVar);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, q64VarA);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            tjh.b(d4c.j0(R.string.connected_apps_disclaimer_title, e18Var), null, gm3.a(e18Var).x, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).j, e18Var, 0, 0, 131066);
            tjh.b(str, null, gm3.a(e18Var).x, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, i3 & 14, 0, 131066);
            e18Var = e18Var;
            e18Var.p(true);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new el(str, iqbVar, i, 4);
        }
    }

    public static final void b(List list, bz7 bz7Var, pz7 pz7Var, pz7 pz7Var2, bz7 bz7Var2, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1761864786);
        pz7 pz7Var3 = pz7Var;
        int i2 = i | (e18Var2.f(list) ? 4 : 2) | (e18Var2.h(bz7Var) ? 32 : 16) | (e18Var2.h(pz7Var3) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.h(pz7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var2.f(iqbVar) ? 131072 : 65536);
        if (e18Var2.Q(i2 & 1, (74899 & i2) != 74898)) {
            Object[] objArr = new Object[0];
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new l84(10);
                e18Var2.k0(objN);
            }
            nwb nwbVar = (nwb) iuj.I(objArr, (zy7) objN, e18Var2, 48);
            boolean z = (i2 & 14) == 4;
            Object objN2 = e18Var2.N();
            int i3 = 19;
            if (z || objN2 == lz1Var) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : list) {
                    String str = ((vg4) obj).c;
                    Object obj2 = linkedHashMap.get(str);
                    if (obj2 == null) {
                        ArrayList arrayList = new ArrayList();
                        linkedHashMap.put(str, arrayList);
                        obj2 = arrayList;
                    }
                    ((List) obj2).add(obj);
                }
                objN2 = w44.i1(linkedHashMap.entrySet(), new mt7(i3));
                e18Var2.k0(objN2);
            }
            List<Map.Entry> list2 = (List) objN2;
            q64 q64VarA = p64.a(new ho0(12.0f, true, new sz6(1)), lja.S, e18Var2, 6);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVar);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, cd4.f, q64VarA);
            d4c.i0(e18Var2, cd4.e, hycVarL);
            d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var2, cd4.h);
            d4c.i0(e18Var2, cd4.d, iqbVarE);
            e18Var2.a0(10127077);
            for (Map.Entry entry : list2) {
                String str2 = (String) entry.getKey();
                List list3 = (List) entry.getValue();
                boolean zR = x44.r(str2, (String) nwbVar.getValue());
                String str3 = ((vg4) w44.L0(list3)).b;
                boolean zF = e18Var2.f(list3);
                Object objN3 = e18Var2.N();
                if (zF || objN3 == lz1Var) {
                    objN3 = w44.i1(list3, new mt7(20));
                    e18Var2.k0(objN3);
                }
                List list4 = (List) objN3;
                boolean zF2 = ((i2 & 7168) == 2048) | e18Var2.f(str2);
                Object objN4 = e18Var2.N();
                if (zF2 || objN4 == lz1Var) {
                    objN4 = new lj2(pz7Var2, i3, str2);
                    e18Var2.k0(objN4);
                }
                bz7 bz7Var3 = (bz7) objN4;
                boolean zF3 = e18Var2.f(nwbVar) | e18Var2.f(str2);
                Object objN5 = e18Var2.N();
                if (zF3 || objN5 == lz1Var) {
                    objN5 = new zg4(str2, nwbVar, 0);
                    e18Var2.k0(objN5);
                }
                e18 e18Var3 = e18Var2;
                ug4.a(str2, str3, list4, zR, bz7Var, pz7Var3, bz7Var2, bz7Var3, (bz7) objN5, gb9.i(b.c(fqb.E, 1.0f), null, 3), null, e18Var3, ((i2 << 9) & 516096) | 1572864);
                pz7Var3 = pz7Var;
                e18Var2 = e18Var3;
                lz1Var = lz1Var;
                i3 = 19;
            }
            e18Var = e18Var2;
            e18Var.p(false);
            e18Var.p(true);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ne((Object) list, (Object) bz7Var, (Object) pz7Var, (qz7) pz7Var2, (qz7) bz7Var2, iqbVar, i, 8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v5, types: [tp4] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.String] */
    public static final void c(zy7 zy7Var, iqb iqbVar, wg4 wg4Var, ld4 ld4Var, int i) {
        e18 e18Var;
        iqb iqbVar2;
        wg4 wg4Var2;
        int i2;
        iqb iqbVar3;
        wg4 wg4Var3;
        _ServerLocalizedString setting_title;
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(259847393);
        int i3 = 4;
        int i4 = i | (e18Var2.h(zy7Var) ? 4 : 2) | 176;
        if (e18Var2.Q(i4 & 1, (i4 & 147) != 146)) {
            e18Var2.V();
            int i5 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i5 == 0 || e18Var2.A()) {
                m7f m7fVar = (m7f) e18Var2.j(gr9.b);
                boolean zH = e18Var2.h(m7fVar);
                Object objN = e18Var2.N();
                if (zH || objN == lz1Var) {
                    objN = new di(m7fVar, 8);
                    e18Var2.k0(objN);
                }
                kce kceVar = jce.a;
                wg4 wg4Var4 = (wg4) fd9.r0(kceVar.b(wg4.class), oq5.B(kceVar.b(wg4.class)), (bz7) objN, e18Var2);
                i2 = i4 & (-897);
                iqbVar3 = fqb.E;
                wg4Var3 = wg4Var4;
            } else {
                e18Var2.T();
                i2 = i4 & (-897);
                iqbVar3 = iqbVar;
                wg4Var3 = wg4Var;
            }
            e18Var2.q();
            boolean zF = e18Var2.f(wg4Var3);
            Object objN2 = e18Var2.N();
            ?? localizedText = 0;
            localizedText = 0;
            if (zF || objN2 == lz1Var) {
                objN2 = new jp(wg4Var3, localizedText, i3);
                e18Var2.k0(objN2);
            }
            csg.g((bz7) objN2, e18Var2, 0, 1);
            Object objN3 = e18Var2.N();
            if (objN3 == lz1Var) {
                objN3 = mpk.P(null);
                e18Var2.k0(objN3);
            }
            nwb nwbVar = (nwb) objN3;
            OctopusConfig octopusConfig = (OctopusConfig) wg4Var3.c.getValue();
            if (octopusConfig != null && (setting_title = octopusConfig.getSetting_title()) != null) {
                localizedText = setting_title.getLocalizedText();
            }
            if (localizedText == 0) {
                localizedText = "";
            }
            ta4 ta4Var = nik.a;
            ta4 ta4VarQ0 = fd9.q0(-1913922512, new ye(octopusConfig, wg4Var3, nwbVar, 29), e18Var2);
            int i6 = ((i2 << 3) & 112) | 1576320;
            iqb iqbVar4 = iqbVar3;
            ?? r0 = localizedText;
            e18Var = e18Var2;
            ssj.c(r0, zy7Var, iqbVar4, ta4Var, null, 0L, ta4VarQ0, e18Var, i6, 48);
            iqbVar2 = iqbVar4;
            vg4 vg4Var = (vg4) nwbVar.getValue();
            if (vg4Var == null) {
                e18Var.a0(1585493559);
                e18Var.p(false);
            } else {
                e18Var.a0(1585493560);
                String title = vg4Var.d.getTitle();
                Tool.CustomTool customTool = vg4Var.d;
                Object objN4 = e18Var.N();
                if (objN4 == lz1Var) {
                    objN4 = new dy2(26, nwbVar);
                    e18Var.k0(objN4);
                }
                pwh.d(title, customTool, (zy7) objN4, null, null, e18Var, 384, 24);
                e18Var.p(false);
            }
            wg4Var2 = wg4Var3;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
            wg4Var2 = wg4Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new f44(zy7Var, i, iqbVar2, wg4Var2, 4);
        }
    }

    public static final void d(eyh eyhVar, bz7 bz7Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        iqb iqbVar2;
        bz7 bz7Var2 = bz7Var;
        eyhVar.getClass();
        bz7Var2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1526701233);
        if ((i & 6) == 0) {
            i2 = i | (e18Var.d(eyhVar.ordinal()) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(bz7Var2) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
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
            wo1 wo1Var = lja.Q;
            ho0 ho0Var = new ho0(4.0f, true, new sz6(1));
            iqb iqbVarV = xn5.V(fqbVar, gm3.b(e18Var).d);
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = new dy2(27, nwbVar);
                e18Var.k0(objN2);
            }
            iqb iqbVarK = gb9.K(androidx.compose.foundation.b.c(iqbVarV, false, null, null, null, (zy7) objN2, 15), 12.0f, 6.0f);
            cxe cxeVarA = axe.a(ho0Var, wo1Var, e18Var, 54);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarK);
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
            tjh.b(e(eyhVar, e18Var), null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 0, 131066);
            iv1.b(ud0.B, null, null, ef2.F, gm3.a(e18Var).N, e18Var, 3120, 4);
            e18Var.p(true);
            boolean zBooleanValue = ((Boolean) nwbVar.getValue()).booleanValue();
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = new dy2(25, nwbVar);
                e18Var.k0(objN3);
            }
            zy7 zy7Var = (zy7) objN3;
            bz7Var2 = bz7Var;
            j8.b(zBooleanValue, zy7Var, null, 0L, null, null, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(196068506, new xg4(bz7Var2, eyhVar, nwbVar, 0), e18Var), e18Var, 48, 2044);
            e18Var = e18Var;
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ji(i, 15, iqbVar2, eyhVar, bz7Var2);
        }
    }

    public static final String e(eyh eyhVar, ld4 ld4Var) {
        int i;
        eyhVar.getClass();
        int iOrdinal = eyhVar.ordinal();
        if (iOrdinal == 0) {
            i = R.string.connected_apps_permission_never;
        } else if (iOrdinal == 1) {
            i = R.string.connected_apps_permission_ask;
        } else {
            if (iOrdinal != 2) {
                wg6.i();
                return null;
            }
            i = R.string.connected_apps_permission_always;
        }
        return d4c.j0(i, ld4Var);
    }
}
