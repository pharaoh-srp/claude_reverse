package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.tool.TopSourceDomain;
import com.anthropic.claude.tool.model.SourceImage;
import com.anthropic.claude.types.strings.ResearchTaskId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xke {
    public static final void a(ArrayList arrayList, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-425375323);
        int i2 = (e18Var.f(arrayList) ? 4 : 2) | i;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
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
            d4c.i0(e18Var, cd4.f, q64VarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            if (arrayList.isEmpty()) {
                e18Var.a0(1291798855);
                e18Var.p(false);
            } else {
                sq6.A(4.0f, 1291488452, e18Var, e18Var, fqbVar);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    wd6.H(s64.a, true, null, null, null, null, fd9.q0(1653550462, new lca(11, (ar) it.next()), e18Var), e18Var, 1572918, 30);
                }
                e18Var.p(false);
            }
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ska(arrayList, i, 19);
        }
    }

    public static final void b(ar arVar, ld4 ld4Var, int i) {
        fqb fqbVar;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-532574541);
        int i2 = i | (e18Var.h(arVar) ? 4 : 2);
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            fqb fqbVar2 = fqb.E;
            iqb iqbVarC = b.c(fqbVar2, 1.0f);
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
            if (arVar.d) {
                e18Var.a0(10491865);
                fqbVar = fqbVar2;
                tjh.b(arVar.a, null, gm3.a(e18Var).M, 0L, null, null, null, 0L, null, null, 0L, 2, false, 5, 0, null, ((jm3) gm3.c(e18Var).e.E).e, e18Var, 0, 24960, 110586);
                e18Var = e18Var;
                e18Var.p(false);
            } else {
                fqbVar = fqbVar2;
                e18Var.a0(10762650);
                fhk.b(arVar.a, null, ((jm3) gm3.c(e18Var).e.E).e, gm3.a(e18Var).M, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, 5, 2, null, false, e18Var, 14155776, 0, 1842);
                e18Var.p(false);
            }
            kxk.g(e18Var, b.e(fqbVar, 4.0f));
            e18 e18Var2 = e18Var;
            tjh.b(d4c.k0(R.string.research_total_sources, new Object[]{Integer.valueOf(arVar.c)}, e18Var), null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var2, 0, 0, 131066);
            e18Var = e18Var2;
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ska(arVar, i, 20);
        }
    }

    public static final void c(String str, yle yleVar, zy7 zy7Var, qi3 qi3Var, ld4 ld4Var, int i) {
        e18 e18Var;
        qi3 qi3Var2;
        int i2;
        qi3 qi3Var3;
        str.getClass();
        yleVar.getClass();
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1803598705);
        int i3 = i | (e18Var2.f(str) ? 4 : 2) | (e18Var2.f(yleVar) ? 32 : 16) | (e18Var2.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | FreeTypeConstants.FT_LOAD_NO_RECURSE;
        if (e18Var2.Q(i3 & 1, (i3 & 1171) != 1170)) {
            e18Var2.V();
            int i4 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i4 == 0 || e18Var2.A()) {
                m7f m7fVarN = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF = e18Var2.f(null) | e18Var2.f(m7fVarN);
                Object objN = e18Var2.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(qi3.class), null, null);
                    e18Var2.k0(objN);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                i2 = i3 & (-7169);
                qi3Var3 = (qi3) objN;
            } else {
                e18Var2.T();
                i2 = i3 & (-7169);
                qi3Var3 = qi3Var;
            }
            e18Var2.q();
            boolean zH = e18Var2.h(qi3Var3);
            Object objN2 = e18Var2.N();
            if (zH || objN2 == lz1Var) {
                objN2 = new gw(qi3Var3, null, 27);
                e18Var2.k0(objN2);
            }
            csg.g((bz7) objN2, e18Var2, 0, 1);
            r4g r4gVarS = gb9.S(u4g.G, null, null, zy7Var, e18Var2, ((i2 << 3) & 7168) | 6, 6);
            amg amgVar = (amg) yleVar.d.get(ResearchTaskId.m1100boximpl(str));
            nwb nwbVarT = mpk.t(amgVar == null ? jm6.E : new v70(new v70(amgVar, 2), 2), null, null, e18Var2, 48, 2);
            j9f j9fVarY = mpk.Y(e18Var2);
            jme jmeVar = (jme) nwbVarT.getValue();
            String str2 = jmeVar != null ? jmeVar.g : null;
            k4g k4gVar = k4g.a;
            e18Var = e18Var2;
            auj.b(r4gVarS, str2, null, k4g.d(gm3.a(e18Var2).n, e18Var2, 14), false, null, null, null, null, fd9.q0(-1168114554, new u22(r4gVarS, 14), e18Var2), null, null, fd9.q0(1543779191, new u3e(nwbVarT, 2, j9fVarY), e18Var2), e18Var, 805306376, 384, 3572);
            qi3Var2 = qi3Var3;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            qi3Var2 = qi3Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v3e(str, yleVar, zy7Var, qi3Var2, i, 4);
        }
    }

    public static final void d(jme jmeVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(2053602387);
        int i2 = (e18Var.f(jmeVar) ? 4 : 2) | i;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
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
            d4c.i0(e18Var, cd4.f, q64VarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            boolean z = !jmeVar.h.isEmpty();
            ta4 ta4VarQ0 = fd9.q0(239615813, new lca(12, jmeVar), e18Var);
            s64 s64Var = s64.a;
            wd6.H(s64Var, z, null, null, null, null, ta4VarQ0, e18Var, 1572870, 30);
            List list = jmeVar.i;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                ar arVar = (ar) obj;
                if (arVar.c > 1 && arVar.a.length() > 0) {
                    arrayList.add(obj);
                }
            }
            wd6.H(s64Var, !arrayList.isEmpty(), null, null, null, null, fd9.q0(532913838, new wke(0, arrayList), e18Var), e18Var, 1572870, 30);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new tke(jmeVar, i, 3);
        }
    }

    public static final void e(String str, String str2, int i, float f, ld4 ld4Var, int i2) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(429323004);
        int i3 = i2 | (e18Var.f(str) ? 4 : 2) | (e18Var.f(str2) ? 32 : 16) | (e18Var.d(i) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.c(f) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            SourceImage.Url url = new SourceImage.Url(str2, null);
            fqb fqbVar = fqb.E;
            iqb iqbVarC = b.c(fqbVar, 1.0f);
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
            ueg.b(url, null, 0L, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, null, e18Var, 196608, 94);
            kxk.g(e18Var, b.t(fqbVar, 8.0f));
            boolean z = (i3 & 14) == 4;
            Object objN = e18Var.N();
            if (z || objN == jd4.a) {
                objN = bsg.R0(str, "www.");
                e18Var.k0(objN);
            }
            tjh.b((String) objN, new hw9(1.0f, true), gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 0, 131064);
            tjh.b(String.valueOf(i), gb9.L(fqbVar, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 48, 0, 131064);
            e18Var = e18Var;
            iqb iqbVarT = b.t(fqbVar, 95.0f);
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarT);
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
            dw1.a(yfd.p(xn5.V(b.e(b.t(fqbVar, (i / f) * 95.0f), 6.0f), xve.b(3.0f)), gm3.a(e18Var).v, zni.b), e18Var, 0);
            e18Var.p(true);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new uke(str, str2, i, f, i2);
        }
    }

    public static final void f(jme jmeVar, ld4 ld4Var, int i) {
        int i2;
        List list = jmeVar.h;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1178135387);
        int i3 = i | (e18Var.f(jmeVar) ? 4 : 2);
        if (e18Var.Q(i3 & 1, (i3 & 3) != 2)) {
            fqb fqbVar = fqb.E;
            iqb iqbVarJ = gb9.J(ez1.t(b.c(fqbVar, 1.0f), 1.0f, gm3.a(e18Var).v, xve.b(12.0f)), 16.0f);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
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
            d4c.i0(e18Var, cd4.f, q64VarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            tjh.b(d4c.j0(R.string.research_top_sources, e18Var), null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 0, 131066);
            e18Var = e18Var;
            kxk.g(e18Var, b.e(fqbVar, 8.0f));
            boolean zF = e18Var.f(list);
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                objN = w44.j1(w44.i1(list, new x8e(1)), 4);
                e18Var.k0(objN);
            }
            List list2 = (List) objN;
            if (list2.isEmpty()) {
                i2 = 0;
                e18Var.a0(-29635277);
                e18Var.p(false);
            } else {
                e18Var.a0(-30203228);
                float count = ((TopSourceDomain) w44.L0(list2)).getCount();
                int i4 = 0;
                for (Object obj : list2) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        x44.n0();
                        throw null;
                    }
                    TopSourceDomain topSourceDomain = (TopSourceDomain) obj;
                    if (i4 > 0) {
                        sq6.A(8.0f, 1962795249, e18Var, e18Var, fqbVar);
                        e18Var.p(false);
                    } else {
                        e18Var.a0(1962872129);
                        e18Var.p(false);
                    }
                    wd6.H(s64.a, true, null, null, null, null, fd9.q0(-794612903, new gz2(topSourceDomain, count, 2), e18Var), e18Var, 1572918, 30);
                    i4 = i5;
                }
                i2 = 0;
                e18Var.p(false);
            }
            e18Var.p(true);
        } else {
            i2 = 0;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new tke(jmeVar, i, i2);
        }
    }
}
