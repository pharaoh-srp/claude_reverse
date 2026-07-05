package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.app.onboarding.OnboardingPage;
import com.anthropic.claude.tool.model.MobileAppToolPreviewInfo;
import com.anthropic.claude.ui.demo.app.UiDemoAppDestination;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ci implements sz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ ci(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        e18 e18Var;
        int i = this.E;
        lz1 lz1Var = jd4.a;
        int i2 = 2;
        fqb fqbVar = fqb.E;
        iei ieiVar = iei.a;
        Object obj5 = this.F;
        switch (i) {
            case 0:
                ai aiVar = (ai) obj5;
                mnc mncVar = (mnc) obj2;
                ld4 ld4Var = (ld4) obj3;
                int iH = ebh.h((Integer) obj4, (s64) obj, mncVar);
                if ((iH & 48) == 0) {
                    iH |= ((e18) ld4Var).f(mncVar) ? 32 : 16;
                }
                e18 e18Var2 = (e18) ld4Var;
                if (e18Var2.Q(iH & 1, (iH & 145) != 144)) {
                    hi hiVar = (hi) aiVar.c.getValue();
                    boolean zF = e18Var2.f(aiVar);
                    Object objN = e18Var2.N();
                    if (zF || objN == lz1Var) {
                        objN = new v0(5, aiVar);
                        e18Var2.k0(objN);
                    }
                    tnk.a(hiVar, (bz7) objN, gb9.I(fqbVar, mncVar), e18Var2, 0, 8);
                } else {
                    e18Var2.T();
                }
                return ieiVar;
            case 1:
                MobileAppToolPreviewInfo mobileAppToolPreviewInfo = (MobileAppToolPreviewInfo) obj5;
                mnc mncVar2 = (mnc) obj2;
                ld4 ld4Var2 = (ld4) obj3;
                int iH2 = ebh.h((Integer) obj4, (s64) obj, mncVar2);
                if ((iH2 & 48) == 0) {
                    iH2 |= ((e18) ld4Var2).f(mncVar2) ? 32 : 16;
                }
                e18 e18Var3 = (e18) ld4Var2;
                if (e18Var3.Q(iH2 & 1, (iH2 & 145) != 144)) {
                    pzg.a(gb9.I(b.c(fqbVar, 1.0f), mncVar2), gm3.b(e18Var3).f, gm3.a(e18Var3).p, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, fd9.q0(1823742568, new vk1(mobileAppToolPreviewInfo, 0), e18Var3), e18Var3, 12582912, 120);
                } else {
                    e18Var3.T();
                }
                return ieiVar;
            case 2:
                tkh tkhVar = (tkh) obj5;
                String str = (String) obj2;
                ld4 ld4Var3 = (ld4) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((c90) obj).getClass();
                str.getClass();
                if ((iIntValue & 48) == 0) {
                    iIntValue |= ((e18) ld4Var3).f(str) ? 32 : 16;
                }
                e18 e18Var4 = (e18) ld4Var3;
                if (e18Var4.Q(iIntValue & 1, (iIntValue & 145) != 144)) {
                    tjh.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar, e18Var4, (iIntValue >> 3) & 14, 0, 131070);
                } else {
                    e18Var4.T();
                }
                return ieiVar;
            case 3:
                db3 db3Var = (db3) obj5;
                mnc mncVar3 = (mnc) obj2;
                ld4 ld4Var4 = (ld4) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((s64) obj).getClass();
                mncVar3.getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= ((e18) ld4Var4).f(mncVar3) ? 32 : 16;
                }
                int i3 = iIntValue2;
                e18 e18Var5 = (e18) ld4Var4;
                if (e18Var5.Q(i3 & 1, (i3 & 145) != 144)) {
                    u3g u3gVar = db3Var.e.i() ? u3g.E : u3g.F;
                    x3g x3gVar = (x3g) db3Var.n.getValue();
                    String strJ0 = d4c.j0(R.string.chat_sharing_subtext, e18Var5);
                    boolean zBooleanValue = ((Boolean) db3Var.p.getValue()).booleanValue();
                    boolean zF2 = e18Var5.f(db3Var);
                    Object objN2 = e18Var5.N();
                    if (zF2 || objN2 == lz1Var) {
                        objN2 = new ub2(1, db3Var, db3.class, "updateSharingStatus", "updateSharingStatus(Z)V", 0, 13);
                        e18Var5.k0(objN2);
                    }
                    jm9 jm9Var = (jm9) objN2;
                    boolean zF3 = e18Var5.f(db3Var);
                    Object objN3 = e18Var5.N();
                    if (zF3 || objN3 == lz1Var) {
                        e18Var = e18Var5;
                        r73 r73Var = new r73(0, db3Var, db3.class, "shareCurrentSnapshot", "shareCurrentSnapshot()V", 0, 20);
                        e18Var.k0(r73Var);
                        objN3 = r73Var;
                    } else {
                        e18Var = e18Var5;
                    }
                    jpi.e(u3gVar, x3gVar, strJ0, zBooleanValue, (bz7) jm9Var, fd9.q0(185724675, new fp(21, db3Var), e18Var), (zy7) ((jm9) objN3), mncVar3, null, ((Boolean) db3Var.o.getValue()).booleanValue(), e18Var, ((i3 << 18) & 29360128) | 196608, FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING);
                } else {
                    e18Var5.T();
                }
                return ieiVar;
            case 4:
                k75 k75Var = (k75) obj5;
                mnc mncVar4 = (mnc) obj2;
                ld4 ld4Var5 = (ld4) obj3;
                int iH3 = ebh.h((Integer) obj4, (s64) obj, mncVar4);
                if ((iH3 & 48) == 0) {
                    iH3 |= ((e18) ld4Var5).f(mncVar4) ? 32 : 16;
                }
                e18 e18Var6 = (e18) ld4Var5;
                if (e18Var6.Q(iH3 & 1, (iH3 & 145) != 144)) {
                    String strJ02 = d4c.j0(R.string.project_create_submit_button_text, e18Var6);
                    boolean zBooleanValue2 = ((Boolean) k75Var.m.getValue()).booleanValue();
                    boolean zBooleanValue3 = ((Boolean) k75Var.n.getValue()).booleanValue();
                    iqb iqbVarL = gb9.L(gb9.I(b.c(fqbVar, 1.0f), mncVar4), MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 1);
                    boolean zF4 = e18Var6.f(k75Var);
                    Object objN4 = e18Var6.N();
                    if (zF4 || objN4 == lz1Var) {
                        objN4 = new j75(k75Var, z ? 1 : 0);
                        e18Var6.k0(objN4);
                    }
                    dxj.a(strJ02, zBooleanValue3, iqbVarL, zBooleanValue2, null, null, null, 0L, (zy7) objN4, e18Var6, 0, 240);
                } else {
                    e18Var6.T();
                }
                return ieiVar;
            case 5:
                yih yihVar = (yih) obj5;
                ((Integer) obj2).getClass();
                ld4 ld4Var6 = (ld4) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                ((px9) obj).getClass();
                e18 e18Var7 = (e18) ld4Var6;
                if (e18Var7.Q(iIntValue3 & 1, (iIntValue3 & 129) != 128)) {
                    iqb iqbVarC = b.c(fqbVar, 1.0f);
                    qnc qncVar = qf2.a;
                    iqb iqbVarP = yfd.p(iqbVarC, gm3.a(e18Var7).o, zni.b);
                    o5b o5bVarD = dw1.d(lja.G, false);
                    int iHashCode = Long.hashCode(e18Var7.T);
                    hyc hycVarL = e18Var7.l();
                    iqb iqbVarE = kxk.E(e18Var7, iqbVarP);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var7.e0();
                    if (e18Var7.S) {
                        e18Var7.k(re4Var);
                    } else {
                        e18Var7.n0();
                    }
                    d4c.i0(e18Var7, cd4.f, o5bVarD);
                    d4c.i0(e18Var7, cd4.e, hycVarL);
                    d4c.i0(e18Var7, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var7, cd4.h);
                    d4c.i0(e18Var7, cd4.d, iqbVarE);
                    gwk.f(yihVar, gb9.K(b.c(fqbVar, 1.0f), 12.0f, 8.0f), null, true, d4c.j0(R.string.internal_setting_growthbook_search_hint, e18Var7), null, gm3.a(e18Var7).v, gm3.a(e18Var7).n, 0L, 0L, 0L, null, gm3.b(e18Var7).h, e18Var7, 3078, 3876);
                    e18Var7.p(true);
                } else {
                    e18Var7.T();
                }
                return ieiVar;
            case 6:
                zbb zbbVar = (zbb) obj5;
                mnc mncVar5 = (mnc) obj2;
                ld4 ld4Var7 = (ld4) obj3;
                int iH4 = ebh.h((Integer) obj4, (s64) obj, mncVar5);
                if ((iH4 & 48) == 0) {
                    iH4 |= ((e18) ld4Var7).f(mncVar5) ? 32 : 16;
                }
                e18 e18Var8 = (e18) ld4Var7;
                if (e18Var8.Q(iH4 & 1, (iH4 & 145) != 144)) {
                    iqb iqbVarL2 = gb9.L(gb9.I(b.c(fqbVar, 1.0f), mncVar5), MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, 1);
                    o5b o5bVarD2 = dw1.d(lja.G, false);
                    int iHashCode2 = Long.hashCode(e18Var8.T);
                    hyc hycVarL2 = e18Var8.l();
                    iqb iqbVarE2 = kxk.E(e18Var8, iqbVarL2);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var8.e0();
                    if (e18Var8.S) {
                        e18Var8.k(re4Var2);
                    } else {
                        e18Var8.n0();
                    }
                    z80 z80Var = cd4.f;
                    d4c.i0(e18Var8, z80Var, o5bVarD2);
                    z80 z80Var2 = cd4.e;
                    d4c.i0(e18Var8, z80Var2, hycVarL2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    z80 z80Var3 = cd4.g;
                    d4c.i0(e18Var8, z80Var3, numValueOf);
                    bx bxVar = cd4.h;
                    d4c.h0(e18Var8, bxVar);
                    z80 z80Var4 = cd4.d;
                    d4c.i0(e18Var8, z80Var4, iqbVarE2);
                    lsc lscVar = zbbVar.f;
                    lsc lscVar2 = zbbVar.e;
                    if (((Boolean) lscVar.getValue()).booleanValue()) {
                        e18Var8.a0(-1026245577);
                        iqb iqbVarE3 = b.e(b.c(fqbVar, 1.0f), 200.0f);
                        o5b o5bVarD3 = dw1.d(lja.K, false);
                        int iHashCode3 = Long.hashCode(e18Var8.T);
                        hyc hycVarL3 = e18Var8.l();
                        iqb iqbVarE4 = kxk.E(e18Var8, iqbVarE3);
                        e18Var8.e0();
                        if (e18Var8.S) {
                            e18Var8.k(re4Var2);
                        } else {
                            e18Var8.n0();
                        }
                        d4c.i0(e18Var8, z80Var, o5bVarD3);
                        d4c.i0(e18Var8, z80Var2, hycVarL3);
                        ij0.t(iHashCode3, e18Var8, z80Var3, e18Var8, bxVar);
                        d4c.i0(e18Var8, z80Var4, iqbVarE4);
                        ez1.a(null, vf2.H, gm3.a(e18Var8).N, e18Var8, 48, 1);
                        e18Var8.p(true);
                        e18Var8.p(false);
                    } else if (((jz0) lscVar2.getValue()) != null) {
                        e18Var8.a0(-1025715756);
                        jz0 jz0Var = (jz0) lscVar2.getValue();
                        jz0Var.getClass();
                        jlk.f(jz0Var, b.c(fqbVar, 1.0f), ((jm3) gm3.c(e18Var8).e.E).e, null, null, null, null, e18Var8, 48, 248);
                        e18Var8.p(false);
                    } else {
                        e18Var8.a0(-1025426898);
                        tjh.b(d4c.j0(R.string.generic_error_something_went_wrong, e18Var8), b.c(fqbVar, 1.0f), gm3.a(e18Var8).O, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var8).e.E).e, e18Var8, 48, 0, 130040);
                        e18Var8.p(false);
                    }
                    e18Var8.p(true);
                } else {
                    e18Var8.T();
                }
                return ieiVar;
            case 7:
                ggc ggcVar = (ggc) obj5;
                OnboardingPage onboardingPage = (OnboardingPage) obj2;
                ld4 ld4Var8 = (ld4) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                ((ia0) obj).getClass();
                onboardingPage.getClass();
                if ((iIntValue4 & 48) == 0) {
                    iIntValue4 |= (iIntValue4 & 64) == 0 ? ((e18) ld4Var8).f(onboardingPage) : ((e18) ld4Var8).h(onboardingPage) ? 32 : 16;
                }
                e18 e18Var9 = (e18) ld4Var8;
                if (e18Var9.Q(iIntValue4 & 1, (iIntValue4 & 145) != 144)) {
                    mvk.a(ggcVar, null, onboardingPage, e18Var9, (iIntValue4 << 3) & 896);
                } else {
                    e18Var9.T();
                }
                return ieiVar;
            case 8:
                mif mifVar = (mif) obj5;
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                cu9 cu9Var = (cu9) obj2;
                fcc fccVar = (fcc) obj3;
                phf phfVar = (phf) obj4;
                long jK = cu9Var.k();
                l9e l9eVar = new l9e(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, (int) (jK >> 32), (int) (jK & 4294967295L));
                boolean zJ = u00.j(fccVar.a, l9eVar);
                long jB = fccVar.a;
                if (!zJ) {
                    jB = aqk.b(jB, l9eVar);
                }
                long jA = mifVar.a(cu9Var, jB);
                if ((jA & 9223372034707292159L) != 9205357640488583168L) {
                    mifVar.q(zBooleanValue4);
                    mifVar.u = null;
                    mifVar.t(jA, 9205357640488583168L, false, phfVar);
                    bt7.a(mifVar.i);
                    mifVar.y = false;
                    mifVar.u();
                    mifVar.v = true;
                }
                return ieiVar;
            case 9:
                rwe rweVar = (rwe) obj5;
                UiDemoAppDestination uiDemoAppDestination = (UiDemoAppDestination) obj2;
                ld4 ld4Var9 = (ld4) obj3;
                int iIntValue5 = ((Integer) obj4).intValue();
                ((ia0) obj).getClass();
                uiDemoAppDestination.getClass();
                if ((iIntValue5 & 48) == 0) {
                    iIntValue5 |= ((e18) ld4Var9).d(uiDemoAppDestination.ordinal()) ? 32 : 16;
                }
                e18 e18Var10 = (e18) ld4Var9;
                if (e18Var10.Q(iIntValue5 & 1, (iIntValue5 & 145) != 144)) {
                    int i4 = gdi.a[uiDemoAppDestination.ordinal()];
                    if (i4 == 1) {
                        e18Var10.a0(239339062);
                        ssk.c(null, rweVar, e18Var10, 64);
                        e18Var10.p(false);
                    } else {
                        if (i4 != 2) {
                            throw ebh.u(e18Var10, 239337233, false);
                        }
                        e18Var10.a0(239341687);
                        vok.b(null, e18Var10, 0);
                        e18Var10.p(false);
                    }
                } else {
                    e18Var10.T();
                }
                return ieiVar;
            case 10:
                ud7 ud7Var = (ud7) obj5;
                ld4 ld4Var10 = (ld4) obj3;
                int iH5 = ebh.h((Integer) obj4, (s64) obj, (mnc) obj2);
                e18 e18Var11 = (e18) ld4Var10;
                if (!e18Var11.Q(iH5 & 1, (iH5 & 129) != 128)) {
                    e18Var11.T();
                } else if (ud7Var == null) {
                    e18Var11.a0(883509899);
                    e18Var11.p(false);
                } else {
                    e18Var11.a0(883509900);
                    yhk.b(0, 2, e18Var11, null, d4c.j0(R.string.usage_spend_limit_title, e18Var11));
                    yhk.a(null, fd9.q0(1610940856, new lca(20, ud7Var), e18Var11), e18Var11, 48);
                    e18Var11.p(false);
                }
                return ieiVar;
            case 11:
                uli uliVar = (uli) obj5;
                ld4 ld4Var11 = (ld4) obj3;
                int iH6 = ebh.h((Integer) obj4, (s64) obj, (mnc) obj2);
                e18 e18Var12 = (e18) ld4Var11;
                if (!e18Var12.Q(iH6 & 1, (iH6 & 129) != 128)) {
                    e18Var12.T();
                } else if (uliVar == null) {
                    e18Var12.a0(-1916900052);
                    e18Var12.p(false);
                } else {
                    e18Var12.a0(-1916900051);
                    yhk.a(null, fd9.q0(967600074, new lca(19, uliVar), e18Var12), e18Var12, 48);
                    e18Var12.p(false);
                }
                return ieiVar;
            default:
                List list = (List) obj5;
                ld4 ld4Var12 = (ld4) obj3;
                int iH7 = ebh.h((Integer) obj4, (s64) obj, (mnc) obj2);
                e18 e18Var13 = (e18) ld4Var12;
                if (e18Var13.Q(iH7 & 1, (iH7 & 129) != 128)) {
                    yhk.b(0, 2, e18Var13, null, d4c.j0(R.string.usage_weekly_limits, e18Var13));
                    yhk.a(null, fd9.q0(1321142655, new qr4(list, i2), e18Var13), e18Var13, 48);
                } else {
                    e18Var13.T();
                }
                return ieiVar;
        }
    }
}
