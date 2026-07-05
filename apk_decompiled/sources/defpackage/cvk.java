package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.chat.input.images.a;
import com.anthropic.claude.project.create.CreateTemplateProjectScreenParams;
import com.anthropic.claude.sessions.types.SdkControlCancelRequestEvent;
import com.anthropic.claude.sessions.types.SdkControlRequestEvent;
import com.anthropic.claude.sessions.types.SdkControlResponseEvent;
import com.anthropic.claude.sessions.types.SdkEnvManagerLogEvent;
import com.anthropic.claude.sessions.types.SdkEvent;
import com.anthropic.claude.sessions.types.SdkMessageEvent;
import com.anthropic.claude.sessions.types.SdkPromptSuggestionEvent;
import com.anthropic.claude.sessions.types.SdkRateLimitEvent;
import com.anthropic.claude.sessions.types.SdkResultEvent;
import com.anthropic.claude.sessions.types.SdkStreamEvent;
import com.anthropic.claude.sessions.types.SdkSystemEvent;
import com.anthropic.claude.sessions.types.SdkToolProgressEvent;
import com.anthropic.claude.sessions.types.SdkToolUseSummaryEvent;
import com.anthropic.claude.sessions.types.SdkUnknownEvent;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cvk {
    public static final ta4 a = new ta4(1156081579, false, new cc4(16));

    public static final void a(znd zndVar, yih yihVar, mzi mziVar, ld4 ld4Var, int i) {
        mzi mziVar2 = mziVar;
        yihVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1892107528);
        int i2 = i | (e18Var.h(zndVar) ? 4 : 2) | (e18Var.f(yihVar) ? 32 : 16) | (e18Var.f(mziVar2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        int i3 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = ij0.d(e18Var);
            }
            bt7 bt7Var = (bt7) objN;
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = new fz3(bt7Var, null, 3);
                e18Var.k0(objN2);
            }
            fd9.i(e18Var, (pz7) objN2, iei.a);
            fqb fqbVar = fqb.E;
            iqb iqbVarC = b.c(fqbVar, 1.0f);
            q64 q64VarA = p64.a(new ho0(24.0f, true, new sz6(i3)), lja.S, e18Var, 6);
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
            d4c.i0(e18Var, cd4.f, q64VarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            tjh.b(zndVar.c.c, null, gm3.a(e18Var).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).b, e18Var, 0, 0, 131066);
            e18Var = e18Var;
            pzg.a(b.c(fqbVar, 1.0f), gm3.b(e18Var).h, gm3.a(e18Var).n, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, sf5.a(MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var).u), fd9.q0(-182106151, new f44(bt7Var, yihVar, zndVar, 21), e18Var), e18Var, 12582918, 56);
            if (mziVar != null) {
                e18Var.a0(1571335925);
                mziVar2 = mziVar;
                i(mziVar2.a, mziVar2.b, mziVar2.c, mziVar2.d, e18Var, 0);
                e18Var.p(false);
            } else {
                mziVar2 = mziVar;
                e18Var.a0(1571688612);
                e18Var.p(false);
            }
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new f44(zndVar, i, yihVar, mziVar2, 22);
        }
    }

    public static final void b(iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(356681893);
        int i2 = i | 6;
        int i3 = 2;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            xo1 xo1Var = lja.K;
            fqb fqbVar = fqb.E;
            iqb iqbVarJ = gb9.J(yfd.p(xn5.S(fqbVar, 0.8f), gm3.a(e18Var).y, xve.a), 6.0f);
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
            iv1.b(ud0.K1, d4c.j0(R.string.generic_error_title, e18Var), sf5.N(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, -1.0f, 1), null, gm3.a(e18Var).F, e18Var, 384, 8);
            e18Var.p(true);
            iqbVar = fqbVar;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fl(i, i3, iqbVar);
        }
    }

    public static final void c(gt2 gt2Var, iqb iqbVar, zy7 zy7Var, ld4 ld4Var, int i) {
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-147231479);
        int i2 = (e18Var.f(gt2Var) ? 4 : 2) | i | 48 | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            ww2 ww2Var = gt2Var.a;
            e18Var.a0(-1011155371);
            boolean z = ww2Var instanceof rw2;
            iqbVar2 = fqb.E;
            if (z) {
                e18Var.a0(-1011078770);
                a.a((rw2) ww2Var, iqbVar2, zy7Var, null, null, e18Var, i2 & 1008);
                e18Var.p(false);
            } else {
                if (!(ww2Var instanceof ow2)) {
                    throw ebh.u(e18Var, 244476749, false);
                }
                e18Var.a0(-1010822896);
                bj7.d((ow2) ww2Var, zy7Var, null, e18Var, i2 & 1008);
                e18Var.p(false);
            }
            e18Var.p(false);
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new m6(gt2Var, i, iqbVar2, zy7Var, 12);
        }
    }

    public static final void d(List list, final bz7 bz7Var, final bz7 bz7Var2, iqb iqbVar, float f, ld4 ld4Var, int i) {
        iqb iqbVar2;
        float f2;
        final int i2;
        Object obj;
        boolean z;
        list.getClass();
        bz7Var.getClass();
        bz7Var2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1167945624);
        int i3 = i | (e18Var.f(list) ? 4 : 2) | (e18Var.h(bz7Var) ? 32 : 16) | (e18Var.h(bz7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 24576;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = false;
        if (e18Var.Q(i3 & 1, (i3 & 9363) != 9362)) {
            wo1 wo1Var = lja.Q;
            ho0 ho0Var = new ho0(16.0f, true, new sz6(z3 ? 1 : 0));
            iqbVar2 = iqbVar;
            iqb iqbVarB0 = mpk.b0(iqbVar2, mpk.Y(e18Var), false);
            cxe cxeVarA = axe.a(ho0Var, wo1Var, e18Var, 48);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarB0);
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
            e18Var.a0(-1022730978);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final gt2 gt2Var = (gt2) it.next();
                e18Var.X(-1227873682, gt2Var.a.j());
                o5b o5bVarD = dw1.d(lja.G, z4);
                int iHashCode2 = Long.hashCode(e18Var.T);
                hyc hycVarL2 = e18Var.l();
                fqb fqbVar = fqb.E;
                iqb iqbVarE2 = kxk.E(e18Var, fqbVar);
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
                boolean zH = ((i3 & 112) == 32) | e18Var.h(gt2Var);
                Object objN = e18Var.N();
                lz1 lz1Var = jd4.a;
                if (zH || objN == lz1Var) {
                    i2 = 0;
                    zy7 zy7Var = new zy7() { // from class: l21
                        @Override // defpackage.zy7
                        public final Object a() {
                            int i4 = i2;
                            iei ieiVar = iei.a;
                            gt2 gt2Var2 = gt2Var;
                            bz7 bz7Var3 = bz7Var;
                            switch (i4) {
                                case 0:
                                    bz7Var3.invoke(gt2Var2);
                                    break;
                                default:
                                    bz7Var3.invoke(gt2Var2);
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    e18Var.k0(zy7Var);
                    obj = zy7Var;
                } else {
                    i2 = 0;
                    obj = objN;
                }
                c(gt2Var, null, (zy7) obj, e18Var, i2);
                String strJ0 = d4c.j0(R.string.chat_input_image_remove_button_content_description, e18Var);
                iqb iqbVarN = gb9.N(nw1.a.a(fqbVar, lja.I), MTTypesetterKt.kLineSkipLimitMultiplier, 6.0f, 6.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 9);
                boolean zH2 = ((i3 & 896) == 256) | e18Var.h(gt2Var);
                Object objN2 = e18Var.N();
                if (zH2 || objN2 == lz1Var) {
                    z = true;
                    final boolean z5 = true ? 1 : 0;
                    objN2 = new zy7() { // from class: l21
                        @Override // defpackage.zy7
                        public final Object a() {
                            int i4 = z5;
                            iei ieiVar = iei.a;
                            gt2 gt2Var2 = gt2Var;
                            bz7 bz7Var3 = bz7Var2;
                            switch (i4) {
                                case 0:
                                    bz7Var3.invoke(gt2Var2);
                                    break;
                                default:
                                    bz7Var3.invoke(gt2Var2);
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    e18Var.k0(objN2);
                } else {
                    z = true;
                }
                zlk.b(0, e18Var, (zy7) objN2, iqbVarN, strJ0);
                e18Var.p(z);
                e18Var.p(false);
                z2 = z;
                z4 = false;
            }
            e18Var.p(z4);
            e18Var.p(z2);
            f2 = 16.0f;
        } else {
            iqbVar2 = iqbVar;
            e18Var.T();
            f2 = f;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new eu(list, bz7Var, bz7Var2, iqbVar2, f2, i, 1);
        }
    }

    public static final void e(List list, bz7 bz7Var, znd zndVar, ld4 ld4Var, int i) {
        e18 e18Var;
        list.getClass();
        bz7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1661237701);
        int i2 = ((i & 8) == 0 ? e18Var2.f(list) : e18Var2.h(list) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= e18Var2.h(bz7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? e18Var2.f(zndVar) : e18Var2.h(zndVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var2.Q(i2 & 1, (i2 & 147) != 146)) {
            fqb fqbVar = fqb.E;
            iqb iqbVarN = gb9.N(b.c(fqbVar, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, 7);
            iqb iqbVarI = gb9.i(fqbVar, null, 3);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var2, 0);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarI);
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
            lz1 lz1Var = jd4.a;
            if (zndVar == null) {
                e18Var2.a0(-1237434917);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    znd zndVar2 = (znd) it.next();
                    boolean zH = ((i2 & 112) == 32) | e18Var2.h(zndVar2);
                    Object objN = e18Var2.N();
                    if (zH || objN == lz1Var) {
                        objN = new d44(bz7Var, 25, zndVar2);
                        e18Var2.k0(objN);
                    }
                    zy7 zy7Var = (zy7) objN;
                    e18 e18Var3 = e18Var2;
                    iqb iqbVar = iqbVarN;
                    h(zndVar2, false, zy7Var, iqbVar, true, e18Var3, 27704);
                    iqbVarN = iqbVar;
                    e18Var2 = e18Var3;
                }
                e18Var = e18Var2;
                e18Var.p(false);
            } else {
                e18Var2.a0(-1237027670);
                Object objN2 = e18Var2.N();
                if (objN2 == lz1Var) {
                    objN2 = new oob(19);
                    e18Var2.k0(objN2);
                }
                h(zndVar, true, (zy7) objN2, iqbVarN, false, e18Var2, ((i2 >> 6) & 14) | 28088);
                e18Var = e18Var2;
                e18Var.p(false);
            }
            e18Var.p(true);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ji(list, i, bz7Var, zndVar, 23);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(pz7 pz7Var, zy7 zy7Var, CreateTemplateProjectScreenParams createTemplateProjectScreenParams, iqb iqbVar, y85 y85Var, qi3 qi3Var, pl3 pl3Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        y85 y85Var2;
        qi3 qi3Var2;
        pl3 pl3Var2;
        y85 y85Var3;
        qi3 qi3Var3;
        int i3;
        pl3 pl3Var3;
        lz1 lz1Var;
        int i4;
        pl3 pl3Var4;
        pz7Var.getClass();
        zy7Var.getClass();
        createTemplateProjectScreenParams.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(460534595);
        if ((i & 6) == 0) {
            i2 = (e18Var2.h(pz7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.h(zy7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? e18Var2.f(createTemplateProjectScreenParams) : e18Var2.h(createTemplateProjectScreenParams) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.f(iqbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= 524288;
        }
        if (e18Var2.Q(i2 & 1, (599187 & i2) != 599186)) {
            e18Var2.V();
            int i5 = i & 1;
            int i6 = 3;
            tp4 tp4Var = null;
            lz1 lz1Var2 = jd4.a;
            if (i5 == 0 || e18Var2.A()) {
                int i7 = CreateTemplateProjectScreenParams.$stable | ((i2 >> 6) & 14);
                m7f m7fVar = (m7f) e18Var2.j(gr9.b);
                boolean zH = ((((i7 & 14) ^ 6) > 4 && e18Var2.f(createTemplateProjectScreenParams)) || (i7 & 6) == 4) | e18Var2.h(m7fVar);
                Object objN = e18Var2.N();
                if (zH || objN == lz1Var2) {
                    objN = new f25(createTemplateProjectScreenParams, i6, m7fVar);
                    e18Var2.k0(objN);
                }
                kce kceVar = jce.a;
                y85Var3 = (y85) fd9.r0(kceVar.b(y85.class), oq5.B(kceVar.b(y85.class)), (bz7) objN, e18Var2);
                m7f m7fVarN = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF = e18Var2.f(null) | e18Var2.f(m7fVarN);
                Object objN2 = e18Var2.N();
                if (zF || objN2 == lz1Var2) {
                    objN2 = m7fVarN.a(kceVar.b(qi3.class), null, null);
                    e18Var2.k0(objN2);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                qi3Var3 = (qi3) objN2;
                m7f m7fVarN2 = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF2 = e18Var2.f(null) | e18Var2.f(m7fVarN2);
                Object objN3 = e18Var2.N();
                if (zF2 || objN3 == lz1Var2) {
                    objN3 = m7fVarN2.a(kceVar.b(pl3.class), null, null);
                    e18Var2.k0(objN3);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                i3 = i2 & (-4186113);
                pl3Var3 = (pl3) objN3;
            } else {
                e18Var2.T();
                i3 = i2 & (-4186113);
                y85Var3 = y85Var;
                qi3Var3 = qi3Var;
                pl3Var3 = pl3Var;
            }
            e18Var2.q();
            boolean zH2 = e18Var2.h(qi3Var3);
            Object objN4 = e18Var2.N();
            if (zH2 || objN4 == lz1Var2) {
                objN4 = new gw(qi3Var3, tp4Var, 11);
                e18Var2.k0(objN4);
            }
            csg.g((bz7) objN4, e18Var2, 0, 1);
            gf8 gf8Var = (gf8) e18Var2.j(ve4.l);
            zy1 zy1Var = y85Var3.j;
            boolean zH3 = ((i3 & 14) == 4) | e18Var2.h(pl3Var3) | e18Var2.h(gf8Var);
            Object objN5 = e18Var2.N();
            if (zH3 || objN5 == lz1Var2) {
                lz1Var = lz1Var2;
                i4 = 0;
                objN5 = new qq0(pl3Var3, gf8Var, pz7Var, tp4Var, 15);
                pl3Var4 = pl3Var3;
                e18Var2.k0(objN5);
            } else {
                pl3Var4 = pl3Var3;
                lz1Var = lz1Var2;
                i4 = 0;
            }
            x44.b(zy1Var, (pz7) objN5, e18Var2, i4);
            Object objN6 = e18Var2.N();
            if (objN6 == lz1Var) {
                objN6 = sq6.p(e18Var2);
            }
            ybg ybgVar = (ybg) objN6;
            zni.g(y85Var3.k, ybgVar, e18Var2, 48);
            boolean z = y85Var3.O() == o75.F ? 1 : i4;
            boolean zF3 = e18Var2.f(y85Var3);
            Object objN7 = e18Var2.N();
            if (zF3 || objN7 == lz1Var) {
                objN7 = new x85(y85Var3, 1);
                e18Var2.k0(objN7);
            }
            yb5.c(i4, i4, e18Var2, (zy7) objN7, z);
            boolean zEquals = dbj.a(e18Var2).a.a().equals(rbj.b);
            e18Var = e18Var2;
            v40.b(null, null, fd9.q0(-1452904122, new f44(iqbVar, y85Var3, zy7Var, 23), e18Var2), fd9.q0(1777095943, new xb2(zEquals, y85Var3, 3), e18Var2), fd9.q0(712128712, new rn(ybgVar, 10), e18Var2), null, 0, 0L, 0L, null, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(556201081, new tw(y85Var3, iqbVar, zEquals, 5), e18Var2), e18Var, 28032, 2019);
            qi3Var2 = qi3Var3;
            y85Var2 = y85Var3;
            pl3Var2 = pl3Var4;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            y85Var2 = y85Var;
            qi3Var2 = qi3Var;
            pl3Var2 = pl3Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new yu(pz7Var, zy7Var, createTemplateProjectScreenParams, iqbVar, y85Var2, qi3Var2, pl3Var2, i);
        }
    }

    public static final void g(y85 y85Var, ld4 ld4Var, int i) {
        String strN;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1359358320);
        int i2 = 2;
        int i3 = (e18Var.f(y85Var) ? 4 : 2) | i;
        if (e18Var.Q(i3 & 1, (i3 & 3) != 2)) {
            int iOrdinal = y85Var.O().ordinal();
            if (iOrdinal == 0) {
                strN = vb7.n(e18Var, 673293378, R.string.generic_button_continue, e18Var, false);
            } else {
                if (iOrdinal != 1) {
                    throw ebh.u(e18Var, 673290918, false);
                }
                strN = vb7.n(e18Var, 673296426, R.string.project_create_submit_button_text, e18Var, false);
            }
            boolean zBooleanValue = ((Boolean) y85Var.q.getValue()).booleanValue();
            boolean zBooleanValue2 = ((Boolean) y85Var.p.getValue()).booleanValue();
            iqb iqbVarK = gb9.K(b.c(fqb.E, 1.0f), 24.0f, 16.0f);
            boolean z = (i3 & 14) == 4;
            Object objN = e18Var.N();
            if (z || objN == jd4.a) {
                objN = new x85(y85Var, i2);
                e18Var.k0(objN);
            }
            dxj.a(strN, zBooleanValue2, iqbVarK, zBooleanValue, null, null, null, 0L, (zy7) objN, e18Var, 384, 240);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new mk4(y85Var, i, 8);
        }
    }

    public static final void h(znd zndVar, boolean z, zy7 zy7Var, iqb iqbVar, boolean z2, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1898282267);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var2.f(zndVar) : e18Var2.h(zndVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.f(iqbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var2.g(z2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if (e18Var2.Q(i2 & 1, (i2 & 9363) != 9362)) {
            e18Var = e18Var2;
            pzg.a(gb9.i(iqbVar, null, 3), gm3.b(e18Var2).h, gm3.a(e18Var2).o, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, sf5.a(z ? 1.0f : MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var2).u), fd9.q0(-696808214, new iv(zy7Var, z2, zndVar, 13), e18Var2), e18Var, 12582912, 56);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ey3(zndVar, z, zy7Var, iqbVar, z2, i, 2);
        }
    }

    public static final void i(String str, boolean z, boolean z2, bz7 bz7Var, ld4 ld4Var, int i) {
        str.getClass();
        bz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(101235838);
        int i2 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.g(z) ? 32 : 16) | (e18Var.g(z2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(bz7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
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
            d4c.i0(e18Var, cd4.f, q64VarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            String strJ0 = d4c.j0(R.string.project_create_screen_project_visibility_section_label, e18Var);
            tkh tkhVar = ((jm3) gm3.c(e18Var).e.E).h;
            long j = gm3.a(e18Var).M;
            iqb iqbVarN = gb9.N(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, 7);
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = new qy4(5);
                e18Var.k0(objN);
            }
            tjh.b(strJ0, tjf.a(iqbVarN, (bz7) objN), j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar, e18Var, 0, 0, 131064);
            e18Var = e18Var;
            uik.g(str, z, bz7Var, b.c(fqbVar, 1.0f), d4c.j0(R.string.project_create_screen_project_visibility_section_label, e18Var), z2, false, e18Var, (i2 & 14) | 3072 | (i2 & 112) | ((i2 >> 3) & 896) | ((i2 << 9) & 458752), 64);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new q32(str, z, z2, bz7Var, i, 5);
        }
    }

    public static long j(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public static final o5l k(o5l o5lVar, bz7 bz7Var) {
        ClipData clipData = ((mp3) o5lVar.G).a;
        if (clipData.getItemCount() == 1) {
            if (((Boolean) bz7Var.invoke(clipData.getItemAt(0))).booleanValue()) {
                return null;
            }
            return o5lVar;
        }
        int itemCount = clipData.getItemCount();
        ArrayList arrayList = null;
        for (int i = 0; i < itemCount; i++) {
            ClipData.Item itemAt = clipData.getItemAt(i);
            if (!((Boolean) bz7Var.invoke(itemAt)).booleanValue()) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(itemAt);
            }
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList.size() != clipData.getItemCount()) {
                ClipDescription clipDescription = new ClipDescription(((np3) o5lVar.H).a);
                ClipData clipData2 = new ClipData(clipDescription, (ClipData.Item) w44.L0(arrayList));
                int size = arrayList.size();
                for (int i2 = 1; i2 < size; i2++) {
                    clipData2.addItem((ClipData.Item) arrayList.get(i2));
                }
                return new o5l(new mp3(clipData2), new np3(clipDescription), o5lVar.F, (b6d) o5lVar.I);
            }
            return o5lVar;
        }
        return null;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final int m(long j) {
        return (int) (j & 4294967295L);
    }

    public static final int n(long j) {
        return (int) (j >> 32);
    }

    public static final String o(SdkEvent sdkEvent) {
        sdkEvent.getClass();
        if (sdkEvent instanceof SdkMessageEvent) {
            return ((SdkMessageEvent) sdkEvent).getUuid();
        }
        if (sdkEvent instanceof SdkResultEvent) {
            return ((SdkResultEvent) sdkEvent).getUuid();
        }
        if (sdkEvent instanceof SdkSystemEvent) {
            return ((SdkSystemEvent) sdkEvent).getUuid();
        }
        if (sdkEvent instanceof SdkEnvManagerLogEvent) {
            return ((SdkEnvManagerLogEvent) sdkEvent).getUuid();
        }
        if (sdkEvent instanceof SdkToolProgressEvent) {
            return ((SdkToolProgressEvent) sdkEvent).getUuid();
        }
        if (sdkEvent instanceof SdkToolUseSummaryEvent) {
            return ((SdkToolUseSummaryEvent) sdkEvent).getUuid();
        }
        if (sdkEvent instanceof SdkControlResponseEvent) {
            return ((SdkControlResponseEvent) sdkEvent).getUuid();
        }
        if (sdkEvent instanceof SdkRateLimitEvent) {
            return ((SdkRateLimitEvent) sdkEvent).getUuid();
        }
        if (sdkEvent instanceof SdkPromptSuggestionEvent) {
            return ((SdkPromptSuggestionEvent) sdkEvent).getUuid();
        }
        if (!(sdkEvent instanceof SdkControlRequestEvent) && !(sdkEvent instanceof SdkControlCancelRequestEvent) && !(sdkEvent instanceof SdkStreamEvent) && !(sdkEvent instanceof SdkUnknownEvent)) {
            wg6.i();
        }
        return null;
    }

    public static final boolean p(o5l o5lVar) {
        return ((np3) o5lVar.H).a.hasMimeType("image/*");
    }

    public static int q(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static final boolean r(SdkControlRequestEvent sdkControlRequestEvent) {
        sdkControlRequestEvent.getClass();
        JsonElement request = sdkControlRequestEvent.getRequest();
        String content = null;
        JsonObject jsonObject = request instanceof JsonObject ? (JsonObject) request : null;
        JsonElement jsonElement = jsonObject != null ? (JsonElement) jsonObject.get((Object) "subtype") : null;
        JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
        if (jsonPrimitive != null) {
            if (!jsonPrimitive.isString()) {
                jsonPrimitive = null;
            }
            if (jsonPrimitive != null) {
                content = jsonPrimitive.getContent();
            }
        }
        return x44.r(content, "request_user_dialog");
    }

    public static final String s(mp3 mp3Var) {
        ClipData clipData = mp3Var.a;
        ClipData clipData2 = mp3Var.a;
        int itemCount = clipData.getItemCount();
        boolean z = false;
        for (int i = 0; i < itemCount; i++) {
            z = z || clipData2.getItemAt(i).getText() != null;
        }
        if (!z) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int itemCount2 = clipData2.getItemCount();
        boolean z2 = false;
        for (int i2 = 0; i2 < itemCount2; i2++) {
            CharSequence text = clipData2.getItemAt(i2).getText();
            if (text != null) {
                if (z2) {
                    sb.append("\n");
                }
                sb.append(text);
                z2 = true;
            }
        }
        return sb.toString();
    }

    public static final ade t(SdkSystemEvent sdkSystemEvent) {
        String original_model;
        String fallback_model;
        sdkSystemEvent.getClass();
        String str = null;
        if (x44.r(sdkSystemEvent.getSubtype(), "model_refusal_fallback") && (original_model = sdkSystemEvent.getOriginal_model()) != null) {
            if (bsg.I0(original_model)) {
                original_model = null;
            }
            if (original_model != null && (fallback_model = sdkSystemEvent.getFallback_model()) != null) {
                if (bsg.I0(fallback_model)) {
                    fallback_model = null;
                }
                if (fallback_model != null) {
                    String api_refusal_category = sdkSystemEvent.getApi_refusal_category();
                    if (api_refusal_category == null || bsg.I0(api_refusal_category)) {
                        api_refusal_category = null;
                    }
                    String api_refusal_explanation = sdkSystemEvent.getApi_refusal_explanation();
                    if (api_refusal_explanation != null && !bsg.I0(api_refusal_explanation)) {
                        str = api_refusal_explanation;
                    }
                    return new ade(original_model, fallback_model, api_refusal_category, str);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.cde u(com.anthropic.claude.sessions.types.SdkControlRequestEvent r4) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvk.u(com.anthropic.claude.sessions.types.SdkControlRequestEvent):cde");
    }
}
