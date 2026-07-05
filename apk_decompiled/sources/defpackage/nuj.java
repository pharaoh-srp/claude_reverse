package defpackage;

import android.graphics.Bitmap;
import android.media.Image;
import androidx.compose.foundation.layout.b;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nuj {
    public static ClassLoader a;
    public static Thread b;
    public static final ta4 c = new ta4(1694514462, false, new m14(28));
    public static final ta4 d = new ta4(1555450826, false, new m14(29));
    public static final u9c[] e = {new u9c(-1865951482774665761L, -1087, -308), new u9c(-6093090917745768758L, -1060, -300), new u9c(-38366372719436721L, -1034, -292), new u9c(-4731433901725329908L, -1007, -284), new u9c(-8228041688891786180L, -980, -276), new u9c(-3219690930897053053L, -954, -268), new u9c(-7101705404292871755L, -927, -260), new u9c(-1541319077368263733L, -901, -252), new u9c(-5851220927660403859L, -874, -244), new u9c(-9062348037703676329L, -847, -236), new u9c(-4462904269766699465L, -821, -228), new u9c(-8027971522334779313L, -794, -220), new u9c(-2921563150702462265L, -768, -212), new u9c(-6879582898840692748L, -741, -204), new u9c(-1210330751515841307L, -715, -196), new u9c(-5604615407819967858L, -688, -188), new u9c(-8878612607581929669L, -661, -180), new u9c(-4189117143640191558L, -635, -172), new u9c(-7823984217374209642L, -608, -164), new u9c(-2617598379430861436L, -582, -156), new u9c(-6653111496142234890L, -555, -148), new u9c(-872862063775190746L, -529, -140), new u9c(-5353181642124984136L, -502, -132), new u9c(-8691279853972075893L, -475, -124), new u9c(-3909969587797413805L, -449, -116), new u9c(-7616003081050118571L, -422, -108), new u9c(-2307682335666372931L, -396, -100), new u9c(-6422206049907525489L, -369, -92), new u9c(-528786136287117932L, -343, -84), new u9c(-5096825099203863601L, -316, -76), new u9c(-8500279345513818773L, -289, -68), new u9c(-3625356651333078602L, -263, -60), new u9c(-7403949918844649556L, -236, -52), new u9c(-1991698500497491194L, -210, -44), new u9c(-6186779746782440749L, -183, -36), new u9c(-177973607073265138L, -157, -28), new u9c(-4835449396872013077L, -130, -20), new u9c(-8305539271883716404L, -103, -12), new u9c(-3335171328526686932L, -77, -4), new u9c(-7187745005283311616L, -50, 4), new u9c(-1669528073709551616L, -24, 12), new u9c(-5946744073709551616L, 3, 20), new u9c(-9133518327554766460L, 30, 28), new u9c(-4568956265895094861L, 56, 36), new u9c(-8106986416796705680L, 83, 44), new u9c(-3039304518611664792L, 109, 52), new u9c(-6967307053960650171L, 136, 60), new u9c(-1341049929119499481L, 162, 68), new u9c(-5702008784649933400L, 189, 76), new u9c(-8951176327949752869L, 216, 84), new u9c(-4297245513042813542L, 242, 92), new u9c(-7904546130479028392L, 269, 100), new u9c(-2737644984756826646L, 295, 108), new u9c(-6742553186979055798L, 322, 116), new u9c(-1006140569036166267L, 348, 124), new u9c(-5452481866653427593L, 375, 132), new u9c(-8765264286586255934L, 402, 140), new u9c(-4020214983419339459L, 428, 148), new u9c(-7698142301602209613L, 455, 156), new u9c(-2430079312244744221L, 481, 164), new u9c(-6513398903789220827L, 508, 172), new u9c(-664674077828931748L, 534, 180), new u9c(-5198069505264599346L, 561, 188), new u9c(-8575712306248138270L, 588, 196), new u9c(-3737760522056206171L, 614, 204), new u9c(-7487697328667536417L, 641, 212), new u9c(-2116491865831296966L, 667, 220), new u9c(-6279758049420528746L, 694, 228), new u9c(-316522074587315140L, 720, 236), new u9c(-4938676049251384304L, 747, 244), new u9c(-8382449121214030822L, 774, 252), new u9c(-3449775934753242068L, 800, 260), new u9c(-7273132090830278359L, 827, 268), new u9c(-1796764746270372707L, 853, 276), new u9c(-6041542782089432023L, 880, 284), new u9c(-9204148869281624187L, 907, 292), new u9c(-4674203974643163859L, 933, 300), new u9c(-8185402070463610993L, 960, 308), new u9c(-3156152948152813503L, 986, 316), new u9c(-7054365918152680535L, 1013, 324), new u9c(-1470777745987373095L, 1039, 332), new u9c(-5798663540173640085L, 1066, 340)};

    public static final void a(boolean z, boolean z2, String str, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        int i3;
        String strN;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-975858108);
        int i4 = i | (e18Var.g(z) ? 4 : 2) | (e18Var.g(z2) ? 32 : 16) | (e18Var.f(str) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i4 & 1, (i4 & 1171) != 1170)) {
            String strJ0 = d4c.j0(R.string.ccr_share_fallback_org, e18Var);
            if (z && z2) {
                e18Var.a0(-1496762018);
                if (str != null) {
                    strJ0 = str;
                }
                strN = d4c.k0(R.string.ccr_owner_banner_shared_org_repo, new Object[]{strJ0}, e18Var);
                e18Var.p(false);
            } else if (z) {
                e18Var.a0(-1496758439);
                if (str != null) {
                    strJ0 = str;
                }
                strN = d4c.k0(R.string.ccr_owner_banner_shared_org, new Object[]{strJ0}, e18Var);
                e18Var.p(false);
            } else {
                if (z2) {
                    i2 = -1496754816;
                    i3 = R.string.ccr_owner_banner_shared_public_repo;
                } else {
                    i2 = -1496752357;
                    i3 = R.string.ccr_owner_banner_shared_public;
                }
                strN = vb7.n(e18Var, i2, i3, e18Var, false);
            }
            iqb iqbVarK = gb9.K(yfd.p(b.c(iqbVar, 1.0f), gm3.a(e18Var).m, zni.b), 16.0f, 10.0f);
            cxe cxeVarA = axe.a(ko0.a, lja.Q, e18Var, 48);
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
            iv1.b(ud0.F0, null, null, ef2.F, gm3.a(e18Var).j, e18Var, 3120, 4);
            kxk.g(e18Var, b.t(fqb.E, 8.0f));
            tjh.b(strN, null, gm3.a(e18Var).j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 0, 131066);
            e18Var = e18Var;
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new q32(z, z2, str, iqbVar, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0448  */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final com.anthropic.claude.code.remote.i r51, final defpackage.bz7 r52, defpackage.i4g r53, defpackage.iqb r54, defpackage.ld4 r55, int r56) {
        /*
            Method dump skipped, instruction units count: 1147
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nuj.b(com.anthropic.claude.code.remote.i, bz7, i4g, iqb, ld4, int):void");
    }

    public static final void c(ggc ggcVar, String str, zy7 zy7Var, zy7 zy7Var2, boolean z, iqb iqbVar, fti ftiVar, q1d q1dVar, ld4 ld4Var, int i) {
        int i2;
        String str2;
        e18 e18Var;
        fti ftiVar2;
        q1d q1dVar2;
        int i3;
        q1d q1dVar3;
        fti ftiVar3;
        Object w1dVar;
        int i4;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(450434246);
        if ((i & 6) == 0) {
            i2 = (e18Var2.f(ggcVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.h(zy7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var2.g(z) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var2.f(iqbVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= 4194304;
        }
        if (e18Var2.Q(i2 & 1, (4793491 & i2) != 4793490)) {
            e18Var2.V();
            int i5 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i5 == 0 || e18Var2.A()) {
                fti ftiVarH = ovj.h(str, e18Var2);
                m7f m7fVarN = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF = e18Var2.f(null) | e18Var2.f(m7fVarN);
                Object objN = e18Var2.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(q1d.class), null, null);
                    e18Var2.k0(objN);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                i3 = i2 & (-33030145);
                q1dVar3 = (q1d) objN;
                ftiVar3 = ftiVarH;
            } else {
                e18Var2.T();
                ftiVar3 = ftiVar;
                i3 = i2 & (-33030145);
                q1dVar3 = q1dVar;
            }
            e18Var2.q();
            Object objN2 = e18Var2.N();
            if (objN2 == lz1Var) {
                objN2 = ij0.d(e18Var2);
            }
            bt7 bt7Var = (bt7) objN2;
            boolean zH = e18Var2.h(q1dVar3) | ((i3 & 112) == 32) | e18Var2.f(ftiVar3);
            Object objN3 = e18Var2.N();
            if (zH || objN3 == lz1Var) {
                str2 = str;
                i4 = 0;
                w1dVar = new w1d(q1dVar3, str2, ftiVar3, null, 0);
                e18Var2.k0(w1dVar);
            } else {
                str2 = str;
                w1dVar = objN3;
                i4 = 0;
            }
            fd9.i(e18Var2, (pz7) w1dVar, str2);
            boolean zF2 = e18Var2.f(ftiVar3);
            Object objN4 = e18Var2.N();
            if (zF2 || objN4 == lz1Var) {
                objN4 = new tl8(29, ftiVar3);
                e18Var2.k0(objN4);
            }
            fd9.d(ftiVar3, (bz7) objN4, e18Var2);
            zy1 zy1Var = ftiVar3.h;
            int i6 = i3 & 14;
            int i7 = i6 == 4 ? 1 : i4;
            Object objN5 = e18Var2.N();
            if (i7 != 0 || objN5 == lz1Var) {
                objN5 = new x1d(ggcVar, (tp4) null, i4);
                e18Var2.k0(objN5);
            }
            x44.b(zy1Var, (pz7) objN5, e18Var2, i4);
            zy1 zy1Var2 = ftiVar3.j;
            int i8 = i6 != 4 ? i4 : 1;
            Object objN6 = e18Var2.N();
            if (i8 != 0 || objN6 == lz1Var) {
                objN6 = new y1d(ggcVar, null, i4);
                e18Var2.k0(objN6);
            }
            x44.b(zy1Var2, (pz7) objN6, e18Var2, i4);
            String strJ0 = d4c.j0(R.string.onboarding_v2_phone_title, e18Var2);
            String strK0 = d4c.k0(R.string.onboarding_v2_phone_code_subtitle, new Object[]{(String) ftiVar3.i.getValue()}, e18Var2);
            String strJ02 = d4c.j0(R.string.onboarding_v2_phone_verify, e18Var2);
            boolean zBooleanValue = ((Boolean) ftiVar3.m.getValue()).booleanValue();
            boolean zBooleanValue2 = ((Boolean) ftiVar3.l.getValue()).booleanValue();
            boolean zF3 = e18Var2.f(ftiVar3);
            Object objN7 = e18Var2.N();
            if (zF3 || objN7 == lz1Var) {
                objN7 = new mx5(0, ftiVar3, fti.class, "submitCode", "submitCode()V", 0, 19);
                e18Var2.k0(objN7);
            }
            q1d q1dVar4 = q1dVar3;
            int i9 = 2;
            nvk.d(strJ0, strK0, strJ02, (zy7) ((jm9) objN7), iqbVar.B(b.c), zBooleanValue, zBooleanValue2, false, fd9.q0(2001198257, new sxa(zy7Var, 16, (byte) 0), e18Var2), null, fd9.q0(265427474, new qe((Object) ftiVar3, (Object) bt7Var, z, zy7Var2, 8), e18Var2), e18Var2, 100663296, 640);
            e18Var = e18Var2;
            nwb nwbVarH0 = x44.h0(e18Var);
            boolean zF4 = e18Var.f(nwbVarH0);
            Object objN8 = e18Var.N();
            if (zF4 || objN8 == lz1Var) {
                objN8 = new xoa(bt7Var, nwbVarH0, null, i9);
                e18Var.k0(objN8);
            }
            fd9.i(e18Var, (pz7) objN8, iei.a);
            q1dVar2 = q1dVar4;
            ftiVar2 = ftiVar3;
        } else {
            str2 = str;
            e18Var = e18Var2;
            e18Var.T();
            ftiVar2 = ftiVar;
            q1dVar2 = q1dVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pq(ggcVar, str2, zy7Var, zy7Var2, z, iqbVar, ftiVar2, q1dVar2, i);
        }
    }

    public static final void d(rp6 rp6Var, zy7 zy7Var, iqb iqbVar, qi3 qi3Var, ld4 ld4Var, int i) {
        int i2;
        zy7 zy7Var2;
        e18 e18Var;
        qi3 qi3Var2;
        int i3;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(752596855);
        if ((i & 6) == 0) {
            i2 = (e18Var2.f(rp6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            zy7Var2 = zy7Var;
            i2 |= e18Var2.h(zy7Var2) ? 32 : 16;
        } else {
            zy7Var2 = zy7Var;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var2.Q(i2 & 1, (i2 & 1171) != 1170)) {
            e18Var2.V();
            int i4 = i & 1;
            lz1 lz1Var = jd4.a;
            tp4 tp4Var = null;
            if (i4 == 0 || e18Var2.A()) {
                m7f m7fVarN = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF = e18Var2.f(null) | e18Var2.f(m7fVarN);
                Object objN = e18Var2.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(qi3.class), null, null);
                    e18Var2.k0(objN);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                i3 = i2 & (-7169);
                qi3Var2 = (qi3) objN;
            } else {
                e18Var2.T();
                i3 = i2 & (-7169);
                qi3Var2 = qi3Var;
            }
            e18Var2.q();
            Object objN2 = e18Var2.N();
            if (objN2 == lz1Var) {
                objN2 = ij0.d(e18Var2);
            }
            bt7 bt7Var = (bt7) objN2;
            boolean zH = e18Var2.h(qi3Var2);
            Object objN3 = e18Var2.N();
            if (zH || objN3 == lz1Var) {
                objN3 = new gw(qi3Var2, tp4Var, 21);
                e18Var2.k0(objN3);
            }
            csg.g((bz7) objN3, e18Var2, 0, 1);
            tp4 tp4Var2 = null;
            nvk.d(d4c.j0(R.string.onboarding_v2_phone_title, e18Var2), d4c.j0(R.string.onboarding_v2_phone_subtitle, e18Var2), d4c.j0(R.string.verification_flow_phone_send_button, e18Var2), zy7Var2, iqbVar.B(b.c), false, ((Boolean) rp6Var.w.getValue()).booleanValue(), false, null, null, fd9.q0(888399811, new xg4(rp6Var, bt7Var, qi3Var2, 24), e18Var2), e18Var2, (i3 << 6) & 7168, 928);
            e18Var = e18Var2;
            nwb nwbVarH0 = x44.h0(e18Var);
            boolean zF2 = e18Var.f(nwbVarH0);
            Object objN4 = e18Var.N();
            if (zF2 || objN4 == lz1Var) {
                objN4 = new xoa(bt7Var, nwbVarH0, tp4Var2, 3);
                e18Var.k0(objN4);
            }
            fd9.i(e18Var, (pz7) objN4, iei.a);
        } else {
            e18Var = e18Var2;
            e18Var.T();
            qi3Var2 = qi3Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new bg6(i, 12, rp6Var, zy7Var, iqbVar, qi3Var2, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(ggc ggcVar, iqb iqbVar, rp6 rp6Var, ld4 ld4Var, int i) {
        int i2;
        iqb iqbVar2;
        rp6 rp6Var2;
        int i3;
        final rp6 rp6VarL;
        boolean z;
        rp6 rp6Var3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1093124888);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(ggcVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            iqbVar2 = iqbVar;
            i2 |= e18Var.f(iqbVar2) ? 32 : 16;
        } else {
            iqbVar2 = iqbVar;
        }
        if ((i & 384) == 0) {
            i2 |= FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        final int i4 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                i3 = i2 & (-897);
                rp6VarL = xvj.l(e18Var);
            } else {
                e18Var.T();
                i3 = i2 & (-897);
                rp6VarL = rp6Var;
            }
            e18Var.q();
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = mpk.P(z1d.E);
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = mpk.P("");
                e18Var.k0(objN2);
            }
            nwb nwbVar2 = (nwb) objN2;
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = mpk.P(Boolean.FALSE);
                e18Var.k0(objN3);
            }
            final nwb nwbVar3 = (nwb) objN3;
            boolean z2 = ((z1d) nwbVar.getValue()) == z1d.F;
            Object objN4 = e18Var.N();
            if (objN4 == lz1Var) {
                objN4 = new ej2(nwbVar, nwbVar3, 4);
                e18Var.k0(objN4);
            }
            nai.a(48, 0, e18Var, (zy7) objN4, z2);
            zy1 zy1Var = rp6VarL.k;
            Object objN5 = e18Var.N();
            tp4 tp4Var = null;
            if (objN5 == lz1Var) {
                qq0 qq0Var = new qq0(nwbVar2, nwbVar3, nwbVar, tp4Var, 17);
                e18Var.k0(qq0Var);
                objN5 = qq0Var;
            }
            x44.b(zy1Var, (pz7) objN5, e18Var, 0);
            zy1 zy1Var2 = rp6VarL.l;
            int i5 = i3 & 14;
            Object[] objArr = i5 == 4;
            Object objN6 = e18Var.N();
            if (objArr != false || objN6 == lz1Var) {
                objN6 = new y1d(ggcVar, tp4Var, i4);
                e18Var.k0(objN6);
            }
            x44.b(zy1Var2, (pz7) objN6, e18Var, 0);
            int iOrdinal = ((z1d) nwbVar.getValue()).ordinal();
            if (iOrdinal == 0) {
                e18Var.a0(-1773919022);
                boolean zF = e18Var.f(rp6VarL);
                Object objN7 = e18Var.N();
                if (zF || objN7 == lz1Var) {
                    z = false;
                    final Object[] objArr2 = 0 == true ? 1 : 0;
                    objN7 = new zy7() { // from class: v1d
                        @Override // defpackage.zy7
                        public final Object a() {
                            int i6 = objArr2;
                            iei ieiVar = iei.a;
                            nwb nwbVar4 = nwbVar3;
                            rp6 rp6Var4 = rp6VarL;
                            switch (i6) {
                                case 0:
                                    nwbVar4.setValue(Boolean.TRUE);
                                    rp6Var4.V();
                                    break;
                                default:
                                    nwbVar4.setValue(Boolean.TRUE);
                                    rp6Var4.V();
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    e18Var.k0(objN7);
                } else {
                    z = false;
                }
                rp6Var3 = rp6VarL;
                d(rp6Var3, (zy7) objN7, iqbVar, null, e18Var, (i3 << 3) & 896);
                e18Var.p(z);
            } else {
                if (iOrdinal != 1) {
                    throw ebh.u(e18Var, -1773920000, false);
                }
                e18Var.a0(-1773910861);
                String str = (String) nwbVar2.getValue();
                Object objN8 = e18Var.N();
                if (objN8 == lz1Var) {
                    objN8 = new ej2(nwbVar, nwbVar3, 5);
                    e18Var.k0(objN8);
                }
                zy7 zy7Var = (zy7) objN8;
                boolean zF2 = e18Var.f(rp6VarL);
                Object objN9 = e18Var.N();
                if (zF2 || objN9 == lz1Var) {
                    objN9 = new zy7() { // from class: v1d
                        @Override // defpackage.zy7
                        public final Object a() {
                            int i6 = i4;
                            iei ieiVar = iei.a;
                            nwb nwbVar4 = nwbVar3;
                            rp6 rp6Var4 = rp6VarL;
                            switch (i6) {
                                case 0:
                                    nwbVar4.setValue(Boolean.TRUE);
                                    rp6Var4.V();
                                    break;
                                default:
                                    nwbVar4.setValue(Boolean.TRUE);
                                    rp6Var4.V();
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    e18Var.k0(objN9);
                }
                c(ggcVar, str, zy7Var, (zy7) objN9, ((Boolean) rp6VarL.w.getValue()).booleanValue(), iqbVar2, null, null, e18Var, i5 | 384 | ((i3 << 12) & 458752));
                e18Var = e18Var;
                e18Var.p(false);
                rp6Var3 = rp6VarL;
            }
            rp6Var2 = rp6Var3;
        } else {
            e18Var.T();
            rp6Var2 = rp6Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v76(i, 20, iqbVar, ggcVar, rp6Var2);
        }
    }

    public static final void f(int i, ld4 ld4Var, zy7 zy7Var, iqb iqbVar, String str) {
        int i2;
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(70949278);
        if ((i & 6) == 0) {
            i2 = i | (e18Var.f(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            fqb fqbVar = fqb.E;
            iqb iqbVarJ = gb9.J(androidx.compose.foundation.b.c(yfd.p(b.c(fqbVar, 1.0f), gm3.a(e18Var).q, xve.b(12.0f)), false, null, null, null, zy7Var, 15), 16.0f);
            cxe cxeVarA = axe.a(ko0.a, lja.Q, e18Var, 48);
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
            d4c.i0(e18Var, cd4.f, cxeVarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            cv8.b(a.a(ud0.F0, e18Var), null, b.o(fqbVar, 20.0f), gm3.a(e18Var).N, e18Var, 440, 0);
            kxk.g(e18Var, b.t(fqbVar, 12.0f));
            tjh.b(str, new hw9(1.0f, true), gm3.a(e18Var).M, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, i3 & 14, 24960, 110584);
            kxk.g(e18Var, b.t(fqbVar, 12.0f));
            tjh.b(d4c.j0(R.string.ccr_share_copy_link, e18Var), null, gm3.a(e18Var).c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).j, e18Var, 0, 0, 131066);
            e18Var = e18Var;
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new bk1(str, zy7Var, iqbVar2, i, 2);
        }
    }

    public static final void g(String str, String str2, boolean z, boolean z2, zy7 zy7Var, iqb iqbVar, ud0 ud0Var, ld4 ld4Var, int i, int i2) {
        int i3;
        boolean z3;
        zy7 zy7Var2;
        iqb iqbVar2;
        ud0 ud0Var2;
        iqb iqbVar3;
        long jB;
        ud0 ud0Var3;
        int i4;
        bx bxVar;
        z80 z80Var;
        re4 re4Var;
        int i5;
        float f;
        z80 z80Var2;
        z80 z80Var3;
        ud0 ud0Var4 = ud0Var;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1756766056);
        if ((i & 6) == 0) {
            i3 = (e18Var.f(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= e18Var.f(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= e18Var.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            z3 = z2;
            i3 |= e18Var.g(z3) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        } else {
            z3 = z2;
        }
        if ((i & 24576) == 0) {
            zy7Var2 = zy7Var;
            i3 |= e18Var.h(zy7Var2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        } else {
            zy7Var2 = zy7Var;
        }
        int i6 = 196608 | i3;
        int i7 = i2 & 64;
        if (i7 != 0) {
            i6 = 1769472 | i3;
        } else if ((1572864 & i) == 0) {
            i6 |= (2097152 & i) == 0 ? e18Var.f(ud0Var4) : e18Var.h(ud0Var4) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if (e18Var.Q(i6 & 1, (599187 & i6) != 599186)) {
            if (i7 != 0) {
                ud0Var4 = null;
            }
            fqb fqbVar = fqb.E;
            iqb iqbVarV = xn5.V(b.c(fqbVar, 1.0f), xve.b(12.0f));
            if (z) {
                e18Var.a0(330045594);
                iqbVar3 = iqbVarV;
                jB = d54.b(0.1f, gm3.a(e18Var).c);
                e18Var.p(false);
            } else {
                iqbVar3 = iqbVarV;
                e18Var.a0(330047469);
                jB = gm3.a(e18Var).q;
                e18Var.p(false);
            }
            iqb iqbVarJ = gb9.J(androidx.compose.foundation.b.c(yfd.p(iqbVar3, jB, zni.b), z3, null, new vue(3), null, zy7Var2, 10), 16.0f);
            cxe cxeVarA = axe.a(ko0.a, lja.Q, e18Var, 48);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarJ);
            dd4.e.getClass();
            re4 re4Var2 = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var2);
            } else {
                e18Var.n0();
            }
            z80 z80Var4 = cd4.f;
            d4c.i0(e18Var, z80Var4, cxeVarA);
            z80 z80Var5 = cd4.e;
            d4c.i0(e18Var, z80Var5, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var6 = cd4.g;
            d4c.i0(e18Var, z80Var6, numValueOf);
            bx bxVar2 = cd4.h;
            d4c.h0(e18Var, bxVar2);
            z80 z80Var7 = cd4.d;
            d4c.i0(e18Var, z80Var7, iqbVarE);
            if (ud0Var4 != null) {
                e18Var.a0(-905308300);
                ud0 ud0Var5 = ud0.d;
                bpc bpcVarA = a.a(ud0Var4, e18Var);
                long j = gm3.a(e18Var).N;
                ud0Var3 = ud0Var4;
                bxVar = bxVar2;
                i4 = i6;
                re4Var = re4Var2;
                z80Var2 = z80Var4;
                z80Var3 = z80Var6;
                z80Var = z80Var7;
                e18Var = e18Var;
                i5 = 0;
                f = 12.0f;
                cv8.b(bpcVarA, null, b.o(fqbVar, 20.0f), j, e18Var, 440, 0);
                vb7.A(fqbVar, 12.0f, e18Var, false);
            } else {
                ud0Var3 = ud0Var4;
                i4 = i6;
                bxVar = bxVar2;
                z80Var = z80Var7;
                re4Var = re4Var2;
                i5 = 0;
                f = 12.0f;
                z80Var2 = z80Var4;
                z80Var3 = z80Var6;
                e18Var.a0(-904991170);
                e18Var.p(false);
            }
            hw9 hw9Var = new hw9(1.0f, true);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, i5);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, hw9Var);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var2, q64VarA);
            d4c.i0(e18Var, z80Var5, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var, iqbVarE2);
            e18 e18Var2 = e18Var;
            tjh.b(str, null, gm3.a(e18Var).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var2, i4 & 14, 0, 131066);
            tjh.b(str2, null, gm3.a(e18Var2).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var2, (i4 >> 3) & 14, 0, 131066);
            e18Var2.p(true);
            kxk.g(e18Var2, b.t(fqbVar, f));
            vjk.b(z, null, null, z2, ijk.e(gm3.a(e18Var2).c, gm3.a(e18Var2).O, d54.b(0.5f, gm3.a(e18Var2).c), d54.b(0.5f, gm3.a(e18Var2).O), e18Var2, 0), e18Var2, ((i4 >> 6) & 14) | 48 | (i4 & 7168), 36);
            e18Var = e18Var2;
            e18Var.p(true);
            ud0Var2 = ud0Var3;
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            ud0Var2 = ud0Var4;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new r32(str, str2, z, z2, zy7Var, iqbVar2, ud0Var2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final boolean r27, final boolean r28, final boolean r29, final boolean r30, final java.lang.String r31, final boolean r32, final defpackage.zy7 r33, final defpackage.zy7 r34, defpackage.iqb r35, boolean r36, defpackage.ld4 r37, final int r38, final int r39) {
        /*
            Method dump skipped, instruction units count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nuj.h(boolean, boolean, boolean, boolean, java.lang.String, boolean, zy7, zy7, iqb, boolean, ld4, int, int):void");
    }

    public static final void i(String str, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(950795591);
        int i2 = i | (e18Var.f(str) ? 4 : 2) | 48;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            fqb fqbVar = fqb.E;
            iqb iqbVarJ = gb9.J(yfd.p(b.c(fqbVar, 1.0f), d54.b(0.15f, gm3.a(e18Var).x), xve.b(12.0f)), 16.0f);
            cxe cxeVarA = axe.a(ko0.a, lja.P, e18Var, 48);
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
            d4c.i0(e18Var, cd4.f, cxeVarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            cv8.b(a.a(ud0.H1, e18Var), null, b.o(fqbVar, 20.0f), gm3.a(e18Var).x, e18Var, 440, 0);
            kxk.g(e18Var, b.t(fqbVar, 12.0f));
            tjh.b(str, null, gm3.a(e18Var).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, i2 & 14, 0, 131066);
            e18Var = e18Var;
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ip(str, iqbVar2, i, 4);
        }
    }

    public static final void j(bpc bpcVar, long j, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        bpcVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1535712240);
        int i2 = i | (e18Var.h(bpcVar) ? 4 : 2) | (e18Var.e(j) ? 32 : 16) | 384;
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            xo1 xo1Var = lja.K;
            vve vveVar = xve.a;
            fqb fqbVar = fqb.E;
            iqb iqbVarJ = gb9.J(yfd.p(xn5.V(fqbVar, vveVar), d54.b(0.1f, gm3.a(e18Var).M), zni.b), 8.0f);
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
            cv8.b(bpcVar, null, b.o(fqbVar, csg.z(24.0f, e18Var)), j, e18Var, (i2 & 14) | 56 | ((i2 << 6) & 7168), 0);
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fj2(bpcVar, j, iqbVar2, i, 4);
        }
    }

    public static final Bitmap k(Image image) {
        Image.Plane[] planes = image.getPlanes();
        planes.getClass();
        Image.Plane plane = planes[0];
        int height = image.getHeight() * image.getWidth();
        int[] iArr = new int[height];
        plane.getBuffer().asIntBuffer().get(iArr);
        for (int i = 0; i < height; i++) {
            int i2 = iArr[i];
            iArr[i] = d4c.n0(d4c.n(i2 & 255, (i2 >> 8) & 255, (i2 >> 16) & 255, (i2 >> 24) & 255));
        }
        return Bitmap.createBitmap(iArr, image.getWidth(), image.getHeight(), Bitmap.Config.ARGB_8888);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (defpackage.bwk.e(r9, r1, defpackage.x44.r(r7, r2) ? r0.getWidth() : defpackage.l.d(r7.a, r8), defpackage.x44.r(r7, r2) ? r0.getHeight() : defpackage.l.d(r7.b, r8), r8) == 1.0d) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap l(android.graphics.drawable.Drawable r5, android.graphics.Bitmap.Config r6, defpackage.i8g r7, defpackage.j6f r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nuj.l(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, i8g, j6f, boolean):android.graphics.Bitmap");
    }

    public static final int m(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final bbg n() {
        return bbg.F;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00b7 A[Catch: all -> 0x00b3, PHI: r2
      0x00b7: PHI (r2v1 java.lang.Thread) = (r2v0 java.lang.Thread), (r2v11 java.lang.Thread) binds: [B:7:0x000c, B:47:0x00b0] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000e, B:46:0x00ae, B:61:0x00e5, B:12:0x0023, B:52:0x00b6, B:53:0x00b7, B:64:0x00e9, B:65:0x00ea, B:13:0x0024, B:15:0x0031, B:25:0x004b, B:26:0x0052, B:28:0x005d, B:34:0x0072, B:35:0x0079, B:43:0x008a, B:44:0x00ac, B:18:0x0040, B:54:0x00b8, B:60:0x00e4, B:59:0x00c2), top: B:76:0x0003, inners: #2, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.lang.ClassLoader o() {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nuj.o():java.lang.ClassLoader");
    }
}
