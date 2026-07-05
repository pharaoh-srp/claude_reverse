package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.experience.BulletsStyle;
import com.anthropic.claude.api.experience.ExperienceBullet;
import com.anthropic.claude.api.experience.ExperienceToggle;
import com.anthropic.claude.api.experience.SpotlightContent;
import com.anthropic.claude.bell.VoiceSessionSummary;
import com.pvporbit.freetype.FreeTypeConstants;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zjk {
    public static final ta4 a = new ta4(-577101342, false, new ob4(21));
    public static final ta4 b = new ta4(-730874397, false, new ob4(22));

    public static final void a(g4j g4jVar, bz7 bz7Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1764187335);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (e18Var.d(g4jVar.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = mpk.P(Boolean.FALSE);
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            boolean zBooleanValue = ((Boolean) nwbVar.getValue()).booleanValue();
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = new shf(14, nwbVar);
                e18Var.k0(objN2);
            }
            iqb iqbVarP = yfd.p(fqb.E, gm3.a(e18Var).p, gm3.b(e18Var).f);
            qu1 qu1VarA = sf5.a(MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var).u);
            kkk.a(zBooleanValue, (bz7) objN2, gb9.K(ez1.u(iqbVarP, qu1VarA.a, qu1VarA.b, gm3.b(e18Var).f), 12.0f, 8.0f), fd9.q0(-1489152035, new zee(g4jVar, nwbVar, bz7Var, 6), e18Var), e18Var, 3120, 0);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fnh(g4jVar, bz7Var, i, i3);
        }
    }

    public static final void b(VoiceSessionSummary voiceSessionSummary, zy7 zy7Var, zy7 zy7Var2, qi3 qi3Var, ld4 ld4Var, int i) {
        int i2;
        zy7 zy7Var3;
        qi3 qi3Var2;
        int i3;
        voiceSessionSummary.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(192109264);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var.f(voiceSessionSummary) : e18Var.h(voiceSessionSummary) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            zy7Var3 = zy7Var2;
            i2 |= e18Var.h(zy7Var3) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            zy7Var3 = zy7Var2;
        }
        if ((i & 3072) == 0) {
            i2 |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == jd4.a) {
                    objN = m7fVarN.a(jce.a.b(qi3.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                qi3Var2 = (qi3) objN;
                i3 = i2 & (-7169);
            } else {
                e18Var.T();
                i3 = i2 & (-7169);
                qi3Var2 = qi3Var;
            }
            e18Var.q();
            r4g r4gVarS = gb9.S(u4g.F, null, null, zy7Var3, e18Var, ((i3 << 3) & 7168) | 6, 6);
            String strJ0 = d4c.j0(R.string.title_feedback, e18Var);
            k4g k4gVar = k4g.a;
            vkc.a(r4gVarS, strJ0, null, k4g.d(gm3.a(e18Var).q, e18Var, 14), false, false, null, null, wvk.a, null, null, null, fd9.q0(-1546726645, new wd(qi3Var2, voiceSessionSummary, zy7Var, 17), e18Var), e18Var, 100663304, 3072, 7924);
            e18Var = e18Var;
        } else {
            e18Var.T();
            qi3Var2 = qi3Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new p3h(voiceSessionSummary, zy7Var, zy7Var2, qi3Var2, i, 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(int r56, int r57, defpackage.ld4 r58, defpackage.pz7 r59, defpackage.iqb r60) {
        /*
            Method dump skipped, instruction units count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zjk.c(int, int, ld4, pz7, iqb):void");
    }

    public static wla e(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("test_id").m();
            String strM2 = qh9Var.s("result_id").m();
            bh9 bh9VarS = qh9Var.s("injected");
            Boolean boolValueOf = bh9VarS != null ? Boolean.valueOf(bh9VarS.a()) : null;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((m7a) qh9Var.E.entrySet()).iterator();
            while (((o7a) it).hasNext()) {
                p7a p7aVarA = ((l7a) it).a();
                if (!mp0.o0(p7aVarA.getKey(), wla.e)) {
                    Object key = p7aVarA.getKey();
                    key.getClass();
                    linkedHashMap.put(key, p7aVarA.getValue());
                }
            }
            strM.getClass();
            strM2.getClass();
            return new wla(strM, strM2, boolValueOf, linkedHashMap);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Synthetics", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Synthetics", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Synthetics", e3);
            return null;
        }
    }

    public static final ExperienceToggle f(SpotlightContent spotlightContent) {
        List<ExperienceBullet> bullets = spotlightContent.getBullets();
        ExperienceToggle experienceToggle = null;
        if (spotlightContent.getBullets_style() != BulletsStyle.CARD) {
            bullets = null;
        }
        if (bullets != null) {
            Iterator<T> it = bullets.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ExperienceToggle toggle = ((ExperienceBullet) it.next()).getToggle();
                if (toggle != null) {
                    experienceToggle = toggle;
                    break;
                }
            }
            if (experienceToggle != null) {
                return experienceToggle;
            }
        }
        return spotlightContent.getToggle();
    }

    public static l5 g(Locale locale) {
        if (l5.e == null) {
            l5 l5Var = new l5(0);
            l5Var.d = BreakIterator.getCharacterInstance(locale);
            l5.e = l5Var;
        }
        l5 l5Var2 = l5.e;
        l5Var2.getClass();
        return l5Var2;
    }

    public static String h(wd3 wd3Var, ge9 ge9Var) {
        if (wd3Var.a(ge9Var)) {
            return null;
        }
        return wd3Var.getDescription();
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x01dd, code lost:
    
        r0 = defpackage.sf5.k(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e1, code lost:
    
        defpackage.csg.o(r2, null);
        r10 = r0;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.n3h i(defpackage.lze r29, java.lang.String r30) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zjk.i(lze, java.lang.String):n3h");
    }
}
