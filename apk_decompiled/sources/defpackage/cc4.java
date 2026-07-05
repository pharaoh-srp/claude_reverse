package defpackage;

import android.content.res.Resources;
import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.ChatFeedbackType;
import com.anthropic.claude.design.icon.a;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cc4 implements pz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ cc4(int i) {
        this.E = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        eo0 eo0Var = ko0.c;
        lz1 lz1Var = jd4.a;
        fqb fqbVar = fqb.E;
        iei ieiVar = iei.a;
        int i2 = 2;
        int i3 = 3;
        int i4 = 1;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    xo1 xo1Var = lja.K;
                    vve vveVar = xve.a;
                    iqb iqbVarK = gb9.K(ez1.t(xn5.V(fqbVar, vveVar), 1.0f, gm3.a(e18Var).w, vveVar), 8.0f, 2.0f);
                    o5b o5bVarD = dw1.d(xo1Var, false);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, iqbVarK);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var.e0();
                    if (e18Var.S) {
                        e18Var.k(re4Var);
                    } else {
                        e18Var.n0();
                    }
                    d4c.i0(e18Var, cd4.f, o5bVarD);
                    d4c.i0(e18Var, cd4.e, hycVarL);
                    d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var, cd4.h);
                    d4c.i0(e18Var, cd4.d, iqbVarE);
                    tjh.b(d4c.j0(R.string.artifact_edited, e18Var), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 0, 131070);
                    e18Var.p(true);
                }
                break;
            case 1:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    xn5.N(u00.D(R.drawable.logo_google_docs, 0, e18Var2), null, b.q(fqbVar, 11.0f, 16.0f), null, null, MTTypesetterKt.kLineSkipLimitMultiplier, null, e18Var2, 440, 120);
                }
                break;
            case 2:
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e18Var3.T();
                } else {
                    ez1.a(null, vf2.G, gm3.a(e18Var3).F, e18Var3, 48, 1);
                }
                break;
            case 3:
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    e18Var4.T();
                } else {
                    ez1.a(null, vf2.G, gm3.a(e18Var4).F, e18Var4, 48, 1);
                }
                break;
            case 4:
                ld4 ld4Var5 = (ld4) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                e18 e18Var5 = (e18) ld4Var5;
                if (!e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    e18Var5.T();
                }
                break;
            case 5:
                ld4 ld4Var6 = (ld4) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                e18 e18Var6 = (e18) ld4Var6;
                if (!e18Var6.Q(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    e18Var6.T();
                } else {
                    tjh.b(d4c.j0(R.string.code_starter_custom_prompt_hint, e18Var6), null, gm3.a(e18Var6).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var6).e.E).g, e18Var6, 0, 0, 131066);
                }
                break;
            case 6:
                ld4 ld4Var7 = (ld4) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                e18 e18Var7 = (e18) ld4Var7;
                if (!e18Var7.Q(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    e18Var7.T();
                } else {
                    tjh.b(d4c.j0(R.string.research_stop_dialog_title, e18Var7), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var7).e.E).g, e18Var7, 0, 0, 131070);
                }
                break;
            case 7:
                ld4 ld4Var8 = (ld4) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                e18 e18Var8 = (e18) ld4Var8;
                if (!e18Var8.Q(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    e18Var8.T();
                } else {
                    q64 q64VarA = p64.a(eo0Var, lja.S, e18Var8, 0);
                    int iHashCode2 = Long.hashCode(e18Var8.T);
                    hyc hycVarL2 = e18Var8.l();
                    iqb iqbVarE2 = kxk.E(e18Var8, fqbVar);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var8.e0();
                    if (e18Var8.S) {
                        e18Var8.k(re4Var2);
                    } else {
                        e18Var8.n0();
                    }
                    d4c.i0(e18Var8, cd4.f, q64VarA);
                    d4c.i0(e18Var8, cd4.e, hycVarL2);
                    d4c.i0(e18Var8, cd4.g, Integer.valueOf(iHashCode2));
                    d4c.h0(e18Var8, cd4.h);
                    d4c.i0(e18Var8, cd4.d, iqbVarE2);
                    tjh.b(d4c.j0(R.string.research_stop_dialog_message, e18Var8), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var8).e.E).g, e18Var8, 0, 0, 131070);
                    e18Var8.p(true);
                }
                break;
            case 8:
                ld4 ld4Var9 = (ld4) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                e18 e18Var9 = (e18) ld4Var9;
                if (!e18Var9.Q(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    e18Var9.T();
                } else {
                    mrg mrgVar = nai.v;
                    m7f m7fVarN = sq6.n(e18Var9, -1168520582, e18Var9, -1633490746);
                    boolean zF = e18Var9.f(mrgVar) | e18Var9.f(m7fVarN);
                    Object objN = e18Var9.N();
                    if (zF || objN == lz1Var) {
                        objN = m7fVarN.a(jce.a.b(String.class), mrgVar, null);
                        e18Var9.k0(objN);
                    }
                    e18Var9.p(false);
                    e18Var9.p(false);
                    String str = (String) objN;
                    mrg mrgVar2 = nai.u;
                    m7f m7fVarN2 = sq6.n(e18Var9, -1168520582, e18Var9, -1633490746);
                    boolean zF2 = e18Var9.f(mrgVar2) | e18Var9.f(m7fVarN2);
                    Object objN2 = e18Var9.N();
                    if (zF2 || objN2 == lz1Var) {
                        objN2 = m7fVarN2.a(jce.a.b(String.class), mrgVar2, null);
                        e18Var9.k0(objN2);
                    }
                    e18Var9.p(false);
                    e18Var9.p(false);
                    tjh.c(zrk.j(R.string.onboarding_v2_plan_footer, x44.X(tyg.CLAUDE_PRO_USAGE.a(), str, (String) objN2), null, new CharSequence[0], e18Var9, 0, 4), gb9.N(b.c(fqbVar, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 6.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13), gm3.a(e18Var9).O, 0L, 0L, new fdh(3), 0L, 0, false, 0, 0, null, null, ((jm3) gm3.c(e18Var9).e.E).i, e18Var9, 48, 0, 261112);
                }
                break;
            case 9:
                ld4 ld4Var10 = (ld4) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                e18 e18Var10 = (e18) ld4Var10;
                if (!e18Var10.Q(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    e18Var10.T();
                }
                break;
            case 10:
                ld4 ld4Var11 = (ld4) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                e18 e18Var11 = (e18) ld4Var11;
                if (!e18Var11.Q(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    e18Var11.T();
                } else {
                    wb5.e(mp0.l0(((Resources) e18Var11.j(w00.c)).getStringArray(R.array.onboarding_v2_subscription_free_features)), null, null, e18Var11, 0, 6);
                }
                break;
            case 11:
                ld4 ld4Var12 = (ld4) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                e18 e18Var12 = (e18) ld4Var12;
                if (!e18Var12.Q(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    e18Var12.T();
                } else {
                    cv8.b(a.a(ud0.f0, e18Var12), d4c.j0(R.string.code_block_expand_button, e18Var12), b.o(fqbVar, 20.0f), 0L, e18Var12, 392, 8);
                }
                break;
            case 12:
                ld4 ld4Var13 = (ld4) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                e18 e18Var13 = (e18) ld4Var13;
                if (!e18Var13.Q(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    e18Var13.T();
                } else {
                    tkh tkhVar = ((jm3) gm3.c(e18Var13).e.E).i;
                    long j = gm3.a(e18Var13).O;
                    Object objN3 = e18Var13.N();
                    if (objN3 == lz1Var) {
                        objN3 = new fc4(i4);
                        e18Var13.k0(objN3);
                    }
                    tjh.b("Filter by kind or payload", tjf.a(fqbVar, (bz7) objN3), j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar, e18Var13, 6, 0, 131064);
                }
                break;
            case 13:
                ld4 ld4Var14 = (ld4) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                e18 e18Var14 = (e18) ld4Var14;
                if (!e18Var14.Q(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    e18Var14.T();
                } else {
                    tkh tkhVar2 = ((jm3) gm3.c(e18Var14).e.E).i;
                    long j2 = gm3.a(e18Var14).O;
                    Object objN4 = e18Var14.N();
                    if (objN4 == lz1Var) {
                        objN4 = new fc4(i2);
                        e18Var14.k0(objN4);
                    }
                    tjh.b("Send a message to this task", tjf.a(fqbVar, (bz7) objN4), j2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar2, e18Var14, 6, 0, 131064);
                }
                break;
            case 14:
                ld4 ld4Var15 = (ld4) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                e18 e18Var15 = (e18) ld4Var15;
                if (!e18Var15.Q(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    e18Var15.T();
                } else {
                    tjh.b(d4c.j0(R.string.task_propose_debug_system_placeholder, e18Var15), null, gm3.a(e18Var15).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var15).e.E).i, e18Var15, 0, 0, 131066);
                }
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ld4 ld4Var16 = (ld4) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                e18 e18Var16 = (e18) ld4Var16;
                if (!e18Var16.Q(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    e18Var16.T();
                } else {
                    String strJ0 = d4c.j0(R.string.task_input_fallback_placeholder, e18Var16);
                    tkh tkhVar3 = ((jm3) gm3.c(e18Var16).e.E).g;
                    long j3 = gm3.a(e18Var16).O;
                    Object objN5 = e18Var16.N();
                    if (objN5 == lz1Var) {
                        objN5 = new fc4(i3);
                        e18Var16.k0(objN5);
                    }
                    tjh.b(strJ0, tjf.a(fqbVar, (bz7) objN5), j3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar3, e18Var16, 0, 0, 131064);
                }
                break;
            case 16:
                ld4 ld4Var17 = (ld4) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                e18 e18Var17 = (e18) ld4Var17;
                if (!e18Var17.Q(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    e18Var17.T();
                } else {
                    tjh.b(d4c.j0(R.string.tasks_screen_title, e18Var17), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var17, 0, 0, 262142);
                }
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ld4 ld4Var18 = (ld4) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                e18 e18Var18 = (e18) ld4Var18;
                if (!e18Var18.Q(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    e18Var18.T();
                }
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ld4 ld4Var19 = (ld4) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                e18 e18Var19 = (e18) ld4Var19;
                if (!e18Var19.Q(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    e18Var19.T();
                } else {
                    prk.k(d4c.j0(R.string.tool_content_unknown, e18Var19), b.c(fqbVar, 1.0f), ((jm3) gm3.c(e18Var19).e.E).g, a.a(ud0.C0, e18Var19), dv8.E, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, 0L, 0, 0, e18Var19, 28720, 2016);
                }
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ld4 ld4Var20 = (ld4) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                e18 e18Var20 = (e18) ld4Var20;
                if (!e18Var20.Q(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    e18Var20.T();
                } else {
                    j8.c(sq6.m(gm3.a(e18Var20).O, on4.a), jvk.a, e18Var20, 56);
                }
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ld4 ld4Var21 = (ld4) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                e18 e18Var21 = (e18) ld4Var21;
                if (!e18Var21.Q(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    e18Var21.T();
                } else {
                    auk.a(b.o(fqbVar, 16.0f), e18Var21, 6);
                }
                break;
            case 21:
                ld4 ld4Var22 = (ld4) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                e18 e18Var22 = (e18) ld4Var22;
                if (!e18Var22.Q(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    e18Var22.T();
                } else {
                    tjh.b(d4c.j0(R.string.trusted_device_limit_title, e18Var22), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var22).e.E).d, e18Var22, 0, 0, 131070);
                }
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ld4 ld4Var23 = (ld4) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                e18 e18Var23 = (e18) ld4Var23;
                if (!e18Var23.Q(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    e18Var23.T();
                } else {
                    tjh.b(d4c.j0(R.string.trusted_device_limit_message, e18Var23), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var23).e.E).g, e18Var23, 0, 0, 131070);
                }
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ld4 ld4Var24 = (ld4) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                e18 e18Var24 = (e18) ld4Var24;
                if (!e18Var24.Q(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    e18Var24.T();
                } else {
                    tjh.b(d4c.j0(R.string.trusted_device_confirm_title, e18Var24), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var24).e.E).d, e18Var24, 0, 0, 131070);
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
                if (!e18Var27.Q(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    e18Var27.T();
                } else {
                    Object objN6 = e18Var27.N();
                    if (objN6 == lz1Var) {
                        objN6 = new oob(19);
                        e18Var27.k0(objN6);
                    }
                    zy7 zy7Var = (zy7) objN6;
                    Object objN7 = e18Var27.N();
                    if (objN7 == lz1Var) {
                        objN7 = new oob(19);
                        e18Var27.k0(objN7);
                    }
                    wjk.g(null, zy7Var, (zy7) objN7, null, e18Var27, 438);
                }
                break;
            case 27:
                ld4 ld4Var28 = (ld4) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                e18 e18Var28 = (e18) ld4Var28;
                if (!e18Var28.Q(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    e18Var28.T();
                } else {
                    ChatFeedbackType chatFeedbackType = ChatFeedbackType.UPVOTE;
                    Object objN8 = e18Var28.N();
                    if (objN8 == lz1Var) {
                        objN8 = new oob(19);
                        e18Var28.k0(objN8);
                    }
                    zy7 zy7Var2 = (zy7) objN8;
                    Object objN9 = e18Var28.N();
                    if (objN9 == lz1Var) {
                        objN9 = new oob(19);
                        e18Var28.k0(objN9);
                    }
                    wjk.g(chatFeedbackType, zy7Var2, (zy7) objN9, null, e18Var28, 438);
                }
                break;
            case 28:
                ld4 ld4Var29 = (ld4) obj;
                int iIntValue29 = ((Integer) obj2).intValue();
                e18 e18Var29 = (e18) ld4Var29;
                if (!e18Var29.Q(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    e18Var29.T();
                } else {
                    ChatFeedbackType chatFeedbackType2 = ChatFeedbackType.FLAG_OTHER;
                    Object objN10 = e18Var29.N();
                    if (objN10 == lz1Var) {
                        objN10 = new oob(19);
                        e18Var29.k0(objN10);
                    }
                    zy7 zy7Var3 = (zy7) objN10;
                    Object objN11 = e18Var29.N();
                    if (objN11 == lz1Var) {
                        objN11 = new oob(19);
                        e18Var29.k0(objN11);
                    }
                    wjk.g(chatFeedbackType2, zy7Var3, (zy7) objN11, null, e18Var29, 438);
                }
                break;
            default:
                ld4 ld4Var30 = (ld4) obj;
                int iIntValue30 = ((Integer) obj2).intValue();
                e18 e18Var30 = (e18) ld4Var30;
                if (!e18Var30.Q(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    e18Var30.T();
                } else {
                    qnc qncVarB = gb9.b(24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                    iqb iqbVarL = gb9.L(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, 1);
                    q64 q64VarA2 = p64.a(eo0Var, lja.S, e18Var30, 0);
                    int iHashCode3 = Long.hashCode(e18Var30.T);
                    hyc hycVarL3 = e18Var30.l();
                    iqb iqbVarE3 = kxk.E(e18Var30, iqbVarL);
                    dd4.e.getClass();
                    re4 re4Var3 = cd4.b;
                    e18Var30.e0();
                    if (e18Var30.S) {
                        e18Var30.k(re4Var3);
                    } else {
                        e18Var30.n0();
                    }
                    d4c.i0(e18Var30, cd4.f, q64VarA2);
                    d4c.i0(e18Var30, cd4.e, hycVarL3);
                    d4c.i0(e18Var30, cd4.g, Integer.valueOf(iHashCode3));
                    d4c.h0(e18Var30, cd4.h);
                    d4c.i0(e18Var30, cd4.d, iqbVarE3);
                    xjk.h(gb9.I(fqbVar, qncVarB), e18Var30, 6);
                    Object objN12 = e18Var30.N();
                    if (objN12 == lz1Var) {
                        objN12 = new oob(19);
                        e18Var30.k0(objN12);
                    }
                    zy7 zy7Var4 = (zy7) objN12;
                    Object objN13 = e18Var30.N();
                    if (objN13 == lz1Var) {
                        objN13 = new oob(19);
                        e18Var30.k0(objN13);
                    }
                    xjk.g(s64.a, zy7Var4, (zy7) objN13, qncVarB, e18Var30, 3510);
                    e18Var30.p(true);
                }
                break;
        }
        return ieiVar;
    }
}
