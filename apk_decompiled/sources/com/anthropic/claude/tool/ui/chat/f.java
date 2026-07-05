package com.anthropic.claude.tool.ui.chat;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.tool.model.RequestFormInputFromUserInputFieldsItem;
import com.anthropic.claude.tool.model.RequestFormInputFromUserInputFieldsItemType;
import com.anthropic.claude.tool.ui.chat.FormSheetDestination;
import com.anthropic.claude.types.strings.ToolUseId;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.axe;
import defpackage.b4b;
import defpackage.bg6;
import defpackage.bsg;
import defpackage.bx;
import defpackage.bz7;
import defpackage.c12;
import defpackage.cd4;
import defpackage.cxe;
import defpackage.d4c;
import defpackage.dd4;
import defpackage.dd8;
import defpackage.dtj;
import defpackage.e18;
import defpackage.e7;
import defpackage.ef2;
import defpackage.egg;
import defpackage.eo0;
import defpackage.eve;
import defpackage.f7d;
import defpackage.fd9;
import defpackage.fqb;
import defpackage.g2d;
import defpackage.gb9;
import defpackage.gm3;
import defpackage.gr9;
import defpackage.hw9;
import defpackage.hy1;
import defpackage.hyc;
import defpackage.i4g;
import defpackage.ij0;
import defpackage.im6;
import defpackage.iqb;
import defpackage.iv1;
import defpackage.jce;
import defpackage.jd4;
import defpackage.jm3;
import defpackage.k4g;
import defpackage.kce;
import defpackage.kgh;
import defpackage.ko0;
import defpackage.koi;
import defpackage.ktk;
import defpackage.kwe;
import defpackage.kxk;
import defpackage.l45;
import defpackage.ld4;
import defpackage.lja;
import defpackage.lz1;
import defpackage.m7f;
import defpackage.mnc;
import defpackage.mp9;
import defpackage.muc;
import defpackage.mwa;
import defpackage.p64;
import defpackage.pz7;
import defpackage.pzi;
import defpackage.q64;
import defpackage.qoi;
import defpackage.qwe;
import defpackage.qz7;
import defpackage.r4g;
import defpackage.r7e;
import defpackage.re4;
import defpackage.rje;
import defpackage.rwe;
import defpackage.t4g;
import defpackage.ta4;
import defpackage.tjf;
import defpackage.tjh;
import defpackage.tkh;
import defpackage.u3e;
import defpackage.u4g;
import defpackage.ud0;
import defpackage.ue;
import defpackage.uje;
import defpackage.v3e;
import defpackage.vb7;
import defpackage.vo1;
import defpackage.wd;
import defpackage.wo1;
import defpackage.x44;
import defpackage.xb0;
import defpackage.xn5;
import defpackage.xve;
import defpackage.y02;
import defpackage.yfd;
import defpackage.yi7;
import defpackage.yu;
import defpackage.z80;
import defpackage.zb0;
import defpackage.zy7;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    public static final void a(RequestFormInputFromUserInputFieldsItem requestFormInputFromUserInputFieldsItem, String str, String str2, bz7 bz7Var, ld4 ld4Var, int i) {
        e18 e18Var;
        String name;
        ta4 ta4VarQ0;
        int i2;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1857188643);
        int i3 = i | (e18Var2.f(requestFormInputFromUserInputFieldsItem) ? 4 : 2) | (e18Var2.f(str) ? 32 : 16) | (e18Var2.f(str2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.h(bz7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        int i4 = 0;
        if (e18Var2.Q(i3 & 1, (i3 & 1171) != 1170)) {
            boolean zR = x44.r(requestFormInputFromUserInputFieldsItem.getOptional(), Boolean.TRUE);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var2, 0);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            fqb fqbVar = fqb.E;
            iqb iqbVarE = kxk.E(e18Var2, fqbVar);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, cd4.f, q64VarA);
            d4c.i0(e18Var2, cd4.e, hycVarL);
            d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var2, cd4.h);
            d4c.i0(e18Var2, cd4.d, iqbVarE);
            e18Var2.a0(944314208);
            xb0 xb0Var = new xb0();
            xb0Var.h(requestFormInputFromUserInputFieldsItem.getName());
            if (zR) {
                e18Var2.a0(1479932860);
                e18Var2.p(false);
            } else {
                e18Var2.a0(1479780061);
                int iM = xb0Var.m(new egg(gm3.a(e18Var2).y, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                try {
                    xb0Var.h(" *");
                    xb0Var.j(iM);
                    e18Var2.p(false);
                } catch (Throwable th) {
                    xb0Var.j(iM);
                    throw th;
                }
            }
            zb0 zb0VarN = xb0Var.n();
            e18Var2.p(false);
            tkh tkhVar = ((jm3) gm3.c(e18Var2).e.E).g;
            long j = gm3.a(e18Var2).O;
            iqb iqbVarK = gb9.K(fqbVar, 16.0f, 8.0f);
            Object objN = e18Var2.N();
            if (objN == jd4.a) {
                objN = new f7d(23);
                e18Var2.k0(objN);
            }
            tjh.c(zb0VarN, tjf.a(iqbVarK, (bz7) objN), j, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, tkhVar, e18Var2, 0, 0, 262136);
            if (zR) {
                e18Var2.a0(944340125);
                e18Var2.p(false);
                name = requestFormInputFromUserInputFieldsItem.getName();
            } else {
                e18Var2.a0(944337815);
                name = d4c.k0(R.string.a11y_field_required_label, new Object[]{requestFormInputFromUserInputFieldsItem.getName()}, e18Var2);
                e18Var2.p(false);
            }
            String str3 = name;
            long j2 = gm3.a(e18Var2).n;
            if (str2 == null) {
                e18Var2.a0(-790096469);
                e18Var2.p(false);
                ta4VarQ0 = null;
            } else {
                e18Var2.a0(-790096468);
                ta4VarQ0 = fd9.q0(-1624951180, new yi7(str2, 28), e18Var2);
                e18Var2.p(false);
            }
            ta4 ta4Var = ta4VarQ0;
            RequestFormInputFromUserInputFieldsItemType type = requestFormInputFromUserInputFieldsItem.getType();
            int[] iArr = rje.a;
            pzi mucVar = iArr[type.ordinal()] == 1 ? new muc() : dd8.O;
            int i5 = iArr[requestFormInputFromUserInputFieldsItem.getType().ordinal()];
            if (i5 == 1) {
                i2 = 7;
            } else if (i5 != 2) {
                i2 = 3;
                if (i5 == 3) {
                    i2 = 4;
                } else if (i5 != 4) {
                    i2 = 1;
                }
            } else {
                i2 = 6;
            }
            mwa.b(str, bz7Var, str3, androidx.compose.foundation.layout.b.c(fqbVar, 1.0f), false, false, null, null, ta4Var, null, null, mucVar, new mp9(i4, i2, i4, 123), null, true, 0, 0, j2, null, e18Var2, ((i3 >> 3) & 14) | 3072 | ((i3 >> 6) & 112), 1572864, 1482480);
            e18Var = e18Var2;
            e18Var.p(true);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v3e((Object) requestFormInputFromUserInputFieldsItem, str, (Object) str2, (Object) bz7Var, i, 3);
        }
    }

    public static final void b(List list, Map map, pz7 pz7Var, i4g i4gVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(373989321);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var.f(list) : e18Var.h(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? e18Var.f(map) : e18Var.h(map) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(pz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.f(i4gVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            mnc mncVar = i4gVar.a;
            fqb fqbVar = fqb.E;
            iqb iqbVarI = gb9.I(fqbVar, mncVar);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarI);
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
            wo1 wo1Var = lja.Q;
            iqb iqbVarN = gb9.N(androidx.compose.foundation.layout.b.c(fqbVar, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, 7);
            cxe cxeVarA = axe.a(ko0.e, wo1Var, e18Var, 54);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarN);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, cxeVarA);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            iv1.b(ud0.I0, null, null, ef2.F, gm3.a(e18Var).O, e18Var, 3120, 4);
            kxk.g(e18Var, androidx.compose.foundation.layout.b.t(fqbVar, 4.0f));
            tjh.b(d4c.j0(R.string.form_input_security_notice, e18Var), null, gm3.a(e18Var).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 0, 131066);
            e18Var = e18Var;
            e18Var.p(true);
            e18Var.a0(-1635173903);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                RequestFormInputFromUserInputFieldsItem requestFormInputFromUserInputFieldsItem = (RequestFormInputFromUserInputFieldsItem) it.next();
                String str = (String) map.get(requestFormInputFromUserInputFieldsItem.getName());
                if (str == null) {
                    str = "";
                }
                String placeholder = requestFormInputFromUserInputFieldsItem.getPlaceholder();
                boolean zF = ((i2 & 896) == 256) | e18Var.f(requestFormInputFromUserInputFieldsItem);
                Object objN = e18Var.N();
                if (zF || objN == jd4.a) {
                    objN = new b4b(pz7Var, 25, requestFormInputFromUserInputFieldsItem);
                    e18Var.k0(objN);
                }
                a(requestFormInputFromUserInputFieldsItem, str, placeholder, (bz7) objN, e18Var, 0);
                kxk.g(e18Var, androidx.compose.foundation.layout.b.e(fqbVar, 8.0f));
            }
            e18Var.p(false);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new bg6(list, (Object) map, (qz7) pz7Var, i4gVar, i, 21);
        }
    }

    public static final void c(int i, ld4 ld4Var, zy7 zy7Var, zy7 zy7Var2, iqb iqbVar) {
        int i2;
        boolean z;
        int i3;
        int i4;
        fqb fqbVar;
        int i5;
        float f;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1666855938);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(zy7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(zy7Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            iqb iqbVarJ = gb9.J(xn5.V(yfd.p(androidx.compose.foundation.layout.b.c(iqbVar, 1.0f), gm3.a(e18Var).p, xve.b(20.0f)), xve.b(20.0f)), 16.0f);
            vo1 vo1Var = lja.S;
            eo0 eo0Var = ko0.c;
            q64 q64VarA = p64.a(eo0Var, vo1Var, e18Var, 0);
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
            wo1 wo1Var = lja.P;
            fqb fqbVar2 = fqb.E;
            iqb iqbVarC = androidx.compose.foundation.layout.b.c(fqbVar2, 1.0f);
            cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var, 48);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarC);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, cxeVarA);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            hw9 hw9VarN = kgh.n(e18Var, iqbVarE2, z80Var4, 1.0f, true);
            q64 q64VarA2 = p64.a(eo0Var, vo1Var, e18Var, 0);
            int iHashCode3 = Long.hashCode(e18Var.T);
            hyc hycVarL3 = e18Var.l();
            iqb iqbVarE3 = kxk.E(e18Var, hw9VarN);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, q64VarA2);
            d4c.i0(e18Var, z80Var2, hycVarL3);
            ij0.t(iHashCode3, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE3);
            tjh.b(d4c.j0(R.string.form_input_notice_title, e18Var), null, gm3.a(e18Var).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).h, e18Var, 0, 0, 131066);
            tjh.b(d4c.j0(R.string.form_input_notice_subtitle, e18Var), null, gm3.a(e18Var).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 0, 131066);
            e18Var = e18Var;
            e18Var.p(true);
            if (zy7Var2 != null) {
                e18Var.a0(1220144011);
                i4 = 29360128;
                f = 16.0f;
                z = true;
                fqbVar = fqbVar2;
                i5 = 48;
                i3 = i2;
                ktk.h(com.anthropic.claude.design.icon.a.a(ud0.M1, e18Var), d4c.j0(R.string.form_input_dismiss, e18Var), null, false, null, y02.a, gm3.a(e18Var).p, zy7Var2, e18Var, 196616 | ((i2 << 18) & 29360128));
                e18Var.p(false);
            } else {
                z = true;
                i3 = i2;
                i4 = 29360128;
                fqbVar = fqbVar2;
                i5 = 48;
                f = 16.0f;
                e18Var.a0(1220460614);
                e18Var.p(false);
            }
            e18Var.p(z);
            kxk.g(e18Var, androidx.compose.foundation.layout.b.e(fqbVar, f));
            dtj.a(d4c.j0(R.string.form_input_open_button, e18Var), androidx.compose.foundation.layout.b.c(fqbVar, 1.0f), false, null, new c12(), null, 0L, zy7Var, e18Var, i5 | ((i3 << 21) & i4), 108);
            e18Var.p(z);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new hy1(i, 1, zy7Var, zy7Var2, iqbVar);
        }
    }

    public static final void d(String str, String str2, String str3, List list, bz7 bz7Var, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        String str4;
        e18 e18Var;
        str.getClass();
        str2.getClass();
        list.getClass();
        bz7Var.getClass();
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1612003465);
        if ((i & 6) == 0) {
            i2 = (e18Var2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str4 = str2;
            i2 |= e18Var2.f(str4) ? 32 : 16;
        } else {
            str4 = str2;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.f(str3) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0 ? e18Var2.f(list) : e18Var2.h(list) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var2.h(bz7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var2.h(zy7Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= e18Var2.f(iqbVar) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        int i3 = i2;
        int i4 = 1;
        if (e18Var2.Q(i3 & 1, (i3 & 599187) != 599186)) {
            FormSheetDestination.Closed closed = FormSheetDestination.Closed.INSTANCE;
            String strConcat = "FormSheet:".concat(str);
            u4g u4gVar = k4g.d;
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new g2d(i4, closed);
                e18Var2.k0(objN);
            }
            kce kceVar = jce.a;
            rwe rweVarP = eve.P(kceVar.b(FormSheetDestination.class), strConcat, true, iv1.M(kceVar.b(FormSheetDestination.class)), (zy7) objN, e18Var2);
            r4g r4gVarS = gb9.S(u4gVar, null, null, new d(rweVarP, closed, 1), e18Var2, 0, 6);
            boolean zF = e18Var2.f(rweVarP) | e18Var2.f(r4gVarS);
            Object objN2 = e18Var2.N();
            if (zF || objN2 == lz1Var) {
                objN2 = new t4g(rweVarP, r4gVarS);
                e18Var2.k0(objN2);
            }
            t4g t4gVar = (t4g) objN2;
            int i5 = i3 >> 3;
            uje ujeVarE = e(str, str3, list, str4, null, e18Var2, (i3 & 14) | 24576 | (i5 & 112) | (i5 & 896) | ((i3 << 6) & 7168));
            boolean zH = e18Var2.h(t4gVar);
            Object objN3 = e18Var2.N();
            if (zH || objN3 == lz1Var) {
                objN3 = new ue(t4gVar, 24);
                e18Var2.k0(objN3);
            }
            c((i3 >> 12) & 1008, e18Var2, (zy7) objN3, zy7Var, iqbVar);
            qwe.a(t4gVar, null, null, false, null, new c(ujeVarE, str3, list, bz7Var, t4gVar), e18Var2, 0, 30);
            e18Var = e18Var2;
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new yu(str, str2, str3, list, bz7Var, zy7Var, iqbVar, i, 5);
        }
    }

    public static final uje e(String str, String str2, List list, String str3, String str4, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        m7f m7fVar = (m7f) e18Var.j(gr9.b);
        String str5 = ((koi) e18Var.j(qoi.a)).e;
        ToolUseId toolUseIdM1157boximpl = ToolUseId.m1157boximpl(str);
        boolean zH = ((((i & 112) ^ 48) > 32 && e18Var.f(str2)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && e18Var.h(list)) || (i & 384) == 256) | e18Var.h(m7fVar) | e18Var.f(str5) | ((((i & 7168) ^ 3072) > 2048 && e18Var.f(str3)) || (i & 3072) == 2048) | ((((57344 & i) ^ 24576) > 16384 && e18Var.f(str4)) || (i & 24576) == 16384);
        Object objN = e18Var.N();
        if (zH || objN == jd4.a) {
            e7 e7Var = new e7(str2, list, m7fVar, str5, str3, str4, 8);
            e18Var.k0(e7Var);
            objN = e7Var;
        }
        return (uje) fd9.r0(jce.a.b(uje.class), toolUseIdM1157boximpl, (bz7) objN, e18Var);
    }

    public static final kwe f(uje ujeVar, String str, List list, pz7 pz7Var, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        if (objN == jd4.a) {
            objN = fd9.O(im6.E, e18Var);
            e18Var.k0(objN);
        }
        l45 l45Var = (l45) objN;
        int i = 1;
        if (str == null || !(!bsg.I0(str))) {
            str = vb7.n(e18Var, 1373372459, R.string.form_input_sheet_title, e18Var, false);
        } else {
            e18Var.a0(1373372034);
            e18Var.p(false);
        }
        return new kwe(str, null, null, null, fd9.q0(912542802, new wd(ujeVar, l45Var, pz7Var, 11), e18Var), false, fd9.q0(325302048, new u3e(list, i, ujeVar), e18Var), 190);
    }

    public static final kwe g(String str, String str2, String str3, String str4, List list, pz7 pz7Var, e18 e18Var) {
        str.getClass();
        str2.getClass();
        list.getClass();
        pz7Var.getClass();
        return f(e(str, str4, list, str2, str3, e18Var, 0), str4, list, pz7Var, e18Var);
    }
}
