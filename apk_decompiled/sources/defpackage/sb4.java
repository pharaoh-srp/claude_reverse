package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.tool.ImageGalleryItem;
import com.anthropic.claude.api.chat.tool.ImageGalleryItemId;
import com.anthropic.claude.design.icon.a;
import com.anthropic.claude.types.strings.ToolUseId;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sb4 implements pz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ sb4(int i) {
        this.E = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        fqb fqbVar = fqb.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    cvk.b(null, e18Var, 0);
                }
                break;
            case 1:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    tjh.b(d4c.j0(R.string.internal_setting_growthbook_editor_action_format, e18Var2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var2, 0, 0, 262142);
                }
                break;
            case 2:
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e18Var3.T();
                } else {
                    tjh.b(d4c.j0(R.string.internal_setting_growthbook_editor_action_clear, e18Var3), null, gm3.a(e18Var3).z, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var3, 0, 0, 262138);
                }
                break;
            case 3:
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    e18Var4.T();
                } else {
                    tjh.b(d4c.j0(R.string.internal_setting_growthbook_override_add_custom_feature, e18Var4), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var4, 0, 0, 262142);
                }
                break;
            case 4:
                ld4 ld4Var5 = (ld4) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                e18 e18Var5 = (e18) ld4Var5;
                if (!e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    e18Var5.T();
                } else {
                    tjh.b(d4c.j0(R.string.internal_setting_growthbook_override_add_custom_feature, e18Var5), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var5, 0, 0, 262142);
                }
                break;
            case 5:
                ld4 ld4Var6 = (ld4) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                e18 e18Var6 = (e18) ld4Var6;
                if (!e18Var6.Q(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    e18Var6.T();
                }
                break;
            case 6:
                ld4 ld4Var7 = (ld4) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                e18 e18Var7 = (e18) ld4Var7;
                if (!e18Var7.Q(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    e18Var7.T();
                } else {
                    tjh.b("UI Demos", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var7, 6, 0, 262142);
                }
                break;
            case 7:
                ld4 ld4Var8 = (ld4) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                e18 e18Var8 = (e18) ld4Var8;
                if (!e18Var8.Q(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    e18Var8.T();
                } else {
                    zni.e(null, pmk.a, null, null, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, e18Var8, 48, 253);
                }
                break;
            case 8:
                ld4 ld4Var9 = (ld4) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                e18 e18Var9 = (e18) ld4Var9;
                if (!e18Var9.Q(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    e18Var9.T();
                } else {
                    lwj.b(null, 0L, e18Var9, 0);
                }
                break;
            case 9:
                ld4 ld4Var10 = (ld4) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                e18 e18Var10 = (e18) ld4Var10;
                if (!e18Var10.Q(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    e18Var10.T();
                } else {
                    iv1.b(ud0.M1, d4c.j0(R.string.generic_close_button_content_description, e18Var10), null, null, d54.d, e18Var10, 24576, 12);
                }
                break;
            case 10:
                ld4 ld4Var11 = (ld4) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                e18 e18Var11 = (e18) ld4Var11;
                if (!e18Var11.Q(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    e18Var11.T();
                } else {
                    q64 q64VarA = p64.a(new ho0(16.0f, true, new sz6(1)), lja.S, e18Var11, 6);
                    int iHashCode = Long.hashCode(e18Var11.T);
                    hyc hycVarL = e18Var11.l();
                    iqb iqbVarE = kxk.E(e18Var11, fqbVar);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var11.e0();
                    if (e18Var11.S) {
                        e18Var11.k(re4Var);
                    } else {
                        e18Var11.n0();
                    }
                    d4c.i0(e18Var11, cd4.f, q64VarA);
                    d4c.i0(e18Var11, cd4.e, hycVarL);
                    d4c.i0(e18Var11, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var11, cd4.h);
                    d4c.i0(e18Var11, cd4.d, iqbVarE);
                    fuk.g(x44.X(new ImageGalleryItem(ImageGalleryItemId.m305constructorimpl("1"), "https://picsum.photos/800/600", "Cute Cat 1", "example.com", (String) null, (Integer) null, (Integer) null, (String) null, (Integer) null, (Integer) null, (String) null, 2032, (mq5) null), new ImageGalleryItem(ImageGalleryItemId.m305constructorimpl("2"), "https://picsum.photos/600/800", "Cute Cat 2", "photos.example.com", (String) (null == true ? 1 : 0), (Integer) (null == true ? 1 : 0), (Integer) (null == true ? 1 : 0), (String) (null == true ? 1 : 0), (Integer) (null == true ? 1 : 0), (Integer) (null == true ? 1 : 0), (String) null, 2032, (mq5) null), new ImageGalleryItem(ImageGalleryItemId.m305constructorimpl("3"), "https://picsum.photos/600/600", "Cute Cat 3", "wikipedia.org", (String) (null == true ? 1 : 0), (Integer) (null == true ? 1 : 0), (Integer) (null == true ? 1 : 0), (String) (null == true ? 1 : 0), (Integer) (null == true ? 1 : 0), (Integer) (null == true ? 1 : 0), (String) null, 2032, (mq5) null)), ToolUseId.m1158constructorimpl("preview"), true, 5, "https://support.anthropic.com", null, null, false, null, e18Var11, 28086, 480);
                    e18Var11.p(true);
                }
                break;
            case 11:
                ld4 ld4Var12 = (ld4) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                e18 e18Var12 = (e18) ld4Var12;
                if (!e18Var12.Q(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    e18Var12.T();
                } else {
                    iv1.b(ud0.M1, d4c.j0(R.string.generic_close_button_content_description, e18Var12), null, ef2.F, 0L, e18Var12, 3072, 20);
                }
                break;
            case 12:
                ld4 ld4Var13 = (ld4) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                e18 e18Var13 = (e18) ld4Var13;
                if (!e18Var13.Q(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    e18Var13.T();
                } else {
                    cv8.b(a.a(ud0.S0, e18Var13), null, null, gm3.a(e18Var13).M, e18Var13, 56, 4);
                }
                break;
            case 13:
                ld4 ld4Var14 = (ld4) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                e18 e18Var14 = (e18) ld4Var14;
                if (!e18Var14.Q(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    e18Var14.T();
                } else {
                    cv8.b(a.a(ud0.C0, e18Var14), d4c.j0(R.string.learn_more_menu_icon_content_description, e18Var14), b.o(fqbVar, csg.A(24, e18Var14)), 0L, e18Var14, 8, 8);
                }
                break;
            case 14:
                ld4 ld4Var15 = (ld4) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                e18 e18Var15 = (e18) ld4Var15;
                if (!e18Var15.Q(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    e18Var15.T();
                } else {
                    tjh.b("Reset Claude Code Remote onboarding?", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var15, 6, 0, 262142);
                }
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ld4 ld4Var16 = (ld4) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                e18 e18Var16 = (e18) ld4Var16;
                if (!e18Var16.Q(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    e18Var16.T();
                } else {
                    tjh.b("This archives all Code environments and clears local onboarding state — you'll go through the cold-start flow again. GitHub stays connected (mobile's cold-start state needs it; use the toggle above to force-disconnect). Sessions are untouched.", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var16, 0, 0, 262142);
                }
                break;
            case 16:
                ld4 ld4Var17 = (ld4) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                e18 e18Var17 = (e18) ld4Var17;
                if (!e18Var17.Q(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    e18Var17.T();
                } else {
                    dxj.b(0, e18Var17);
                }
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ld4 ld4Var18 = (ld4) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                e18 e18Var18 = (e18) ld4Var18;
                if (!e18Var18.Q(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    e18Var18.T();
                } else {
                    cv8.b(a.a(ud0.s1, e18Var18), null, null, 0L, e18Var18, 56, 12);
                }
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ld4 ld4Var19 = (ld4) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                e18 e18Var19 = (e18) ld4Var19;
                if (!e18Var19.Q(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    e18Var19.T();
                } else {
                    v40.c(null, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var19, 0, 3);
                }
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ld4 ld4Var20 = (ld4) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                e18 e18Var20 = (e18) ld4Var20;
                if (!e18Var20.Q(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    e18Var20.T();
                } else {
                    cv8.b(a.a(ud0.g, e18Var20), "Internal Settings", null, 0L, e18Var20, 56, 12);
                }
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ld4 ld4Var21 = (ld4) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                e18 e18Var21 = (e18) ld4Var21;
                if (!e18Var21.Q(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    e18Var21.T();
                } else {
                    tjh.b(d4c.j0(R.string.title_logout, e18Var21), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var21, 0, 0, 262142);
                }
                break;
            case 21:
                ld4 ld4Var22 = (ld4) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                e18 e18Var22 = (e18) ld4Var22;
                if (!e18Var22.Q(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    e18Var22.T();
                } else {
                    q64 q64VarA2 = p64.a(ko0.c, lja.S, e18Var22, 0);
                    int iHashCode2 = Long.hashCode(e18Var22.T);
                    hyc hycVarL2 = e18Var22.l();
                    iqb iqbVarE2 = kxk.E(e18Var22, fqbVar);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var22.e0();
                    if (e18Var22.S) {
                        e18Var22.k(re4Var2);
                    } else {
                        e18Var22.n0();
                    }
                    d4c.i0(e18Var22, cd4.f, q64VarA2);
                    d4c.i0(e18Var22, cd4.e, hycVarL2);
                    d4c.i0(e18Var22, cd4.g, Integer.valueOf(iHashCode2));
                    d4c.h0(e18Var22, cd4.h);
                    d4c.i0(e18Var22, cd4.d, iqbVarE2);
                    tjh.b(d4c.j0(R.string.body_logout, e18Var22), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var22, 0, 0, 262142);
                    e18Var22.p(true);
                }
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ld4 ld4Var23 = (ld4) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                e18 e18Var23 = (e18) ld4Var23;
                if (!e18Var23.Q(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    e18Var23.T();
                } else {
                    cv8.b(a.a(ud0.l, e18Var23), null, b.o(fqbVar, 20.0f), 0L, e18Var23, 440, 8);
                }
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ld4 ld4Var24 = (ld4) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                e18 e18Var24 = (e18) ld4Var24;
                if (!e18Var24.Q(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    e18Var24.T();
                } else {
                    tjh.b("Error details", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var24).e.E).g, e18Var24, 6, 0, 131070);
                }
                break;
            case 24:
                ld4 ld4Var25 = (ld4) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                e18 e18Var25 = (e18) ld4Var25;
                if (!e18Var25.Q(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    e18Var25.T();
                }
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                ld4 ld4Var26 = (ld4) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                e18 e18Var26 = (e18) ld4Var26;
                if (!e18Var26.Q(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    e18Var26.T();
                } else {
                    tqh.O.x(6, e18Var26);
                }
                break;
            case 26:
                ld4 ld4Var27 = (ld4) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                e18 e18Var27 = (e18) ld4Var27;
                if (!e18Var27.Q(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    e18Var27.T();
                } else {
                    tqh.O.z(6, e18Var27);
                }
                break;
            case 27:
                ld4 ld4Var28 = (ld4) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                e18 e18Var28 = (e18) ld4Var28;
                if (!e18Var28.Q(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    e18Var28.T();
                } else {
                    me7.b(MTTypesetterKt.kLineSkipLimitMultiplier, 6, 0L, e18Var28, gb9.L(fqbVar, 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2));
                }
                break;
            case 28:
                ld4 ld4Var29 = (ld4) obj;
                int iIntValue29 = ((Integer) obj2).intValue();
                e18 e18Var29 = (e18) ld4Var29;
                if (!e18Var29.Q(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    e18Var29.T();
                } else {
                    tjh.b(d4c.j0(R.string.mcp_tools_set_all, e18Var29), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var29).e.E).e, e18Var29, 0, 0, 131070);
                }
                break;
            default:
                ld4 ld4Var30 = (ld4) obj;
                int iIntValue30 = ((Integer) obj2).intValue();
                e18 e18Var30 = (e18) ld4Var30;
                if (!e18Var30.Q(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    e18Var30.T();
                } else {
                    cv8.b(a.a(ud0.H0, e18Var30), d4c.j0(R.string.mcp_tool_permission_option_locked, e18Var30), b.o(fqbVar, 14.0f), gm3.a(e18Var30).O, e18Var30, 392, 0);
                }
                break;
        }
        return ieiVar;
    }
}
