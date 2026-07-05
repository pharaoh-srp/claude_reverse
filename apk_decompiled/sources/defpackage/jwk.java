package defpackage;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.messages.ApiHelpline;
import com.anthropic.claude.api.chat.messages.h;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jwk {
    public static final m45 a = m45.E;

    public static final Object A(poj pojVar) {
        yi9 yi9Var = (yi9) pojVar.E;
        bp5 bp5Var = new bp5();
        bp5Var.E = yi9Var;
        bp5Var.F = bp5Var;
        m45 m45Var = a;
        bp5Var.G = m45Var;
        while (true) {
            Object obj = bp5Var.G;
            tp4 tp4Var = bp5Var.F;
            if (tp4Var == null) {
                sf5.h0(obj);
                return obj;
            }
            if (x44.r(m45Var, obj)) {
                try {
                    yi9 yi9Var2 = bp5Var.E;
                    nai.n(3, yi9Var2);
                    yi9 yi9Var3 = new yi9(yi9Var2.H, tp4Var);
                    yi9Var3.G = bp5Var;
                    Object objInvokeSuspend = yi9Var3.invokeSuspend(iei.a);
                    if (objInvokeSuspend != m45.E) {
                        tp4Var.resumeWith(objInvokeSuspend);
                    }
                } catch (Throwable th) {
                    tp4Var.resumeWith(new hre(th));
                }
            } else {
                bp5Var.G = m45Var;
                tp4Var.resumeWith(obj);
            }
        }
    }

    public static final boolean B(j7g j7gVar) {
        return (j7gVar instanceof ku6) && ((ku6) j7gVar).H.F;
    }

    public static final yr9 C(yr9 yr9Var) {
        yr9Var.getClass();
        fhi fhiVarG = fbi.g(yr9Var);
        fhiVarG.getClass();
        return fhiVarG;
    }

    public static final yr9 D(yr9 yr9Var, wc0 wc0Var) {
        return (yr9Var.getAnnotations().isEmpty() && wc0Var.isEmpty()) ? yr9Var : yr9Var.k0().n0(rvk.m(yr9Var.K(), wc0Var));
    }

    public static final fhi E(yr9 yr9Var) {
        fhi fhiVarJ;
        fhi fhiVarK0 = yr9Var.k0();
        if (fhiVarK0 instanceof sn7) {
            sn7 sn7Var = (sn7) fhiVarK0;
            j7g j7gVarJ = sn7Var.F;
            if (!j7gVarJ.O().getParameters().isEmpty() && j7gVarJ.O().a() != null) {
                List parameters = j7gVarJ.O().getParameters();
                parameters.getClass();
                List list = parameters;
                ArrayList arrayList = new ArrayList(x44.y(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new skg((qai) it.next()));
                }
                j7gVarJ = dwk.j(j7gVarJ, arrayList, null, 2);
            }
            j7g j7gVarJ2 = sn7Var.G;
            if (!j7gVarJ2.O().getParameters().isEmpty() && j7gVarJ2.O().a() != null) {
                List parameters2 = j7gVarJ2.O().getParameters();
                parameters2.getClass();
                List list2 = parameters2;
                ArrayList arrayList2 = new ArrayList(x44.y(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new skg((qai) it2.next()));
                }
                j7gVarJ2 = dwk.j(j7gVarJ2, arrayList2, null, 2);
            }
            fhiVarJ = yfd.z(j7gVarJ, j7gVarJ2);
        } else {
            if (!(fhiVarK0 instanceof j7g)) {
                wg6.i();
                return null;
            }
            j7g j7gVar = (j7g) fhiVarK0;
            boolean zIsEmpty = j7gVar.O().getParameters().isEmpty();
            fhiVarJ = j7gVar;
            if (!zIsEmpty) {
                xh3 xh3VarA = j7gVar.O().a();
                fhiVarJ = j7gVar;
                if (xh3VarA != null) {
                    List parameters3 = j7gVar.O().getParameters();
                    parameters3.getClass();
                    List list3 = parameters3;
                    ArrayList arrayList3 = new ArrayList(x44.y(list3, 10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new skg((qai) it3.next()));
                    }
                    fhiVarJ = dwk.j(j7gVar, arrayList3, null, 2);
                }
            }
        }
        return nwk.h(fhiVarJ, fhiVarK0);
    }

    public static final void a(boolean z, boolean z2, boolean z3, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        lz1 lz1Var;
        int i3;
        zub zubVar;
        boolean z4;
        long j;
        long j2;
        boolean z5;
        zy7Var.getClass();
        zy7Var2.getClass();
        zy7Var3.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-2017298691);
        if ((i & 6) == 0) {
            i2 = (e18Var2.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.g(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.g(z3) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var2.h(zy7Var2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var2.h(zy7Var3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= e18Var2.f(iqbVar) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        int i4 = i2;
        if (e18Var2.Q(i4 & 1, (i4 & 599187) != 599186)) {
            Object objN = e18Var2.N();
            lz1 lz1Var2 = jd4.a;
            if (objN == lz1Var2) {
                objN = vb7.f(e18Var2);
            }
            zub zubVar2 = (zub) objN;
            nwb nwbVarZ = mpk.Z(zy7Var, e18Var2);
            nwb nwbVarZ2 = mpk.Z(zy7Var2, e18Var2);
            Boolean boolValueOf = Boolean.valueOf(z);
            int i5 = i4 & 14;
            boolean zF = (i5 == 4) | e18Var2.f(nwbVarZ) | e18Var2.f(nwbVarZ2);
            Object objN2 = e18Var2.N();
            if (zF || objN2 == lz1Var2) {
                lz1Var = lz1Var2;
                i3 = i5;
                objN2 = new jk1(z, zubVar2, nwbVarZ, nwbVarZ2, null);
                zubVar = zubVar2;
                e18Var2.k0(objN2);
            } else {
                lz1Var = lz1Var2;
                i3 = i5;
                zubVar = zubVar2;
            }
            fd9.j(zubVar, boolValueOf, (pz7) objN2, e18Var2);
            zub zubVar3 = zubVar;
            wlg wlgVarB = n80.b(z ? 1.0f : 0.0f, kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, 400.0f, null, 5), "centerControlWidth", e18Var2, 3120, 20);
            wlg wlgVarA = n80.a(z ? 0.0f : 8.0f, kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, 400.0f, null, 5), "centerControlEndPadding", e18Var2, 432, 8);
            boolean z6 = z ? z2 : z3;
            if (z6) {
                e18Var2.a0(-1593731066);
                j = gm3.a(e18Var2).z;
                z4 = false;
            } else {
                z4 = false;
                e18Var2.a0(-1593729982);
                j = gm3.a(e18Var2).n;
            }
            e18Var2.p(z4);
            wlg wlgVarA2 = f8g.a(j, kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, 400.0f, null, 5), "centerControlContainer", e18Var2, 432, 8);
            if (z6) {
                e18Var2.a0(-1593722526);
                e18Var2.p(z4);
                j2 = d54.d;
            } else if (z) {
                e18Var2.a0(-1593720698);
                j2 = gm3.a(e18Var2).z;
                e18Var2.p(z4);
            } else {
                e18Var2.a0(-1593719132);
                j2 = gm3.a(e18Var2).M;
                e18Var2.p(z4);
            }
            wlg wlgVarA3 = f8g.a(j2, kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, 400.0f, null, 5), "centerControlContent", e18Var2, 432, 8);
            o5b o5bVarD = dw1.d(lja.L, z4);
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
            d4c.i0(e18Var2, cd4.f, o5bVarD);
            d4c.i0(e18Var2, cd4.e, hycVarL);
            d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var2, cd4.h);
            d4c.i0(e18Var2, cd4.d, iqbVarE);
            vve vveVar = xve.a;
            qnc qncVar = q02.a;
            n02 n02VarA = q02.a(((d54) wlgVarA2.getValue()).a, ((d54) wlgVarA3.getValue()).a, 0L, 0L, e18Var2, 12);
            e18Var = e18Var2;
            s02 s02VarB = q02.b(28);
            qnc qncVar2 = new qnc(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier);
            iqb iqbVarC = b.c(b.v(b.e(gb9.N(fqb.E, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, ((va6) wlgVarA.getValue()).E, MTTypesetterKt.kLineSkipLimitMultiplier, 11), 44.0f), 44.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), ((Number) wlgVarB.getValue()).floatValue());
            boolean z7 = (i3 == 4) | ((i4 & 458752) == 131072);
            Object objN3 = e18Var.N();
            if (z7 || objN3 == lz1Var) {
                z5 = z;
                objN3 = new sp(z5, zy7Var3, 1);
                e18Var.k0(objN3);
            } else {
                z5 = z;
            }
            csg.a((zy7) objN3, iqbVarC, false, vveVar, n02VarA, s02VarB, null, qncVar2, zubVar3, fd9.q0(-1209072781, new yj1(z5, z3, wlgVarA3), e18Var), e18Var, 918552576, 68);
            e18Var.p(true);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new zj1(z, z2, z3, zy7Var, zy7Var2, zy7Var3, iqbVar, i, 0);
        }
    }

    public static final void b(zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        zy7 zy7Var2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(558630423);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(zy7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            vve vveVar = xve.a;
            long j = gm3.a(e18Var).M;
            long j2 = gm3.a(e18Var).n;
            xo7 xo7Var = new xo7(2.0f, 1.0f, ac1.h, ac1.i);
            fqb fqbVar = fqb.E;
            zy7Var2 = zy7Var;
            zmk.e(zy7Var2, b.o(fqbVar, 44.0f), vveVar, j, j2, xo7Var, pvj.H, e18Var, (i3 & 14) | 12582912);
            iqbVar = fqbVar;
        } else {
            zy7Var2 = zy7Var;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new mu(zy7Var2, iqbVar, i, 3);
        }
    }

    public static final void c(Set set, String str, qi3 qi3Var, iqb iqbVar, ApiHelpline apiHelpline, zy7 zy7Var, zy7 zy7Var2, ld4 ld4Var, int i) {
        int i2;
        set.getClass();
        str.getClass();
        qi3Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(951295806);
        int i3 = 4;
        int i4 = (e18Var.h(zy7Var2) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | i | (e18Var.f(set) ? 4 : 2) | (e18Var.f(str) ? 32 : 16) | (e18Var.f(qi3Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.f(iqbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.f(apiHelpline) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.h(zy7Var) ? 131072 : 65536);
        if (e18Var.Q(i4 & 1, (599187 & i4) != 599186)) {
            Context context = (Context) e18Var.j(w00.b);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = mpk.P(Boolean.FALSE);
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            boolean zG = e18Var.g(((Boolean) nwbVar.getValue()).booleanValue()) | ((i4 & 14) == 4);
            Object objN2 = e18Var.N();
            if (zG || objN2 == lz1Var) {
                objN2 = Boolean.valueOf(!((Boolean) nwbVar.getValue()).booleanValue() && set.contains(h.a));
                e18Var.k0(objN2);
            }
            if (((Boolean) objN2).booleanValue()) {
                e18Var.a0(1859686395);
                boolean z = (apiHelpline == null || (apiHelpline.getPhone_number() == null && apiHelpline.getSms_number() == null)) ? false : true;
                int i5 = i4 & 896;
                int i6 = i4 & 112;
                boolean z2 = (i5 == 256) | (i6 == 32);
                Object objN3 = e18Var.N();
                if (z2 || objN3 == lz1Var) {
                    objN3 = new j55(qi3Var, str, i3);
                    e18Var.k0(objN3);
                }
                zy7 zy7Var3 = (zy7) objN3;
                boolean zH = (i5 == 256) | (i6 == 32) | e18Var.h(context);
                Object objN4 = e18Var.N();
                if (zH || objN4 == lz1Var) {
                    i2 = 1;
                    objN4 = new k55(qi3Var, str, context, i2);
                    e18Var.k0(objN4);
                } else {
                    i2 = 1;
                }
                zy7 zy7Var4 = (zy7) objN4;
                int i7 = (i5 != 256 ? 0 : i2) | (i6 == 32 ? i2 : 0);
                Object objN5 = e18Var.N();
                if (i7 != 0 || objN5 == lz1Var) {
                    objN5 = new j55(qi3Var, str, 5);
                    e18Var.k0(objN5);
                }
                zy7 zy7Var5 = (zy7) objN5;
                int i8 = (i5 != 256 ? 0 : i2) | (i6 == 32 ? i2 : 0) | ((3670016 & i4) == 1048576 ? i2 : 0);
                Object objN6 = e18Var.N();
                if (i8 != 0 || objN6 == lz1Var) {
                    uj6 uj6Var = new uj6(qi3Var, str, zy7Var2, nwbVar, 1);
                    e18Var.k0(uj6Var);
                    objN6 = uj6Var;
                }
                q(iqbVar, z, zy7Var3, zy7Var, zy7Var4, zy7Var5, (zy7) objN6, e18Var, ((i4 >> 9) & 14) | ((i4 >> 6) & 7168), 0);
                e18Var.p(false);
            } else {
                e18Var.a0(1860838820);
                e18Var.p(false);
            }
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new lw(set, str, qi3Var, iqbVar, apiHelpline, zy7Var, zy7Var2, i);
        }
    }

    public static final void d(boolean z, bz7 bz7Var, zb0 zb0Var, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1491836751);
        int i2 = i | (e18Var.g(z) ? 4 : 2) | (e18Var.h(bz7Var) ? 32 : 16) | (e18Var.f(zb0Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 3072;
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            wo1 wo1Var = lja.P;
            ho0 ho0Var = new ho0(12.0f, true, new sz6(1));
            fqb fqbVar = fqb.E;
            iqb iqbVarL = gb9.L(kzj.h(xn5.V(b.c(fqbVar, 1.0f), gm3.b(e18Var).d), z, false, new vue(1), bz7Var, 10), MTTypesetterKt.kLineSkipLimitMultiplier, 4.0f, 1);
            cxe cxeVarA = axe.a(ho0Var, wo1Var, e18Var, 54);
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
            d4c.i0(e18Var, cd4.f, cxeVarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            ckk.a(z, null, null, false, akk.d(gm3.a(e18Var).c, gm3.a(e18Var).v, gm3.a(e18Var).F, e18Var, 56), e18Var, (i2 & 14) | 48, 44);
            tjh.c(zb0Var, new hw9(1.0f, true), gm3.a(e18Var).N, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, (tkh) ((wk) gm3.c(e18Var).e.F).f, e18Var, (i2 >> 6) & 14, 0, 262136);
            e18Var = e18Var;
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new sq(z, bz7Var, zb0Var, iqbVar2, i);
        }
    }

    public static final void e(String str, tkh tkhVar, long j, ld4 ld4Var, int i) {
        e18 e18Var;
        tkh tkhVar2;
        long j2;
        int i2;
        tkh tkhVar3;
        long j3;
        str.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-905421072);
        int i3 = i | (e18Var2.f(str) ? 4 : 2) | 144;
        if (e18Var2.Q(i3 & 1, (i3 & 147) != 146)) {
            e18Var2.V();
            if ((i & 1) == 0 || e18Var2.A()) {
                i2 = i3 & (-1009);
                tkhVar3 = ((jm3) gm3.c(e18Var2).e.E).h;
                j3 = gm3.a(e18Var2).O;
            } else {
                e18Var2.T();
                i2 = i3 & (-1009);
                tkhVar3 = tkhVar;
                j3 = j;
            }
            e18Var2.q();
            Object objN = e18Var2.N();
            if (objN == jd4.a) {
                objN = new qy4(15);
                e18Var2.k0(objN);
            }
            e18Var = e18Var2;
            tjh.b(str, tjf.a(fqb.E, (bz7) objN), j3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar3, e18Var, i2 & 910, 0, 131064);
            j2 = j3;
            tkhVar2 = tkhVar3;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            tkhVar2 = tkhVar;
            j2 = j;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ru5(str, tkhVar2, j2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(defpackage.zy7 r20, defpackage.y49 r21, boolean r22, boolean r23, defpackage.iqb r24, defpackage.ld4 r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jwk.f(zy7, y49, boolean, boolean, iqb, ld4, int, int):void");
    }

    public static final void g(int i, ld4 ld4Var, zy7 zy7Var, iqb iqbVar, boolean z) {
        int i2;
        iqb iqbVar2;
        long j;
        long j2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(568275356);
        if ((i & 6) == 0) {
            i2 = i | (e18Var.g(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            if (z) {
                e18Var.a0(651782117);
                j = gm3.a(e18Var).z;
            } else {
                e18Var.a0(651783201);
                j = gm3.a(e18Var).n;
            }
            e18Var.p(false);
            long j3 = j;
            if (z) {
                e18Var.a0(651784737);
                e18Var.p(false);
                j2 = d54.d;
            } else {
                e18Var.a0(651785699);
                j2 = gm3.a(e18Var).M;
                e18Var.p(false);
            }
            long j4 = j2;
            vve vveVar = xve.a;
            xo7 xo7Var = new xo7(2.0f, 1.0f, ac1.h, ac1.i);
            fqb fqbVar = fqb.E;
            zmk.e(zy7Var, b.o(fqbVar, 44.0f), vveVar, j3, j4, xo7Var, fd9.q0(2005765343, new tp(z, 3), e18Var), e18Var, ((i3 >> 3) & 14) | 12582912);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new r50(i, 1, zy7Var, iqbVar2, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final boolean r28, final boolean r29, final boolean r30, final defpackage.y49 r31, final boolean r32, final defpackage.pl3 r33, final defpackage.zy7 r34, final defpackage.zy7 r35, final defpackage.zy7 r36, final defpackage.zy7 r37, final defpackage.zy7 r38, final defpackage.zy7 r39, defpackage.iqb r40, defpackage.pz7 r41, defpackage.ld4 r42, final int r43, final int r44, final int r45) {
        /*
            Method dump skipped, instruction units count: 739
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jwk.h(boolean, boolean, boolean, y49, boolean, pl3, zy7, zy7, zy7, zy7, zy7, zy7, iqb, pz7, ld4, int, int, int):void");
    }

    public static final void i(ggc ggcVar, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        tec tecVar = ggcVar.a;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1770133468);
        if ((i & 6) == 0) {
            i2 = i | (e18Var.f(ggcVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        int i3 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            u2a u2aVar = tecVar.j;
            boolean zH = e18Var.h(u2aVar);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zH || objN == lz1Var) {
                objN = new e29(u2aVar, null, i3);
                e18Var.k0(objN);
            }
            fd9.i(e18Var, (pz7) objN, u2aVar);
            String strA = u2aVar.a(t2a.J);
            String strA2 = u2aVar.a(t2a.H);
            String strA3 = u2aVar.a(t2a.I);
            egc egcVar = tecVar.l;
            boolean z = egcVar.a;
            boolean z2 = egcVar.e;
            boolean zBooleanValue = ((Boolean) tecVar.q.getValue()).booleanValue();
            int i4 = i2 & 14;
            boolean z3 = i4 == 4;
            Object objN2 = e18Var.N();
            if (z3 || objN2 == lz1Var) {
                objN2 = new nb9(ggcVar, 0);
                e18Var.k0(objN2);
            }
            bz7 bz7Var = (bz7) objN2;
            boolean zBooleanValue2 = ((Boolean) tecVar.r.getValue()).booleanValue();
            boolean z4 = i4 == 4;
            Object objN3 = e18Var.N();
            if (z4 || objN3 == lz1Var) {
                objN3 = new nb9(ggcVar, 1);
                e18Var.k0(objN3);
            }
            j(strA, strA2, strA3, z, z2, zBooleanValue, bz7Var, zBooleanValue2, (bz7) objN3, ((Boolean) tecVar.w.getValue()).booleanValue(), ggcVar.b, iqbVar, e18Var, 0, i2 & 112);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ob9(ggcVar, iqbVar, i, 0);
        }
    }

    public static final void j(final String str, final String str2, final String str3, final boolean z, final boolean z2, final boolean z3, final bz7 bz7Var, final boolean z4, final bz7 bz7Var2, final boolean z5, final hya hyaVar, final iqb iqbVar, ld4 ld4Var, final int i, final int i2) {
        int i3;
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(882221045);
        int i4 = i | (e18Var2.f(str) ? 4 : 2) | (e18Var2.f(str2) ? 32 : 16) | (e18Var2.f(str3) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.g(z) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var2.g(z2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var2.g(z3) ? 131072 : 65536) | (e18Var2.h(bz7Var) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | (e18Var2.g(z4) ? 8388608 : 4194304) | (e18Var2.h(bz7Var2) ? 67108864 : 33554432) | (e18Var2.g(z5) ? 536870912 : 268435456);
        if ((i2 & 6) == 0) {
            i3 = i2 | (e18Var2.h(hyaVar) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var2.f(iqbVar) ? 32 : 16;
        }
        int i5 = i3;
        boolean z6 = false;
        if (e18Var2.Q(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 19) == 18) ? false : true)) {
            int i6 = z2 ? R.string.onboarding_v2_terms_consent_links_no_age : R.string.onboarding_v2_terms_consent_links;
            final ekh ekhVar = new ekh(new egg(gm3.a(e18Var2).M, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), null, null, null);
            String strJ0 = d4c.j0(R.string.onboarding_v2_terms_title, e18Var2);
            String strJ02 = d4c.j0(R.string.onboarding_v2_terms_subtitle, e18Var2);
            String strJ03 = d4c.j0(R.string.onboarding_v2_terms_create_account, e18Var2);
            if (z3 && ((!z || z4) && !z5)) {
                z6 = true;
            }
            final int i7 = i6;
            e18Var = e18Var2;
            nvk.d(strJ0, strJ02, strJ03, hyaVar, iqbVar.B(b.c), z6, z5, false, null, null, fd9.q0(1163081537, new rz7() { // from class: pb9
                @Override // defpackage.rz7
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ld4 ld4Var2 = (ld4) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((s64) obj).getClass();
                    e18 e18Var3 = (e18) ld4Var2;
                    if (e18Var3.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        e0g e0gVar = gm3.b(e18Var3).h;
                        ho0 ho0Var = new ho0(8.0f, true, new sz6(1));
                        iqb iqbVarJ = gb9.J(ez1.t(yfd.p(xn5.V(xn5.a0(b.c(gb9.L(fqb.E, 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), 1.0f), e0gVar, new tzf(4.0f, d54.b(0.08f, d54.b), MTTypesetterKt.kLineSkipLimitMultiplier, 0L, 56)), e0gVar), gm3.a(e18Var3).n, zni.b), MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var3).v, e0gVar), 12.0f);
                        q64 q64VarA = p64.a(ho0Var, lja.S, e18Var3, 6);
                        int iHashCode = Long.hashCode(e18Var3.T);
                        hyc hycVarL = e18Var3.l();
                        iqb iqbVarE = kxk.E(e18Var3, iqbVarJ);
                        dd4.e.getClass();
                        re4 re4Var = cd4.b;
                        e18Var3.e0();
                        if (e18Var3.S) {
                            e18Var3.k(re4Var);
                        } else {
                            e18Var3.n0();
                        }
                        d4c.i0(e18Var3, cd4.f, q64VarA);
                        d4c.i0(e18Var3, cd4.e, hycVarL);
                        d4c.i0(e18Var3, cd4.g, Integer.valueOf(iHashCode));
                        d4c.h0(e18Var3, cd4.h);
                        d4c.i0(e18Var3, cd4.d, iqbVarE);
                        int i8 = i7;
                        ekh ekhVar2 = ekhVar;
                        jwk.d(z3, bz7Var, zrk.j(i8, x44.X(str, str2), ekhVar2, new CharSequence[0], e18Var3, 0, 0), null, e18Var3, 0);
                        if (z) {
                            e18Var3.a0(45815415);
                            jwk.d(z4, bz7Var2, zrk.j(R.string.onboarding_v2_terms_consent_privacy_links, x44.W(str3), ekhVar2, new CharSequence[0], e18Var3, 0, 0), null, e18Var3, 0);
                            e18Var3.p(false);
                        } else {
                            e18Var3.a0(46234411);
                            e18Var3.p(false);
                        }
                        e18Var3.p(true);
                    } else {
                        e18Var3.T();
                    }
                    return iei.a;
                }
            }, e18Var2), e18Var, ((i5 << 9) & 7168) | (3670016 & (i4 >> 9)), 896);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7(str, str2, str3, z, z2, z3, bz7Var, z4, bz7Var2, z5, hyaVar, iqbVar, i, i2) { // from class: qb9
                public final /* synthetic */ String E;
                public final /* synthetic */ String F;
                public final /* synthetic */ String G;
                public final /* synthetic */ boolean H;
                public final /* synthetic */ boolean I;
                public final /* synthetic */ boolean J;
                public final /* synthetic */ bz7 K;
                public final /* synthetic */ boolean L;
                public final /* synthetic */ bz7 M;
                public final /* synthetic */ boolean N;
                public final /* synthetic */ hya O;
                public final /* synthetic */ iqb P;
                public final /* synthetic */ int Q;

                {
                    this.Q = i2;
                }

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(1);
                    int iP02 = x44.p0(this.Q);
                    jwk.j(this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, (ld4) obj, iP0, iP02);
                    return iei.a;
                }
            };
        }
    }

    public static final void k(int i, ld4 ld4Var, zy7 zy7Var, iqb iqbVar, String str) {
        int i2;
        zy7 zy7Var2;
        iqb iqbVar2;
        String strN;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(750161152);
        if ((i & 6) == 0) {
            i2 = i | (e18Var.f(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            zy7Var2 = zy7Var;
            i2 |= e18Var.h(zy7Var2) ? 32 : 16;
        } else {
            zy7Var2 = zy7Var;
        }
        int i3 = i2 | 384;
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            String strN2 = null;
            if (str != null && !bsg.I0(str)) {
                strN2 = str;
            }
            if (strN2 == null) {
                strN2 = vb7.n(e18Var, -649628787, R.string.settings_title_model, e18Var, false);
            } else {
                e18Var.a0(-649630058);
                e18Var.p(false);
            }
            if (str == null || bsg.I0(str)) {
                strN = vb7.n(e18Var, 1336523451, R.string.model_selector_chip_a11y_empty, e18Var, false);
            } else {
                e18Var.a0(1336442262);
                strN = d4c.k0(R.string.model_selector_chip_a11y, new Object[]{str}, e18Var);
                e18Var.p(false);
            }
            vve vveVar = xve.a;
            long j = gm3.a(e18Var).n;
            long j2 = gm3.a(e18Var).M;
            xo7 xo7Var = new xo7(2.0f, 1.0f, ac1.h, ac1.i);
            fqb fqbVar = fqb.E;
            iqb iqbVarV = b.v(b.e(fqbVar, 44.0f), 44.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
            qu1 qu1VarA = sf5.a(MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var).v);
            iqb iqbVarU = ez1.u(iqbVarV, qu1VarA.a, qu1VarA.b, vveVar);
            boolean zF = e18Var.f(strN);
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                objN = new o8(strN, 17);
                e18Var.k0(objN);
            }
            zmk.e(zy7Var2, tjf.b(iqbVarU, false, (bz7) objN), vveVar, j, j2, xo7Var, fd9.q0(133738653, new rq(strN2, 3), e18Var), e18Var, ((i3 >> 3) & 14) | 12582912);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new bk1(str, zy7Var, iqbVar2, i, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0587  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(defpackage.fn1 r30, final defpackage.mj1 r31, defpackage.pl3 r32, defpackage.zy7 r33, defpackage.zy7 r34, final defpackage.zy7 r35, defpackage.iqb r36, boolean r37, defpackage.a6i r38, defpackage.ld4 r39, int r40) {
        /*
            Method dump skipped, instruction units count: 1505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jwk.l(fn1, mj1, pl3, zy7, zy7, zy7, iqb, boolean, a6i, ld4, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0166 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:237:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(final java.lang.String r53, final java.lang.String r54, final defpackage.ta4 r55, defpackage.iqb r56, defpackage.zy7 r57, java.lang.String r58, defpackage.zy7 r59, java.lang.String r60, defpackage.tt r61, float r62, defpackage.zdd r63, defpackage.tkh r64, boolean r65, defpackage.ld4 r66, final int r67, final int r68, final int r69) {
        /*
            Method dump skipped, instruction units count: 1532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jwk.m(java.lang.String, java.lang.String, ta4, iqb, zy7, java.lang.String, zy7, java.lang.String, tt, float, zdd, tkh, boolean, ld4, int, int, int):void");
    }

    public static final void n(iqb iqbVar, tt ttVar, boolean z, pz7 pz7Var, ld4 ld4Var, int i, int i2) {
        int i3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1212265832);
        int i4 = i & 6;
        fxe fxeVar = fxe.a;
        if (i4 == 0) {
            i3 = (e18Var.f(fxeVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= e18Var.f(ttVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i3 |= e18Var.g(z) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i3 |= e18Var.h(pz7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if (e18Var.Q(i3 & 1, (i3 & 9363) != 9362)) {
            if (i5 != 0) {
                iqbVar = fqb.E;
            }
            iqb iqbVarT = ez1.t(yfd.p(sf5.N(ysk.f(b.g(b.t(gb9.L(fxeVar.b(iqbVar, lja.R), 12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), 56.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 100.0f, 1).B(b.b), z ? 6.0f : -6.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 15.0f, 1), gm3.a(e18Var).n, gm3.b(e18Var).d), MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var).u, gm3.b(e18Var).d);
            o5b o5bVarD = dw1.d(ttVar, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarT);
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
            sq6.B((i3 >> 12) & 14, pz7Var, e18Var, true);
        } else {
            e18Var.T();
        }
        iqb iqbVar2 = iqbVar;
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new s22(iqbVar2, ttVar, z, pz7Var, i, i2);
        }
    }

    public static final void o(int i, int i2, int i3, ld4 ld4Var, iqb iqbVar) {
        int i4;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1419328278);
        if ((i2 & 6) == 0) {
            i4 = (e18Var.d(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        if (e18Var.Q(i4 & 1, (i4 & 19) != 18)) {
            fqb fqbVar = fqb.E;
            if (i5 != 0) {
                iqbVar = fqbVar;
            }
            xo1 xo1Var = lja.K;
            iqb iqbVarJ = rkj.j(iqbVar, za9.F);
            o5b o5bVarD = dw1.d(xo1Var, false);
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
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            cv8.b(u00.D(i, i4 & 14, e18Var), null, b.o(nw1.a.a(fqbVar, xo1Var), 24.0f), gm3.a(e18Var).O, e18Var, 56, 0);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new b46(i, i2, i3, iqbVar);
        }
    }

    public static final void p(boolean z, y49 y49Var, pl3 pl3Var, zy7 zy7Var, zy7 zy7Var2, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        pl3 pl3Var2;
        e18 e18Var;
        iqb iqbVar2;
        Object tmVar;
        zub zubVar;
        nwb nwbVar;
        nwb nwbVar2;
        nwb nwbVar3;
        long j;
        lz1 lz1Var;
        vve vveVar;
        boolean z2;
        boolean z3 = z;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1242860435);
        if ((i & 6) == 0) {
            i2 = (e18Var2.g(z3) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? e18Var2.f(y49Var) : e18Var2.h(y49Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            pl3Var2 = pl3Var;
            i2 |= e18Var2.f(pl3Var2) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            pl3Var2 = pl3Var;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var2.h(zy7Var2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        int i3 = i2 | 196608;
        if (e18Var2.Q(i3 & 1, (74899 & i3) != 74898)) {
            View view = (View) e18Var2.j(w00.f);
            Object objN = e18Var2.N();
            lz1 lz1Var2 = jd4.a;
            if (objN == lz1Var2) {
                objN = vb7.f(e18Var2);
            }
            zub zubVar2 = (zub) objN;
            nwb nwbVarZ = mpk.Z(zy7Var, e18Var2);
            nwb nwbVarZ2 = mpk.Z(zy7Var2, e18Var2);
            boolean zH = ((i3 & 896) == 256) | e18Var2.h(view) | e18Var2.f(nwbVarZ) | e18Var2.f(nwbVarZ2);
            Object objN2 = e18Var2.N();
            if (zH || objN2 == lz1Var2) {
                tmVar = new tm(zubVar2, pl3Var2, view, nwbVarZ, nwbVarZ2, (tp4) null, 3);
                zubVar = zubVar2;
                nwbVar = nwbVarZ;
                nwbVar2 = nwbVarZ2;
                e18Var2.k0(tmVar);
            } else {
                nwbVar2 = nwbVarZ2;
                zubVar = zubVar2;
                tmVar = objN2;
                nwbVar = nwbVarZ;
            }
            fd9.i(e18Var2, (pz7) tmVar, zubVar);
            if (z3) {
                e18Var2.a0(388002949);
                nwbVar3 = nwbVar2;
                j = gm3.a(e18Var2).k;
            } else {
                nwbVar3 = nwbVar2;
                e18Var2.a0(388004312);
                j = gm3.a(e18Var2).n;
            }
            e18Var2.p(false);
            wlg wlgVarA = f8g.a(j, kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, 1500.0f, null, 5), "pttContainer", e18Var2, 432, 8);
            wlg wlgVarB = n80.b(z3 ? 1.05f : 1.0f, kxk.K(0.7f, 1500.0f, null, 4), "pttScale", e18Var2, 3120, 20);
            long j2 = gm3.a(e18Var2).u;
            String strJ0 = d4c.j0(R.string.settings_activation_push_to_talk, e18Var2);
            String strJ02 = d4c.j0(z3 ? R.string.voice_push_to_talk_recording : R.string.voice_push_to_talk_idle, e18Var2);
            vve vveVar2 = xve.a;
            qnc qncVar = q02.a;
            zub zubVar3 = zubVar;
            n02 n02VarA = q02.a(((d54) wlgVarA.getValue()).a, d54.d, 0L, 0L, e18Var2, 12);
            s02 s02VarB = q02.b(28);
            qnc qncVar2 = new qnc(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier);
            fqb fqbVar = fqb.E;
            long j3 = j2;
            iqb iqbVarK = b.k(gb9.J(fqbVar, 8.0f), 190.0f, 84.0f);
            boolean zF = e18Var2.f(wlgVarB);
            Object objN3 = e18Var2.N();
            if (zF || objN3 == lz1Var2) {
                objN3 = new ek1(wlgVarB, 0);
                e18Var2.k0(objN3);
            }
            iqb iqbVarI0 = xn5.i0(iqbVarK, (bz7) objN3);
            if (z) {
                j3 = d54.g;
            }
            qu1 qu1VarA = sf5.a(MTTypesetterKt.kLineSkipLimitMultiplier, j3);
            iqb iqbVarU = ez1.u(iqbVarI0, qu1VarA.a, qu1VarA.b, vveVar2);
            nwb nwbVar4 = nwbVar3;
            boolean zF2 = e18Var2.f(strJ0) | e18Var2.f(strJ02) | ((i3 & 14) == 4) | e18Var2.f(nwbVar4) | e18Var2.f(nwbVar);
            Object objN4 = e18Var2.N();
            if (zF2 || objN4 == lz1Var2) {
                lz1Var = lz1Var2;
                vveVar = vveVar2;
                z2 = false;
                fk1 fk1Var = new fk1(strJ0, strJ02, z, nwbVar4, nwbVar, 0);
                z3 = z;
                e18Var2.k0(fk1Var);
                objN4 = fk1Var;
            } else {
                z3 = z;
                lz1Var = lz1Var2;
                vveVar = vveVar2;
                z2 = false;
            }
            iqb iqbVarB = tjf.b(iqbVarU, z2, (bz7) objN4);
            Object objN5 = e18Var2.N();
            if (objN5 == lz1Var) {
                objN5 = new oob(19);
                e18Var2.k0(objN5);
            }
            csg.a((zy7) objN5, iqbVarB, false, vveVar, n02VarA, s02VarB, null, qncVar2, zubVar3, fd9.q0(1454618019, new s50(z3, y49Var, 2), e18Var2), e18Var2, 918552582, 68);
            e18Var = e18Var2;
            iqbVar2 = fqbVar;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pg1(z3, y49Var, pl3Var, zy7Var, zy7Var2, iqbVar2, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void q(defpackage.iqb r19, boolean r20, defpackage.zy7 r21, defpackage.zy7 r22, defpackage.zy7 r23, defpackage.zy7 r24, defpackage.zy7 r25, defpackage.ld4 r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jwk.q(iqb, boolean, zy7, zy7, zy7, zy7, zy7, ld4, int, int):void");
    }

    public static final void r(zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        iqb iqbVar2;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1902647194);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (e18Var.h(zy7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if (e18Var.Q(i4 & 1, (i4 & 19) != 18)) {
            vve vveVar = xve.a;
            long j = gm3.a(e18Var).n;
            long j2 = gm3.a(e18Var).M;
            xo7 xo7Var = new xo7(2.0f, 1.0f, ac1.h, ac1.i);
            iqbVar2 = fqb.E;
            iqb iqbVarO = b.o(iqbVar2, 44.0f);
            qu1 qu1VarA = sf5.a(MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var).v);
            zmk.e(zy7Var, ez1.u(iqbVarO, qu1VarA.a, qu1VarA.b, vveVar), vveVar, j, j2, xo7Var, pvj.E, e18Var, (i4 & 14) | 12582912);
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new mu(zy7Var, iqbVar2, i, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void s(java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, defpackage.zy7 r25, java.lang.String r26, defpackage.qi3 r27, defpackage.ld4 r28, int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jwk.s(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, zy7, java.lang.String, qi3, ld4, int, int):void");
    }

    public static final boolean t(yr9 yr9Var, u9i u9iVar, Set set) {
        boolean zT;
        if (x44.r(yr9Var.O(), u9iVar)) {
            return true;
        }
        xh3 xh3VarA = yr9Var.O().a();
        yh3 yh3Var = xh3VarA instanceof yh3 ? (yh3) xh3VarA : null;
        List listI0 = yh3Var != null ? yh3Var.i0() : null;
        Iterable iterableU1 = w44.u1(yr9Var.H());
        if (!(iterableU1 instanceof Collection) || !((Collection) iterableU1).isEmpty()) {
            Iterator it = iterableU1.iterator();
            do {
                f2 f2Var = (f2) it;
                if (((Iterator) f2Var.G).hasNext()) {
                    b19 b19Var = (b19) f2Var.next();
                    int i = b19Var.a;
                    vai vaiVar = (vai) b19Var.b;
                    qai qaiVar = listI0 != null ? (qai) w44.O0(i, listI0) : null;
                    if ((qaiVar == null || set == null || !set.contains(qaiVar)) && !vaiVar.c()) {
                        yr9 yr9VarB = vaiVar.b();
                        yr9VarB.getClass();
                        zT = t(yr9VarB, u9iVar, set);
                    } else {
                        zT = false;
                    }
                }
            } while (!zT);
            return true;
        }
        return false;
    }

    public static final wai u(yr9 yr9Var, int i, qai qaiVar) {
        yr9Var.getClass();
        if (i == 0) {
            throw null;
        }
        if ((qaiVar != null ? qaiVar.z() : 0) == i) {
            i = 1;
        }
        return new wai(i, yr9Var);
    }

    public static final LinkedHashSet v(j7g j7gVar, Set set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        w(j7gVar, j7gVar, linkedHashSet, set);
        return linkedHashSet;
    }

    public static final void w(yr9 yr9Var, j7g j7gVar, LinkedHashSet linkedHashSet, Set set) {
        xh3 xh3VarA = yr9Var.O().a();
        if (xh3VarA instanceof qai) {
            if (!x44.r(yr9Var.O(), j7gVar.O())) {
                linkedHashSet.add(xh3VarA);
                return;
            }
            for (yr9 yr9Var2 : ((qai) xh3VarA).getUpperBounds()) {
                yr9Var2.getClass();
                w(yr9Var2, j7gVar, linkedHashSet, set);
            }
            return;
        }
        xh3 xh3VarA2 = yr9Var.O().a();
        yh3 yh3Var = xh3VarA2 instanceof yh3 ? (yh3) xh3VarA2 : null;
        List listI0 = yh3Var != null ? yh3Var.i0() : null;
        int i = 0;
        for (vai vaiVar : yr9Var.H()) {
            int i2 = i + 1;
            qai qaiVar = listI0 != null ? (qai) w44.O0(i, listI0) : null;
            if ((qaiVar == null || set == null || !set.contains(qaiVar)) && !vaiVar.c() && !w44.G0(linkedHashSet, vaiVar.b().O().a()) && !x44.r(vaiVar.b().O(), j7gVar.O())) {
                yr9 yr9VarB = vaiVar.b();
                yr9VarB.getClass();
                w(yr9VarB, j7gVar, linkedHashSet, set);
            }
            i = i2;
        }
    }

    public static final or9 x(yr9 yr9Var) {
        yr9Var.getClass();
        or9 or9VarF = yr9Var.O().f();
        or9VarF.getClass();
        return or9VarF;
    }

    public static final yr9 y(qai qaiVar) {
        Object obj;
        List upperBounds = qaiVar.getUpperBounds();
        upperBounds.getClass();
        upperBounds.isEmpty();
        List upperBounds2 = qaiVar.getUpperBounds();
        upperBounds2.getClass();
        Iterator it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            xh3 xh3VarA = ((yr9) next).O().a();
            qqb qqbVar = xh3VarA instanceof qqb ? (qqb) xh3VarA : null;
            if (qqbVar != null && qqbVar.m() != 2 && qqbVar.m() != 5) {
                obj = next;
                break;
            }
        }
        yr9 yr9Var = (yr9) obj;
        if (yr9Var != null) {
            return yr9Var;
        }
        List upperBounds3 = qaiVar.getUpperBounds();
        upperBounds3.getClass();
        Object objL0 = w44.L0(upperBounds3);
        objL0.getClass();
        return (yr9) objL0;
    }

    public static final boolean z(qai qaiVar, u9i u9iVar, Set set) {
        qaiVar.getClass();
        List upperBounds = qaiVar.getUpperBounds();
        upperBounds.getClass();
        List<yr9> list = upperBounds;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (yr9 yr9Var : list) {
            yr9Var.getClass();
            if (t(yr9Var, qaiVar.W().O(), set) && (u9iVar == null || x44.r(yr9Var.O(), u9iVar))) {
                return true;
            }
        }
        return false;
    }
}
