package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.messages.ApiHelpline;
import com.anthropic.claude.design.icon.a;
import com.anthropic.claude.sessions.types.CoworkSafetyFlag;
import com.anthropic.claude.tool.model.AskUserInputV0InputQuestionsItem;
import com.anthropic.claude.tool.model.AskUserInputV0InputQuestionsItemType;
import com.anthropic.claude.tool.model.Tool;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/* JADX INFO: loaded from: classes3.dex */
public abstract class euk {
    public static final ta4 a = new ta4(-348830034, false, new cc4(4));
    public static final ta4 b = new ta4(174902527, false, new cc4(5));

    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final com.anthropic.claude.tool.model.AskUserInputV0Input r20, final defpackage.bz7 r21, final defpackage.zy7 r22, defpackage.iqb r23, defpackage.ld4 r24, final int r25, final int r26) {
        /*
            Method dump skipped, instruction units count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.euk.a(com.anthropic.claude.tool.model.AskUserInputV0Input, bz7, zy7, iqb, ld4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.zy7 r28, defpackage.iqb r29, defpackage.ta4 r30, defpackage.ld4 r31, int r32, int r33) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.euk.b(zy7, iqb, ta4, ld4, int, int):void");
    }

    public static final void c(String str, CoworkSafetyFlag coworkSafetyFlag, CoworkSafetyFlag coworkSafetyFlag2, pz7 pz7Var, pz7 pz7Var2, iqb iqbVar, qi3 qi3Var, ld4 ld4Var, int i) {
        iqb iqbVar2;
        qi3 qi3Var2;
        int i2;
        qi3 qi3Var3;
        pz7Var.getClass();
        pz7Var2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1529929630);
        int i3 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.f(coworkSafetyFlag) ? 32 : 16) | (e18Var.f(coworkSafetyFlag2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(pz7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.h(pz7Var2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | 524288;
        if (e18Var.Q(i3 & 1, (599187 & i3) != 599186)) {
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
                i2 = i3 & (-3670017);
                qi3Var3 = (qi3) objN;
            } else {
                e18Var.T();
                i2 = i3 & (-3670017);
                qi3Var3 = qi3Var;
            }
            e18Var.q();
            q64 q64VarA = p64.a(new ho0(8.0f, true, new sz6(1)), lja.S, e18Var, 6);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqbVar2 = iqbVar;
            iqb iqbVarE = kxk.E(e18Var, iqbVar2);
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
            if (coworkSafetyFlag == null) {
                e18Var.a0(-555622058);
                e18Var.p(false);
            } else {
                e18Var.a0(-555622057);
                int i4 = i2 >> 3;
                m(str, coworkSafetyFlag.getHelpline(), pz7Var, pz7Var2, qi3Var3, e18Var, (i4 & 7168) | (i2 & 14) | (i4 & 896));
                e18Var.p(false);
            }
            ApiHelpline helpline = coworkSafetyFlag2 != null ? coworkSafetyFlag2.getHelpline() : null;
            if (helpline == null) {
                e18Var.a0(-555469879);
                e18Var.p(false);
            } else {
                e18Var.a0(-555469878);
                String url = helpline.getUrl();
                if (url == null) {
                    e18Var.a0(1330596958);
                    e18Var.p(false);
                } else {
                    e18Var.a0(1330596959);
                    d(str, helpline.getName(), url, pz7Var2, qi3Var3, e18Var, (i2 & 14) | ((i2 >> 3) & 7168));
                    e18Var.p(false);
                }
                e18Var.p(false);
            }
            e18Var.p(true);
            qi3Var2 = qi3Var3;
        } else {
            iqbVar2 = iqbVar;
            e18Var.T();
            qi3Var2 = qi3Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new lw(str, (Object) coworkSafetyFlag, (Object) coworkSafetyFlag2, (qz7) pz7Var, (Object) pz7Var2, (Object) iqbVar2, qi3Var2, i, 9);
        }
    }

    public static final void d(String str, String str2, String str3, pz7 pz7Var, qi3 qi3Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(683587354);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(str3) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.h(pz7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= (i & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) == 0 ? e18Var.f(qi3Var) : e18Var.h(qi3Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        int i3 = 0;
        if (e18Var.Q(i2 & 1, (i2 & 9363) != 9362)) {
            int i4 = 57344 & i2;
            int i5 = i2 & 14;
            boolean z = (i4 == 16384 || ((i2 & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) != 0 && e18Var.h(qi3Var))) | (i5 == 4);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (z || objN == lz1Var) {
                objN = new m55(qi3Var, str, i3);
                e18Var.k0(objN);
            }
            bz7 bz7Var = (bz7) objN;
            boolean z2 = (i4 == 16384 || ((i2 & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) != 0 && e18Var.h(qi3Var))) | (i5 == 4);
            Object objN2 = e18Var.N();
            if (z2 || objN2 == lz1Var) {
                objN2 = new j55(qi3Var, str, 2);
                e18Var.k0(objN2);
            }
            zy7 zy7Var = (zy7) objN2;
            boolean z3 = (i5 == 4) | (i4 == 16384 || ((i2 & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) != 0 && e18Var.h(qi3Var))) | ((i2 & 7168) == 2048);
            Object objN3 = e18Var.N();
            if (z3 || objN3 == lz1Var) {
                objN3 = new l55(qi3Var, str, pz7Var, 1);
                e18Var.k0(objN3);
            }
            hvj.b(null, str2, str3, bz7Var, zy7Var, (zy7) objN3, e18Var, i2 & 1008, 1);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pk(str, str2, str3, pz7Var, qi3Var, i, 11);
        }
    }

    public static final void e(String str, boolean z, bz7 bz7Var, ld4 ld4Var, int i) {
        long jB;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(461761107);
        int i2 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.g(z) ? 32 : 16) | (e18Var.h(bz7Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            if (z) {
                e18Var.a0(1370798213);
                jB = d54.b(0.1f, gm3.a(e18Var).c);
            } else {
                e18Var.a0(1370799576);
                jB = gm3.a(e18Var).n;
            }
            e18Var.p(false);
            wo1 wo1Var = lja.Q;
            fqb fqbVar = fqb.E;
            iqb iqbVarP = yfd.p(xn5.V(b.c(fqbVar, 1.0f), xve.b(12.0f)), jB, zni.b);
            boolean z2 = ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object objN = e18Var.N();
            if (z2 || objN == jd4.a) {
                objN = new gv0(0, bz7Var, z);
                e18Var.k0(objN);
            }
            iqb iqbVarK = gb9.K(androidx.compose.foundation.b.c(iqbVarP, false, null, null, null, (zy7) objN, 15), 8.0f, 12.0f);
            cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var, 48);
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
            ckk.a(z, bz7Var, null, false, akk.d(gm3.a(e18Var).c, gm3.a(e18Var).O, 0L, e18Var, 60), e18Var, (i2 >> 3) & 126, 44);
            kxk.g(e18Var, b.t(fqbVar, 16.0f));
            tjh.b(str, new hw9(1.0f, true), 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, null, e18Var, i2 & 14, 24960, 241660);
            e18Var = e18Var;
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new iv(str, z, bz7Var, i, 2);
        }
    }

    public static final void f(List list, List list2, bz7 bz7Var, ld4 ld4Var, int i) {
        nwb nwbVar;
        nwb nwbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1536387727);
        int i2 = i | (e18Var.f(list) ? 4 : 2) | (e18Var.f(list2) ? 32 : 16) | (e18Var.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = mpk.P("");
                e18Var.k0(objN);
            }
            nwb nwbVar3 = (nwb) objN;
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = mpk.P(Boolean.FALSE);
                e18Var.k0(objN2);
            }
            nwb nwbVar4 = (nwb) objN2;
            ho0 ho0Var = new ho0(8.0f, true, new sz6(1));
            vo1 vo1Var = lja.S;
            q64 q64VarA = p64.a(ho0Var, vo1Var, e18Var, 6);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            fqb fqbVar = fqb.E;
            iqb iqbVarE = kxk.E(e18Var, fqbVar);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, q64VarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            ho0 ho0Var2 = new ho0(8.0f, true, new sz6(1));
            iqb iqbVarB0 = mpk.b0(b.g(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 320.0f, 1), mpk.Y(e18Var), true);
            q64 q64VarA2 = p64.a(ho0Var2, vo1Var, e18Var, 6);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarB0);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, q64VarA2);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            e18Var.a0(-44906814);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                boolean zContains = list2.contains(str);
                boolean zF = ((i2 & 112) == 32) | e18Var.f(str) | ((i2 & 896) == 256);
                Object objN3 = e18Var.N();
                if (zF || objN3 == lz1Var) {
                    objN3 = new oq(list2, str, bz7Var, 1);
                    e18Var.k0(objN3);
                }
                e(str, zContains, (bz7) objN3, e18Var, 0);
            }
            e18Var.p(false);
            e18Var.p(true);
            wo1 wo1Var = lja.Q;
            iqb iqbVarL = gb9.L(b.c(fqbVar, 1.0f), 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
            cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var, 48);
            int iHashCode3 = Long.hashCode(e18Var.T);
            hyc hycVarL3 = e18Var.l();
            iqb iqbVarE3 = kxk.E(e18Var, iqbVarL);
            dd4.e.getClass();
            re4 re4Var2 = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var2);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, cxeVarA);
            d4c.i0(e18Var, cd4.e, hycVarL3);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode3));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE3);
            boolean z = ((Boolean) nwbVar4.getValue()).booleanValue() && !bsg.I0((String) nwbVar3.getValue());
            int i3 = i2 & 896;
            int i4 = i2 & 112;
            boolean z2 = (i3 == 256) | (i4 == 32);
            Object objN4 = e18Var.N();
            if (z2 || objN4 == lz1Var) {
                nwbVar = nwbVar3;
                nwbVar2 = nwbVar4;
                objN4 = new cv0(bz7Var, list2, nwbVar2, nwbVar);
                e18Var.k0(objN4);
            } else {
                nwbVar = nwbVar3;
                nwbVar2 = nwbVar4;
            }
            nwb nwbVar5 = nwbVar;
            nwb nwbVar6 = nwbVar2;
            ckk.a(z, (bz7) objN4, null, false, akk.d(gm3.a(e18Var).c, gm3.a(e18Var).O, 0L, e18Var, 60), e18Var, 0, 44);
            String str2 = (String) nwbVar5.getValue();
            tkh tkhVar = ((jm3) gm3.c(e18Var).e.E).g;
            long j = d54.g;
            boolean z3 = false;
            ffh ffhVarA = vz8.A(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, j, j, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, e18Var, 2147477503, 4095);
            vve vveVarB = xve.b(12.0f);
            hw9 hw9Var = new hw9(1.0f, true);
            boolean z4 = i4 == 32;
            if (i3 == 256) {
                z3 = true;
            }
            boolean z5 = z4 | z3;
            Object objN5 = e18Var.N();
            if (z5 || objN5 == lz1Var) {
                objN5 = new cv0(list2, bz7Var, nwbVar5, nwbVar6);
                e18Var.k0(objN5);
            }
            pok.b(str2, (bz7) objN5, hw9Var, false, false, tkhVar, null, kvj.b, null, null, null, null, null, true, 0, 0, vveVarB, ffhVarA, e18Var, 12582912, 12582912, 1965912);
            e18Var = e18Var;
            e18Var.p(true);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new zu0(list, list2, bz7Var, i, 1);
        }
    }

    public static final void g(final boolean z, final boolean z2, zy7 zy7Var, ld4 ld4Var, int i) {
        int i2;
        zy7 zy7Var2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1030587068);
        if ((i & 6) == 0) {
            i2 = (e18Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.g(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            zy7Var2 = zy7Var;
            i2 |= e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            zy7Var2 = zy7Var;
        }
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            lnk.d(zy7Var2, b.c(fqb.E, 1.0f), z2, xve.b(12.0f), null, null, null, fd9.q0(385894201, new rz7() { // from class: av0
                @Override // defpackage.rz7
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    long j;
                    ld4 ld4Var2 = (ld4) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((dxe) obj).getClass();
                    e18 e18Var2 = (e18) ld4Var2;
                    if (e18Var2.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        String strJ0 = d4c.j0(z ? R.string.ask_user_input_submit : R.string.ask_user_input_next, e18Var2);
                        if (z2) {
                            e18Var2.a0(1477147104);
                            j = gm3.a(e18Var2).M;
                        } else {
                            e18Var2.a0(1477148128);
                            j = gm3.a(e18Var2).O;
                        }
                        e18Var2.p(false);
                        tjh.b(strJ0, gb9.J(b.c(fqb.E, 1.0f), 8.0f), j, 0L, null, dv7.M, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, null, e18Var2, 1572912, 0, 261048);
                    } else {
                        e18Var2.T();
                    }
                    return iei.a;
                }
            }, e18Var), e18Var, ((i2 >> 6) & 14) | 805306416 | ((i2 << 3) & 896), 496);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new bv0(z, z2, zy7Var, i, 0);
        }
    }

    public static final void h(int i, String str, zy7 zy7Var, ld4 ld4Var, int i2) {
        e18 e18Var;
        String str2 = str;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1943178476);
        int i3 = i2 | (e18Var2.d(i) ? 4 : 2) | (e18Var2.f(str2) ? 32 : 16) | (e18Var2.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var2.Q(i3 & 1, (i3 & 147) != 146)) {
            wo1 wo1Var = lja.Q;
            fqb fqbVar = fqb.E;
            iqb iqbVarJ = gb9.J(androidx.compose.foundation.b.c(xn5.V(b.c(fqbVar, 1.0f), xve.b(12.0f)), false, null, null, null, zy7Var, 15), 12.0f);
            cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var2, 48);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarJ);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var2, z80Var, cxeVarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var2, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var2, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var2, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var2, z80Var4, iqbVarE);
            xo1 xo1Var = lja.K;
            iqb iqbVarP = yfd.p(xn5.V(b.o(fqbVar, 28.0f), xve.a), gm3.a(e18Var2).p, zni.b);
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode2 = Long.hashCode(e18Var2.T);
            hyc hycVarL2 = e18Var2.l();
            iqb iqbVarE2 = kxk.E(e18Var2, iqbVarP);
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, z80Var, o5bVarD);
            d4c.i0(e18Var2, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var2, z80Var3, e18Var2, bxVar);
            d4c.i0(e18Var2, z80Var4, iqbVarE2);
            tjh.b(String.valueOf(i), null, gm3.a(e18Var2).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).j, e18Var2, 0, 0, 131066);
            e18Var2.p(true);
            kxk.g(e18Var2, b.t(fqbVar, 12.0f));
            str2 = str;
            tjh.b(str2, new hw9(1.0f, true), 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, null, e18Var2, (i3 >> 3) & 14, 24960, 241660);
            e18Var = e18Var2;
            e18Var.p(true);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fv0(i, str2, zy7Var, i2);
        }
    }

    public static final void i(AskUserInputV0InputQuestionsItem askUserInputV0InputQuestionsItem, List list, bz7 bz7Var, bz7 bz7Var2, boolean z, zy7 zy7Var, zy7 zy7Var2, ld4 ld4Var, int i) {
        zy7 zy7Var3 = zy7Var2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-533254950);
        int i2 = i | (e18Var.f(askUserInputV0InputQuestionsItem) ? 4 : 2) | (e18Var.f(list) ? 32 : 16) | (e18Var.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(bz7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.g(z) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.h(zy7Var) ? 131072 : 65536) | (e18Var.h(zy7Var3) ? FreeTypeConstants.FT_LOAD_COLOR : 524288);
        if (e18Var.Q(i2 & 1, (599187 & i2) != 599186)) {
            AskUserInputV0InputQuestionsItemType type = askUserInputV0InputQuestionsItem.getType();
            if (type == null) {
                type = AskUserInputV0InputQuestionsItemType.SINGLE_SELECT;
            }
            AskUserInputV0InputQuestionsItemType askUserInputV0InputQuestionsItemType = type;
            fqb fqbVar = fqb.E;
            iqb iqbVarJ = gb9.J(b.c(fqbVar, 1.0f), 16.0f);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
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
            d4c.i0(e18Var, cd4.f, q64VarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            b(zy7Var, null, fd9.q0(-1972346362, new nn(3, askUserInputV0InputQuestionsItem), e18Var), e18Var, ((i2 >> 15) & 14) | 384, 2);
            int i3 = qv0.a[askUserInputV0InputQuestionsItemType.ordinal()];
            if (i3 == 1) {
                zy7Var3 = zy7Var2;
                e18Var.a0(675679392);
                n(askUserInputV0InputQuestionsItem.getOptions(), bz7Var2, e18Var, (i2 >> 6) & 112);
                e18Var.p(false);
            } else if (i3 == 2) {
                zy7Var3 = zy7Var2;
                e18Var.a0(675931639);
                f(askUserInputV0InputQuestionsItem.getOptions(), list, bz7Var, e18Var, i2 & 1008);
                kxk.g(e18Var, b.e(fqbVar, 16.0f));
                g(z, !list.isEmpty(), zy7Var3, e18Var, (i2 >> 12) & 910);
                e18Var.p(false);
            } else {
                if (i3 != 3) {
                    throw ebh.u(e18Var, 714531146, false);
                }
                e18Var.a0(676472496);
                List<String> options = askUserInputV0InputQuestionsItem.getOptions();
                List list2 = list;
                if (list2.isEmpty()) {
                    List<String> options2 = askUserInputV0InputQuestionsItem.getOptions();
                    ArrayList arrayList = new ArrayList(x44.y(options2, 10));
                    Iterator<T> it = options2.iterator();
                    while (it.hasNext()) {
                        arrayList.add((String) it.next());
                    }
                    list2 = arrayList;
                }
                k(options, list2, bz7Var, e18Var, i2 & 896);
                kxk.g(e18Var, b.e(fqbVar, 16.0f));
                int i4 = i2 >> 12;
                zy7Var3 = zy7Var2;
                g(z, true, zy7Var3, e18Var, (i4 & 896) | (i4 & 14) | 48);
                e18Var.p(false);
            }
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new uu0(askUserInputV0InputQuestionsItem, list, bz7Var, bz7Var2, z, zy7Var, zy7Var3, i);
        }
    }

    public static final void j(int i, String str, boolean z, ld4 ld4Var, int i2) {
        String str2;
        long j;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(983547106);
        int i3 = i2 | (e18Var.d(i) ? 4 : 2) | (e18Var.f(str) ? 32 : 16) | (e18Var.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            if (z) {
                e18Var.a0(295968359);
                j = gm3.a(e18Var).p;
            } else {
                e18Var.a0(295969319);
                j = gm3.a(e18Var).n;
            }
            e18Var.p(false);
            wo1 wo1Var = lja.Q;
            fqb fqbVar = fqb.E;
            iqb iqbVarC = b.c(fqbVar, 1.0f);
            wo8 wo8Var = zni.b;
            iqb iqbVarJ = gb9.J(yfd.p(iqbVarC, j, wo8Var), 12.0f);
            cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var, 48);
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
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, cxeVarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            xo1 xo1Var = lja.K;
            iqb iqbVarP = yfd.p(xn5.V(b.o(fqbVar, 28.0f), xve.a), gm3.a(e18Var).p, wo8Var);
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarP);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, o5bVarD);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            tjh.b(String.valueOf(i), null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).j, e18Var, 0, 0, 131066);
            e18Var.p(true);
            kxk.g(e18Var, b.t(fqbVar, 16.0f));
            hw9 hw9Var = new hw9(1.0f, true);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
            int iHashCode3 = Long.hashCode(e18Var.T);
            hyc hycVarL3 = e18Var.l();
            iqb iqbVarE3 = kxk.E(e18Var, hw9Var);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, q64VarA);
            d4c.i0(e18Var, z80Var2, hycVarL3);
            ij0.t(iHashCode3, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE3);
            tjh.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, null, e18Var, (i3 >> 3) & 14, 24960, 241662);
            str2 = str;
            e18Var = e18Var;
            e18Var.p(true);
            cv8.b(a.a(ud0.c0, e18Var), null, b.o(fqbVar, 20.0f), gm3.a(e18Var).O, e18Var, 440, 0);
            e18Var.p(true);
        } else {
            str2 = str;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ev0(str2, i, i2, z);
        }
    }

    public static final void k(List list, List list2, bz7 bz7Var, ld4 ld4Var, int i) {
        String str;
        pz7 pz7Var;
        String str2;
        int i2;
        Object pv0Var;
        nwb nwbVar;
        fqb fqbVar;
        boolean z;
        nwb nwbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(912203632);
        int i3 = i | (e18Var.f(list2) ? 32 : 16) | (e18Var.h(bz7Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i3 & 1, (i3 & 145) != 144)) {
            boolean z2 = (i3 & 112) == 32;
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            Object obj = objN;
            if (z2 || objN == lz1Var) {
                bz7Var.invoke(list2);
                kdg kdgVar = new kdg();
                kdgVar.addAll(list2);
                e18Var.k0(kdgVar);
                obj = kdgVar;
            }
            kdg kdgVar2 = (kdg) obj;
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = mpk.P(null);
                e18Var.k0(objN2);
            }
            nwb nwbVar3 = (nwb) objN2;
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = mpk.P(null);
                e18Var.k0(objN3);
            }
            nwb nwbVar4 = (nwb) objN3;
            Object objN4 = e18Var.N();
            if (objN4 == lz1Var) {
                objN4 = new hsc(MTTypesetterKt.kLineSkipLimitMultiplier);
                e18Var.k0(objN4);
            }
            hsc hscVar = (hsc) objN4;
            Object objN5 = e18Var.N();
            if (objN5 == lz1Var) {
                objN5 = vb7.g(0, e18Var);
            }
            isc iscVar = (isc) objN5;
            String strJ0 = d4c.j0(R.string.ask_user_input_move_up_a11y, e18Var);
            String strJ02 = d4c.j0(R.string.ask_user_input_move_down_a11y, e18Var);
            int i4 = i3 & 896;
            boolean zF = e18Var.f(kdgVar2) | (i4 == 256);
            Object objN6 = e18Var.N();
            if (zF || objN6 == lz1Var) {
                objN6 = new kn(kdgVar2, 7, bz7Var);
                e18Var.k0(objN6);
            }
            pz7 pz7Var2 = (pz7) objN6;
            ho0 ho0Var = new ho0(8.0f, true, new sz6(1));
            fqb fqbVar2 = fqb.E;
            iqb iqbVarB0 = mpk.b0(b.g(fqbVar2, MTTypesetterKt.kLineSkipLimitMultiplier, 320.0f, 1), mpk.Y(e18Var), true);
            q64 q64VarA = p64.a(ho0Var, lja.S, e18Var, 6);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarB0);
            dd4.e.getClass();
            nwb nwbVar5 = nwbVar3;
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
            e18Var.a0(823596451);
            ListIterator listIterator = kdgVar2.listIterator();
            int i5 = 0;
            while (true) {
                c8a c8aVar = (c8a) listIterator;
                if (!c8aVar.hasNext()) {
                    e18Var.p(false);
                    e18Var.p(true);
                    break;
                }
                Object next = c8aVar.next();
                int i6 = i5 + 1;
                if (i5 < 0) {
                    x44.n0();
                    throw null;
                }
                String str3 = (String) next;
                Integer num = (Integer) nwbVar5.getValue();
                boolean z3 = num != null && num.intValue() == i5;
                Integer num2 = (Integer) nwbVar4.getValue();
                ListIterator listIterator2 = listIterator;
                boolean z4 = num2 != null && num2.intValue() == i5;
                boolean zD = e18Var.d(i5) | e18Var.f(strJ0) | e18Var.f(pz7Var2) | e18Var.f(kdgVar2) | e18Var.f(strJ02);
                int i7 = i5;
                Object objN7 = e18Var.N();
                if (zD || objN7 == lz1Var) {
                    str = strJ0;
                    pz7Var = pz7Var2;
                    str2 = strJ02;
                    i2 = i7;
                    wu0 wu0Var = new wu0(i2, str, kdgVar2, str2, pz7Var);
                    e18Var.k0(wu0Var);
                    objN7 = wu0Var;
                } else {
                    pz7Var = pz7Var2;
                    str = strJ0;
                    str2 = strJ02;
                    i2 = i7;
                }
                iqb iqbVarJ = lnk.j(tjf.b(fqbVar2, true, (bz7) objN7), z3 ? 1.0f : MTTypesetterKt.kLineSkipLimitMultiplier);
                boolean zG = e18Var.g(z3);
                Object objN8 = e18Var.N();
                if (zG || objN8 == lz1Var) {
                    objN8 = new xu0(z3, hscVar, 0);
                    e18Var.k0(objN8);
                }
                iqb iqbVarL = sf5.L(iqbVarJ, (bz7) objN8);
                Object objN9 = e18Var.N();
                if (objN9 == lz1Var) {
                    objN9 = new tn(iscVar, 1);
                    e18Var.k0(objN9);
                }
                iqb iqbVarP0 = xn5.p0(iqbVarL, (bz7) objN9);
                boolean zG2 = e18Var.g(z3) | e18Var.g(z4);
                Object objN10 = e18Var.N();
                if (zG2 || objN10 == lz1Var) {
                    objN10 = new yu0(z3, z4, 0);
                    e18Var.k0(objN10);
                }
                iqb iqbVarI0 = xn5.i0(iqbVarP0, (bz7) objN10);
                boolean zD2 = e18Var.d(i2);
                Object objN11 = e18Var.N();
                if (zD2 || objN11 == lz1Var) {
                    objN11 = new nv0(i2, nwbVar4);
                    e18Var.k0(objN11);
                }
                iei ieiVar = iei.a;
                iqb iqbVarA = a0h.a(iqbVarI0, ieiVar, (PointerInputEventHandler) objN11);
                boolean z5 = z4;
                boolean zD3 = e18Var.d(i2) | (i4 == 256) | e18Var.f(kdgVar2);
                Object objN12 = e18Var.N();
                if (zD3 || objN12 == lz1Var) {
                    nwbVar = nwbVar4;
                    fqbVar = fqbVar2;
                    int i8 = i2;
                    z = z3;
                    nwbVar2 = nwbVar5;
                    pv0Var = new pv0(i8, nwbVar2, hscVar, bz7Var, kdgVar2, iscVar);
                    e18Var.k0(pv0Var);
                } else {
                    pv0Var = objN12;
                    nwbVar = nwbVar4;
                    z = z3;
                    fqbVar = fqbVar2;
                    nwbVar2 = nwbVar5;
                }
                iqb iqbVarA2 = a0h.a(iqbVarA, ieiVar, (PointerInputEventHandler) pv0Var);
                o5b o5bVarD = dw1.d(lja.G, false);
                int i9 = i4;
                nwb nwbVar6 = nwbVar;
                int iHashCode2 = Long.hashCode(e18Var.T);
                hyc hycVarL2 = e18Var.l();
                iqb iqbVarE2 = kxk.E(e18Var, iqbVarA2);
                dd4.e.getClass();
                re4 re4Var2 = cd4.b;
                e18Var.e0();
                if (e18Var.S) {
                    e18Var.k(re4Var2);
                } else {
                    e18Var.n0();
                }
                d4c.i0(e18Var, cd4.f, o5bVarD);
                d4c.i0(e18Var, cd4.e, hycVarL2);
                d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode2));
                d4c.h0(e18Var, cd4.h);
                d4c.i0(e18Var, cd4.d, iqbVarE2);
                j(i6, str3, z5 || z, e18Var, 0);
                e18Var.p(true);
                nwbVar5 = nwbVar2;
                i4 = i9;
                nwbVar4 = nwbVar6;
                i5 = i6;
                strJ0 = str;
                strJ02 = str2;
                pz7Var2 = pz7Var;
                fqbVar2 = fqbVar;
                listIterator = listIterator2;
            }
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new zu0(list, list2, bz7Var, i, 0);
        }
    }

    public static final void l(iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(991641125);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(iqbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            vo1 vo1Var = lja.T;
            ho0 ho0Var = new ho0(8.0f, true, new sz6(1));
            iqb iqbVarL = gb9.L(iqbVar, 72.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
            q64 q64VarA = p64.a(ho0Var, vo1Var, e18Var, 54);
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
            d4c.i0(e18Var, cd4.f, q64VarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            xn5.N(u00.D(R.drawable.cowork_empty_checklist, 0, e18Var), null, gb9.N(b.t(fqb.E, 64.0f), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 32.0f, 7), null, null, MTTypesetterKt.kLineSkipLimitMultiplier, null, e18Var, 440, 120);
            tjh.b(d4c.j0(R.string.cowork_scheduled_empty_title, e18Var), null, gm3.a(e18Var).M, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).h, e18Var, 0, 0, 130042);
            tjh.b(d4c.j0(R.string.cowork_scheduled_empty_subtitle, e18Var), null, gm3.a(e18Var).O, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 0, 0, 130042);
            e18Var = e18Var;
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new i10(iqbVar, i, 8, (byte) 0);
        }
    }

    public static final void m(String str, ApiHelpline apiHelpline, pz7 pz7Var, pz7 pz7Var2, qi3 qi3Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(918350322);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(apiHelpline) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(pz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.h(pz7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= (i & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) == 0 ? e18Var.f(qi3Var) : e18Var.h(qi3Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        int i3 = 0;
        if (e18Var.Q(i2 & 1, (i2 & 9363) != 9362)) {
            Context context = (Context) e18Var.j(w00.b);
            boolean z = (apiHelpline == null || (apiHelpline.getPhone_number() == null && apiHelpline.getSms_number() == null)) ? false : true;
            int i4 = i2 & 57344;
            int i5 = i2 & 14;
            boolean z2 = (i4 == 16384 || ((i2 & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) != 0 && e18Var.h(qi3Var))) | (i5 == 4);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (z2 || objN == lz1Var) {
                objN = new j55(qi3Var, str, i3);
                e18Var.k0(objN);
            }
            zy7 zy7Var = (zy7) objN;
            boolean z3 = ((i2 & 896) == 256) | ((i2 & 112) == 32) | (i5 == 4);
            Object objN2 = e18Var.N();
            if (z3 || objN2 == lz1Var) {
                objN2 = new yg4(apiHelpline, pz7Var, str, 10);
                e18Var.k0(objN2);
            }
            zy7 zy7Var2 = (zy7) objN2;
            boolean zH = (i4 == 16384 || ((i2 & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) != 0 && e18Var.h(qi3Var))) | (i5 == 4) | e18Var.h(context);
            Object objN3 = e18Var.N();
            if (zH || objN3 == lz1Var) {
                objN3 = new k55(qi3Var, str, context, 0);
                e18Var.k0(objN3);
            }
            zy7 zy7Var3 = (zy7) objN3;
            boolean z4 = (i4 == 16384 || ((i2 & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) != 0 && e18Var.h(qi3Var))) | (i5 == 4);
            Object objN4 = e18Var.N();
            if (z4 || objN4 == lz1Var) {
                objN4 = new j55(qi3Var, str, 1);
                e18Var.k0(objN4);
            }
            zy7 zy7Var4 = (zy7) objN4;
            boolean z5 = (i4 == 16384 || ((i2 & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) != 0 && e18Var.h(qi3Var))) | (i5 == 4) | ((i2 & 7168) == 2048);
            Object objN5 = e18Var.N();
            if (z5 || objN5 == lz1Var) {
                objN5 = new l55(qi3Var, str, pz7Var2, 0);
                e18Var.k0(objN5);
            }
            jwk.q(null, z, zy7Var, zy7Var2, zy7Var3, zy7Var4, (zy7) objN5, e18Var, 0, 1);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pk(str, apiHelpline, pz7Var, pz7Var2, qi3Var, i, 12);
        }
    }

    public static final void n(List list, bz7 bz7Var, ld4 ld4Var, int i) {
        nwb nwbVar;
        re4 re4Var;
        bz7 bz7Var2 = bz7Var;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-508134864);
        int i2 = (i & 6) == 0 ? i | ((i & 8) == 0 ? e18Var.f(list) : e18Var.h(list) ? 4 : 2) : i;
        if ((i & 48) == 0) {
            i2 |= e18Var.h(bz7Var2) ? 32 : 16;
        }
        int i3 = i2;
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = mpk.P("");
                e18Var.k0(objN);
            }
            nwb nwbVar2 = (nwb) objN;
            ho0 ho0Var = new ho0(8.0f, true, new sz6(1));
            vo1 vo1Var = lja.S;
            q64 q64VarA = p64.a(ho0Var, vo1Var, e18Var, 6);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            fqb fqbVar = fqb.E;
            iqb iqbVarE = kxk.E(e18Var, fqbVar);
            dd4.e.getClass();
            re4 re4Var2 = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var2);
            } else {
                e18Var.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, q64VarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            ho0 ho0Var2 = new ho0(8.0f, true, new sz6(1));
            iqb iqbVarB0 = mpk.b0(b.g(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 320.0f, 1), mpk.Y(e18Var), true);
            q64 q64VarA2 = p64.a(ho0Var2, vo1Var, e18Var, 6);
            lz1 lz1Var2 = lz1Var;
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarB0);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var2);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, q64VarA2);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            e18Var.a0(-836974882);
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    x44.n0();
                    throw null;
                }
                String str = (String) obj;
                boolean zF = ((i3 & 112) == 32) | e18Var.f(str);
                Object objN2 = e18Var.N();
                lz1 lz1Var3 = lz1Var2;
                if (zF || objN2 == lz1Var3) {
                    objN2 = new qn(bz7Var2, str, 1);
                    e18Var.k0(objN2);
                }
                h(i5, str, (zy7) objN2, e18Var, 0);
                iuj.e(null, MTTypesetterKt.kLineSkipLimitMultiplier, 0L, e18Var, 0, 7);
                i4 = i5;
                lz1Var2 = lz1Var3;
            }
            lz1 lz1Var4 = lz1Var2;
            int i6 = 0;
            e18Var.p(false);
            e18Var.p(true);
            wo1 wo1Var = lja.Q;
            iqb iqbVarC = b.c(fqbVar, 1.0f);
            cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var, 48);
            int iHashCode3 = Long.hashCode(e18Var.T);
            hyc hycVarL3 = e18Var.l();
            iqb iqbVarE3 = kxk.E(e18Var, iqbVarC);
            dd4.e.getClass();
            re4 re4Var3 = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var3);
            } else {
                e18Var.n0();
            }
            z80 z80Var5 = cd4.f;
            d4c.i0(e18Var, z80Var5, cxeVarA);
            z80 z80Var6 = cd4.e;
            d4c.i0(e18Var, z80Var6, hycVarL3);
            Integer numValueOf2 = Integer.valueOf(iHashCode3);
            z80 z80Var7 = cd4.g;
            d4c.i0(e18Var, z80Var7, numValueOf2);
            bx bxVar2 = cd4.h;
            d4c.h0(e18Var, bxVar2);
            z80 z80Var8 = cd4.d;
            d4c.i0(e18Var, z80Var8, iqbVarE3);
            String str2 = (String) nwbVar2.getValue();
            tkh tkhVar = ((jm3) gm3.c(e18Var).e.E).g;
            long j = d54.g;
            ffh ffhVarA = vz8.A(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, j, j, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, e18Var, 2147477503, 4095);
            vve vveVarB = xve.b(12.0f);
            mp9 mp9Var = new mp9(i6, i6, 4, 119);
            int i7 = i3 & 112;
            boolean z = i7 == 32;
            Object objN3 = e18Var.N();
            if (z || objN3 == lz1Var4) {
                nwbVar = nwbVar2;
                objN3 = new vu0(bz7Var2, nwbVar, i6);
                e18Var.k0(objN3);
            } else {
                nwbVar = nwbVar2;
            }
            kp9 kp9Var = new kp9(null, (bz7) objN3, 31);
            hw9 hw9Var = new hw9(1.0f, true);
            Object objN4 = e18Var.N();
            if (objN4 == lz1Var4) {
                objN4 = new x40(5, nwbVar);
                e18Var.k0(objN4);
            }
            nwb nwbVar3 = nwbVar;
            pok.b(str2, (bz7) objN4, hw9Var, false, false, tkhVar, null, kvj.a, null, null, null, mp9Var, kp9Var, true, 0, 0, vveVarB, ffhVarA, e18Var, 12582960, 12779520, 1867608);
            kxk.g(e18Var, b.t(fqbVar, 8.0f));
            xo1 xo1Var = lja.K;
            Object objN5 = e18Var.N();
            if (objN5 == lz1Var4) {
                objN5 = new x40(6, nwbVar3);
                e18Var.k0(objN5);
            }
            iqb iqbVarJ = b.j(b.o(xn5.i0(fqbVar, (bz7) objN5), 32.0f), 48.0f);
            vve vveVar = xve.a;
            iqb iqbVarV = xn5.V(iqbVarJ, vveVar);
            boolean z2 = !bsg.I0((String) nwbVar3.getValue());
            vue vueVar = new vue(0);
            boolean z3 = i7 == 32;
            Object objN6 = e18Var.N();
            if (z3 || objN6 == lz1Var4) {
                bz7Var2 = bz7Var;
                objN6 = new bi(bz7Var2, nwbVar3, 1);
                e18Var.k0(objN6);
            } else {
                bz7Var2 = bz7Var;
            }
            iqb iqbVarC2 = androidx.compose.foundation.b.c(iqbVarV, z2, null, vueVar, null, (zy7) objN6, 10);
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode4 = Long.hashCode(e18Var.T);
            hyc hycVarL4 = e18Var.l();
            iqb iqbVarE4 = kxk.E(e18Var, iqbVarC2);
            e18Var.e0();
            if (e18Var.S) {
                re4Var = re4Var3;
                e18Var.k(re4Var);
            } else {
                re4Var = re4Var3;
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var5, o5bVarD);
            d4c.i0(e18Var, z80Var6, hycVarL4);
            ij0.t(iHashCode4, e18Var, z80Var7, e18Var, bxVar2);
            d4c.i0(e18Var, z80Var8, iqbVarE4);
            iqb iqbVarP = yfd.p(xn5.V(b.o(fqbVar, 32.0f), vveVar), gm3.a(e18Var).c, zni.b);
            o5b o5bVarD2 = dw1.d(xo1Var, false);
            int iHashCode5 = Long.hashCode(e18Var.T);
            hyc hycVarL5 = e18Var.l();
            iqb iqbVarE5 = kxk.E(e18Var, iqbVarP);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var5, o5bVarD2);
            d4c.i0(e18Var, z80Var6, hycVarL5);
            ij0.t(iHashCode5, e18Var, z80Var7, e18Var, bxVar2);
            d4c.i0(e18Var, z80Var8, iqbVarE5);
            iv1.b(ud0.o, d4c.j0(R.string.ask_user_input_submit, e18Var), null, ef2.F, gm3.a(e18Var).F, e18Var, 3072, 4);
            e18Var = e18Var;
            e18Var.p(true);
            e18Var.p(true);
            e18Var.p(true);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new qq(list, bz7Var2, i, 2);
        }
    }

    public static final String o(boolean z, ld4 ld4Var) {
        e18 e18Var;
        int i;
        int i2;
        if (z) {
            e18Var = (e18) ld4Var;
            i = R.string.analysis_tool_analyzing;
            i2 = -101793636;
        } else {
            e18Var = (e18) ld4Var;
            i = R.string.analysis_tool_view_analysis;
            i2 = -101732008;
        }
        return vb7.n(e18Var, i2, i, e18Var, false);
    }

    public static final String p(List list, Map map, Context context) throws IOException {
        String strS0;
        String string = context.getString(R.string.ask_user_input_no_answer);
        string.getClass();
        String string2 = context.getString(R.string.ask_user_input_no_selections);
        string2.getClass();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                x44.n0();
                throw null;
            }
            AskUserInputV0InputQuestionsItem askUserInputV0InputQuestionsItem = (AskUserInputV0InputQuestionsItem) obj;
            List list2 = (List) map.get(Integer.valueOf(i));
            if (list2 == null) {
                list2 = lm6.E;
            }
            AskUserInputV0InputQuestionsItemType type = askUserInputV0InputQuestionsItem.getType();
            if (type == null) {
                type = AskUserInputV0InputQuestionsItemType.SINGLE_SELECT;
            }
            sb.append(context.getString(R.string.ask_user_input_question_prefix, askUserInputV0InputQuestionsItem.getQuestion()));
            sb.append('\n');
            int i3 = qv0.a[type.ordinal()];
            if (i3 == 1) {
                strS0 = (String) w44.N0(list2);
                if (strS0 == null) {
                    strS0 = string;
                }
            } else if (i3 == 2) {
                strS0 = w44.S0(list2, ", ", null, null, null, 62);
                if (strS0.length() == 0) {
                    strS0 = string2;
                }
            } else {
                if (i3 != 3) {
                    wg6.i();
                    return null;
                }
                List list3 = list2;
                ArrayList arrayList = new ArrayList(x44.y(list3, 10));
                int i4 = 0;
                for (Object obj2 : list3) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        x44.n0();
                        throw null;
                    }
                    arrayList.add(context.getString(R.string.ask_user_input_ranked_item, Integer.valueOf(i5), (String) obj2));
                    i4 = i5;
                }
                strS0 = context.getString(R.string.ask_user_input_ranked_prefix, w44.S0(arrayList, ", ", null, null, null, 62));
                strS0.getClass();
            }
            sb.append(context.getString(R.string.ask_user_input_answer_prefix, strS0));
            if (i < list.size() - 1) {
                sb.append("\n\n");
            }
            i = i2;
        }
        return sb.toString();
    }

    public static final r20 q(Resources resources, int i) {
        Drawable drawable = resources.getDrawable(i, null);
        drawable.getClass();
        return new r20(((BitmapDrawable) drawable).getBitmap());
    }

    public static final String r(Tool tool, String str, boolean z, ld4 ld4Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String strK0;
        tool.getClass();
        if (str != null) {
            e18 e18Var = (e18) ld4Var;
            e18Var.a0(-96173701);
            if (z) {
                e18Var.a0(1313592208);
                strK0 = d4c.k0(R.string.search_tool_searching_for_query, new Object[]{str}, e18Var);
                e18Var.p(false);
            } else {
                e18Var.a0(1313684433);
                strK0 = d4c.k0(R.string.search_tool_searched_for_query, new Object[]{str}, e18Var);
                e18Var.p(false);
            }
            e18Var.p(false);
            return strK0;
        }
        if (tool instanceof Tool.DriveSearch) {
            e18 e18Var2 = (e18) ld4Var;
            e18Var2.a0(-96166363);
            if (z) {
                i5 = 1313820027;
                i6 = R.string.search_tool_searching_drive;
            } else {
                i5 = 1313901340;
                i6 = R.string.search_tool_searched_drive;
            }
            String strN = vb7.n(e18Var2, i5, i6, e18Var2, false);
            e18Var2.p(false);
            return strN;
        }
        if (tool instanceof Tool.WebSearch) {
            e18 e18Var3 = (e18) ld4Var;
            e18Var3.a0(-96159775);
            if (z) {
                i3 = 1314024317;
                i4 = R.string.search_tool_searching_web;
            } else {
                i3 = 1314103646;
                i4 = R.string.search_tool_searched_web;
            }
            String strN2 = vb7.n(e18Var3, i3, i4, e18Var3, false);
            e18Var3.p(false);
            return strN2;
        }
        e18 e18Var4 = (e18) ld4Var;
        e18Var4.a0(-96153879);
        if (z) {
            i = 1314206969;
            i2 = R.string.search_tool_searching_sources;
        } else {
            i = 1314290266;
            i2 = R.string.search_tool_searched_sources;
        }
        String strN3 = vb7.n(e18Var4, i, i2, e18Var4, false);
        e18Var4.p(false);
        return strN3;
    }

    public static Stream s(yj6 yj6Var, Class cls) {
        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(new r5c(yj6Var, cls), 273), false);
    }
}
