package com.anthropic.claude.chat;

import android.content.Context;
import android.view.View;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.analytics.events.ChatEvents$AttachmentSource;
import com.anthropic.claude.api.account.VillageWeaverConsentState;
import com.anthropic.claude.api.chat.InputMode;
import com.anthropic.claude.chat.ChatScreenOverlay;
import com.anthropic.claude.chat.ChatScreenParams;
import com.anthropic.claude.chat.bottomsheet.ChatScreenArtifactSheetDestination;
import com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination;
import com.anthropic.claude.chat.bottomsheet.model.ModelSelectorBottomSheetDestination;
import com.anthropic.claude.chat.bottomsheet.options.ChatOptionsBottomSheetDestination;
import com.anthropic.claude.chat.bottomsheet.options.n;
import com.anthropic.claude.chat.bottomsheet.x0;
import com.anthropic.claude.chat.dialogs.ChatScreenDialog;
import com.anthropic.claude.chat.e;
import com.anthropic.claude.chat.f;
import com.anthropic.claude.tasks.ui.TasksBottomSheetDestination;
import com.anthropic.claude.tasks.ui.q;
import com.anthropic.claude.tool.model.SuggestConnectorsOutputConnectorsItem;
import com.anthropic.claude.types.strings.ArtifactIdentifier;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.a2;
import defpackage.a83;
import defpackage.ab0;
import defpackage.ad9;
import defpackage.aw1;
import defpackage.b13;
import defpackage.b83;
import defpackage.bl2;
import defpackage.bt7;
import defpackage.bz7;
import defpackage.c4a;
import defpackage.c83;
import defpackage.csg;
import defpackage.cx;
import defpackage.d4c;
import defpackage.d83;
import defpackage.dch;
import defpackage.di4;
import defpackage.dlf;
import defpackage.dm;
import defpackage.e18;
import defpackage.e83;
import defpackage.eli;
import defpackage.es0;
import defpackage.eve;
import defpackage.ez1;
import defpackage.f13;
import defpackage.f23;
import defpackage.f4j;
import defpackage.f83;
import defpackage.f9;
import defpackage.fd9;
import defpackage.fk0;
import defpackage.fx2;
import defpackage.g73;
import defpackage.gb9;
import defpackage.gj1;
import defpackage.go4;
import defpackage.gr9;
import defpackage.h86;
import defpackage.hi4;
import defpackage.hr0;
import defpackage.hvd;
import defpackage.hw2;
import defpackage.i33;
import defpackage.i73;
import defpackage.ia0;
import defpackage.idi;
import defpackage.iei;
import defpackage.ij0;
import defpackage.im6;
import defpackage.iqb;
import defpackage.isc;
import defpackage.iv1;
import defpackage.j1j;
import defpackage.j8;
import defpackage.j83;
import defpackage.j9f;
import defpackage.jce;
import defpackage.jd4;
import defpackage.jm9;
import defpackage.k63;
import defpackage.k73;
import defpackage.ka1;
import defpackage.kc;
import defpackage.kg3;
import defpackage.kgh;
import defpackage.koi;
import defpackage.l45;
import defpackage.l4h;
import defpackage.l5h;
import defpackage.l73;
import defpackage.l80;
import defpackage.l83;
import defpackage.ld4;
import defpackage.lm6;
import defpackage.loi;
import defpackage.lsc;
import defpackage.lvh;
import defpackage.m4a;
import defpackage.m73;
import defpackage.m7f;
import defpackage.ml3;
import defpackage.mpk;
import defpackage.mr9;
import defpackage.mwa;
import defpackage.n0;
import defpackage.n33;
import defpackage.n63;
import defpackage.n73;
import defpackage.nai;
import defpackage.nf1;
import defpackage.ng8;
import defpackage.nn1;
import defpackage.nwb;
import defpackage.o5;
import defpackage.o63;
import defpackage.od9;
import defpackage.op3;
import defpackage.oq5;
import defpackage.ov2;
import defpackage.ow1;
import defpackage.p59;
import defpackage.p73;
import defpackage.pb2;
import defpackage.pl3;
import defpackage.ps7;
import defpackage.py;
import defpackage.pz7;
import defpackage.q7;
import defpackage.qi3;
import defpackage.qoi;
import defpackage.r4g;
import defpackage.r63;
import defpackage.r7e;
import defpackage.rwe;
import defpackage.rx2;
import defpackage.rzd;
import defpackage.s63;
import defpackage.skk;
import defpackage.sq6;
import defpackage.t4g;
import defpackage.t53;
import defpackage.t63;
import defpackage.tda;
import defpackage.tp4;
import defpackage.u00;
import defpackage.u13;
import defpackage.u4g;
import defpackage.u53;
import defpackage.um2;
import defpackage.uz7;
import defpackage.v40;
import defpackage.vb7;
import defpackage.ve4;
import defpackage.vm2;
import defpackage.vv2;
import defpackage.w00;
import defpackage.w53;
import defpackage.w73;
import defpackage.wv2;
import defpackage.x0a;
import defpackage.x13;
import defpackage.x44;
import defpackage.x70;
import defpackage.xc3;
import defpackage.xrk;
import defpackage.y73;
import defpackage.ybg;
import defpackage.yfd;
import defpackage.z09;
import defpackage.z73;
import defpackage.zw;
import defpackage.zy1;
import defpackage.zy7;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20, types: [hw2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24, types: [hw2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r13v1, types: [e18, ld4] */
    /* JADX WARN: Type inference failed for: r13v10, types: [e18, ld4] */
    /* JADX WARN: Type inference failed for: r13v12, types: [ld4] */
    /* JADX WARN: Type inference failed for: r13v13, types: [e18, ld4] */
    /* JADX WARN: Type inference failed for: r13v14, types: [e18] */
    /* JADX WARN: Type inference failed for: r13v15, types: [e18, ld4] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2, types: [e18] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v9, types: [e18] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [hw2] */
    /* JADX WARN: Type inference failed for: r14v46 */
    /* JADX WARN: Type inference failed for: r14v47, types: [hw2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v72 */
    /* JADX WARN: Type inference failed for: r14v73, types: [hw2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v75 */
    /* JADX WARN: Type inference failed for: r14v76 */
    /* JADX WARN: Type inference failed for: r14v85 */
    /* JADX WARN: Type inference failed for: r33v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r33v14 */
    /* JADX WARN: Type inference failed for: r33v15 */
    /* JADX WARN: Type inference failed for: r33v16 */
    /* JADX WARN: Type inference failed for: r33v8, types: [hw2] */
    /* JADX WARN: Type inference failed for: r35v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v25, types: [hw2] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r73v0 */
    /* JADX WARN: Type inference failed for: r7v95, types: [hw2] */
    /* JADX WARN: Type inference failed for: r90v20, types: [hw2] */
    /* JADX WARN: Type inference failed for: r90v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r93v16, types: [ld4] */
    /* JADX WARN: Type inference failed for: r93v17, types: [ld4] */
    /* JADX WARN: Type inference failed for: r93v18, types: [ld4] */
    public static final void a(final ChatScreenParams chatScreenParams, final ml3 ml3Var, final zy7 zy7Var, final bz7 bz7Var, final zy7 zy7Var2, final zy7 zy7Var3, final bz7 bz7Var2, final uz7 uz7Var, final iqb iqbVar, final zy7 zy7Var4, final zy7 zy7Var5, final bz7 bz7Var3, t53 t53Var, hw2 hw2Var, fk0 fk0Var, h86 h86Var, qi3 qi3Var, pl3 pl3Var, ld4 ld4Var, final int i) {
        int i2;
        bz7 bz7Var4;
        t53 t53Var2;
        final ?? r14;
        final fk0 fk0Var2;
        final h86 h86Var2;
        final qi3 qi3Var2;
        final pl3 pl3Var2;
        ?? r13;
        t53 t53VarA;
        hw2 hw2Var2;
        rzd rzdVar;
        hw2 hw2Var3;
        qi3 qi3Var3;
        pl3 pl3Var3;
        int i3;
        fk0 fk0Var3;
        h86 h86Var3;
        t53 t53Var3;
        Context context;
        int i4;
        pl3 pl3Var4;
        View view;
        tp4 tp4Var;
        ?? r12;
        int i5;
        gj1 gj1Var;
        ?? r142;
        t53 t53Var4;
        uz7 uz7Var2;
        zy1 zy1Var;
        zy7 zy7Var6;
        int i6;
        fk0 fk0Var4;
        t4g t4gVar;
        nwb nwbVar;
        nwb nwbVar2;
        rwe rweVar;
        t53 t53Var5;
        t4g t4gVar2;
        ?? r122;
        pl3 pl3Var5;
        bt7 bt7Var;
        qi3 qi3Var4;
        int i7;
        View view2;
        ?? r132;
        ChatScreenParams chatScreenParams2;
        l45 l45Var;
        t53 t53Var6;
        ?? r0;
        bt7 bt7Var2;
        ?? r143;
        t4g t4gVar3;
        lsc lscVar;
        j9f j9fVar;
        ps7 ps7Var;
        tp4 tp4Var2;
        z09 z09Var;
        lsc lscVar2;
        l45 l45Var2;
        zy1 zy1Var2;
        f4j f4jVar;
        bl2 bl2Var;
        rwe rweVar2;
        ng8 ng8VarX;
        um2 um2VarB;
        ?? r123;
        ?? r133;
        bz7 bz7Var5;
        ?? r33;
        chatScreenParams.getClass();
        zy7Var.getClass();
        bz7Var.getClass();
        zy7Var2.getClass();
        zy7Var3.getClass();
        bz7Var2.getClass();
        uz7Var.getClass();
        ?? r134 = (e18) ld4Var;
        r134.c0(1558614012);
        if ((i & 6) == 0) {
            i2 = (r134.f(chatScreenParams) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? r134.f(ml3Var) : r134.h(ml3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= r134.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            bz7Var4 = bz7Var;
            i2 |= r134.h(bz7Var4) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        } else {
            bz7Var4 = bz7Var;
        }
        if ((i & 24576) == 0) {
            i2 |= r134.h(zy7Var2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((i & 196608) == 0) {
            i2 |= r134.h(zy7Var3) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= r134.h(bz7Var2) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= r134.h(uz7Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= r134.f(iqbVar) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= r134.h(zy7Var4) ? 536870912 : 268435456;
        }
        int i8 = (r134.h(zy7Var5) ? (char) 4 : (char) 2) | (r134.h(bz7Var3) ? ' ' : (char) 16) | 4793472;
        if (r134.Q(i2 & 1, ((i2 & 306783379) == 306783378 && (i8 & 4793491) == 4793490) ? false : true)) {
            r134.V();
            int i9 = i & 1;
            Object obj = jd4.a;
            if (i9 == 0 || r134.A()) {
                t53VarA = u53.a(chatScreenParams, r134, i2 & 14);
                hw2 hw2VarS = yfd.S(chatScreenParams.getCreatedAsNewChat(), chatScreenParams.m591getChatIdRjYBDck(), chatScreenParams.m593getProjectIdvfJkQ(), r134);
                r134.a0(-1168520582);
                m7f m7fVarB = gr9.b(r134);
                r134.a0(-1633490746);
                boolean zF = r134.f(null) | r134.f(m7fVarB);
                Object objN = r134.N();
                if (zF || objN == obj) {
                    hw2Var2 = hw2VarS;
                    rzdVar = null;
                    objN = ij0.f(fk0.class, m7fVarB, null, r134);
                } else {
                    hw2Var2 = hw2VarS;
                    rzdVar = null;
                }
                r134.r();
                r134.r();
                fk0 fk0Var5 = (fk0) objN;
                m7f m7fVarN = sq6.n(r134, -1168520582, r134, -1633490746);
                boolean zF2 = r134.f(rzdVar) | r134.f(m7fVarN);
                Object objN2 = r134.N();
                if (zF2 || objN2 == obj) {
                    objN2 = ij0.f(h86.class, m7fVarN, rzdVar, r134);
                }
                r134.r();
                r134.r();
                h86 h86Var4 = (h86) objN2;
                m7f m7fVarN2 = sq6.n(r134, -1168520582, r134, -1633490746);
                boolean zF3 = r134.f(rzdVar) | r134.f(m7fVarN2);
                Object objN3 = r134.N();
                if (zF3 || objN3 == obj) {
                    objN3 = ij0.f(qi3.class, m7fVarN2, rzdVar, r134);
                }
                r134.r();
                r134.r();
                qi3 qi3Var5 = (qi3) objN3;
                m7f m7fVarN3 = sq6.n(r134, -1168520582, r134, -1633490746);
                boolean zF4 = r134.f(rzdVar) | r134.f(m7fVarN3);
                Object objN4 = r134.N();
                if (zF4 || objN4 == obj) {
                    objN4 = ij0.f(pl3.class, m7fVarN3, rzdVar, r134);
                }
                r134.r();
                r134.r();
                hw2Var3 = hw2Var2;
                qi3Var3 = qi3Var5;
                pl3Var3 = (pl3) objN4;
                i3 = i8 & (-33554305);
                fk0Var3 = fk0Var5;
                h86Var3 = h86Var4;
            } else {
                r134.T();
                hw2Var3 = hw2Var;
                fk0Var3 = fk0Var;
                h86Var3 = h86Var;
                qi3Var3 = qi3Var;
                pl3Var3 = pl3Var;
                i3 = i8 & (-33554305);
                t53VarA = t53Var;
            }
            r134.q();
            Context context2 = (Context) r134.j(w00.b);
            Object objN5 = r134.N();
            if (objN5 == obj) {
                objN5 = fd9.O(im6.E, r134);
                r134.k0(objN5);
            }
            l45 l45Var3 = (l45) objN5;
            ad9 ad9VarA = rx2.a();
            b13 b13VarU0 = t53VarA.U0();
            zy1 zy1Var3 = t53VarA.j0;
            od9.a(ad9VarA, b13VarU0.b(), Integer.valueOf(((Number) t53VarA.y1.getValue()).intValue()), null, r134, 0, 8);
            d(t53VarA, r134, 0);
            od9.a(rx2.b, !(t53VarA.d1() || ((Boolean) t53VarA.B0().v.getValue()).booleanValue() || t53VarA.B0().k() <= 0) || ((Boolean) t53VarA.B0().t.getValue()).booleanValue(), Integer.valueOf(t53VarA.B0().k()), null, r134, 0, 8);
            boolean zBooleanValue = ((Boolean) r134.j(p59.a())).booleanValue();
            Boolean bool = (Boolean) t53VarA.d2.getValue();
            bool.getClass();
            Boolean bool2 = (Boolean) t53VarA.g2.getValue();
            bool2.getClass();
            boolean zG = r134.g(zBooleanValue) | r134.f(t53VarA) | r134.h(context2);
            int i10 = i2 & 14;
            int i11 = i2;
            boolean z = ((i2 & 7168) == 2048) | zG | (i10 == 4) | ((i2 & 57344) == 16384);
            Object objN6 = r134.N();
            if (z || objN6 == obj) {
                t53 t53Var7 = t53VarA;
                objN6 = new o63(zBooleanValue, t53Var7, context2, chatScreenParams, zy7Var2, bz7Var4);
                t53Var3 = t53Var7;
                context = context2;
                r134.k0(objN6);
            } else {
                context = context2;
                t53Var3 = t53VarA;
            }
            t53 t53Var8 = t53Var3;
            mwa.f(t53Var8, bool, bool2, null, (bz7) objN6, r134, 0);
            boolean zF5 = r134.f(t53Var8);
            Object objN7 = r134.N();
            if (zF5 || objN7 == obj) {
                i4 = 0;
                objN7 = new w73(t53Var8, null, i4);
                r134.k0(objN7);
            } else {
                i4 = 0;
            }
            csg.g((bz7) objN7, r134, i4, 1);
            View view3 = (View) r134.j(w00.f);
            boolean zF6 = r134.f(t53Var8) | r134.h(pl3Var3) | r134.h(view3);
            Object objN8 = r134.N();
            if (zF6 || objN8 == obj) {
                pl3 pl3Var6 = pl3Var3;
                objN8 = new cx(t53Var8, pl3Var6, view3, (tp4) null, 8);
                pl3Var4 = pl3Var6;
                view = view3;
                tp4Var = null;
                r134.k0(objN8);
            } else {
                view = view3;
                pl3Var4 = pl3Var3;
                tp4Var = null;
            }
            fd9.i(r134, (pz7) objN8, t53Var8);
            boolean zF7 = r134.f(t53Var8) | r134.h(hw2Var3) | (i10 == 4);
            Object objN9 = r134.N();
            if (zF7 || objN9 == obj) {
                hw2 hw2Var4 = hw2Var3;
                objN9 = new zw(t53Var8, hw2Var4, chatScreenParams, tp4Var, 3);
                r12 = hw2Var4;
                r134.k0(objN9);
            } else {
                r12 = hw2Var3;
            }
            fd9.j(t53Var8, r12, (pz7) objN9, r134);
            boolean zF8 = r134.f(t53Var8);
            Object objN10 = r134.N();
            if (zF8 || objN10 == obj) {
                i5 = i10;
                objN10 = new n33(t53Var8, null, 1);
                r134.k0(objN10);
            } else {
                i5 = i10;
            }
            nai.e(r12, (pz7) objN10, r134, 8);
            boolean zH = r134.h(r12);
            Object objN11 = r134.N();
            int i12 = 14;
            if (zH || objN11 == obj) {
                objN11 = new ov2(r12, i12);
                r134.k0(objN11);
            }
            nwb nwbVarJ0 = r12.j0((zy7) objN11, r134, 64);
            pl3 pl3Var7 = pl3Var4;
            m7f m7fVarN4 = sq6.n(r134, -1168520582, r134, -1633490746);
            boolean zF9 = r134.f(null) | r134.f(m7fVarN4);
            Object objN12 = r134.N();
            if (zF9 || objN12 == obj) {
                objN12 = ij0.f(gj1.class, m7fVarN4, null, r134);
            }
            r134.r();
            r134.r();
            gj1 gj1Var2 = (gj1) objN12;
            int i13 = i11 & 29360128;
            boolean zH2 = r134.h(gj1Var2) | r134.h(r12) | r134.f(t53Var8) | (i13 == 8388608);
            Object objN13 = r134.N();
            if (zH2 || objN13 == obj) {
                ?? r90 = r12;
                objN13 = new r63(gj1Var2, r90, t53Var8, uz7Var, 0);
                gj1Var = gj1Var2;
                r142 = r90;
                t53Var4 = t53Var8;
                uz7Var2 = uz7Var;
                r134.k0(objN13);
            } else {
                gj1Var = gj1Var2;
                r142 = r12;
                t53Var4 = t53Var8;
                uz7Var2 = uz7Var;
            }
            View view4 = view;
            nwb nwbVarJ02 = r142.j0((zy7) objN13, r134, 64);
            fx2 fx2VarL0 = t53Var4.L0();
            if (fx2VarL0 == null) {
                fx2VarL0 = null;
            }
            xc3 xc3Var = fx2VarL0 != null ? fx2VarL0.a : null;
            Context context3 = context;
            if (xc3Var == null) {
                r134.a0(-214659994);
                r134.r();
                zy1Var = zy1Var3;
            } else {
                r134.a0(-214659993);
                boolean zF10 = r134.f(t53Var4);
                Object objN14 = r134.N();
                if (zF10 || objN14 == obj) {
                    zy1Var = zy1Var3;
                    objN14 = new i33(t53Var4, 5);
                    r134.k0(objN14);
                } else {
                    zy1Var = zy1Var3;
                }
                nai.a(0, 1, r134, (zy7) objN14, false);
                boolean zF11 = r134.f(xc3Var);
                Object objN15 = r134.N();
                if (zF11 || objN15 == obj) {
                    objN15 = new a2(6, xc3Var);
                    r134.k0(objN15);
                }
                mwa.h(xc3Var, null, (bz7) objN15, r134, 0);
                r134.r();
            }
            boolean zH3 = r134.h(h86Var3) | r134.h(r142) | ((i11 & 112) == 32 || ((i11 & 64) != 0 && r134.h(ml3Var)));
            Object objN16 = r134.N();
            if (zH3 || objN16 == obj) {
                objN16 = new ka1(h86Var3, ml3Var, r142, 2);
                r134.k0(objN16);
            }
            zy7 zy7Var7 = (zy7) objN16;
            Object objN17 = r134.N();
            if (objN17 == obj) {
                objN17 = new w53(5);
                r134.k0(objN17);
            }
            rwe rweVarP = eve.P(jce.a(ChatScreenDialog.class), oq5.B(jce.a(ChatScreenDialog.class)), true, iv1.M(jce.a(ChatScreenDialog.class)), (zy7) objN17, r134);
            x44.q0(rweVarP, r134);
            boolean zF12 = r134.f(t53Var4) | r134.h(fk0Var3) | r134.h(r142) | r134.f(nwbVarJ0);
            Object objN18 = r134.N();
            if (zF12 || objN18 == obj) {
                objN18 = new r63(t53Var4, fk0Var3, r142, nwbVarJ0);
                r134.k0(objN18);
            }
            com.anthropic.claude.chat.dialogs.d.a(chatScreenParams, t53Var4, rweVarP, (zy7) objN18, null, r134, i5);
            int i14 = i5;
            Object objN19 = r134.N();
            if (objN19 == obj) {
                objN19 = mpk.P(u4g.F);
                r134.k0(objN19);
            }
            final nwb nwbVar3 = (nwb) objN19;
            ChatOptionsBottomSheetDestination.Closed closed = ChatOptionsBottomSheetDestination.Closed.INSTANCE;
            u4g u4gVar = (u4g) nwbVar3.getValue();
            String strB = oq5.B(jce.a(ChatOptionsBottomSheetDestination.class));
            h86 h86Var5 = h86Var3;
            Object objN20 = r134.N();
            if (objN20 == obj) {
                zy7Var6 = zy7Var7;
                objN20 = new l73(closed, 0);
                r134.k0(objN20);
            } else {
                zy7Var6 = zy7Var7;
            }
            rwe rweVarP2 = eve.P(jce.a(ChatOptionsBottomSheetDestination.class), strB, true, iv1.M(jce.a(ChatOptionsBottomSheetDestination.class)), (zy7) objN20, r134);
            x44.q0(rweVarP2, r134);
            r4g r4gVarS = gb9.S(u4gVar, null, null, new m73(rweVarP2, closed, 0), r134, 0, 6);
            boolean zF13 = r134.f(rweVarP2) | r134.f(r4gVarS);
            Object objN21 = r134.N();
            if (zF13 || objN21 == obj) {
                objN21 = new t4g(rweVarP2, r4gVarS);
                r134.k0(objN21);
            }
            t4g t4gVar4 = (t4g) objN21;
            ModelSelectorBottomSheetDestination.Closed closed2 = ModelSelectorBottomSheetDestination.Closed.INSTANCE;
            String strB2 = oq5.B(jce.a(ModelSelectorBottomSheetDestination.class));
            Object objN22 = r134.N();
            if (objN22 == obj) {
                objN22 = new l73(closed2, 1);
                r134.k0(objN22);
            }
            rwe rweVarP3 = eve.P(jce.a(ModelSelectorBottomSheetDestination.class), strB2, true, iv1.M(jce.a(ModelSelectorBottomSheetDestination.class)), (zy7) objN22, r134);
            x44.q0(rweVarP3, r134);
            m73 m73Var = new m73(rweVarP3, closed2, 1);
            u4g u4gVar2 = u4g.E;
            r4g r4gVarS2 = gb9.S(u4gVar2, null, null, m73Var, r134, 6, 6);
            boolean zF14 = r134.f(rweVarP3) | r134.f(r4gVarS2);
            Object objN23 = r134.N();
            if (zF14 || objN23 == obj) {
                objN23 = new t4g(rweVarP3, r4gVarS2);
                r134.k0(objN23);
            }
            t4g t4gVar5 = (t4g) objN23;
            final l5h l5hVarL = v40.L(r134);
            TasksBottomSheetDestination.Closed closed3 = TasksBottomSheetDestination.Closed.INSTANCE;
            String strB3 = oq5.B(jce.a(TasksBottomSheetDestination.class));
            Object objN24 = r134.N();
            if (objN24 == obj) {
                i6 = i14;
                objN24 = new l73(closed3, 2);
                r134.k0(objN24);
            } else {
                i6 = i14;
            }
            rwe rweVarP4 = eve.P(jce.a(TasksBottomSheetDestination.class), strB3, true, iv1.M(jce.a(TasksBottomSheetDestination.class)), (zy7) objN24, r134);
            x44.q0(rweVarP4, r134);
            r4g r4gVarS3 = gb9.S(u4gVar2, null, null, new m73(rweVarP4, closed3, 2), r134, 6, 6);
            boolean zF15 = r134.f(rweVarP4) | r134.f(r4gVarS3);
            Object objN25 = r134.N();
            if (zF15 || objN25 == obj) {
                objN25 = new t4g(rweVarP4, r4gVarS3);
                r134.k0(objN25);
            }
            final t4g t4gVar6 = (t4g) objN25;
            Object objN26 = r134.N();
            if (objN26 == obj) {
                objN26 = ij0.d(r134);
            }
            bt7 bt7Var3 = (bt7) objN26;
            boolean zH4 = r134.h(r142);
            Object objN27 = r134.N();
            if (zH4 || objN27 == obj) {
                objN27 = new vv2(r142, 1);
                r134.k0(objN27);
            }
            l4h l4hVarM = u00.M(r134, (bz7) objN27);
            if (t53Var4.K0()) {
                r134.a0(-212370984);
                if (t53Var4.d1()) {
                    r134.a0(-212251231);
                    String strC0 = t53Var4.C0();
                    boolean zH5 = r134.h(t4gVar4) | r134.h(t4gVar5);
                    Object objN28 = r134.N();
                    if (zH5 || objN28 == obj) {
                        objN28 = new py(t4gVar4, t4gVar5, bt7Var3, null, 1);
                        t4gVar = t4gVar5;
                        bt7Var = bt7Var3;
                        r134.k0(objN28);
                    } else {
                        t4gVar = t4gVar5;
                        bt7Var = bt7Var3;
                    }
                    bz7 bz7Var6 = (bz7) objN28;
                    boolean zH6 = r134.h(t4gVar4) | r134.h(l4hVarM);
                    Object objN29 = r134.N();
                    if (zH6 || objN29 == obj) {
                        bz7Var5 = bz7Var6;
                        objN29 = new l80(t4gVar4, 10, l4hVarM);
                        r134.k0(objN29);
                    } else {
                        bz7Var5 = bz7Var6;
                    }
                    zy7 zy7Var8 = (zy7) objN29;
                    boolean zH7 = r134.h(t4gVar4) | r134.f(t53Var4) | r134.h(rweVarP) | r134.h(fk0Var3) | r134.h(r142) | r134.f(nwbVarJ0);
                    Object objN30 = r134.N();
                    if (zH7 || objN30 == obj) {
                        t53 t53Var9 = t53Var4;
                        ?? r35 = r142;
                        objN30 = new s63(t4gVar4, t53Var9, rweVarP, fk0Var3, r35, nwbVarJ0, 0);
                        t4gVar2 = t4gVar4;
                        t53Var5 = t53Var9;
                        rweVar = rweVarP;
                        r33 = r35;
                        nwbVar2 = nwbVarJ0;
                        r134.k0(objN30);
                    } else {
                        nwbVar2 = nwbVarJ0;
                        rweVar = rweVarP;
                        t53Var5 = t53Var4;
                        t4gVar2 = t4gVar4;
                        r33 = r142;
                    }
                    zy7 zy7Var9 = (zy7) objN30;
                    boolean zF16 = r134.f(t53Var5) | (i13 == 8388608) | r134.f(nwbVarJ02);
                    Object objN31 = r134.N();
                    if (zF16 || objN31 == obj) {
                        objN31 = new kc(t53Var5, uz7Var2, nwbVarJ02, 2);
                        r134.k0(objN31);
                    }
                    fk0Var4 = fk0Var3;
                    ?? r135 = r134;
                    nwbVar = nwbVarJ02;
                    pl3Var5 = pl3Var7;
                    ?? r7 = r33;
                    qi3Var4 = qi3Var3;
                    view2 = view4;
                    i7 = 4;
                    xrk.b(r7, strC0, bz7Var5, zy7Var8, zy7Var9, (bz7) objN31, r135, 8);
                    r123 = r7;
                    r135.r();
                    r133 = r135;
                } else {
                    fk0Var4 = fk0Var3;
                    t4gVar = t4gVar5;
                    nwbVar = nwbVarJ02;
                    nwbVar2 = nwbVarJ0;
                    rweVar = rweVarP;
                    t53Var5 = t53Var4;
                    t4gVar2 = t4gVar4;
                    r123 = r142;
                    pl3Var5 = pl3Var7;
                    bt7Var = bt7Var3;
                    qi3Var4 = qi3Var3;
                    i7 = 4;
                    ?? r136 = r134;
                    view2 = view4;
                    r136.a0(-210423223);
                    boolean z2 = (i11 & 458752) == 131072;
                    Object objN32 = r136.N();
                    if (z2 || objN32 == obj) {
                        objN32 = new es0(zy7Var3, null, 5);
                        r136.k0(objN32);
                    }
                    fd9.i(r136, (pz7) objN32, iei.a);
                    r136.r();
                    r133 = r136;
                }
                r133.r();
                r122 = r123;
                r132 = r133;
            } else {
                fk0Var4 = fk0Var3;
                t4gVar = t4gVar5;
                nwbVar = nwbVarJ02;
                nwbVar2 = nwbVarJ0;
                rweVar = rweVarP;
                t53Var5 = t53Var4;
                t4gVar2 = t4gVar4;
                r122 = r142;
                pl3Var5 = pl3Var7;
                bt7Var = bt7Var3;
                qi3Var4 = qi3Var3;
                i7 = 4;
                ?? r137 = r134;
                view2 = view4;
                r137.a0(-210327898);
                r137.r();
                r132 = r137;
            }
            Boolean bool3 = (Boolean) t53Var5.P0.getValue();
            bool3.getClass();
            int i15 = i6;
            boolean zF17 = r132.f(t53Var5) | (i15 == i7) | r132.h(r122);
            Object objN33 = r132.N();
            if (zF17 || objN33 == obj) {
                chatScreenParams2 = chatScreenParams;
                objN33 = new f23(t53Var5, chatScreenParams2, (hw2) r122, (tp4) null);
                r132.k0(objN33);
            } else {
                chatScreenParams2 = chatScreenParams;
            }
            fd9.j(r122, bool3, (pz7) objN33, r132);
            Object objN34 = r132.N();
            if (objN34 == obj) {
                objN34 = new w53(6);
                r132.k0(objN34);
            }
            final rwe rweVarP5 = eve.P(jce.a(ChatScreenModalBottomSheetDestination.class), oq5.B(jce.a(ChatScreenModalBottomSheetDestination.class)), true, iv1.M(jce.a(ChatScreenModalBottomSheetDestination.class)), (zy7) objN34, r132);
            x44.q0(rweVarP5, r132);
            Object objN35 = r132.N();
            if (objN35 == obj) {
                objN35 = new w53(7);
                r132.k0(objN35);
            }
            final rwe rweVarP6 = eve.P(jce.a(ChatScreenArtifactSheetDestination.class), oq5.B(jce.a(ChatScreenArtifactSheetDestination.class)), true, iv1.M(jce.a(ChatScreenArtifactSheetDestination.class)), (zy7) objN35, r132);
            x44.q0(rweVarP6, r132);
            Object objN36 = r132.N();
            if (objN36 == obj) {
                objN36 = new w53(10);
                r132.k0(objN36);
            }
            rwe rweVarP7 = eve.P(jce.a(ChatScreenOverlay.class), oq5.B(jce.a(ChatScreenOverlay.class)), true, iv1.M(jce.a(ChatScreenOverlay.class)), (zy7) objN36, r132);
            yfd.a(new rwe[]{rweVarP5, rweVarP6}, r132, 0);
            op3 op3Var = (op3) r132.j(ve4.f);
            boolean zF18 = r132.f(t53Var5) | r132.f(rweVarP5) | r132.f(op3Var) | r132.f(qi3Var4) | r132.f(r122);
            Object objN37 = r132.N();
            if (zF18 || objN37 == obj) {
                l45Var = l45Var3;
                t53 t53Var10 = t53Var5;
                ?? r332 = r122;
                bt7 bt7Var4 = bt7Var;
                t53Var6 = t53Var10;
                r0 = r332;
                bt7Var2 = bt7Var4;
                objN37 = new bl2(new nf1(t53Var5, rweVarP5, qi3Var4, 5), new g73(rweVarP5, l45Var3, t53Var5, op3Var, qi3Var4, 0), new a83(l45Var, op3Var, qi3Var4, t53Var5), new b83(rweVarP5, qi3Var4, t53Var5), new c83(rweVarP5, qi3Var4, t53Var5), new d83(rweVarP5, qi3Var4, t53Var5), new e83(rweVarP5, chatScreenParams2, t53Var5, qi3Var4), new f83(t53Var5, qi3Var4), new i73(l45Var, t53Var10, r332, bt7Var4, 0), new y73(qi3Var4, 0, t53Var6), new z73(0, t53Var6));
                r132.k0(objN37);
            } else {
                ?? r6 = r122;
                t53Var6 = t53Var5;
                r0 = r6;
                bt7Var2 = bt7Var;
                l45Var = l45Var3;
            }
            bl2 bl2Var2 = (bl2) objN37;
            String strM590getArtifactIdentifierToOpenNDePnSc = chatScreenParams2.m590getArtifactIdentifierToOpenNDePnSc();
            ArtifactIdentifier artifactIdentifierM964boximpl = strM590getArtifactIdentifierToOpenNDePnSc != null ? ArtifactIdentifier.m964boximpl(strM590getArtifactIdentifierToOpenNDePnSc) : null;
            final qi3 qi3Var6 = qi3Var4;
            Boolean boolValueOf = Boolean.valueOf(t53Var6.I0());
            boolean zF19 = (i15 == 4) | r132.f(t53Var6) | r132.h(rweVarP6);
            Object objN38 = r132.N();
            if (zF19 || objN38 == obj) {
                objN38 = new n73(chatScreenParams2, t53Var6, rweVarP6, null);
                r132.k0(objN38);
            }
            fd9.j(artifactIdentifierM964boximpl, boolValueOf, (pz7) objN38, r132);
            zy1 zy1Var4 = t53Var6.i0;
            t4g t4gVar7 = t4gVar;
            zy7 zy7Var10 = zy7Var6;
            boolean zH8 = r132.h(l45Var) | r132.f(t53Var6) | r132.h(r0) | r132.h(t4gVar7) | r132.h(rweVarP6) | r132.h(rweVarP5) | r132.h(pl3Var5) | r132.h(view2) | r132.f(zy7Var10);
            ?? r902 = r0;
            Object objN39 = r132.N();
            if (zH8 || objN39 == obj) {
                objN39 = new p73(l45Var, r902, t53Var6, t4gVar7, rweVarP6, rweVarP5, pl3Var5, view2, zy7Var10, null);
                r143 = r902;
                t4gVar3 = t4gVar7;
                r132.k0(objN39);
            } else {
                r143 = r902;
                t4gVar3 = t4gVar7;
            }
            x44.b(zy1Var4, (pz7) objN39, r132, 0);
            Object objN40 = r132.N();
            if (objN40 == obj) {
                objN40 = vb7.g(0, r132);
            }
            final isc iscVar = (isc) objN40;
            Object objN41 = r132.N();
            if (objN41 == obj) {
                objN41 = vb7.g(0, r132);
            }
            final isc iscVar2 = (isc) objN41;
            Object objN42 = r132.N();
            if (objN42 == obj) {
                objN42 = vb7.g(0, r132);
            }
            final isc iscVar3 = (isc) objN42;
            lsc lscVar3 = t53Var6.t0;
            lsc lscVar4 = t53Var6.u0;
            boolean z3 = lscVar3.getValue() != null;
            Boolean boolValueOf2 = Boolean.valueOf(z3);
            final pl3 pl3Var8 = pl3Var5;
            int i16 = 14;
            boolean zG2 = r132.g(z3) | ((i11 & 1879048192) == 536870912) | ((i3 & 14) == 4);
            Object objN43 = r132.N();
            if (zG2 || objN43 == obj) {
                lscVar = lscVar3;
                objN43 = new k73(zy7Var4, zy7Var5, z3);
                r132.k0(objN43);
            } else {
                lscVar = lscVar3;
            }
            fd9.d(boolValueOf2, (bz7) objN43, r132);
            Object objN44 = r132.N();
            if (objN44 == obj) {
                objN44 = sq6.p(r132);
            }
            final ybg ybgVar = (ybg) objN44;
            m7f m7fVarN5 = sq6.n(r132, -1168520582, r132, -1633490746);
            boolean zF20 = r132.f(null) | r132.f(m7fVarN5);
            Object objN45 = r132.N();
            if (zF20 || objN45 == obj) {
                objN45 = ij0.f(f4j.class, m7fVarN5, null, r132);
            }
            r132.r();
            r132.r();
            f4j f4jVar2 = (f4j) objN45;
            m7f m7fVarN6 = sq6.n(r132, -1168520582, r132, -1633490746);
            boolean zF21 = r132.f(null) | r132.f(m7fVarN6);
            Object objN46 = r132.N();
            if (zF21 || objN46 == obj) {
                objN46 = ij0.f(j1j.class, m7fVarN6, null, r132);
            }
            r132.r();
            r132.r();
            final j1j j1jVar = (j1j) objN46;
            m7f m7fVarN7 = sq6.n(r132, -1168520582, r132, -1633490746);
            boolean zF22 = r132.f(null) | r132.f(m7fVarN7);
            Object objN47 = r132.N();
            if (zF22 || objN47 == obj) {
                objN47 = ij0.f(q7.class, m7fVarN7, null, r132);
            }
            r132.r();
            r132.r();
            final q7 q7Var = (q7) objN47;
            m7f m7fVarN8 = sq6.n(r132, -1168520582, r132, -1633490746);
            boolean zF23 = r132.f(null) | r132.f(m7fVarN8);
            Object objN48 = r132.N();
            if (zF23 || objN48 == obj) {
                objN48 = ij0.f(f9.class, m7fVarN8, null, r132);
            }
            r132.r();
            r132.r();
            final f9 f9Var = (f9) objN48;
            m7f m7fVarN9 = sq6.n(r132, -1168520582, r132, -1633490746);
            boolean zF24 = r132.f(null) | r132.f(m7fVarN9);
            Object objN49 = r132.N();
            if (zF24 || objN49 == obj) {
                objN49 = ij0.f(loi.class, m7fVarN9, null, r132);
            }
            r132.r();
            r132.r();
            final loi loiVar = (loi) objN49;
            ps7 ps7Var2 = (ps7) r132.j(ve4.i);
            z09 z09VarL = u00.L(k63.F.size(), r132);
            j9f j9fVarY = mpk.Y(r132);
            x0a x0aVar = t53Var6.l0;
            boolean zF25 = r132.f(t53Var6) | r132.f(j9fVarY) | r132.h(ps7Var2);
            Object objN50 = r132.N();
            if (zF25 || objN50 == obj) {
                objN50 = new cx(t53Var6, j9fVarY, ps7Var2, (tp4) null, 7);
                j9fVar = j9fVarY;
                ps7Var = ps7Var2;
                tp4Var2 = null;
                r132.k0(objN50);
            } else {
                j9fVar = j9fVarY;
                tp4Var2 = null;
                ps7Var = ps7Var2;
            }
            fd9.i(r132, (pz7) objN50, x0aVar);
            String strO0 = t53Var6.O0();
            if (strO0 == null) {
                r132.a0(-194400967);
                r132.r();
                z09Var = z09VarL;
            } else {
                r132.a0(-194400966);
                boolean zF26 = r132.f(t53Var6);
                Object objN51 = r132.N();
                if (zF26 || objN51 == obj) {
                    z09Var = z09VarL;
                    objN51 = new i33(t53Var6, 3);
                    r132.k0(objN51);
                } else {
                    z09Var = z09VarL;
                }
                skk.a(strO0, (zy7) objN51, r132, 0);
                r132.r();
            }
            eli eliVar = (eli) r132.j(ve4.e());
            boolean zH9 = r132.h(eliVar) | r132.f(t53Var6);
            Object objN52 = r132.N();
            if (zH9 || objN52 == obj) {
                objN52 = new ow1(eliVar, 8, t53Var6);
                r132.k0(objN52);
            }
            pz7 pz7Var = (pz7) objN52;
            boolean zH10 = r132.h(rweVarP5);
            Object objN53 = r132.N();
            if (zH10 || objN53 == obj) {
                objN53 = new x13(rweVarP5, 4);
                r132.k0(objN53);
            }
            pz7 pz7Var2 = (pz7) objN53;
            boolean zH11 = r132.h(rweVarP5);
            Object objN54 = r132.N();
            if (zH11 || objN54 == obj) {
                lscVar2 = lscVar4;
                objN54 = new x13(rweVarP5, 5);
                r132.k0(objN54);
            } else {
                lscVar2 = lscVar4;
            }
            pz7 pz7Var3 = (pz7) objN54;
            boolean zF27 = r132.f(t53Var6);
            Object objN55 = r132.N();
            if (zF27 || objN55 == obj) {
                objN55 = new n0(t53Var6, 2);
                r132.k0(objN55);
            }
            final kg3 kg3VarO = dch.O(pz7Var, pz7Var2, pz7Var3, (bz7) ((jm9) objN55), r132);
            boolean z4 = t4gVar2.b() && t4gVar3.b() && t4gVar6.b() && x0.e(rweVarP5) && x44.r(iv1.t(rweVarP6), ChatScreenArtifactSheetDestination.Closed.INSTANCE);
            boolean zH12 = r132.h(rweVarP6) | r132.h(l45Var) | r132.h(r143) | r132.f(t53Var6) | r132.h(ps7Var);
            Object objN56 = r132.N();
            if (zH12 || objN56 == obj) {
                objN56 = new n63(rweVarP6, l45Var, r143, t53Var6, ps7Var, 0);
                r132.k0(objN56);
            }
            final zy7 zy7Var11 = (zy7) objN56;
            zy1 zy1Var5 = zy1Var;
            final hi4 hi4VarR = ez1.R(t53Var6.F0(), zy1Var5, r132);
            koi koiVar = (koi) r132.j(qoi.b());
            c4a c4aVarA = ((m4a) r132.j(tda.a)).a();
            final ps7 ps7Var3 = ps7Var;
            boolean zF28 = r132.f(t53Var6) | r132.h(context3) | r132.h(c4aVarA);
            final boolean z5 = z4;
            Object objN57 = r132.N();
            if (zF28 || objN57 == obj) {
                l45Var2 = l45Var;
                objN57 = new nf1(t53Var6, context3, c4aVarA, 4);
                r132.k0(objN57);
            } else {
                l45Var2 = l45Var;
            }
            fd9.f(t53Var6, context3, c4aVarA, (bz7) objN57, r132);
            Object objN58 = r132.N();
            if (objN58 == obj) {
                objN58 = mpk.P(tp4Var2);
                r132.k0(objN58);
            }
            nwb nwbVar4 = (nwb) objN58;
            nwb nwbVarU = mpk.u(hi4VarR.b(), r132);
            di4 di4VarB = b(nwbVarU);
            boolean zF29 = r132.f(nwbVarU);
            Object objN59 = r132.N();
            if (zF29 || objN59 == obj) {
                zy1Var2 = zy1Var5;
                f4jVar = f4jVar2;
                objN59 = new ab0(nwbVarU, nwbVar4, tp4Var2, 2);
                r132.k0(objN59);
            } else {
                zy1Var2 = zy1Var5;
                f4jVar = f4jVar2;
            }
            fd9.i(r132, (pz7) objN59, di4VarB);
            boolean zF30 = r132.f((SuggestConnectorsOutputConnectorsItem) nwbVar4.getValue()) | r132.f(t53Var6) | r132.f(bl2Var2) | r132.f(rweVarP5) | r132.f(rweVarP6) | r132.f(t4gVar6) | r132.f(hi4VarR) | r132.g(r143.e0());
            Object objN60 = r132.N();
            if (zF30 || objN60 == obj) {
                bl2Var = bl2Var2;
                rweVar2 = rweVarP7;
                objN60 = new lvh(t53Var6.C0(), zy1Var2, new z73(1, bl2Var2), new dm(t53Var6, 6), new n0(t53Var6, 3), new n0(t53Var6, 4), new n0(t53Var6, 5), new o5(r143, i16, zy7Var11), r143.e0(), new i33(t53Var6, 4), new f13(rweVar2, 9), new u13(t53Var6, rweVarP5, rweVarP6, 1), bz7Var3, new dm(t53Var6, 5), new l83(t4gVar6), new x70(koiVar, hi4VarR, context3, nwbVar4, 2), (SuggestConnectorsOutputConnectorsItem) nwbVar4.getValue(), new wv2(t53Var6));
                r132.k0(objN60);
            } else {
                rweVar2 = rweVarP7;
                bl2Var = bl2Var2;
            }
            final lvh lvhVar = (lvh) objN60;
            if (t53Var6.Z0()) {
                r132.a0(-1114296561);
                ng8VarX = mpk.X(r132);
                r132.r();
            } else {
                r132.a0(-183430687);
                r132.r();
                ng8VarX = null;
            }
            if (ng8VarX == null) {
                r132.a0(-183382916);
                r132.r();
                um2VarB = null;
            } else {
                r132.a0(-183382915);
                um2 um2VarG0 = x44.g0(ng8VarX, r132);
                r132.r();
                um2VarB = um2VarG0;
            }
            if (um2VarB == null) {
                um2VarB = mwa.B();
            }
            hvd hvdVarC = vm2.a().c(um2VarB);
            final ng8 ng8Var = ng8VarX;
            final rwe rweVar3 = rweVar2;
            final t53 t53Var11 = t53Var6;
            final ?? r3 = r143;
            final f4j f4jVar3 = f4jVar;
            final nwb nwbVar5 = nwbVar;
            final lsc lscVar5 = lscVar;
            final bt7 bt7Var5 = bt7Var2;
            final fk0 fk0Var6 = fk0Var4;
            final gj1 gj1Var3 = gj1Var;
            final bl2 bl2Var3 = bl2Var;
            final t4g t4gVar8 = t4gVar3;
            final nwb nwbVar6 = nwbVar2;
            final rwe rweVar4 = rweVar;
            final t4g t4gVar9 = t4gVar2;
            final j9f j9fVar2 = j9fVar;
            final z09 z09Var2 = z09Var;
            final lsc lscVar6 = lscVar2;
            final l45 l45Var4 = l45Var2;
            pz7 pz7Var4 = new pz7() { // from class: p63
                @Override // defpackage.pz7
                public final Object invoke(Object obj2, Object obj3) {
                    t53 t53Var12;
                    boolean z6;
                    ld4 ld4Var2 = (ld4) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    final int i17 = 0;
                    final int i18 = 1;
                    e18 e18Var = (e18) ld4Var2;
                    boolean zQ = e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2);
                    iei ieiVar = iei.a;
                    if (!zQ) {
                        e18Var.T();
                        return ieiVar;
                    }
                    boolean z7 = z5;
                    t53 t53Var13 = t53Var11;
                    if (z7 && t53Var13.L0() == null) {
                        t53Var12 = t53Var13;
                        z6 = true;
                    } else {
                        t53Var12 = t53Var13;
                        z6 = false;
                    }
                    final hw2 hw2Var5 = r3;
                    boolean zH13 = e18Var.h(hw2Var5);
                    Object objN61 = e18Var.N();
                    lz1 lz1Var = jd4.a;
                    if (zH13 || objN61 == lz1Var) {
                        n0 n0Var = new n0(1, hw2Var5, hw2.class, "supportsMimeType", "supportsMimeType(Ljava/lang/String;)Z", 0, 1);
                        e18Var.k0(n0Var);
                        objN61 = n0Var;
                    }
                    bz7 bz7Var7 = (bz7) ((jm9) objN61);
                    boolean zH14 = e18Var.h(hw2Var5);
                    Object objN62 = e18Var.N();
                    if (zH14 || objN62 == lz1Var) {
                        objN62 = new pz7() { // from class: u63
                            @Override // defpackage.pz7
                            public final Object invoke(Object obj4, Object obj5) {
                                int i19 = i17;
                                iei ieiVar2 = iei.a;
                                switch (i19) {
                                    case 0:
                                        List list = (List) obj4;
                                        go4 go4Var = (go4) obj5;
                                        list.getClass();
                                        go4Var.getClass();
                                        ChatEvents$AttachmentSource chatEvents$AttachmentSourceE = f.e(go4Var);
                                        hw2Var5.P(list, chatEvents$AttachmentSourceE);
                                        break;
                                    default:
                                        List list2 = (List) obj4;
                                        go4 go4Var2 = (go4) obj5;
                                        list2.getClass();
                                        go4Var2.getClass();
                                        ChatEvents$AttachmentSource chatEvents$AttachmentSourceE2 = f.e(go4Var2);
                                        chatEvents$AttachmentSourceE2.getClass();
                                        hw2 hw2Var6 = hw2Var5;
                                        gb9.D(hw2Var6.a, null, null, new pb2(hw2Var6, list2, chatEvents$AttachmentSourceE2, null, 7), 3);
                                        break;
                                }
                                return ieiVar2;
                            }
                        };
                        e18Var.k0(objN62);
                    }
                    pz7 pz7Var5 = (pz7) objN62;
                    boolean zH15 = e18Var.h(hw2Var5);
                    Object objN63 = e18Var.N();
                    if (zH15 || objN63 == lz1Var) {
                        objN63 = new vv2(hw2Var5, 2);
                        e18Var.k0(objN63);
                    }
                    bz7 bz7Var8 = (bz7) objN63;
                    boolean zH16 = e18Var.h(hw2Var5);
                    Object objN64 = e18Var.N();
                    if (zH16 || objN64 == lz1Var) {
                        objN64 = new pz7() { // from class: u63
                            @Override // defpackage.pz7
                            public final Object invoke(Object obj4, Object obj5) {
                                int i19 = i18;
                                iei ieiVar2 = iei.a;
                                switch (i19) {
                                    case 0:
                                        List list = (List) obj4;
                                        go4 go4Var = (go4) obj5;
                                        list.getClass();
                                        go4Var.getClass();
                                        ChatEvents$AttachmentSource chatEvents$AttachmentSourceE = f.e(go4Var);
                                        hw2Var5.P(list, chatEvents$AttachmentSourceE);
                                        break;
                                    default:
                                        List list2 = (List) obj4;
                                        go4 go4Var2 = (go4) obj5;
                                        list2.getClass();
                                        go4Var2.getClass();
                                        ChatEvents$AttachmentSource chatEvents$AttachmentSourceE2 = f.e(go4Var2);
                                        chatEvents$AttachmentSourceE2.getClass();
                                        hw2 hw2Var6 = hw2Var5;
                                        gb9.D(hw2Var6.a, null, null, new pb2(hw2Var6, list2, chatEvents$AttachmentSourceE2, null, 7), 3);
                                        break;
                                }
                                return ieiVar2;
                            }
                        };
                        e18Var.k0(objN64);
                    }
                    final iqb iqbVar2 = iqbVar;
                    final t53 t53Var14 = t53Var12;
                    final lsc lscVar7 = lscVar5;
                    final gj1 gj1Var4 = gj1Var3;
                    final pl3 pl3Var9 = pl3Var8;
                    final rwe rweVar5 = rweVarP5;
                    final t4g t4gVar10 = t4gVar8;
                    final isc iscVar4 = iscVar;
                    final z09 z09Var3 = z09Var2;
                    final nwb nwbVar7 = lscVar6;
                    final zy7 zy7Var12 = zy7Var11;
                    final zy7 zy7Var13 = zy7Var;
                    final fk0 fk0Var7 = fk0Var6;
                    final nwb nwbVar8 = nwbVar6;
                    final rwe rweVar6 = rweVar4;
                    final t4g t4gVar11 = t4gVar9;
                    final zy7 zy7Var14 = zy7Var3;
                    final l45 l45Var5 = l45Var4;
                    final bt7 bt7Var6 = bt7Var5;
                    final j9f j9fVar3 = j9fVar2;
                    final lvh lvhVar2 = lvhVar;
                    final nwb nwbVar9 = nwbVar5;
                    final nwb nwbVar10 = nwbVar3;
                    final ybg ybgVar2 = ybgVar;
                    final rwe rweVar7 = rweVarP6;
                    final ng8 ng8Var2 = ng8Var;
                    final kg3 kg3Var = kg3VarO;
                    final bl2 bl2Var4 = bl2Var3;
                    final f4j f4jVar4 = f4jVar3;
                    final j1j j1jVar2 = j1jVar;
                    final q7 q7Var2 = q7Var;
                    final loi loiVar2 = loiVar;
                    final f9 f9Var2 = f9Var;
                    final ps7 ps7Var4 = ps7Var3;
                    final isc iscVar5 = iscVar2;
                    final isc iscVar6 = iscVar3;
                    final ChatScreenParams chatScreenParams3 = chatScreenParams;
                    final qi3 qi3Var7 = qi3Var6;
                    final ml3 ml3Var2 = ml3Var;
                    final t4g t4gVar12 = t4gVar6;
                    final bz7 bz7Var9 = bz7Var2;
                    eve.c(z6, bz7Var7, pz7Var5, bz7Var8, (pz7) objN64, null, fd9.q0(688372550, new pz7() { // from class: v63
                        @Override // defpackage.pz7
                        public final Object invoke(Object obj4, Object obj5) {
                            ld4 ld4Var3 = (ld4) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            e18 e18Var2 = (e18) ld4Var3;
                            if (e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                String strJ0 = d4c.j0(R.string.chat_screen_pane_title, e18Var2);
                                fei feiVarY = kxk.y(e18Var2);
                                final lsc lscVar8 = lscVar7;
                                final t53 t53Var15 = t53Var14;
                                final gj1 gj1Var5 = gj1Var4;
                                pl3 pl3Var10 = pl3Var9;
                                final rwe rweVar8 = rweVar5;
                                t4g t4gVar13 = t4gVar10;
                                final isc iscVar7 = iscVar4;
                                final hw2 hw2Var6 = hw2Var5;
                                final z09 z09Var4 = z09Var3;
                                final nwb nwbVar11 = nwbVar7;
                                zy7 zy7Var15 = zy7Var12;
                                zy7 zy7Var16 = zy7Var13;
                                fk0 fk0Var8 = fk0Var7;
                                nwb nwbVar12 = nwbVar8;
                                final rwe rweVar9 = rweVar6;
                                final t4g t4gVar14 = t4gVar11;
                                final zy7 zy7Var17 = zy7Var14;
                                l45 l45Var6 = l45Var5;
                                bt7 bt7Var7 = bt7Var6;
                                j9f j9fVar4 = j9fVar3;
                                final lvh lvhVar3 = lvhVar2;
                                nwb nwbVar13 = nwbVar9;
                                final nwb nwbVar14 = nwbVar10;
                                ta4 ta4VarQ0 = fd9.q0(1207164674, new x63(lscVar8, t53Var15, gj1Var5, pl3Var10, rweVar8, t4gVar13, iscVar7, hw2Var6, z09Var4, nwbVar11, zy7Var15, zy7Var16, fk0Var8, nwbVar12, rweVar9, t4gVar14, zy7Var17, l45Var6, bt7Var7, j9fVar4, lvhVar3, nwbVar13, nwbVar14, 0), e18Var2);
                                final ybg ybgVar3 = ybgVar2;
                                ta4 ta4VarQ02 = fd9.q0(2136324769, new y63(ybgVar3, 0), e18Var2);
                                final rwe rweVar10 = rweVar7;
                                final ng8 ng8Var3 = ng8Var2;
                                final kg3 kg3Var2 = kg3Var;
                                final bl2 bl2Var5 = bl2Var4;
                                final f4j f4jVar5 = f4jVar4;
                                final j1j j1jVar3 = j1jVar2;
                                final q7 q7Var3 = q7Var2;
                                final loi loiVar3 = loiVar2;
                                final f9 f9Var3 = f9Var2;
                                final ps7 ps7Var5 = ps7Var4;
                                final isc iscVar8 = iscVar5;
                                final isc iscVar9 = iscVar6;
                                final ChatScreenParams chatScreenParams4 = chatScreenParams3;
                                final qi3 qi3Var8 = qi3Var7;
                                final ml3 ml3Var3 = ml3Var2;
                                final t4g t4gVar15 = t4gVar12;
                                final bz7 bz7Var10 = bz7Var9;
                                v40.b(iqbVar2, strJ0, null, ta4VarQ0, ta4VarQ02, null, 0, 0L, 0L, feiVarY, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(-742373296, new rz7() { // from class: z63
                                    /* JADX WARN: Removed duplicated region for block: B:111:0x0433  */
                                    /* JADX WARN: Removed duplicated region for block: B:115:0x0466  */
                                    /* JADX WARN: Removed duplicated region for block: B:122:0x048f  */
                                    /* JADX WARN: Removed duplicated region for block: B:124:0x049b  */
                                    /* JADX WARN: Removed duplicated region for block: B:131:0x04ce  */
                                    /* JADX WARN: Removed duplicated region for block: B:135:0x04e3  */
                                    /* JADX WARN: Removed duplicated region for block: B:138:0x04ff  */
                                    /* JADX WARN: Removed duplicated region for block: B:144:0x0525  */
                                    /* JADX WARN: Removed duplicated region for block: B:61:0x0202  */
                                    /* JADX WARN: Removed duplicated region for block: B:62:0x0205  */
                                    /* JADX WARN: Removed duplicated region for block: B:65:0x0224  */
                                    /* JADX WARN: Removed duplicated region for block: B:66:0x022e  */
                                    /* JADX WARN: Removed duplicated region for block: B:69:0x0239  */
                                    /* JADX WARN: Removed duplicated region for block: B:72:0x02b2  */
                                    /* JADX WARN: Removed duplicated region for block: B:76:0x02fa  */
                                    /* JADX WARN: Removed duplicated region for block: B:79:0x031b  */
                                    @Override // defpackage.rz7
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct add '--show-bad-code' argument
                                    */
                                    public final java.lang.Object invoke(java.lang.Object r44, java.lang.Object r45, java.lang.Object r46) {
                                        /*
                                            Method dump skipped, instruction units count: 1396
                                            To view this dump add '--comments-level debug' option
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: defpackage.z63.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                                    }
                                }, e18Var2), e18Var2, 27648, 1508);
                            } else {
                                e18Var2.T();
                            }
                            return iei.a;
                        }
                    }, e18Var), e18Var, 1572864);
                    final rwe rweVar8 = rweVar3;
                    final l5h l5hVar = l5hVarL;
                    mwa.l(rweVar8, null, null, fd9.q0(282208229, new sz7() { // from class: com.anthropic.claude.chat.c
                        @Override // defpackage.sz7
                        public final Object i(Object obj4, Object obj5, Object obj6, Object obj7) {
                            final ChatScreenOverlay chatScreenOverlay = (ChatScreenOverlay) obj5;
                            ld4 ld4Var3 = (ld4) obj6;
                            int iIntValue2 = ((Integer) obj7).intValue();
                            ((ia0) obj4).getClass();
                            chatScreenOverlay.getClass();
                            if ((iIntValue2 & 48) == 0) {
                                iIntValue2 |= (iIntValue2 & 64) == 0 ? ((e18) ld4Var3).f(chatScreenOverlay) : ((e18) ld4Var3).h(chatScreenOverlay) ? 32 : 16;
                            }
                            boolean z8 = true;
                            e18 e18Var2 = (e18) ld4Var3;
                            if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                e18Var2.T();
                            } else if (chatScreenOverlay.equals(ChatScreenOverlay.None.INSTANCE)) {
                                e18Var2.a0(2014427323);
                                e18Var2.p(false);
                            } else {
                                if (!(chatScreenOverlay instanceof ChatScreenOverlay.BrowserTakeover)) {
                                    throw kgh.s(e18Var2, 619170301, false);
                                }
                                e18Var2.a0(2014515549);
                                final String strJ0 = d4c.j0(R.string.browser_takeover_done_message_for_claude, e18Var2);
                                String takeoverPath = ((ChatScreenOverlay.BrowserTakeover) chatScreenOverlay).getTakeoverPath();
                                int i19 = iIntValue2;
                                final rwe rweVar9 = rweVar8;
                                boolean zH17 = e18Var2.h(rweVar9);
                                if ((i19 & 112) != 32 && ((i19 & 64) == 0 || !e18Var2.h(chatScreenOverlay))) {
                                    z8 = false;
                                }
                                final t53 t53Var15 = t53Var14;
                                boolean zF31 = zH17 | z8 | e18Var2.f(t53Var15) | e18Var2.f(strJ0);
                                final l45 l45Var6 = l45Var5;
                                boolean zH18 = zF31 | e18Var2.h(l45Var6);
                                final l5h l5hVar2 = l5hVar;
                                boolean zH19 = e18Var2.h(l5hVar2) | zH18;
                                Object objN65 = e18Var2.N();
                                if (zH19 || objN65 == jd4.a) {
                                    zy7 zy7Var15 = new zy7() { // from class: com.anthropic.claude.chat.d
                                        @Override // defpackage.zy7
                                        public final Object a() {
                                            hr0 hr0Var = hr0.J;
                                            j83 j83Var = new j83(3);
                                            rwe rweVar10 = rweVar9;
                                            rweVar10.getClass();
                                            rweVar10.E.m(hr0Var, j83Var);
                                            String strM583getTaskIducJv0z8 = ((ChatScreenOverlay.BrowserTakeover) chatScreenOverlay).m583getTaskIducJv0z8();
                                            String str = strJ0;
                                            if (strM583getTaskIducJv0z8 == null) {
                                                str.getClass();
                                                dlf dlfVar = new dlf(InputMode.TEXT);
                                                t53 t53Var16 = t53Var15;
                                                lm6 lm6Var = lm6.E;
                                                t53Var16.r1(str, lm6Var, lm6Var, dlfVar, false);
                                            } else {
                                                gb9.D(l45Var6, null, null, new pb2(l5hVar2, strM583getTaskIducJv0z8, str, null, 17), 3);
                                            }
                                            return iei.a;
                                        }
                                    };
                                    e18Var2.k0(zy7Var15);
                                    objN65 = zy7Var15;
                                }
                                idi.b(takeoverPath, (zy7) objN65, null, null, null, e18Var2, 0);
                                e18Var2.p(false);
                            }
                            return iei.a;
                        }
                    }, e18Var), e18Var, 3072, 6);
                    boolean zF31 = e18Var.f(zy7Var13) | e18Var.h(t4gVar11);
                    Object objN65 = e18Var.N();
                    if (zF31 || objN65 == lz1Var) {
                        final int i19 = 0;
                        objN65 = new zy7() { // from class: w63
                            @Override // defpackage.zy7
                            public final Object a() {
                                int i20 = i19;
                                iei ieiVar2 = iei.a;
                                t4g t4gVar13 = t4gVar11;
                                zy7 zy7Var15 = zy7Var13;
                                switch (i20) {
                                    case 0:
                                        zy7Var15.a();
                                        t4gVar13.a();
                                        break;
                                    default:
                                        zy7Var15.a();
                                        t4gVar13.a();
                                        break;
                                }
                                return ieiVar2;
                            }
                        };
                        e18Var.k0(objN65);
                    }
                    n.a(t53Var14, hw2Var5, t4gVar11, hi4VarR, (zy7) objN65, null, null, null, e18Var, 4160);
                    boolean zF32 = e18Var.f(zy7Var13) | e18Var.h(t4gVar10);
                    Object objN66 = e18Var.N();
                    if (zF32 || objN66 == lz1Var) {
                        final int i20 = 1;
                        objN66 = new zy7() { // from class: w63
                            @Override // defpackage.zy7
                            public final Object a() {
                                int i202 = i20;
                                iei ieiVar2 = iei.a;
                                t4g t4gVar13 = t4gVar10;
                                zy7 zy7Var15 = zy7Var13;
                                switch (i202) {
                                    case 0:
                                        zy7Var15.a();
                                        t4gVar13.a();
                                        break;
                                    default:
                                        zy7Var15.a();
                                        t4gVar13.a();
                                        break;
                                }
                                return ieiVar2;
                            }
                        };
                        e18Var.k0(objN66);
                    }
                    mpk.f(t53Var14, t4gVar10, (zy7) objN66, null, e18Var, 0);
                    List list = (List) t53Var14.t1.getValue();
                    boolean zH17 = e18Var.h(t4gVar12) | e18Var.h(rweVar8);
                    Object objN67 = e18Var.N();
                    if (zH17 || objN67 == lz1Var) {
                        objN67 = new e(t4gVar12, rweVar8);
                        e18Var.k0(objN67);
                    }
                    q.j(list, t4gVar12, null, null, (pz7) objN67, e18Var, 0, 12);
                    boolean zF33 = e18Var.f(zy7Var12);
                    Object objN68 = e18Var.N();
                    if (zF33 || objN68 == lz1Var) {
                        objN68 = new bg0(1, zy7Var12);
                        e18Var.k0(objN68);
                    }
                    x0.a(t53Var14, hw2Var5, rweVar5, rweVar7, (bz7) objN68, null, e18Var, 64);
                    boolean zH18 = e18Var.h(hw2Var5) | e18Var.f(t53Var14) | e18Var.h(t4gVar11) | e18Var.h(t4gVar10) | e18Var.h(t4gVar12);
                    Object objN69 = e18Var.N();
                    if (zH18 || objN69 == lz1Var) {
                        m80 m80Var = new m80(hw2Var5, t53Var14, t4gVar11, t4gVar10, t4gVar12, bt7Var6, null, 1);
                        e18Var.k0(m80Var);
                        objN69 = m80Var;
                    }
                    fd9.i(e18Var, (pz7) objN69, ieiVar);
                    return ieiVar;
                }
            };
            t53Var2 = t53Var11;
            r14 = r3;
            ?? r138 = r132;
            j8.c(hvdVarC, fd9.q0(1191392060, pz7Var4, r138), r138, 56);
            fk0Var2 = fk0Var6;
            pl3Var2 = pl3Var8;
            qi3Var2 = qi3Var6;
            h86Var2 = h86Var5;
            r13 = r138;
        } else {
            r134.T();
            t53Var2 = t53Var;
            r14 = hw2Var;
            fk0Var2 = fk0Var;
            h86Var2 = h86Var;
            qi3Var2 = qi3Var;
            pl3Var2 = pl3Var;
            r13 = r134;
        }
        r7e r7eVarS = r13.s();
        if (r7eVarS != null) {
            final t53 t53Var12 = t53Var2;
            r7eVarS.e(new pz7() { // from class: q63
                @Override // defpackage.pz7
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP0 = x44.p0(i | 1);
                    f.a(chatScreenParams, ml3Var, zy7Var, bz7Var, zy7Var2, zy7Var3, bz7Var2, uz7Var, iqbVar, zy7Var4, zy7Var5, bz7Var3, t53Var12, r14, fk0Var2, h86Var2, qi3Var2, pl3Var2, (ld4) obj2, iP0);
                    return iei.a;
                }
            });
        }
    }

    public static final di4 b(nwb nwbVar) {
        return (di4) nwbVar.getValue();
    }

    public static final void c(j1j j1jVar, q7 q7Var, loi loiVar, f9 f9Var, VillageWeaverConsentState villageWeaverConsentState) {
        if (((Boolean) j1jVar.b.getValue()).booleanValue() && q7Var.b()) {
            gb9.D(loiVar, null, null, new nn1(f9Var, villageWeaverConsentState, (tp4) null, 27), 3);
        }
    }

    public static final void d(t53 t53Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1325292617);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(t53Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 0;
        int i4 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            int iH = t53Var.h0.u.h();
            Integer numValueOf = Integer.valueOf(iH);
            boolean zD = ((i2 & 14) == 4) | e18Var.d(iH);
            Object objN = e18Var.N();
            if (zD || objN == jd4.a) {
                objN = new t63(t53Var, iH, i3);
                e18Var.k0(objN);
            }
            fd9.e(t53Var, numValueOf, (bz7) objN, e18Var);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new aw1(t53Var, i, i4);
        }
    }

    public static final ChatEvents$AttachmentSource e(go4 go4Var) {
        int iOrdinal = go4Var.ordinal();
        if (iOrdinal == 0) {
            return ChatEvents$AttachmentSource.DRAG_AND_DROP;
        }
        if (iOrdinal != 1 && iOrdinal != 2) {
            if (iOrdinal == 3) {
                return ChatEvents$AttachmentSource.UNSPECIFIED;
            }
            mr9.b();
            return null;
        }
        return ChatEvents$AttachmentSource.PASTE;
    }
}
