package defpackage;

import com.anthropic.claude.api.common.RateLimit;
import com.anthropic.claude.sessions.types.AskUserQuestionInput;
import com.anthropic.claude.sessions.types.RequiresActionDetails;
import com.anthropic.claude.sessions.types.SdkControlResponseEvent;
import com.anthropic.claude.sessions.types.SdkEvent;
import com.anthropic.claude.sessions.types.SdkRateLimitEvent;
import com.anthropic.claude.sessions.types.SdkSystemEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
public final class cqf {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashSet b = new LinkedHashSet();
    public final rmh c = new rmh();
    public final LinkedHashSet d = new LinkedHashSet();
    public final LinkedHashSet e = new LinkedHashSet();
    public String f;
    public final Set g;
    public final LinkedHashSet h;
    public final LinkedHashMap i;
    public final LinkedHashMap j;

    public cqf() {
        Set setSynchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        setSynchronizedSet.getClass();
        this.g = setSynchronizedSet;
        this.h = new LinkedHashSet();
        this.i = new LinkedHashMap();
        this.j = new LinkedHashMap();
    }

    public static boolean a(String str, Set set) {
        synchronized (set) {
            if (!set.add(str)) {
                return false;
            }
            while (set.size() > 32) {
                Iterator it = set.iterator();
                it.next();
                it.remove();
            }
            return true;
        }
    }

