package com.anthropic.claude.artifact.sheet;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.artifact.model.WiggleArtifactIdentifier;
import com.anthropic.claude.artifact.sheet.ArtifactBottomSheetParams;
import com.anthropic.claude.artifact.sheet.a;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.bq0;
import defpackage.bz7;
import defpackage.cq0;
import defpackage.csg;
import defpackage.e18;
import defpackage.fd9;
import defpackage.fqb;
import defpackage.g9;
import defpackage.gw;
import defpackage.iqb;
import defpackage.jce;
import defpackage.jd4;
import defpackage.jm9;
import defpackage.kg3;
import defpackage.kk0;
import defpackage.ld4;
import defpackage.lq0;
import defpackage.lz1;
import defpackage.m7f;
import defpackage.mpk;
import defpackage.mwa;
import defpackage.nwb;
import defpackage.pq;
import defpackage.pz7;
import defpackage.qe;
import defpackage.qi3;
import defpackage.r65;
import defpackage.r7e;
import defpackage.rc;
import defpackage.rqk;
import defpackage.rtk;
import defpackage.s64;
import defpackage.sf5;
import defpackage.sq6;
import defpackage.tca;
import defpackage.umg;
import defpackage.w00;
import defpackage.wz5;
import defpackage.xe;
import defpackage.xn;
import defpackage.xp0;
import defpackage.xpa;
import defpackage.zy7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static final void a(final xp0 xp0Var, final boolean z, final bz7 bz7Var, final zy7 zy7Var, final zy7 zy7Var2, final kg3 kg3Var, iqb iqbVar, final float f, final bz7 bz7Var2, qi3 qi3Var, lq0 lq0Var, ld4 ld4Var, final int i) {
        e18 e18Var;
        iqb iqbVar2;
        final qi3 qi3Var2;
        final lq0 lq0Var2;
        int i2;
        lq0 lq0Var3;
        qi3 qi3Var3;
        iqb iqbVar3;
        wz5 wz5Var;
        qi3 qi3Var4;
        final int i3;
        WiggleArtifactIdentifier identifier;
        wz5 wz5Var2 = xp0Var.q;
        bz7Var.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        kg3Var.getClass();
        bz7Var2.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(429175237);
        int i4 = i | (e18Var2.f(xp0Var) ? 4 : 2) | (e18Var2.g(z) ? 32 : 16) | (e18Var2.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var2.h(zy7Var2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var2.h(kg3Var) ? 131072 : 65536) | 1572864 | (e18Var2.c(f) ? 8388608 : 4194304) | (e18Var2.h(bz7Var2) ? 67108864 : 33554432) | 268435456;
        if (e18Var2.Q(i4 & 1, (306783379 & i4) != 306783378)) {
            e18Var2.V();
            int i5 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i5 == 0 || e18Var2.A()) {
                m7f m7fVarN = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF = e18Var2.f(null) | e18Var2.f(m7fVarN);
                Object objN = e18Var2.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(qi3.class), null, null);
                    e18Var2.k0(objN);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                qi3 qi3Var5 = (qi3) objN;
                int i6 = i4 & (-1879048193);
                m7f m7fVarN2 = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF2 = e18Var2.f(null) | e18Var2.f(m7fVarN2);
                Object objN2 = e18Var2.N();
                if (zF2 || objN2 == lz1Var) {
                    objN2 = m7fVarN2.a(jce.a.b(lq0.class), null, null);
                    e18Var2.k0(objN2);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                i2 = i6;
                lq0Var3 = (lq0) objN2;
                qi3Var3 = qi3Var5;
                iqbVar3 = fqb.E;
            } else {
                e18Var2.T();
                iqbVar3 = iqbVar;
                lq0Var3 = lq0Var;
                i2 = i4 & (-1879048193);
                qi3Var3 = qi3Var;
            }
            e18Var2.q();
            boolean zH = e18Var2.h(qi3Var3);
            Object objN3 = e18Var2.N();
            if (zH || objN3 == lz1Var) {
                objN3 = new gw(qi3Var3, null, 3);
                e18Var2.k0(objN3);
            }
            csg.g((bz7) objN3, e18Var2, 0, 1);
            Boolean boolValueOf = Boolean.valueOf(xp0Var.R());
            int i7 = i2 & 14;
            boolean z2 = i7 == 4;
            Object objN4 = e18Var2.N();
            if (z2 || objN4 == lz1Var) {
                wz5Var = wz5Var2;
                objN4 = new kk0(xp0Var, null, 1);
                e18Var2.k0(objN4);
            } else {
                wz5Var = wz5Var2;
            }
            fd9.i(e18Var2, (pz7) objN4, boolValueOf);
            Object objN5 = e18Var2.N();
            if (objN5 == lz1Var) {
                objN5 = (Integer) wz5Var.getValue();
                e18Var2.k0(objN5);
            }
            Integer num = (Integer) objN5;
            Integer num2 = (Integer) wz5Var.getValue();
            boolean z3 = i7 == 4;
            Object objN6 = e18Var2.N();
            if (z3 || objN6 == lz1Var) {
                qi3Var4 = qi3Var3;
                objN6 = new g9(xp0Var, num, null, 7);
                e18Var2.k0(objN6);
            } else {
                qi3Var4 = qi3Var3;
            }
            fd9.i(e18Var2, (pz7) objN6, num2);
            final Activity activity = (Activity) e18Var2.j(tca.a);
            umg umgVar = w00.b;
            Context context = (Context) e18Var2.j(umgVar);
            ArtifactBottomSheetParams artifactBottomSheetParams = xp0Var.b;
            ArtifactBottomSheetParams.WiggleFileArtifact wiggleFileArtifact = artifactBottomSheetParams instanceof ArtifactBottomSheetParams.WiggleFileArtifact ? (ArtifactBottomSheetParams.WiggleFileArtifact) artifactBottomSheetParams : null;
            final String encodedPath = (wiggleFileArtifact == null || (identifier = wiggleFileArtifact.getIdentifier()) == null) ? null : identifier.getEncodedPath();
            boolean zF3 = e18Var2.f(activity);
            Object objN7 = e18Var2.N();
            if (zF3 || objN7 == lz1Var) {
                objN7 = Boolean.valueOf(activity != null && mwa.s(activity));
                e18Var2.k0(objN7);
            }
            final boolean zBooleanValue = ((Boolean) objN7).booleanValue();
            boolean zH2 = e18Var2.h(context);
            Object objN8 = e18Var2.N();
            if (zH2 || objN8 == lz1Var) {
                objN8 = new cq0(context, 0);
                e18Var2.k0(objN8);
            }
            final zy7 zy7Var3 = (zy7) objN8;
            boolean zH3 = e18Var2.h(context);
            final lq0 lq0Var4 = lq0Var3;
            Object objN9 = e18Var2.N();
            if (zH3 || objN9 == lz1Var) {
                objN9 = new cq0(context, 1);
                e18Var2.k0(objN9);
            }
            final zy7 zy7Var4 = (zy7) objN9;
            Context context2 = (Context) e18Var2.j(umgVar);
            Object objN10 = e18Var2.N();
            if (objN10 == lz1Var) {
                objN10 = mpk.P(null);
                e18Var2.k0(objN10);
            }
            final nwb nwbVar = (nwb) objN10;
            r65 r65Var = r65.r;
            int i8 = i7 ^ 6;
            boolean zF4 = ((i8 > 4 && e18Var2.f(xp0Var)) || (i2 & 6) == 4) | e18Var2.f(zy7Var3);
            Object objN11 = e18Var2.N();
            if (zF4 || objN11 == lz1Var) {
                final int i9 = 1;
                objN11 = new bz7() { // from class: aq0
                    @Override // defpackage.bz7
                    public final Object invoke(Object obj) {
                        int i10 = i9;
                        iei ieiVar = iei.a;
                        nwb nwbVar2 = nwbVar;
                        switch (i10) {
                            case 0:
                                Uri uri = (Uri) obj;
                                tp0 tp0VarO = (tp0) nwbVar2.getValue();
                                zy7 zy7Var5 = zy7Var3;
                                zy7Var5.getClass();
                                xp0 xp0Var2 = xp0Var;
                                if (tp0VarO == null) {
                                    tp0VarO = xp0Var2.O();
                                }
                                tp0 tp0Var = tp0VarO;
                                if (uri != null) {
                                    gb9.D(xp0Var2.a, null, null, new vp0(tp0Var, xp0Var2, uri, zy7Var5, null, 1), 3);
                                }
                                nwbVar2.setValue(null);
                                break;
                            default:
                                Uri uri2 = (Uri) obj;
                                tp0 tp0VarO2 = (tp0) nwbVar2.getValue();
                                zy7 zy7Var6 = zy7Var3;
                                zy7Var6.getClass();
                                xp0 xp0Var3 = xp0Var;
                                if (tp0VarO2 == null) {
                                    tp0VarO2 = xp0Var3.O();
                                }
                                tp0 tp0Var2 = tp0VarO2;
                                if (uri2 != null) {
                                    gb9.D(xp0Var3.a, null, null, new vp0(tp0Var2, xp0Var3, uri2, zy7Var6, null, 0), 3);
                                }
                                nwbVar2.setValue(null);
                                break;
                        }
                        return ieiVar;
                    }
                };
                e18Var2.k0(objN11);
            }
            xpa xpaVarD0 = sf5.d0(r65Var, (bz7) objN11, e18Var2, 6);
            boolean zH4 = e18Var2.h(context2) | e18Var2.h(xpaVarD0) | e18Var2.f(zy7Var3);
            Object objN12 = e18Var2.N();
            if (zH4 || objN12 == lz1Var) {
                objN12 = new bq0(context2, nwbVar, xpaVarD0, zy7Var3);
                e18Var2.k0(objN12);
            }
            final bz7 bz7Var3 = (bz7) objN12;
            Context context3 = (Context) e18Var2.j(umgVar);
            Object objN13 = e18Var2.N();
            if (objN13 == lz1Var) {
                objN13 = mpk.P(null);
                e18Var2.k0(objN13);
            }
            final nwb nwbVar2 = (nwb) objN13;
            rc rcVar = new rc("application/pdf", 0);
            boolean zF5 = ((i8 > 4 && e18Var2.f(xp0Var)) || (i2 & 6) == 4) | e18Var2.f(zy7Var3);
            Object objN14 = e18Var2.N();
            if (zF5 || objN14 == lz1Var) {
                i3 = 0;
                objN14 = new bz7() { // from class: aq0
                    @Override // defpackage.bz7
                    public final Object invoke(Object obj) {
                        int i10 = i3;
                        iei ieiVar = iei.a;
                        nwb nwbVar22 = nwbVar2;
                        switch (i10) {
                            case 0:
                                Uri uri = (Uri) obj;
                                tp0 tp0VarO = (tp0) nwbVar22.getValue();
                                zy7 zy7Var5 = zy7Var3;
                                zy7Var5.getClass();
                                xp0 xp0Var2 = xp0Var;
                                if (tp0VarO == null) {
                                    tp0VarO = xp0Var2.O();
                                }
                                tp0 tp0Var = tp0VarO;
                                if (uri != null) {
                                    gb9.D(xp0Var2.a, null, null, new vp0(tp0Var, xp0Var2, uri, zy7Var5, null, 1), 3);
                                }
                                nwbVar22.setValue(null);
                                break;
                            default:
                                Uri uri2 = (Uri) obj;
                                tp0 tp0VarO2 = (tp0) nwbVar22.getValue();
                                zy7 zy7Var6 = zy7Var3;
                                zy7Var6.getClass();
                                xp0 xp0Var3 = xp0Var;
                                if (tp0VarO2 == null) {
                                    tp0VarO2 = xp0Var3.O();
                                }
                                tp0 tp0Var2 = tp0VarO2;
                                if (uri2 != null) {
                                    gb9.D(xp0Var3.a, null, null, new vp0(tp0Var2, xp0Var3, uri2, zy7Var6, null, 0), 3);
                                }
                                nwbVar22.setValue(null);
                                break;
                        }
                        return ieiVar;
                    }
                };
                e18Var2.k0(objN14);
            } else {
                i3 = 0;
            }
            xpa xpaVarD02 = sf5.d0(rcVar, (bz7) objN14, e18Var2, i3);
            boolean zH5 = e18Var2.h(xpaVarD02) | e18Var2.h(context3) | e18Var2.f(zy7Var3);
            Object objN15 = e18Var2.N();
            if (zH5 || objN15 == lz1Var) {
                objN15 = new bq0(nwbVar2, xpaVarD02, context3, zy7Var3);
                e18Var2.k0(objN15);
            }
            final bz7 bz7Var4 = (bz7) objN15;
            e18Var = e18Var2;
            iqbVar2 = iqbVar3;
            rqk.a((String) xp0Var.l.getValue(), zy7Var, iqbVar2, f, fd9.q0(-1162522841, new pz7() { // from class: dq0
                /* JADX WARN: Removed duplicated region for block: B:102:0x01c9  */
                /* JADX WARN: Removed duplicated region for block: B:106:0x01e7  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x00c6  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x00ca  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x00e4  */
                /* JADX WARN: Removed duplicated region for block: B:68:0x00eb  */
                /* JADX WARN: Removed duplicated region for block: B:76:0x0102  */
                /* JADX WARN: Removed duplicated region for block: B:80:0x0112  */
                /* JADX WARN: Removed duplicated region for block: B:86:0x0142  */
                /* JADX WARN: Removed duplicated region for block: B:90:0x016b  */
                /* JADX WARN: Removed duplicated region for block: B:94:0x0187  */
                /* JADX WARN: Removed duplicated region for block: B:98:0x01ab  */
                @Override // defpackage.pz7
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r30, java.lang.Object r31) {
                    /*
                        Method dump skipped, instruction units count: 552
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.dq0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, e18Var2), fd9.q0(-1193390920, new qe(xp0Var, z, zy7Var2, kg3Var, 1), e18Var2), e18Var, ((i2 >> 6) & 112) | 221568 | ((i2 >> 12) & 7168), 0);
            lq0Var2 = lq0Var4;
            qi3Var2 = qi3Var4;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
            qi3Var2 = qi3Var;
            lq0Var2 = lq0Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            final iqb iqbVar4 = iqbVar2;
            r7eVarS.d = new pz7(z, bz7Var, zy7Var, zy7Var2, kg3Var, iqbVar4, f, bz7Var2, qi3Var2, lq0Var2, i) { // from class: eq0
                public final /* synthetic */ boolean F;
                public final /* synthetic */ bz7 G;
                public final /* synthetic */ zy7 H;
                public final /* synthetic */ zy7 I;
                public final /* synthetic */ kg3 J;
                public final /* synthetic */ iqb K;
                public final /* synthetic */ float L;
                public final /* synthetic */ bz7 M;
                public final /* synthetic */ qi3 N;
                public final /* synthetic */ lq0 O;

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(262145);
                    a.a(this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, (ld4) obj, iP0);
                    return iei.a;
                }
            };
        }
    }

    public static final void b(s64 s64Var, xp0 xp0Var, boolean z, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, zy7 zy7Var4, kg3 kg3Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        boolean z2;
        lz1 lz1Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1924144481);
        if ((i & 6) == 0) {
            i2 = (e18Var2.f(s64Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.f(xp0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var2.h(zy7Var2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((i & 196608) == 0) {
            i2 |= e18Var2.h(zy7Var3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= e18Var2.h(zy7Var4) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= (16777216 & i) == 0 ? e18Var2.f(kg3Var) : e18Var2.h(kg3Var) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if (e18Var2.Q(i3 & 1, (4793491 & i3) != 4793490)) {
            int i4 = i3 << 3;
            rqk.h(s64Var, xp0Var.O(), xp0Var.R(), z, zy7Var, fd9.q0(-1100676577, new xe(xp0Var, kg3Var, zy7Var2, zy7Var3, zy7Var4, 3), e18Var2), e18Var2, (i3 & 14) | 196608 | (i4 & 7168) | (i4 & 57344));
            if (xp0Var.O() != null) {
                e18Var2.a0(1555607621);
                boolean zBooleanValue = ((Boolean) xp0Var.n.getValue()).booleanValue();
                fqb fqbVar = fqb.E;
                if (zBooleanValue) {
                    e18Var2.a0(1555637319);
                    int iH = xp0Var.j.h();
                    int iQ = xp0Var.Q();
                    int i5 = i3 & 112;
                    boolean z3 = i5 == 32;
                    Object objN = e18Var2.N();
                    lz1 lz1Var2 = jd4.a;
                    if (z3 || objN == lz1Var2) {
                        lz1Var = lz1Var2;
                        objN = new xn(0, xp0Var, xp0.class, "showPrevious", "showPrevious()V", 0, 11);
                        e18Var2.k0(objN);
                    } else {
                        lz1Var = lz1Var2;
                    }
                    zy7 zy7Var5 = (zy7) ((jm9) objN);
                    boolean z4 = i5 == 32;
                    Object objN2 = e18Var2.N();
                    if (z4 || objN2 == lz1Var) {
                        objN2 = new xn(0, xp0Var, xp0.class, "showNext", "showNext()V", 0, 12);
                        e18Var2.k0(objN2);
                    }
                    z2 = false;
                    rtk.a(iH, iQ, zy7Var5, (zy7) ((jm9) objN2), androidx.compose.foundation.layout.b.c(fqbVar, 1.0f), null, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var2, 24576);
                    e18Var = e18Var2;
                    e18Var.p(false);
                } else {
                    z2 = false;
                    e18Var = e18Var2;
                    sq6.A(2.0f, 1555946668, e18Var, e18Var, fqbVar);
                    e18Var.p(false);
                }
                e18Var.p(z2);
            } else {
                e18Var = e18Var2;
                e18Var.a0(1556003553);
                e18Var.p(false);
            }
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pq(s64Var, xp0Var, z, zy7Var, zy7Var2, zy7Var3, zy7Var4, kg3Var, i);
        }
    }
}
