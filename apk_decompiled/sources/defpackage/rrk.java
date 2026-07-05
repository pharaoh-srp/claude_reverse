package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowInsetsController;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.referral.ReferralEligibility;
import com.anthropic.claude.tool.model.MessageComposeV0InputKind;
import com.pvporbit.freetype.FreeTypeConstants;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rrk {
    public static final ta4 a = new ta4(-1806138876, false, new tb4(26));

    /* JADX WARN: Removed duplicated region for block: B:102:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.anthropic.claude.api.referral.ReferralEligibility r34, boolean r35, final defpackage.zy7 r36, defpackage.iqb r37, defpackage.ld4 r38, int r39) {
        /*
            Method dump skipped, instruction units count: 1060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rrk.a(com.anthropic.claude.api.referral.ReferralEligibility, boolean, zy7, iqb, ld4, int):void");
    }

    public static final void b(zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1504500591);
        int i2 = (e18Var.h(zy7Var) ? 4 : 2) | i | 48;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            wo1 wo1Var = lja.Q;
            ho0 ho0Var = new ho0(12.0f, true, new sz6(1));
            qnc qncVar = j9a.a;
            fqb fqbVar = fqb.E;
            iqb iqbVarV = xn5.V(b.c(gb9.L(fqbVar, 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), 1.0f), gm3.b(e18Var).q);
            qnc qncVar2 = qf2.a;
            iqb iqbVarK = gb9.K(androidx.compose.foundation.b.c(yfd.p(iqbVarV, gm3.a(e18Var).n, zni.b), false, null, new vue(0), null, zy7Var, 11), 20.0f, 16.0f);
            cxe cxeVarA = axe.a(ho0Var, wo1Var, e18Var, 54);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarK);
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
            iqbVar2 = fqbVar;
            iv1.b(ud0.s0, null, null, null, 0L, e18Var, 48, 28);
            tjh.b(d4c.j0(R.string.guest_pass_title, e18Var), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 0, 0, 131070);
            e18Var = e18Var;
            e18Var.p(true);
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xh(zy7Var, iqbVar2, i, 7);
        }
    }

    public static final void c(ce8 ce8Var, zy7 zy7Var, kae kaeVar, koi koiVar, qi3 qi3Var, ld4 ld4Var, int i) {
        int i2;
        kae kaeVar2;
        koi koiVar2;
        qi3 qi3Var2;
        int i3;
        qi3 qi3Var3;
        koi koiVar3;
        kae kaeVar3;
        kae kaeVar4;
        koi koiVar4;
        ce8Var.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(542194526);
        if ((i & 6) == 0) {
            i2 = i | (e18Var.d(ce8Var.ordinal()) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i4 = i2 | (e18Var.h(zy7Var) ? 32 : 16) | 9344;
        if (e18Var.Q(i4 & 1, (i4 & 9363) != 9362)) {
            e18Var.V();
            int i5 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i5 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(kae.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                kae kaeVar5 = (kae) objN;
                m7f m7fVarN2 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF2 = e18Var.f(null) | e18Var.f(m7fVarN2);
                Object objN2 = e18Var.N();
                if (zF2 || objN2 == lz1Var) {
                    objN2 = m7fVarN2.a(jce.a.b(koi.class), null, null);
                    e18Var.k0(objN2);
                }
                e18Var.p(false);
                e18Var.p(false);
                koi koiVar5 = (koi) objN2;
                m7f m7fVarN3 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF3 = e18Var.f(null) | e18Var.f(m7fVarN3);
                Object objN3 = e18Var.N();
                if (zF3 || objN3 == lz1Var) {
                    objN3 = m7fVarN3.a(jce.a.b(qi3.class), null, null);
                    e18Var.k0(objN3);
                }
                e18Var.p(false);
                e18Var.p(false);
                i3 = i4 & (-65409);
                qi3Var3 = (qi3) objN3;
                koiVar3 = koiVar5;
                kaeVar3 = kaeVar5;
            } else {
                e18Var.T();
                i3 = i4 & (-65409);
                kaeVar3 = kaeVar;
                koiVar3 = koiVar;
                qi3Var3 = qi3Var;
            }
            int i6 = i3;
            e18Var.q();
            ReferralEligibility referralEligibilityA = kaeVar3.a(koiVar3.e);
            Object objN4 = e18Var.N();
            if (objN4 == lz1Var) {
                objN4 = fd9.O(im6.E, e18Var);
                e18Var.k0(objN4);
            }
            l45 l45Var = (l45) objN4;
            Context context = (Context) e18Var.j(w00.b);
            eli eliVarA = kd7.a(e18Var);
            r4g r4gVarS = gb9.S(u4g.H, null, null, zy7Var, e18Var, ((i6 << 6) & 7168) | 6, 6);
            String strJ0 = d4c.j0(R.string.guest_pass_title, e18Var);
            Object[] objArr = new Object[0];
            Object objN5 = e18Var.N();
            if (objN5 == lz1Var) {
                objN5 = new c97(25);
                e18Var.k0(objN5);
            }
            nwb nwbVar = (nwb) iuj.I(objArr, (zy7) objN5, e18Var, 48);
            boolean zF4 = e18Var.f(nwbVar) | e18Var.h(qi3Var3) | ((i6 & 14) == 4) | e18Var.f(kaeVar3) | e18Var.f(koiVar3);
            Object objN6 = e18Var.N();
            if (zF4 || objN6 == lz1Var) {
                kae kaeVar6 = kaeVar3;
                koi koiVar6 = koiVar3;
                mt4 mt4Var = new mt4((Object) qi3Var3, (Object) ce8Var, (Object) kaeVar6, (Object) koiVar6, nwbVar, (tp4) null, 10);
                kaeVar4 = kaeVar6;
                koiVar4 = koiVar6;
                e18Var.k0(mt4Var);
                objN6 = mt4Var;
            } else {
                kaeVar4 = kaeVar3;
                koiVar4 = koiVar3;
            }
            fd9.i(e18Var, (pz7) objN6, ce8Var);
            kae kaeVar7 = kaeVar4;
            qi3 qi3Var4 = qi3Var3;
            koi koiVar7 = koiVar4;
            koiVar2 = koiVar7;
            kaeVar2 = kaeVar7;
            vkc.a(r4gVarS, d4c.j0(R.string.guest_pass_title, e18Var), null, null, false, false, null, a5g.F, null, null, fd9.q0(-129603583, new zd8(referralEligibilityA, qi3Var4, ce8Var, context, strJ0, l45Var, kaeVar7, koiVar7, 0), e18Var), null, fd9.q0(-850523005, new kw(referralEligibilityA, kaeVar7, koiVar7, eliVarA, 3), e18Var), e18Var, 113246216, 3120, 5756);
            qi3Var2 = qi3Var4;
        } else {
            e18Var.T();
            kaeVar2 = kaeVar;
            koiVar2 = koiVar;
            qi3Var2 = qi3Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pk(ce8Var, zy7Var, kaeVar2, koiVar2, qi3Var2, i, 15);
        }
    }

    public static final void d(ReferralEligibility referralEligibility, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        Integer remaining_passes;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1000190762);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var.f(referralEligibility) : e18Var.h(referralEligibility) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        boolean z = true;
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            String strJ0 = d4c.j0(R.string.guest_pass_share, e18Var);
            if (referralEligibility == null || !referralEligibility.getEligible() || referralEligibility.getShare_link() == null || ((remaining_passes = referralEligibility.getRemaining_passes()) != null && remaining_passes.intValue() == 0)) {
                z = false;
            }
            dtj.a(strJ0, b.c(iqbVar, 1.0f), z, null, e12.a, null, 0L, zy7Var, e18Var, ((i2 << 18) & 29360128) | 24576, 104);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v76(referralEligibility, i, zy7Var, iqbVar, 6);
        }
    }

    public static final void e(int i, int i2, ld4 ld4Var, int i3) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(595033465);
        int i4 = 2;
        int i5 = (e18Var.d(i) ? 4 : 2) | i3 | (e18Var.d(i2) ? 32 : 16);
        if (e18Var.Q(i5 & 1, (i5 & 19) != 18)) {
            int iE0 = wd6.e0(i2, 0, 3);
            int iE02 = wd6.e0(i, 0, i2 < 0 ? 0 : i2);
            ho0 ho0Var = new ho0(-18.0f, true, new sz6(1));
            fqb fqbVar = fqb.E;
            iqb iqbVarN = gb9.N(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 10.0f, 7);
            fqb fqbVar2 = fqbVar;
            cxe cxeVarA = axe.a(ho0Var, lja.P, e18Var, 6);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarN);
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
            e18Var.a0(626259729);
            int i6 = 0;
            while (i6 < iE0) {
                boolean z = iE0 >= i4 && i6 == 0;
                boolean z2 = iE0 >= i4 && i6 == iE0 + (-1);
                bpc bpcVarD = u00.D(i6 < iE02 ? R.drawable.guest_pass_ticket_available : R.drawable.guest_pass_ticket_used, 0, e18Var);
                iqb iqbVarJ = lnk.j(fqbVar2, (iE0 - 1) - i6);
                boolean zG = e18Var.g(z) | e18Var.g(z2);
                Object objN = e18Var.N();
                if (zG || objN == jd4.a) {
                    objN = new yu0(z, z2, 1);
                    e18Var.k0(objN);
                }
                xn5.N(bpcVarD, null, b.q(xn5.t0(xn5.i0(iqbVarJ, (bz7) objN), 3.0f, xve.b(4.0f), 0L, 0L, 24), 44.0f, 56.0f), null, null, MTTypesetterKt.kLineSkipLimitMultiplier, null, e18Var, 56, 120);
                i6++;
                fqbVar2 = fqbVar2;
                iE02 = iE02;
                iE0 = iE0;
                i4 = 2;
            }
            e18Var.p(false);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new yd8(i, i2, i3);
        }
    }

    public static final void f(int i, int i2, ld4 ld4Var) {
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(783078330);
        int i3 = (e18Var2.d(i) ? 4 : 2) | i2;
        if (e18Var2.Q(i3 & 1, (i3 & 3) != 2)) {
            String strJ0 = d4c.j0(i, e18Var2);
            tkh tkhVar = ((jm3) gm3.c(e18Var2).e.E).i;
            long j = gm3.a(e18Var2).N;
            fqb fqbVar = fqb.E;
            tjh.b(strJ0, gb9.L(fqbVar, 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), j, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, tkhVar, e18Var2, 48, 0, 130040);
            e18Var = e18Var2;
            kxk.g(e18Var, b.e(fqbVar, 32.0f));
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new gq0(i, i2);
        }
    }

    public static final qhb g(MessageComposeV0InputKind messageComposeV0InputKind) {
        int i = mfb.a[messageComposeV0InputKind.ordinal()];
        if (i == 1) {
            return qhb.E;
        }
        if (i == 2) {
            return qhb.F;
        }
        if (i == 3) {
            return qhb.G;
        }
        wg6.i();
        return null;
    }

    public static final void h(Resources.Theme theme, View view, TypedValue typedValue) {
        int i = (!theme.resolveAttribute(android.R.attr.windowLightStatusBar, typedValue, true) || typedValue.data == 0) ? 0 : 8;
        if (theme.resolveAttribute(android.R.attr.windowLightNavigationBar, typedValue, true) && typedValue.data != 0) {
            i |= 16;
        }
        WindowInsetsController windowInsetsController = view.getWindowInsetsController();
        windowInsetsController.getClass();
        windowInsetsController.setSystemBarsAppearance(i, 24);
    }

    public static final void i(hp4 hp4Var) {
        hp4Var.a.setValue(ep4.a);
    }

    public static ipe j(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("id").m();
            bh9 bh9VarS = qh9Var.s("referrer");
            String strM2 = bh9VarS != null ? bh9VarS.m() : null;
            String strM3 = qh9Var.s("url").m();
            bh9 bh9VarS2 = qh9Var.s("name");
            String strM4 = bh9VarS2 != null ? bh9VarS2.m() : null;
            strM.getClass();
            strM3.getClass();
            return new ipe(strM, strM2, strM3, strM4);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type ResourceEventView", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type ResourceEventView", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type ResourceEventView", e3);
            return null;
        }
    }

    public static byte[] k(Context context, String str) {
        MessageDigest messageDigest;
        PackageInfo packageInfoE = nij.a(context).E(64, str);
        Signature[] signatureArr = packageInfoE.signatures;
        if (signatureArr != null && signatureArr.length == 1) {
            int i = 0;
            while (true) {
                if (i >= 2) {
                    messageDigest = null;
                    break;
                }
                try {
                    messageDigest = MessageDigest.getInstance("SHA1");
                } catch (NoSuchAlgorithmException unused) {
                }
                if (messageDigest != null) {
                    break;
                }
                i++;
            }
            if (messageDigest != null) {
                return messageDigest.digest(packageInfoE.signatures[0].toByteArray());
            }
        }
        return null;
    }

    public static String l(w9k w9kVar) {
        StringBuilder sb = new StringBuilder(w9kVar.g());
        for (int i = 0; i < w9kVar.g(); i++) {
            byte bA = w9kVar.a(i);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb.append('\\');
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                        } else {
                            sb.append((char) bA);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
