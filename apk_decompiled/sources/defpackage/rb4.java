package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rb4 implements rz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ rb4(int i) {
        this.E = i;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
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
                    tjh.b(d4c.j0(R.string.onboarding_v2_desktop_skip, e18Var), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 0, 0, 131070);
                }
                break;
            case 1:
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e18Var2.T();
                } else {
                    ne5.b(b.c(gb9.L(fqbVar, 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), 1.0f), e18Var2, 0);
                }
                break;
            case 2:
                mw1 mw1Var = (mw1) obj;
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                mw1Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((e18) ld4Var3).f(mw1Var) ? 4 : 2;
                }
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    e18Var3.T();
                } else {
                    nvk.c(mw1Var, h39.F, 0L, e18Var3, (iIntValue3 & 14) | 48);
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
                    tjh.b(d4c.j0(R.string.chat_ended_button_start_new_chat, e18Var4), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var4, 0, 0, 262142);
                }
                break;
            case 4:
                dxe dxeVar = (dxe) obj;
                ld4 ld4Var5 = (ld4) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                dxeVar.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= ((e18) ld4Var5).f(dxeVar) ? 4 : 2;
                }
                e18 e18Var5 = (e18) ld4Var5;
                if (!e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    e18Var5.T();
                } else {
                    iv1.b(ud0.H1, null, null, ef2.F, gm3.a(e18Var5).x, e18Var5, 3120, 4);
                    kxk.g(e18Var5, b.t(fqbVar, 8.0f));
                    tjh.b(d4c.j0(R.string.chat_input_prefill_warning, e18Var5), dxeVar.a(fqbVar, 1.0f, true), gm3.a(e18Var5).x, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var5).e.E).k, e18Var5, 0, 0, 131064);
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
                    tjh.b(d4c.j0(R.string.flexible_update_disclaimer_action, e18Var6), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var6, 0, 0, 262142);
                }
                break;
            case 6:
                dxe dxeVar2 = (dxe) obj;
                ld4 ld4Var7 = (ld4) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                dxeVar2.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= ((e18) ld4Var7).f(dxeVar2) ? 4 : 2;
                }
                e18 e18Var7 = (e18) ld4Var7;
                if (!e18Var7.Q(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    e18Var7.T();
                } else {
                    tjh.b(d4c.j0(R.string.flexible_update_downloading_message, e18Var7), dxeVar2.a(fqbVar, 1.0f, true), gm3.a(e18Var7).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var7).e.E).k, e18Var7, 0, 0, 131064);
                }
                break;
            case 7:
                ld4 ld4Var8 = (ld4) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var8 = (e18) ld4Var8;
                if (!e18Var8.Q(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    e18Var8.T();
                } else {
                    tjh.b(d4c.j0(R.string.open, e18Var8), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var8, 0, 0, 262142);
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
                    tjh.b(d4c.j0(R.string.generic_button_okay, e18Var9), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var9, 0, 0, 262142);
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
                    tjh.b(d4c.j0(R.string.generic_button_cancel, e18Var10), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var10, 0, 0, 262142);
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
                    tjh.b(d4c.j0(R.string.chat_ended_button_start_new_chat, e18Var11), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var11, 0, 0, 262142);
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
                    cv8.b(a.a(ud0.d0, e18Var12), null, gb9.N(fqb.E, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 11), 0L, e18Var12, 440, 8);
                    tjh.b(d4c.j0(R.string.generic_download, e18Var12), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var12).e.E).e, e18Var12, 0, 0, 131070);
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
                    tjh.b(d4c.j0(R.string.generic_save, e18Var13), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var13, 0, 0, 262142);
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
                    tjh.b(d4c.j0(R.string.generic_button_cancel, e18Var14), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var14, 0, 0, 262142);
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
                    tjh.b(d4c.j0(R.string.event_create_tool_create_event, e18Var15), gb9.J(b.c(fqbVar, 1.0f), 6.0f), gm3.a(e18Var15).M, 0L, null, dv7.M, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, null, e18Var15, 1572912, 0, 261048);
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
                    tjh.b(d4c.j0(R.string.external_link_dialog_confirm, e18Var16), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var16, 0, 0, 262142);
                }
                break;
            case 16:
                ld4 ld4Var17 = (ld4) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var17 = (e18) ld4Var17;
                if (!e18Var17.Q(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    e18Var17.T();
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
                    cv8.b(a.a(ud0.D0, e18Var18), null, null, 0L, e18Var18, 56, 12);
                    kxk.g(e18Var18, b.t(fqbVar, 8.0f));
                    tjh.b(d4c.j0(R.string.feedback_learn_more, e18Var18), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var18).e.E).i, e18Var18, 0, 0, 131070);
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
                    iv1.b(ud0.j, null, null, ef2.F, gm3.a(e18Var19).O, e18Var19, 3120, 4);
                    kxk.g(e18Var19, b.o(fqbVar, q02.g));
                    tjh.b(d4c.j0(R.string.button_scroll_to_bottom, e18Var19), null, gm3.a(e18Var19).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var19).e.E).i, e18Var19, 0, 0, 131066);
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
                    tjh.b(d4c.j0(R.string.internal_setting_growthbook_editor_action_save, e18Var20), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var20).e.E).j, e18Var20, 0, 0, 131070);
                }
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ld4 ld4Var21 = (ld4) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var21 = (e18) ld4Var21;
                if (!e18Var21.Q(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    e18Var21.T();
                } else {
                    tjh.b(d4c.j0(R.string.internal_setting_growthbook_clear_all, e18Var21), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var21, 0, 0, 262142);
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
                    tjh.b(d4c.j0(R.string.internal_setting_growthbook_editor_add_custom_feature_button, e18Var22), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var22, 0, 0, 262142);
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
                    tjh.b(d4c.j0(R.string.internal_setting_growthbook_override_add_custom_feature_cancel, e18Var23), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var23, 0, 0, 262142);
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
                    tjh.b(d4c.j0(R.string.health_tool_opt_in_accept, e18Var24), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var24).e.E).h, e18Var24, 0, 0, 131070);
                }
                break;
            case 24:
                ld4 ld4Var25 = (ld4) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                ((mw1) obj).getClass();
                e18 e18Var25 = (e18) ld4Var25;
                if (!e18Var25.Q(iIntValue25 & 1, (iIntValue25 & 17) != 16)) {
                    e18Var25.T();
                }
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                ld4 ld4Var26 = (ld4) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var26 = (e18) ld4Var26;
                if (!e18Var26.Q(iIntValue26 & 1, (iIntValue26 & 17) != 16)) {
                    e18Var26.T();
                } else {
                    tjh.b(d4c.j0(R.string.voice_start_talking, e18Var26), gb9.J(fqbVar, 32.0f), gm3.a(e18Var26).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var26).e.E).e, e18Var26, 48, 0, 131064);
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
                    qnc qncVar = qf2.a;
                    kxk.g(e18Var27, b.e(fqbVar, 12.0f));
                }
                break;
            case 27:
                ld4 ld4Var28 = (ld4) obj2;
                int iIntValue28 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var28 = (e18) ld4Var28;
                if (!e18Var28.Q(iIntValue28 & 1, (iIntValue28 & 17) != 16)) {
                    e18Var28.T();
                } else {
                    dw1.a(fqbVar, e18Var28, 6);
                }
                break;
            case 28:
                mnc mncVar = (mnc) obj;
                ld4 ld4Var29 = (ld4) obj2;
                int iIntValue29 = ((Integer) obj3).intValue();
                mncVar.getClass();
                if ((iIntValue29 & 6) == 0) {
                    iIntValue29 |= ((e18) ld4Var29).f(mncVar) ? 4 : 2;
                }
                e18 e18Var29 = (e18) ld4Var29;
                if (!e18Var29.Q(iIntValue29 & 1, (iIntValue29 & 19) != 18)) {
                    e18Var29.T();
                } else {
                    me7.b(MTTypesetterKt.kLineSkipLimitMultiplier, 0, 0L, e18Var29, gb9.I(fqbVar, mncVar));
                }
                break;
            default:
                ld4 ld4Var30 = (ld4) obj2;
                int iIntValue30 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var30 = (e18) ld4Var30;
                if (!e18Var30.Q(iIntValue30 & 1, (iIntValue30 & 17) != 16)) {
                    e18Var30.T();
                } else {
                    tjh.b("Never shown", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var30, 6, 0, 262142);
                }
                break;
        }
        return ieiVar;
    }
}
