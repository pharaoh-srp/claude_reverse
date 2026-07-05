package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import java.util.WeakHashMap;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xa4 implements rz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ xa4(int i) {
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
                ((ax9) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e18Var.T();
                } else {
                    ez1.a(b.y(gb9.L(b.c(fqbVar, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, 1), lja.K, 2), vf2.J, 0L, e18Var, 54, 4);
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
                    kxk.g(e18Var2, b.t(fqbVar, 12.0f));
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
                    ez1.a(null, vf2.J, 0L, e18Var3, 48, 5);
                }
                break;
            case 3:
                ld4 ld4Var4 = (ld4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    e18Var4.T();
                } else {
                    kwj.g(null, false, true, null, gm3.a(e18Var4).N, 8.0f, 5.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var4, 1769910, 392);
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
                    tjh.b(d4c.j0(R.string.notification_permission_enable, e18Var5), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var5, 0, 0, 262142);
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
                    tjh.b(d4c.j0(R.string.voice_tool_approval_always_allow, e18Var6), null, gm3.a(e18Var6).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var6).e.E).g, e18Var6, 0, 0, 131066);
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
                    tjh.b(d4c.j0(R.string.voice_tool_approval_deny, e18Var7), null, gm3.a(e18Var7).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var7).e.E).g, e18Var7, 0, 0, 131066);
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
                    tjh.b(d4c.j0(R.string.button_open_permission_settings, e18Var8), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var8, 0, 0, 262142);
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
                    tjh.b(d4c.j0(R.string.generic_button_cancel, e18Var9), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var9, 0, 0, 262142);
                }
                break;
            case 9:
                ld4 ld4Var10 = (ld4) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var10 = (e18) ld4Var10;
                if (!e18Var10.Q(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    e18Var10.T();
                }
                break;
            case 10:
                ld4 ld4Var11 = (ld4) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var11 = (e18) ld4Var11;
                if (!e18Var11.Q(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    e18Var11.T();
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
                    tjh.b("Reset to GrowthBook defaults", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var12, 6, 0, 262142);
                }
                break;
            case 12:
                ld4 ld4Var13 = (ld4) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var13 = (e18) ld4Var13;
                if (!e18Var13.Q(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    e18Var13.T();
                }
                break;
            case 13:
                ld4 ld4Var14 = (ld4) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var14 = (e18) ld4Var14;
                if (!e18Var14.Q(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    e18Var14.T();
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
                    tjh.b(d4c.j0(R.string.notification_permission_skip, e18Var15), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var15, 0, 0, 262142);
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
                    tjh.b(d4c.j0(R.string.voice_tool_approval_allow_once, e18Var16), null, gm3.a(e18Var16).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var16).e.E).g, e18Var16, 0, 0, 131066);
                }
                break;
            case 16:
                ld4 ld4Var17 = (ld4) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var17 = (e18) ld4Var17;
                if (!e18Var17.Q(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    e18Var17.T();
                } else {
                    tjh.b(d4c.j0(R.string.chat_ended_button_start_new_chat, e18Var17), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var17, 0, 0, 262142);
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
                    tjh.b(d4c.j0(R.string.ccr_html_preview_retry, e18Var18), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var18, 0, 0, 262142);
                }
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ld4 ld4Var19 = (ld4) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var19 = (e18) ld4Var19;
                if (!e18Var19.Q(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    e18Var19.T();
                } else {
                    tjh.b(d4c.j0(R.string.ccr_model_overflow_header, e18Var19), gb9.M(fqbVar, 16.0f, 16.0f, 16.0f, 4.0f), gm3.a(e18Var19).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var19).e.E).j, e18Var19, 0, 0, 131064);
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
                    kxk.g(e18Var20, b.e(fqbVar, 16.0f));
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
                    nuj.i(d4c.j0(R.string.ccr_share_warning_both, e18Var21), null, e18Var21, 0);
                }
                break;
            case 21:
                ld4 ld4Var22 = (ld4) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var22 = (e18) ld4Var22;
                if (!e18Var22.Q(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    e18Var22.T();
                } else {
                    nuj.i(d4c.j0(R.string.ccr_share_warning_private_repo, e18Var22), null, e18Var22, 0);
                }
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ld4 ld4Var23 = (ld4) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var23 = (e18) ld4Var23;
                if (!e18Var23.Q(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    e18Var23.T();
                } else {
                    nuj.i(d4c.j0(R.string.ccr_share_warning_secrets, e18Var23), null, e18Var23, 0);
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
                    tjh.b(d4c.j0(R.string.ccr_shared_session_report, e18Var24), null, gm3.a(e18Var24).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var24).e.E).l, e18Var24, 0, 0, 131066);
                }
                break;
            case 24:
                ld4 ld4Var25 = (ld4) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var25 = (e18) ld4Var25;
                if (!e18Var25.Q(iIntValue25 & 1, (iIntValue25 & 17) != 16)) {
                    e18Var25.T();
                } else {
                    vo1 vo1Var = lja.T;
                    iqb iqbVarL = gb9.L(b.c(fqbVar, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 36.0f, 1);
                    q64 q64VarA = p64.a(ko0.c, vo1Var, e18Var25, 48);
                    int iHashCode = Long.hashCode(e18Var25.T);
                    hyc hycVarL = e18Var25.l();
                    iqb iqbVarE = kxk.E(e18Var25, iqbVarL);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var25.e0();
                    if (e18Var25.S) {
                        e18Var25.k(re4Var);
                    } else {
                        e18Var25.n0();
                    }
                    d4c.i0(e18Var25, cd4.f, q64VarA);
                    d4c.i0(e18Var25, cd4.e, hycVarL);
                    d4c.i0(e18Var25, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var25, cd4.h);
                    d4c.i0(e18Var25, cd4.d, iqbVarE);
                    ez1.a(null, vf2.J, 0L, e18Var25, 48, 5);
                    e18Var25.p(true);
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
                    WeakHashMap weakHashMap = gdj.x;
                    kxk.g(e18Var26, fik.n(s4i.d(e18Var26).m));
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
                ((mw1) obj).getClass();
                e18 e18Var28 = (e18) ld4Var28;
                if (!e18Var28.Q(iIntValue28 & 1, (iIntValue28 & 17) != 16)) {
                    e18Var28.T();
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
                    tjh.b("OK", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var29, 6, 0, 262142);
                }
                break;
            default:
                ld4 ld4Var30 = (ld4) obj2;
                int iIntValue30 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var30 = (e18) ld4Var30;
                if (!e18Var30.Q(iIntValue30 & 1, (iIntValue30 & 17) != 16)) {
                    e18Var30.T();
                } else {
                    iv1.b(ud0.M1, null, gb9.N(fqb.E, 4.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 10), null, 0L, e18Var30, 432, 24);
                }
                break;
        }
        return ieiVar;
    }
}
