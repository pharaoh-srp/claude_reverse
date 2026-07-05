package com.anthropic.claude.code.remote.bottomsheet;

import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.code.remote.bottomsheet.CodeRemoteBottomSheetDestination;
import com.anthropic.claude.code.remote.bottomsheet.a;
import com.anthropic.claude.code.remote.i;
import com.anthropic.claude.code.remote.stores.SessionTarget;
import com.anthropic.claude.sessions.types.BridgeEnvironmentInfo;
import com.anthropic.claude.sessions.types.EnvironmentResource;
import com.anthropic.claude.sessions.types.GitHubBranch;
import com.anthropic.claude.sessions.types.RepoWithStatus;
import com.anthropic.claude.sessions.types.SelfHostedRunnerPool;
import com.anthropic.claude.types.strings.SessionId;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.a1a;
import defpackage.amk;
import defpackage.axe;
import defpackage.ay3;
import defpackage.az3;
import defpackage.b55;
import defpackage.bpc;
import defpackage.bt7;
import defpackage.bx;
import defpackage.bx1;
import defpackage.by3;
import defpackage.bz3;
import defpackage.bz7;
import defpackage.c0l;
import defpackage.cd4;
import defpackage.cv8;
import defpackage.cxe;
import defpackage.cy3;
import defpackage.cz3;
import defpackage.d4c;
import defpackage.d54;
import defpackage.d7;
import defpackage.dd4;
import defpackage.di;
import defpackage.ds0;
import defpackage.dtj;
import defpackage.dw1;
import defpackage.dy3;
import defpackage.dz3;
import defpackage.e12;
import defpackage.e18;
import defpackage.ebh;
import defpackage.ed3;
import defpackage.ef2;
import defpackage.eo0;
import defpackage.ey3;
import defpackage.ez1;
import defpackage.f7;
import defpackage.fd9;
import defpackage.fdh;
import defpackage.ffh;
import defpackage.fk1;
import defpackage.fqb;
import defpackage.fxe;
import defpackage.fy3;
import defpackage.fz3;
import defpackage.gb9;
import defpackage.gm3;
import defpackage.gr9;
import defpackage.gwj;
import defpackage.gwk;
import defpackage.hi4;
import defpackage.ho0;
import defpackage.ho4;
import defpackage.hre;
import defpackage.hw9;
import defpackage.hyc;
import defpackage.i4g;
import defpackage.ie;
import defpackage.iei;
import defpackage.ij0;
import defpackage.ijk;
import defpackage.ik1;
import defpackage.im6;
import defpackage.iqb;
import defpackage.iv;
import defpackage.iv1;
import defpackage.jce;
import defpackage.jd4;
import defpackage.ji;
import defpackage.jm3;
import defpackage.jm9;
import defpackage.jwf;
import defpackage.jz0;
import defpackage.k2e;
import defpackage.kce;
import defpackage.kgh;
import defpackage.kh2;
import defpackage.kk0;
import defpackage.kl1;
import defpackage.kn;
import defpackage.knk;
import defpackage.ko0;
import defpackage.kp9;
import defpackage.ku;
import defpackage.kw0;
import defpackage.kxk;
import defpackage.l45;
import defpackage.l4h;
import defpackage.ld4;
import defpackage.lja;
import defpackage.lnc;
import defpackage.lnk;
import defpackage.lsc;
import defpackage.lz1;
import defpackage.m4d;
import defpackage.m7f;
import defpackage.mnc;
import defpackage.mp9;
import defpackage.mpk;
import defpackage.mrg;
import defpackage.mu;
import defpackage.n58;
import defpackage.nai;
import defpackage.ntk;
import defpackage.nuk;
import defpackage.nwb;
import defpackage.o5b;
import defpackage.oq5;
import defpackage.p64;
import defpackage.pg1;
import defpackage.pk;
import defpackage.pp;
import defpackage.pq;
import defpackage.ps7;
import defpackage.pz7;
import defpackage.q2d;
import defpackage.q64;
import defpackage.qnc;
import defpackage.qq;
import defpackage.qwe;
import defpackage.qy3;
import defpackage.r73;
import defpackage.r7e;
import defpackage.rc8;
import defpackage.re4;
import defpackage.rvh;
import defpackage.rz7;
import defpackage.s36;
import defpackage.s50;
import defpackage.s64;
import defpackage.sq;
import defpackage.sq6;
import defpackage.sz6;
import defpackage.t36;
import defpackage.t4g;
import defpackage.ta4;
import defpackage.ti7;
import defpackage.tjh;
import defpackage.tkh;
import defpackage.tm;
import defpackage.tp4;
import defpackage.tvk;
import defpackage.u00;
import defpackage.u36;
import defpackage.ud0;
import defpackage.uhk;
import defpackage.ui7;
import defpackage.uuj;
import defpackage.uz7;
import defpackage.v36;
import defpackage.v48;
import defpackage.ve4;
import defpackage.vf2;
import defpackage.vjk;
import defpackage.vo1;
import defpackage.vue;
import defpackage.w00;
import defpackage.w36;
import defpackage.w44;
import defpackage.wd6;
import defpackage.wg6;
import defpackage.wlg;
import defpackage.wo1;
import defpackage.x0a;
import defpackage.x36;
import defpackage.x40;
import defpackage.x44;
import defpackage.x48;
import defpackage.xd;
import defpackage.xhe;
import defpackage.xo1;
import defpackage.xuj;
import defpackage.xuk;
import defpackage.xve;
import defpackage.xvk;
import defpackage.xy3;
import defpackage.yfd;
import defpackage.yih;
import defpackage.yw8;
import defpackage.z29;
import defpackage.z74;
import defpackage.z80;
import defpackage.zni;
import defpackage.zy7;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static final void A(String str, i4g i4gVar, z74 z74Var, ld4 ld4Var, int i) {
        int i2;
        Object hreVar;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1387991596);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(i4gVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            e18Var.V();
            int i3 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i3 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(z74.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                z74Var = (z74) objN;
            } else {
                e18Var.T();
            }
            int i4 = i2 & (-897);
            e18Var.q();
            boolean z = (i4 & 14) == 4;
            Object objN2 = e18Var.N();
            if (z || objN2 == lz1Var) {
                try {
                    hreVar = z74Var.a(str);
                } catch (Throwable th) {
                    hreVar = new hre(th);
                }
                objN2 = (jz0) (hreVar instanceof hre ? null : hreVar);
                e18Var.k0(objN2);
            }
            xvk.c(gb9.I(b.c(fqb.E, 1.0f), i4gVar.b()), fd9.q0(-1034144879, new kn((jz0) objN2, 27, str), e18Var), e18Var, 48, 0);
        } else {
            e18Var.T();
        }
        z74 z74Var2 = z74Var;
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ji(str, i, i4gVar, z74Var2, 14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void B(defpackage.ud0 r30, boolean r31, defpackage.zy7 r32, java.lang.String r33, defpackage.ta4 r34, defpackage.ld4 r35, int r36, int r37) {
        /*
            Method dump skipped, instruction units count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.code.remote.bottomsheet.a.B(ud0, boolean, zy7, java.lang.String, ta4, ld4, int, int):void");
    }

    public static final void C(ud0 ud0Var, String str, yw8 yw8Var, ld4 ld4Var, int i) {
        int i2;
        yw8 yw8Var2;
        yw8 yw8Var3;
        int i3;
        yw8 yw8Var4;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1726020863);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var.f(ud0Var) : e18Var.h(ud0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = 16;
        if ((i & 48) == 0) {
            i2 |= e18Var.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            e18Var.V();
            int i5 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i5 == 0 || e18Var.A()) {
                mrg mrgVar = nai.j;
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(mrgVar) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(yw8.class), mrgVar, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                yw8Var3 = (yw8) objN;
                i3 = i2 & (-897);
            } else {
                e18Var.T();
                i3 = i2 & (-897);
                yw8Var3 = yw8Var;
            }
            e18Var.q();
            boolean z = (i3 & 112) == 32;
            Object objN2 = e18Var.N();
            if (z || objN2 == lz1Var) {
                objN2 = mpk.P(Boolean.FALSE);
                e18Var.k0(objN2);
            }
            nwb nwbVar = (nwb) objN2;
            fqb fqbVar = fqb.E;
            if (str == null || ((Boolean) nwbVar.getValue()).booleanValue()) {
                yw8Var4 = yw8Var3;
                e18Var.a0(539466318);
                ud0 ud0Var2 = ud0.d;
                cv8.b(com.anthropic.claude.design.icon.a.a(ud0Var, e18Var), null, b.o(fqbVar, 20.0f), gm3.a(e18Var).N, e18Var, 440, 0);
                e18Var.p(false);
            } else {
                e18Var.a0(539670887);
                yw8 yw8Var5 = yw8Var3;
                iqb iqbVarO = b.o(fqbVar, 20.0f);
                boolean zF2 = e18Var.f(nwbVar);
                Object objN3 = e18Var.N();
                if (zF2 || objN3 == lz1Var) {
                    objN3 = new x40(i4, nwbVar);
                    e18Var.k0(objN3);
                }
                nuk.d(str, null, iqbVarO, yw8Var5, null, null, null, (bz7) objN3, null, ho4.b, MTTypesetterKt.kLineSkipLimitMultiplier, 0, false, e18Var, ((i3 >> 3) & 14) | 432, 48, 62960);
                yw8Var4 = yw8Var5;
                e18Var.p(false);
            }
            yw8Var2 = yw8Var4;
        } else {
            e18Var.T();
            yw8Var2 = yw8Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ji(ud0Var, i, str, yw8Var2, 13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object D(defpackage.jwf r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, defpackage.vp4 r11) {
        /*
            boolean r0 = r11 instanceof defpackage.lz3
            if (r0 == 0) goto L13
            r0 = r11
            lz3 r0 = (defpackage.lz3) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            lz3 r0 = new lz3
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.F
            int r1 = r0.G
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            dae r5 = r0.E
            defpackage.sf5.h0(r11)
            goto L49
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            return r3
        L2e:
            dae r11 = defpackage.vb7.h(r11)
            r0.E = r11
            r0.G = r2
            nwf r5 = r5.a
            com.anthropic.claude.sessions.types.GitProxyFileRequest r1 = new com.anthropic.claude.sessions.types.GitProxyFileRequest
            r1.<init>(r7, r8, r9, r10)
            java.lang.Object r5 = r5.O(r6, r1, r0)
            m45 r6 = defpackage.m45.E
            if (r5 != r6) goto L46
            return r6
        L46:
            r4 = r11
            r11 = r5
            r5 = r4
        L49:
            com.anthropic.claude.api.result.ApiResult r11 = (com.anthropic.claude.api.result.ApiResult) r11
            boolean r6 = r11 instanceof defpackage.of0
            if (r6 == 0) goto L6c
            of0 r11 = (defpackage.of0) r11
            java.lang.Object r6 = r11.b
            com.anthropic.claude.sessions.types.GitProxyFileResponse r6 = (com.anthropic.claude.sessions.types.GitProxyFileResponse) r6
            java.lang.String r6 = r6.getContent()     // Catch: java.lang.Exception -> L69
            r7 = 0
            byte[] r6 = android.util.Base64.decode(r6, r7)     // Catch: java.lang.Exception -> L69
            java.lang.String r7 = new java.lang.String     // Catch: java.lang.Exception -> L69
            r6.getClass()     // Catch: java.lang.Exception -> L69
            java.nio.charset.Charset r8 = defpackage.dj2.a     // Catch: java.lang.Exception -> L69
            r7.<init>(r6, r8)     // Catch: java.lang.Exception -> L69
            r3 = r7
        L69:
            r5.E = r3
            goto L70
        L6c:
            boolean r6 = r11 instanceof defpackage.nf0
            if (r6 == 0) goto L73
        L70:
            java.lang.Object r5 = r5.E
            return r5
        L73:
            defpackage.wg6.i()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.code.remote.bottomsheet.a.D(jwf, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, vp4):java.lang.Object");
    }

    public static final void a(int i, bz7 bz7Var, boolean z, rc8 rc8Var, ld4 ld4Var, int i2) {
        int i3;
        rc8 rc8Var2;
        q2d q2dVar;
        fqb fqbVar;
        ti7 ti7Var;
        fxe fxeVar;
        lz1 lz1Var;
        boolean z2;
        boolean z3;
        bz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1332191586);
        int i4 = i2 | (e18Var.d(i) ? 4 : 2) | (e18Var.h(bz7Var) ? 32 : 16) | (e18Var.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | FreeTypeConstants.FT_LOAD_NO_RECURSE;
        int i5 = 0;
        if (e18Var.Q(i4 & 1, (i4 & 1171) != 1170)) {
            e18Var.V();
            int i6 = i2 & 1;
            lz1 lz1Var2 = jd4.a;
            if (i6 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var2) {
                    objN = m7fVarN.a(jce.a.b(rc8.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                i3 = i4 & (-7169);
                rc8Var2 = (rc8) objN;
            } else {
                e18Var.T();
                i3 = i4 & (-7169);
                rc8Var2 = rc8Var;
            }
            e18Var.q();
            Context context = (Context) e18Var.j(w00.b);
            int max_per_message_upload_count = amk.c(rc8Var2).getMax_per_message_upload_count();
            boolean z4 = i < max_per_message_upload_count;
            int i7 = i3 & 112;
            boolean zH = e18Var.h(context) | (i7 == 32);
            Object objN2 = e18Var.N();
            if (zH || objN2 == lz1Var2) {
                objN2 = new az3(context, bz7Var, i5);
                e18Var.k0(objN2);
            }
            l4h l4hVarM = u00.M(e18Var, (bz7) objN2);
            int i8 = max_per_message_upload_count - i;
            if (i8 < 1) {
                i8 = 1;
            }
            boolean z5 = i7 == 32;
            Object objN3 = e18Var.N();
            int i9 = 6;
            if (z5 || objN3 == lz1Var2) {
                objN3 = new f7(i9, bz7Var);
                e18Var.k0(objN3);
            }
            q2d q2dVarI = uuj.i(i8, z, (bz7) objN3, e18Var, (i3 >> 3) & 112, 0);
            boolean z6 = i7 == 32;
            Object objN4 = e18Var.N();
            if (z6 || objN4 == lz1Var2) {
                objN4 = new f7(7, bz7Var);
                e18Var.k0(objN4);
            }
            ti7 ti7VarA = ui7.a(null, (bz7) objN4, e18Var, 0, 1);
            ho0 ho0Var = new ho0(12.0f, true, new sz6(1));
            fqb fqbVar2 = fqb.E;
            iqb iqbVarC = b.c(gb9.N(gb9.L(fqbVar2, 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, 7), 1.0f);
            cxe cxeVarA = axe.a(ho0Var, lja.P, e18Var, 6);
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
            fxe fxeVar2 = fxe.a;
            if (l4hVarM != null) {
                e18Var.a0(1698415169);
                bpc bpcVarA = com.anthropic.claude.design.icon.a.a(ud0.A, e18Var);
                String strJ0 = d4c.j0(R.string.upload_camera_button, e18Var);
                boolean zH2 = e18Var.h(l4hVarM);
                Object objN5 = e18Var.N();
                if (zH2 || objN5 == lz1Var2) {
                    objN5 = new r73(0, l4hVarM, l4h.class, "launchCamera", "launchCamera()V", 0, 23);
                    e18Var.k0(objN5);
                }
                e18Var = e18Var;
                rc8Var = rc8Var2;
                ti7Var = ti7VarA;
                z2 = z4;
                lz1Var = lz1Var2;
                q2dVar = q2dVarI;
                fqbVar = fqbVar2;
                fxeVar = fxeVar2;
                xuk.a(bpcVarA, strJ0, z2, (zy7) ((jm9) objN5), fxeVar2.a(fqbVar2, 1.0f, true), null, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var, 8, 480);
                e18Var.p(false);
            } else {
                rc8Var = rc8Var2;
                q2dVar = q2dVarI;
                fqbVar = fqbVar2;
                ti7Var = ti7VarA;
                e18Var = e18Var;
                fxeVar = fxeVar2;
                lz1Var = lz1Var2;
                z2 = z4;
                e18Var.a0(1698721728);
                e18Var.p(false);
            }
            bpc bpcVarA2 = com.anthropic.claude.design.icon.a.a(ud0.B0, e18Var);
            String strJ02 = d4c.j0(R.string.upload_photos_button, e18Var);
            boolean zH3 = e18Var.h(q2dVar);
            Object objN6 = e18Var.N();
            if (zH3 || objN6 == lz1Var) {
                objN6 = new r73(0, q2dVar, q2d.class, "launchMediaPicker", "launchMediaPicker()V", 0, 24);
                e18Var.k0(objN6);
            }
            fqb fqbVar3 = fqbVar;
            fxe fxeVar3 = fxeVar;
            xuk.a(bpcVarA2, strJ02, z2, (zy7) ((jm9) objN6), fxeVar.a(fqbVar3, 1.0f, true), null, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var, 8, 480);
            bpc bpcVarA3 = com.anthropic.claude.design.icon.a.a(ud0.n0, e18Var);
            String strJ03 = d4c.j0(R.string.upload_file_button, e18Var);
            ti7 ti7Var2 = ti7Var;
            boolean zF2 = e18Var.f(ti7Var2);
            Object objN7 = e18Var.N();
            if (zF2 || objN7 == lz1Var) {
                z3 = true;
                objN7 = new ie(ti7Var2, 1);
                e18Var.k0(objN7);
            } else {
                z3 = true;
            }
            xuk.a(bpcVarA3, strJ03, z2, (zy7) objN7, fxeVar3.a(fqbVar3, 1.0f, z3), null, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var, 8, 480);
            e18Var.p(z3);
        } else {
            e18Var.T();
        }
        rc8 rc8Var3 = rc8Var;
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ds0(i, bz7Var, z, rc8Var3, i2);
        }
    }

    public static final void b(GitHubBranch gitHubBranch, boolean z, zy7 zy7Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-60383452);
        int i2 = i | (e18Var.h(gitHubBranch) ? 4 : 2) | (e18Var.g(z) ? 32 : 16) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            fqb fqbVar = fqb.E;
            iqb iqbVarL = gb9.L(androidx.compose.foundation.b.c(b.c(fqbVar, 1.0f), false, null, null, null, zy7Var, 15), MTTypesetterKt.kLineSkipLimitMultiplier, 12.0f, 1);
            wo1 wo1Var = lja.Q;
            cxe cxeVarA = axe.a(new ho0(12.0f, true, new sz6(1)), wo1Var, e18Var, 54);
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
            ho0 ho0Var = new ho0(8.0f, true, new sz6(1));
            if (1.0f <= 0.0d) {
                z29.a("invalid weight; must be greater than zero");
            }
            hw9 hw9Var = new hw9(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            cxe cxeVarA2 = axe.a(ho0Var, wo1Var, e18Var, 54);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, hw9Var);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, cxeVarA2);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            String name = gitHubBranch.getName();
            tkh tkhVar = ((jm3) gm3.c(e18Var).e.E).g;
            long j = gm3.a(e18Var).M;
            if (1.0f <= 0.0d) {
                z29.a("invalid weight; must be greater than zero");
            }
            tjh.b(name, new hw9(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false), j, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, tkhVar, e18Var, 0, 24960, 110584);
            e18Var = e18Var;
            if (gitHubBranch.isDefault()) {
                e18Var.a0(1273628151);
                tjh.b(d4c.j0(R.string.ccr_default_branch_label, e18Var), null, gm3.a(e18Var).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 0, 131066);
                e18Var = e18Var;
                e18Var.p(false);
            } else {
                e18Var.a0(1273856342);
                e18Var.p(false);
            }
            e18Var.p(true);
            if (z) {
                e18Var.a0(-1516622237);
                cv8.b(com.anthropic.claude.design.icon.a.a(ud0.L, e18Var), null, b.o(fqbVar, 20.0f), gm3.a(e18Var).N, e18Var, 440, 0);
                e18Var.p(false);
            } else {
                e18Var.a0(-1516405702);
                e18Var.p(false);
            }
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new iv((Object) gitHubBranch, z, zy7Var, i, 7);
        }
    }

    public static final void c(yih yihVar, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1091693792);
        int i2 = (e18Var2.f(iqbVar) ? 32 : 16) | i;
        if (e18Var2.Q(i2 & 1, (i2 & 19) != 18)) {
            e18Var = e18Var2;
            gwk.f(yihVar, b.c(iqbVar, 1.0f), null, true, d4c.j0(R.string.ccr_search_branches, e18Var2), null, gm3.a(e18Var2).v, gm3.a(e18Var2).n, gm3.a(e18Var2).M, gm3.a(e18Var2).O, gm3.a(e18Var2).O, null, xve.b(8.0f), e18Var, 3078, 2084);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new dy3(yihVar, iqbVar, i, 1);
        }
    }

    public static final void d(bx1 bx1Var, i4g i4gVar, GitHubBranch gitHubBranch, bz7 bz7Var, x0a x0aVar, boolean z, ld4 ld4Var, int i) {
        e18 e18Var;
        Object kuVar;
        yih yihVar;
        int i2;
        lz1 lz1Var;
        int i3;
        int i4;
        tp4 tp4Var;
        List listA;
        int i5;
        boolean z2;
        boolean z3;
        bx1 bx1Var2 = bx1Var;
        lnc lncVar = c0l.Q;
        bx1Var2.getClass();
        lsc lscVar = bx1Var2.i;
        i4gVar.getClass();
        bz7Var.getClass();
        x0aVar.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1263232949);
        int i6 = (i & 6) == 0 ? (e18Var2.f(bx1Var2) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i6 |= e18Var2.f(i4gVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i6 |= e18Var2.h(gitHubBranch) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i6 |= e18Var2.h(bz7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i6 |= e18Var2.f(x0aVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i6 |= e18Var2.g(z) ? 131072 : 65536;
        }
        if (e18Var2.Q(i6 & 1, (74899 & i6) != 74898)) {
            Object objN = e18Var2.N();
            lz1 lz1Var2 = jd4.a;
            if (objN == lz1Var2) {
                objN = new yih((String) null, 3);
                e18Var2.k0(objN);
            }
            yih yihVar2 = (yih) objN;
            Object objN2 = e18Var2.N();
            if (objN2 == lz1Var2) {
                objN2 = ij0.d(e18Var2);
            }
            bt7 bt7Var = (bt7) objN2;
            Object objN3 = e18Var2.N();
            if (objN3 == lz1Var2) {
                objN3 = fd9.O(im6.E, e18Var2);
                e18Var2.k0(objN3);
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            int i7 = i6 & 458752;
            int i8 = i6 & 14;
            boolean z4 = (i7 == 131072) | (i8 == 4);
            Object objN4 = e18Var2.N();
            if (z4 || objN4 == lz1Var2) {
                yihVar = yihVar2;
                i2 = i6;
                lz1Var = lz1Var2;
                i3 = 131072;
                i4 = i8;
                tp4Var = null;
                kuVar = new ku(z, yihVar, bx1Var2, tp4Var, 10);
                bx1Var2 = bx1Var2;
                e18Var2.k0(kuVar);
            } else {
                i2 = i6;
                yihVar = yihVar2;
                i4 = i8;
                kuVar = objN4;
                tp4Var = null;
                i3 = 131072;
                lz1Var = lz1Var2;
            }
            fd9.i(e18Var2, (pz7) kuVar, boolValueOf);
            Object objN5 = e18Var2.N();
            if (objN5 == lz1Var) {
                objN5 = mpk.w(new ik1(x0aVar, 23, bx1Var2));
                e18Var2.k0(objN5);
            }
            wlg wlgVar = (wlg) objN5;
            Boolean bool = (Boolean) wlgVar.getValue();
            bool.getClass();
            boolean z5 = i4 == 4;
            Object objN6 = e18Var2.N();
            if (z5 || objN6 == lz1Var) {
                objN6 = new ed3(bx1Var2, wlgVar, tp4Var, 5);
                e18Var2.k0(objN6);
            }
            fd9.i(e18Var2, (pz7) objN6, bool);
            if (z) {
                e18Var2.a0(470839981);
                Object objN7 = e18Var2.N();
                if (objN7 == lz1Var) {
                    z3 = false;
                    objN7 = new fz3(bt7Var, tp4Var, false ? 1 : 0);
                    e18Var2.k0(objN7);
                } else {
                    z3 = false;
                }
                fd9.i(e18Var2, (pz7) objN7, iei.a);
                e18Var2.p(z3);
            } else {
                e18Var2.a0(470932237);
                e18Var2.p(false);
            }
            boolean zF = e18Var2.f(bx1Var2.a()) | e18Var2.f(gitHubBranch) | (i7 == i3);
            Object objN8 = e18Var2.N();
            if (zF || objN8 == lz1Var) {
                if (gitHubBranch == null || z) {
                    listA = bx1Var2.a();
                } else {
                    List listA2 = bx1Var2.a();
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : listA2) {
                        if (x44.r(((GitHubBranch) obj).getName(), gitHubBranch.getName())) {
                            arrayList.add(obj);
                        } else {
                            arrayList2.add(obj);
                        }
                    }
                    boolean zIsEmpty = arrayList.isEmpty();
                    List listW = arrayList;
                    if (zIsEmpty) {
                        listW = x44.W(gitHubBranch);
                    }
                    listA = w44.a1(listW, arrayList2);
                }
                objN8 = listA;
                e18Var2.k0(objN8);
            }
            List list = (List) objN8;
            fqb fqbVar = fqb.E;
            iqb iqbVarI = gb9.I(b.c(fqbVar, 1.0f), i4gVar.b());
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var2, 0);
            lz1 lz1Var3 = lz1Var;
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
            if (bx1Var2.b() && !((Boolean) lscVar.getValue()).booleanValue()) {
                e18Var2.a0(975943285);
                mnc.a.getClass();
                r(lncVar, e18Var2, 6);
                e18Var2.p(false);
            } else if (((Throwable) bx1Var2.j.getValue()) != null && bx1Var2.a().isEmpty()) {
                e18Var2.a0(976088427);
                String strJ0 = d4c.j0(R.string.ccr_failed_to_load_branches, e18Var2);
                mnc.a.getClass();
                o(strJ0, lncVar, e18Var2, 48);
                e18Var2.p(false);
            } else if (!bx1Var2.b() && ((Boolean) lscVar.getValue()).booleanValue() && bx1Var2.a().isEmpty()) {
                e18Var2.a0(976387825);
                String strJ02 = d4c.j0(R.string.ccr_no_branches_found, e18Var2);
                mnc.a.getClass();
                l(strJ02, lncVar, e18Var2, 48);
                e18Var2.p(false);
            } else {
                e18Var2.a0(976670359);
                int i9 = i2;
                int i10 = i4;
                wd6.H(s64.a, z, null, null, null, null, fd9.q0(548235972, new xy3(yihVar, bt7Var, 1), e18Var2), e18Var2, 1572870 | ((i2 >> 12) & 112), 30);
                e18Var = e18Var2;
                iqb iqbVarC = b.c(fqbVar, 1.0f);
                boolean zH = (i7 == 131072) | (i10 == 4) | e18Var.h(list) | e18Var.h(gitHubBranch) | ((i9 & 7168) == 2048);
                Object objN9 = e18Var.N();
                if (zH || objN9 == lz1Var3) {
                    i5 = i9;
                    z2 = true;
                    fk1 fk1Var = new fk1(bx1Var, z, list, gitHubBranch, bz7Var);
                    e18Var.k0(fk1Var);
                    objN9 = fk1Var;
                } else {
                    i5 = i9;
                    z2 = true;
                }
                knk.h(iqbVarC, x0aVar, null, false, null, null, null, false, null, (bz7) objN9, e18Var, ((i5 >> 9) & 112) | 6, 508);
                e18Var.p(false);
                e18Var.p(z2);
            }
            e18Var = e18Var2;
            z2 = true;
            e18Var.p(z2);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pg1(bx1Var, i4gVar, gitHubBranch, bz7Var, x0aVar, z, i, 5);
        }
    }

    public static final void e(kh2 kh2Var, String str, boolean z, zy7 zy7Var, ld4 ld4Var, int i) {
        zy7 zy7Var2;
        boolean z2;
        ud0 ud0Var;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-2111903162);
        int i2 = (e18Var.d(kh2Var.ordinal()) ? 4 : 2) | i | (e18Var.f(str) ? 32 : 16) | (e18Var.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            int iOrdinal = kh2Var.ordinal();
            if (iOrdinal == 0) {
                ud0Var = ud0.t0;
            } else {
                if (iOrdinal != 1) {
                    wg6.i();
                    return;
                }
                ud0Var = ud0.M;
            }
            int i3 = i2 >> 3;
            B(ud0Var, z, zy7Var, null, fd9.q0(-1477465656, new pp(str, 7), e18Var), e18Var, (i3 & 112) | 24576 | (i3 & 896), 8);
            z2 = z;
            zy7Var2 = zy7Var;
        } else {
            zy7Var2 = zy7Var;
            z2 = z;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new sq(kh2Var, str, z2, zy7Var2, i);
        }
    }

    public static final void f(final t4g t4gVar, final i iVar, final hi4 hi4Var, final xhe xheVar, final com.anthropic.claude.code.remote.stores.b bVar, final bx1 bx1Var, final bz7 bz7Var, final bz7 bz7Var2, final bz7 bz7Var3, final bz7 bz7Var4, final bz7 bz7Var5, final bz7 bz7Var6, final bz7 bz7Var7, final zy7 zy7Var, final bz7 bz7Var8, final bz7 bz7Var9, final zy7 zy7Var2, final bz7 bz7Var10, ld4 ld4Var, final int i, final int i2) {
        int i3;
        bz7 bz7Var11;
        t4gVar.getClass();
        xheVar.getClass();
        bVar.getClass();
        bx1Var.getClass();
        bz7Var.getClass();
        bz7Var2.getClass();
        bz7Var3.getClass();
        bz7Var4.getClass();
        bz7Var5.getClass();
        bz7Var6.getClass();
        bz7Var7.getClass();
        zy7Var.getClass();
        bz7Var8.getClass();
        bz7Var9.getClass();
        zy7Var2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1113225892);
        int i4 = i | (e18Var.f(t4gVar) ? 4 : 2) | (e18Var.f(iVar) ? 32 : 16) | (e18Var.h(hi4Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.f(xheVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        boolean zF = e18Var.f(bVar);
        int i5 = FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        int i6 = i4 | (zF ? 16384 : 8192) | (e18Var.f(bx1Var) ? 131072 : 65536) | (e18Var.h(bz7Var) ? 1048576 : 524288) | (e18Var.h(bz7Var2) ? 8388608 : 4194304) | (e18Var.h(bz7Var3) ? 67108864 : 33554432) | (e18Var.h(bz7Var4) ? 536870912 : 268435456);
        if ((i2 & 6) == 0) {
            i3 = i2 | (e18Var.h(bz7Var5) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var.h(bz7Var6) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            bz7Var11 = bz7Var7;
            i3 |= e18Var.h(bz7Var11) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            bz7Var11 = bz7Var7;
        }
        if ((i2 & 3072) == 0) {
            i3 |= e18Var.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i2 & 24576) == 0) {
            if (e18Var.h(bz7Var8)) {
                i5 = 16384;
            }
            i3 |= i5;
        }
        if ((i2 & 196608) == 0) {
            i3 |= e18Var.h(bz7Var9) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= e18Var.h(zy7Var2) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= e18Var.h(bz7Var10) ? 8388608 : 4194304;
        }
        if (e18Var.Q(i6 & 1, ((i6 & 306783379) == 306783378 && (i3 & 4793491) == 4793490) ? false : true)) {
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = mpk.P("");
                e18Var.k0(objN);
            }
            final nwb nwbVar = (nwb) objN;
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = mpk.P(Boolean.FALSE);
                e18Var.k0(objN2);
            }
            final nwb nwbVar2 = (nwb) objN2;
            final x0a x0aVarA = a1a.a(0, 3, e18Var);
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = fd9.O(im6.E, e18Var);
                e18Var.k0(objN3);
            }
            final l45 l45Var = (l45) objN3;
            m7f m7fVar = (m7f) e18Var.j(gr9.b);
            boolean zH = e18Var.h(m7fVar);
            Object objN4 = e18Var.N();
            if (zH || objN4 == lz1Var) {
                objN4 = new di(m7fVar, 11);
                e18Var.k0(objN4);
            }
            kce kceVar = jce.a;
            final b55 b55Var = (b55) fd9.r0(kceVar.b(b55.class), oq5.B(kceVar.b(b55.class)), (bz7) objN4, e18Var);
            final bz7 bz7Var12 = bz7Var11;
            qwe.a(t4gVar, null, null, false, b55Var.g, new rz7() { // from class: zx3
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r4v0, types: [tp4] */
                /* JADX WARN: Type inference failed for: r4v1 */
                /* JADX WARN: Type inference failed for: r4v2 */
                /* JADX WARN: Type inference failed for: r4v34 */
                /* JADX WARN: Type inference failed for: r4v35 */
                /* JADX WARN: Type inference failed for: r4v36 */
                /* JADX WARN: Type inference failed for: r4v4 */
                @Override // defpackage.rz7
                public final Object invoke(Object obj, Object obj2, Object obj3) throws IOException {
                    kwe kweVar;
                    kwe kweVar2;
                    kwe kweVar3;
                    kwe kweVar4;
                    ?? N;
                    Object next;
                    final CodeRemoteBottomSheetDestination codeRemoteBottomSheetDestination = (CodeRemoteBottomSheetDestination) obj;
                    int iIntValue = ((Integer) obj3).intValue();
                    codeRemoteBottomSheetDestination.getClass();
                    e18 e18Var2 = (e18) ((ld4) obj2);
                    e18Var2.a0(1834113471);
                    ?? r4 = 0;
                    kwe kweVar5 = null;
                    ta4 ta4VarQ0 = null;
                    final int i7 = 0;
                    if (codeRemoteBottomSheetDestination.equals(CodeRemoteBottomSheetDestination.Closed.a)) {
                        e18Var2.a0(-499424834);
                        e18Var2.p(false);
                    } else {
                        boolean zEquals = codeRemoteBottomSheetDestination.equals(CodeRemoteBottomSheetDestination.RepositorySelection.a);
                        final i iVar2 = iVar;
                        final t4g t4gVar2 = t4gVar;
                        int i8 = 2;
                        iei ieiVar = iei.a;
                        lz1 lz1Var2 = jd4.a;
                        if (zEquals) {
                            e18Var2.a0(-499297268);
                            x0a x0aVar = x0aVarA;
                            boolean zF2 = e18Var2.f(x0aVar);
                            Object objN5 = e18Var2.N();
                            nwb nwbVar3 = nwbVar2;
                            Object obj4 = objN5;
                            if (zF2 || objN5 == lz1Var2) {
                                h23 h23Var = new h23(x0aVar, nwbVar3, r4, i8);
                                e18Var2.k0(h23Var);
                                obj4 = h23Var;
                            }
                            fd9.i(e18Var2, (pz7) obj4, ieiVar);
                            kweVar2 = new kwe(d4c.j0(R.string.ccr_select_repository_title, e18Var2), null, uhk.a, fd9.q0(1781152668, new jj2(i8, nwbVar3), e18Var2), null, false, fd9.q0(-541935270, new fw(xheVar, iVar2, bz7Var, t4gVar2, bz7Var2, x0aVar, nwbVar3), e18Var2), 78);
                            e18Var2.p(false);
                        } else {
                            boolean zEquals2 = codeRemoteBottomSheetDestination.equals(CodeRemoteBottomSheetDestination.EnvironmentSelection.a);
                            com.anthropic.claude.code.remote.stores.b bVar2 = bVar;
                            bz7 bz7Var13 = bz7Var3;
                            if (zEquals2) {
                                e18Var2.a0(-497497036);
                                kweVar2 = new kwe(d4c.j0(R.string.ccr_select_environment_title, e18Var2), null, uhk.b, null, null, false, fd9.q0(1915549723, new gn(bVar2, iVar2, bz7Var13, t4gVar2, bz7Var4, zy7Var), e18Var2), 110);
                                e18Var2.p(false);
                            } else {
                                if (codeRemoteBottomSheetDestination instanceof CodeRemoteBottomSheetDestination.PairedActiveSessions) {
                                    e18Var2.a0(-495905372);
                                    Iterator it = bVar2.f().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it.next();
                                        if (x44.r(((EnvironmentResource) next).getEnvironment_id(), ((CodeRemoteBottomSheetDestination.PairedActiveSessions) codeRemoteBottomSheetDestination).a)) {
                                            break;
                                        }
                                    }
                                    EnvironmentResource environmentResource = (EnvironmentResource) next;
                                    List list = (List) ((Map) bVar2.o.getValue()).get(((CodeRemoteBottomSheetDestination.PairedActiveSessions) codeRemoteBottomSheetDestination).a);
                                    if (list == null) {
                                        list = lm6.E;
                                    }
                                    int size = list.size();
                                    int iH = environmentResource != null ? gwj.h(environmentResource) : 1;
                                    String strF0 = d4c.f0(R.plurals.ccr_paired_sessions_subtitle, iH, new Object[]{Integer.valueOf(size), Integer.valueOf(iH)}, e18Var2);
                                    String strL = environmentResource != null ? gwj.l(environmentResource) : null;
                                    String strK = environmentResource != null ? gwj.k(environmentResource) : null;
                                    if (strK == null) {
                                        strK = vb7.n(e18Var2, 1646592888, R.string.ccr_paired_active_sessions_title, e18Var2, false);
                                    } else {
                                        e18Var2.a0(1646591245);
                                        e18Var2.p(false);
                                    }
                                    kweVar2 = new kwe(strK, null, fd9.q0(592741695, new ny3(strL, strF0, i7), e18Var2), null, null, false, fd9.q0(78067420, new gn((Object) environmentResource, (Object) bVar2, (Object) codeRemoteBottomSheetDestination, (Object) l45Var, bz7Var13, (Object) t4gVar2, 6), e18Var2), 110);
                                    e18Var2.p(false);
                                } else if (codeRemoteBottomSheetDestination instanceof CodeRemoteBottomSheetDestination.PermissionModeSelection) {
                                    e18Var2.a0(-493984054);
                                    kweVar2 = new kwe(d4c.j0(R.string.ccr_permission_mode_title, e18Var2), null, uhk.c, null, null, false, fd9.q0(-1759414883, new bn(codeRemoteBottomSheetDestination, iVar2, bz7Var6, t4gVar2, 13), e18Var2), 110);
                                    e18Var2.p(false);
                                } else if (codeRemoteBottomSheetDestination instanceof CodeRemoteBottomSheetDestination.ToolCallDetail) {
                                    e18Var2.a0(1646667814);
                                    kweVar2 = new kwe(bwh.c(((CodeRemoteBottomSheetDestination.ToolCallDetail) codeRemoteBottomSheetDestination).a, e18Var2), null, fd9.q0(1212744385, new oy3(codeRemoteBottomSheetDestination, i7), e18Var2), null, null, false, fd9.q0(698070110, new ye(codeRemoteBottomSheetDestination, iVar2, t4gVar2, 21), e18Var2), 110);
                                    e18Var2.p(false);
                                } else if (codeRemoteBottomSheetDestination instanceof CodeRemoteBottomSheetDestination.CollapsedToolCalls) {
                                    e18Var2.a0(-491735531);
                                    g44 g44Var = ((CodeRemoteBottomSheetDestination.CollapsedToolCalls) codeRemoteBottomSheetDestination).a;
                                    g1i g1iVar = g44Var.c;
                                    String str = g1iVar != null ? g1iVar.a : null;
                                    if (str == null) {
                                        e18Var2.a0(-491599131);
                                        List listG = ntk.g(g44Var.d, e18Var2);
                                        Object objN6 = e18Var2.N();
                                        Object obj5 = objN6;
                                        if (objN6 == lz1Var2) {
                                            x2h x2hVar = new x2h(27);
                                            e18Var2.k0(x2hVar);
                                            obj5 = x2hVar;
                                        }
                                        String strS0 = w44.S0(listG, ", ", null, null, (bz7) obj5, 30);
                                        if (bsg.I0(strS0)) {
                                            strS0 = d4c.j0(R.string.ccr_collapsed_steps_title, e18Var2);
                                        }
                                        str = strS0;
                                    } else {
                                        e18Var2.a0(1646706663);
                                    }
                                    e18Var2.p(false);
                                    kweVar2 = new kwe(str, null, null, null, null, false, fd9.q0(-1139412193, new ye(g44Var, iVar2, t4gVar2, 22), e18Var2), 126);
                                    e18Var2.p(false);
                                } else {
                                    final int i9 = 3;
                                    if (codeRemoteBottomSheetDestination instanceof CodeRemoteBottomSheetDestination.InitChecklist) {
                                        e18Var2.a0(-490225242);
                                        CodeRemoteBottomSheetDestination.InitChecklist initChecklist = (CodeRemoteBottomSheetDestination.InitChecklist) codeRemoteBottomSheetDestination;
                                        m29 m29Var = initChecklist.a;
                                        boolean z = initChecklist.b;
                                        m29Var.getClass();
                                        kwe kweVar6 = new kwe(xzk.z(m29Var, z, e18Var2, 0), null, null, null, null, false, fd9.q0(1318072800, new rz7() { // from class: jy3
                                            @Override // defpackage.rz7
                                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                int i10 = i9;
                                                int i11 = 2;
                                                iei ieiVar2 = iei.a;
                                                CodeRemoteBottomSheetDestination codeRemoteBottomSheetDestination2 = codeRemoteBottomSheetDestination;
                                                int i12 = 1;
                                                i4g i4gVar = (i4g) obj6;
                                                ld4 ld4Var2 = (ld4) obj7;
                                                int iIntValue2 = ((Integer) obj8).intValue();
                                                switch (i10) {
                                                    case 0:
                                                        i4gVar.getClass();
                                                        e18 e18Var3 = (e18) ld4Var2;
                                                        if (!e18Var3.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                            e18Var3.T();
                                                        } else {
                                                            xvk.c(yfd.p(b.c, gm3.a(e18Var3).p, zni.b), fd9.q0(1633373061, new oy3(codeRemoteBottomSheetDestination2, i11), e18Var3), e18Var3, 48, 0);
                                                        }
                                                        break;
                                                    case 1:
                                                        i4gVar.getClass();
                                                        e18 e18Var4 = (e18) ld4Var2;
                                                        if (!e18Var4.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                            e18Var4.T();
                                                        } else {
                                                            xvk.c(yfd.p(b.c, gm3.a(e18Var4).p, zni.b), fd9.q0(-204109242, new oy3(codeRemoteBottomSheetDestination2, i12), e18Var4), e18Var4, 48, 0);
                                                        }
                                                        break;
                                                    case 2:
                                                        i4gVar.getClass();
                                                        if ((iIntValue2 & 6) == 0) {
                                                            iIntValue2 |= ((e18) ld4Var2).f(i4gVar) ? 4 : 2;
                                                        }
                                                        e18 e18Var5 = (e18) ld4Var2;
                                                        if (!e18Var5.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                            e18Var5.T();
                                                        } else {
                                                            a.A(((CodeRemoteBottomSheetDestination.ViewThinking) codeRemoteBottomSheetDestination2).a, i4gVar, null, e18Var5, (iIntValue2 << 3) & 112);
                                                        }
                                                        break;
                                                    default:
                                                        i4gVar.getClass();
                                                        if ((iIntValue2 & 6) == 0) {
                                                            iIntValue2 |= ((e18) ld4Var2).f(i4gVar) ? 4 : 2;
                                                        }
                                                        e18 e18Var6 = (e18) ld4Var2;
                                                        if (!e18Var6.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                            e18Var6.T();
                                                        } else {
                                                            CodeRemoteBottomSheetDestination.InitChecklist initChecklist2 = (CodeRemoteBottomSheetDestination.InitChecklist) codeRemoteBottomSheetDestination2;
                                                            xzk.l(initChecklist2.a, initChecklist2.b, gb9.I(fqb.E, i4gVar.b()), e18Var6, 0);
                                                        }
                                                        break;
                                                }
                                                return ieiVar2;
                                            }
                                        }, e18Var2), 254);
                                        e18Var2.p(false);
                                        kweVar5 = kweVar6;
                                    } else if (codeRemoteBottomSheetDestination instanceof CodeRemoteBottomSheetDestination.RenameCodeRemote) {
                                        e18Var2.a0(-489612930);
                                        boolean z2 = (((iIntValue & 14) ^ 6) > 4 && e18Var2.h(codeRemoteBottomSheetDestination)) || (iIntValue & 6) == 4;
                                        Object objN7 = e18Var2.N();
                                        nwb nwbVar4 = nwbVar;
                                        Object obj6 = objN7;
                                        if (z2 || objN7 == lz1Var2) {
                                            py3 py3Var = new py3(codeRemoteBottomSheetDestination, i7, nwbVar4);
                                            e18Var2.k0(py3Var);
                                            obj6 = py3Var;
                                        }
                                        fd9.d(codeRemoteBottomSheetDestination, (bz7) obj6, e18Var2);
                                        String string = bsg.k1((String) nwbVar4.getValue()).toString();
                                        z = string.length() > 0;
                                        String strJ0 = d4c.j0(R.string.ccr_rename_session_title, e18Var2);
                                        ta4 ta4Var = uhk.d;
                                        bz7 bz7Var14 = bz7Var12;
                                        kwe kweVar7 = new kwe(strJ0, null, ta4Var, null, fd9.q0(-130306769, new sy3(bz7Var14, string, z), e18Var2), false, fd9.q0(-519409503, new vy3(z, bz7Var14, string, nwbVar4), e18Var2), 174);
                                        e18Var2.p(false);
                                        kweVar5 = kweVar7;
                                    } else {
                                        boolean zEquals3 = codeRemoteBottomSheetDestination.equals(CodeRemoteBottomSheetDestination.AttachmentOptions.a);
                                        bz7 bz7Var15 = bz7Var8;
                                        if (zEquals3) {
                                            e18Var2.a0(1646830411);
                                            kweVar = new kwe(d4c.j0(R.string.ccr_sheet_add_context, e18Var2), null, null, null, null, false, fd9.q0(1938075490, new gy3(iVar2, t4gVar2, bz7Var15), e18Var2), 254);
                                            e18Var2.p(false);
                                        } else {
                                            boolean zEquals4 = codeRemoteBottomSheetDestination.equals(CodeRemoteBottomSheetDestination.AddContext.a);
                                            b55 b55Var2 = b55Var;
                                            if (zEquals4) {
                                                e18Var2.a0(1646848671);
                                                kweVar = new kwe(d4c.j0(R.string.ccr_sheet_add_context, e18Var2), null, null, null, null, false, fd9.q0(706818496, new bn(b55Var2, iVar2, t4gVar2, bz7Var15, 14), e18Var2), 254);
                                                e18Var2.p(false);
                                            } else {
                                                boolean zEquals5 = codeRemoteBottomSheetDestination.equals(CodeRemoteBottomSheetDestination.Connectors.a);
                                                hi4 hi4Var2 = hi4Var;
                                                if (zEquals5) {
                                                    e18Var2.a0(1646884629);
                                                    String strJ02 = d4c.j0(R.string.connectors_label, e18Var2);
                                                    if (b55Var2.d.b()) {
                                                        e18Var2.a0(-486035964);
                                                        ta4VarQ0 = fd9.q0(-1476751078, new i03(t4gVar2, z ? 1 : 0), e18Var2);
                                                        e18Var2.p(false);
                                                    } else {
                                                        e18Var2.a0(-485506825);
                                                        e18Var2.p(false);
                                                    }
                                                    kweVar2 = new kwe(strJ02, null, null, ta4VarQ0, null, false, fd9.q0(-1130663807, new ye(b55Var2, hi4Var2, iVar2, 23), e18Var2), 94);
                                                    e18Var2.p(false);
                                                } else {
                                                    int i10 = 12;
                                                    if (codeRemoteBottomSheetDestination.equals(CodeRemoteBottomSheetDestination.ConnectorDirectory.a)) {
                                                        e18Var2.a0(-484830002);
                                                        uj4 uj4VarF = xpk.f(e18Var2);
                                                        boolean zH2 = e18Var2.h(uj4VarF) | e18Var2.f(b55Var2);
                                                        Object objN8 = e18Var2.N();
                                                        Object obj7 = objN8;
                                                        if (zH2 || objN8 == lz1Var2) {
                                                            ny nyVar = new ny(uj4VarF, b55Var2, null, 4);
                                                            e18Var2.k0(nyVar);
                                                            obj7 = nyVar;
                                                        }
                                                        csg.g((bz7) obj7, e18Var2, 0, 1);
                                                        kweVar = new kwe(d4c.j0(R.string.connector_directory_title, e18Var2), null, null, fd9.q0(328103232, new m03(uj4VarF, 1), e18Var2), null, false, fd9.q0(1326821186, new ii(uj4VarF, i10, hi4Var2), e18Var2), 94);
                                                        e18Var2.p(false);
                                                    } else if (codeRemoteBottomSheetDestination.equals(CodeRemoteBottomSheetDestination.ModelSelection.a)) {
                                                        e18Var2.a0(1646996353);
                                                        kweVar2 = new kwe(d4c.j0(R.string.ccr_select_model_title, e18Var2), null, null, null, null, false, fd9.q0(-510661117, new gy3(iVar2, bz7Var9, t4gVar2), e18Var2), 126);
                                                        e18Var2.p(false);
                                                    } else {
                                                        if (codeRemoteBottomSheetDestination.equals(CodeRemoteBottomSheetDestination.ShareSession.a)) {
                                                            e18Var2.a0(1647024614);
                                                            kweVar3 = new kwe(d4c.j0(R.string.ccr_share_session_title, e18Var2), null, null, null, null, false, fd9.q0(1946823876, new hy3(i7, bz7Var10, iVar2), e18Var2), 254);
                                                            e18Var2.p(false);
                                                        } else if (codeRemoteBottomSheetDestination.equals(CodeRemoteBottomSheetDestination.BranchSelection.a)) {
                                                            e18Var2.a0(-481306666);
                                                            x0a x0aVarA2 = a1a.a(0, 3, e18Var2);
                                                            Object objN9 = e18Var2.N();
                                                            Object obj8 = objN9;
                                                            if (objN9 == lz1Var2) {
                                                                lsc lscVarP = mpk.P(Boolean.FALSE);
                                                                e18Var2.k0(lscVarP);
                                                                obj8 = lscVarP;
                                                            }
                                                            nwb nwbVar5 = (nwb) obj8;
                                                            boolean zF3 = e18Var2.f(x0aVarA2);
                                                            Object objN10 = e18Var2.N();
                                                            Object obj9 = objN10;
                                                            if (zF3 || objN10 == lz1Var2) {
                                                                h23 h23Var2 = new h23(x0aVarA2, nwbVar5, r4, i9);
                                                                e18Var2.k0(h23Var2);
                                                                obj9 = h23Var2;
                                                            }
                                                            fd9.i(e18Var2, (pz7) obj9, ieiVar);
                                                            kweVar = new kwe(d4c.j0(R.string.ccr_choose_base_branch, e18Var2), null, null, fd9.q0(-889376381, new jj2(z ? 1 : 0, nwbVar5), e18Var2), null, false, fd9.q0(109341573, new gn(iVar2, bx1Var, bz7Var5, t4gVar2, x0aVarA2, nwbVar5), e18Var2), 94);
                                                            e18Var2.p(false);
                                                        } else {
                                                            if (codeRemoteBottomSheetDestination.equals(CodeRemoteBottomSheetDestination.ConnectGitHub.a)) {
                                                                e18Var2.a0(1647110210);
                                                                kweVar4 = new kwe(d4c.j0(R.string.ccr_connect_github_title, e18Var2), null, null, null, null, false, fd9.q0(-1728140730, new tu(8, zy7Var2), e18Var2), 254);
                                                                e18Var2.p(false);
                                                            } else if (codeRemoteBottomSheetDestination.equals(CodeRemoteBottomSheetDestination.DiffView.a)) {
                                                                e18Var2.a0(1647122377);
                                                                kweVar3 = new kwe(d4c.j0(R.string.ccr_diff_title, e18Var2), null, null, null, null, false, fd9.q0(729344263, new iy3(iVar2, i7), e18Var2), 126);
                                                                e18Var2.p(false);
                                                            } else if (codeRemoteBottomSheetDestination instanceof CodeRemoteBottomSheetDestination.ViewCode) {
                                                                e18Var2.a0(1647133414);
                                                                String str2 = ((CodeRemoteBottomSheetDestination.ViewCode) codeRemoteBottomSheetDestination).b;
                                                                if (str2 != null) {
                                                                    if (str2.length() > 0) {
                                                                        r4 = ((Object) unk.j(str2.charAt(0))) + str2.substring(1);
                                                                    } else {
                                                                        r4 = str2;
                                                                    }
                                                                }
                                                                if (r4 == 0) {
                                                                    N = vb7.n(e18Var2, 1647136907, R.string.ccr_view_code_title, e18Var2, false);
                                                                } else {
                                                                    e18Var2.a0(1647134396);
                                                                    e18Var2.p(false);
                                                                    N = r4;
                                                                }
                                                                kweVar4 = new kwe(N, null, null, null, null, false, fd9.q0(-1108138040, new rz7() { // from class: jy3
                                                                    @Override // defpackage.rz7
                                                                    public final Object invoke(Object obj62, Object obj72, Object obj82) {
                                                                        int i102 = i7;
                                                                        int i11 = 2;
                                                                        iei ieiVar2 = iei.a;
                                                                        CodeRemoteBottomSheetDestination codeRemoteBottomSheetDestination2 = codeRemoteBottomSheetDestination;
                                                                        int i12 = 1;
                                                                        i4g i4gVar = (i4g) obj62;
                                                                        ld4 ld4Var2 = (ld4) obj72;
                                                                        int iIntValue2 = ((Integer) obj82).intValue();
                                                                        switch (i102) {
                                                                            case 0:
                                                                                i4gVar.getClass();
                                                                                e18 e18Var3 = (e18) ld4Var2;
                                                                                if (!e18Var3.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                                                    e18Var3.T();
                                                                                } else {
                                                                                    xvk.c(yfd.p(b.c, gm3.a(e18Var3).p, zni.b), fd9.q0(1633373061, new oy3(codeRemoteBottomSheetDestination2, i11), e18Var3), e18Var3, 48, 0);
                                                                                }
                                                                                break;
                                                                            case 1:
                                                                                i4gVar.getClass();
                                                                                e18 e18Var4 = (e18) ld4Var2;
                                                                                if (!e18Var4.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                                                    e18Var4.T();
                                                                                } else {
                                                                                    xvk.c(yfd.p(b.c, gm3.a(e18Var4).p, zni.b), fd9.q0(-204109242, new oy3(codeRemoteBottomSheetDestination2, i12), e18Var4), e18Var4, 48, 0);
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                i4gVar.getClass();
                                                                                if ((iIntValue2 & 6) == 0) {
                                                                                    iIntValue2 |= ((e18) ld4Var2).f(i4gVar) ? 4 : 2;
                                                                                }
                                                                                e18 e18Var5 = (e18) ld4Var2;
                                                                                if (!e18Var5.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                                                    e18Var5.T();
                                                                                } else {
                                                                                    a.A(((CodeRemoteBottomSheetDestination.ViewThinking) codeRemoteBottomSheetDestination2).a, i4gVar, null, e18Var5, (iIntValue2 << 3) & 112);
                                                                                }
                                                                                break;
                                                                            default:
                                                                                i4gVar.getClass();
                                                                                if ((iIntValue2 & 6) == 0) {
                                                                                    iIntValue2 |= ((e18) ld4Var2).f(i4gVar) ? 4 : 2;
                                                                                }
                                                                                e18 e18Var6 = (e18) ld4Var2;
                                                                                if (!e18Var6.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                                                    e18Var6.T();
                                                                                } else {
                                                                                    CodeRemoteBottomSheetDestination.InitChecklist initChecklist2 = (CodeRemoteBottomSheetDestination.InitChecklist) codeRemoteBottomSheetDestination2;
                                                                                    xzk.l(initChecklist2.a, initChecklist2.b, gb9.I(fqb.E, i4gVar.b()), e18Var6, 0);
                                                                                }
                                                                                break;
                                                                        }
                                                                        return ieiVar2;
                                                                    }
                                                                }, e18Var2), 126);
                                                                e18Var2.p(false);
                                                            } else if (codeRemoteBottomSheetDestination instanceof CodeRemoteBottomSheetDestination.ChannelMessage) {
                                                                e18Var2.a0(1647161285);
                                                                String str3 = ((CodeRemoteBottomSheetDestination.ChannelMessage) codeRemoteBottomSheetDestination).a;
                                                                final int i11 = z ? 1 : 0;
                                                                kweVar4 = new kwe(str3, null, null, null, null, false, fd9.q0(1349346953, new rz7() { // from class: jy3
                                                                    @Override // defpackage.rz7
                                                                    public final Object invoke(Object obj62, Object obj72, Object obj82) {
                                                                        int i102 = i11;
                                                                        int i112 = 2;
                                                                        iei ieiVar2 = iei.a;
                                                                        CodeRemoteBottomSheetDestination codeRemoteBottomSheetDestination2 = codeRemoteBottomSheetDestination;
                                                                        int i12 = 1;
                                                                        i4g i4gVar = (i4g) obj62;
                                                                        ld4 ld4Var2 = (ld4) obj72;
                                                                        int iIntValue2 = ((Integer) obj82).intValue();
                                                                        switch (i102) {
                                                                            case 0:
                                                                                i4gVar.getClass();
                                                                                e18 e18Var3 = (e18) ld4Var2;
                                                                                if (!e18Var3.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                                                    e18Var3.T();
                                                                                } else {
                                                                                    xvk.c(yfd.p(b.c, gm3.a(e18Var3).p, zni.b), fd9.q0(1633373061, new oy3(codeRemoteBottomSheetDestination2, i112), e18Var3), e18Var3, 48, 0);
                                                                                }
                                                                                break;
                                                                            case 1:
                                                                                i4gVar.getClass();
                                                                                e18 e18Var4 = (e18) ld4Var2;
                                                                                if (!e18Var4.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                                                    e18Var4.T();
                                                                                } else {
                                                                                    xvk.c(yfd.p(b.c, gm3.a(e18Var4).p, zni.b), fd9.q0(-204109242, new oy3(codeRemoteBottomSheetDestination2, i12), e18Var4), e18Var4, 48, 0);
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                i4gVar.getClass();
                                                                                if ((iIntValue2 & 6) == 0) {
                                                                                    iIntValue2 |= ((e18) ld4Var2).f(i4gVar) ? 4 : 2;
                                                                                }
                                                                                e18 e18Var5 = (e18) ld4Var2;
                                                                                if (!e18Var5.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                                                    e18Var5.T();
                                                                                } else {
                                                                                    a.A(((CodeRemoteBottomSheetDestination.ViewThinking) codeRemoteBottomSheetDestination2).a, i4gVar, null, e18Var5, (iIntValue2 << 3) & 112);
                                                                                }
                                                                                break;
                                                                            default:
                                                                                i4gVar.getClass();
                                                                                if ((iIntValue2 & 6) == 0) {
                                                                                    iIntValue2 |= ((e18) ld4Var2).f(i4gVar) ? 4 : 2;
                                                                                }
                                                                                e18 e18Var6 = (e18) ld4Var2;
                                                                                if (!e18Var6.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                                                    e18Var6.T();
                                                                                } else {
                                                                                    CodeRemoteBottomSheetDestination.InitChecklist initChecklist2 = (CodeRemoteBottomSheetDestination.InitChecklist) codeRemoteBottomSheetDestination2;
                                                                                    xzk.l(initChecklist2.a, initChecklist2.b, gb9.I(fqb.E, i4gVar.b()), e18Var6, 0);
                                                                                }
                                                                                break;
                                                                        }
                                                                        return ieiVar2;
                                                                    }
                                                                }, e18Var2), 126);
                                                                e18Var2.p(false);
                                                            } else if (codeRemoteBottomSheetDestination instanceof CodeRemoteBottomSheetDestination.ChannelEvents) {
                                                                e18Var2.a0(-476850013);
                                                                c44 c44Var = ((CodeRemoteBottomSheetDestination.ChannelEvents) codeRemoteBottomSheetDestination).a;
                                                                kweVar2 = new kwe(g34.g(c44Var.c, c44Var.d.size(), e18Var2, 0), null, null, null, null, false, fd9.q0(-420558049, new ii(c44Var, 13, t4gVar2), e18Var2), 126);
                                                                e18Var2.p(false);
                                                            } else if (codeRemoteBottomSheetDestination instanceof CodeRemoteBottomSheetDestination.ViewThinking) {
                                                                e18Var2.a0(1647228828);
                                                                final int i12 = 2;
                                                                kweVar4 = new kwe(d4c.j0(R.string.ccr_thinking_thought_process, e18Var2), null, null, null, null, false, fd9.q0(2036926944, new rz7() { // from class: jy3
                                                                    @Override // defpackage.rz7
                                                                    public final Object invoke(Object obj62, Object obj72, Object obj82) {
                                                                        int i102 = i12;
                                                                        int i112 = 2;
                                                                        iei ieiVar2 = iei.a;
                                                                        CodeRemoteBottomSheetDestination codeRemoteBottomSheetDestination2 = codeRemoteBottomSheetDestination;
                                                                        int i122 = 1;
                                                                        i4g i4gVar = (i4g) obj62;
                                                                        ld4 ld4Var2 = (ld4) obj72;
                                                                        int iIntValue2 = ((Integer) obj82).intValue();
                                                                        switch (i102) {
                                                                            case 0:
                                                                                i4gVar.getClass();
                                                                                e18 e18Var3 = (e18) ld4Var2;
                                                                                if (!e18Var3.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                                                    e18Var3.T();
                                                                                } else {
                                                                                    xvk.c(yfd.p(b.c, gm3.a(e18Var3).p, zni.b), fd9.q0(1633373061, new oy3(codeRemoteBottomSheetDestination2, i112), e18Var3), e18Var3, 48, 0);
                                                                                }
                                                                                break;
                                                                            case 1:
                                                                                i4gVar.getClass();
                                                                                e18 e18Var4 = (e18) ld4Var2;
                                                                                if (!e18Var4.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                                                    e18Var4.T();
                                                                                } else {
                                                                                    xvk.c(yfd.p(b.c, gm3.a(e18Var4).p, zni.b), fd9.q0(-204109242, new oy3(codeRemoteBottomSheetDestination2, i122), e18Var4), e18Var4, 48, 0);
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                i4gVar.getClass();
                                                                                if ((iIntValue2 & 6) == 0) {
                                                                                    iIntValue2 |= ((e18) ld4Var2).f(i4gVar) ? 4 : 2;
                                                                                }
                                                                                e18 e18Var5 = (e18) ld4Var2;
                                                                                if (!e18Var5.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                                                    e18Var5.T();
                                                                                } else {
                                                                                    a.A(((CodeRemoteBottomSheetDestination.ViewThinking) codeRemoteBottomSheetDestination2).a, i4gVar, null, e18Var5, (iIntValue2 << 3) & 112);
                                                                                }
                                                                                break;
                                                                            default:
                                                                                i4gVar.getClass();
                                                                                if ((iIntValue2 & 6) == 0) {
                                                                                    iIntValue2 |= ((e18) ld4Var2).f(i4gVar) ? 4 : 2;
                                                                                }
                                                                                e18 e18Var6 = (e18) ld4Var2;
                                                                                if (!e18Var6.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                                                    e18Var6.T();
                                                                                } else {
                                                                                    CodeRemoteBottomSheetDestination.InitChecklist initChecklist2 = (CodeRemoteBottomSheetDestination.InitChecklist) codeRemoteBottomSheetDestination2;
                                                                                    xzk.l(initChecklist2.a, initChecklist2.b, gb9.I(fqb.E, i4gVar.b()), e18Var6, 0);
                                                                                }
                                                                                break;
                                                                        }
                                                                        return ieiVar2;
                                                                    }
                                                                }, e18Var2), 254);
                                                                e18Var2.p(false);
                                                            } else if (codeRemoteBottomSheetDestination instanceof CodeRemoteBottomSheetDestination.AttachmentText) {
                                                                e18Var2.a0(-475108867);
                                                                kweVar4 = new kwe(((CodeRemoteBottomSheetDestination.AttachmentText) codeRemoteBottomSheetDestination).a.b(), null, null, null, null, false, fd9.q0(199444641, new ii(codeRemoteBottomSheetDestination, 14, jx1.e(iVar2, null, e18Var2, 0, 2)), e18Var2), 126);
                                                                e18Var2.p(false);
                                                            } else if (codeRemoteBottomSheetDestination instanceof CodeRemoteBottomSheetDestination.AttachmentVideo) {
                                                                e18Var2.a0(1647277786);
                                                                kweVar3 = new kwe(((CodeRemoteBottomSheetDestination.AttachmentVideo) codeRemoteBottomSheetDestination).a.b(), null, null, null, null, false, fd9.q0(-1638037662, new ly3(codeRemoteBottomSheetDestination, iVar2), e18Var2), 126);
                                                                e18Var2.p(false);
                                                            } else if (codeRemoteBottomSheetDestination.equals(CodeRemoteBottomSheetDestination.PlanView.a)) {
                                                                e18Var2.a0(1647303648);
                                                                kweVar3 = new kwe(d4c.j0(R.string.ccr_plan_view_title, e18Var2), null, null, null, null, false, fd9.q0(819447331, new iy3(iVar2, z ? 1 : 0), e18Var2), 254);
                                                                e18Var2.p(false);
                                                            } else if (codeRemoteBottomSheetDestination instanceof CodeRemoteBottomSheetDestination.WorkflowDetail) {
                                                                e18Var2.a0(1647316338);
                                                                kweVar3 = new kwe(d4c.j0(R.string.ccr_workflow_detail_title, e18Var2), null, null, null, null, true, fd9.q0(-1018034972, new ly3(iVar2, codeRemoteBottomSheetDestination), e18Var2), 126);
                                                                e18Var2.p(false);
                                                            } else if (codeRemoteBottomSheetDestination.equals(CodeRemoteBottomSheetDestination.SessionPullRequests.a)) {
                                                                e18Var2.a0(1647336782);
                                                                kweVar2 = new kwe(d4c.j0(R.string.ccr_pull_requests_title, e18Var2), null, null, null, null, false, fd9.q0(1439450021, new rz7() { // from class: my3
                                                                    @Override // defpackage.rz7
                                                                    public final Object invoke(Object obj10, Object obj11, Object obj12) {
                                                                        int i13 = i7;
                                                                        iei ieiVar2 = iei.a;
                                                                        lz1 lz1Var3 = jd4.a;
                                                                        t4g t4gVar3 = t4gVar2;
                                                                        int i14 = 4;
                                                                        switch (i13) {
                                                                            case 0:
                                                                                i4g i4gVar = (i4g) obj10;
                                                                                ld4 ld4Var2 = (ld4) obj11;
                                                                                int iIntValue2 = ((Integer) obj12).intValue();
                                                                                i4gVar.getClass();
                                                                                if ((iIntValue2 & 6) == 0) {
                                                                                    iIntValue2 |= ((e18) ld4Var2).f(i4gVar) ? 4 : 2;
                                                                                }
                                                                                e18 e18Var3 = (e18) ld4Var2;
                                                                                if (!e18Var3.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                                                    e18Var3.T();
                                                                                } else {
                                                                                    eli eliVar = (eli) e18Var3.j(ve4.t);
                                                                                    i iVar3 = iVar2;
                                                                                    List list2 = (List) iVar3.m1.getValue();
                                                                                    boolean zF4 = e18Var3.f(iVar3) | e18Var3.h(eliVar) | e18Var3.h(t4gVar3);
                                                                                    Object objN11 = e18Var3.N();
                                                                                    if (zF4 || objN11 == lz1Var3) {
                                                                                        objN11 = new l6(iVar3, eliVar, t4gVar3, 19);
                                                                                        e18Var3.k0(objN11);
                                                                                    }
                                                                                    ac1.c(list2, (bz7) objN11, i4gVar, null, e18Var3, (iIntValue2 << 6) & 896);
                                                                                }
                                                                                break;
                                                                            default:
                                                                                i4g i4gVar2 = (i4g) obj10;
                                                                                ld4 ld4Var3 = (ld4) obj11;
                                                                                int iIntValue3 = ((Integer) obj12).intValue();
                                                                                i4gVar2.getClass();
                                                                                if ((iIntValue3 & 6) == 0) {
                                                                                    iIntValue3 |= ((e18) ld4Var3).f(i4gVar2) ? 4 : 2;
                                                                                }
                                                                                e18 e18Var4 = (e18) ld4Var3;
                                                                                if (!e18Var4.Q(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                                                                    e18Var4.T();
                                                                                } else {
                                                                                    i iVar4 = iVar2;
                                                                                    n58 n58VarQ0 = iVar4.q0();
                                                                                    tp4 tp4Var = null;
                                                                                    boolean z3 = (n58VarQ0 != null ? n58VarQ0.c : null) instanceof b68;
                                                                                    Boolean boolValueOf = Boolean.valueOf(z3);
                                                                                    boolean zG = e18Var4.g(z3) | e18Var4.h(t4gVar3);
                                                                                    Object objN12 = e18Var4.N();
                                                                                    if (zG || objN12 == lz1Var3) {
                                                                                        objN12 = new nw0(z3, t4gVar3, tp4Var, i14);
                                                                                        e18Var4.k0(objN12);
                                                                                    }
                                                                                    fd9.i(e18Var4, (pz7) objN12, boolValueOf);
                                                                                    boolean zBooleanValue = ((Boolean) iVar4.n1.getValue()).booleanValue();
                                                                                    boolean zBooleanValue2 = ((Boolean) iVar4.o1.getValue()).booleanValue();
                                                                                    boolean zF5 = e18Var4.f(iVar4);
                                                                                    Object objN13 = e18Var4.N();
                                                                                    if (zF5 || objN13 == lz1Var3) {
                                                                                        objN13 = new r73(0, iVar4, i.class, "toggleAutoFix", "toggleAutoFix()V", 0, 25);
                                                                                        e18Var4.k0(objN13);
                                                                                    }
                                                                                    zy7 zy7Var3 = (zy7) ((jm9) objN13);
                                                                                    boolean zF6 = e18Var4.f(iVar4);
                                                                                    Object objN14 = e18Var4.N();
                                                                                    if (zF6 || objN14 == lz1Var3) {
                                                                                        objN14 = new r73(0, iVar4, i.class, "toggleAutoMerge", "toggleAutoMerge()V", 0, 26);
                                                                                        e18Var4.k0(objN14);
                                                                                    }
                                                                                    qwk.b(zBooleanValue, zBooleanValue2, zy7Var3, (zy7) ((jm9) objN14), i4gVar2, e18Var4, (iIntValue3 << 12) & 57344);
                                                                                }
                                                                                break;
                                                                        }
                                                                        return ieiVar2;
                                                                    }
                                                                }, e18Var2), 126);
                                                                e18Var2.p(false);
                                                            } else if (codeRemoteBottomSheetDestination.equals(CodeRemoteBottomSheetDestination.PRAutofix.a)) {
                                                                e18Var2.a0(1647362997);
                                                                String strJ03 = d4c.j0(R.string.ccr_ci_sheet_title, e18Var2);
                                                                final int i13 = z ? 1 : 0;
                                                                kweVar2 = new kwe(strJ03, null, null, null, null, false, fd9.q0(-398032282, new rz7() { // from class: my3
                                                                    @Override // defpackage.rz7
                                                                    public final Object invoke(Object obj10, Object obj11, Object obj12) {
                                                                        int i132 = i13;
                                                                        iei ieiVar2 = iei.a;
                                                                        lz1 lz1Var3 = jd4.a;
                                                                        t4g t4gVar3 = t4gVar2;
                                                                        int i14 = 4;
                                                                        switch (i132) {
                                                                            case 0:
                                                                                i4g i4gVar = (i4g) obj10;
                                                                                ld4 ld4Var2 = (ld4) obj11;
                                                                                int iIntValue2 = ((Integer) obj12).intValue();
                                                                                i4gVar.getClass();
                                                                                if ((iIntValue2 & 6) == 0) {
                                                                                    iIntValue2 |= ((e18) ld4Var2).f(i4gVar) ? 4 : 2;
                                                                                }
                                                                                e18 e18Var3 = (e18) ld4Var2;
                                                                                if (!e18Var3.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                                                    e18Var3.T();
                                                                                } else {
                                                                                    eli eliVar = (eli) e18Var3.j(ve4.t);
                                                                                    i iVar3 = iVar2;
                                                                                    List list2 = (List) iVar3.m1.getValue();
                                                                                    boolean zF4 = e18Var3.f(iVar3) | e18Var3.h(eliVar) | e18Var3.h(t4gVar3);
                                                                                    Object objN11 = e18Var3.N();
                                                                                    if (zF4 || objN11 == lz1Var3) {
                                                                                        objN11 = new l6(iVar3, eliVar, t4gVar3, 19);
                                                                                        e18Var3.k0(objN11);
                                                                                    }
                                                                                    ac1.c(list2, (bz7) objN11, i4gVar, null, e18Var3, (iIntValue2 << 6) & 896);
                                                                                }
                                                                                break;
                                                                            default:
                                                                                i4g i4gVar2 = (i4g) obj10;
                                                                                ld4 ld4Var3 = (ld4) obj11;
                                                                                int iIntValue3 = ((Integer) obj12).intValue();
                                                                                i4gVar2.getClass();
                                                                                if ((iIntValue3 & 6) == 0) {
                                                                                    iIntValue3 |= ((e18) ld4Var3).f(i4gVar2) ? 4 : 2;
                                                                                }
                                                                                e18 e18Var4 = (e18) ld4Var3;
                                                                                if (!e18Var4.Q(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                                                                    e18Var4.T();
                                                                                } else {
                                                                                    i iVar4 = iVar2;
                                                                                    n58 n58VarQ0 = iVar4.q0();
                                                                                    tp4 tp4Var = null;
                                                                                    boolean z3 = (n58VarQ0 != null ? n58VarQ0.c : null) instanceof b68;
                                                                                    Boolean boolValueOf = Boolean.valueOf(z3);
                                                                                    boolean zG = e18Var4.g(z3) | e18Var4.h(t4gVar3);
                                                                                    Object objN12 = e18Var4.N();
                                                                                    if (zG || objN12 == lz1Var3) {
                                                                                        objN12 = new nw0(z3, t4gVar3, tp4Var, i14);
                                                                                        e18Var4.k0(objN12);
                                                                                    }
                                                                                    fd9.i(e18Var4, (pz7) objN12, boolValueOf);
                                                                                    boolean zBooleanValue = ((Boolean) iVar4.n1.getValue()).booleanValue();
                                                                                    boolean zBooleanValue2 = ((Boolean) iVar4.o1.getValue()).booleanValue();
                                                                                    boolean zF5 = e18Var4.f(iVar4);
                                                                                    Object objN13 = e18Var4.N();
                                                                                    if (zF5 || objN13 == lz1Var3) {
                                                                                        objN13 = new r73(0, iVar4, i.class, "toggleAutoFix", "toggleAutoFix()V", 0, 25);
                                                                                        e18Var4.k0(objN13);
                                                                                    }
                                                                                    zy7 zy7Var3 = (zy7) ((jm9) objN13);
                                                                                    boolean zF6 = e18Var4.f(iVar4);
                                                                                    Object objN14 = e18Var4.N();
                                                                                    if (zF6 || objN14 == lz1Var3) {
                                                                                        objN14 = new r73(0, iVar4, i.class, "toggleAutoMerge", "toggleAutoMerge()V", 0, 26);
                                                                                        e18Var4.k0(objN14);
                                                                                    }
                                                                                    qwk.b(zBooleanValue, zBooleanValue2, zy7Var3, (zy7) ((jm9) objN14), i4gVar2, e18Var4, (iIntValue3 << 12) & 57344);
                                                                                }
                                                                                break;
                                                                        }
                                                                        return ieiVar2;
                                                                    }
                                                                }, e18Var2), 126);
                                                                e18Var2.p(false);
                                                            } else {
                                                                if (!(codeRemoteBottomSheetDestination instanceof CodeRemoteBottomSheetDestination.ApprovalDiffDetail)) {
                                                                    throw ebh.u(e18Var2, 1646485605, false);
                                                                }
                                                                e18Var2.a0(-470274758);
                                                                CodeRemoteBottomSheetDestination.ApprovalDiffDetail approvalDiffDetail = (CodeRemoteBottomSheetDestination.ApprovalDiffDetail) codeRemoteBottomSheetDestination;
                                                                String str4 = approvalDiffDetail.a;
                                                                String str5 = approvalDiffDetail.c;
                                                                String str6 = approvalDiffDetail.b;
                                                                boolean zF4 = e18Var2.f(str6) | e18Var2.f(str5) | e18Var2.f(str4);
                                                                Object objN11 = e18Var2.N();
                                                                if (zF4 || objN11 == lz1Var2) {
                                                                    ide ideVar = w48.a;
                                                                    v48 v48VarA = w48.a(str6, str5);
                                                                    fi7 fi7Var = (fi7) w44.N0(v48VarA.a);
                                                                    fi7 fi7Var2 = fi7Var != null ? new fi7(str4, str4, fi7Var.c, fi7Var.d) : null;
                                                                    objN11 = fi7Var2 != null ? new v48(x44.W(fi7Var2)) : v48VarA;
                                                                    e18Var2.k0(objN11);
                                                                }
                                                                v48 v48Var = (v48) objN11;
                                                                Object objN12 = e18Var2.N();
                                                                Object obj10 = objN12;
                                                                if (objN12 == lz1Var2) {
                                                                    vj vjVar = new vj(2, r4, 5);
                                                                    e18Var2.k0(vjVar);
                                                                    obj10 = vjVar;
                                                                }
                                                                kweVar = new kwe(approvalDiffDetail.a, null, null, null, null, false, fd9.q0(2059452711, new nn(i10, xuj.j(v48Var, null, (pz7) obj10, e18Var2, 6)), e18Var2), 126);
                                                                e18Var2.p(false);
                                                            }
                                                            kweVar5 = kweVar4;
                                                        }
                                                        kweVar5 = kweVar3;
                                                    }
                                                }
                                            }
                                        }
                                        kweVar5 = kweVar;
                                    }
                                }
                            }
                        }
                        kweVar5 = kweVar2;
                    }
                    e18Var2.p(false);
                    return kweVar5;
                }
            }, e18Var, i6 & 14, 14);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7(iVar, hi4Var, xheVar, bVar, bx1Var, bz7Var, bz7Var2, bz7Var3, bz7Var4, bz7Var5, bz7Var6, bz7Var7, zy7Var, bz7Var8, bz7Var9, zy7Var2, bz7Var10, i, i2) { // from class: ky3
                public final /* synthetic */ i F;
                public final /* synthetic */ hi4 G;
                public final /* synthetic */ xhe H;
                public final /* synthetic */ com.anthropic.claude.code.remote.stores.b I;
                public final /* synthetic */ bx1 J;
                public final /* synthetic */ bz7 K;
                public final /* synthetic */ bz7 L;
                public final /* synthetic */ bz7 M;
                public final /* synthetic */ bz7 N;
                public final /* synthetic */ bz7 O;
                public final /* synthetic */ bz7 P;
                public final /* synthetic */ bz7 Q;
                public final /* synthetic */ zy7 R;
                public final /* synthetic */ bz7 S;
                public final /* synthetic */ bz7 T;
                public final /* synthetic */ zy7 U;
                public final /* synthetic */ bz7 V;
                public final /* synthetic */ int W;

                {
                    this.W = i2;
                }

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(513);
                    int iP02 = x44.p0(this.W);
                    a.f(this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, (ld4) obj, iP0, iP02);
                    return iei.a;
                }
            };
        }
    }

    public static final void g(rvh rvhVar, boolean z, boolean z2, zy7 zy7Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(535547697);
        int i2 = (e18Var.h(rvhVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= e18Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.g(z2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            ud0 ud0Var = ntk.h(rvhVar).E;
            String str = rvhVar.e;
            ta4 ta4VarQ0 = fd9.q0(-1645399885, new s50(rvhVar, z2, 5), e18Var);
            ud0 ud0Var2 = ud0.d;
            B(ud0Var, z, zy7Var, str, ta4VarQ0, e18Var, (i2 & 112) | 24576 | ((i2 >> 3) & 896), 0);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new cy3(rvhVar, z, z2, zy7Var, i, 0);
        }
    }

    public static final void h(zy7 zy7Var, i4g i4gVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-2040365956);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(zy7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(i4gVar) ? 32 : 16;
        }
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            ho0 ho0Var = new ho0(16.0f, true, new sz6(1));
            fqb fqbVar = fqb.E;
            iqb iqbVarI = gb9.I(b.c(fqbVar, 1.0f), i4gVar.b());
            q64 q64VarA = p64.a(ho0Var, lja.S, e18Var, 6);
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
            d4c.i0(e18Var, cd4.f, q64VarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            tjh.b(d4c.j0(R.string.ccr_connect_github_description, e18Var), null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 0, 0, 131066);
            dtj.a(d4c.j0(R.string.ccr_onboarding_connect_github, e18Var), b.c(fqbVar, 1.0f), false, uhk.n, e12.a, null, 0L, zy7Var, e18Var, ((i2 << 21) & 29360128) | 27696, 100);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new qq((Object) zy7Var, i4gVar, i, 10);
        }
    }

    public static final void i(zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1191447437);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(zy7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            q(d4c.j0(R.string.ccr_create_environment_description, e18Var), d4c.j0(R.string.ccr_create_environment_button, e18Var), zy7Var, e18Var, (i3 << 6) & 8064);
            iqbVar = fqb.E;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new mu(zy7Var, iqbVar, i, 7);
        }
    }

    public static final void j(i iVar, ld4 ld4Var, int i) {
        boolean z;
        boolean z2;
        vo1 vo1Var = lja.T;
        xo1 xo1Var = lja.K;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1304457527);
        int i2 = i | (e18Var.f(iVar) ? 4 : 2);
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            boolean z3 = (i2 & 14) == 4;
            Object objN = e18Var.N();
            if (z3 || objN == jd4.a) {
                objN = new kk0(iVar, null, 17);
                e18Var.k0(objN);
            }
            fd9.i(e18Var, (pz7) objN, iei.a);
            FillElement fillElement = b.c;
            iqb iqbVarP = yfd.p(fillElement, gm3.a(e18Var).o, zni.b);
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarP);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, o5bVarD);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            x36 x36Var = (x36) iVar.r1.getValue();
            boolean z4 = x36Var instanceof u36;
            eo0 eo0Var = ko0.c;
            fqb fqbVar = fqb.E;
            if (z4 || (x36Var instanceof v36)) {
                z = true;
                e18Var.a0(1482164665);
                o5b o5bVarD2 = dw1.d(xo1Var, false);
                int iHashCode2 = Long.hashCode(e18Var.T);
                hyc hycVarL2 = e18Var.l();
                iqb iqbVarE2 = kxk.E(e18Var, fillElement);
                e18Var.e0();
                if (e18Var.S) {
                    e18Var.k(re4Var);
                } else {
                    e18Var.n0();
                }
                d4c.i0(e18Var, z80Var, o5bVarD2);
                d4c.i0(e18Var, z80Var2, hycVarL2);
                ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
                d4c.i0(e18Var, z80Var4, iqbVarE2);
                q64 q64VarA = p64.a(eo0Var, vo1Var, e18Var, 48);
                int iHashCode3 = Long.hashCode(e18Var.T);
                hyc hycVarL3 = e18Var.l();
                iqb iqbVarE3 = kxk.E(e18Var, fqbVar);
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
                ez1.a(null, vf2.J, 0L, e18Var, 48, 5);
                tjh.b(d4c.j0(R.string.ccr_diff_loading, e18Var), gb9.N(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13), gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 48, 0, 131064);
                e18Var = e18Var;
                ij0.w(e18Var, true, true, false);
            } else {
                if (x36Var instanceof s36) {
                    e18Var.a0(1482905472);
                    o5b o5bVarD3 = dw1.d(xo1Var, false);
                    int iHashCode4 = Long.hashCode(e18Var.T);
                    hyc hycVarL4 = e18Var.l();
                    iqb iqbVarE4 = kxk.E(e18Var, fillElement);
                    e18Var.e0();
                    if (e18Var.S) {
                        e18Var.k(re4Var);
                    } else {
                        e18Var.n0();
                    }
                    d4c.i0(e18Var, z80Var, o5bVarD3);
                    d4c.i0(e18Var, z80Var2, hycVarL4);
                    ij0.t(iHashCode4, e18Var, z80Var3, e18Var, bxVar);
                    d4c.i0(e18Var, z80Var4, iqbVarE4);
                    iqb iqbVarJ = gb9.J(fqbVar, 32.0f);
                    q64 q64VarA2 = p64.a(eo0Var, vo1Var, e18Var, 48);
                    int iHashCode5 = Long.hashCode(e18Var.T);
                    hyc hycVarL5 = e18Var.l();
                    iqb iqbVarE5 = kxk.E(e18Var, iqbVarJ);
                    e18Var.e0();
                    if (e18Var.S) {
                        e18Var.k(re4Var);
                    } else {
                        e18Var.n0();
                    }
                    d4c.i0(e18Var, z80Var, q64VarA2);
                    d4c.i0(e18Var, z80Var2, hycVarL5);
                    ij0.t(iHashCode5, e18Var, z80Var3, e18Var, bxVar);
                    d4c.i0(e18Var, z80Var4, iqbVarE5);
                    z2 = true;
                    tjh.b(d4c.j0(R.string.ccr_diff_empty_title, e18Var), null, gm3.a(e18Var).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).d, e18Var, 0, 0, 131066);
                    tjh.b(d4c.j0(R.string.ccr_diff_empty_description, e18Var), gb9.N(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13), gm3.a(e18Var).N, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 48, 0, 130040);
                    e18Var = e18Var;
                    ij0.w(e18Var, true, true, false);
                } else if (x36Var instanceof t36) {
                    e18Var.a0(1484007212);
                    o5b o5bVarD4 = dw1.d(xo1Var, false);
                    int iHashCode6 = Long.hashCode(e18Var.T);
                    hyc hycVarL6 = e18Var.l();
                    iqb iqbVarE6 = kxk.E(e18Var, fillElement);
                    e18Var.e0();
                    if (e18Var.S) {
                        e18Var.k(re4Var);
                    } else {
                        e18Var.n0();
                    }
                    d4c.i0(e18Var, z80Var, o5bVarD4);
                    d4c.i0(e18Var, z80Var2, hycVarL6);
                    ij0.t(iHashCode6, e18Var, z80Var3, e18Var, bxVar);
                    d4c.i0(e18Var, z80Var4, iqbVarE6);
                    iqb iqbVarJ2 = gb9.J(fqbVar, 32.0f);
                    q64 q64VarA3 = p64.a(eo0Var, vo1Var, e18Var, 48);
                    int iHashCode7 = Long.hashCode(e18Var.T);
                    hyc hycVarL7 = e18Var.l();
                    iqb iqbVarE7 = kxk.E(e18Var, iqbVarJ2);
                    e18Var.e0();
                    if (e18Var.S) {
                        e18Var.k(re4Var);
                    } else {
                        e18Var.n0();
                    }
                    d4c.i0(e18Var, z80Var, q64VarA3);
                    d4c.i0(e18Var, z80Var2, hycVarL7);
                    ij0.t(iHashCode7, e18Var, z80Var3, e18Var, bxVar);
                    d4c.i0(e18Var, z80Var4, iqbVarE7);
                    z2 = true;
                    tjh.b(d4c.j0(R.string.ccr_diff_error, e18Var), null, gm3.a(e18Var).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).d, e18Var, 0, 0, 131066);
                    tjh.b(((t36) x36Var).a, gb9.N(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13), gm3.a(e18Var).N, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 48, 0, 130040);
                    e18Var = e18Var;
                    ij0.w(e18Var, true, true, false);
                } else {
                    z2 = true;
                    if (!(x36Var instanceof w36)) {
                        throw ebh.u(e18Var, 1848925170, false);
                    }
                    e18Var.a0(1485024632);
                    k((w36) x36Var, iVar, e18Var, (i2 << 3) & 112);
                    e18Var.p(false);
                }
                z = z2;
            }
            e18Var.p(z);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new qy3(iVar, i);
        }
    }

    public static final void k(w36 w36Var, i iVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(302877651);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var2.f(w36Var) : e18Var2.h(w36Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.f(iVar) ? 32 : 16;
        }
        int i3 = 0;
        if (e18Var2.Q(i2 & 1, (i2 & 19) != 18)) {
            jwf jwfVar = iVar.c;
            n58 n58VarQ0 = iVar.q0();
            String strE0 = iVar.E0();
            ps7 ps7Var = (ps7) e18Var2.j(ve4.i);
            v48 v48Var = w36Var.a;
            List listA0 = iVar.A0();
            int i4 = i2 & 112;
            boolean zH = (i4 == 32) | e18Var2.h(n58VarQ0) | e18Var2.f(strE0 != null ? SessionId.m1114boximpl(strE0) : null) | e18Var2.h(jwfVar);
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (zH || objN == lz1Var) {
                tm tmVar = new tm(n58VarQ0, strE0, jwfVar, iVar, (tp4) null);
                e18Var2.k0(tmVar);
                objN = tmVar;
            }
            x48 x48VarJ = xuj.j(v48Var, listA0, (pz7) objN, e18Var2, 4);
            x0a x0aVarA = a1a.a(0, 3, e18Var2);
            FillElement fillElement = b.c;
            boolean z = i4 == 32;
            Object objN2 = e18Var2.N();
            if (z || objN2 == lz1Var) {
                objN2 = new bz3(i3, iVar);
                e18Var2.k0(objN2);
            }
            uz7 uz7Var = (uz7) objN2;
            boolean z2 = i4 == 32;
            Object objN3 = e18Var2.N();
            if (z2 || objN3 == lz1Var) {
                objN3 = new cz3(iVar, i3);
                e18Var2.k0(objN3);
            }
            bz7 bz7Var = (bz7) objN3;
            boolean zH2 = e18Var2.h(ps7Var);
            Object objN4 = e18Var2.N();
            if (zH2 || objN4 == lz1Var) {
                objN4 = new d7(25, ps7Var);
                e18Var2.k0(objN4);
            }
            e18Var = e18Var2;
            xuj.a(x48VarJ, fillElement, x0aVarA, null, false, uz7Var, bz7Var, (zy7) objN4, e18Var, 56, 24);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new qq(w36Var, iVar, i, 12);
        }
    }

    public static final void l(String str, mnc mncVar, ld4 ld4Var, int i) {
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1087751411);
        int i2 = i | (e18Var2.f(str) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= e18Var2.f(mncVar) ? 32 : 16;
        }
        if (e18Var2.Q(i2 & 1, (i2 & 19) != 18)) {
            iqb iqbVarL = gb9.L(gb9.I(b.c(fqb.E, 1.0f), mncVar), MTTypesetterKt.kLineSkipLimitMultiplier, 32.0f, 1);
            q64 q64VarA = p64.a(ko0.c, lja.T, e18Var2, 48);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarL);
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
            tjh.b(str, null, gm3.a(e18Var2).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).g, e18Var2, i2 & 14, 0, 131066);
            e18Var = e18Var2;
            e18Var.p(true);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new by3(str, mncVar, i, 0);
        }
    }

    public static final void m(EnvironmentResource environmentResource, boolean z, zy7 zy7Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1303310869);
        int i2 = i | (e18Var.h(environmentResource) ? 4 : 2) | (e18Var.g(z) ? 32 : 16) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            iqb iqbVarL = gb9.L(androidx.compose.foundation.b.c(b.c(fqb.E, 1.0f), false, null, new vue(3), null, zy7Var, 11), MTTypesetterKt.kLineSkipLimitMultiplier, 12.0f, 1);
            cxe cxeVarA = axe.a(new ho0(12.0f, true, new sz6(1)), lja.Q, e18Var, 54);
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
            iv1.b(ud0.X, null, null, null, gm3.a(e18Var).N, e18Var, 48, 12);
            hw9 hw9Var = new hw9(1.0f, true);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, hw9Var);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, q64VarA);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            tjh.b(environmentResource.getName(), null, gm3.a(e18Var).M, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 0, 24960, 110586);
            String lowerCase = environmentResource.getKind().name().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            String strReplace = lowerCase.replace('_', ' ');
            strReplace.getClass();
            tjh.b(strReplace, null, gm3.a(e18Var).O, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 24960, 110586);
            e18Var.p(true);
            e18Var = e18Var;
            vjk.b(z, null, null, false, ijk.e(gm3.a(e18Var).c, gm3.a(e18Var).O, 0L, 0L, e18Var, 12), e18Var, ((i2 >> 3) & 14) | 48, 44);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new iv((Object) environmentResource, z, zy7Var, i, 10);
        }
    }

    public static final void n(final com.anthropic.claude.code.remote.stores.b bVar, i4g i4gVar, boolean z, SessionTarget sessionTarget, final bz7 bz7Var, final bz7 bz7Var2, final zy7 zy7Var, final bz7 bz7Var3, ld4 ld4Var, int i) {
        e18 e18Var;
        iqb iqbVar;
        boolean z2;
        SelfHostedRunnerPool pool;
        EnvironmentResource env;
        bVar.getClass();
        i4gVar.getClass();
        bz7Var.getClass();
        bz7Var2.getClass();
        zy7Var.getClass();
        bz7Var3.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1089099232);
        int i2 = (i & 6) == 0 ? (e18Var2.f(bVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= e18Var2.f(i4gVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0 ? e18Var2.f(sessionTarget) : e18Var2.h(sessionTarget) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var2.h(bz7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var2.h(bz7Var2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= e18Var2.h(zy7Var) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= e18Var2.h(bz7Var3) ? 8388608 : 4194304;
        }
        if (e18Var2.Q(i2 & 1, (i2 & 4793491) != 4793490)) {
            SessionTarget.Environment environment = sessionTarget instanceof SessionTarget.Environment ? (SessionTarget.Environment) sessionTarget : null;
            String environment_id = (environment == null || (env = environment.getEnv()) == null) ? null : env.getEnvironment_id();
            SessionTarget.SelfHostedPool selfHostedPool = sessionTarget instanceof SessionTarget.SelfHostedPool ? (SessionTarget.SelfHostedPool) sessionTarget : null;
            final String pool_id = (selfHostedPool == null || (pool = selfHostedPool.getPool()) == null) ? null : pool.getPool_id();
            final List list = (List) bVar.i.getValue();
            final boolean z3 = z && !list.isEmpty();
            fqb fqbVar = fqb.E;
            int i3 = i2;
            iqb iqbVarC = b.c(fqbVar, 1.0f);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var2, 0);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarC);
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
            if (bVar.i() && !bVar.g()) {
                e18Var2.a0(-448729592);
                r(i4gVar.b(), e18Var2, 0);
                e18Var2.p(false);
            } else if (((Throwable) bVar.l.getValue()) != null && bVar.f().isEmpty() && !z3) {
                e18Var2.a0(-448500998);
                o(d4c.j0(R.string.ccr_failed_to_load_environments, e18Var2), i4gVar.b(), e18Var2, 0);
                e18Var2.p(false);
            } else if (!bVar.f().isEmpty() || z3) {
                e18Var2.a0(-447820176);
                List listF = bVar.f();
                final ArrayList arrayList = new ArrayList();
                for (Object obj : listF) {
                    if (!gwj.j((EnvironmentResource) obj)) {
                        arrayList.add(obj);
                    }
                }
                List listF2 = bVar.f();
                final ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listF2) {
                    if (gwj.j((EnvironmentResource) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                iqb iqbVarF = tvk.f(b.c(fqbVar, 1.0f));
                qnc qncVarB = i4gVar.b();
                boolean zH = ((i3 & 29360128) == 8388608) | e18Var2.h(arrayList2) | ((i3 & 14) == 4) | ((i3 & 57344) == 16384) | e18Var2.g(z3) | e18Var2.h(list) | e18Var2.f(pool_id) | ((i3 & 458752) == 131072) | e18Var2.h(arrayList) | e18Var2.f(environment_id) | ((i3 & 3670016) == 1048576);
                Object objN = e18Var2.N();
                if (zH || objN == jd4.a) {
                    iqbVar = iqbVarF;
                    z2 = false;
                    final String str = environment_id;
                    bz7 bz7Var4 = new bz7() { // from class: zy3
                        @Override // defpackage.bz7
                        public final Object invoke(Object obj3) {
                            j0a j0aVar = (j0a) obj3;
                            j0aVar.getClass();
                            ArrayList arrayList3 = arrayList2;
                            boolean zIsEmpty = arrayList3.isEmpty();
                            bz7 bz7Var5 = bz7Var;
                            if (!zIsEmpty) {
                                j0a.V(j0aVar, "paired_section_header", null, uhk.g, 2);
                                j0aVar.W(arrayList3.size(), new kp(new it2(26), 26, arrayList3), new iz3(1, arrayList3), new ta4(802480018, true, new nw(arrayList3, bVar, bz7Var5, bz7Var3, 1)));
                            }
                            boolean z4 = z3;
                            if (z4) {
                                if (!arrayList3.isEmpty()) {
                                    j0a.V(j0aVar, "self_hosted_section_spacer", null, uhk.h, 2);
                                }
                                j0a.V(j0aVar, "self_hosted_section_header", null, uhk.i, 2);
                                it2 it2Var = new it2(27);
                                List list2 = list;
                                j0aVar.W(list2.size(), new kp(it2Var, 27, list2), new tq(list2, 5), new ta4(802480018, true, new uq(list2, pool_id, bz7Var2, 3)));
                            }
                            ArrayList arrayList4 = arrayList;
                            if (!arrayList4.isEmpty()) {
                                if (!arrayList3.isEmpty() || z4) {
                                    j0a.V(j0aVar, "cloud_section_header", null, uhk.j, 2);
                                }
                                j0aVar.W(arrayList4.size(), new kp(new it2(28), 25, arrayList4), new iz3(0, arrayList4), new ta4(802480018, true, new lp(arrayList4, str, bz7Var5, 2)));
                            }
                            j0a.V(j0aVar, "create_env_cta", null, new ta4(294923476, true, new tu(7, zy7Var)), 2);
                            return iei.a;
                        }
                    };
                    e18Var2.k0(bz7Var4);
                    objN = bz7Var4;
                } else {
                    iqbVar = iqbVarF;
                    z2 = false;
                }
                knk.h(iqbVar, null, qncVarB, false, null, null, null, false, null, (bz7) objN, e18Var2, 6, 506);
                e18Var = e18Var2;
                e18Var.p(z2);
                e18Var.p(true);
            } else {
                e18Var2.a0(-448201600);
                l(d4c.j0(R.string.ccr_no_environments_found, e18Var2), i4gVar.b(), e18Var2, 0);
                e18Var2.p(false);
            }
            e18Var = e18Var2;
            e18Var.p(true);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pq(bVar, i4gVar, z, sessionTarget, bz7Var, bz7Var2, zy7Var, bz7Var3, i);
        }
    }

    public static final void o(String str, mnc mncVar, ld4 ld4Var, int i) {
        e18 e18Var;
        int i2;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-302731832);
        int i3 = i | (e18Var2.f(str) ? 4 : 2);
        if ((i & 48) == 0) {
            i3 |= e18Var2.f(mncVar) ? 32 : 16;
        }
        if (e18Var2.Q(i3 & 1, (i3 & 19) != 18)) {
            iqb iqbVarL = gb9.L(gb9.I(b.c(fqb.E, 1.0f), mncVar), MTTypesetterKt.kLineSkipLimitMultiplier, 32.0f, 1);
            q64 q64VarA = p64.a(ko0.c, lja.T, e18Var2, 48);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarL);
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
            tjh.b(str, null, gm3.a(e18Var2).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).g, e18Var2, i3 & 14, 0, 131066);
            e18Var = e18Var2;
            i2 = 1;
            e18Var.p(true);
        } else {
            e18Var = e18Var2;
            i2 = 1;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new by3(str, mncVar, i, i2);
        }
    }

    public static final void p(zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1642107509);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(zy7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            q(d4c.j0(R.string.ccr_github_app_install_description, e18Var), d4c.j0(R.string.ccr_github_app_install_button_repo_picker, e18Var), zy7Var, e18Var, (i3 << 6) & 8064);
            iqbVar = fqb.E;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new mu(zy7Var, iqbVar, i, 8);
        }
    }

    public static final void q(String str, String str2, zy7 zy7Var, ld4 ld4Var, int i) {
        int i2;
        zy7 zy7Var2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-851040654);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            zy7Var2 = zy7Var;
            i2 |= e18Var.h(zy7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            zy7Var2 = zy7Var;
        }
        int i3 = i & 3072;
        fqb fqbVar = fqb.E;
        if (i3 == 0) {
            i2 |= e18Var.f(fqbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            vo1 vo1Var = lja.T;
            iqb iqbVarJ = gb9.J(yfd.p(gb9.L(b.c(fqbVar, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, 1), gm3.a(e18Var).q, xve.b(12.0f)), 16.0f);
            q64 q64VarA = p64.a(ko0.c, vo1Var, e18Var, 48);
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
            tjh.b(str, null, gm3.a(e18Var).O, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, i2 & 14, 0, 130042);
            e18Var = e18Var;
            kxk.g(e18Var, b.e(fqbVar, 8.0f));
            lnk.d(zy7Var2, null, false, null, null, null, null, fd9.q0(-1338003611, new pp(str2, 8), e18Var), e18Var, ((i2 >> 6) & 14) | 805306368, 510);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fy3(str, str2, zy7Var, i, 0);
        }
    }

    public static final void r(mnc mncVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1831255971);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(mncVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 0;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            iqb iqbVarL = gb9.L(gb9.I(b.c(fqb.E, 1.0f), mncVar), MTTypesetterKt.kLineSkipLimitMultiplier, 32.0f, 1);
            q64 q64VarA = p64.a(ko0.c, lja.T, e18Var, 48);
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
            ez1.a(null, vf2.J, 0L, e18Var, 48, 5);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ay3(mncVar, i, i3);
        }
    }

    public static final void s(EnvironmentResource environmentResource, List list, pz7 pz7Var, zy7 zy7Var, i4g i4gVar, ld4 ld4Var, int i) {
        int i2;
        zy7 zy7Var2;
        i4g i4gVar2;
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(378247310);
        if ((i & 6) == 0) {
            i2 = (e18Var2.h(environmentResource) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? e18Var2.f(list) : e18Var2.h(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.h(pz7Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            zy7Var2 = zy7Var;
            i2 |= e18Var2.h(zy7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        } else {
            zy7Var2 = zy7Var;
        }
        if ((i & 24576) == 0) {
            i4gVar2 = i4gVar;
            i2 |= e18Var2.f(i4gVar2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        } else {
            i4gVar2 = i4gVar;
        }
        if (e18Var2.Q(i2 & 1, (i2 & 9363) != 9362)) {
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = mpk.P(null);
                e18Var2.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            Object objN2 = e18Var2.N();
            if (objN2 == lz1Var) {
                objN2 = mpk.P(null);
                e18Var2.k0(objN2);
            }
            nwb nwbVar2 = (nwb) objN2;
            Object objN3 = e18Var2.N();
            if (objN3 == lz1Var) {
                objN3 = mpk.P(null);
                e18Var2.k0(objN3);
            }
            nwb nwbVar3 = (nwb) objN3;
            qnc qncVarB = i4gVar2.b();
            iqb iqbVarC = b.c(fqb.E, 1.0f);
            boolean zH = ((i2 & 112) == 32 || ((i2 & 64) != 0 && e18Var2.h(list))) | ((i2 & 896) == 256) | e18Var2.h(environmentResource) | ((i2 & 7168) == 2048);
            Object objN4 = e18Var2.N();
            if (zH || objN4 == lz1Var) {
                dz3 dz3Var = new dz3(list, environmentResource, nwbVar, pz7Var, nwbVar2, nwbVar3, zy7Var2);
                e18Var2.k0(dz3Var);
                objN4 = dz3Var;
            }
            e18Var = e18Var2;
            knk.h(iqbVarC, null, qncVarB, false, null, null, null, false, null, (bz7) objN4, e18Var, 6, 506);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pk((Object) environmentResource, list, (Object) pz7Var, (Object) zy7Var, (Object) i4gVar, i, 5);
        }
    }

    public static final void t(EnvironmentResource environmentResource, boolean z, int i, boolean z2, zy7 zy7Var, zy7 zy7Var2, ld4 ld4Var, int i2) {
        long j;
        boolean z3;
        long j2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-969488985);
        int i3 = i2 | (e18Var.h(environmentResource) ? 4 : 2) | (e18Var.g(z) ? 32 : 16) | (e18Var.d(i) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.g(z2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.h(zy7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.h(zy7Var2) ? 131072 : 65536);
        if (e18Var.Q(i3 & 1, (74899 & i3) != 74898)) {
            BridgeEnvironmentInfo bridge_info = environmentResource.getBridge_info();
            boolean zR = bridge_info != null ? x44.r(bridge_info.getOnline(), Boolean.FALSE) : false;
            boolean z4 = !zR;
            float f = (zR || z) ? 0.5f : 1.0f;
            if (zR) {
                e18Var.a0(329004462);
                j = gm3.a(e18Var).O;
                e18Var.p(false);
            } else if (z) {
                e18Var.a0(329006100);
                j = gm3.a(e18Var).c;
                e18Var.p(false);
            } else {
                e18Var.a0(329007665);
                j = gm3.a(e18Var).C;
                e18Var.p(false);
            }
            wo1 wo1Var = lja.Q;
            long j3 = j;
            ho0 ho0Var = new ho0(8.0f, true, new sz6(1));
            fqb fqbVar = fqb.E;
            iqb iqbVarL = gb9.L(androidx.compose.foundation.b.c(b.c(fqbVar, 1.0f), z4, null, null, null, (!z || zy7Var2 == null) ? zy7Var : zy7Var2, 14), MTTypesetterKt.kLineSkipLimitMultiplier, 12.0f, 1);
            cxe cxeVarA = axe.a(ho0Var, wo1Var, e18Var, 54);
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
            o5b o5bVarD = dw1.d(lja.O, false);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, fqbVar);
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
            float f2 = f;
            iv1.b(ud0.X, null, null, null, d54.b(f, gm3.a(e18Var).N), e18Var, 48, 12);
            dw1.a(yfd.p(b.o(fqbVar, 6.0f), j3, xve.b(3.0f)), e18Var, 0);
            e18Var.p(true);
            ho0 ho0Var2 = new ho0(5.0f, true, new sz6(1));
            if (1.0f <= 0.0d) {
                z29.a("invalid weight; must be greater than zero");
            }
            hw9 hw9Var = new hw9(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            cxe cxeVarA2 = axe.a(ho0Var2, wo1Var, e18Var, 54);
            int iHashCode3 = Long.hashCode(e18Var.T);
            hyc hycVarL3 = e18Var.l();
            iqb iqbVarE3 = kxk.E(e18Var, hw9Var);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, cxeVarA2);
            d4c.i0(e18Var, z80Var2, hycVarL3);
            ij0.t(iHashCode3, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE3);
            String strK = gwj.k(environmentResource);
            tkh tkhVar = ((jm3) gm3.c(e18Var).e.E).g;
            long jB = d54.b(f2, gm3.a(e18Var).M);
            if (1.0f <= 0.0d) {
                z29.a("invalid weight; must be greater than zero");
            }
            tjh.b(strK, new hw9(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false), jB, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, tkhVar, e18Var, 0, 24960, 110584);
            e18Var = e18Var;
            String strL = gwj.l(environmentResource);
            if (strL == null) {
                e18Var.a0(-1317889531);
                e18Var.p(false);
            } else {
                e18Var.a0(-1317889530);
                tjh.b(strL, null, d54.b(f2, gm3.a(e18Var).O), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 0, 24960, 110586);
                e18Var = e18Var;
                e18Var.p(false);
            }
            e18Var.p(true);
            if (zy7Var2 == null || i <= 0) {
                z3 = true;
                e18Var.a0(719404311);
                e18Var.p(false);
            } else {
                e18Var.a0(718245035);
                boolean z5 = (i3 & 458752) == 131072;
                Object objN = e18Var.N();
                if (z5 || objN == jd4.a) {
                    objN = new kl1(8, zy7Var2);
                    e18Var.k0(objN);
                }
                iqb iqbVarN = gb9.N(androidx.compose.foundation.b.c(fqbVar, z4, null, null, null, (zy7) objN, 14), 8.0f, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 4);
                cxe cxeVarA3 = axe.a(ko0.a, wo1Var, e18Var, 48);
                int iHashCode4 = Long.hashCode(e18Var.T);
                hyc hycVarL4 = e18Var.l();
                iqb iqbVarE4 = kxk.E(e18Var, iqbVarN);
                e18Var.e0();
                if (e18Var.S) {
                    e18Var.k(re4Var);
                } else {
                    e18Var.n0();
                }
                d4c.i0(e18Var, z80Var, cxeVarA3);
                d4c.i0(e18Var, z80Var2, hycVarL4);
                ij0.t(iHashCode4, e18Var, z80Var3, e18Var, bxVar);
                d4c.i0(e18Var, z80Var4, iqbVarE4);
                if (z2) {
                    e18Var.a0(-638679762);
                    String strK0 = d4c.k0(R.string.ccr_paired_capacity_badge, new Object[]{Integer.valueOf(i), Integer.valueOf(gwj.h(environmentResource))}, e18Var);
                    tkh tkhVar2 = ((jm3) gm3.c(e18Var).e.E).i;
                    if (z) {
                        e18Var.a0(-638339165);
                        j2 = gm3.a(e18Var).Q;
                        e18Var.p(false);
                    } else {
                        e18Var.a0(-638248986);
                        j2 = gm3.a(e18Var).O;
                        e18Var.p(false);
                    }
                    e18 e18Var2 = e18Var;
                    tjh.b(strK0, null, j2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar2, e18Var2, 0, 0, 131066);
                    e18Var = e18Var2;
                    e18Var.p(false);
                } else {
                    e18Var.a0(-638129512);
                    e18Var.p(false);
                }
                iv1.b(ud0.C, d4c.j0(R.string.ccr_paired_manage, e18Var), null, ef2.F, gm3.a(e18Var).O, e18Var, 3072, 4);
                z3 = true;
                e18Var.p(true);
                e18Var.p(false);
            }
            e18Var.p(z3);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ey3(environmentResource, z, i, z2, zy7Var, zy7Var2, i2);
        }
    }

    public static final void u(String str, i4g i4gVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-97367602);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(i4gVar) ? 32 : 16;
        }
        if (!e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            e18Var.T();
        } else if (str != null) {
            e18Var.a0(-1575179373);
            m4d.a(str, gb9.N(gb9.I(fqb.E, i4gVar.b()), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, i4gVar.b, 7), null, e18Var, i2 & 14);
            e18Var.p(false);
        } else {
            e18Var.a0(-1574963148);
            e18Var.p(false);
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new qq((Object) str, i4gVar, i, 11);
        }
    }

    public static final void v(String str, bz7 bz7Var, i4g i4gVar, zy7 zy7Var, ld4 ld4Var, int i) {
        String str2;
        int i2;
        i4g i4gVar2;
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1759560235);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (e18Var2.f(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.h(bz7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4gVar2 = i4gVar;
            i2 |= e18Var2.f(i4gVar2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            i4gVar2 = i4gVar;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var2.Q(i2 & 1, (i2 & 1171) != 1170)) {
            fqb fqbVar = fqb.E;
            iqb iqbVarL = gb9.L(gb9.I(b.c(fqbVar, 1.0f), i4gVar2.b()), MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, 1);
            q64 q64VarA = p64.a(new ho0(8.0f, true, new sz6(1)), lja.S, e18Var2, 6);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarL);
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
            int i3 = 0;
            tjh.b(d4c.j0(R.string.ccr_session_name_label, e18Var2), null, gm3.a(e18Var2).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var2, 0, 0, 131066);
            tkh tkhVar = ((jm3) gm3.c(e18Var2).e.E).g;
            int i4 = i2;
            ffh ffhVarQ = k2e.q(gm3.a(e18Var2).M, gm3.a(e18Var2).M, 0L, 0L, 0L, 0L, gm3.a(e18Var2).c, 0L, gm3.a(e18Var2).c, gm3.a(e18Var2).v, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, e18Var2, 2147477244);
            e18Var = e18Var2;
            mp9 mp9Var = new mp9(i3, i3, 7, 119);
            boolean z = (i4 & 7168) == 2048;
            Object objN = e18Var.N();
            if (z || objN == jd4.a) {
                objN = new kw0(4, zy7Var);
                e18Var.k0(objN);
            }
            kxk.d(str2, bz7Var, b.c(fqbVar, 1.0f), false, false, tkhVar, null, uhk.m, null, null, null, false, null, mp9Var, new kp9((bz7) objN, null, 62), true, 0, 0, null, ffhVarQ, e18Var, (i4 & 14) | 12583296 | (i4 & 112), 12779520, 0, 3964760);
            e18Var.p(true);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xd((Object) str, bz7Var, i4gVar, (Object) zy7Var, i, 15);
        }
    }

    public static final void w(RepoWithStatus repoWithStatus, boolean z, zy7 zy7Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(2143469025);
        int i2 = i | (e18Var.h(repoWithStatus) ? 4 : 2) | (e18Var.g(z) ? 32 : 16) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            fqb fqbVar = fqb.E;
            iqb iqbVarL = gb9.L(androidx.compose.foundation.b.c(b.c(fqbVar, 1.0f), false, null, null, null, zy7Var, 15), MTTypesetterKt.kLineSkipLimitMultiplier, 12.0f, 1);
            cxe cxeVarA = axe.a(new ho0(12.0f, true, new sz6(1)), lja.Q, e18Var, 54);
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
            hw9 hw9VarN = kgh.n(e18Var, iqbVarE, z80Var4, 1.0f, true);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, hw9VarN);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, q64VarA);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            tjh.b(ij0.C(repoWithStatus.getRepo().getOwner().getLogin(), "/", repoWithStatus.getRepo().getName()), null, gm3.a(e18Var).M, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 0, 24960, 110586);
            tjh.b(d4c.k0(R.string.ccr_default_branch, new Object[]{repoWithStatus.getRepo().getDefault_branch()}, e18Var), null, gm3.a(e18Var).O, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 24960, 110586);
            e18Var = e18Var;
            e18Var.p(true);
            if (z) {
                e18Var.a0(-1769012346);
                cv8.b(com.anthropic.claude.design.icon.a.a(ud0.L, e18Var), null, b.o(fqbVar, 20.0f), gm3.a(e18Var).N, e18Var, 440, 0);
                e18Var.p(false);
            } else {
                e18Var.a0(-1768795811);
                e18Var.p(false);
            }
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new iv((Object) repoWithStatus, z, zy7Var, i, 8);
        }
    }

    public static final void x(yih yihVar, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-892608200);
        int i2 = (e18Var2.f(iqbVar) ? 32 : 16) | i;
        if (e18Var2.Q(i2 & 1, (i2 & 19) != 18)) {
            e18Var = e18Var2;
            gwk.f(yihVar, b.c(iqbVar, 1.0f), null, true, d4c.j0(R.string.ccr_search_repositories, e18Var2), null, gm3.a(e18Var2).v, gm3.a(e18Var2).n, gm3.a(e18Var2).M, gm3.a(e18Var2).O, gm3.a(e18Var2).O, null, xve.b(8.0f), e18Var, 3078, 2084);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new dy3(yihVar, iqbVar, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void y(defpackage.xhe r26, defpackage.i4g r27, java.util.LinkedHashSet r28, defpackage.bz7 r29, defpackage.bz7 r30, defpackage.x0a r31, boolean r32, defpackage.ld4 r33, int r34) {
        /*
            Method dump skipped, instruction units count: 783
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.code.remote.bottomsheet.a.y(xhe, i4g, java.util.LinkedHashSet, bz7, bz7, x0a, boolean, ld4, int):void");
    }

    public static final void z(SelfHostedRunnerPool selfHostedRunnerPool, boolean z, zy7 zy7Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1305844017);
        int i2 = i | (e18Var.h(selfHostedRunnerPool) ? 4 : 2) | (e18Var.g(z) ? 32 : 16) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            iqb iqbVarL = gb9.L(androidx.compose.foundation.b.c(b.c(fqb.E, 1.0f), false, null, new vue(3), null, zy7Var, 11), MTTypesetterKt.kLineSkipLimitMultiplier, 12.0f, 1);
            cxe cxeVarA = axe.a(new ho0(12.0f, true, new sz6(1)), lja.Q, e18Var, 54);
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
            iv1.b(ud0.X, null, null, null, gm3.a(e18Var).N, e18Var, 48, 12);
            hw9 hw9Var = new hw9(1.0f, true);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, hw9Var);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, q64VarA);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            tjh.b(selfHostedRunnerPool.getName(), null, gm3.a(e18Var).M, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 0, 24960, 110586);
            e18 e18Var2 = e18Var;
            Integer alive_runner_count = selfHostedRunnerPool.getAlive_runner_count();
            if (alive_runner_count == null) {
                e18Var2.a0(-1746831689);
                e18Var2.p(false);
            } else {
                e18Var2.a0(-1746831688);
                int iIntValue = alive_runner_count.intValue();
                tjh.b(d4c.f0(R.plurals.ccr_self_hosted_runners_online, iIntValue, new Object[]{Integer.valueOf(iIntValue)}, e18Var2), null, gm3.a(e18Var2).O, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var2, 0, 24960, 110586);
                e18Var2 = e18Var2;
                e18Var2.p(false);
            }
            e18Var2.p(true);
            e18 e18Var3 = e18Var2;
            e18Var = e18Var3;
            vjk.b(z, null, null, false, ijk.e(gm3.a(e18Var2).c, gm3.a(e18Var2).O, 0L, 0L, e18Var3, 12), e18Var, ((i2 >> 3) & 14) | 48, 44);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new iv((Object) selfHostedRunnerPool, z, zy7Var, i, 9);
        }
    }
}
