package defpackage;

import com.anthropic.claude.code.remote.CodeSessionListScope;
import com.anthropic.claude.code.remote.c;
import com.anthropic.claude.code.remote.d;
import com.anthropic.claude.code.remote.stores.a;
import com.anthropic.claude.code.remote.stores.b;
import com.anthropic.claude.sessions.types.SessionResource;
import com.anthropic.claude.sessions.types.SessionStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pz3 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ c F;

    public /* synthetic */ pz3(c cVar, int i) {
        this.E = i;
        this.F = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList] */
    @Override // defpackage.zy7
    public final Object a() {
        ?? X;
        String title;
        int iIntValue;
        int i = this.E;
        srf srfVar = srf.F;
        srf srfVar2 = srf.K;
        tp4 tp4Var = null;
        iei ieiVar = iei.a;
        boolean z = false;
        boolean z2 = true;
        c cVar = this.F;
        switch (i) {
            case 0:
                boolean zBooleanValue = ((Boolean) cVar.i.e.getValue()).booleanValue();
                lm6 lm6Var = lm6.E;
                if (zBooleanValue) {
                    return lm6Var;
                }
                CodeSessionListScope codeSessionListScope = cVar.q;
                if (x44.r(codeSessionListScope, CodeSessionListScope.DramaticShrimp.INSTANCE)) {
                    List listX = cVar.X();
                    X = new ArrayList();
                    for (Object obj : listX) {
                        SessionResource sessionResource = (SessionResource) obj;
                        List<String> tags = sessionResource.getTags();
                        if (tags == null) {
                            tags = lm6Var;
                        }
                        if (tags.contains("cowork-remote")) {
                            if (((Boolean) cVar.r.getValue()).booleanValue()) {
                                List<String> tags2 = sessionResource.getTags();
                                if (tags2 == null) {
                                    tags2 = lm6Var;
                                }
                                if (!tags2.contains("cowork-scheduled")) {
                                }
                            }
                            if (!fe5.g(sessionResource)) {
                                X.add(obj);
                            }
                        }
                    }
                } else if (x44.r(codeSessionListScope, CodeSessionListScope.Scheduled.INSTANCE)) {
                    List listX2 = cVar.X();
                    X = new ArrayList();
                    for (Object obj2 : listX2) {
                        SessionResource sessionResource2 = (SessionResource) obj2;
                        List<String> tags3 = sessionResource2.getTags();
                        if (tags3 == null) {
                            tags3 = lm6Var;
                        }
                        if (tags3.contains("cowork-scheduled") && !fe5.g(sessionResource2) && sessionResource2.getSession_status() != SessionStatus.ARCHIVED) {
                            X.add(obj2);
                        }
                    }
                } else if (x44.r(codeSessionListScope, CodeSessionListScope.Code.INSTANCE)) {
                    List listX3 = cVar.X();
                    X = new ArrayList();
                    for (Object obj3 : listX3) {
                        SessionResource sessionResource3 = (SessionResource) obj3;
                        if (!fe5.g(sessionResource3) && !isg.h0(sessionResource3.getEnvironment_id(), "011111111111111111111112", false) && sessionResource3.getTrigger_id() == null && !x44.r(sessionResource3.getOrigin(), "force_run_trigger") && !x44.r(sessionResource3.getOrigin(), "scheduled_trigger") && (!fe5.i(sessionResource3) || ((fe5.i(sessionResource3) && (title = sessionResource3.getTitle()) != null && title.length() != 0 && sessionResource3.getSession_status() != SessionStatus.PENDING) || !sessionResource3.getSession_context().getSources().isEmpty()))) {
                            if (!((Set) cVar.A.getValue()).contains(sessionResource3.getEnvironment_id())) {
                                List<String> tags4 = sessionResource3.getTags();
                                if (tags4 == null) {
                                    tags4 = lm6Var;
                                }
                                List<String> list = tags4;
                                if (!(list instanceof Collection) || !list.isEmpty()) {
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        if (ivf.a.contains((String) it.next())) {
                                        }
                                        break;
                                    }
                                }
                                X.add(obj3);
                            }
                        }
                    }
                } else {
                    if (!(codeSessionListScope instanceof CodeSessionListScope.Project)) {
                        wg6.i();
                        return null;
                    }
                    X = cVar.X();
                }
                return w44.i1((Iterable) X, new mt7(17));
            case 1:
                return Boolean.valueOf(!cVar.b0().isEmpty());
            case 2:
                if (x44.r(cVar.Y(), s9a.a) && !((Boolean) cVar.E.getValue()).booleanValue() && !cVar.a0().b) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                lsc lscVar = cVar.B;
                c69 c69Var = (c69) cVar.C.getValue();
                List listB0 = cVar.b0();
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : listB0) {
                    srf srfVarC = d.c((SessionResource) obj4, c69Var);
                    if (((srf) lscVar.getValue()) == srfVar) {
                        if (srfVarC != srfVar2) {
                            arrayList.add(obj4);
                        }
                    } else if (srfVarC == ((srf) lscVar.getValue())) {
                        arrayList.add(obj4);
                    }
                }
                return arrayList;
            case 4:
                Map mapR = dch.r(new i49(cVar.b0(), 10, (c69) cVar.C.getValue()));
                int i2 = 0;
                for (Map.Entry entry : mapR.entrySet()) {
                    srf srfVar3 = (srf) entry.getKey();
                    int iIntValue2 = ((Number) entry.getValue()).intValue();
                    if (srfVar3 == srfVar2) {
                        iIntValue2 = 0;
                    }
                    i2 += iIntValue2;
                }
                gq6 gq6Var = srf.M;
                int iD0 = tta.d0(x44.y(gq6Var, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iD0 >= 16 ? iD0 : 16);
                for (Object obj5 : gq6Var) {
                    srf srfVar4 = (srf) obj5;
                    if (srfVar4 == srfVar) {
                        iIntValue = i2;
                    } else {
                        Integer num = (Integer) mapR.get(srfVar4);
                        iIntValue = num != null ? num.intValue() : 0;
                    }
                    linkedHashMap.put(obj5, Integer.valueOf(iIntValue));
                }
                return linkedHashMap;
            case 5:
                long jB = ((c69) cVar.C.getValue()).b();
                List list2 = (List) cVar.G.getValue();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Object obj6 : list2) {
                    n6e n6eVarB = bm4.b(n6e.F, ((SessionResource) obj6).getUpdated_at().b(), jB);
                    Object arrayList2 = linkedHashMap2.get(n6eVarB);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap2.put(n6eVarB, arrayList2);
                    }
                    ((List) arrayList2).add(obj6);
                }
                return w44.i1(sta.o0(linkedHashMap2), new mt7(i));
            case 6:
                lsc lscVar2 = cVar.Q;
                lsc lscVar3 = cVar.S;
                e58 e58Var = cVar.f;
                CodeSessionListScope codeSessionListScope2 = cVar.q;
                a aVar = cVar.i;
                b bVar = cVar.h;
                boolean z3 = codeSessionListScope2 instanceof CodeSessionListScope.Project;
                jgc jgcVar = jgc.a;
                if (z3 || x44.r(codeSessionListScope2, CodeSessionListScope.Scheduled.INSTANCE)) {
                    return jgcVar;
                }
                boolean zR = x44.r(codeSessionListScope2, CodeSessionListScope.DramaticShrimp.INSTANCE);
                t9a t9aVar = t9a.a;
                if (zR) {
                    if (!x44.r(cVar.Y(), t9aVar)) {
                        if (!((Boolean) cVar.T.getValue()).booleanValue()) {
                            return kgc.a;
                        }
                        if (!cVar.b0().isEmpty() || ((Boolean) lscVar3.getValue()).booleanValue() || ((Boolean) lscVar2.getValue()).booleanValue()) {
                            return jgcVar;
                        }
                        return ngc.a;
                    }
                    return mgc.a;
                }
                if (!x44.r(cVar.Y(), t9aVar) && bVar.g() && e58Var.b()) {
                    if (((e58Var.d() && !aVar.c()) || aVar.d()) && bVar.g() && ((bVar.f().isEmpty() || ((Boolean) aVar.g.getValue()).booleanValue()) && (((List) bVar.i.getValue()).isEmpty() || ((Boolean) aVar.g.getValue()).booleanValue()))) {
                        return lgc.a;
                    }
                    if (!e58Var.d() || aVar.c() || !((Boolean) cVar.R.getValue()).booleanValue() || !cVar.X().isEmpty() || ((Boolean) lscVar3.getValue()).booleanValue() || ((Boolean) lscVar2.getValue()).booleanValue()) {
                        return jgcVar;
                    }
                    return ngc.a;
                }
                return mgc.a;
            case 7:
                gb9.D(cVar.a, null, null, new m61(z2, cVar, tp4Var, 3), 3);
                return ieiVar;
            case 8:
                vb7.B(cVar.i.a, "notification_prompt_seen", true);
                cVar.S.setValue(Boolean.TRUE);
                return ieiVar;
            default:
                return Boolean.valueOf(cVar.g.b());
        }
    }
}
