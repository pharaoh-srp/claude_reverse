package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.account.RavenType;
import com.anthropic.claude.api.common.RateLimit;
import com.anthropic.claude.api.experience.BannerContent;
import com.anthropic.claude.code.remote.i;
import com.anthropic.claude.design.icon.a;
import com.anthropic.claude.project.details.ProjectDetailsScreenParams;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ht0 implements pz7 {
    public final /* synthetic */ int E = 5;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ ht0(boolean z, z4g z4gVar, pz7 pz7Var, pz7 pz7Var2, pz7 pz7Var3, pz7 pz7Var4) {
        this.F = z;
        this.I = z4gVar;
        this.H = pz7Var;
        this.J = pz7Var2;
        this.G = pz7Var3;
        this.K = pz7Var4;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i;
        int i2 = this.E;
        lz1 lz1Var = jd4.a;
        boolean z2 = this.F;
        int i3 = 2;
        iei ieiVar = iei.a;
        Object obj3 = this.K;
        Object obj4 = this.G;
        Object obj5 = this.J;
        Object obj6 = this.H;
        Object obj7 = this.I;
        switch (i2) {
            case 0:
                ((Integer) obj2).getClass();
                stk.e((yt0) obj7, this.F, (bz7) obj6, (zy7) obj5, (iqb) obj4, (ycb) obj3, (ld4) obj, x44.p0(7));
                break;
            case 1:
                leb lebVar = (leb) obj7;
                i iVar = (i) obj5;
                iqb iqbVar = (iqb) obj4;
                pz7 pz7Var = (pz7) obj3;
                bz7 bz7Var = (bz7) obj6;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    boolean zG = e18Var.g(z2) | e18Var.f(iVar) | e18Var.h(lebVar);
                    Object objN = e18Var.N();
                    if (zG || objN == lz1Var) {
                        objN = new jl1(z2, iVar, lebVar, i3);
                        e18Var.k0(objN);
                    }
                    ttj.a(lebVar, (bz7) objN, iqbVar, pz7Var, bz7Var, e18Var, 384);
                }
                break;
            case 2:
                RateLimit rateLimit = (RateLimit) obj7;
                r1e r1eVar = (r1e) obj6;
                iwg iwgVar = (iwg) obj4;
                qi3 qi3Var = (qi3) obj3;
                zy7 zy7Var = (zy7) obj5;
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else if (!z2) {
                    e18Var2.a0(-2073493751);
                    RateLimit.ApproachingLimit approachingLimit = (RateLimit.ApproachingLimit) rateLimit;
                    Integer remaining = approachingLimit.getRemaining();
                    h66.k(remaining != null ? remaining.intValue() : 0, approachingLimit.getResetsAt(), r1eVar, iwgVar, qi3Var, zy7Var, 0L, e18Var2, 0);
                    e18Var2.p(false);
                } else {
                    e18Var2.a0(-2073905028);
                    h66.r((RateLimit.ApproachingLimit) rateLimit, r1eVar, iwgVar, qi3Var, zy7Var, 0L, e18Var2, 0);
                    e18Var2.p(false);
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                bqk.b((ud0) obj7, (String) obj6, (String) obj3, this.F, (zy7) obj5, (iqb) obj4, (ld4) obj, x44.p0(196609));
                break;
            case 4:
                qi3 qi3Var2 = (qi3) obj7;
                ild ildVar = (ild) obj6;
                ProjectDetailsScreenParams projectDetailsScreenParams = (ProjectDetailsScreenParams) obj4;
                zy7 zy7Var2 = (zy7) obj5;
                x0a x0aVar = (x0a) obj3;
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e18Var3.T();
                } else {
                    boolean zH = e18Var3.h(qi3Var2) | e18Var3.h(ildVar) | e18Var3.f(projectDetailsScreenParams) | e18Var3.f(zy7Var2);
                    Object objN2 = e18Var3.N();
                    if (zH || objN2 == lz1Var) {
                        he heVar = new he(qi3Var2, ildVar, projectDetailsScreenParams, zy7Var2, 21);
                        e18Var3.k0(heVar);
                        objN2 = heVar;
                    }
                    ytk.d(this.F, (zy7) objN2, x0aVar, null, e18Var3, 0);
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                vee.b((BannerContent) obj7, (zy7) obj5, (zy7) obj6, (pz7) obj3, (iqb) obj4, this.F, (ld4) obj, x44.p0(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                pnk.d((qhe) obj7, (zy7) obj5, (zy7) obj6, (zy7) obj3, this.F, (iqb) obj4, (ld4) obj, x44.p0(1));
                break;
            case 7:
                pvg pvgVar = (pvg) obj7;
                RavenType ravenType = (RavenType) obj6;
                sz7 sz7Var = (sz7) obj5;
                String str = (String) obj4;
                String str2 = (String) obj3;
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    e18Var4.T();
                } else {
                    wo1 wo1Var = lja.Q;
                    fqb fqbVar = fqb.E;
                    iqb iqbVarK = gb9.K(fqbVar, 16.0f, 20.0f);
                    fo0 fo0Var = ko0.a;
                    cxe cxeVarA = axe.a(fo0Var, wo1Var, e18Var4, 48);
                    int iHashCode = Long.hashCode(e18Var4.T);
                    hyc hycVarL = e18Var4.l();
                    iqb iqbVarE = kxk.E(e18Var4, iqbVarK);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var4.e0();
                    if (e18Var4.S) {
                        e18Var4.k(re4Var);
                    } else {
                        e18Var4.n0();
                    }
                    z80 z80Var = cd4.f;
                    d4c.i0(e18Var4, z80Var, cxeVarA);
                    z80 z80Var2 = cd4.e;
                    d4c.i0(e18Var4, z80Var2, hycVarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    z80 z80Var3 = cd4.g;
                    d4c.i0(e18Var4, z80Var3, numValueOf);
                    bx bxVar = cd4.h;
                    d4c.h0(e18Var4, bxVar);
                    z80 z80Var4 = cd4.d;
                    hw9 hw9VarN = kgh.n(e18Var4, iqbVarE, z80Var4, 1.0f, true);
                    q64 q64VarA = p64.a(ko0.c, lja.S, e18Var4, 0);
                    int iHashCode2 = Long.hashCode(e18Var4.T);
                    hyc hycVarL2 = e18Var4.l();
                    iqb iqbVarE2 = kxk.E(e18Var4, hw9VarN);
                    e18Var4.e0();
                    if (e18Var4.S) {
                        e18Var4.k(re4Var);
                    } else {
                        e18Var4.n0();
                    }
                    d4c.i0(e18Var4, z80Var, q64VarA);
                    d4c.i0(e18Var4, z80Var2, hycVarL2);
                    ij0.t(iHashCode2, e18Var4, z80Var3, e18Var4, bxVar);
                    d4c.i0(e18Var4, z80Var4, iqbVarE2);
                    tjh.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var4).e.E).h, e18Var4, 0, 24960, 110590);
                    if (z2) {
                        sq6.A(4.0f, 575703483, e18Var4, e18Var4, fqbVar);
                        cxe cxeVarA2 = axe.a(fo0Var, wo1Var, e18Var4, 48);
                        int iHashCode3 = Long.hashCode(e18Var4.T);
                        hyc hycVarL3 = e18Var4.l();
                        iqb iqbVarE3 = kxk.E(e18Var4, fqbVar);
                        e18Var4.e0();
                        if (e18Var4.S) {
                            e18Var4.k(re4Var);
                        } else {
                            e18Var4.n0();
                        }
                        d4c.i0(e18Var4, z80Var, cxeVarA2);
                        d4c.i0(e18Var4, z80Var2, hycVarL3);
                        ij0.t(iHashCode3, e18Var4, z80Var3, e18Var4, bxVar);
                        d4c.i0(e18Var4, z80Var4, iqbVarE3);
                        e18Var4.a0(1156181739);
                        float fD = ((cz5) e18Var4.j(ve4.h)).D(((jm3) gm3.c(e18Var4).e.E).i.a.b);
                        e18Var4.p(false);
                        cv8.b(a.a(ud0.T0, e18Var4), null, b.o(fqbVar, fD), 0L, e18Var4, 56, 8);
                        kxk.g(e18Var4, b.t(fqbVar, 4.0f));
                        tjh.b(str2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var4).e.E).i, e18Var4, 0, 24960, 110590);
                        z = true;
                        e18Var4.p(true);
                        i = 0;
                        e18Var4.p(false);
                    } else {
                        z = true;
                        i = 0;
                        e18Var4.a0(576666405);
                        e18Var4.p(false);
                    }
                    e18Var4.p(z);
                    kxk.g(e18Var4, b.t(fqbVar, 8.0f));
                    uvk.c(pvgVar, ravenType, e18Var4, i);
                    if (sz7Var != null) {
                        ij0.r(8.0f, -502173170, e18Var4, e18Var4, fqbVar);
                        iv1.b(ud0.B, null, null, ef2.F, gm3.a(e18Var4).N, e18Var4, 3120, 4);
                        e18Var4.p(false);
                    } else {
                        e18Var4.a0(-501853157);
                        e18Var4.p(false);
                    }
                    e18Var4.p(true);
                }
                break;
            default:
                z4g z4gVar = (z4g) obj7;
                pz7 pz7Var2 = (pz7) obj6;
                pz7 pz7Var3 = (pz7) obj5;
                pz7 pz7Var4 = (pz7) obj4;
                pz7 pz7Var5 = (pz7) obj3;
                ld4 ld4Var5 = (ld4) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                e18 e18Var5 = (e18) ld4Var5;
                if (!e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    e18Var5.T();
                } else {
                    iqb iqbVarN = fqb.E;
                    if (z2) {
                        iqbVarN = gb9.N(iqbVarN, MTTypesetterKt.kLineSkipLimitMultiplier, k4g.h, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13);
                    }
                    quj.d(iqbVarN, z4gVar, pz7Var2, pz7Var3, pz7Var4, pz7Var5, e18Var5, 0, 0);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ ht0(yt0 yt0Var, boolean z, bz7 bz7Var, zy7 zy7Var, iqb iqbVar, ycb ycbVar, int i) {
        this.I = yt0Var;
        this.F = z;
        this.H = bz7Var;
        this.J = zy7Var;
        this.G = iqbVar;
        this.K = ycbVar;
    }

    public /* synthetic */ ht0(leb lebVar, boolean z, i iVar, iqb iqbVar, pz7 pz7Var, bz7 bz7Var) {
        this.I = lebVar;
        this.F = z;
        this.J = iVar;
        this.G = iqbVar;
        this.K = pz7Var;
        this.H = bz7Var;
    }

    public /* synthetic */ ht0(qhe qheVar, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, boolean z, iqb iqbVar, int i) {
        this.I = qheVar;
        this.J = zy7Var;
        this.H = zy7Var2;
        this.K = zy7Var3;
        this.F = z;
        this.G = iqbVar;
    }

    public /* synthetic */ ht0(pvg pvgVar, RavenType ravenType, sz7 sz7Var, String str, boolean z, String str2) {
        this.I = pvgVar;
        this.H = ravenType;
        this.J = sz7Var;
        this.G = str;
        this.F = z;
        this.K = str2;
    }

    public /* synthetic */ ht0(BannerContent bannerContent, zy7 zy7Var, zy7 zy7Var2, pz7 pz7Var, iqb iqbVar, boolean z, int i) {
        this.I = bannerContent;
        this.J = zy7Var;
        this.H = zy7Var2;
        this.K = pz7Var;
        this.G = iqbVar;
        this.F = z;
    }

    public /* synthetic */ ht0(boolean z, qi3 qi3Var, ild ildVar, ProjectDetailsScreenParams projectDetailsScreenParams, zy7 zy7Var, x0a x0aVar) {
        this.F = z;
        this.I = qi3Var;
        this.H = ildVar;
        this.G = projectDetailsScreenParams;
        this.J = zy7Var;
        this.K = x0aVar;
    }

    public /* synthetic */ ht0(ud0 ud0Var, String str, String str2, boolean z, zy7 zy7Var, iqb iqbVar, int i) {
        this.I = ud0Var;
        this.H = str;
        this.K = str2;
        this.F = z;
        this.J = zy7Var;
        this.G = iqbVar;
    }

    public /* synthetic */ ht0(boolean z, RateLimit rateLimit, r1e r1eVar, iwg iwgVar, qi3 qi3Var, zy7 zy7Var) {
        this.F = z;
        this.I = rateLimit;
        this.H = r1eVar;
        this.G = iwgVar;
        this.K = qi3Var;
        this.J = zy7Var;
    }
}
