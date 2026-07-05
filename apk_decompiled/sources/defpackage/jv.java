package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.memory.MemorySynthesisResponse;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jv implements rz7 {
    public final /* synthetic */ int E = 2;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ bz7 H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    public /* synthetic */ jv(String str, boolean z, boolean z2, nwb nwbVar, nwb nwbVar2, boolean z3, bz7 bz7Var, zy7 zy7Var) {
        this.K = str;
        this.F = z;
        this.G = z2;
        this.L = nwbVar;
        this.M = nwbVar2;
        this.I = z3;
        this.H = bz7Var;
        this.J = zy7Var;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String strN;
        boolean z;
        boolean z2;
        nwb nwbVar;
        z80 z80Var;
        Object gt0Var;
        int i = this.E;
        lz1 lz1Var = jd4.a;
        iei ieiVar = iei.a;
        Object obj4 = this.J;
        Object obj5 = this.M;
        Object obj6 = this.L;
        Object obj7 = this.K;
        switch (i) {
            case 0:
                zy7 zy7Var = (zy7) obj4;
                zy7 zy7Var2 = (zy7) obj7;
                by2 by2Var = (by2) obj5;
                zy7 zy7Var3 = (zy7) obj6;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e18Var.T();
                } else {
                    knk.e(Boolean.valueOf(this.F), null, null, "Actions crossfade", fd9.q0(-212089268, new nv(zy7Var, this.G, zy7Var2, by2Var, this.H, this.I, zy7Var3), e18Var), e18Var, 27648, 6);
                }
                break;
            case 1:
                pl3 pl3Var = (pl3) obj4;
                nwb nwbVar2 = (nwb) obj7;
                MemorySynthesisResponse memorySynthesisResponse = (MemorySynthesisResponse) obj6;
                pz7 pz7Var = (pz7) obj5;
                s64 s64Var = (s64) obj;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                s64Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((e18) ld4Var2).f(s64Var) ? 4 : 2;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    e18Var2.T();
                } else {
                    String strJ0 = d4c.j0(R.string.memory_setting_title, e18Var2);
                    boolean z3 = this.F;
                    zb0 zb0VarJ = zrk.j(z3 ? R.string.memory_setting_description : R.string.tool_setting_disabled_by_organization, z3 ? x44.W(tyg.HOW_MEMORY_WORKS.a()) : lm6.E, null, new CharSequence[0], e18Var2, 0, 4);
                    wo1 wo1Var = lja.Q;
                    nxf nxfVarA = qf2.a(e18Var2);
                    oxf oxfVarC = qf2.c(e18Var2);
                    qnc qncVar = qf2.a;
                    boolean z4 = this.G;
                    boolean zG = e18Var2.g(z4);
                    bz7 bz7Var = this.H;
                    boolean zF = zG | e18Var2.f(bz7Var);
                    Object objN = e18Var2.N();
                    if (zF || objN == lz1Var) {
                        objN = new jl1(z4, bz7Var, nwbVar2, 1);
                        e18Var2.k0(objN);
                    }
                    rkj.c(null, strJ0, z4, (bz7) objN, null, null, zb0VarJ, z3, nxfVarA, oxfVarC, qncVar, MTTypesetterKt.kLineSkipLimitMultiplier, wo1Var, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, Integer.MAX_VALUE, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, pl3Var, e18Var2, 6, 12583296, 0, 1959984);
                    wd6.H(s64Var, z4 && z3, null, null, null, null, fd9.q0(-929834496, new tw(memorySynthesisResponse, this.I, pz7Var, 2), e18Var2), e18Var2, (iIntValue2 & 14) | 1572864, 30);
                }
                break;
            default:
                String str = (String) obj7;
                nwb nwbVar3 = (nwb) obj6;
                nwb nwbVar4 = (nwb) obj5;
                zy7 zy7Var4 = (zy7) obj4;
                mnc mncVar = (mnc) obj;
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                vo1 vo1Var = lja.T;
                mncVar.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((e18) ld4Var3).f(mncVar) ? 4 : 2;
                }
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    e18Var3.T();
                } else {
                    iqb iqbVarK0 = mpk.k0(gb9.I(b.c, mncVar), mpk.n);
                    vo1 vo1Var2 = lja.S;
                    eo0 eo0Var = ko0.c;
                    q64 q64VarA = p64.a(eo0Var, vo1Var2, e18Var3, 0);
                    int iHashCode = Long.hashCode(e18Var3.T);
                    hyc hycVarL = e18Var3.l();
                    iqb iqbVarE = kxk.E(e18Var3, iqbVarK0);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var3.e0();
                    if (e18Var3.S) {
                        e18Var3.k(re4Var);
                    } else {
                        e18Var3.n0();
                    }
                    z80 z80Var2 = cd4.f;
                    d4c.i0(e18Var3, z80Var2, q64VarA);
                    z80 z80Var3 = cd4.e;
                    d4c.i0(e18Var3, z80Var3, hycVarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    z80 z80Var4 = cd4.g;
                    d4c.i0(e18Var3, z80Var4, numValueOf);
                    bx bxVar = cd4.h;
                    d4c.h0(e18Var3, bxVar);
                    z80 z80Var5 = cd4.d;
                    lz1 lz1Var2 = lz1Var;
                    iqb iqbVarL = gb9.L(mpk.b0(kgh.n(e18Var3, iqbVarE, z80Var5, 1.0f, true), mpk.Y(e18Var3), true), 20.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                    q64 q64VarA2 = p64.a(eo0Var, vo1Var, e18Var3, 48);
                    int iHashCode2 = Long.hashCode(e18Var3.T);
                    hyc hycVarL2 = e18Var3.l();
                    iqb iqbVarE2 = kxk.E(e18Var3, iqbVarL);
                    e18Var3.e0();
                    if (e18Var3.S) {
                        e18Var3.k(re4Var);
                    } else {
                        e18Var3.n0();
                    }
                    d4c.i0(e18Var3, z80Var2, q64VarA2);
                    d4c.i0(e18Var3, z80Var3, hycVarL2);
                    ij0.t(iHashCode2, e18Var3, z80Var4, e18Var3, bxVar);
                    d4c.i0(e18Var3, z80Var5, iqbVarE2);
                    fqb fqbVar = fqb.E;
                    kxk.g(e18Var3, b.e(fqbVar, 8.0f));
                    flk.a(b.v(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 160.0f, 1), false, e18Var3, 6, 2);
                    kxk.g(e18Var3, b.e(fqbVar, 8.0f));
                    if (str != null) {
                        e18Var3.a0(1586632648);
                        strN = d4c.k0(R.string.code_starter_greeting_named, new Object[]{str}, e18Var3);
                        e18Var3.p(false);
                    } else {
                        strN = vb7.n(e18Var3, 1586748185, R.string.code_starter_greeting, e18Var3, false);
                    }
                    tjh.b(strN, null, gm3.a(e18Var3).M, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var3).e.E).a, e18Var3, 0, 0, 130042);
                    tjh.b(gid.p(28.0f, R.string.code_starter_subtitle, e18Var3, e18Var3, fqbVar), null, gm3.a(e18Var3).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var3).e.E).i, e18Var3, 0, 0, 131066);
                    kxk.g(e18Var3, b.e(fqbVar, 12.0f));
                    iqb iqbVarF = tvk.f(fqbVar);
                    q64 q64VarA3 = p64.a(eo0Var, vo1Var2, e18Var3, 0);
                    int iHashCode3 = Long.hashCode(e18Var3.T);
                    hyc hycVarL3 = e18Var3.l();
                    iqb iqbVarE3 = kxk.E(e18Var3, iqbVarF);
                    e18Var3.e0();
                    if (e18Var3.S) {
                        e18Var3.k(re4Var);
                    } else {
                        e18Var3.n0();
                    }
                    d4c.i0(e18Var3, z80Var2, q64VarA3);
                    d4c.i0(e18Var3, z80Var3, hycVarL3);
                    ij0.t(iHashCode3, e18Var3, z80Var4, e18Var3, bxVar);
                    d4c.i0(e18Var3, z80Var5, iqbVarE3);
                    e18Var3.a0(704028507);
                    Iterator it = nlg.a.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        boolean z5 = this.G;
                        if (!zHasNext) {
                            lz1 lz1Var3 = lz1Var2;
                            e18Var3.p(false);
                            String strJ02 = d4c.j0(R.string.code_starter_something_else, e18Var3);
                            boolean z6 = !z5;
                            boolean zF2 = e18Var3.f(nwbVar4);
                            Object objN2 = e18Var3.N();
                            if (zF2 || objN2 == lz1Var3) {
                                objN2 = new lxf(8, nwbVar4);
                                e18Var3.k0(objN2);
                            }
                            iqb iqbVarL2 = gb9.L(b.c(fqbVar, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 5.0f, 1);
                            boolean z7 = this.F;
                            kzj.c(196614, e18Var3, (zy7) objN2, iqbVarL2, "❓", strJ02, z7, z6);
                            e18Var3.p(true);
                            if (z7) {
                                e18Var3.a0(1588671363);
                                String str2 = (String) nwbVar3.getValue();
                                tkh tkhVarB = tkh.b(((jm3) gm3.c(e18Var3).e.E).g, gm3.a(e18Var3).M, 0L, null, null, null, 0L, null, 0, 0L, null, 0, 16777214);
                                int i2 = 0;
                                mp9 mp9Var = new mp9(3, i2, i2, 126);
                                vve vveVarB = xve.b(12.0f);
                                z2 = z5;
                                ffh ffhVarQ = k2e.q(0L, 0L, gm3.a(e18Var3).p, gm3.a(e18Var3).p, 0L, 0L, 0L, 0L, gm3.a(e18Var3).c, gm3.a(e18Var3).v, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, e18Var3, 2147477455);
                                iqb iqbVarL3 = gb9.L(b.c(fqbVar, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 6.0f, 1);
                                nwbVar = nwbVar3;
                                boolean zF3 = e18Var3.f(nwbVar);
                                Object objN3 = e18Var3.N();
                                if (zF3 || objN3 == lz1Var3) {
                                    objN3 = new shf(1, nwbVar);
                                    e18Var3.k0(objN3);
                                }
                                kxk.d(str2, (bz7) objN3, iqbVarL3, z6, false, tkhVarB, null, euk.b, null, null, null, false, null, mp9Var, null, false, 5, 3, vveVarB, ffhVarQ, e18Var3, 12583296, 906166272, 0, 1277776);
                                z = z6;
                                e18Var3.p(false);
                            } else {
                                z = z6;
                                z2 = z5;
                                nwbVar = nwbVar3;
                                e18Var3.a0(1590215287);
                                e18Var3.p(false);
                            }
                            grc.z(fqbVar, 12.0f, e18Var3, true);
                            iqb iqbVarK = gb9.K(yfd.p(b.c(fqbVar, 1.0f), gm3.a(e18Var3).o, zni.b), 20.0f, 8.0f);
                            q64 q64VarA4 = p64.a(eo0Var, vo1Var, e18Var3, 48);
                            int iHashCode4 = Long.hashCode(e18Var3.T);
                            hyc hycVarL4 = e18Var3.l();
                            iqb iqbVarE4 = kxk.E(e18Var3, iqbVarK);
                            dd4.e.getClass();
                            re4 re4Var2 = cd4.b;
                            e18Var3.e0();
                            if (e18Var3.S) {
                                e18Var3.k(re4Var2);
                            } else {
                                e18Var3.n0();
                            }
                            z80 z80Var6 = cd4.f;
                            d4c.i0(e18Var3, z80Var6, q64VarA4);
                            z80 z80Var7 = cd4.e;
                            d4c.i0(e18Var3, z80Var7, hycVarL4);
                            Integer numValueOf2 = Integer.valueOf(iHashCode4);
                            z80 z80Var8 = cd4.g;
                            d4c.i0(e18Var3, z80Var8, numValueOf2);
                            bx bxVar2 = cd4.h;
                            d4c.h0(e18Var3, bxVar2);
                            z80 z80Var9 = cd4.d;
                            d4c.i0(e18Var3, z80Var9, iqbVarE4);
                            if (z2) {
                                e18Var3.a0(-987032666);
                                xo1 xo1Var = lja.K;
                                iqb iqbVarE5 = b.e(b.c(fqbVar, 1.0f), 56.0f);
                                o5b o5bVarD = dw1.d(xo1Var, false);
                                int iHashCode5 = Long.hashCode(e18Var3.T);
                                hyc hycVarL5 = e18Var3.l();
                                iqb iqbVarE6 = kxk.E(e18Var3, iqbVarE5);
                                e18Var3.e0();
                                if (e18Var3.S) {
                                    e18Var3.k(re4Var2);
                                } else {
                                    e18Var3.n0();
                                }
                                d4c.i0(e18Var3, z80Var6, o5bVarD);
                                d4c.i0(e18Var3, z80Var7, hycVarL5);
                                ij0.t(iHashCode5, e18Var3, z80Var8, e18Var3, bxVar2);
                                d4c.i0(e18Var3, z80Var9, iqbVarE6);
                                ez1.a(null, vf2.J, 0L, e18Var3, 48, 5);
                                e18Var3.p(true);
                                e18Var3.p(false);
                                z80Var = z80Var9;
                            } else {
                                e18Var3.a0(-986662557);
                                String strJ03 = d4c.j0(R.string.code_starter_start_session, e18Var3);
                                iqb iqbVarC = b.c(fqbVar, 1.0f);
                                boolean zG2 = e18Var3.g(z7) | e18Var3.f(nwbVar) | e18Var3.f(nwbVar4);
                                bz7 bz7Var2 = this.H;
                                boolean zF4 = zG2 | e18Var3.f(bz7Var2);
                                nwb nwbVar5 = nwbVar;
                                Object objN4 = e18Var3.N();
                                if (zF4 || objN4 == lz1Var3) {
                                    z80Var = z80Var9;
                                    gt0Var = new gt0(z7, bz7Var2, nwbVar5, nwbVar4, 5);
                                    e18Var3.k0(gt0Var);
                                } else {
                                    gt0Var = objN4;
                                    z80Var = z80Var9;
                                }
                                dtj.a(strJ03, iqbVarC, this.I, null, e12.a, null, 0L, (zy7) gt0Var, e18Var3, 24624, 104);
                                e18Var3.p(false);
                            }
                            kxk.g(e18Var3, b.e(fqbVar, 10.0f));
                            iqb iqbVarL4 = gb9.L(androidx.compose.foundation.b.b(fqbVar, null, null, z, null, null, zy7Var4, 24), MTTypesetterKt.kLineSkipLimitMultiplier, 4.0f, 1);
                            o5b o5bVarD2 = dw1.d(lja.G, false);
                            int iHashCode6 = Long.hashCode(e18Var3.T);
                            hyc hycVarL6 = e18Var3.l();
                            iqb iqbVarE7 = kxk.E(e18Var3, iqbVarL4);
                            e18Var3.e0();
                            if (e18Var3.S) {
                                e18Var3.k(re4Var2);
                            } else {
                                e18Var3.n0();
                            }
                            d4c.i0(e18Var3, z80Var6, o5bVarD2);
                            d4c.i0(e18Var3, z80Var7, hycVarL6);
                            ij0.t(iHashCode6, e18Var3, z80Var8, e18Var3, bxVar2);
                            d4c.i0(e18Var3, z80Var, iqbVarE7);
                            tjh.b(d4c.j0(R.string.code_starter_connect_own_repo, e18Var3), null, gm3.a(e18Var3).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var3).e.E).k, e18Var3, 0, 0, 131066);
                            ij0.w(e18Var3, true, true, true);
                        } else {
                            mlg mlgVar = (mlg) it.next();
                            String str3 = mlgVar.b;
                            String strJ04 = d4c.j0(mlgVar.c, e18Var3);
                            boolean zR = x44.r((String) nwbVar4.getValue(), mlgVar.a);
                            boolean z8 = !z5;
                            boolean zF5 = e18Var3.f(nwbVar4) | e18Var3.h(mlgVar);
                            Object objN5 = e18Var3.N();
                            lz1 lz1Var4 = lz1Var2;
                            if (zF5 || objN5 == lz1Var4) {
                                objN5 = new ytf(mlgVar, 9, nwbVar4);
                                e18Var3.k0(objN5);
                            }
                            kzj.c(196608, e18Var3, (zy7) objN5, gb9.L(b.c(fqbVar, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 5.0f, 1), str3, strJ04, zR, z8);
                            lz1Var2 = lz1Var4;
                        }
                    }
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ jv(boolean z, zy7 zy7Var, boolean z2, zy7 zy7Var2, by2 by2Var, bz7 bz7Var, boolean z3, zy7 zy7Var3) {
        this.F = z;
        this.J = zy7Var;
        this.G = z2;
        this.K = zy7Var2;
        this.M = by2Var;
        this.H = bz7Var;
        this.I = z3;
        this.L = zy7Var3;
    }

    public /* synthetic */ jv(boolean z, boolean z2, bz7 bz7Var, pl3 pl3Var, nwb nwbVar, MemorySynthesisResponse memorySynthesisResponse, boolean z3, pz7 pz7Var) {
        this.F = z;
        this.G = z2;
        this.H = bz7Var;
        this.J = pl3Var;
        this.K = nwbVar;
        this.L = memorySynthesisResponse;
        this.I = z3;
        this.M = pz7Var;
    }
}
