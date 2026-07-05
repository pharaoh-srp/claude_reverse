package defpackage;

import androidx.compose.foundation.layout.b;
import com.anthropic.claude.R;
import com.anthropic.claude.analytics.events.MobileAppFeedbackEvents$FeedbackType;
import com.anthropic.claude.api.chat.ModelSelection;
import com.pvporbit.freetype.FreeTypeConstants;
import io.sentry.b2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dlk {
    public static final ta4 a = new ta4(-2030002888, false, new rb4(12));
    public static final ta4 b = new ta4(698272024, false, new rb4(13));
    public static final ta4 c = new ta4(1634715485, false, new pb4(16));

    public static final void a(exe exeVar, ukg ukgVar, vm3 vm3Var, q68 q68Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1795226361);
        if ((i & 48) == 0) {
            i2 = ((i & 64) == 0 ? e18Var.f(ukgVar) : e18Var.h(ukgVar) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? e18Var.f(vm3Var) : e18Var.h(vm3Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.f(q68Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var.Q(i2 & 1, (i2 & 1169) != 1168)) {
            blk.a(ukgVar, q68Var, fd9.q0(1914150390, new xm3(vm3Var, 2), e18Var), e18Var, ((i2 >> 6) & 112) | ((i2 >> 3) & 14) | 384);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ym3(exeVar, ukgVar, vm3Var, q68Var, i, 1);
        }
    }

    public static final void b(r64 r64Var, ukg ukgVar, vm3 vm3Var, q68 q68Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(2114380942);
        if ((i & 48) == 0) {
            i2 = ((i & 64) == 0 ? e18Var.f(ukgVar) : e18Var.h(ukgVar) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? e18Var.f(vm3Var) : e18Var.h(vm3Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.f(q68Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        int i3 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 1169) != 1168)) {
            blk.a(ukgVar, q68Var, fd9.q0(1506058545, new xm3(vm3Var, i3), e18Var), e18Var, ((i2 >> 6) & 112) | ((i2 >> 3) & 14) | 384);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xd(r64Var, ukgVar, vm3Var, q68Var, i, 14);
        }
    }

    public static final void c(vm3 vm3Var, ukg ukgVar, ukg ukgVar2, ukg ukgVar3, ld4 ld4Var, int i) {
        vm3Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1933514473);
        int i2 = (e18Var.f(vm3Var) ? 4 : 2) | i | (e18Var.f(ukgVar) ? 32 : 16) | (e18Var.f(ukgVar2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.f(ukgVar3) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            kud.a(ovj.d(o68.a).d(new km8(p46.a)), st.d, fd9.q0(-925161095, new wm3(vm3Var, ukgVar, ukgVar2, ukgVar3), e18Var), e18Var, 384);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new wm3(vm3Var, ukgVar, ukgVar2, ukgVar3, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0266  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(defpackage.zy7 r31, defpackage.iqb r32, com.anthropic.claude.analytics.events.MobileAppFeedbackEvents$FeedbackType r33, android.net.Uri r34, defpackage.qi3 r35, defpackage.wg7 r36, defpackage.ld4 r37, int r38, int r39) {
        /*
            Method dump skipped, instruction units count: 645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlk.d(zy7, iqb, com.anthropic.claude.analytics.events.MobileAppFeedbackEvents$FeedbackType, android.net.Uri, qi3, wg7, ld4, int, int):void");
    }

    public static final void e(cjh cjhVar, bz7 bz7Var, int i, ld4 ld4Var, int i2) {
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(427481168);
        int i3 = i2 | (e18Var2.f(cjhVar) ? 4 : 2) | (e18Var2.h(bz7Var) ? 32 : 16) | (e18Var2.d(i) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        int i4 = 0;
        if (e18Var2.Q(i3 & 1, (i3 & 147) != 146)) {
            e18Var = e18Var2;
            mwa.a(cjhVar, bz7Var, d4c.j0(i, e18Var2), b.e(b.c(fqb.E, 1.0f), 200.0f), false, null, null, null, null, null, new mp9(3, i4, i4, 126), null, false, 0, 0, 0L, null, e18Var, (i3 & 14) | 3072 | (i3 & 112), 24576, 2080752);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new qq(cjhVar, bz7Var, i, i2);
        }
    }

    public static final void f(MobileAppFeedbackEvents$FeedbackType mobileAppFeedbackEvents$FeedbackType, bz7 bz7Var, ld4 ld4Var, int i) {
        MobileAppFeedbackEvents$FeedbackType mobileAppFeedbackEvents$FeedbackType2;
        bz7 bz7Var2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1754279385);
        int i2 = i | (e18Var.d(mobileAppFeedbackEvents$FeedbackType.ordinal()) ? 4 : 2) | (e18Var.h(bz7Var) ? 32 : 16);
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = mpk.P(Boolean.FALSE);
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            wo1 wo1Var = lja.Q;
            iqb iqbVarC = b.c(fqb.E, 1.0f);
            cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var, 48);
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
            tjh.b(d4c.j0(R.string.feedback_type_label, e18Var), null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 0, 0, 131066);
            e18Var = e18Var;
            kxk.g(e18Var, new hw9(1.0f, true));
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = new ol5(6, nwbVar);
                e18Var.k0(objN2);
            }
            mobileAppFeedbackEvents$FeedbackType2 = mobileAppFeedbackEvents$FeedbackType;
            bz7Var2 = bz7Var;
            kkk.a(false, (bz7) objN2, null, fd9.q0(1982528671, new xg4((Object) mobileAppFeedbackEvents$FeedbackType2, (Object) nwbVar, bz7Var2, 15), e18Var), e18Var, 3126, 4);
            e18Var.p(true);
        } else {
            mobileAppFeedbackEvents$FeedbackType2 = mobileAppFeedbackEvents$FeedbackType;
            bz7Var2 = bz7Var;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new um5(mobileAppFeedbackEvents$FeedbackType2, bz7Var2, i, 14);
        }
    }

    public static final void g(u2a u2aVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1136847984);
        int i2 = i | 2;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            e18Var.V();
            int i3 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i3 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(u2a.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                u2aVar = (u2a) objN;
            } else {
                e18Var.T();
            }
            e18Var.q();
            eli eliVar = (eli) e18Var.j(ve4.t);
            String strA = u2aVar.a(t2a.I);
            boolean zH = e18Var.h(eliVar) | e18Var.f(strA);
            Object objN2 = e18Var.N();
            if (zH || objN2 == lz1Var) {
                objN2 = new kp1(eliVar, strA, 7);
                e18Var.k0(objN2);
            }
            qnc qncVar = q02.a;
            csg.j((zy7) objN2, null, false, null, q02.d(0L, gm3.a(e18Var).N, 0L, e18Var, 13), null, null, vlk.a, e18Var, 805306368, 494);
            e18Var = e18Var;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new mk4(u2aVar, i, 16);
        }
    }

    public static final void h(String str, ModelSelection modelSelection, String str2, bz7 bz7Var, zy7 zy7Var, zy7 zy7Var2, iqb iqbVar, String str3, qi3 qi3Var, ld4 ld4Var, int i) {
        int i2;
        qi3 qi3Var2;
        qi3 qi3Var3;
        bz7Var.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(460455463);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(modelSelection) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(str2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.h(bz7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.h(zy7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var.h(zy7Var2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= e18Var.f(str3) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= 33554432;
        }
        if (e18Var.Q(i2 & 1, (38347923 & i2) != 38347922)) {
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
                qi3Var3 = (qi3) objN;
            } else {
                e18Var.T();
                qi3Var3 = qi3Var;
            }
            e18Var.q();
            eli eliVar = (eli) e18Var.j(ve4.t);
            xo1 xo1Var = lja.N;
            iqb iqbVarC = b.c(iqbVar, 1.0f);
            o5b o5bVarD = dw1.d(xo1Var, false);
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
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            ev2.e(null, null, 0L, 0L, new qnc(16.0f, 16.0f, 16.0f, 16.0f), null, true, false, fd9.q0(1700129945, new sn(str, modelSelection, str2, bz7Var, zy7Var, zy7Var2, str3, qi3Var3, eliVar), e18Var), e18Var, 114843648, 47);
            e18Var.p(true);
            qi3Var2 = qi3Var3;
        } else {
            e18Var.T();
            qi3Var2 = qi3Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new tbc(str, modelSelection, str2, bz7Var, zy7Var, zy7Var2, iqbVar, str3, qi3Var2, i);
        }
    }

    public static final void i(exe exeVar, ukg ukgVar, vm3 vm3Var, q68 q68Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1325153832);
        if ((i & 48) == 0) {
            i2 = ((i & 64) == 0 ? e18Var.f(ukgVar) : e18Var.h(ukgVar) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? e18Var.f(vm3Var) : e18Var.h(vm3Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.f(q68Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        int i3 = 0;
        if (e18Var.Q(i2 & 1, (i2 & 1169) != 1168)) {
            blk.a(ukgVar, q68Var, fd9.q0(-1321317573, new xm3(vm3Var, i3), e18Var), e18Var, ((i2 >> 6) & 112) | ((i2 >> 3) & 14) | 384);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ym3(exeVar, ukgVar, vm3Var, q68Var, i, 0);
        }
    }

    public static final xv9 j(qk6 qk6Var) {
        yv9 yv9Var;
        pv9 pv9Var;
        wv9 wv9VarX = xv9.x();
        if (qk6Var instanceof rk6) {
            yv9Var = yv9.BOX;
        } else if (qk6Var instanceof vk6) {
            yv9Var = ljk.h(((vk6) qk6Var).c) ? yv9.RADIO_ROW : yv9.ROW;
        } else if (qk6Var instanceof sk6) {
            yv9Var = ljk.h(((sk6) qk6Var).c) ? yv9.RADIO_COLUMN : yv9.COLUMN;
        } else if (qk6Var instanceof yk6) {
            yv9Var = yv9.TEXT;
        } else if (qk6Var instanceof xk6) {
            yv9Var = yv9.SPACER;
        } else if (qk6Var instanceof uk6) {
            yv9Var = yv9.IMAGE;
        } else if (qk6Var instanceof jfe) {
            yv9Var = yv9.REMOTE_VIEWS_ROOT;
        } else {
            if (!(qk6Var instanceof wk6)) {
                b2.g("Unknown element type ", qk6Var.getClass().getCanonicalName());
                return null;
            }
            yv9Var = yv9.SIZE_BOX;
        }
        wv9VarX.c();
        xv9.k((xv9) wv9VarX.F, yv9Var);
        gaj gajVar = (gaj) qk6Var.b().a(a2g.L, null);
        w46 w46Var = u46.a;
        qv9 qv9VarP = p(gajVar != null ? gajVar.a : w46Var);
        wv9VarX.c();
        xv9.l((xv9) wv9VarX.F, qv9VarP);
        km8 km8Var = (km8) qk6Var.b().a(a2g.M, null);
        if (km8Var != null) {
            w46Var = km8Var.a;
        }
        qv9 qv9VarP2 = p(w46Var);
        wv9VarX.c();
        xv9.m((xv9) wv9VarX.F, qv9VarP2);
        boolean z = qk6Var.b().a(a2g.J, null) != null;
        wv9VarX.c();
        xv9.r((xv9) wv9VarX.F, z);
        if (qk6Var.b().a(a2g.K, null) != null) {
            wv9VarX.c();
            xv9.q((xv9) wv9VarX.F);
        }
        if (qk6Var instanceof uk6) {
            uk6 uk6Var = (uk6) qk6Var;
            int i = uk6Var.e;
            if (i == 1) {
                pv9Var = pv9.FIT;
            } else if (i == 0) {
                pv9Var = pv9.CROP;
            } else {
                if (i != 2) {
                    sz6.k("Unknown content scale ", io4.a(uk6Var.e));
                    return null;
                }
                pv9Var = pv9.FILL_BOUNDS;
            }
            wv9VarX.c();
            xv9.p((xv9) wv9VarX.F, pv9Var);
            boolean z2 = !ytk.k(uk6Var);
            wv9VarX.c();
            xv9.t((xv9) wv9VarX.F, z2);
            boolean z3 = uk6Var.c != null;
            wv9VarX.c();
            xv9.u((xv9) wv9VarX.F, z3);
            boolean z4 = uk6Var.d != null;
            wv9VarX.c();
            xv9.v((xv9) wv9VarX.F, z4);
        } else if (qk6Var instanceof sk6) {
            rv9 rv9VarR = r(((sk6) qk6Var).e);
            wv9VarX.c();
            xv9.n((xv9) wv9VarX.F, rv9VarR);
        } else if (qk6Var instanceof vk6) {
            zv9 zv9VarQ = q(((vk6) qk6Var).e);
            wv9VarX.c();
            xv9.o((xv9) wv9VarX.F, zv9VarQ);
        } else if (qk6Var instanceof rk6) {
            rk6 rk6Var = (rk6) qk6Var;
            rv9 rv9VarR2 = r(rk6Var.d.a);
            wv9VarX.c();
            xv9.n((xv9) wv9VarX.F, rv9VarR2);
            zv9 zv9VarQ2 = q(rk6Var.d.b);
            wv9VarX.c();
            xv9.o((xv9) wv9VarX.F, zv9VarQ2);
        }
        if (qk6Var instanceof zk6) {
            ArrayList arrayList = ((zk6) qk6Var).b;
            ArrayList arrayList2 = new ArrayList(x44.y(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(j((qk6) it.next()));
            }
            wv9VarX.c();
            xv9.s((xv9) wv9VarX.F, arrayList2);
        }
        return (xv9) wv9VarX.a();
    }

    public static boolean k(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static ma l(qh9 qh9Var) {
        String strM;
        try {
            bh9 bh9VarS = qh9Var.s("position");
            xa xaVarD = bh9VarS != null ? ulk.d(bh9VarS.g()) : null;
            bh9 bh9VarS2 = qh9Var.s("target");
            na naVarD = bh9VarS2 != null ? elk.d(bh9VarS2.g()) : null;
            bh9 bh9VarS3 = qh9Var.s("name_source");
            int i = 0;
            if (bh9VarS3 != null && (strM = bh9VarS3.m()) != null) {
                int[] iArrH = sq6.H(6);
                int length = iArrH.length;
                while (i < length) {
                    int i2 = iArrH[i];
                    if (ebh.e(i2).equals(strM)) {
                        i = i2;
                    } else {
                        i++;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            return new ma(xaVarD, naVarD, i);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type DdAction", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type DdAction", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type DdAction", e3);
            return null;
        }
    }

    public static rbh m(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("id").m();
            strM.getClass();
            return new rbh(strM);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Action", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Action", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Action", e3);
            return null;
        }
    }

    public static final int n(MobileAppFeedbackEvents$FeedbackType mobileAppFeedbackEvents$FeedbackType) {
        int i = ah7.a[mobileAppFeedbackEvents$FeedbackType.ordinal()];
        if (i == 1) {
            return R.string.feedback_type_general;
        }
        if (i == 2) {
            return R.string.feedback_type_bug_report;
        }
        if (i == 3) {
            return R.string.feedback_type_feature_request;
        }
        if (i == 4 || i == 5) {
            return R.string.feedback_type_other;
        }
        wg6.i();
        return 0;
    }

    public static final String o(int i) {
        return grc.p(i, "appWidgetLayout-");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0008, code lost:
    
        if ((r2 instanceof defpackage.o46) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.qv9 p(defpackage.w46 r2) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Lb
            boolean r2 = r2 instanceof defpackage.o46
            if (r2 == 0) goto L18
            goto L26
        Lb:
            java.util.Map r0 = defpackage.cw9.a
            boolean r0 = r2 instanceof defpackage.n46
            if (r0 == 0) goto L14
            qv9 r2 = defpackage.qv9.EXACT
            return r2
        L14:
            boolean r0 = r2 instanceof defpackage.u46
            if (r0 == 0) goto L1b
        L18:
            qv9 r2 = defpackage.qv9.WRAP
            return r2
        L1b:
            boolean r0 = r2 instanceof defpackage.p46
            if (r0 == 0) goto L22
            qv9 r2 = defpackage.qv9.FILL
            return r2
        L22:
            boolean r2 = r2 instanceof defpackage.o46
            if (r2 == 0) goto L29
        L26:
            qv9 r2 = defpackage.qv9.EXPAND
            return r2
        L29:
            java.lang.String r2 = "After resolution, no other type should be present"
            defpackage.sz6.j(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlk.p(w46):qv9");
    }

    public static final zv9 q(int i) {
        if (i == 0) {
            return zv9.TOP;
        }
        if (i == 1) {
            return zv9.CENTER_VERTICALLY;
        }
        if (i == 2) {
            return zv9.BOTTOM;
        }
        sz6.k("unknown vertical alignment ", rt.b(i));
        return null;
    }

    public static final rv9 r(int i) {
        if (i == 0) {
            return rv9.START;
        }
        if (i == 1) {
            return rv9.CENTER_HORIZONTALLY;
        }
        if (i == 2) {
            return rv9.END;
        }
        sz6.k("unknown horizontal alignment ", pt.b(i));
        return null;
    }
}
