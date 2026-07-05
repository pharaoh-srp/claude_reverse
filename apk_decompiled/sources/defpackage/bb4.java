package defpackage;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bb4 implements pz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ bb4(int i) {
        this.E = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        rt6 rt6Var = rt6.a;
        lz1 lz1Var = jd4.a;
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
                    tjh.b(d4c.j0(R.string.melange_web_note_title, e18Var), null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 0, 0, 131066);
                }
                break;
            case 1:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    tjh.b(d4c.j0(R.string.memory_files_native_row_description, e18Var2), null, gm3.a(e18Var2).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var2, 0, 0, 131066);
                }
                break;
            case 2:
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e18Var3.T();
                } else {
                    cv8.b(a.a(ud0.C, e18Var3), null, b.o(fqbVar, 20.0f), gm3.a(e18Var3).O, e18Var3, 440, 0);
                }
                break;
            case 3:
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    e18Var4.T();
                } else {
                    tjh.b(d4c.j0(R.string.melange_web_note_title, e18Var4), null, gm3.a(e18Var4).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var4).e.E).g, e18Var4, 0, 0, 131066);
                }
                break;
            case 4:
                ld4 ld4Var5 = (ld4) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                e18 e18Var5 = (e18) ld4Var5;
                if (!e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    e18Var5.T();
                } else {
                    tjh.b(d4c.j0(R.string.melange_web_note_description, e18Var5), null, gm3.a(e18Var5).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var5).e.E).i, e18Var5, 0, 0, 131066);
                }
                break;
            case 5:
                ld4 ld4Var6 = (ld4) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                e18 e18Var6 = (e18) ld4Var6;
                if (!e18Var6.Q(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    e18Var6.T();
                } else {
                    ez1.a(null, vf2.J, 0L, e18Var6, 48, 5);
                }
                break;
            case 6:
                ld4 ld4Var7 = (ld4) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                e18 e18Var7 = (e18) ld4Var7;
                if (!e18Var7.Q(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    e18Var7.T();
                } else {
                    iv1.b(ud0.M1, d4c.j0(R.string.generic_button_content_description_dismiss, e18Var7), null, null, gm3.a(e18Var7).M, e18Var7, 0, 12);
                }
                break;
            case 7:
                ld4 ld4Var8 = (ld4) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                e18 e18Var8 = (e18) ld4Var8;
                if (!e18Var8.Q(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    e18Var8.T();
                } else {
                    pt6 pt6Var = new pt6(R.string.generic_error_something_went_wrong_upgrade_app);
                    Object objN = e18Var8.N();
                    if (objN == lz1Var) {
                        objN = new oob(19);
                        e18Var8.k0(objN);
                    }
                    mt6 mt6Var = new mt6(pt6Var, R.string.generic_retry, (zy7) objN, null);
                    Object objN2 = e18Var8.N();
                    if (objN2 == lz1Var) {
                        objN2 = new oob(19);
                        e18Var8.k0(objN2);
                    }
                    zhk.b(mt6Var, (zy7) objN2, gb9.J(fqbVar, 12.0f), e18Var8, 440);
                }
                break;
            case 8:
                ld4 ld4Var9 = (ld4) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                e18 e18Var9 = (e18) ld4Var9;
                if (!e18Var9.Q(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    e18Var9.T();
                } else {
                    Object objN3 = e18Var9.N();
                    if (objN3 == lz1Var) {
                        objN3 = new oob(19);
                        e18Var9.k0(objN3);
                    }
                    mt6 mt6Var2 = new mt6(rt6Var, R.string.generic_retry, (zy7) objN3, null);
                    Object objN4 = e18Var9.N();
                    if (objN4 == lz1Var) {
                        objN4 = new oob(19);
                        e18Var9.k0(objN4);
                    }
                    zhk.b(mt6Var2, (zy7) objN4, gb9.J(fqbVar, 12.0f), e18Var9, 440);
                }
                break;
            case 9:
                ld4 ld4Var10 = (ld4) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                e18 e18Var10 = (e18) ld4Var10;
                if (!e18Var10.Q(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    e18Var10.T();
                } else {
                    tt6 tt6Var = new tt6(true);
                    Object objN5 = e18Var10.N();
                    if (objN5 == lz1Var) {
                        objN5 = new oob(19);
                        e18Var10.k0(objN5);
                    }
                    mt6 mt6Var3 = new mt6(tt6Var, R.string.generic_error_something_went_wrong_upgrade_app, (zy7) objN5, null);
                    Object objN6 = e18Var10.N();
                    if (objN6 == lz1Var) {
                        objN6 = new oob(19);
                        e18Var10.k0(objN6);
                    }
                    zhk.b(mt6Var3, (zy7) objN6, gb9.J(fqbVar, 12.0f), e18Var10, 440);
                }
                break;
            case 10:
                ld4 ld4Var11 = (ld4) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                e18 e18Var11 = (e18) ld4Var11;
                if (!e18Var11.Q(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    e18Var11.T();
                } else {
                    Object objN7 = e18Var11.N();
                    if (objN7 == lz1Var) {
                        objN7 = new oob(19);
                        e18Var11.k0(objN7);
                    }
                    zhk.b(rt6Var, (zy7) objN7, gb9.J(fqbVar, 12.0f), e18Var11, 438);
                }
                break;
            case 11:
                ld4 ld4Var12 = (ld4) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                e18 e18Var12 = (e18) ld4Var12;
                if (!e18Var12.Q(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    e18Var12.T();
                } else {
                    pt6 pt6Var2 = new pt6(R.string.generic_button_done, st6.F);
                    Object objN8 = e18Var12.N();
                    if (objN8 == lz1Var) {
                        objN8 = new oob(19);
                        e18Var12.k0(objN8);
                    }
                    zhk.b(pt6Var2, (zy7) objN8, gb9.J(fqbVar, 12.0f), e18Var12, 432);
                }
                break;
            case 12:
                ld4 ld4Var13 = (ld4) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                e18 e18Var13 = (e18) ld4Var13;
                if (!e18Var13.Q(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    e18Var13.T();
                } else {
                    pt6 pt6Var3 = new pt6(R.string.generic_button_done, st6.G);
                    Object objN9 = e18Var13.N();
                    if (objN9 == lz1Var) {
                        objN9 = new oob(19);
                        e18Var13.k0(objN9);
                    }
                    zhk.b(pt6Var3, (zy7) objN9, gb9.J(fqbVar, 12.0f), e18Var13, 432);
                }
                break;
            case 13:
                ld4 ld4Var14 = (ld4) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                e18 e18Var14 = (e18) ld4Var14;
                if (!e18Var14.Q(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    e18Var14.T();
                } else {
                    pt6 pt6Var4 = new pt6(R.string.generic_error_something_went_wrong);
                    Object objN10 = e18Var14.N();
                    if (objN10 == lz1Var) {
                        objN10 = new oob(19);
                        e18Var14.k0(objN10);
                    }
                    mt6 mt6Var4 = new mt6(pt6Var4, R.string.generic_retry, (zy7) objN10, null);
                    Object objN11 = e18Var14.N();
                    if (objN11 == lz1Var) {
                        objN11 = new oob(19);
                        e18Var14.k0(objN11);
                    }
                    zhk.b(mt6Var4, (zy7) objN11, gb9.J(fqbVar, 12.0f), e18Var14, 440);
                }
                break;
            case 14:
                ld4 ld4Var15 = (ld4) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                e18 e18Var15 = (e18) ld4Var15;
                if (!e18Var15.Q(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    e18Var15.T();
                } else {
                    ot6 ot6Var = new ot6(R.string.generic_error_something_went_wrong);
                    Object objN12 = e18Var15.N();
                    if (objN12 == lz1Var) {
                        objN12 = new oob(19);
                        e18Var15.k0(objN12);
                    }
                    zhk.b(ot6Var, (zy7) objN12, gb9.J(fqbVar, 12.0f), e18Var15, 432);
                }
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ld4 ld4Var16 = (ld4) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                e18 e18Var16 = (e18) ld4Var16;
                if (!e18Var16.Q(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    e18Var16.T();
                } else {
                    tjh.b(d4c.j0(R.string.chart_debug_dialog_title, e18Var16), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var16).e.E).f, e18Var16, 0, 0, 131070);
                }
                break;
            case 16:
                ld4 ld4Var17 = (ld4) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                e18 e18Var17 = (e18) ld4Var17;
                if (!e18Var17.Q(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    e18Var17.T();
                } else {
                    tjh.b(d4c.j0(R.string.chart_action_copy_as_image, e18Var17), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var17, 0, 0, 262142);
                }
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ld4 ld4Var18 = (ld4) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                e18 e18Var18 = (e18) ld4Var18;
                if (!e18Var18.Q(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    e18Var18.T();
                } else {
                    tjh.b(d4c.j0(R.string.chart_action_share, e18Var18), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var18, 0, 0, 262142);
                }
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ld4 ld4Var19 = (ld4) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                e18 e18Var19 = (e18) ld4Var19;
                if (!e18Var19.Q(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    e18Var19.T();
                } else {
                    tjh.b(d4c.j0(R.string.chart_action_debug_info, e18Var19), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var19, 0, 0, 262142);
                }
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ld4 ld4Var20 = (ld4) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                e18 e18Var20 = (e18) ld4Var20;
                if (!e18Var20.Q(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    e18Var20.T();
                } else {
                    tjh.b(d4c.j0(R.string.chat_footer_edit_disclaimer, e18Var20), null, 0L, 0L, null, null, null, 0L, null, new fdh(6), 0L, 0, false, 0, 0, null, null, e18Var20, 0, 0, 261118);
                }
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ld4 ld4Var21 = (ld4) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                e18 e18Var21 = (e18) ld4Var21;
                if (!e18Var21.Q(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    e18Var21.T();
                } else {
                    cv8.b(a.a(ud0.G1, e18Var21), "Voice mode", b.o(fqbVar, 20.0f), 0L, e18Var21, 440, 8);
                }
                break;
            case 21:
                ld4 ld4Var22 = (ld4) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                e18 e18Var22 = (e18) ld4Var22;
                if (!e18Var22.Q(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    e18Var22.T();
                } else {
                    FillElement fillElement = b.c;
                    o5b o5bVarD = dw1.d(lja.K, false);
                    int iHashCode = Long.hashCode(e18Var22.T);
                    hyc hycVarL = e18Var22.l();
                    iqb iqbVarE = kxk.E(e18Var22, fillElement);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var22.e0();
                    if (e18Var22.S) {
                        e18Var22.k(re4Var);
                    } else {
                        e18Var22.n0();
                    }
                    d4c.i0(e18Var22, cd4.f, o5bVarD);
                    d4c.i0(e18Var22, cd4.e, hycVarL);
                    d4c.i0(e18Var22, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var22, cd4.h);
                    d4c.i0(e18Var22, cd4.d, iqbVarE);
                    iv1.b(ud0.j, d4c.j0(R.string.chat_scroll_to_bottom_content_description, e18Var22), null, ef2.F, 0L, e18Var22, 3072, 20);
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
                    cv8.b(a.a(ud0.J, e18Var23), d4c.j0(R.string.chat_new_chat, e18Var23), null, 0L, e18Var23, 8, 12);
                }
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ld4 ld4Var24 = (ld4) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                e18 e18Var24 = (e18) ld4Var24;
                if (!e18Var24.Q(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    e18Var24.T();
                } else {
                    cv8.b(a.a(ud0.c0, e18Var24), d4c.j0(R.string.generic_button_more_options, e18Var24), null, 0L, e18Var24, 8, 12);
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
                }
                break;
            case 26:
                ld4 ld4Var27 = (ld4) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                e18 e18Var27 = (e18) ld4Var27;
                if (!e18Var27.Q(1 & iIntValue27, (iIntValue27 & 3) != 2)) {
                    e18Var27.T();
                } else {
                    ud0 ud0Var = ud0.d;
                    jwk.o(R.drawable.anthropicon_chats, 0, 2, e18Var27, null);
                }
                break;
            case 27:
                ld4 ld4Var28 = (ld4) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                e18 e18Var28 = (e18) ld4Var28;
                if (!e18Var28.Q(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    e18Var28.T();
                } else {
                    long j = ((za6) e18Var28.j(te4.a)).a;
                    boolean zE = e18Var28.e(j);
                    Object objN13 = e18Var28.N();
                    if (zE || objN13 == lz1Var) {
                        float fMin = Math.min(za6.d(j), za6.c(j));
                        long jL = eve.L(fMin, 4294967296L);
                        eve.n(jL);
                        objN13 = new vm3(fMin, fMin * 0.10625f, fMin * 0.0625f, fMin * 0.15f, eve.L(clh.c(jL) * 0.1f, 1095216660480L & jL));
                        e18Var28.k0(objN13);
                    }
                    dlk.c((vm3) objN13, vsj.d(alg.F), vsj.d(alg.G), vsj.d(alg.H), e18Var28, 0);
                }
                break;
            case 28:
                ld4 ld4Var29 = (ld4) obj;
                int iIntValue29 = ((Integer) obj2).intValue();
                e18 e18Var29 = (e18) ld4Var29;
                if (!e18Var29.Q(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    e18Var29.T();
                } else {
                    elk.a(null, e18Var29, 48);
                }
                break;
            default:
                ld4 ld4Var30 = (ld4) obj;
                int iIntValue30 = ((Integer) obj2).intValue();
                e18 e18Var30 = (e18) ld4Var30;
                if (!e18Var30.Q(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    e18Var30.T();
                } else {
                    iv1.b(ud0.N0, d4c.j0(R.string.ccr_mic_button, e18Var30), null, null, gm3.a(e18Var30).M, e18Var30, 0, 12);
                }
                break;
        }
        return ieiVar;
    }
}
