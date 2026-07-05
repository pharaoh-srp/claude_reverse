package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pb4 implements pz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ pb4(int i) {
        this.E = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        lz1 lz1Var = jd4.a;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    tjh.b(d4c.j0(R.string.project_create_submit_button_text, e18Var), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var, 0, 0, 262142);
                }
                break;
            case 1:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    tjh.b(d4c.j0(R.string.delete_account_dialog_title, e18Var2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var2, 0, 0, 262142);
                }
                break;
            case 2:
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e18Var3.T();
                }
                break;
            case 3:
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    e18Var4.T();
                } else {
                    Object objN = e18Var4.N();
                    if (objN == lz1Var) {
                        objN = new oob(19);
                        e18Var4.k0(objN);
                    }
                    trk.a(54, 4, e18Var4, (zy7) objN, null, true);
                }
                break;
            case 4:
                ld4 ld4Var5 = (ld4) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                e18 e18Var5 = (e18) ld4Var5;
                if (!e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    e18Var5.T();
                } else {
                    tjh.b(d4c.j0(R.string.delete_account_dialog_title, e18Var5), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var5, 0, 0, 262142);
                }
                break;
            case 5:
                ld4 ld4Var6 = (ld4) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                e18 e18Var6 = (e18) ld4Var6;
                if (!e18Var6.Q(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    e18Var6.T();
                } else {
                    xo1 xo1Var = lja.K;
                    iqb iqbVarC = b.c(fqb.E, 1.0f);
                    o5b o5bVarD = dw1.d(xo1Var, false);
                    int iHashCode = Long.hashCode(e18Var6.T);
                    hyc hycVarL = e18Var6.l();
                    iqb iqbVarE = kxk.E(e18Var6, iqbVarC);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var6.e0();
                    if (e18Var6.S) {
                        e18Var6.k(re4Var);
                    } else {
                        e18Var6.n0();
                    }
                    d4c.i0(e18Var6, cd4.f, o5bVarD);
                    d4c.i0(e18Var6, cd4.e, hycVarL);
                    d4c.i0(e18Var6, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var6, cd4.h);
                    d4c.i0(e18Var6, cd4.d, iqbVarE);
                    ez1.a(null, vf2.J, 0L, e18Var6, 48, 5);
                    e18Var6.p(true);
                }
                break;
            case 6:
                ld4 ld4Var7 = (ld4) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                e18 e18Var7 = (e18) ld4Var7;
                if (!e18Var7.Q(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    e18Var7.T();
                } else {
                    String strJ0 = d4c.j0(R.string.delete_account_dialog_understand_button, e18Var7);
                    Object objN2 = e18Var7.N();
                    if (objN2 == lz1Var) {
                        objN2 = new oob(19);
                        e18Var7.k0(objN2);
                    }
                    oe5.a(390, 0, e18Var7, (zy7) objN2, strJ0, false);
                }
                break;
            case 7:
                ld4 ld4Var8 = (ld4) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                e18 e18Var8 = (e18) ld4Var8;
                if (!e18Var8.Q(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    e18Var8.T();
                } else {
                    Object objN3 = e18Var8.N();
                    if (objN3 == lz1Var) {
                        objN3 = new oob(19);
                        e18Var8.k0(objN3);
                    }
                    trk.a(54, 4, e18Var8, (zy7) objN3, null, true);
                }
                break;
            case 8:
                ld4 ld4Var9 = (ld4) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                e18 e18Var9 = (e18) ld4Var9;
                if (!e18Var9.Q(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    e18Var9.T();
                } else {
                    tjh.b(d4c.j0(R.string.delete_account_dialog_title, e18Var9), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var9, 0, 0, 262142);
                }
                break;
            case 9:
                ld4 ld4Var10 = (ld4) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                e18 e18Var10 = (e18) ld4Var10;
                if (!e18Var10.Q(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    e18Var10.T();
                } else {
                    tjh.b(d4c.j0(R.string.delete_account_dialog_understand_text, e18Var10), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var10, 0, 0, 262142);
                }
                break;
            case 10:
                ld4 ld4Var11 = (ld4) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                e18 e18Var11 = (e18) ld4Var11;
                if (!e18Var11.Q(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    e18Var11.T();
                } else {
                    iv1.b(ud0.c0, d4c.j0(R.string.generic_button_more_options, e18Var11), null, ef2.F, gm3.a(e18Var11).N, e18Var11, 3072, 4);
                }
                break;
            case 11:
                ld4 ld4Var12 = (ld4) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                e18 e18Var12 = (e18) ld4Var12;
                if (!e18Var12.Q(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    e18Var12.T();
                } else {
                    h66.p(0, e18Var12);
                }
                break;
            case 12:
                ld4 ld4Var13 = (ld4) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                e18 e18Var13 = (e18) ld4Var13;
                if (!e18Var13.Q(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    e18Var13.T();
                } else {
                    iv1.b(ud0.M1, d4c.j0(R.string.generic_close_button_content_description, e18Var13), null, null, gm3.a(e18Var13).N, e18Var13, 0, 12);
                }
                break;
            case 13:
                ld4 ld4Var14 = (ld4) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                e18 e18Var14 = (e18) ld4Var14;
                if (!e18Var14.Q(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    e18Var14.T();
                } else {
                    h66.i(0, e18Var14);
                }
                break;
            case 14:
                ld4 ld4Var15 = (ld4) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                e18 e18Var15 = (e18) ld4Var15;
                if (!e18Var15.Q(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    e18Var15.T();
                } else {
                    cv8.b(a.a(ud0.a0, e18Var15), null, null, gm3.a(e18Var15).M, e18Var15, 56, 4);
                }
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ld4 ld4Var16 = (ld4) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                e18 e18Var16 = (e18) ld4Var16;
                if (!e18Var16.Q(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    e18Var16.T();
                } else {
                    zmk.f(d4c.j0(R.string.nav_drawer_badge_new, e18Var16), null, null, d54.b(0.1f, gm3.a(e18Var16).M), gm3.a(e18Var16).c, null, null, null, ((jm3) gm3.c(e18Var16).e.E).j, e18Var16, 0, 230);
                }
                break;
            case 16:
                ld4 ld4Var17 = (ld4) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                e18 e18Var17 = (e18) ld4Var17;
                if (!e18Var17.Q(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    e18Var17.T();
                } else {
                    tjh.b(d4c.j0(R.string.project_details_custom_instructions_dialog_title, e18Var17), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var17, 0, 0, 262142);
                }
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ld4 ld4Var18 = (ld4) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                e18 e18Var18 = (e18) ld4Var18;
                if (!e18Var18.Q(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    e18Var18.T();
                } else {
                    cv8.b(u00.D(R.drawable.edu_lightbulb, 0, e18Var18), null, null, d54.h, e18Var18, 3128, 4);
                }
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ld4 ld4Var19 = (ld4) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                e18 e18Var19 = (e18) ld4Var19;
                if (!e18Var19.Q(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    e18Var19.T();
                } else {
                    tjh.b("Production", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var19, 6, 0, 262142);
                }
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ld4 ld4Var20 = (ld4) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                e18 e18Var20 = (e18) ld4Var20;
                if (!e18Var20.Q(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    e18Var20.T();
                } else {
                    tjh.b("Staging", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var20, 6, 0, 262142);
                }
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ld4 ld4Var21 = (ld4) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                e18 e18Var21 = (e18) ld4Var21;
                if (!e18Var21.Q(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    e18Var21.T();
                } else {
                    tjh.b("Localhost", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var21, 6, 0, 262142);
                }
                break;
            case 21:
                ld4 ld4Var22 = (ld4) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                e18 e18Var22 = (e18) ld4Var22;
                if (!e18Var22.Q(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    e18Var22.T();
                } else {
                    tjh.b("Custom", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var22, 6, 0, 262142);
                }
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ld4 ld4Var23 = (ld4) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                e18 e18Var23 = (e18) ld4Var23;
                if (!e18Var23.Q(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    e18Var23.T();
                } else {
                    tjh.b("Domain", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var23, 6, 0, 262142);
                }
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ld4 ld4Var24 = (ld4) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                e18 e18Var24 = (e18) ld4Var24;
                if (!e18Var24.Q(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    e18Var24.T();
                } else {
                    tjh.b("Port", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var24, 6, 0, 262142);
                }
                break;
            case 24:
                ld4 ld4Var25 = (ld4) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                e18 e18Var25 = (e18) ld4Var25;
                if (!e18Var25.Q(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    e18Var25.T();
                } else {
                    tjh.b(d4c.j0(R.string.internal_setting_override_country_code, e18Var25), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var25, 0, 0, 262142);
                }
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                ld4 ld4Var26 = (ld4) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                e18 e18Var26 = (e18) ld4Var26;
                if (!e18Var26.Q(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    e18Var26.T();
                }
                break;
            case 26:
                ld4 ld4Var27 = (ld4) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                e18 e18Var27 = (e18) ld4Var27;
                if (!e18Var27.Q(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    e18Var27.T();
                } else {
                    tjh.b(d4c.j0(R.string.ccr_environment_name_required, e18Var27), null, gm3.a(e18Var27).y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var27, 0, 0, 262138);
                }
                break;
            case 27:
                ld4 ld4Var28 = (ld4) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                e18 e18Var28 = (e18) ld4Var28;
                if (!e18Var28.Q(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    e18Var28.T();
                } else {
                    tjh.b(d4c.j0(R.string.external_link_dialog_title, e18Var28), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var28, 0, 0, 262142);
                }
                break;
            case 28:
                ld4 ld4Var29 = (ld4) obj;
                int iIntValue29 = ((Integer) obj2).intValue();
                e18 e18Var29 = (e18) ld4Var29;
                if (!e18Var29.Q(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    e18Var29.T();
                }
                break;
            default:
                ld4 ld4Var30 = (ld4) obj;
                int iIntValue30 = ((Integer) obj2).intValue();
                e18 e18Var30 = (e18) ld4Var30;
                if (!e18Var30.Q(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    e18Var30.T();
                }
                break;
        }
        return ieiVar;
    }
}
