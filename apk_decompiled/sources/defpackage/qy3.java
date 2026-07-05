package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.common.RateLimit;
import com.anthropic.claude.code.remote.bottomsheet.a;
import com.anthropic.claude.code.remote.i;
import com.anthropic.claude.sessions.types.AskUserQuestionInput;
import com.anthropic.claude.sessions.types.AskUserQuestionQuestion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonArray;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qy3 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ i F;

    public /* synthetic */ qy3(i iVar, int i) {
        this.E = 0;
        this.F = iVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        AskUserQuestionInput askUserQuestionInput;
        Map mapE;
        Map mapF;
        int i = this.E;
        Object obj3 = jd4.a;
        int i2 = 2;
        i iVar = this.F;
        int i3 = 3;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                a.j(iVar, (ld4) obj, x44.p0(1));
                break;
            case 1:
                i iVar2 = this.F;
                mp4 mp4Var = iVar2.a;
                String str = (String) obj;
                Map map = (Map) obj2;
                str.getClass();
                map.getClass();
                tw0 tw0VarM0 = iVar2.m0();
                tp4 tp4Var = null;
                awc awcVar = tw0VarM0 != null ? tw0VarM0.a : null;
                tw0 tw0VarM02 = iVar2.m0();
                nm6 nm6Var = nm6.E;
                Map map2 = (tw0VarM02 == null || (mapF = tw0VarM02.f()) == null) ? nm6Var : mapF;
                tw0 tw0VarM03 = iVar2.m0();
                Map map3 = (tw0VarM03 == null || (mapE = tw0VarM03.e()) == null) ? nm6Var : mapE;
                tw0 tw0VarM04 = iVar2.m0();
                int iH = tw0VarM04 != null ? tw0VarM04.e.h() : 0;
                tw0 tw0VarM05 = iVar2.m0();
                if (tw0VarM05 != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    List<AskUserQuestionQuestion> list = tw0VarM05.d;
                    for (AskUserQuestionQuestion askUserQuestionQuestion : list) {
                        Object obj4 = tw0VarM05.f().get(askUserQuestionQuestion.getQuestion());
                        String str2 = (String) tw0VarM05.e().get(askUserQuestionQuestion.getQuestion());
                        if (obj4 instanceof String) {
                            if (!obj4.equals("__OTHER__") || str2 == null || bsg.I0(str2)) {
                                str2 = (String) obj4;
                            }
                            linkedHashMap.put(askUserQuestionQuestion.getQuestion(), ch9.c(str2));
                        } else if (obj4 instanceof List) {
                            List<String> list2 = (List) obj4;
                            ArrayList arrayList = new ArrayList(x44.y(list2, 10));
                            for (String str3 : list2) {
                                if (x44.r(str3, "__OTHER__") && str2 != null && !bsg.I0(str2)) {
                                    str3 = str2;
                                }
                                arrayList.add(str3);
                            }
                            String question = askUserQuestionQuestion.getQuestion();
                            ArrayList arrayList2 = new ArrayList(x44.y(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(ch9.c((String) it.next()));
                            }
                            linkedHashMap.put(question, new JsonArray(arrayList2));
                        } else {
                            linkedHashMap.put(askUserQuestionQuestion.getQuestion(), ch9.c(""));
                        }
                    }
                    askUserQuestionInput = new AskUserQuestionInput(list, linkedHashMap);
                } else {
                    askUserQuestionInput = null;
                }
                if (askUserQuestionInput != null) {
                    iVar2.R1.put(str, askUserQuestionInput);
                }
                iVar2.Q1.setValue(null);
                iVar2.f0();
                gb9.D(mp4Var, null, null, new o14(iVar2, tp4Var, 26), 3);
                gb9.D(mp4Var, null, null, new i24(iVar2, str, map, awcVar, iH, map2, map3, null), 3);
                break;
            case 2:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i iVar3 = this.F;
                    RateLimit rateLimit = (RateLimit) iVar3.I0.getValue();
                    r1e r1eVar = (r1e) iVar3.x0.getValue();
                    iwg iwgVarS = oq5.S(iVar3.x.e().getBilling_type());
                    boolean zF = e18Var.f(iVar3);
                    Object objN = e18Var.N();
                    if (zF || objN == obj3) {
                        Object boVar = new bo(2, iVar3, i.class, "onUpgradeCtaTapped", "onUpgradeCtaTapped(Ljava/lang/String;Z)V", 0, 8);
                        e18Var.k0(boVar);
                        objN = boVar;
                    }
                    yx3.c(rateLimit, r1eVar, iwgVarS, (pz7) ((jm9) objN), null, 0L, e18Var, 0);
                } else {
                    e18Var.T();
                }
                break;
            case 3:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zF2 = e18Var2.f(iVar);
                    Object objN2 = e18Var2.N();
                    if (zF2 || objN2 == obj3) {
                        objN2 = new o24(iVar, i2);
                        e18Var2.k0(objN2);
                    }
                    lnk.d((zy7) objN2, null, false, null, null, null, null, bik.c, e18Var2, 805306368, 510);
                } else {
                    e18Var2.T();
                }
                break;
            case 4:
                String str4 = (String) obj;
                str4.getClass();
                ((String) obj2).getClass();
                iVar.Z1.setValue(str4);
                break;
            default:
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    kdg kdgVar = iVar.W1;
                    boolean zF3 = e18Var3.f(iVar);
                    Object objN3 = e18Var3.N();
                    if (zF3 || objN3 == obj3) {
                        objN3 = new cz3(iVar, i3);
                        e18Var3.k0(objN3);
                    }
                    q22.a(384, e18Var3, (bz7) objN3, gb9.L(fqb.E, 12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), kdgVar);
                } else {
                    e18Var3.T();
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ qy3(i iVar, int i, byte b) {
        this.E = i;
        this.F = iVar;
    }
}
