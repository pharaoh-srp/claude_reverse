package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.model.ModelOption;
import com.anthropic.claude.bell.PlaybackPace;
import com.anthropic.claude.design.icon.a;
import com.anthropic.claude.models.organization.configtypes.SttSupportedLanguage;
import com.anthropic.claude.tool.model.AnalysisToolInvocation;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p6 implements rz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ p6(int i) {
        this.E = i;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        int i3;
        int i4;
        bpc bpcVarA;
        int i5;
        int i6;
        int i7 = this.E;
        lz1 lz1Var = jd4.a;
        nm6 nm6Var = nm6.E;
        fqb fqbVar = fqb.E;
        iei ieiVar = iei.a;
        switch (i7) {
            case 0:
                q5b q5bVar = (q5b) obj;
                int iM0 = q5bVar.M0(10.0f);
                int i8 = iM0 * 2;
                c3d c3dVarU = ((h5b) obj2).u(sl4.i(i8, 0, ((rl4) obj3).a));
                return q5bVar.U(c3dVarU.E - i8, c3dVarU.F, nm6Var, new r6(iM0, 0, c3dVarU));
            case 1:
                q5b q5bVar2 = (q5b) obj;
                int iM02 = q5bVar2.M0(10.0f);
                int i9 = iM02 * 2;
                c3d c3dVarU2 = ((h5b) obj2).u(sl4.i(0, i9, ((rl4) obj3).a));
                return q5bVar2.U(c3dVarU2.E, c3dVarU2.F - i9, nm6Var, new r6(iM02, 1, c3dVarU2));
            case 2:
                ta4 ta4Var = gvj.c;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ax9) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ta4Var.invoke(e18Var, 0);
                } else {
                    e18Var.T();
                }
                return ieiVar;
            case 3:
                q5b q5bVar3 = (q5b) obj;
                h5b h5bVar = (h5b) obj2;
                q5bVar3.getClass();
                h5bVar.getClass();
                c3d c3dVarU3 = h5bVar.u(((rl4) obj3).a);
                return q5bVar3.U(c3dVarU3.E, 0, nm6Var, new b1(c3dVarU3, 2));
            case 4:
                c3d c3dVarU4 = ((h5b) obj2).u(((rl4) obj3).a);
                return ((q5b) obj).J0(c3dVarU4.E, c3dVarU4.F, nm6.E, new zv(11), new b1(c3dVarU4, 4));
            case 5:
                SttSupportedLanguage sttSupportedLanguage = (SttSupportedLanguage) obj;
                ((Integer) obj3).intValue();
                sttSupportedLanguage.getClass();
                e18 e18Var2 = (e18) ((ld4) obj2);
                e18Var2.a0(2124108687);
                String display_name = sttSupportedLanguage.getDisplay_name();
                e18Var2.p(false);
                return display_name;
            case 6:
                PlaybackPace playbackPace = (PlaybackPace) obj;
                ((Integer) obj3).getClass();
                playbackPace.getClass();
                e18 e18Var3 = (e18) ((ld4) obj2);
                e18Var3.a0(418455559);
                int i10 = bm1.a[playbackPace.ordinal()];
                if (i10 == 1) {
                    i = -1542214646;
                    i2 = R.string.settings_choose_pace_slow;
                } else if (i10 == 2) {
                    i = -1542212148;
                    i2 = R.string.settings_choose_pace_normal;
                } else {
                    if (i10 != 3) {
                        throw ebh.u(e18Var3, -1542215697, false);
                    }
                    i = -1542209654;
                    i2 = R.string.settings_choose_pace_fast;
                }
                String strN = vb7.n(e18Var3, i, i2, e18Var3, false);
                e18Var3.p(false);
                return strN;
            case 7:
                ModelOption modelOption = (ModelOption) obj;
                ((Integer) obj3).intValue();
                modelOption.getClass();
                e18 e18Var4 = (e18) ((ld4) obj2);
                e18Var4.a0(-1510294896);
                String safeDisplayName = modelOption.getSafeDisplayName();
                e18Var4.p(false);
                return safeDisplayName;
            case 8:
                uwc uwcVar = (uwc) obj;
                ((Integer) obj3).getClass();
                uwcVar.getClass();
                e18 e18Var5 = (e18) ((ld4) obj2);
                e18Var5.a0(1900720874);
                int iOrdinal = uwcVar.ordinal();
                if (iOrdinal == 0) {
                    i3 = -1506033020;
                    i4 = R.string.settings_voice_consent_per_chat_always;
                } else {
                    if (iOrdinal != 1) {
                        throw ebh.u(e18Var5, -1506034440, false);
                    }
                    i3 = -1506029823;
                    i4 = R.string.settings_voice_consent_per_chat_ask;
                }
                String strN2 = vb7.n(e18Var5, i3, i4, e18Var5, false);
                e18Var5.p(false);
                return strN2;
            case 9:
                q5b q5bVar4 = (q5b) obj;
                h5b h5bVar2 = (h5b) obj2;
                q5bVar4.getClass();
                h5bVar2.getClass();
                c3d c3dVarU5 = h5bVar2.u(((rl4) obj3).a);
                return q5bVar4.U(c3dVarU5.E, c3dVarU5.F - q5bVar4.M0(20.0f), nm6Var, new b1(c3dVarU5, 5));
            case 10:
                iqb iqbVar = (iqb) obj;
                ((Integer) obj3).getClass();
                iqbVar.getClass();
                e18 e18Var6 = (e18) ((ld4) obj2);
                e18Var6.a0(1989772596);
                Object objN = e18Var6.N();
                if (objN == lz1Var) {
                    objN = fd9.O(im6.E, e18Var6);
                    e18Var6.k0(objN);
                }
                l45 l45Var = (l45) objN;
                Object objN2 = e18Var6.N();
                if (objN2 == lz1Var) {
                    objN2 = mpk.P(null);
                    e18Var6.k0(objN2);
                }
                nwb nwbVar = (nwb) objN2;
                Object objN3 = e18Var6.N();
                if (objN3 == lz1Var) {
                    objN3 = mpk.P(null);
                    e18Var6.k0(objN3);
                }
                nwb nwbVar2 = (nwb) objN3;
                Object objN4 = e18Var6.N();
                if (objN4 == lz1Var) {
                    objN4 = new x40(12, nwbVar);
                    e18Var6.k0(objN4);
                }
                iqb iqbVarI = quj.i(iqbVar, (bz7) objN4);
                boolean zH = e18Var6.h(l45Var);
                Object objN5 = e18Var6.N();
                if (zH || objN5 == lz1Var) {
                    objN5 = new l6(l45Var, nwbVar, nwbVar2, 14);
                    e18Var6.k0(objN5);
                }
                iqb iqbVarL = sf5.L(iqbVarI, (bz7) objN5);
                e18Var6.p(false);
                return iqbVarL;
            case 11:
                ld4 ld4Var2 = (ld4) obj2;
                ((Integer) obj3).getClass();
                e18 e18Var7 = (e18) ld4Var2;
                e18Var7.a0(1575598419);
                e18Var7.p(false);
                e18 e18Var8 = (e18) ld4Var2;
                Object objN6 = e18Var8.N();
                if (objN6 == lz1Var) {
                    objN6 = mpk.P(null);
                    e18Var8.k0(objN6);
                }
                nwb nwbVar3 = (nwb) objN6;
                o5b o5bVarD = dw1.d(lja.K, false);
                int iHashCode = Long.hashCode(e18Var8.T);
                hyc hycVarL = e18Var8.l();
                iqb iqbVarE = kxk.E(ld4Var2, fqbVar);
                dd4.e.getClass();
                re4 re4Var = cd4.b;
                e18 e18Var9 = (e18) ld4Var2;
                e18Var9.e0();
                if (e18Var9.S) {
                    e18Var9.k(re4Var);
                } else {
                    e18Var9.n0();
                }
                d4c.i0(ld4Var2, cd4.f, o5bVarD);
                d4c.i0(ld4Var2, cd4.e, hycVarL);
                d4c.i0(ld4Var2, cd4.g, Integer.valueOf(iHashCode));
                d4c.h0(ld4Var2, cd4.h);
                d4c.i0(ld4Var2, cd4.d, iqbVarE);
                pz7 pz7Var = (pz7) nwbVar3.getValue();
                if (pz7Var == null) {
                    e18Var9.a0(2094511935);
                } else {
                    e18Var9.a0(1037396226);
                    pz7Var.invoke(ld4Var2, 0);
                }
                e18Var9.p(false);
                e18Var9.p(true);
                return ieiVar;
            case 12:
                ld4 ld4Var3 = (ld4) obj2;
                ((Integer) obj3).getClass();
                e18 e18Var10 = (e18) ld4Var3;
                e18Var10.a0(-1218883371);
                e18Var10.p(false);
                e18 e18Var11 = (e18) ld4Var3;
                Object objN7 = e18Var11.N();
                if (objN7 == lz1Var) {
                    objN7 = mpk.P(null);
                    e18Var11.k0(objN7);
                }
                nwb nwbVar4 = (nwb) objN7;
                o5b o5bVarD2 = dw1.d(lja.K, false);
                int iHashCode2 = Long.hashCode(e18Var11.T);
                hyc hycVarL2 = e18Var11.l();
                iqb iqbVarE2 = kxk.E(ld4Var3, fqbVar);
                dd4.e.getClass();
                re4 re4Var2 = cd4.b;
                e18 e18Var12 = (e18) ld4Var3;
                e18Var12.e0();
                if (e18Var12.S) {
                    e18Var12.k(re4Var2);
                } else {
                    e18Var12.n0();
                }
                d4c.i0(ld4Var3, cd4.f, o5bVarD2);
                d4c.i0(ld4Var3, cd4.e, hycVarL2);
                d4c.i0(ld4Var3, cd4.g, Integer.valueOf(iHashCode2));
                d4c.h0(ld4Var3, cd4.h);
                d4c.i0(ld4Var3, cd4.d, iqbVarE2);
                pz7 pz7Var2 = (pz7) nwbVar4.getValue();
                if (pz7Var2 == null) {
                    e18Var12.a0(-657207800);
                } else {
                    e18Var12.a0(671536409);
                    pz7Var2.invoke(ld4Var3, 0);
                }
                e18Var12.p(false);
                e18Var12.p(true);
                return ieiVar;
            case 13:
                ek0 ek0Var = (ek0) obj;
                ((Integer) obj3).getClass();
                ek0Var.getClass();
                e18 e18Var13 = (e18) ((ld4) obj2);
                e18Var13.a0(-1282488723);
                int iOrdinal2 = ek0Var.ordinal();
                if (iOrdinal2 == 0) {
                    e18Var13.a0(141556312);
                    bpcVarA = a.a(ud0.W0, e18Var13);
                    e18Var13.p(false);
                } else if (iOrdinal2 == 1) {
                    e18Var13.a0(141558264);
                    bpcVarA = a.a(ud0.v1, e18Var13);
                    e18Var13.p(false);
                } else {
                    if (iOrdinal2 != 2) {
                        throw ebh.u(e18Var13, 141553956, false);
                    }
                    e18Var13.a0(141560216);
                    bpcVarA = a.a(ud0.R0, e18Var13);
                    e18Var13.p(false);
                }
                e18Var13.p(false);
                return bpcVarA;
            case 14:
                ek0 ek0Var2 = (ek0) obj;
                ((Integer) obj3).getClass();
                ek0Var2.getClass();
                e18 e18Var14 = (e18) ((ld4) obj2);
                e18Var14.a0(1896914486);
                int iOrdinal3 = ek0Var2.ordinal();
                if (iOrdinal3 == 0) {
                    i5 = 983642497;
                    i6 = R.string.color_mode_setting_system;
                } else if (iOrdinal3 == 1) {
                    i5 = 983645312;
                    i6 = R.string.color_mode_setting_light;
                } else {
                    if (iOrdinal3 != 2) {
                        throw ebh.u(e18Var14, 983640749, false);
                    }
                    i5 = 983648063;
                    i6 = R.string.color_mode_setting_dark;
                }
                String strN3 = vb7.n(e18Var14, i5, i6, e18Var14, false);
                e18Var14.p(false);
                return strN3;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ld4 ld4Var4 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var15 = (e18) ld4Var4;
                if (e18Var15.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    xo1 xo1Var = lja.K;
                    iqb iqbVarJ = gb9.J(b.c(fqbVar, 1.0f), 16.0f);
                    o5b o5bVarD3 = dw1.d(xo1Var, false);
                    int iHashCode3 = Long.hashCode(e18Var15.T);
                    hyc hycVarL3 = e18Var15.l();
                    iqb iqbVarE3 = kxk.E(e18Var15, iqbVarJ);
                    dd4.e.getClass();
                    re4 re4Var3 = cd4.b;
                    e18Var15.e0();
                    if (e18Var15.S) {
                        e18Var15.k(re4Var3);
                    } else {
                        e18Var15.n0();
                    }
                    d4c.i0(e18Var15, cd4.f, o5bVarD3);
                    d4c.i0(e18Var15, cd4.e, hycVarL3);
                    d4c.i0(e18Var15, cd4.g, Integer.valueOf(iHashCode3));
                    d4c.h0(e18Var15, cd4.h);
                    d4c.i0(e18Var15, cd4.d, iqbVarE3);
                    tjd.a(b.o(fqbVar, 20.0f), gm3.a(e18Var15).O, 2.0f, 0L, 0, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var15, 390, 56);
                    e18Var15.p(true);
                } else {
                    e18Var15.T();
                }
                return ieiVar;
            case 16:
                ld4 ld4Var5 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var16 = (e18) ld4Var5;
                if (e18Var16.Q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    tjh.b(d4c.j0(R.string.code_agent_picker_retry, e18Var16), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var16, 0, 0, 262142);
                } else {
                    e18Var16.T();
                }
                return ieiVar;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ld4 ld4Var6 = (ld4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var17 = (e18) ld4Var6;
                if (e18Var17.Q(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    tjh.b(d4c.j0(R.string.alarm_creator_see_alarms, e18Var17), null, 0L, 0L, null, dv7.M, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var17, 1572864, 0, 262078);
                } else {
                    e18Var17.T();
                }
                return ieiVar;
            case g.AVG_FIELD_NUMBER /* 18 */:
                px9 px9Var = (px9) obj;
                ld4 ld4Var7 = (ld4) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                px9Var.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= ((e18) ld4Var7).f(px9Var) ? 4 : 2;
                }
                e18 e18Var18 = (e18) ld4Var7;
                if (e18Var18.Q(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    xo1 xo1Var2 = lja.K;
                    iqb iqbVarJ2 = gb9.J(px9.c(px9Var), 32.0f);
                    o5b o5bVarD4 = dw1.d(xo1Var2, false);
                    int iHashCode4 = Long.hashCode(e18Var18.T);
                    hyc hycVarL4 = e18Var18.l();
                    iqb iqbVarE4 = kxk.E(e18Var18, iqbVarJ2);
                    dd4.e.getClass();
                    re4 re4Var4 = cd4.b;
                    e18Var18.e0();
                    if (e18Var18.S) {
                        e18Var18.k(re4Var4);
                    } else {
                        e18Var18.n0();
                    }
                    d4c.i0(e18Var18, cd4.f, o5bVarD4);
                    d4c.i0(e18Var18, cd4.e, hycVarL4);
                    d4c.i0(e18Var18, cd4.g, Integer.valueOf(iHashCode4));
                    d4c.h0(e18Var18, cd4.h);
                    d4c.i0(e18Var18, cd4.d, iqbVarE4);
                    ez1.a(null, vf2.H, 0L, e18Var18, 48, 5);
                    e18Var18.p(true);
                } else {
                    e18Var18.T();
                }
                return ieiVar;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ld4 ld4Var8 = (ld4) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var19 = (e18) ld4Var8;
                if (e18Var19.Q(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    kxk.g(e18Var19, b.e(fqbVar, 4.0f));
                } else {
                    e18Var19.T();
                }
                return ieiVar;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ld4 ld4Var9 = (ld4) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var20 = (e18) ld4Var9;
                if (e18Var20.Q(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    xo1 xo1Var3 = lja.K;
                    iqb iqbVarL2 = gb9.L(b.c(fqbVar, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, 1);
                    o5b o5bVarD5 = dw1.d(xo1Var3, false);
                    int iHashCode5 = Long.hashCode(e18Var20.T);
                    hyc hycVarL5 = e18Var20.l();
                    iqb iqbVarE5 = kxk.E(e18Var20, iqbVarL2);
                    dd4.e.getClass();
                    re4 re4Var5 = cd4.b;
                    e18Var20.e0();
                    if (e18Var20.S) {
                        e18Var20.k(re4Var5);
                    } else {
                        e18Var20.n0();
                    }
                    d4c.i0(e18Var20, cd4.f, o5bVarD5);
                    d4c.i0(e18Var20, cd4.e, hycVarL5);
                    d4c.i0(e18Var20, cd4.g, Integer.valueOf(iHashCode5));
                    d4c.h0(e18Var20, cd4.h);
                    d4c.i0(e18Var20, cd4.d, iqbVarE5);
                    ez1.a(null, vf2.H, 0L, e18Var20, 48, 5);
                    e18Var20.p(true);
                } else {
                    e18Var20.T();
                }
                return ieiVar;
            case 21:
                ld4 ld4Var10 = (ld4) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var21 = (e18) ld4Var10;
                if (e18Var21.Q(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    tjh.b(d4c.j0(R.string.chat_list_load_more_retry, e18Var21), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var21).e.E).g, e18Var21, 0, 0, 131070);
                } else {
                    e18Var21.T();
                }
                return ieiVar;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ld4 ld4Var11 = (ld4) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var22 = (e18) ld4Var11;
                if (e18Var22.Q(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    ez1.a(b.y(gb9.L(b.c(fqbVar, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 32.0f, 1), lja.K, 2), null, 0L, e18Var22, 6, 6);
                } else {
                    e18Var22.T();
                }
                return ieiVar;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ld4 ld4Var12 = (ld4) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var23 = (e18) ld4Var12;
                if (e18Var23.Q(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    ez1.a(b.y(gb9.L(b.c(fqbVar, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, 1), lja.K, 2), vf2.H, 0L, e18Var23, 54, 4);
                } else {
                    e18Var23.T();
                }
                return ieiVar;
            case 24:
                ld4 ld4Var13 = (ld4) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var24 = (e18) ld4Var13;
                if (e18Var24.Q(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    kxk.g(e18Var24, b.e(fqbVar, 8.0f));
                } else {
                    e18Var24.T();
                }
                return ieiVar;
            case BuildConfig.VERSION_CODE /* 25 */:
                ld4 ld4Var14 = (ld4) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var25 = (e18) ld4Var14;
                if (e18Var25.Q(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    jpk.b(0, e18Var25);
                } else {
                    e18Var25.T();
                }
                return ieiVar;
            case 26:
                AnalysisToolInvocation analysisToolInvocation = (AnalysisToolInvocation) obj;
                ld4 ld4Var15 = (ld4) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                analysisToolInvocation.getClass();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= ((e18) ld4Var15).f(analysisToolInvocation) ? 4 : 2;
                }
                e18 e18Var26 = (e18) ld4Var15;
                if (e18Var26.Q(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    zlk.a(analysisToolInvocation.getBody(), "javascript", yfd.p(b.c, gm3.a(e18Var26).o, zni.b), false, analysisToolInvocation.isComplete(), null, e18Var26, 48, 40);
                } else {
                    e18Var26.T();
                }
                return ieiVar;
            case 27:
                ld4 ld4Var16 = (ld4) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var27 = (e18) ld4Var16;
                if (e18Var27.Q(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    tjh.b(d4c.j0(R.string.login_method_choice_sso, e18Var27), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var27).e.E).h, e18Var27, 0, 0, 131070);
                } else {
                    e18Var27.T();
                }
                return ieiVar;
            case 28:
                ld4 ld4Var17 = (ld4) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var28 = (e18) ld4Var17;
                if (e18Var28.Q(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    tjh.b(d4c.j0(R.string.login_method_choice_email, e18Var28), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var28).e.E).h, e18Var28, 0, 0, 131070);
                } else {
                    e18Var28.T();
                }
                return ieiVar;
            default:
                ld4 ld4Var18 = (ld4) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var29 = (e18) ld4Var18;
                if (e18Var29.Q(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    xo1 xo1Var4 = lja.K;
                    iqb iqbVarP = yfd.p(xn5.V(gb9.L(fqbVar, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2).B(b.c), xve.b(16.0f)), gm3.a(e18Var29).q, zni.b);
                    o5b o5bVarD6 = dw1.d(xo1Var4, false);
                    int iHashCode6 = Long.hashCode(e18Var29.T);
                    hyc hycVarL6 = e18Var29.l();
                    iqb iqbVarE6 = kxk.E(e18Var29, iqbVarP);
                    dd4.e.getClass();
                    re4 re4Var6 = cd4.b;
                    e18Var29.e0();
                    if (e18Var29.S) {
                        e18Var29.k(re4Var6);
                    } else {
                        e18Var29.n0();
                    }
                    d4c.i0(e18Var29, cd4.f, o5bVarD6);
                    d4c.i0(e18Var29, cd4.e, hycVarL6);
                    d4c.i0(e18Var29, cd4.g, Integer.valueOf(iHashCode6));
                    d4c.h0(e18Var29, cd4.h);
                    d4c.i0(e18Var29, cd4.d, iqbVarE6);
                    ez1.a(null, vf2.J, 0L, e18Var29, 48, 5);
                    e18Var29.p(true);
                } else {
                    e18Var29.T();
                }
                return ieiVar;
        }
    }
}
