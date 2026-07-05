package defpackage;

import android.os.ext.SdkExtensions;
import android.view.LayoutInflater;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.project.menu.f;
import com.anthropic.claude.types.strings.SessionId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class quj {
    public static final ta4 a = new ta4(843866485, false, new ua4(0));

    public static final void a(String str, bz7 bz7Var, pz7 pz7Var, iqb iqbVar, wsg wsgVar, ld4 ld4Var, int i) {
        int i2;
        wsg wsgVar2;
        wsg wsgVarV;
        int i3;
        bz7Var.getClass();
        pz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-633905421);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(str != null ? SessionId.m1114boximpl(str) : null) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | (e18Var.h(bz7Var) ? 32 : 16) | (e18Var.f(pz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if ((i & 3072) == 0) {
            i4 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        int i5 = i4 | FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        if (e18Var.Q(i5 & 1, (i5 & 9363) != 9362)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                wsgVarV = zni.V("code_remote", str, e18Var, ((i5 << 3) & 112) | 6);
                i3 = i5 & (-57345);
            } else {
                e18Var.T();
                i3 = i5 & (-57345);
                wsgVarV = wsgVar;
            }
            e18Var.q();
            vve vveVarB = xve.b(24.0f);
            phg phgVarA = qhg.a(wsgVarV, e18Var, 0);
            q64 q64VarA = p64.a(ko0.c, lja.T, e18Var, 48);
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
            lsc lscVar = phgVarA.k;
            fqb fqbVar = fqb.E;
            wsg wsgVar3 = wsgVarV;
            v40.f(lscVar, gb9.N(gb9.L(fqbVar, 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 7), e18Var, 48);
            iqb iqbVarK = gb9.K(yfd.p(ez1.t(xn5.a0(b.c(fqbVar, 1.0f), vveVarB, new tzf(16.0f, d54.b(0.12f, d54.b), 4.0f, 0L, 56)), MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var).u, vveVarB), gm3.a(e18Var).n, vveVarB), 16.0f, 16.0f);
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarK);
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
            owj.f(bz7Var, wsgVar3, pz7Var, b.c(fqbVar, 1.0f), null, phgVarA, null, e18Var, (i3 & 896) | ((i3 >> 3) & 14) | 3072 | 262144, 80);
            e18Var.p(true);
            e18Var.p(true);
            wsgVar2 = wsgVar3;
        } else {
            e18Var.T();
            wsgVar2 = wsgVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pk((Object) str, (Object) bz7Var, (Object) pz7Var, iqbVar, (Object) wsgVar2, i, 4);
        }
    }

    public static final void b(Project project, boolean z, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, iqb iqbVar, pl3 pl3Var, ld4 ld4Var, int i) {
        iqb iqbVar2;
        e18 e18Var;
        pl3 pl3Var2;
        pl3 pl3Var3;
        int i2;
        iqb iqbVar3;
        pl3 pl3Var4;
        fqb fqbVar;
        long j;
        iqb iqbVar4;
        boolean z2;
        project.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        zy7Var3.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(291811236);
        int i3 = i | (e18Var2.f(project) ? 4 : 2) | (e18Var2.g(z) ? 32 : 16) | (e18Var2.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.h(zy7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var2.h(zy7Var3) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | 720896;
        if (e18Var2.Q(i3 & 1, (599187 & i3) != 599186)) {
            e18Var2.V();
            int i4 = i & 1;
            fqb fqbVar2 = fqb.E;
            lz1 lz1Var = jd4.a;
            if (i4 == 0 || e18Var2.A()) {
                m7f m7fVarN = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF = e18Var2.f(null) | e18Var2.f(m7fVarN);
                Object objN = e18Var2.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(pl3.class), null, null);
                    e18Var2.k0(objN);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                pl3Var3 = (pl3) objN;
                i2 = i3 & (-3670017);
                iqbVar3 = fqbVar2;
            } else {
                e18Var2.T();
                pl3Var3 = pl3Var;
                i2 = i3 & (-3670017);
                iqbVar3 = iqbVar;
            }
            e18Var2.q();
            Object[] objArr = new Object[0];
            Object objN2 = e18Var2.N();
            if (objN2 == lz1Var) {
                objN2 = new fc6(14);
                e18Var2.k0(objN2);
            }
            nwb nwbVar = (nwb) iuj.I(objArr, (zy7) objN2, e18Var2, 48);
            boolean zF2 = e18Var2.f(nwbVar);
            Object objN3 = e18Var2.N();
            if (zF2 || objN3 == lz1Var) {
                objN3 = new sy4(15, nwbVar);
                e18Var2.k0(objN3);
            }
            zy7 zy7Var4 = (zy7) objN3;
            gf8 gf8Var = (gf8) e18Var2.j(ve4.l);
            if (z) {
                e18Var2.a0(1257739945);
                pl3Var4 = pl3Var3;
                fqbVar = fqbVar2;
                j = gm3.a(e18Var2).q;
                e18Var2.p(false);
            } else {
                pl3Var4 = pl3Var3;
                fqbVar = fqbVar2;
                e18Var2.a0(1257740495);
                e18Var2.p(false);
                j = d54.g;
            }
            int i5 = i2;
            pl3 pl3Var5 = pl3Var4;
            fqb fqbVar3 = fqbVar;
            wlg wlgVarA = f8g.a(j, null, "drawer_item_background", e18Var2, 384, 10);
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, fqbVar3);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var2, z80Var, o5bVarD);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var2, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var2, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var2, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var2, z80Var4, iqbVarE);
            wo1 wo1Var = lja.Q;
            iqb iqbVar5 = iqbVar3;
            iqb iqbVarP = yfd.p(xn5.V(b.c(gb9.I(iqbVar3, e84.a), 1.0f), gm3.b(e18Var2).e), ((d54) wlgVarA.getValue()).a, zni.b);
            String strJ0 = d4c.j0(R.string.nav_drawer_project_item_click_label, e18Var2);
            String strJ02 = d4c.j0(R.string.nav_drawer_project_item_long_click_label, e18Var2);
            vue vueVar = new vue(0);
            boolean zF3 = e18Var2.f(nwbVar) | e18Var2.h(pl3Var5) | e18Var2.h(gf8Var);
            Object objN4 = e18Var2.N();
            if (zF3 || objN4 == lz1Var) {
                iqbVar4 = iqbVarP;
                z2 = true;
                objN4 = new hy2(pl3Var5, gf8Var, nwbVar, 1);
                e18Var2.k0(objN4);
            } else {
                iqbVar4 = iqbVarP;
                z2 = true;
            }
            iqb iqbVarE2 = androidx.compose.foundation.b.e(iqbVar4, strJ0, vueVar, strJ02, (zy7) objN4, zy7Var, 225);
            boolean z3 = (i5 & 112) == 32;
            Object objN5 = e18Var2.N();
            if (z3 || objN5 == lz1Var) {
                objN5 = new q8(z, 24);
                e18Var2.k0(objN5);
            }
            iqb iqbVarI = gb9.I(tjf.b(iqbVarE2, false, (bz7) objN5), e84.i);
            cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var2, 48);
            int iHashCode2 = Long.hashCode(e18Var2.T);
            hyc hycVarL2 = e18Var2.l();
            iqb iqbVarE3 = kxk.E(e18Var2, iqbVarI);
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, z80Var, cxeVarA);
            d4c.i0(e18Var2, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var2, z80Var3, e18Var2, bxVar);
            d4c.i0(e18Var2, z80Var4, iqbVarE3);
            iv1.b(ud0.e1, d4c.j0(R.string.generic_project, e18Var2), null, ef2.F, gm3.a(e18Var2).M, e18Var2, 3072, 4);
            kxk.g(e18Var2, b.t(fqbVar3, e84.f));
            tjh.b(project.getName(), new hw9(1.0f, true), gm3.a(e18Var2).M, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var2).e.E).g, e18Var2, 0, 24960, 110584);
            e18Var2.p(true);
            f.a(project, ((Boolean) nwbVar.getValue()).booleanValue(), zy7Var4, zy7Var2, null, zy7Var3, null, e18Var2, (i5 & 14) | 24576 | (i5 & 7168) | ((i5 << 3) & 458752));
            e18Var2.p(true);
            e18Var = e18Var2;
            pl3Var2 = pl3Var5;
            iqbVar2 = iqbVar5;
        } else {
            e18Var2.T();
            iqbVar2 = iqbVar;
            e18Var = e18Var2;
            pl3Var2 = pl3Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new uu0(project, z, zy7Var, zy7Var2, zy7Var3, iqbVar2, pl3Var2, i);
        }
    }

    public static final void c(long j, tkh tkhVar, z4g z4gVar, ta4 ta4Var, ld4 ld4Var, int i) {
        int i2;
        int i3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(117776499);
        if ((i & 6) == 0) {
            i2 = (e18Var.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(tkhVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.d(z4gVar.ordinal()) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.h(ta4Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        byte b = 0;
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            hvd hvdVarM = sq6.m(j, on4.a);
            xe4 xe4Var = tjh.a;
            int iOrdinal = z4gVar.ordinal();
            int i4 = 3;
            if (iOrdinal == 0) {
                i3 = 3;
            } else {
                if (iOrdinal != 1) {
                    wg6.i();
                    return;
                }
                i3 = 5;
            }
            j8.d(new hvd[]{hvdVarM, xe4Var.a(tkh.b(tkhVar, 0L, 0L, null, null, null, 0L, null, i3, 0L, null, 0, 16744447))}, fd9.q0(-1859333197, new tte(ta4Var, i4, b), e18Var), e18Var, 48);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ff2(j, tkhVar, z4gVar, ta4Var, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b0  */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(defpackage.iqb r18, defpackage.z4g r19, defpackage.pz7 r20, defpackage.pz7 r21, defpackage.pz7 r22, defpackage.pz7 r23, defpackage.ld4 r24, int r25, int r26) {
        /*
            Method dump skipped, instruction units count: 775
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.quj.d(iqb, z4g, pz7, pz7, pz7, pz7, ld4, int, int):void");
    }

    public static final void e(z4g z4gVar, pz7 pz7Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1157756432);
        if ((i & 6) == 0) {
            i2 = (e18Var.d(z4gVar.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(pz7Var) ? 32 : 16;
        }
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            fqb fqbVar = fqb.E;
            if (pz7Var != null) {
                e18Var.a0(2134633214);
                xo1 xo1Var = lja.K;
                k4g k4gVar = k4g.a;
                iqb iqbVarS = b.s(fqbVar, csg.A(44, e18Var), csg.A(44, e18Var), MTTypesetterKt.kLineSkipLimitMultiplier, 12);
                o5b o5bVarD = dw1.d(xo1Var, false);
                int iHashCode = Long.hashCode(e18Var.T);
                hyc hycVarL = e18Var.l();
                iqb iqbVarE = kxk.E(e18Var, iqbVarS);
                dd4.e.getClass();
                re4 re4Var = cd4.b;
                e18Var.e0();
                if (e18Var.S) {
                    e18Var.k(re4Var);
                } else {
                    e18Var.n0();
                }
                d4c.i0(e18Var, cd4.f, o5bVarD);
                d4c.i0(e18Var, cd4.e, hycVarL);
                d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
                d4c.h0(e18Var, cd4.h);
                d4c.i0(e18Var, cd4.d, iqbVarE);
                vb7.z((i2 >> 3) & 14, pz7Var, e18Var, true, false);
            } else if (z4gVar == z4g.E) {
                e18Var.a0(2135240535);
                k4g k4gVar2 = k4g.a;
                kxk.g(e18Var, b.o(fqbVar, csg.A(44, e18Var)));
                e18Var.p(false);
            } else {
                e18Var.a0(2135358738);
                e18Var.p(false);
            }
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new qq(z4gVar, pz7Var, i, 29);
        }
    }

    public static final boolean f(int i, int i2) {
        return i == i2;
    }

    public static final boolean g() {
        return SdkExtensions.getExtensionVersion(34) >= 13;
    }

    public static final boolean h() {
        return SdkExtensions.getExtensionVersion(34) >= 15;
    }

    public static final iqb i(iqb iqbVar, bz7 bz7Var) {
        return iqbVar.B(new gec(bz7Var));
    }

    public static final void j(Comparable comparable, Comparable comparable2, Comparable comparable3, String str) {
        comparable.getClass();
        comparable2.getClass();
        comparable3.getClass();
        l(comparable, comparable2, str);
        m(comparable, comparable3, str);
    }

    public static final void k(double d, String str) {
        if (d >= 0.0d) {
            return;
        }
        mr9.q(str.concat(" must not be negative"));
    }

    public static final void l(Comparable comparable, Comparable comparable2, String str) {
        comparable.getClass();
        comparable2.getClass();
        if (comparable.compareTo(comparable2) >= 0) {
            return;
        }
        throw new IllegalArgumentException((str + " must not be less than " + comparable2 + ", currently " + comparable + '.').toString());
    }

    public static final void m(Comparable comparable, Comparable comparable2, String str) {
        comparable.getClass();
        comparable2.getClass();
        if (comparable.compareTo(comparable2) <= 0) {
            return;
        }
        throw new IllegalArgumentException((str + " must not be more than " + comparable2 + ", currently " + comparable + '.').toString());
    }

    public static final void n(Map map) {
        Set<Map.Entry> setEntrySet = map.entrySet();
        int iD0 = tta.d0(x44.y(setEntrySet, 10));
        if (iD0 < 16) {
            iD0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (String) entry.getKey());
        }
    }

    public static void o(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
    }
}
