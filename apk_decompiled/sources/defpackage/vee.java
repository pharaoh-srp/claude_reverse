package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.experience.BannerContent;
import com.anthropic.claude.api.experience.ExperienceAsset;
import com.anthropic.claude.api.experience.ExperienceButton;
import com.anthropic.claude.api.experience.ExperienceButtonType;
import com.anthropic.claude.api.experience.OpenLinkAction;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vee {
    static {
        new BannerContent("Take your desktop sessions on the go", "Get started by running `/remote-control` from Claude Code.", (ExperienceAsset) null, x44.W(new ExperienceButton(ExperienceButtonType.SECONDARY, "Learn more", x44.W(new OpenLinkAction("https://code.claude.com/docs/en/remote-control")))), true, 4, (mq5) null);
    }

    public static final void a(ExperienceAsset experienceAsset, iqb iqbVar, ld4 ld4Var, int i) {
        String strR;
        xo1 xo1Var = lja.N;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1303689223);
        int i2 = (e18Var.f(experienceAsset) ? 4 : 2) | i;
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            if (experienceAsset == null) {
                e18Var.a0(-1183439564);
                e18Var.p(false);
                strR = null;
            } else {
                e18Var.a0(-1183439563);
                strR = wjk.r(experienceAsset, e18Var, 0);
                e18Var.p(false);
            }
            k2e k2eVar = ho4.a;
            if (strR != null) {
                e18Var.a0(-1183359986);
                nuk.e(strR, null, iqbVar, null, null, xo1Var, k2eVar, MTTypesetterKt.kLineSkipLimitMultiplier, 0, false, e18Var, 14156208, 3896);
                e18Var.p(false);
            } else {
                e18Var.a0(-1183133748);
                xn5.N(u00.D(R.drawable.ccr_upsell_phone_laptop, 0, e18Var), null, iqbVar, xo1Var, k2eVar, MTTypesetterKt.kLineSkipLimitMultiplier, null, e18Var, 28088, 96);
                e18Var.p(false);
            }
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new lpa(experienceAsset, iqbVar, i, 29);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v5, types: [java.lang.Throwable] */
    public static final void b(BannerContent bannerContent, zy7 zy7Var, zy7 zy7Var2, final pz7 pz7Var, iqb iqbVar, boolean z, ld4 ld4Var, int i) {
        e18 e18Var;
        lz1 lz1Var;
        Object hreVar;
        fqb fqbVar;
        e18 e18Var2;
        float f;
        vue vueVar;
        lz1 lz1Var2;
        zy7Var.getClass();
        zy7Var2.getClass();
        pz7Var.getClass();
        e18 e18Var3 = (e18) ld4Var;
        e18Var3.c0(-319440720);
        int i2 = (e18Var3.g(z) ? 131072 : 65536) | i | (e18Var3.f(bannerContent) ? 4 : 2) | (e18Var3.h(zy7Var) ? 32 : 16) | (e18Var3.h(zy7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var3.h(pz7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var3.f(iqbVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
        if (e18Var3.Q(i2 & 1, (74899 & i2) != 74898)) {
            eli eliVar = (eli) e18Var3.j(ve4.t);
            Object objN = e18Var3.N();
            lz1 lz1Var3 = jd4.a;
            if (objN == lz1Var3) {
                objN = fd9.O(im6.E, e18Var3);
                e18Var3.k0(objN);
            }
            final l45 l45Var = (l45) objN;
            boolean zF = e18Var3.f(eliVar);
            Object objN2 = e18Var3.N();
            if (zF || objN2 == lz1Var3) {
                lz1Var = lz1Var3;
                objN2 = new k87(new pac(1, eliVar, eli.class, "openUri", "openUri(Ljava/lang/String;)V", 0, 21));
                e18Var3.k0(objN2);
            } else {
                lz1Var = lz1Var3;
            }
            k87 k87Var = (k87) objN2;
            e0g e0gVar = gm3.b(e18Var3).h;
            boolean z2 = (i2 & 112) == 32;
            Object objN3 = e18Var3.N();
            zb0 zb0Var = null;
            if (z2 || objN3 == lz1Var) {
                objN3 = new es0(zy7Var, null, 19);
                e18Var3.k0(objN3);
            }
            fd9.i(e18Var3, (pz7) objN3, iei.a);
            String description = bannerContent.getDescription();
            if (description == null) {
                e18Var3.a0(1189947027);
                e18Var3.p(false);
            } else {
                e18Var3.a0(1189947028);
                boolean zF2 = e18Var3.f(description);
                Object objN4 = e18Var3.N();
                if (zF2 || objN4 == lz1Var) {
                    try {
                        hreVar = p39.c(description);
                    } catch (Throwable th) {
                        hreVar = new hre(th);
                    }
                    if (jre.a(hreVar) != null) {
                        hreVar = new zb0(description);
                    }
                    objN4 = (zb0) hreVar;
                    e18Var3.k0(objN4);
                }
                zb0Var = (zb0) objN4;
                e18Var3.p(false);
            }
            zb0 zb0Var2 = zb0Var;
            wo1 wo1Var = lja.Q;
            iqb iqbVarV = xn5.V(b.c(iqbVar, 1.0f), e0gVar);
            long j = gm3.a(e18Var3).u;
            iqbVarV.getClass();
            e0gVar.getClass();
            iqb iqbVarL = gb9.L(rkj.j(zni.t(iqbVarV, new rp(e0gVar, 3.0f, 3.0f, j)), za9.E), 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
            cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var3, 48);
            int iHashCode = Long.hashCode(e18Var3.T);
            hyc hycVarL = e18Var3.l();
            iqb iqbVarE = kxk.E(e18Var3, iqbVarL);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var3.e0();
            if (e18Var3.S) {
                e18Var3.k(re4Var);
            } else {
                e18Var3.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var3, z80Var, cxeVarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var3, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var3, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var3, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var3, z80Var4, iqbVarE);
            ho0 ho0Var = new ho0(4.0f, true, new sz6(1));
            iqb iqbVarL2 = gb9.L(new hw9(1.0f, true), MTTypesetterKt.kLineSkipLimitMultiplier, 12.0f, 1);
            q64 q64VarA = p64.a(ho0Var, lja.S, e18Var3, 6);
            int iHashCode2 = Long.hashCode(e18Var3.T);
            hyc hycVarL2 = e18Var3.l();
            iqb iqbVarE2 = kxk.E(e18Var3, iqbVarL2);
            e18Var3.e0();
            if (e18Var3.S) {
                e18Var3.k(re4Var);
            } else {
                e18Var3.n0();
            }
            d4c.i0(e18Var3, z80Var, q64VarA);
            d4c.i0(e18Var3, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var3, z80Var3, e18Var3, bxVar);
            d4c.i0(e18Var3, z80Var4, iqbVarE2);
            String title = bannerContent.getTitle();
            tkh tkhVar = ((jm3) gm3.c(e18Var3).e.E).j;
            long j2 = gm3.a(e18Var3).N;
            final k87 k87Var2 = k87Var;
            egg eggVar = null;
            boolean z3 = false;
            lz1 lz1Var4 = lz1Var;
            tjh.b(title, null, j2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar, e18Var3, 0, 0, 131066);
            e18 e18Var4 = e18Var3;
            boolean inlineButtons = bannerContent.getInlineButtons();
            fqb fqbVar2 = fqb.E;
            if (inlineButtons) {
                e18Var4.a0(-1790199087);
                long j3 = gm3.a(e18Var4).N;
                e18Var4.a0(-1443218068);
                xb0 xb0Var = new xb0();
                if (zb0Var2 != null) {
                    xb0Var.e(zb0Var2);
                }
                e18Var4.a0(-1443214033);
                int i3 = 0;
                for (Object obj : bannerContent.getButtons()) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        ?? r22 = eggVar;
                        x44.n0();
                        throw r22;
                    }
                    final ExperienceButton experienceButton = (ExperienceButton) obj;
                    if (xb0Var.E.length() > 0) {
                        xb0Var.c(' ');
                    }
                    String strP = grc.p(i3, "banner-button-");
                    ekh ekhVar = new ekh(new egg(j3, 0L, dv7.L, null, null, null, null, 0L, null, null, null, 0L, qeh.c, null, 61434), eggVar, eggVar, eggVar);
                    egg eggVar2 = eggVar;
                    fqb fqbVar3 = fqbVar2;
                    boolean zH = ((i2 & 7168) == 2048) | e18Var4.h(l45Var) | e18Var4.h(k87Var2) | e18Var4.f(experienceButton);
                    Object objN5 = e18Var4.N();
                    if (zH || objN5 == lz1Var4) {
                        objN5 = new v6a() { // from class: uee
                            @Override // defpackage.v6a
                            public final void a(o6a o6aVar) {
                                o6aVar.getClass();
                                gb9.D(l45Var, null, null, new yqd(experienceButton, k87Var2, pz7Var, null, 1), 3);
                            }
                        };
                        e18Var4.k0(objN5);
                    }
                    int iK = xb0Var.k(new m6a(strP, ekhVar, (v6a) objN5));
                    try {
                        xb0Var.h(experienceButton.getText());
                        xb0Var.j(iK);
                        fqbVar2 = fqbVar3;
                        eggVar = eggVar2;
                        i3 = i4;
                        z3 = false;
                    } catch (Throwable th2) {
                        xb0Var.j(iK);
                        throw th2;
                    }
                }
                e18Var4.p(z3);
                zb0 zb0VarN = xb0Var.n();
                e18Var4.p(z3);
                fqbVar = fqbVar2;
                tjh.c(zb0VarN, null, gm3.a(e18Var4).N, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, ((jm3) gm3.c(e18Var4).e.E).i, e18Var4, 0, 0, 262138);
                e18Var4.p(false);
                e18Var2 = e18Var4;
                f = MTTypesetterKt.kLineSkipLimitMultiplier;
            } else {
                fqbVar = fqbVar2;
                e18Var4.a0(-1788899257);
                if (zb0Var2 == null) {
                    e18Var4.a0(-1788873869);
                    e18Var4.p(false);
                } else {
                    e18Var4.a0(-1788873868);
                    tjh.c(zb0Var2, null, gm3.a(e18Var4).N, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, ((jm3) gm3.c(e18Var4).e.E).i, e18Var4, 0, 0, 262138);
                    e18Var4 = e18Var4;
                    e18Var4.p(false);
                }
                Iterator it = bannerContent.getButtons().iterator();
                while (it.hasNext()) {
                    ExperienceButton experienceButton2 = (ExperienceButton) it.next();
                    String text = experienceButton2.getText();
                    tkh tkhVar2 = ((jm3) gm3.c(e18Var4).e.E).j;
                    long j4 = gm3.a(e18Var4).N;
                    iqb iqbVarV2 = xn5.V(fqbVar, gm3.b(e18Var4).d);
                    vue vueVar2 = new vue(0);
                    Iterator it2 = it;
                    boolean zH2 = ((i2 & 7168) == 2048) | e18Var4.h(l45Var) | e18Var4.h(k87Var2) | e18Var4.f(experienceButton2);
                    Object objN6 = e18Var4.N();
                    if (zH2 || objN6 == lz1Var4) {
                        k87 k87Var3 = k87Var2;
                        vueVar = vueVar2;
                        lz1Var2 = lz1Var4;
                        xqd xqdVar = new xqd(experienceButton2, l45Var, k87Var3, pz7Var, 1);
                        k87Var2 = k87Var3;
                        e18Var4.k0(xqdVar);
                        objN6 = xqdVar;
                    } else {
                        lz1Var2 = lz1Var4;
                        vueVar = vueVar2;
                    }
                    e18 e18Var5 = e18Var4;
                    tjh.b(text, androidx.compose.foundation.b.c(iqbVarV2, false, null, vueVar, null, (zy7) objN6, 11), j4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar2, e18Var5, 0, 0, 131064);
                    lz1Var4 = lz1Var2;
                    e18Var4 = e18Var5;
                    it = it2;
                }
                e18Var2 = e18Var4;
                f = MTTypesetterKt.kLineSkipLimitMultiplier;
                e18Var2.p(false);
            }
            e18Var2.p(true);
            kxk.g(e18Var2, b.t(fqbVar, 4.0f));
            a(bannerContent.getAsset(), b.g(b.t(fqbVar, 71.0f), f, 130.0f, 1).B(b.b), e18Var2, 3504);
            if (z) {
                e18Var2.a0(112653799);
                e18 e18Var6 = e18Var2;
                iv1.b(ud0.M1, d4c.j0(R.string.ccr_upsell_remote_control_dismiss, e18Var2), androidx.compose.foundation.b.b(gb9.N(new sti(lja.P), MTTypesetterKt.kLineSkipLimitMultiplier, 12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13), null, due.a(false, 20.0f, 0L, null, false, 252), false, null, new vue(0), zy7Var2, 12), null, gm3.a(e18Var2).N, e18Var6, 0, 8);
                e18Var = e18Var6;
                e18Var.p(false);
            } else {
                e18Var = e18Var2;
                e18Var.a0(113254734);
                e18Var.p(false);
            }
            e18Var.p(true);
        } else {
            e18Var = e18Var3;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ht0(bannerContent, zy7Var, zy7Var2, pz7Var, iqbVar, z, i);
        }
    }
}
