package defpackage;

import android.view.View;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.bell.VoiceSessionSummary;
import com.anthropic.claude.chat.bottomsheet.model.ModelSelectorBottomSheetDestination;
import com.anthropic.claude.types.strings.VoiceSessionId;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wt2 implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    public /* synthetic */ wt2(Object obj, Object obj2, Object obj3, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        kwe kweVar;
        int i = this.E;
        fqb fqbVar = fqb.E;
        lz1 lz1Var = jd4.a;
        int i2 = 16;
        iei ieiVar = iei.a;
        Object obj4 = this.H;
        Object obj5 = this.G;
        Object obj6 = this.F;
        switch (i) {
            case 0:
                pz7 pz7Var = (pz7) obj6;
                va6 va6Var = (va6) obj5;
                tzf tzfVar = (tzf) obj4;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e18Var.T();
                } else if (pz7Var == null) {
                    e18Var.a0(500174622);
                    e18Var.p(false);
                } else {
                    e18Var.a0(500174623);
                    ev2.g(pz7Var, gb9.J(fqbVar, 16.0f), va6Var, 0L, 0L, tzfVar, null, e18Var, 48);
                    e18Var.p(false);
                }
                return ieiVar;
            case 1:
                qi3 qi3Var = (qi3) obj6;
                f4j f4jVar = (f4j) obj5;
                rwe rweVar = (rwe) obj4;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    Object objN = e18Var2.N();
                    Object obj7 = objN;
                    if (objN == lz1Var) {
                        VoiceSessionSummary voiceSessionSummary = (VoiceSessionSummary) f4jVar.a.getValue();
                        e18Var2.k0(voiceSessionSummary);
                        obj7 = voiceSessionSummary;
                    }
                    VoiceSessionSummary voiceSessionSummary2 = (VoiceSessionSummary) obj7;
                    if (voiceSessionSummary2 != null) {
                        VoiceSessionId voiceSessionIdM1164boximpl = VoiceSessionId.m1164boximpl(voiceSessionSummary2.m564getVoiceSessionId5I1JifQ());
                        boolean zH = e18Var2.h(qi3Var) | e18Var2.h(voiceSessionSummary2);
                        Object objN2 = e18Var2.N();
                        Object obj8 = objN2;
                        if (zH || objN2 == lz1Var) {
                            u73 u73Var = new u73(qi3Var, voiceSessionSummary2, null, 0);
                            e18Var2.k0(u73Var);
                            obj8 = u73Var;
                        }
                        fd9.i(e18Var2, (pz7) obj8, voiceSessionIdM1164boximpl);
                        boolean zH2 = e18Var2.h(qi3Var) | e18Var2.h(voiceSessionSummary2) | e18Var2.h(f4jVar);
                        Object objN3 = e18Var2.N();
                        Object obj9 = objN3;
                        if (zH2 || objN3 == lz1Var) {
                            ei eiVar = new ei(qi3Var, voiceSessionSummary2, f4jVar, 19);
                            e18Var2.k0(eiVar);
                            obj9 = eiVar;
                        }
                        zy7 zy7Var = (zy7) obj9;
                        boolean zH3 = e18Var2.h(f4jVar) | e18Var2.h(rweVar) | e18Var2.h(voiceSessionSummary2);
                        Object objN4 = e18Var2.N();
                        Object obj10 = objN4;
                        if (zH3 || objN4 == lz1Var) {
                            ei eiVar2 = new ei(f4jVar, rweVar, voiceSessionSummary2, 20);
                            e18Var2.k0(eiVar2);
                            obj10 = eiVar2;
                        }
                        zy7 zy7Var2 = (zy7) obj10;
                        boolean zH4 = e18Var2.h(f4jVar);
                        Object objN5 = e18Var2.N();
                        Object obj11 = objN5;
                        if (zH4 || objN5 == lz1Var) {
                            d7 d7Var = new d7(21, f4jVar);
                            e18Var2.k0(d7Var);
                            obj11 = d7Var;
                        }
                        i4j.b(voiceSessionSummary2, zy7Var, zy7Var2, (zy7) obj11, gb9.L(b.c(fqbVar, 1.0f), 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), e18Var2, VoiceSessionSummary.$stable | 24576);
                    }
                } else {
                    e18Var2.T();
                }
                return ieiVar;
            case 2:
                ml3 ml3Var = (ml3) obj6;
                l45 l45Var = (l45) obj5;
                iqb iqbVar = (iqb) obj4;
                hm3 hm3Var = (hm3) obj;
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                hm3Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((e18) ld4Var3).d(hm3Var.ordinal()) ? 4 : 2;
                }
                e18 e18Var3 = (e18) ld4Var3;
                if (e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    int iOrdinal = hm3Var.ordinal();
                    if (iOrdinal == 0) {
                        e18Var3.a0(840823770);
                        e18Var3.p(false);
                    } else if (iOrdinal == 1) {
                        e18Var3.a0(840921854);
                        boolean z = ml3Var.e;
                        boolean zH5 = e18Var3.h(ml3Var) | e18Var3.h(l45Var);
                        Object objN6 = e18Var3.N();
                        if (zH5 || objN6 == lz1Var) {
                            objN6 = new l80(ml3Var, 23, l45Var);
                            e18Var3.k0(objN6);
                        }
                        ez1.e((zy7) objN6, null, false, null, null, fd9.q0(-4502841, new im3(z, false ? 1 : 0), e18Var3), e18Var3, 1572864, 62);
                        e18Var3.p(false);
                    } else {
                        if (iOrdinal != 2) {
                            throw kgh.s(e18Var3, 719859470, false);
                        }
                        e18Var3.a0(842212725);
                        dgj.b(ml3Var.c, iqbVar, null, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var3, 0, 12);
                        e18Var3.p(false);
                    }
                } else {
                    e18Var3.T();
                }
                return ieiVar;
            case 3:
                String strN = (String) obj6;
                qi3 qi3Var2 = (qi3) obj5;
                zy7 zy7Var3 = (zy7) obj4;
                dxe dxeVar = (dxe) obj;
                ld4 ld4Var4 = (ld4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                dxeVar.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ((e18) ld4Var4).f(dxeVar) ? 4 : 2;
                }
                e18 e18Var4 = (e18) ld4Var4;
                if (e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    if (strN == null) {
                        strN = vb7.n(e18Var4, -1815419799, R.string.upgrade_to_pro_upsell_text_default, e18Var4, false);
                    } else {
                        e18Var4.a0(-1815420326);
                        e18Var4.p(false);
                    }
                    String str = strN;
                    long j = gm3.a(e18Var4).N;
                    tkh tkhVar = ((jm3) gm3.c(e18Var4).e.E).k;
                    fqb fqbVar2 = fqb.E;
                    tjh.b(str, dxeVar.a(fqbVar2, 1.0f, true), j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar, e18Var4, 0, 0, 131064);
                    String strJ0 = d4c.j0(R.string.upgrade_to_pro, e18Var4);
                    long j2 = gm3.a(e18Var4).g;
                    tkh tkhVar2 = ((jm3) gm3.c(e18Var4).e.E).l;
                    boolean zH6 = e18Var4.h(qi3Var2) | e18Var4.f(zy7Var3);
                    Object objN7 = e18Var4.N();
                    if (zH6 || objN7 == lz1Var) {
                        objN7 = new l80(qi3Var2, 25, zy7Var3);
                        e18Var4.k0(objN7);
                    }
                    tjh.b(strJ0, gb9.L(androidx.compose.foundation.b.c(fqbVar2, false, null, null, null, (zy7) objN7, 15), 4.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), j2, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, tkhVar2, e18Var4, 0, 24960, 110584);
                } else {
                    e18Var4.T();
                }
                return ieiVar;
            case 4:
                yc6 yc6Var = (yc6) obj6;
                q5b q5bVar = (q5b) obj;
                h5b h5bVar = (h5b) obj2;
                long jU0 = q5bVar.U0(((Boolean) ((wlg) obj5).getValue()).booleanValue() ? yc6Var.c : ((Boolean) ((nwb) obj4).getValue()).booleanValue() ? yc6Var.b : yc6Var.a);
                int iRound = Math.round(Float.intBitsToFloat((int) (jU0 >> 32)));
                int iRound2 = Math.round(Float.intBitsToFloat((int) (jU0 & 4294967295L)));
                if (((iRound >= 0 ? 1 : 0) & (iRound2 < 0 ? 0 : 1)) == 0) {
                    d39.a("width and height must be >= 0");
                }
                c3d c3dVarU = h5bVar.u(sl4.h(iRound, iRound, iRound2, iRound2));
                return q5bVar.U(c3dVarU.E, c3dVarU.F, nm6.E, new b1(c3dVarU, 9));
            case 5:
                pf6 pf6Var = (pf6) obj6;
                List list = (List) obj5;
                n0 n0Var = (n0) obj4;
                ld4 ld4Var5 = (ld4) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var5 = (e18) ld4Var5;
                if (e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    dgj.g(pf6Var, list, n0Var, null, e18Var5, 0);
                } else {
                    e18Var5.T();
                }
                return ieiVar;
            case 6:
                fca fcaVar = (fca) obj6;
                ybg ybgVar = (ybg) obj5;
                zy7 zy7Var4 = (zy7) obj4;
                mnc mncVar = (mnc) obj;
                ld4 ld4Var6 = (ld4) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                mncVar.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= ((e18) ld4Var6).f(mncVar) ? 4 : 2;
                }
                e18 e18Var6 = (e18) ld4Var6;
                if (e18Var6.Q(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    zni.g(fcaVar.m, ybgVar, e18Var6, 48);
                    xo1 xo1Var = lja.K;
                    iqb iqbVarJ = gb9.J(gb9.I(b.c, mncVar), 32.0f);
                    o5b o5bVarD = dw1.d(xo1Var, false);
                    int iHashCode = Long.hashCode(e18Var6.T);
                    hyc hycVarL = e18Var6.l();
                    iqb iqbVarE = kxk.E(e18Var6, iqbVarJ);
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
                    vt6 vt6Var = (vt6) fcaVar.o.getValue();
                    if (((Boolean) fcaVar.n.getValue()).booleanValue()) {
                        e18Var6.a0(760187287);
                        ez1.a(null, vf2.J, 0L, e18Var6, 48, 5);
                        e18Var6.p(false);
                    } else if (vt6Var != null) {
                        e18Var6.a0(760302049);
                        boolean zF = e18Var6.f(fcaVar);
                        Object objN8 = e18Var6.N();
                        if (zF || objN8 == lz1Var) {
                            objN8 = new mx5(9, fcaVar);
                            e18Var6.k0(objN8);
                        }
                        fd9.h(vt6Var, (zy7) ((jm9) objN8), zy7Var4, null, e18Var6, 0);
                        e18Var6.p(false);
                    } else {
                        e18Var6.a0(760528845);
                        e18Var6.p(false);
                    }
                    e18Var6.p(true);
                } else {
                    e18Var6.T();
                }
                return ieiVar;
            case 7:
                final t53 t53Var = (t53) obj6;
                final t4g t4gVar = (t4g) obj5;
                final zy7 zy7Var5 = (zy7) obj4;
                ModelSelectorBottomSheetDestination modelSelectorBottomSheetDestination = (ModelSelectorBottomSheetDestination) obj;
                ((Integer) obj3).getClass();
                modelSelectorBottomSheetDestination.getClass();
                e18 e18Var7 = (e18) ((ld4) obj2);
                e18Var7.a0(-1385640937);
                if (modelSelectorBottomSheetDestination instanceof ModelSelectorBottomSheetDestination.Closed) {
                    e18Var7.a0(-698366042);
                    e18Var7.p(false);
                    kweVar = null;
                } else if (modelSelectorBottomSheetDestination instanceof ModelSelectorBottomSheetDestination.SelectModel) {
                    e18Var7.a0(-161072562);
                    String strJ02 = d4c.j0(R.string.chat_options_select_model, e18Var7);
                    final int i3 = false ? 1 : 0;
                    kweVar = new kwe(strJ02, null, null, null, null, false, fd9.q0(-1607781774, new rz7() { // from class: nob
                        @Override // defpackage.rz7
                        public final Object invoke(Object obj12, Object obj13, Object obj14) {
                            int i4 = i3;
                            iei ieiVar2 = iei.a;
                            switch (i4) {
                                case 0:
                                    i4g i4gVar = (i4g) obj12;
                                    ld4 ld4Var7 = (ld4) obj13;
                                    int iIntValue7 = ((Integer) obj14).intValue();
                                    i4gVar.getClass();
                                    if ((iIntValue7 & 6) == 0) {
                                        iIntValue7 |= ((e18) ld4Var7).f(i4gVar) ? 4 : 2;
                                    }
                                    e18 e18Var8 = (e18) ld4Var7;
                                    if (!e18Var8.Q(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                                        e18Var8.T();
                                    } else {
                                        com.anthropic.claude.chat.bottomsheet.model.b.e(t53Var, t4gVar, zy7Var5, i4gVar, e18Var8, (iIntValue7 << 9) & 7168);
                                    }
                                    break;
                                default:
                                    i4g i4gVar2 = (i4g) obj12;
                                    ld4 ld4Var8 = (ld4) obj13;
                                    int iIntValue8 = ((Integer) obj14).intValue();
                                    i4gVar2.getClass();
                                    if ((iIntValue8 & 6) == 0) {
                                        iIntValue8 |= ((e18) ld4Var8).f(i4gVar2) ? 4 : 2;
                                    }
                                    e18 e18Var9 = (e18) ld4Var8;
                                    if (!e18Var9.Q(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                                        e18Var9.T();
                                    } else {
                                        krb.a(t53Var, t4gVar, zy7Var5, i4gVar2, e18Var9, (iIntValue8 << 9) & 7168);
                                    }
                                    break;
                            }
                            return ieiVar2;
                        }
                    }, e18Var7), 254);
                    e18Var7.p(false);
                } else if (modelSelectorBottomSheetDestination instanceof ModelSelectorBottomSheetDestination.MoreModels) {
                    e18Var7.a0(-161057396);
                    kwe kweVar2 = new kwe(d4c.j0(R.string.chat_options_more_models, e18Var7), null, null, null, null, false, fd9.q0(822968691, new rz7() { // from class: nob
                        @Override // defpackage.rz7
                        public final Object invoke(Object obj12, Object obj13, Object obj14) {
                            int i4 = i;
                            iei ieiVar2 = iei.a;
                            switch (i4) {
                                case 0:
                                    i4g i4gVar = (i4g) obj12;
                                    ld4 ld4Var7 = (ld4) obj13;
                                    int iIntValue7 = ((Integer) obj14).intValue();
                                    i4gVar.getClass();
                                    if ((iIntValue7 & 6) == 0) {
                                        iIntValue7 |= ((e18) ld4Var7).f(i4gVar) ? 4 : 2;
                                    }
                                    e18 e18Var8 = (e18) ld4Var7;
                                    if (!e18Var8.Q(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                                        e18Var8.T();
                                    } else {
                                        com.anthropic.claude.chat.bottomsheet.model.b.e(t53Var, t4gVar, zy7Var5, i4gVar, e18Var8, (iIntValue7 << 9) & 7168);
                                    }
                                    break;
                                default:
                                    i4g i4gVar2 = (i4g) obj12;
                                    ld4 ld4Var8 = (ld4) obj13;
                                    int iIntValue8 = ((Integer) obj14).intValue();
                                    i4gVar2.getClass();
                                    if ((iIntValue8 & 6) == 0) {
                                        iIntValue8 |= ((e18) ld4Var8).f(i4gVar2) ? 4 : 2;
                                    }
                                    e18 e18Var9 = (e18) ld4Var8;
                                    if (!e18Var9.Q(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                                        e18Var9.T();
                                    } else {
                                        krb.a(t53Var, t4gVar, zy7Var5, i4gVar2, e18Var9, (iIntValue8 << 9) & 7168);
                                    }
                                    break;
                            }
                            return ieiVar2;
                        }
                    }, e18Var7), 254);
                    e18Var7.p(false);
                    kweVar = kweVar2;
                } else {
                    if (!(modelSelectorBottomSheetDestination instanceof ModelSelectorBottomSheetDestination.SelectEffort)) {
                        throw kgh.s(e18Var7, -161076440, false);
                    }
                    e18Var7.a0(-161042288);
                    kwe kweVar3 = new kwe(d4c.j0(R.string.chat_options_effort, e18Var7), null, null, null, null, false, fd9.q0(-1041248140, new nw7(t53Var, i2, t4gVar), e18Var7), 254);
                    e18Var7.p(false);
                    kweVar = kweVar3;
                }
                e18Var7.p(false);
                return kweVar;
            case 8:
                ta4 ta4Var = (ta4) obj6;
                ia0 ia0Var = (ia0) obj5;
                bga bgaVar = (bga) obj4;
                ld4 ld4Var7 = (ld4) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((mw1) obj).getClass();
                e18 e18Var8 = (e18) ld4Var7;
                if (e18Var8.Q(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    ta4Var.i(ia0Var, bgaVar, e18Var8, 0);
                } else {
                    e18Var8.T();
                }
                return ieiVar;
            default:
                View view = (View) obj6;
                zy7 zy7Var6 = (zy7) obj5;
                ta4 ta4Var2 = (ta4) obj4;
                k3g k3gVar = (k3g) obj;
                ld4 ld4Var8 = (ld4) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                k3gVar.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= ((e18) ld4Var8).f(k3gVar) ? 4 : 2;
                }
                e18 e18Var9 = (e18) ld4Var8;
                if (e18Var9.Q(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    j8.d(new hvd[]{e3g.a.a(k3gVar), e3g.c.a(view), e3g.d.a(zy7Var6)}, fd9.q0(1426809476, new tu2(ta4Var2, 8), e18Var9), e18Var9, 48);
                } else {
                    e18Var9.T();
                }
                return ieiVar;
        }
    }
}
