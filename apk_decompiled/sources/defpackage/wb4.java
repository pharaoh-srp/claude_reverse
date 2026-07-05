package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import java.util.List;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wb4 implements rz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ wb4(int i) {
        this.E = i;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        int i2 = 3;
        fqb fqbVar = fqb.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(1 & iIntValue, (iIntValue & 17) != 16)) {
                    e18Var.T();
                } else {
                    cjh cjhVar = new cjh("555 123 4567", 0L, 6);
                    String strJ0 = d4c.j0(R.string.verification_flow_phone_field_label, e18Var);
                    mp9 mp9Var = new mp9(z ? 1 : 0, i2, z ? 1 : 0, 123);
                    iqb iqbVarL = gb9.L(b.c(fqbVar, 1.0f), 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                    Object objN = e18Var.N();
                    if (objN == jd4.a) {
                        objN = new i04(29);
                        e18Var.k0(objN);
                    }
                    zh4.d(cjhVar, (bz7) objN, strJ0, iqbVarL, false, null, "", null, mp9Var, null, 0L, null, 5, e18Var, 102236214, 3760);
                }
                break;
            case 1:
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e18Var2.T();
                } else {
                    tjh.b(d4c.j0(R.string.onboarding_v2_phone_change_number, e18Var2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).g, e18Var2, 0, 0, 131070);
                }
                break;
            case 2:
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    e18Var3.T();
                } else {
                    tjh.b(d4c.j0(R.string.onboarding_v2_phone_resend, e18Var3), null, gm3.a(e18Var3).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var3).e.E).i, e18Var3, 0, 0, 131066);
                }
                break;
            case 3:
                ld4 ld4Var4 = (ld4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(1 & iIntValue4, (iIntValue4 & 17) != 16)) {
                    e18Var4.T();
                } else {
                    cjh cjhVar2 = new cjh("123456", 0L, 6);
                    String strJ02 = d4c.j0(R.string.verification_flow_phone_code_verify_placeholder, e18Var4);
                    mp9 mp9Var2 = new mp9(z ? 1 : 0, i2, z ? 1 : 0, 123);
                    iqb iqbVarL2 = gb9.L(b.c(fqbVar, 1.0f), 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                    Object objN2 = e18Var4.N();
                    lz1 lz1Var = jd4.a;
                    if (objN2 == lz1Var) {
                        objN2 = new i04(28);
                        e18Var4.k0(objN2);
                    }
                    zh4.d(cjhVar2, (bz7) objN2, strJ02, iqbVarL2, false, null, null, null, mp9Var2, null, 0L, null, 0, e18Var4, 100663350, 7920);
                    Object objN3 = e18Var4.N();
                    if (objN3 == lz1Var) {
                        objN3 = new oob(19);
                        e18Var4.k0(objN3);
                    }
                    csg.j((zy7) objN3, gb9.L(b.c(fqbVar, 1.0f), 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), false, null, null, null, null, urk.d, e18Var4, 805306374, 508);
                }
                break;
            case 4:
                List list = (List) obj;
                ld4 ld4Var5 = (ld4) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                list.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= (iIntValue5 & 8) == 0 ? ((e18) ld4Var5).f(list) : ((e18) ld4Var5).h(list) ? 4 : 2;
                }
                e18 e18Var5 = (e18) ld4Var5;
                if (!e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    e18Var5.T();
                } else {
                    rwj.a(list, b.c, e18Var5, (iIntValue5 & 14) | 48, 0);
                }
                break;
            case 5:
                List list2 = (List) obj;
                ld4 ld4Var6 = (ld4) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                list2.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= (iIntValue6 & 8) == 0 ? ((e18) ld4Var6).f(list2) : ((e18) ld4Var6).h(list2) ? 4 : 2;
                }
                e18 e18Var6 = (e18) ld4Var6;
                if (!e18Var6.Q(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    e18Var6.T();
                } else {
                    rwj.a(list2, b.c, e18Var6, (iIntValue6 & 14) | 48, 0);
                }
                break;
            case 6:
                zy7 zy7Var = (zy7) obj;
                ld4 ld4Var7 = (ld4) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                zy7Var.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= ((e18) ld4Var7).h(zy7Var) ? 4 : 2;
                }
                e18 e18Var7 = (e18) ld4Var7;
                if (!e18Var7.Q(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    e18Var7.T();
                } else {
                    ez1.e(zy7Var, null, false, null, null, bsk.a, e18Var7, (iIntValue7 & 14) | 1572864, 62);
                }
                break;
            case 7:
                ld4 ld4Var8 = (ld4) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((ax9) obj).getClass();
                e18 e18Var8 = (e18) ld4Var8;
                if (!e18Var8.Q(1 & iIntValue8, (iIntValue8 & 17) != 16)) {
                    e18Var8.T();
                } else {
                    fik.f(null, e18Var8, 0);
                }
                break;
            case 8:
                ld4 ld4Var9 = (ld4) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var9 = (e18) ld4Var9;
                if (!e18Var9.Q(1 & iIntValue9, (iIntValue9 & 17) != 16)) {
                    e18Var9.T();
                } else {
                    dw1.a(yfd.p(b.o(fqbVar, 36.0f), gm3.a(e18Var9).k, xve.a), e18Var9, 0);
                }
                break;
            case 9:
                ld4 ld4Var10 = (ld4) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var10 = (e18) ld4Var10;
                if (!e18Var10.Q(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    e18Var10.T();
                } else {
                    tjh.b(d4c.j0(R.string.template_upload_a_few_things_to_know_before_we_get_started, e18Var10), gb9.N(fqb.E, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, 7), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var10).e.E).e, e18Var10, 48, 0, 131068);
                }
                break;
            case 10:
                ld4 ld4Var11 = (ld4) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((mw1) obj).getClass();
                e18 e18Var11 = (e18) ld4Var11;
                if (!e18Var11.Q(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    e18Var11.T();
                } else {
                    ez1.a(null, vf2.H, gm3.a(e18Var11).M, e18Var11, 48, 1);
                }
                break;
            case 11:
                ld4 ld4Var12 = (ld4) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((mw1) obj).getClass();
                e18 e18Var12 = (e18) ld4Var12;
                if (!e18Var12.Q(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    e18Var12.T();
                } else {
                    cv8.b(a.a(ud0.K1, e18Var12), d4c.j0(R.string.generic_error_something_went_wrong, e18Var12), b.o(fqbVar, 36.0f), gm3.a(e18Var12).M, e18Var12, 392, 0);
                }
                break;
            case 12:
                ld4 ld4Var13 = (ld4) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((mw1) obj).getClass();
                e18 e18Var13 = (e18) ld4Var13;
                if (!e18Var13.Q(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    e18Var13.T();
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
                    tjh.b(d4c.j0(R.string.generic_button_yes, e18Var14), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var14, 0, 0, 262142);
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
                    tjh.b(d4c.j0(R.string.ccr_save, e18Var15), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var15, 0, 0, 262142);
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
                    tjh.b(d4c.j0(R.string.generic_cancel, e18Var16), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var16, 0, 0, 262142);
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
                    ez1.a(b.y(gb9.L(b.c(fqbVar, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 36.0f, 1), lja.K, 2), vf2.J, 0L, e18Var17, 54, 4);
                }
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ld4 ld4Var18 = (ld4) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var18 = (e18) ld4Var18;
                if (!e18Var18.Q(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    e18Var18.T();
                } else {
                    ez1.a(b.y(gb9.L(b.c(fqbVar, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, 1), lja.K, 2), vf2.H, 0L, e18Var18, 54, 4);
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
                    cxe cxeVarA = axe.a(new ho0(4.0f, true, new sz6(1)), lja.Q, e18Var19, 54);
                    int iHashCode = Long.hashCode(e18Var19.T);
                    hyc hycVarL = e18Var19.l();
                    iqb iqbVarE = kxk.E(e18Var19, fqbVar);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var19.e0();
                    if (e18Var19.S) {
                        e18Var19.k(re4Var);
                    } else {
                        e18Var19.n0();
                    }
                    d4c.i0(e18Var19, cd4.f, cxeVarA);
                    d4c.i0(e18Var19, cd4.e, hycVarL);
                    d4c.i0(e18Var19, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var19, cd4.h);
                    d4c.i0(e18Var19, cd4.d, iqbVarE);
                    tjh.b(d4c.j0(R.string.self_harm_risk_banner_button, e18Var19), null, gm3.a(e18Var19).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var19).e.E).i, e18Var19, 0, 0, 131066);
                    iv1.b(ud0.B, null, null, ef2.F, gm3.a(e18Var19).M, e18Var19, 3120, 4);
                    e18Var19.p(true);
                }
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ld4 ld4Var20 = (ld4) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var20 = (e18) ld4Var20;
                if (!e18Var20.Q(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    e18Var20.T();
                } else {
                    tjh.b(d4c.j0(R.string.self_harm_risk_banner_button, e18Var20), null, gm3.a(e18Var20).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var20).e.E).i, e18Var20, 0, 0, 131066);
                }
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ld4 ld4Var21 = (ld4) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var21 = (e18) ld4Var21;
                if (!e18Var21.Q(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    e18Var21.T();
                }
                break;
            case 21:
                ld4 ld4Var22 = (ld4) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var22 = (e18) ld4Var22;
                if (!e18Var22.Q(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    e18Var22.T();
                }
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ld4 ld4Var23 = (ld4) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                ((mnc) obj).getClass();
                e18 e18Var23 = (e18) ld4Var23;
                if (!e18Var23.Q(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    e18Var23.T();
                } else {
                    qnc qncVar = qf2.a;
                    kxk.g(e18Var23, b.e(fqbVar, 12.0f));
                }
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                rz7 rz7Var = (rz7) obj;
                ld4 ld4Var24 = (ld4) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                rz7Var.getClass();
                if ((iIntValue24 & 6) == 0) {
                    iIntValue24 |= ((e18) ld4Var24).h(rz7Var) ? 4 : 2;
                }
                e18 e18Var24 = (e18) ld4Var24;
                if (!e18Var24.Q(iIntValue24 & 1, (iIntValue24 & 19) != 18)) {
                    e18Var24.T();
                } else {
                    yhk.a(null, rz7Var, e18Var24, (iIntValue24 << 3) & 112);
                }
                break;
            case 24:
                ld4 ld4Var25 = (ld4) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var25 = (e18) ld4Var25;
                if (!e18Var25.Q(1 & iIntValue25, (iIntValue25 & 17) != 16)) {
                    e18Var25.T();
                } else {
                    etj.h(0, e18Var25);
                }
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                ld4 ld4Var26 = (ld4) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var26 = (e18) ld4Var26;
                if (!e18Var26.Q(iIntValue26 & 1, (iIntValue26 & 17) != 16)) {
                    e18Var26.T();
                } else {
                    zh4.f(d4c.j0(R.string.nav_drawer_section_header_starred, e18Var26), ((jm3) gm3.c(e18Var26).e.E).h, null, new qnc(16.0f, 8.0f, 16.0f, 8.0f), e18Var26, 196608);
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
                    tjh.b(d4c.j0(R.string.onboarding_v2_plan_continue_free, e18Var27), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var27).e.E).g, e18Var27, 0, 0, 131070);
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
                    tjh.b(d4c.j0(R.string.upgrade_subscription_product_selector_limits_apply, e18Var28), null, gm3.a(e18Var28).O, 0L, null, null, null, 0L, qeh.c, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var28).e.E).i, e18Var28, 805306368, 0, 130554);
                }
                break;
            case 28:
                mw1 mw1Var = (mw1) obj;
                ld4 ld4Var29 = (ld4) obj2;
                int iIntValue29 = ((Integer) obj3).intValue();
                mw1Var.getClass();
                if ((iIntValue29 & 6) == 0) {
                    iIntValue29 |= ((e18) ld4Var29).f(mw1Var) ? 4 : 2;
                }
                e18 e18Var29 = (e18) ld4Var29;
                if (!e18Var29.Q(iIntValue29 & 1, (iIntValue29 & 19) != 18)) {
                    e18Var29.T();
                } else {
                    nvk.c(mw1Var, h39.E, 0L, e18Var29, (iIntValue29 & 14) | 48);
                }
                break;
            default:
                mw1 mw1Var2 = (mw1) obj;
                ld4 ld4Var30 = (ld4) obj2;
                int iIntValue30 = ((Integer) obj3).intValue();
                mw1Var2.getClass();
                if ((iIntValue30 & 6) == 0) {
                    iIntValue30 |= ((e18) ld4Var30).f(mw1Var2) ? 4 : 2;
                }
                e18 e18Var30 = (e18) ld4Var30;
                if (!e18Var30.Q(iIntValue30 & 1, (iIntValue30 & 19) != 18)) {
                    e18Var30.T();
                } else {
                    nvk.c(mw1Var2, h39.F, 0L, e18Var30, (iIntValue30 & 14) | 48);
                }
                break;
        }
        return ieiVar;
    }
}
