package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import java.util.WeakHashMap;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tb4 implements rz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ tb4(int i) {
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
                mnc mncVar = (mnc) obj;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                mncVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((e18) ld4Var).f(mncVar) ? 4 : 2;
                }
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                    e18Var.T();
                } else {
                    me7.b(MTTypesetterKt.kLineSkipLimitMultiplier, 0, 0L, e18Var, gb9.I(fqbVar, mncVar));
                }
                break;
            case 1:
                rz7 rz7Var = (rz7) obj;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                rz7Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((e18) ld4Var2).h(rz7Var) ? 4 : 2;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    e18Var2.T();
                } else {
                    int i2 = (iIntValue2 << 9) & 7168;
                    q64 q64VarA = p64.a(ko0.c, lja.S, e18Var2, 0);
                    int iHashCode = Long.hashCode(e18Var2.T);
                    hyc hycVarL = e18Var2.l();
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
                    rz7Var.invoke(s64.a, e18Var2, Integer.valueOf(((i2 >> 6) & 112) | 6));
                    e18Var2.p(true);
                }
                break;
            case 2:
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    e18Var3.T();
                } else {
                    cxe cxeVarA = axe.a(ko0.a, lja.P, e18Var3, 0);
                    int iHashCode2 = Long.hashCode(e18Var3.T);
                    hyc hycVarL2 = e18Var3.l();
                    iqb iqbVarE2 = kxk.E(e18Var3, fqbVar);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var3.e0();
                    if (e18Var3.S) {
                        e18Var3.k(re4Var2);
                    } else {
                        e18Var3.n0();
                    }
                    d4c.i0(e18Var3, cd4.f, cxeVarA);
                    d4c.i0(e18Var3, cd4.e, hycVarL2);
                    d4c.i0(e18Var3, cd4.g, Integer.valueOf(iHashCode2));
                    d4c.h0(e18Var3, cd4.h);
                    d4c.i0(e18Var3, cd4.d, iqbVarE2);
                    kxk.g(e18Var3, b.t(fqbVar, 4.0f));
                    tjd.a(b.o(fqbVar, 16.0f), 0L, 2.0f, 0L, 0, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var3, 390, 58);
                    e18Var3.p(true);
                }
                break;
            case 3:
                ld4 ld4Var4 = (ld4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    e18Var4.T();
                } else {
                    tjh.b(d4c.j0(R.string.login_magic_link_change_email_button, e18Var4), null, gm3.a(e18Var4).l, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var4).e.E).j, e18Var4, 0, 0, 130042);
                }
                break;
            case 4:
                ld4 ld4Var5 = (ld4) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var5 = (e18) ld4Var5;
                if (!e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    e18Var5.T();
                } else {
                    tjh.b(d4c.j0(R.string.map_display_tool_open_route, e18Var5), null, gm3.a(e18Var5).M, 0L, null, dv7.M, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var5, 1572864, 0, 262074);
                }
                break;
            case 5:
                ld4 ld4Var6 = (ld4) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var6 = (e18) ld4Var6;
                if (!e18Var6.Q(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    e18Var6.T();
                } else {
                    tjh.b(d4c.j0(R.string.generic_retry, e18Var6), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var6, 0, 0, 262142);
                }
                break;
            case 6:
                ld4 ld4Var7 = (ld4) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var7 = (e18) ld4Var7;
                if (!e18Var7.Q(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    e18Var7.T();
                } else {
                    tjh.b(d4c.j0(R.string.generic_copy, e18Var7), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var7, 0, 0, 262142);
                }
                break;
            case 7:
                mw1 mw1Var = (mw1) obj;
                ld4 ld4Var8 = (ld4) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                mw1Var.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= ((e18) ld4Var8).f(mw1Var) ? 4 : 2;
                }
                e18 e18Var8 = (e18) ld4Var8;
                if (!e18Var8.Q(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    e18Var8.T();
                } else {
                    nvk.c(mw1Var, h39.F, 0L, e18Var8, (iIntValue8 & 14) | 48);
                }
                break;
            case 8:
                ld4 ld4Var9 = (ld4) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var9 = (e18) ld4Var9;
                if (!e18Var9.Q(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    e18Var9.T();
                } else {
                    tjh.b(d4c.j0(R.string.mcp_prefill_replace_dialog_confirm, e18Var9), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var9, 0, 0, 262142);
                }
                break;
            case 9:
                ld4 ld4Var10 = (ld4) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var10 = (e18) ld4Var10;
                if (!e18Var10.Q(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    e18Var10.T();
                } else {
                    WeakHashMap weakHashMap = gdj.x;
                    kxk.g(e18Var10, fik.n(s4i.d(e18Var10).m));
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
                    tjh.b(d4c.j0(R.string.generic_retry, e18Var11), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var11, 0, 0, 262142);
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
                    tjh.b(d4c.j0(R.string.memory_manage_on_web, e18Var12), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var12, 0, 0, 262142);
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
                    tjh.b(d4c.j0(R.string.generic_button_delete, e18Var13), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var13, 0, 0, 262142);
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
                    tjh.b(d4c.j0(R.string.generic_retry, e18Var14), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var14, 0, 0, 262142);
                }
                break;
            case 14:
                ld4 ld4Var15 = (ld4) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var15 = (e18) ld4Var15;
                if (!e18Var15.Q(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    e18Var15.T();
                } else {
                    qnc qncVar = qf2.a;
                    kxk.g(e18Var15, b.e(fqbVar, 12.0f));
                }
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ld4 ld4Var16 = (ld4) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var16 = (e18) ld4Var16;
                if (!e18Var16.Q(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    e18Var16.T();
                } else {
                    kxk.g(e18Var16, b.e(fqbVar, 16.0f));
                }
                break;
            case 16:
                ld4 ld4Var17 = (ld4) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((mag) obj).getClass();
                e18 e18Var17 = (e18) ld4Var17;
                if (!e18Var17.Q(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    e18Var17.T();
                } else {
                    dw1.a(yfd.p(xn5.V(b.o(fqbVar, 16.0f), xve.a), gm3.a(e18Var17).c, zni.b), e18Var17, 0);
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
                    tjh.b(d4c.j0(R.string.ccr_notification_permission_skip, e18Var18), null, gm3.a(e18Var18).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var18).e.E).g, e18Var18, 0, 0, 131066);
                }
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ld4 ld4Var19 = (ld4) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ((mnc) obj).getClass();
                e18 e18Var19 = (e18) ld4Var19;
                if (!e18Var19.Q(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    e18Var19.T();
                } else {
                    qnc qncVar2 = qf2.a;
                    kxk.g(e18Var19, b.e(fqbVar, 12.0f));
                }
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ld4 ld4Var20 = (ld4) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var20 = (e18) ld4Var20;
                if (!e18Var20.Q(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    e18Var20.T();
                } else {
                    ez1.a(null, vf2.J, 0L, e18Var20, 48, 5);
                }
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ld4 ld4Var21 = (ld4) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var21 = (e18) ld4Var21;
                if (!e18Var21.Q(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    e18Var21.T();
                } else {
                    ez1.a(null, vf2.J, 0L, e18Var21, 48, 5);
                }
                break;
            case 21:
                ld4 ld4Var22 = (ld4) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var22 = (e18) ld4Var22;
                if (!e18Var22.Q(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    e18Var22.T();
                } else {
                    tjh.b(d4c.j0(R.string.ccr_auto_mode_optin_enable, e18Var22), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var22, 0, 0, 262142);
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
                    tjh.b(d4c.j0(R.string.ccr_auto_mode_optin_cancel, e18Var23), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var23, 0, 0, 262142);
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
                    tjh.b(d4c.j0(R.string.ccr_auto_default_notice_ok, e18Var24), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var24, 0, 0, 262142);
                }
                break;
            case 24:
                ld4 ld4Var25 = (ld4) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var25 = (e18) ld4Var25;
                if (!e18Var25.Q(iIntValue25 & 1, (iIntValue25 & 17) != 16)) {
                    e18Var25.T();
                } else if (!((Boolean) e18Var25.j(p59.a)).booleanValue()) {
                    e18Var25.a0(558640442);
                    jpi.a(0, e18Var25);
                    e18Var25.p(false);
                } else {
                    e18Var25.a0(558340021);
                    Object objN = e18Var25.N();
                    if (objN == lz1Var) {
                        objN = new oob(19);
                        e18Var25.k0(objN);
                    }
                    zy7 zy7Var = (zy7) objN;
                    Object objN2 = e18Var25.N();
                    if (objN2 == lz1Var) {
                        objN2 = new oob(19);
                        e18Var25.k0(objN2);
                    }
                    zy7 zy7Var2 = (zy7) objN2;
                    Object objN3 = e18Var25.N();
                    if (objN3 == lz1Var) {
                        objN3 = new oob(19);
                        e18Var25.k0(objN3);
                    }
                    jpi.d(true, false, false, zy7Var, zy7Var2, (zy7) objN3, null, e18Var25, 224694);
                    e18Var25.p(false);
                }
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                ld4 ld4Var26 = (ld4) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var26 = (e18) ld4Var26;
                if (!e18Var26.Q(iIntValue26 & 1, (iIntValue26 & 17) != 16)) {
                    e18Var26.T();
                } else {
                    Object objN4 = e18Var26.N();
                    if (objN4 == lz1Var) {
                        objN4 = new oob(19);
                        e18Var26.k0(objN4);
                    }
                    zy7 zy7Var3 = (zy7) objN4;
                    Object objN5 = e18Var26.N();
                    if (objN5 == lz1Var) {
                        objN5 = new oob(19);
                        e18Var26.k0(objN5);
                    }
                    zy7 zy7Var4 = (zy7) objN5;
                    Object objN6 = e18Var26.N();
                    if (objN6 == lz1Var) {
                        objN6 = new oob(19);
                        e18Var26.k0(objN6);
                    }
                    jpi.d(true, false, false, zy7Var3, zy7Var4, (zy7) objN6, null, e18Var26, 224694);
                }
                break;
            case 26:
                ld4 ld4Var27 = (ld4) obj2;
                int iIntValue27 = ((Integer) obj3).intValue();
                ((mnc) obj).getClass();
                e18 e18Var27 = (e18) ld4Var27;
                if (!e18Var27.Q(iIntValue27 & 1, (iIntValue27 & 17) != 16)) {
                    e18Var27.T();
                } else {
                    qnc qncVar3 = qf2.a;
                    kxk.g(e18Var27, b.e(fqbVar, 12.0f));
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
                    tjh.b(d4c.j0(R.string.phone_call_end_call, e18Var28), null, gm3.a(e18Var28).x, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var28, 0, 0, 262138);
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
                    tjh.b(d4c.j0(R.string.onboarding_v2_phone_change_number, e18Var29), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var29).e.E).g, e18Var29, 0, 0, 131070);
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
                    tjh.b(d4c.j0(R.string.onboarding_v2_phone_resend, e18Var30), null, gm3.a(e18Var30).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var30).e.E).i, e18Var30, 0, 0, 131066);
                }
                break;
        }
        return ieiVar;
    }
}
