package defpackage;

import android.os.Build;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.MessageImageAsset;
import com.anthropic.claude.api.tasks.BlockingToolDetail;
import com.anthropic.claude.api.tasks.TaskStepResponse;
import com.anthropic.claude.artifact.dialog.PublishArtifactParams;
import com.anthropic.claude.chatlist.all.bottomsheet.AllChatsListBottomSheetDestination;
import com.anthropic.claude.design.icon.a;
import com.anthropic.claude.tasks.ui.q;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xu implements sz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    public /* synthetic */ xu(Object obj, int i, Object obj2) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        u3g u3gVar;
        e18 e18Var;
        int i2;
        ek0 ek0Var;
        int i3 = this.E;
        fqb fqbVar = fqb.E;
        lz1 lz1Var = jd4.a;
        iei ieiVar = iei.a;
        Object obj5 = this.G;
        Object obj6 = this.F;
        boolean z = true;
        boolean z2 = true;
        switch (i3) {
            case 0:
                lu luVar = (lu) obj6;
                rwe rweVar = (rwe) obj5;
                AllChatsListBottomSheetDestination allChatsListBottomSheetDestination = (AllChatsListBottomSheetDestination) obj2;
                ld4 ld4Var = (ld4) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((ia0) obj).getClass();
                allChatsListBottomSheetDestination.getClass();
                if ((iIntValue & 48) == 0) {
                    iIntValue |= (iIntValue & 64) == 0 ? ((e18) ld4Var).f(allChatsListBottomSheetDestination) : ((e18) ld4Var).h(allChatsListBottomSheetDestination) ? 32 : 16;
                }
                e18 e18Var2 = (e18) ld4Var;
                if (!e18Var2.Q(iIntValue & 1, (iIntValue & 145) != 144)) {
                    e18Var2.T();
                } else if (allChatsListBottomSheetDestination instanceof AllChatsListBottomSheetDestination.Closed) {
                    e18Var2.a0(-46844237);
                    e18Var2.p(false);
                } else {
                    if (!(allChatsListBottomSheetDestination instanceof AllChatsListBottomSheetDestination.SelectProject)) {
                        throw ebh.u(e18Var2, -555702440, false);
                    }
                    e18Var2.a0(-46754089);
                    Set setQ = luVar.Q();
                    boolean zH = e18Var2.h(rweVar) | e18Var2.f(luVar);
                    Object objN = e18Var2.N();
                    if (zH || objN == lz1Var) {
                        objN = new k6(rweVar, 11, luVar);
                        e18Var2.k0(objN);
                    }
                    zy7 zy7Var = (zy7) objN;
                    boolean zH2 = e18Var2.h(rweVar);
                    Object objN2 = e18Var2.N();
                    if (zH2 || objN2 == lz1Var) {
                        objN2 = new av(rweVar, z ? 1 : 0);
                        e18Var2.k0(objN2);
                    }
                    gik.a(setQ, zy7Var, (zy7) objN2, null, e18Var2, 0);
                    e18Var2.p(false);
                }
                return ieiVar;
            case 1:
                pwd pwdVar = (pwd) obj6;
                PublishArtifactParams publishArtifactParams = (PublishArtifactParams) obj5;
                mnc mncVar = (mnc) obj2;
                ld4 ld4Var2 = (ld4) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((s64) obj).getClass();
                mncVar.getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= ((e18) ld4Var2).f(mncVar) ? 32 : 16;
                }
                int i4 = iIntValue2;
                e18 e18Var3 = (e18) ld4Var2;
                if (e18Var3.Q(i4 & 1, (i4 & 145) != 144)) {
                    u3g u3gVar2 = pwdVar.j;
                    wz5 wz5Var = pwdVar.l;
                    x3g x3gVar = (x3g) wz5Var.getValue();
                    e18Var3.a0(901487413);
                    int iOrdinal = pwdVar.j.ordinal();
                    if (iOrdinal == 0) {
                        i = R.string.artifact_organization_sharing_subtext;
                    } else {
                        if (iOrdinal != 1) {
                            wg6.i();
                            return null;
                        }
                        i = ((x3g) wz5Var.getValue()) == x3g.F ? R.string.artifact_public_sharing_subtext_shared : R.string.artifact_public_sharing_subtext_private;
                    }
                    String strJ0 = d4c.j0(i, e18Var3);
                    e18Var3.p(false);
                    boolean zBooleanValue = ((Boolean) pwdVar.o.getValue()).booleanValue();
                    boolean zF = e18Var3.f(pwdVar);
                    Object objN3 = e18Var3.N();
                    if (zF || objN3 == lz1Var) {
                        ks0 ks0Var = new ks0(1, pwdVar, pwd.class, "updateShareStatus", "updateShareStatus(Z)Lkotlinx/coroutines/Job;", 8, 0);
                        e18Var3.k0(ks0Var);
                        objN3 = ks0Var;
                    }
                    bz7 bz7Var = (bz7) objN3;
                    ta4 ta4VarQ0 = fd9.q0(-1641492820, new fp(5, publishArtifactParams), e18Var3);
                    boolean zF2 = e18Var3.f(pwdVar);
                    Object objN4 = e18Var3.N();
                    if (zF2 || objN4 == lz1Var) {
                        u3gVar = u3gVar2;
                        e18Var = e18Var3;
                        ls0 ls0Var = new ls0(0, pwdVar, pwd.class, "shareLink", "shareLink()Lkotlinx/coroutines/Job;", 8, 0);
                        e18Var.k0(ls0Var);
                        objN4 = ls0Var;
                    } else {
                        e18Var = e18Var3;
                        u3gVar = u3gVar2;
                    }
                    jpi.e(u3gVar, x3gVar, strJ0, zBooleanValue, bz7Var, ta4VarQ0, (zy7) objN4, mncVar, null, false, e18Var, ((i4 << 18) & 29360128) | 196608, 768);
                } else {
                    e18Var3.T();
                }
                return ieiVar;
            case 2:
                cte cteVar = (cte) obj6;
                nz0 nz0Var = (nz0) obj5;
                ld4 ld4Var3 = (ld4) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                ((cz5) obj).getClass();
                ((String) obj2).getClass();
                e18 e18Var4 = (e18) ld4Var3;
                if (e18Var4.Q(iIntValue3 & 1, (iIntValue3 & 129) != 128)) {
                    ysk.c(cteVar, ((az0) nz0Var).a, e18Var4, 0);
                } else {
                    e18Var4.T();
                }
                return ieiVar;
            case 3:
                cte cteVar2 = (cte) obj6;
                bz7[] bz7VarArr = (bz7[]) obj5;
                int iIntValue4 = ((Integer) obj).intValue();
                Integer num = (Integer) obj2;
                int iIntValue5 = num.intValue();
                ld4 ld4Var4 = (ld4) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i2 = (((e18) ld4Var4).d(iIntValue4) ? 4 : 2) | iIntValue6;
                } else {
                    i2 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i2 |= ((e18) ld4Var4).d(iIntValue5) ? 32 : 16;
                }
                e18 e18Var5 = (e18) ld4Var4;
                if (e18Var5.Q(i2 & 1, (i2 & 147) != 146)) {
                    bte.c(cteVar2, (String) bz7VarArr[iIntValue4 % bz7VarArr.length].invoke(num), null, null, 0, false, 0, e18Var5, 0);
                } else {
                    e18Var5.T();
                }
                return ieiVar;
            case 4:
                String str = (String) obj6;
                ta4 ta4Var = (ta4) obj5;
                ld4 ld4Var5 = (ld4) obj3;
                int iH = ebh.h((Integer) obj4, (s64) obj, (mnc) obj2);
                e18 e18Var6 = (e18) ld4Var5;
                if (e18Var6.Q(iH & 1, (iH & 129) != 128)) {
                    if (str != null) {
                        e18Var6.a0(-1247445513);
                        yhk.b(0, 2, e18Var6, null, str);
                        e18Var6.p(false);
                    } else {
                        e18Var6.a0(-1247388814);
                        e18Var6.p(false);
                    }
                    yhk.a(null, ta4Var, e18Var6, 0);
                } else {
                    e18Var6.T();
                }
                return ieiVar;
            case 5:
                fi7 fi7Var = (fi7) obj6;
                ii7 ii7Var = (ii7) obj5;
                ((Integer) obj2).getClass();
                ld4 ld4Var6 = (ld4) obj3;
                int iIntValue7 = ((Integer) obj4).intValue();
                ((px9) obj).getClass();
                e18 e18Var7 = (e18) ld4Var6;
                if (e18Var7.Q(iIntValue7 & 1, (iIntValue7 & 129) != 128)) {
                    String str2 = fi7Var.a;
                    String str3 = fi7Var.b;
                    int i5 = ii7Var.k;
                    int i6 = ii7Var.l;
                    boolean zH3 = e18Var7.h(ii7Var);
                    Object objN5 = e18Var7.N();
                    if (zH3 || objN5 == lz1Var) {
                        objN5 = new xi4(25, ii7Var);
                        e18Var7.k0(objN5);
                    }
                    xsc.c(str2, str3, i5, i6, (zy7) objN5, ((Boolean) ii7Var.f.getValue()).booleanValue(), null, e18Var7, 0, 64);
                } else {
                    e18Var7.T();
                }
                return ieiVar;
            case 6:
                mra mraVar = (mra) obj6;
                bz7 bz7Var2 = (bz7) obj5;
                int iIntValue8 = ((Integer) obj2).intValue();
                ld4 ld4Var7 = (ld4) obj3;
                int iIntValue9 = ((Integer) obj4).intValue();
                ((doc) obj).getClass();
                if ((iIntValue9 & 48) == 0) {
                    iIntValue9 |= ((e18) ld4Var7).d(iIntValue8) ? 32 : 16;
                }
                e18 e18Var8 = (e18) ld4Var7;
                if (e18Var8.Q(iIntValue9 & 1, (iIntValue9 & 145) != 144)) {
                    vsa vsaVar = (vsa) w44.O0(iIntValue8, mraVar.P());
                    if (vsaVar == null) {
                        e18Var8.a0(167935738);
                        e18Var8.p(false);
                    } else {
                        e18Var8.a0(167935739);
                        boolean zF3 = e18Var8.f(bz7Var2) | e18Var8.f(vsaVar);
                        Object objN6 = e18Var8.N();
                        Object obj7 = objN6;
                        if (zF3 || objN6 == lz1Var) {
                            ft9 ft9Var = new ft9(bz7Var2, 9, vsaVar);
                            e18Var8.k0(ft9Var);
                            obj7 = ft9Var;
                        }
                        xkk.b(vsaVar, iIntValue8, (zy7) obj7, d4c.j0(R.string.map_display_tool_open_location, e18Var8), e18Var8, iIntValue9 & 112);
                        e18Var8.p(false);
                    }
                } else {
                    e18Var8.T();
                }
                return ieiVar;
            case 7:
                nz0 nz0Var2 = (nz0) obj6;
                String str4 = (String) obj5;
                ld4 ld4Var8 = (ld4) obj3;
                int iIntValue10 = ((Integer) obj4).intValue();
                ((cz5) obj).getClass();
                ((String) obj2).getClass();
                e18 e18Var9 = (e18) ld4Var8;
                if (e18Var9.Q(iIntValue10 & 1, (iIntValue10 & 129) != 128)) {
                    xvk.b(fd9.q0(-1336630901, new lpa(nz0Var2, 3, str4), e18Var9), e18Var9, 6);
                } else {
                    e18Var9.T();
                }
                return ieiVar;
            case 8:
                MessageImageAsset messageImageAsset = (MessageImageAsset) obj6;
                String str5 = (String) obj5;
                ld4 ld4Var9 = (ld4) obj3;
                int iIntValue11 = ((Integer) obj4).intValue();
                ((mw1) obj).getClass();
                e18 e18Var10 = (e18) ld4Var9;
                if (e18Var10.Q(iIntValue11 & 1, (iIntValue11 & 129) != 128)) {
                    xo1 xo1Var = lja.K;
                    FillElement fillElement = b.c;
                    o5b o5bVarD = dw1.d(xo1Var, false);
                    int iHashCode = Long.hashCode(e18Var10.T);
                    hyc hycVarL = e18Var10.l();
                    iqb iqbVarE = kxk.E(e18Var10, fillElement);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var10.e0();
                    if (e18Var10.S) {
                        e18Var10.k(re4Var);
                    } else {
                        e18Var10.n0();
                    }
                    d4c.i0(e18Var10, cd4.f, o5bVarD);
                    d4c.i0(e18Var10, cd4.e, hycVarL);
                    d4c.i0(e18Var10, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var10, cd4.h);
                    d4c.i0(e18Var10, cd4.d, iqbVarE);
                    tnk.e(messageImageAsset, b.c(fqbVar, 1.0f), null, str5, e18Var10, 48);
                    e18Var10.p(true);
                } else {
                    e18Var10.T();
                }
                return ieiVar;
            case 9:
                pmd pmdVar = (pmd) obj6;
                t4g t4gVar = (t4g) obj5;
                mnc mncVar2 = (mnc) obj2;
                ld4 ld4Var10 = (ld4) obj3;
                int iH2 = ebh.h((Integer) obj4, (s64) obj, mncVar2);
                if ((iH2 & 48) == 0) {
                    iH2 |= ((e18) ld4Var10).f(mncVar2) ? 32 : 16;
                }
                e18 e18Var11 = (e18) ld4Var10;
                if (e18Var11.Q(iH2 & 1, (iH2 & 145) != 144)) {
                    boolean zBooleanValue2 = ((Boolean) pmdVar.j.getValue()).booleanValue();
                    boolean zBooleanValue3 = ((Boolean) pmdVar.i.getValue()).booleanValue();
                    boolean zF4 = e18Var11.f(pmdVar) | e18Var11.h(t4gVar);
                    Object objN7 = e18Var11.N();
                    if (zF4 || objN7 == lz1Var) {
                        objN7 = new aac(pmdVar, 8, t4gVar);
                        e18Var11.k0(objN7);
                    }
                    xuk.b(zBooleanValue2, zBooleanValue3, (zy7) objN7, mncVar2, e18Var11, (iH2 << 6) & 7168);
                } else {
                    e18Var11.T();
                }
                return ieiVar;
            case 10:
                izf izfVar = (izf) obj6;
                zy7 zy7Var2 = (zy7) obj5;
                ld4 ld4Var11 = (ld4) obj3;
                int iIntValue12 = ((Integer) obj4).intValue();
                ((s64) obj).getClass();
                ((mnc) obj2).getClass();
                e18 e18Var12 = (e18) ld4Var11;
                if (e18Var12.Q(iIntValue12 & 1, (iIntValue12 & 129) != 128)) {
                    int i7 = Build.VERSION.SDK_INT;
                    if (i7 >= 31) {
                        e18Var12.a0(-643597517);
                        fk0 fk0Var = izfVar.c;
                        if (i7 >= 31) {
                            ek0Var = (ek0) fk0Var.q.getValue();
                        } else {
                            fk0Var.getClass();
                            ek0Var = ek0.G;
                        }
                        ek0 ek0Var2 = ek0Var;
                        oxf oxfVarC = qf2.c(e18Var12);
                        qnc qncVar = qf2.a;
                        iqb iqbVarC = b.c(fqbVar, 1.0f);
                        boolean zF5 = e18Var12.f(izfVar);
                        Object objN8 = e18Var12.N();
                        if (zF5 || objN8 == lz1Var) {
                            objN8 = new lzf(izfVar, z2 ? 1 : 0);
                            e18Var12.k0(objN8);
                        }
                        mok.c(ek0Var2, (bz7) objN8, iqbVarC, oxfVarC, qncVar, e18Var12, 384);
                        e18Var12.p(false);
                    } else {
                        e18Var12.a0(-643093271);
                        e18Var12.p(false);
                    }
                    dk0 dk0Var = (dk0) izfVar.c.u.getValue();
                    oxf oxfVarC2 = qf2.c(e18Var12);
                    qnc qncVar2 = qf2.a;
                    iqb iqbVarC2 = b.c(fqbVar, 1.0f);
                    boolean zF6 = e18Var12.f(izfVar);
                    Object objN9 = e18Var12.N();
                    if (zF6 || objN9 == lz1Var) {
                        objN9 = new lzf(izfVar, i);
                        e18Var12.k0(objN9);
                    }
                    lok.a(dk0Var, (bz7) objN9, iqbVarC2, oxfVarC2, qncVar2, e18Var12, 384);
                    if (((Boolean) izfVar.f.d.getValue()).booleanValue()) {
                        e18Var12.a0(-642566209);
                        yhk.c(a.a(ud0.G1, e18Var12), d4c.j0(R.string.settings_voice, e18Var12), zy7Var2, b.c(fqbVar, 1.0f), null, null, null, null, 0L, e18Var12, 3080, 496);
                        e18Var12.p(false);
                    } else {
                        e18Var12.a0(-642126071);
                        e18Var12.p(false);
                    }
                } else {
                    e18Var12.T();
                }
                return ieiVar;
            default:
                TaskStepResponse taskStepResponse = (TaskStepResponse) obj6;
                e5h e5hVar = (e5h) obj5;
                mnc mncVar3 = (mnc) obj2;
                ld4 ld4Var12 = (ld4) obj3;
                int iH3 = ebh.h((Integer) obj4, (s64) obj, mncVar3);
                if ((iH3 & 48) == 0) {
                    iH3 |= ((e18) ld4Var12).f(mncVar3) ? 32 : 16;
                }
                e18 e18Var13 = (e18) ld4Var12;
                if (e18Var13.Q(iH3 & 1, (iH3 & 145) != 144)) {
                    iqb iqbVarI = gb9.I(fqbVar, mncVar3);
                    o5b o5bVarD2 = dw1.d(lja.G, false);
                    int iHashCode2 = Long.hashCode(e18Var13.T);
                    hyc hycVarL2 = e18Var13.l();
                    iqb iqbVarE2 = kxk.E(e18Var13, iqbVarI);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var13.e0();
                    if (e18Var13.S) {
                        e18Var13.k(re4Var2);
                    } else {
                        e18Var13.n0();
                    }
                    d4c.i0(e18Var13, cd4.f, o5bVarD2);
                    d4c.i0(e18Var13, cd4.e, hycVarL2);
                    d4c.i0(e18Var13, cd4.g, Integer.valueOf(iHashCode2));
                    d4c.h0(e18Var13, cd4.h);
                    d4c.i0(e18Var13, cd4.d, iqbVarE2);
                    BlockingToolDetail blocking_tool = taskStepResponse.getBlocking_tool();
                    if (blocking_tool == null) {
                        e18Var13.a0(1893166809);
                        q.f(e5hVar.a, e18Var13, 0);
                        e18Var13.p(false);
                    } else {
                        e18Var13.a0(1893169192);
                        q.a(blocking_tool, e5hVar, null, null, e18Var13, 64, 12);
                        e18Var13.p(false);
                    }
                    e18Var13.p(true);
                } else {
                    e18Var13.T();
                }
                return ieiVar;
        }
    }
}