    public static d8a l(cqf cqfVar, List list, nf0 nf0Var, int i) {
        if ((i & 2) != 0) {
            nf0Var = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        cqfVar.getClass();
        list.getClass();
        LinkedHashMap linkedHashMap = cqfVar.a;
        linkedHashMap.clear();
        cqfVar.b.clear();
        rmh rmhVar = cqfVar.c;
        rmhVar.a = 0;
        rmhVar.b = 0;
        rmhVar.c = false;
        rmhVar.d = false;
        rmhVar.e = false;
        cqfVar.d.clear();
        cqfVar.e.clear();
        cqfVar.f = null;
        LinkedHashMap linkedHashMap2 = cqfVar.i;
        linkedHashMap2.clear();
        cqfVar.j.clear();
        cqfVar.h.clear();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        fvf vufVar = null;
        while (it.hasNext()) {
            SdkEvent sdkEvent = (SdkEvent) it.next();
            List listH = cqfVar.h(sdkEvent);
            if (sdkEvent instanceof SdkSystemEvent) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listH) {
                    fvf fvfVar = (fvf) obj;
                    if ((fvfVar instanceof ruf) || (fvfVar instanceof yuf) || (fvfVar instanceof iuf)) {
                        arrayList2.add(obj);
                    }
                }
                b54.t0(arrayList, arrayList2);
            } else if (sdkEvent instanceof SdkControlResponseEvent) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : listH) {
                    if (obj2 instanceof juf) {
                        arrayList3.add(obj2);
                    }
                }
                b54.t0(arrayList, arrayList3);
            } else if (sdkEvent instanceof SdkRateLimitEvent) {
                Long resetsAt = ((SdkRateLimitEvent) sdkEvent).getRate_limit_info().getResetsAt();
                Long lValueOf = resetsAt != null ? Long.valueOf(resetsAt.longValue() * 1000) : null;
                if (lValueOf == null || lValueOf.longValue() > jCurrentTimeMillis) {
                    ListIterator listIterator = listH.listIterator(listH.size());
                    while (listIterator.hasPrevious()) {
                        fvf fvfVar2 = (fvf) listIterator.previous();
                        if (fvfVar2 instanceof vuf) {
                            vufVar = fvfVar2;
                        }
                    }
                    pmf.h("List contains no element matching the predicate.");
                    return null;
                }
                vufVar = new vuf(RateLimit.WithinLimit.INSTANCE);
            } else {
                continue;
            }
        }
        d8a d8aVarE = x44.E();
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            b54.t0(arrayList4, ((nz6) ((Map.Entry) it2.next()).getValue()).a);
        }
        d8aVarE.add(new puf(arrayList4, nf0Var, 4));
        d8aVarE.addAll(arrayList);
        if (vufVar != null) {
            d8aVarE.add(vufVar);
        }
        String str = cqfVar.f;
        if (str != null) {
            d8aVarE.add(new evf(str));
        }
        if (rmhVar.a() > 0) {
            d8aVarE.add(new bvf(rmhVar.c, Integer.valueOf(rmhVar.a())));
        }
        d8aVarE.add(new guf(sta.q0(linkedHashMap2)));
        return x44.v(d8aVarE);
    }

    public final List b(zpf zpfVar) {
        AskUserQuestionInput askUserQuestionInputA;
        String content;
        String id = zpfVar.getId();
        LinkedHashSet linkedHashSet = this.b;
        if (linkedHashSet.contains(id)) {
            return lm6.E;
        }
        String strA = zpfVar.a();
        LinkedHashMap linkedHashMap = this.a;
        Object nz6Var = linkedHashMap.get(strA);
        if (nz6Var == null) {
            nz6Var = new nz6();
            linkedHashMap.put(strA, nz6Var);
        }
        nz6 nz6Var2 = (nz6) nz6Var;
        ArrayList arrayList = nz6Var2.a;
        LinkedHashMap linkedHashMap2 = nz6Var2.b;
        boolean z = zpfVar instanceof leb;
        String content2 = null;
        if (z) {
            leb lebVar = (leb) zpfVar;
            String str = lebVar.a;
            jh2 jh2VarG = wwk.g(lebVar);
            if (jh2VarG != null) {
                String str2 = jh2VarG.b;
                kh2 kh2Var = jh2VarG.a;
                int iM = x44.M(arrayList);
                while (true) {
                    if (iM < 0) {
                        break;
                    }
                    zpf zpfVar2 = (zpf) arrayList.get(iM);
                    if (zpfVar2 instanceof c44) {
                        c44 c44Var = (c44) zpfVar2;
                        kh2 kh2Var2 = c44Var.c;
                        if (kh2Var2 == kh2Var) {
                            str2.getClass();
                            c44 c44Var2 = new c44(c44Var.a, c44Var.b, kh2Var2, w44.b1(c44Var.d, str2));
                            arrayList.set(iM, c44Var2);
                            linkedHashSet.add(str);
                            return x44.W(new xuf(iM, c44Var2));
                        }
                    } else if (zpfVar2 instanceof leb) {
                        leb lebVar2 = (leb) zpfVar2;
                        jh2 jh2VarG2 = wwk.g(lebVar2);
                        if ((jh2VarG2 != null ? jh2VarG2.a : null) == kh2Var) {
                            c44 c44Var3 = new c44(lebVar2.a, lebVar2.b, kh2Var, x44.X(jh2VarG2.b, str2));
                            arrayList.set(iM, c44Var3);
                            linkedHashSet.add(str);
                            return x44.W(new xuf(iM, c44Var3));
                        }
                    } else if ((zpfVar2 instanceof ejb) || (zpfVar2 instanceof lei)) {
                        iM--;
                    } else if (!(zpfVar2 instanceof g44) && !(zpfVar2 instanceof rvh) && !(zpfVar2 instanceof bde) && !(zpfVar2 instanceof dde)) {
                        wg6.i();
                        return null;
                    }
                }
            }
        }
        if (z) {
            leb lebVar3 = (leb) zpfVar;
            if (x44.r(lebVar3.c, "assistant") && lebVar3.c() && !lebVar3.d()) {
                for (int iM2 = x44.M(arrayList); iM2 >= 0; iM2--) {
                    zpf zpfVar3 = (zpf) arrayList.get(iM2);
                    if (!(zpfVar3 instanceof leb)) {
                        if (!(zpfVar3 instanceof g44) && !(zpfVar3 instanceof ejb) && !(zpfVar3 instanceof lei)) {
                            break;
                        }
                    } else {
                        leb lebVar4 = (leb) zpfVar3;
                        if (x44.r(lebVar4.c, "assistant") && lebVar4.c() && !lebVar4.d()) {
                            ArrayList arrayListA1 = w44.a1(lebVar4.d, lebVar3.d);
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj : arrayListA1) {
                                if (obj instanceof wlh) {
                                    arrayList2.add(obj);
                                }
                            }
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                String str3 = ((wlh) it.next()).a;
                                if (bsg.I0(str3)) {
                                    str3 = null;
                                }
                                if (str3 != null) {
                                    arrayList3.add(str3);
                                }
                            }
                            String str4 = lebVar4.a;
                            String str5 = lebVar4.b;
                            String str6 = lebVar4.c;
                            List listW = x44.W(new wlh(w44.S0(arrayList3, "\n\n", null, null, null, 62)));
                            boolean z2 = lebVar4.e;
                            String str7 = lebVar3.f;
                            List list = lebVar4.g;
                            boolean z3 = lebVar4.h || lebVar3.h;
                            String str8 = lebVar4.i;
                            if (str8 == null) {
                                str8 = lebVar3.i;
                            }
                            String str9 = str8;
                            String str10 = lebVar4.j;
                            if (str10 == null) {
                                str10 = lebVar3.j;
                            }
                            leb lebVar5 = new leb(str4, str5, str6, listW, z2, str7, list, z3, str9, str10);
                            arrayList.set(iM2, lebVar5);
                            linkedHashSet.add(lebVar3.a);
                            return x44.W(new xuf(iM2, lebVar5));
                        }
                        if (lebVar4.c()) {
                            break;
                        }
                    }
                }
            }
        }
        int size = arrayList.size();
        arrayList.add(zpfVar);
        linkedHashSet.add(zpfVar.getId());
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new quf(size, zpfVar));
        if (zpfVar instanceof rvh) {
            rvh rvhVar = (rvh) zpfVar;
            qvh qvhVar = rvhVar.f;
            String str11 = rvhVar.c;
            Map map = rvhVar.d;
            String str12 = rvhVar.a;
            linkedHashMap2.put(str12, Integer.valueOf(size));
            boolean zR = x44.r(str11, "ExitPlanMode");
            qvh qvhVar2 = qvh.E;
            if (zR && qvhVar == qvhVar2) {
                JsonElement jsonElement = (JsonElement) map.get("plan");
                if (jsonElement == null || (content = ch9.j(jsonElement).getContent()) == null) {
                    JsonElement jsonElement2 = (JsonElement) map.get("content");
                    if (jsonElement2 != null) {
                        content2 = ch9.j(jsonElement2).getContent();
                    }
                } else {
                    content2 = content;
                }
                if (content2 != null) {
                    arrayList4.add(new suf(new j4d(vb7.i(), str12, content2)));
                }
            }
            if (x44.r(str11, RequiresActionDetails.ASK_USER_QUESTION) && qvhVar == qvhVar2 && (askUserQuestionInputA = ow0.a(map)) != null) {
                arrayList4.add(new duf(new awc(vb7.i(), str12, askUserQuestionInputA)));
            }
        }
        return arrayList4;
    }

    public final ArrayList c(String str, String str2, List list) {
        str.getClass();
        str2.getClass();
        return w44.a1(n(null), b(new leb(str, (String) null, "user", str2.length() > 0 ? x44.W(new xdh(str2)) : lm6.E, (String) null, list, false, (String) null, (String) null, 944)));
    }

    public final List d(String str) {
        if (!a(str, this.h)) {
            return lm6.E;
        }
        this.g.remove(str);
        rmh rmhVar = this.c;
        rmhVar.a = 0;
        rmhVar.b = 0;
        rmhVar.c = false;
        rmhVar.d = false;
        rmhVar.e = false;
        return w44.a1(x44.W(new bvf(true, null)), n(null));
    }

    public final LinkedHashSet e() {
        rvh rvhVar;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            nz6 nz6Var = (nz6) ((Map.Entry) it.next()).getValue();
            for (Map.Entry entry : nz6Var.b.entrySet()) {
                String str = (String) entry.getKey();
                zpf zpfVar = (zpf) w44.O0(((Number) entry.getValue()).intValue(), nz6Var.a);
                if (zpfVar != null) {
                    if (zpfVar instanceof rvh) {
                        rvhVar = (rvh) zpfVar;
                    } else {
                        Object obj = null;
                        if (zpfVar instanceof g44) {
                            Iterator it2 = ((g44) zpfVar).d.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                Object next = it2.next();
                                if (x44.r(((rvh) next).a, str)) {
                                    obj = next;
                                    break;
                                }
                            }
                            rvhVar = (rvh) obj;
                        } else {
                            rvhVar = null;
                        }
                    }
                    if (rvhVar != null && rvhVar.f == qvh.E) {
                        linkedHashSet.add(str);
                    }
                }
            }
        }
        return linkedHashSet;
    }

    public final boolean f(String str) {
        rvh rvhVar;
        zpf zpfVar;
        Iterator it = this.a.entrySet().iterator();
        while (true) {
            rvhVar = null;
            Object obj = null;
            rvhVar = null;
            if (!it.hasNext()) {
                break;
            }
            nz6 nz6Var = (nz6) ((Map.Entry) it.next()).getValue();
            Integer num = (Integer) nz6Var.b.get(str);
            if (num != null && (zpfVar = (zpf) w44.O0(num.intValue(), nz6Var.a)) != null) {
                if (zpfVar instanceof rvh) {
                    rvhVar = (rvh) zpfVar;
                } else if (zpfVar instanceof g44) {
                    Iterator it2 = ((g44) zpfVar).d.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (x44.r(((rvh) next).a, str)) {
                            obj = next;
                            break;
                        }
                    }
                    rvhVar = (rvh) obj;
                }
            }
        }
        return (rvhVar == null || rvhVar.f == qvh.E) ? false : true;
    }

    public final List g(String str) {
        str.getClass();
        return !this.g.contains(str) ? lm6.E : d(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0998, code lost:
    
        if (r9.a() != r2) goto L517;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x0a03, code lost:
    
        if (r9.a() != r2) goto L517;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0a05, code lost:
    
        r6.add(new defpackage.bvf(true, java.lang.Integer.valueOf(r9.a())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x0a16, code lost:
    
        return r6;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0291 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x07ed A[PHI: r10
      0x07ed: PHI (r10v23 java.lang.Long) = (r10v22 java.lang.Long), (r10v24 java.lang.Long) binds: [B:388:0x07db, B:390:0x07eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0844  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0861  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0866  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0908  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0ada  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x0b50  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x0b5c  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x020e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0216  */
    /* JADX WARN: Type inference failed for: r0v86, types: [cqf] */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3, types: [java.lang.Throwable, java.util.List] */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r18v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v47, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v63, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r5v30, types: [java.util.LinkedHashMap, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List h(com.anthropic.claude.sessions.types.SdkEvent r39) {
        /*
            Method dump skipped, instruction units count: 3136
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqf.h(com.anthropic.claude.sessions.types.SdkEvent):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078 A[PHI: r11
      0x0078: PHI (r11v21 java.lang.String) = (r11v8 java.lang.String), (r11v22 java.lang.String) binds: [B:43:0x00c9, B:24:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List i(java.lang.String r26, com.anthropic.claude.sessions.types.SdkMessageContent r27, kotlinx.serialization.json.JsonElement r28, boolean r29, java.util.LinkedHashMap r30) {
        /*
            Method dump skipped, instruction units count: 1278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqf.i(java.lang.String, com.anthropic.claude.sessions.types.SdkMessageContent, kotlinx.serialization.json.JsonElement, boolean, java.util.LinkedHashMap):java.util.List");
    }

    public final void j(String str) {
        a(str, this.g);
    }

    public final List k(String str) {
        str.getClass();
        nz6 nz6Var = (nz6) this.a.get(null);
        if (nz6Var != null) {
            ArrayList arrayList = nz6Var.a;
            LinkedHashMap linkedHashMap = nz6Var.b;
            Iterator it = arrayList.iterator();
            byte b = 0;
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (x44.r(((zpf) it.next()).getId(), str)) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                zpf zpfVar = (zpf) arrayList.get(i);
                arrayList.remove(i);
                this.b.remove(zpfVar.getId());
                linkedHashMap.entrySet().removeIf(new wj6(2, new sm5(i, 4)));
                final gq0 gq0Var = new gq0(i, 10, b);
                linkedHashMap.replaceAll(new BiFunction() { // from class: aqf
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj, Object obj2) {
                        return (Integer) gq0Var.invoke(obj, obj2);
                    }
                });
                return x44.W(new wuf(str));
            }
        }
        return lm6.E;
    }

    public final List m() {
        rmh rmhVar = this.c;
        boolean z = rmhVar.a() > 0;
        rmhVar.a = 0;
        rmhVar.b = 0;
        rmhVar.c = false;
        rmhVar.d = false;
        rmhVar.e = false;
        return z ? x44.W(new bvf(true, null)) : lm6.E;
    }

    public final List n(String str) {
        if (x44.r(this.f, str)) {
            return lm6.E;
        }
        this.f = str;
        return x44.W(new evf(str));
    }
}
