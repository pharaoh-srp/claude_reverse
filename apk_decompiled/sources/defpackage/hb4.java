package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hb4 implements rz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ hb4(int i) {
        this.E = i;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        lz1 lz1Var = jd4.a;
        fqb fqbVar = fqb.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e18Var.T();
                } else {
                    ikk.a(null, e18Var, 0);
                }
                break;
            case 1:
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((mnc) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e18Var2.T();
                } else {
                    qnc qncVar = qf2.a;
                    kxk.g(e18Var2, b.e(fqbVar, 12.0f));
                }
                break;
            case 2:
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((mnc) obj).getClass();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    e18Var3.T();
                } else {
                    qnc qncVar2 = qf2.a;
                    kxk.g(e18Var3, b.e(fqbVar, 12.0f));
                }
                break;
            case 3:
                s64 s64Var = (s64) obj;
                ld4 ld4Var4 = (ld4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                s64Var.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ((e18) ld4Var4).f(s64Var) ? 4 : 2;
                }
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    e18Var4.T();
                } else {
                    xo1 xo1Var = lja.K;
                    iqb iqbVarP = yfd.p(s64Var.b(b.c(fqbVar, 1.0f), 1.0f, true), gm3.a(e18Var4).o, zni.b);
                    o5b o5bVarD = dw1.d(xo1Var, false);
                    int iHashCode = Long.hashCode(e18Var4.T);
                    hyc hycVarL = e18Var4.l();
                    iqb iqbVarE = kxk.E(e18Var4, iqbVarP);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var4.e0();
                    if (e18Var4.S) {
                        e18Var4.k(re4Var);
                    } else {
                        e18Var4.n0();
                    }
                    d4c.i0(e18Var4, cd4.f, o5bVarD);
                    d4c.i0(e18Var4, cd4.e, hycVarL);
                    d4c.i0(e18Var4, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var4, cd4.h);
                    d4c.i0(e18Var4, cd4.d, iqbVarE);
                    tjh.b("Content", null, gm3.a(e18Var4).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var4, 6, 0, 262138);
                    e18Var4.p(true);
                }
                break;
            case 4:
                yo4 yo4Var = (yo4) obj;
                ld4 ld4Var5 = (ld4) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= ((e18) ld4Var5).f(yo4Var) ? 4 : 2;
                }
                e18 e18Var5 = (e18) ld4Var5;
                if (!e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    e18Var5.T();
                } else {
                    dw1.a(yfd.p(b.e(b.c(gb9.L(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, dp4.g, 1), 1.0f), dp4.f), yo4Var.c, zni.b), e18Var5, 0);
                }
                break;
            case 5:
                ld4 ld4Var6 = (ld4) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var6 = (e18) ld4Var6;
                if (!e18Var6.Q(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    e18Var6.T();
                } else {
                    String strJ0 = d4c.j0(R.string.conway_app_picker_title, e18Var6);
                    tkh tkhVar = ((jm3) gm3.c(e18Var6).e.E).j;
                    long j = gm3.a(e18Var6).N;
                    iqb iqbVarK = gb9.K(fqbVar, 12.0f, 8.0f);
                    Object objN = e18Var6.N();
                    if (objN == lz1Var) {
                        objN = new i04(26);
                        e18Var6.k0(objN);
                    }
                    tjh.b(strJ0, tjf.b(iqbVarK, false, (bz7) objN), j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar, e18Var6, 0, 0, 131064);
                }
                break;
            case 6:
                ld4 ld4Var7 = (ld4) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var7 = (e18) ld4Var7;
                if (!e18Var7.Q(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    e18Var7.T();
                } else {
                    tjh.b(d4c.j0(R.string.conway_app_picker_empty, e18Var7), gb9.K(fqbVar, 12.0f, 12.0f), gm3.a(e18Var7).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var7).e.E).g, e18Var7, 48, 0, 131064);
                }
                break;
            case 7:
                ld4 ld4Var8 = (ld4) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var8 = (e18) ld4Var8;
                if (!e18Var8.Q(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    e18Var8.T();
                } else {
                    xo1 xo1Var2 = lja.K;
                    iqb iqbVarC = b.c(fqbVar, 1.0f);
                    o5b o5bVarD2 = dw1.d(xo1Var2, false);
                    int iHashCode2 = Long.hashCode(e18Var8.T);
                    hyc hycVarL2 = e18Var8.l();
                    iqb iqbVarE2 = kxk.E(e18Var8, iqbVarC);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var8.e0();
                    if (e18Var8.S) {
                        e18Var8.k(re4Var2);
                    } else {
                        e18Var8.n0();
                    }
                    d4c.i0(e18Var8, cd4.f, o5bVarD2);
                    d4c.i0(e18Var8, cd4.e, hycVarL2);
                    d4c.i0(e18Var8, cd4.g, Integer.valueOf(iHashCode2));
                    d4c.h0(e18Var8, cd4.h);
                    d4c.i0(e18Var8, cd4.d, iqbVarE2);
                    tjd.a(b.o(fqbVar, 20.0f), gm3.a(e18Var8).O, 2.0f, 0L, 0, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var8, 390, 56);
                    e18Var8.p(true);
                }
                break;
            case 8:
                ld4 ld4Var9 = (ld4) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var9 = (e18) ld4Var9;
                if (!e18Var9.Q(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    e18Var9.T();
                } else {
                    xo1 xo1Var3 = lja.K;
                    iqb iqbVarC2 = b.c(fqbVar, 1.0f);
                    o5b o5bVarD3 = dw1.d(xo1Var3, false);
                    int iHashCode3 = Long.hashCode(e18Var9.T);
                    hyc hycVarL3 = e18Var9.l();
                    iqb iqbVarE3 = kxk.E(e18Var9, iqbVarC2);
                    dd4.e.getClass();
                    re4 re4Var3 = cd4.b;
                    e18Var9.e0();
                    if (e18Var9.S) {
                        e18Var9.k(re4Var3);
                    } else {
                        e18Var9.n0();
                    }
                    d4c.i0(e18Var9, cd4.f, o5bVarD3);
                    d4c.i0(e18Var9, cd4.e, hycVarL3);
                    d4c.i0(e18Var9, cd4.g, Integer.valueOf(iHashCode3));
                    d4c.h0(e18Var9, cd4.h);
                    d4c.i0(e18Var9, cd4.d, iqbVarE3);
                    tjd.a(b.o(fqbVar, 20.0f), gm3.a(e18Var9).O, 2.0f, 0L, 0, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var9, 390, 56);
                    e18Var9.p(true);
                }
                break;
            case 9:
                ld4 ld4Var10 = (ld4) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var10 = (e18) ld4Var10;
                if (!e18Var10.Q(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    e18Var10.T();
                } else {
                    tjh.b(d4c.j0(R.string.conway_ext_install, e18Var10), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var10, 0, 0, 262142);
                }
                break;
            case 10:
                ld4 ld4Var11 = (ld4) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var11 = (e18) ld4Var11;
                if (!e18Var11.Q(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    e18Var11.T();
                } else {
                    tjh.b(d4c.j0(R.string.conway_dialog_cancel, e18Var11), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var11, 0, 0, 262142);
                }
                break;
            case 11:
                ld4 ld4Var12 = (ld4) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var12 = (e18) ld4Var12;
                if (!e18Var12.Q(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    e18Var12.T();
                } else {
                    tjh.b(d4c.j0(R.string.conway_dialog_delete, e18Var12), null, gm3.a(e18Var12).z, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var12, 0, 0, 262138);
                }
                break;
            case 12:
                ld4 ld4Var13 = (ld4) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var13 = (e18) ld4Var13;
                if (!e18Var13.Q(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    e18Var13.T();
                } else {
                    tjh.b(d4c.j0(R.string.conway_dialog_cancel, e18Var13), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var13, 0, 0, 262142);
                }
                break;
            case 13:
                ld4 ld4Var14 = (ld4) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var14 = (e18) ld4Var14;
                if (!e18Var14.Q(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    e18Var14.T();
                } else {
                    tjh.b(d4c.j0(R.string.conway_dialog_ok, e18Var14), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var14, 0, 0, 262142);
                }
                break;
            case 14:
                ld4 ld4Var15 = (ld4) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var15 = (e18) ld4Var15;
                if (!e18Var15.Q(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    e18Var15.T();
                } else {
                    tjh.b(d4c.j0(R.string.conway_dialog_cancel, e18Var15), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var15, 0, 0, 262142);
                }
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ld4 ld4Var16 = (ld4) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var16 = (e18) ld4Var16;
                if (!e18Var16.Q(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    e18Var16.T();
                } else {
                    tjh.b(d4c.j0(R.string.conway_ext_overwrite_confirm, e18Var16), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var16, 0, 0, 262142);
                }
                break;
            case 16:
                ld4 ld4Var17 = (ld4) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var17 = (e18) ld4Var17;
                if (!e18Var17.Q(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    e18Var17.T();
                } else {
                    String strJ02 = d4c.j0(R.string.conway_forks_sheet_title, e18Var17);
                    tkh tkhVar2 = ((jm3) gm3.c(e18Var17).e.E).j;
                    long j2 = gm3.a(e18Var17).N;
                    iqb iqbVarK2 = gb9.K(fqbVar, 12.0f, 8.0f);
                    Object objN2 = e18Var17.N();
                    if (objN2 == lz1Var) {
                        objN2 = new i04(27);
                        e18Var17.k0(objN2);
                    }
                    tjh.b(strJ02, tjf.b(iqbVarK2, false, (bz7) objN2), j2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar2, e18Var17, 0, 0, 131064);
                }
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ld4 ld4Var18 = (ld4) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var18 = (e18) ld4Var18;
                if (!e18Var18.Q(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    e18Var18.T();
                } else {
                    tjh.b(d4c.j0(R.string.conway_dialog_delete, e18Var18), null, gm3.a(e18Var18).z, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var18, 0, 0, 262138);
                }
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ld4 ld4Var19 = (ld4) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var19 = (e18) ld4Var19;
                if (!e18Var19.Q(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    e18Var19.T();
                } else {
                    tjh.b(d4c.j0(R.string.conway_dialog_cancel, e18Var19), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var19, 0, 0, 262142);
                }
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                mw1 mw1Var = (mw1) obj;
                ld4 ld4Var20 = (ld4) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                mw1Var.getClass();
                if ((iIntValue20 & 6) == 0) {
                    iIntValue20 |= ((e18) ld4Var20).f(mw1Var) ? 4 : 2;
                }
                e18 e18Var20 = (e18) ld4Var20;
                if (!e18Var20.Q(iIntValue20 & 1, (iIntValue20 & 19) != 18)) {
                    e18Var20.T();
                } else {
                    nvk.c(mw1Var, h39.E, 0L, e18Var20, (iIntValue20 & 14) | 48);
                }
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                mw1 mw1Var2 = (mw1) obj;
                ld4 ld4Var21 = (ld4) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                mw1Var2.getClass();
                if ((iIntValue21 & 6) == 0) {
                    iIntValue21 |= ((e18) ld4Var21).f(mw1Var2) ? 4 : 2;
                }
                e18 e18Var21 = (e18) ld4Var21;
                if (!e18Var21.Q(iIntValue21 & 1, (iIntValue21 & 19) != 18)) {
                    e18Var21.T();
                } else {
                    nvk.c(mw1Var2, h39.E, 0L, e18Var21, (iIntValue21 & 14) | 48);
                }
                break;
            case 21:
                mw1 mw1Var3 = (mw1) obj;
                ld4 ld4Var22 = (ld4) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                mw1Var3.getClass();
                if ((iIntValue22 & 6) == 0) {
                    iIntValue22 |= ((e18) ld4Var22).f(mw1Var3) ? 4 : 2;
                }
                e18 e18Var22 = (e18) ld4Var22;
                if (!e18Var22.Q(iIntValue22 & 1, (iIntValue22 & 19) != 18)) {
                    e18Var22.T();
                } else {
                    nvk.c(mw1Var3, h39.F, 0L, e18Var22, (iIntValue22 & 14) | 48);
                }
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ld4 ld4Var23 = (ld4) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var23 = (e18) ld4Var23;
                if (!e18Var23.Q(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    e18Var23.T();
                } else {
                    tjh.b(d4c.j0(R.string.conway_system_container_restart, e18Var23), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var23, 0, 0, 262142);
                }
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ld4 ld4Var24 = (ld4) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var24 = (e18) ld4Var24;
                if (!e18Var24.Q(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    e18Var24.T();
                } else {
                    tjh.b(d4c.j0(R.string.conway_dialog_cancel, e18Var24), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var24, 0, 0, 262142);
                }
                break;
            case 24:
                ld4 ld4Var25 = (ld4) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var25 = (e18) ld4Var25;
                if (!e18Var25.Q(iIntValue25 & 1, (iIntValue25 & 17) != 16)) {
                    e18Var25.T();
                } else {
                    tjh.b(d4c.j0(R.string.conway_dialog_ok, e18Var25), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var25, 0, 0, 262142);
                }
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                ld4 ld4Var26 = (ld4) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var26 = (e18) ld4Var26;
                if (!e18Var26.Q(iIntValue26 & 1, (iIntValue26 & 17) != 16)) {
                    e18Var26.T();
                } else {
                    tjh.b(d4c.j0(R.string.conway_dialog_ok, e18Var26), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var26, 0, 0, 262142);
                }
                break;
            case 26:
                ld4 ld4Var27 = (ld4) obj2;
                int iIntValue27 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var27 = (e18) ld4Var27;
                if (!e18Var27.Q(iIntValue27 & 1, (iIntValue27 & 17) != 16)) {
                    e18Var27.T();
                } else {
                    tjh.b(d4c.j0(R.string.conway_dialog_ok, e18Var27), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var27, 0, 0, 262142);
                }
                break;
            case 27:
                ld4 ld4Var28 = (ld4) obj2;
                int iIntValue28 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var28 = (e18) ld4Var28;
                if (!e18Var28.Q(iIntValue28 & 1, (iIntValue28 & 17) != 16)) {
                    e18Var28.T();
                } else {
                    tjh.b(d4c.j0(R.string.conway_dialog_delete, e18Var28), null, gm3.a(e18Var28).z, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var28, 0, 0, 262138);
                }
                break;
            case 28:
                ld4 ld4Var29 = (ld4) obj2;
                int iIntValue29 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var29 = (e18) ld4Var29;
                if (!e18Var29.Q(iIntValue29 & 1, (iIntValue29 & 17) != 16)) {
                    e18Var29.T();
                } else {
                    tjh.b(d4c.j0(R.string.conway_dialog_cancel, e18Var29), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var29, 0, 0, 262142);
                }
                break;
            default:
                ld4 ld4Var30 = (ld4) obj2;
                int iIntValue30 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var30 = (e18) ld4Var30;
                if (!e18Var30.Q(iIntValue30 & 1, (iIntValue30 & 17) != 16)) {
                    e18Var30.T();
                } else {
                    tjh.b(d4c.j0(R.string.conway_webhook_verify_action, e18Var30), null, gm3.a(e18Var30).a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var30).e.E).i, e18Var30, 0, 0, 131066);
                }
                break;
        }
        return ieiVar;
    }
}
