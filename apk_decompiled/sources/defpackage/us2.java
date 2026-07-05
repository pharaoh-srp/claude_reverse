package defpackage;

import androidx.compose.foundation.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.chat.messages.CompactionStatus;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class us2 {
    public static final void a(lc3 lc3Var, u56 u56Var, tv7 tv7Var, iqb iqbVar, ld4 ld4Var, int i, int i2) {
        iqb iqbVar2;
        int i3;
        iqb iqbVar3;
        Object rv7Var;
        lc3Var.getClass();
        tv7Var.getClass();
        List list = tv7Var.d;
        uv7 uv7Var = tv7Var.b;
        k84 k84Var = tv7Var.c;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(518660164);
        int i4 = (e18Var.f(lc3Var) ? 4 : 2) | i | (e18Var.f(u56Var) ? 32 : 16) | ((i & 512) == 0 ? e18Var.f(tv7Var) : e18Var.h(tv7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 = i4 | 3072;
            iqbVar2 = iqbVar;
        } else {
            iqbVar2 = iqbVar;
            i3 = i4 | (e18Var.f(iqbVar2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        }
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            iqb iqbVar4 = i5 != 0 ? fqb.E : iqbVar2;
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = mpk.P(Boolean.FALSE);
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            if ((k84Var != null ? k84Var.a : null) == CompactionStatus.Status.COMPACTING) {
                e18Var.a0(-1886963992);
                Object objN2 = e18Var.N();
                if (objN2 == lz1Var) {
                    objN2 = new ts2(0, null, nwbVar);
                    e18Var.k0(objN2);
                }
                fd9.i(e18Var, (pz7) objN2, iei.a);
                e18Var.p(false);
            } else {
                e18Var.a0(-1886696834);
                e18Var.p(false);
            }
            if (((Boolean) nwbVar.getValue()).booleanValue() && k84Var != null) {
                rv7Var = new kv7(k84Var);
            } else if (uv7Var == uv7.G) {
                rv7Var = nv7.a;
            } else if (uv7Var == uv7.H) {
                rv7Var = ov7.a;
            } else if (uv7Var == uv7.I) {
                rv7Var = pv7.a;
            } else if (uv7Var == uv7.J) {
                rv7Var = qv7.a;
            } else {
                List list2 = list;
                rv7Var = (list2 == null || list2.isEmpty()) ? uv7Var == uv7.F ? new rv7(null) : uv7Var == uv7.E ? new lv7(u56Var) : mv7.a : new rv7(list);
            }
            wo1 wo1Var = lja.Q;
            iqbVar4.getClass();
            iqb iqbVar5 = e93.a;
            iqb iqbVarL = gb9.L(iqbVar4, 20.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
            cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var, 48);
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
            j8.c(e3g.b.a((ia0) e18Var.j(z23.a)), fd9.q0(2142598504, new kn(tv7Var, 19, lc3Var), e18Var), e18Var, 48);
            hw9 hw9Var = new hw9(1.0f, true);
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = new c32(27);
                e18Var.k0(objN3);
            }
            xn5.G(rv7Var, hw9Var, (bz7) objN3, null, "Footer content", null, fd9.q0(2083909780, new rs2(0, nwbVar), e18Var), e18Var, 1597824, 40);
            e18Var.p(true);
            iqbVar3 = iqbVar4;
        } else {
            e18Var.T();
            iqbVar3 = iqbVar2;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new et((Object) lc3Var, (Object) u56Var, (Object) tv7Var, iqbVar3, i, i2, 3);
        }
    }

    public static final void b(List list, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(785872006);
        int i2 = (e18Var.f(list) ? 4 : 2) | i;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (z || objN == lz1Var) {
                objN = vb7.g(0, e18Var);
            }
            isc iscVar = (isc) objN;
            boolean zF = (i3 == 4) | e18Var.f(iscVar);
            Object objN2 = e18Var.N();
            if (zF || objN2 == lz1Var) {
                objN2 = new nn1(list, iscVar, (tp4) null, 15);
                e18Var.k0(objN2);
            }
            fd9.i(e18Var, (pz7) objN2, list);
            tkh tkhVarB = tkh.b((tkh) ((wk) gm3.c(e18Var).e.F).h, 0L, 0L, null, new wu7(1), null, 0L, null, 0, 0L, null, 0, 16777207);
            Object obj = list.get(iscVar.h());
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = new c32(28);
                e18Var.k0(objN3);
            }
            xn5.G(obj, null, (bz7) objN3, null, "tool loading message", null, fd9.q0(-59423696, new ci(2, tkhVarB), e18Var), e18Var, 1597824, 42);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ss2(i, 0, list);
        }
    }

    public static final void c(u56 u56Var, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        iqb iqbVarC;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-219355668);
        int i2 = (e18Var.f(u56Var) ? 4 : 2) | i | 48;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            eli eliVar = (eli) e18Var.j(ve4.t);
            vo1 vo1Var = lja.U;
            String str = u56Var.c;
            iqbVar2 = fqb.E;
            if (str != null) {
                e18Var.a0(2115815889);
                boolean zH = ((i2 & 14) == 4) | e18Var.h(eliVar);
                Object objN = e18Var.N();
                if (zH || objN == jd4.a) {
                    objN = new ik1(eliVar, 11, u56Var);
                    e18Var.k0(objN);
                }
                iqbVarC = b.c(iqbVar2, false, null, null, null, (zy7) objN, 15);
                e18Var.p(false);
            } else {
                e18Var.a0(2115920390);
                e18Var.p(false);
                iqbVarC = iqbVar2;
            }
            q64 q64VarA = p64.a(ko0.c, vo1Var, e18Var, 48);
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
            tjh.a(tkh.b(((jm3) gm3.c(e18Var).e.E).k, gm3.a(e18Var).O, 0L, null, null, null, 0L, null, 0, 0L, null, 0, 16777214), fd9.q0(1286341989, new fp(20, u56Var), e18Var), e18Var, 48);
            e18Var.p(true);
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new kn(u56Var, iqbVar2, i, 18);
        }
    }

    public static final void d(iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-2084240933);
        int i2 = (e18Var.f(iqbVar) ? 4 : 2) | i;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            wo1 wo1Var = lja.Q;
            iqb iqbVarC = androidx.compose.foundation.layout.b.c(iqbVar, 1.0f);
            cxe cxeVarA = axe.a(ko0.b, wo1Var, e18Var, 54);
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
            d4c.i0(e18Var, cd4.f, cxeVarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            tjh.a(tkh.b(((jm3) gm3.c(e18Var).e.E).k, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, 0, 0L, null, 0, 16777214), cb4.a, e18Var, 48);
            iqb iqbVar2 = e93.a;
            vb7.A(fqb.E, 20.0f, e18Var, true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fl(i, 5, iqbVar);
        }
    }
}
