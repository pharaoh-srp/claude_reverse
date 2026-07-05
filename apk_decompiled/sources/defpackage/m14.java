package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.R;
import com.anthropic.claude.code.remote.j;
import com.anthropic.claude.design.icon.a;
import java.util.ArrayList;
import java.util.List;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m14 implements pz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ m14(int i) {
        this.E = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        fqb fqbVar = fqb.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                mqg mqgVar = (mqg) obj;
                int iIntValue = ((Integer) obj2).intValue();
                mqgVar.getClass();
                ide ideVar = j.b;
                List<String> list = mqgVar.b;
                ArrayList arrayList = new ArrayList(list.size());
                for (String str : list) {
                    if (iIntValue <= 0) {
                        break;
                    } else if (iIntValue >= str.length()) {
                        arrayList.add(str);
                        iIntValue -= str.length();
                    } else {
                        int i2 = iIntValue - 1;
                        if (Character.isHighSurrogate(str.charAt(i2))) {
                            iIntValue = i2;
                        }
                        if (iIntValue > 0) {
                            arrayList.add(bsg.j1(iIntValue, str));
                        }
                        iIntValue = 0;
                    }
                }
                break;
            case 1:
                ((sk6) obj).c = (q68) obj2;
                break;
            case 2:
                ((sk6) obj).e = ((pt) obj2).a;
                break;
            case 3:
                ((sk6) obj).d = ((rt) obj2).a;
                break;
            case 4:
                String str2 = (String) obj;
                a45 a45Var = (a45) obj2;
                str2.getClass();
                a45Var.getClass();
                if (str2.length() == 0) {
                }
                break;
            case 5:
                String str3 = (String) obj;
                p68 p68Var = (p68) obj2;
                if (str3.length() == 0) {
                }
                break;
            case 6:
                ld4 ld4Var = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    oq5.i(fqb.E, null, null, null, null, 0, 0L, 0L, null, iik.a, e18Var, 805306368, 510);
                } else {
                    e18Var.T();
                }
                break;
            case 7:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (e18Var2.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    pvj.b(a.a(ud0.H, e18Var2), d4c.j0(R.string.mcp_prompts_resources_none_provided, e18Var2), null, null, e18Var2, 8, 12);
                } else {
                    e18Var2.T();
                }
                break;
            case 8:
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (e18Var3.Q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    cv8.b(a.a(ud0.H, e18Var3), null, null, 0L, e18Var3, 56, 12);
                } else {
                    e18Var3.T();
                }
                break;
            case 9:
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                e18 e18Var4 = (e18) ld4Var4;
                if (e18Var4.Q(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    cv8.b(a.a(ud0.l0, e18Var4), null, null, 0L, e18Var4, 56, 12);
                } else {
                    e18Var4.T();
                }
                break;
            case 10:
                ld4 ld4Var5 = (ld4) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                e18 e18Var5 = (e18) ld4Var5;
                if (e18Var5.Q(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    rwk.a(0, e18Var5);
                } else {
                    e18Var5.T();
                }
                break;
            case 11:
                ld4 ld4Var6 = (ld4) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                e18 e18Var6 = (e18) ld4Var6;
                if (e18Var6.Q(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    rwk.a(0, e18Var6);
                } else {
                    e18Var6.T();
                }
                break;
            case 12:
                ld4 ld4Var7 = (ld4) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                e18 e18Var7 = (e18) ld4Var7;
                if (e18Var7.Q(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    rwk.a(0, e18Var7);
                } else {
                    e18Var7.T();
                }
                break;
            case 13:
                ld4 ld4Var8 = (ld4) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                e18 e18Var8 = (e18) ld4Var8;
                if (e18Var8.Q(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    ze.c(0, e18Var8);
                } else {
                    e18Var8.T();
                }
                break;
            case 14:
                ld4 ld4Var9 = (ld4) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                e18 e18Var9 = (e18) ld4Var9;
                if (!e18Var9.Q(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    e18Var9.T();
                }
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ld4 ld4Var10 = (ld4) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                e18 e18Var10 = (e18) ld4Var10;
                if (e18Var10.Q(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    tjh.b(d4c.j0(R.string.chat_menu_thanks_for_reporting_dialog_title, e18Var10), b.c(fqbVar, 1.0f), 0L, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var10).e.E).d, e18Var10, 48, 0, 130044);
                } else {
                    e18Var10.T();
                }
                break;
            case 16:
                ld4 ld4Var11 = (ld4) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                e18 e18Var11 = (e18) ld4Var11;
                if (e18Var11.Q(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    tjh.b(d4c.j0(R.string.chat_menu_thanks_for_reporting_dialog_body, e18Var11), null, gm3.a(e18Var11).O, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, null, e18Var11, 0, 0, 261114);
                } else {
                    e18Var11.T();
                }
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ld4 ld4Var12 = (ld4) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                e18 e18Var12 = (e18) ld4Var12;
                if (!e18Var12.Q(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    e18Var12.T();
                }
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ld4 ld4Var13 = (ld4) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                e18 e18Var13 = (e18) ld4Var13;
                if (e18Var13.Q(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    cv8.b(a.a(ud0.w1, e18Var13), gik.l((nrg) drg.a.getValue(), e18Var13), null, 0L, e18Var13, 8, 12);
                } else {
                    e18Var13.T();
                }
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ld4 ld4Var14 = (ld4) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                e18 e18Var14 = (e18) ld4Var14;
                if (e18Var14.Q(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    tjh.b(gik.l((nrg) drg.n0.getValue(), e18Var14), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var14, 0, 0, 262142);
                } else {
                    e18Var14.T();
                }
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ld4 ld4Var15 = (ld4) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                e18 e18Var15 = (e18) ld4Var15;
                if (e18Var15.Q(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    cv8.b(a.a(ud0.d, e18Var15), gik.l((nrg) drg.b.getValue(), e18Var15), b.o(fqbVar, 20.0f), gm3.a(e18Var15).N, e18Var15, 392, 0);
                } else {
                    e18Var15.T();
                }
                break;
            case 21:
                ld4 ld4Var16 = (ld4) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                e18 e18Var16 = (e18) ld4Var16;
                if (e18Var16.Q(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    cv8.b(a.a(ud0.N0, e18Var16), gik.l((nrg) drg.u.getValue(), e18Var16), gb9.J(b.o(fqbVar, 28.0f), 4.0f), gm3.a(e18Var16).N, e18Var16, 392, 0);
                } else {
                    e18Var16.T();
                }
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ld4 ld4Var17 = (ld4) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                e18 e18Var17 = (e18) ld4Var17;
                if (e18Var17.Q(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    iv1.b(ud0.M1, gik.l((nrg) drg.p.getValue(), e18Var17), null, ef2.F, gm3.a(e18Var17).O, e18Var17, 3072, 4);
                } else {
                    e18Var17.T();
                }
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ld4 ld4Var18 = (ld4) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                e18 e18Var18 = (e18) ld4Var18;
                if (e18Var18.Q(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    cv8.b(a.a(ud0.M1, e18Var18), gik.l((nrg) drg.p0.getValue(), e18Var18), b.o(fqbVar, 12.0f), 0L, e18Var18, 392, 8);
                } else {
                    e18Var18.T();
                }
                break;
            case 24:
                ld4 ld4Var19 = (ld4) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                e18 e18Var19 = (e18) ld4Var19;
                if (e18Var19.Q(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    ez1.a(null, null, 0L, e18Var19, 0, 7);
                } else {
                    e18Var19.T();
                }
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                ld4 ld4Var20 = (ld4) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                e18 e18Var20 = (e18) ld4Var20;
                if (e18Var20.Q(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    cv8.b(a.a(ud0.e, e18Var20), null, b.o(fqbVar, 32.0f), gm3.a(e18Var20).N, e18Var20, 440, 0);
                    tjh.b(d4c.j0(R.string.code_agent_picker_empty, e18Var20), null, gm3.a(e18Var20).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var20).e.E).g, e18Var20, 0, 0, 131066);
                } else {
                    e18Var20.T();
                }
                break;
            case 26:
                ld4 ld4Var21 = (ld4) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                e18 e18Var21 = (e18) ld4Var21;
                if (e18Var21.Q(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    iv1.b(ud0.L, null, null, null, gm3.a(e18Var21).c, e18Var21, 48, 12);
                } else {
                    e18Var21.T();
                }
                break;
            case 27:
                ld4 ld4Var22 = (ld4) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                e18 e18Var22 = (e18) ld4Var22;
                if (e18Var22.Q(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    iv1.b(ud0.e, null, null, null, gm3.a(e18Var22).N, e18Var22, 48, 12);
                } else {
                    e18Var22.T();
                }
                break;
            case 28:
                ld4 ld4Var23 = (ld4) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                e18 e18Var23 = (e18) ld4Var23;
                if (e18Var23.Q(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    cv8.b(a.a(ud0.k, e18Var23), d4c.j0(R.string.generic_button_cancel, e18Var23), null, gm3.a(e18Var23).M, e18Var23, 8, 4);
                } else {
                    e18Var23.T();
                }
                break;
            default:
                ld4 ld4Var24 = (ld4) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                e18 e18Var24 = (e18) ld4Var24;
                if (e18Var24.Q(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    cv8.b(a.a(ud0.O, e18Var24), d4c.j0(R.string.chat_list_select_multiple, e18Var24), null, 0L, e18Var24, 8, 12);
                } else {
                    e18Var24.T();
                }
                break;
        }
        return ieiVar;
    }
}
