package defpackage;

import androidx.compose.foundation.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.mcp.McpServer;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cpk {
    public static final ta4 a = new ta4(387995629, false, new tb4(8));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v18, types: [nm6] */
    public static final void a(final List list, final x0a x0aVar, final Date date, final boolean z, final yih yihVar, final boolean z2, final pa3 pa3Var, final bz7 bz7Var, final zy7 zy7Var, final bz7 bz7Var2, final bz7 bz7Var3, final mnc mncVar, final ta4 ta4Var, final boolean z3, final boolean z4, final Set set, final bz7 bz7Var4, final p03 p03Var, final zy7 zy7Var2, final iqb iqbVar, ld4 ld4Var, final int i) {
        e18 e18Var;
        Object linkedHashMap;
        boolean z5;
        int i2;
        int i3;
        e18 e18Var2;
        list.getClass();
        x0aVar.getClass();
        date.getClass();
        yihVar.getClass();
        bz7Var.getClass();
        zy7Var.getClass();
        bz7Var2.getClass();
        bz7Var3.getClass();
        mncVar.getClass();
        set.getClass();
        bz7Var4.getClass();
        p03Var.getClass();
        zy7Var2.getClass();
        e18 e18Var3 = (e18) ld4Var;
        e18Var3.c0(438467270);
        int i4 = i | (e18Var3.f(list) ? 4 : 2) | (e18Var3.f(x0aVar) ? 32 : 16) | (e18Var3.h(date) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var3.g(z) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        boolean zF = e18Var3.f(yihVar);
        int i5 = FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        int i6 = i4 | (zF ? 16384 : 8192) | (e18Var3.g(z2) ? 131072 : 65536) | (e18Var3.f(pa3Var) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | (e18Var3.h(bz7Var) ? 8388608 : 4194304) | (e18Var3.h(zy7Var) ? 67108864 : 33554432) | (e18Var3.h(bz7Var2) ? 536870912 : 268435456);
        int i7 = 384 | (e18Var3.h(bz7Var3) ? 4 : 2) | (e18Var3.f(mncVar) ? 32 : 16) | (e18Var3.g(z3) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if (e18Var3.g(z4)) {
            i5 = 16384;
        }
        int i8 = i7 | i5 | (e18Var3.f(set) ? 131072 : 65536) | (e18Var3.h(bz7Var4) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | (e18Var3.f(p03Var) ? 8388608 : 4194304) | (e18Var3.h(zy7Var2) ? 67108864 : 33554432) | (e18Var3.f(iqbVar) ? 536870912 : 268435456);
        if (e18Var3.Q(i6 & 1, ((i6 & 306783379) == 306783378 && (i8 & 306783379) == 306783378) ? false : true)) {
            boolean z6 = yihVar.d().G.length() > 0;
            int i9 = i6 & 14;
            boolean zF2 = (i9 == 4) | e18Var3.f(date) | e18Var3.g(z6);
            Object objN = e18Var3.N();
            Object obj = jd4.a;
            Object obj2 = objN;
            if (zF2 || objN == obj) {
                if (z6) {
                    linkedHashMap = nm6.E;
                } else {
                    linkedHashMap = new LinkedHashMap();
                    for (Object obj3 : list) {
                        n6e n6eVarB = bm4.b(n6e.F, ((sx2) obj3).a.getUpdated_at().getTime(), date.getTime());
                        Object arrayList = linkedHashMap.get(n6eVarB);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            linkedHashMap.put(n6eVarB, arrayList);
                        }
                        ((List) arrayList).add(obj3);
                    }
                }
                e18Var3.k0(linkedHashMap);
                obj2 = linkedHashMap;
            }
            final Map map = (Map) obj2;
            boolean zG = e18Var3.g(p03Var.a);
            Object objN2 = e18Var3.N();
            if (zG || objN2 == obj) {
                objN2 = mpk.w(new k6(x0aVar, 10, p03Var));
                e18Var3.k0(objN2);
            }
            wlg wlgVar = (wlg) objN2;
            Boolean bool = (Boolean) wlgVar.getValue();
            bool.getClass();
            Integer numValueOf = Integer.valueOf(p03Var.d);
            int i10 = i8 & 234881024;
            boolean zF3 = e18Var3.f(wlgVar) | (i10 == 67108864);
            Object objN3 = e18Var3.N();
            if (zF3 || objN3 == obj) {
                z5 = false;
                objN3 = new nu(zy7Var2, wlgVar, 0);
                e18Var3.k0(objN3);
            } else {
                z5 = false;
            }
            mwa.e(bool, numValueOf, null, (bz7) objN3, e18Var3, 0);
            iqbVar.getClass();
            boolean zG2 = (i9 == 4) | ((i6 & 57344) == 16384) | ((i6 & 7168) == 2048 ? true : z5) | ((i8 & 7168) == 2048) | e18Var3.g(z6) | ((i6 & 458752) == 131072) | ((i6 & 3670016) == 1048576) | ((458752 & i8) == 131072) | ((i8 & 57344) == 16384) | ((3670016 & i8) == 1048576) | e18Var3.h(date) | ((i6 & 29360128) == 8388608) | ((1879048192 & i6) == 536870912) | ((i8 & 14) == 4) | ((i6 & 234881024) == 67108864) | e18Var3.h(map) | ((29360128 & i8) == 8388608) | (i10 == 67108864);
            Object objN4 = e18Var3.N();
            if (zG2 || objN4 == obj) {
                i2 = i8;
                i3 = i6;
                final boolean z7 = z6;
                Object obj4 = new bz7() { // from class: ou
                    @Override // defpackage.bz7
                    public final Object invoke(Object obj5) {
                        pa3 pa3Var2;
                        j0a j0aVar = (j0a) obj5;
                        j0aVar.getClass();
                        int i11 = 0;
                        if (z) {
                            j0a.V(j0aVar, null, null, new ta4(1967550454, true, new qu(yihVar, i11)), 3);
                        }
                        boolean z8 = z3;
                        boolean z9 = z7;
                        if (!z8 || z9) {
                            List list2 = list;
                            if (z9 && !z2 && list2.isEmpty()) {
                                j0a.V(j0aVar, null, null, auj.a, 3);
                            } else {
                                int i12 = 2;
                                if (z9 && list2.isEmpty() && ((pa3Var2 = pa3Var) == null || !pa3Var2.b)) {
                                    j0a.V(j0aVar, null, null, new ta4(-1661177675, true, new nn(i12, pa3Var2)), 3);
                                } else {
                                    su suVar = new su(set, z4, bz7Var4, date, bz7Var, bz7Var2, bz7Var3, zy7Var);
                                    if (z9) {
                                        suVar.invoke(j0aVar, list2);
                                    } else {
                                        for (n6e n6eVar : n6e.P) {
                                            List list3 = (List) map.get(n6eVar);
                                            List list4 = list3;
                                            if (list4 != null && !list4.isEmpty()) {
                                                suVar.invoke(j0aVar, list3);
                                                j0a.V(j0aVar, grc.p(n6eVar.E, "section-spacer:"), null, auj.b, 2);
                                            }
                                        }
                                    }
                                    p03 p03Var2 = p03Var;
                                    if (p03Var2.c) {
                                        j0a.V(j0aVar, "pagination-error", null, new ta4(-483555768, true, new tu(i11, zy7Var2)), 2);
                                    } else if (p03Var2.b) {
                                        j0a.V(j0aVar, "pagination-loading", null, auj.c, 2);
                                    }
                                }
                            }
                        } else {
                            j0a.V(j0aVar, null, null, new ta4(-349558099, true, new ru(ta4Var, i11)), 3);
                        }
                        return iei.a;
                    }
                };
                e18 e18Var4 = e18Var3;
                e18Var4.k0(obj4);
                objN4 = obj4;
                e18Var2 = e18Var4;
            } else {
                i2 = i8;
                i3 = i6;
                e18Var2 = e18Var3;
            }
            knk.h(iqbVar, x0aVar, mncVar, false, null, null, null, false, null, (bz7) objN4, e18Var2, (i3 & 112) | ((i2 << 3) & 896), 504);
            e18Var = e18Var2;
        } else {
            e18Var3.T();
            e18Var = e18Var3;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7(list, x0aVar, date, z, yihVar, z2, pa3Var, bz7Var, zy7Var, bz7Var2, bz7Var3, mncVar, ta4Var, z3, z4, set, bz7Var4, p03Var, zy7Var2, iqbVar, i) { // from class: pu
                public final /* synthetic */ List E;
                public final /* synthetic */ x0a F;
                public final /* synthetic */ Date G;
                public final /* synthetic */ boolean H;
                public final /* synthetic */ yih I;
                public final /* synthetic */ boolean J;
                public final /* synthetic */ pa3 K;
                public final /* synthetic */ bz7 L;
                public final /* synthetic */ zy7 M;
                public final /* synthetic */ bz7 N;
                public final /* synthetic */ bz7 O;
                public final /* synthetic */ mnc P;
                public final /* synthetic */ ta4 Q;
                public final /* synthetic */ boolean R;
                public final /* synthetic */ boolean S;
                public final /* synthetic */ Set T;
                public final /* synthetic */ bz7 U;
                public final /* synthetic */ p03 V;
                public final /* synthetic */ zy7 W;
                public final /* synthetic */ iqb X;

                @Override // defpackage.pz7
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    int iP0 = x44.p0(1);
                    cpk.a(this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, (ld4) obj5, iP0);
                    return iei.a;
                }
            };
        }
    }

    public static final void b(McpServer mcpServer, String str, pz7 pz7Var, zy7 zy7Var, pl3 pl3Var, iqb iqbVar, zy7 zy7Var2, oxf oxfVar, mnc mncVar, ld4 ld4Var, int i) {
        e18 e18Var;
        boolean z;
        boolean z2;
        iqb iqbVar2;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(252977163);
        int i2 = i | (e18Var2.f(mcpServer) ? 4 : 2) | (e18Var2.f(str) ? 32 : 16) | (e18Var2.h(pz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var2.f(pl3Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var2.f(iqbVar) ? 131072 : 65536) | (e18Var2.h(zy7Var2) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | (e18Var2.f(oxfVar) ? 8388608 : 4194304) | (e18Var2.f(mncVar) ? 67108864 : 33554432) | (e18Var2.c(56.0f) ? 536870912 : 268435456);
        if (e18Var2.Q(i2 & 1, (i2 & 306783379) != 306783378)) {
            e18Var2.V();
            if ((i & 1) != 0 && !e18Var2.A()) {
                e18Var2.T();
            }
            e18Var2.q();
            Object[] objArr = new Object[0];
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new mia(24);
                e18Var2.k0(objN);
            }
            nwb nwbVar = (nwb) iuj.I(objArr, (zy7) objN, e18Var2, 48);
            boolean zF = e18Var2.f(nwbVar);
            Object objN2 = e18Var2.N();
            if (zF || objN2 == lz1Var) {
                objN2 = new d29(12, nwbVar);
                e18Var2.k0(objN2);
            }
            zy7 zy7Var3 = (zy7) objN2;
            gf8 gf8Var = (gf8) e18Var2.j(ve4.l);
            boolean z3 = zy7Var2 != null && x44.r(mcpServer.getConnected(), Boolean.TRUE);
            boolean zBooleanValue = ((Boolean) nwbVar.getValue()).booleanValue();
            ta4 ta4VarQ0 = null;
            zy7 zy7Var4 = z3 ? zy7Var3 : null;
            if (z3) {
                e18Var2.a0(-1223608638);
                z = z3;
                ta4VarQ0 = fd9.q0(594486634, new vv4(zy7Var3, zy7Var2, nwbVar, 2), e18Var2);
                z2 = false;
                e18Var2.p(false);
            } else {
                z = z3;
                z2 = false;
                e18Var2.a0(-1223367118);
                e18Var2.p(false);
            }
            ta4 ta4Var = ta4VarQ0;
            iqb iqbVarP = ybi.p(iqbVar, oxfVar);
            iqb iqbVarC = fqb.E;
            if (zy7Var == null) {
                e18Var2.a0(-1702026189);
                e18Var2.p(z2);
                iqbVar2 = iqbVarP;
            } else if (z) {
                e18Var2.a0(-1223143638);
                String strJ0 = d4c.j0(R.string.generic_button_open_menu, e18Var2);
                boolean zF2 = e18Var2.f(nwbVar) | ((i2 & 57344) == 16384) | e18Var2.h(gf8Var);
                Object objN3 = e18Var2.N();
                if (zF2 || objN3 == lz1Var) {
                    objN3 = new hy2(pl3Var, gf8Var, nwbVar, 2);
                    e18Var2.k0(objN3);
                }
                iqbVar2 = iqbVarP;
                iqbVarC = b.e(iqbVarC, null, null, strJ0, (zy7) objN3, zy7Var, 231);
                e18Var2.p(false);
            } else {
                iqbVar2 = iqbVarP;
                e18Var2.a0(-1702011673);
                e18Var2.p(z2);
                iqbVarC = b.c(iqbVarC, false, null, null, null, zy7Var, 15);
            }
            int i3 = i2 >> 6;
            e18Var = e18Var2;
            ybi.b(fd9.q0(784527284, new l03(mcpServer, 1), e18Var2), fd9.q0(666890515, new yi7(str, 15), e18Var2), iqbVar2.B(iqbVarC), null, pz7Var, 0L, mncVar, 56.0f, null, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, zBooleanValue, zy7Var4, ta4Var, e18Var, ((i2 << 6) & 57344) | 54 | (3670016 & i3) | (i3 & 29360128), 0, 1832);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new jn0(mcpServer, str, pz7Var, zy7Var, pl3Var, iqbVar, zy7Var2, oxfVar, mncVar, i, 4);
        }
    }

    public static final void c(zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(773788919);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(zy7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        int i4 = 0;
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            xo1 xo1Var = lja.K;
            iqbVar2 = fqb.E;
            iqb iqbVarL = gb9.L(androidx.compose.foundation.layout.b.c(iqbVar2, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 1);
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarL);
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
            qnc qncVar = q02.a;
            csg.j(zy7Var, null, false, null, q02.d(0L, gm3.a(e18Var).c, 0L, e18Var, 13), null, null, auj.d, e18Var, (i3 & 14) | 805306368, 494);
            e18Var = e18Var;
            e18Var.p(true);
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new mu(zy7Var, iqbVar2, i, i4);
        }
    }

    public static final List d(kkh kkhVar, wwb wwbVar) {
        if (wwbVar != null && wwbVar.G != 0) {
            return w44.p1(wwbVar.g());
        }
        if (kkhVar != null) {
            long j = kkhVar.a;
            if (!kkh.d(j)) {
                return x44.W(new yb0(new egg(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, qeh.c, null, 61439), kkh.g(j), kkh.f(j)));
            }
        }
        return lm6.E;
    }

    public static final void e(yih yihVar) {
        dfh dfhVarG = yihVar.g();
        try {
            dfhVarG.c(0, dfhVarG.F.length(), "");
            bok.j(dfhVarG);
            yihVar.b(dfhVarG);
        } finally {
            yihVar.c();
        }
    }

    public static int f(dqh dqhVar, dqh dqhVar2) {
        dqhVar2.getClass();
        return uh6.d(dqh.b(dqhVar.E, dqhVar2.E), 0L);
    }

    public static final int g(yr9 yr9Var) {
        yr9Var.getClass();
        jc0 jc0VarP = yr9Var.getAnnotations().P(okg.q);
        if (jc0VarP == null) {
            return 0;
        }
        il4 il4Var = (il4) sta.f0(pkg.d, jc0VarP.f());
        il4Var.getClass();
        return ((Number) ((i79) il4Var).a).intValue();
    }

    public static final j7g h(or9 or9Var, wc0 wc0Var, yr9 yr9Var, List list, ArrayList arrayList, yr9 yr9Var2, boolean z) {
        qqb qqbVarJ;
        wc0 xc0Var = dd8.F;
        int i = 0;
        ArrayList arrayList2 = new ArrayList(list.size() + arrayList.size() + (yr9Var != null ? 1 : 0) + 1);
        List<yr9> list2 = list;
        ArrayList arrayList3 = new ArrayList(x44.y(list2, 10));
        for (yr9 yr9Var3 : list2) {
            yr9Var3.getClass();
            arrayList3.add(new wai(1, yr9Var3));
        }
        arrayList2.addAll(arrayList3);
        wai waiVar = yr9Var != null ? new wai(1, yr9Var) : null;
        if (waiVar != null) {
            arrayList2.add(waiVar);
        }
        int i2 = 0;
        for (Object obj : arrayList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                x44.n0();
                throw null;
            }
            yr9 yr9Var4 = (yr9) obj;
            yr9Var4.getClass();
            arrayList2.add(new wai(1, yr9Var4));
            i2 = i3;
        }
        arrayList2.add(new wai(1, yr9Var2));
        int size = list.size() + arrayList.size() + (yr9Var == null ? 0 : 1);
        if (z) {
            qqbVarJ = or9Var.u(size);
        } else {
            sxb sxbVar = pkg.a;
            qqbVarJ = or9Var.j("Function" + size);
        }
        if (yr9Var != null) {
            ww7 ww7Var = okg.p;
            if (!wc0Var.x(ww7Var)) {
                ArrayList arrayListZ0 = w44.Z0(wc0Var, new kz1(or9Var, ww7Var, nm6.E));
                wc0Var = arrayListZ0.isEmpty() ? xc0Var : new xc0(arrayListZ0, i);
            }
        }
        if (!list.isEmpty()) {
            int size2 = list.size();
            ww7 ww7Var2 = okg.q;
            if (!wc0Var.x(ww7Var2)) {
                Map mapSingletonMap = Collections.singletonMap(pkg.d, new i79(size2));
                mapSingletonMap.getClass();
                ArrayList arrayListZ02 = w44.Z0(wc0Var, new kz1(or9Var, ww7Var2, mapSingletonMap));
                if (!arrayListZ02.isEmpty()) {
                    xc0Var = new xc0(arrayListZ02, i);
                }
                wc0Var = xc0Var;
            }
        }
        return yfd.b0(rvk.q(wc0Var), qqbVarJ, arrayList2);
    }

    public static final sxb i(yr9 yr9Var) {
        String str;
        jc0 jc0VarP = yr9Var.getAnnotations().P(okg.r);
        if (jc0VarP != null) {
            Object objF1 = w44.f1(jc0VarP.f().values());
            yrg yrgVar = objF1 instanceof yrg ? (yrg) objF1 : null;
            if (yrgVar != null && (str = (String) yrgVar.a) != null) {
                if (!sxb.f(str)) {
                    str = null;
                }
                if (str != null) {
                    return sxb.e(str);
                }
            }
        }
        return null;
    }

    public static koe j(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("id").m();
            strM.getClass();
            return new koe(strM);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type ContainerView", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type ContainerView", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type ContainerView", e3);
            return null;
        }
    }

    public static final List k(yr9 yr9Var) {
        yr9Var.getClass();
        q(yr9Var);
        int iG = g(yr9Var);
        if (iG == 0) {
            return lm6.E;
        }
        List listSubList = yr9Var.H().subList(0, iG);
        ArrayList arrayList = new ArrayList(x44.y(listSubList, 10));
        Iterator it = listSubList.iterator();
        while (it.hasNext()) {
            yr9 yr9VarB = ((vai) it.next()).b();
            yr9VarB.getClass();
            arrayList.add(yr9VarB);
        }
        return arrayList;
    }

    public static final e08 l(xh3 xh3Var) {
        if (!(xh3Var instanceof qqb) || !or9.H(xh3Var)) {
            return null;
        }
        int i = o06.a;
        xw7 xw7VarG = m06.g(xh3Var);
        xw7VarG.getClass();
        if (!xw7VarG.d() || xw7VarG.a.isEmpty()) {
            return null;
        }
        k2e k2eVar = e08.G;
        String strB = xw7VarG.f().b();
        strB.getClass();
        ww7 ww7VarE = xw7VarG.g().e();
        k2eVar.getClass();
        d08 d08VarU = k2e.u(strB, ww7VarE);
        if (d08VarU != null) {
            return d08VarU.a;
        }
        return null;
    }

    public static final yr9 m(yr9 yr9Var) {
        yr9Var.getClass();
        q(yr9Var);
        if (yr9Var.getAnnotations().P(okg.p) == null) {
            return null;
        }
        return ((vai) yr9Var.H().get(g(yr9Var))).b();
    }

    public static final yr9 n(yr9 yr9Var) {
        yr9Var.getClass();
        q(yr9Var);
        yr9 yr9VarB = ((vai) w44.U0(yr9Var.H())).b();
        yr9VarB.getClass();
        return yr9VarB;
    }

    public static final List o(yr9 yr9Var) {
        yr9Var.getClass();
        q(yr9Var);
        return yr9Var.H().subList((p(yr9Var) ? 1 : 0) + g(yr9Var), r0.size() - 1);
    }

    public static final boolean p(yr9 yr9Var) {
        yr9Var.getClass();
        return q(yr9Var) && yr9Var.getAnnotations().P(okg.p) != null;
    }

    public static final boolean q(yr9 yr9Var) {
        yr9Var.getClass();
        xh3 xh3VarA = yr9Var.O().a();
        if (xh3VarA == null) {
            return false;
        }
        e08 e08VarL = l(xh3VarA);
        return e08VarL == e08.H || e08VarL == e08.I;
    }

    public static final boolean r(j7g j7gVar) {
        xh3 xh3VarA = j7gVar.O().a();
        return (xh3VarA != null ? l(xh3VarA) : null) == e08.H;
    }

    public static final boolean s(yr9 yr9Var) {
        yr9Var.getClass();
        xh3 xh3VarA = yr9Var.O().a();
        return (xh3VarA != null ? l(xh3VarA) : null) == e08.I;
    }

    public static final yih t(int i, int i2, ld4 ld4Var, String str) {
        boolean z = true;
        if ((i2 & 1) != 0) {
            str = "";
        }
        int length = str.length();
        long jM = mwa.m(length, length);
        Object[] objArr = new Object[0];
        if ((((i & 14) ^ 6) <= 4 || !((e18) ld4Var).f(str)) && (i & 6) != 4) {
            z = false;
        }
        boolean zE = ((e18) ld4Var).e(jM) | z;
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        if (zE || objN == jd4.a) {
            objN = new nx4(str, jM, 3);
            e18Var.k0(objN);
        }
        return (yih) iuj.K(objArr, xih.b, (zy7) objN, e18Var, 48);
    }

    public static final void u(yih yihVar, String str) {
        dfh dfhVarG = yihVar.g();
        try {
            dfhVarG.c(0, dfhVarG.F.length(), str);
            bok.j(dfhVarG);
            yihVar.b(dfhVarG);
        } finally {
            yihVar.c();
        }
    }

    public static String v(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (iIndexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, iIndexOf);
            sb.append(x(objArr[i]));
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(x(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String w(String str) {
        return str == null ? "" : str;
    }

    public static String x(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String strC = ij0.C(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strC), (Throwable) e);
            return ij0.l("<", strC, " threw ", e.getClass().getName(), ">");
        }
    }
}
