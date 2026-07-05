package defpackage;

import com.anthropic.claude.api.common.RateLimit;
import com.anthropic.claude.api.common.WindowLimitStatus;
import com.anthropic.claude.api.common.WindowStatus;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u1e {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0022 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(defpackage.b5a r3, defpackage.tnb r4) {
        /*
            int r3 = r3.ordinal()
            r0 = 1
            if (r3 == 0) goto L23
            if (r3 == r0) goto L23
            r1 = 2
            r2 = 0
            if (r3 == r1) goto L1d
            r1 = 3
            if (r3 == r1) goto L18
            r4 = 4
            if (r3 != r4) goto L14
            goto L23
        L14:
            defpackage.wg6.i()
            return r2
        L18:
            tnb r3 = defpackage.tnb.G
            if (r4 != r3) goto L22
            goto L23
        L1d:
            tnb r3 = defpackage.tnb.F
            if (r4 != r3) goto L22
            goto L23
        L22:
            return r2
        L23:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u1e.a(b5a, tnb):boolean");
    }

    public static final RateLimit.ExceedsLimit b(RateLimit.ApproachingLimit approachingLimit) {
        LinkedHashMap linkedHashMap;
        approachingLimit.getClass();
        Date resetsAt = approachingLimit.getResetsAt();
        Boolean perModelLimit = approachingLimit.getPerModelLimit();
        String message = approachingLimit.getMessage();
        Map<String, WindowStatus> windows = approachingLimit.getWindows();
        if (windows != null) {
            linkedHashMap = new LinkedHashMap(tta.d0(windows.size()));
            Iterator<T> it = windows.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                WindowStatus windowStatusCopy$default = (WindowStatus) entry.getValue();
                if (windowStatusCopy$default.getStatus() == WindowLimitStatus.APPROACHING_LIMIT && x44.r(windowStatusCopy$default.getResetsAt(), approachingLimit.getResetsAt())) {
                    windowStatusCopy$default = WindowStatus.copy$default(windowStatusCopy$default, WindowLimitStatus.EXCEEDED_LIMIT, null, null, null, 14, null);
                }
                linkedHashMap.put(key, windowStatusCopy$default);
            }
        } else {
            linkedHashMap = null;
        }
        return new RateLimit.ExceedsLimit(resetsAt, perModelLimit, message, linkedHashMap);
    }

    public static final gne c(RateLimit rateLimit) {
        Map<String, WindowStatus> windows;
        Object next;
        rateLimit.getClass();
        boolean z = rateLimit instanceof RateLimit.ApproachingLimit;
        if (z) {
            windows = ((RateLimit.ApproachingLimit) rateLimit).getWindows();
        } else if (rateLimit instanceof RateLimit.ExceedsLimit) {
            windows = ((RateLimit.ExceedsLimit) rateLimit).getWindows();
        } else {
            if (!rateLimit.equals(RateLimit.WithinLimit.INSTANCE)) {
                wg6.i();
                return null;
            }
            windows = null;
        }
        if (windows != null) {
            lqa lqaVar = new lqa();
            for (b5a b5aVar : b5a.L) {
                WindowStatus windowStatus = windows.get(b5aVar.E);
                if (windowStatus != null) {
                }
            }
            lqa lqaVarC = lqaVar.c();
            if (lqaVarC.isEmpty()) {
                lqaVarC = null;
            }
            if (lqaVarC != null) {
                tnb.E.getClass();
                if (!rateLimit.equals(RateLimit.WithinLimit.INSTANCE)) {
                    boolean z2 = rateLimit instanceof RateLimit.ExceedsLimit;
                    b5a b5aVar2 = b5a.F;
                    b5a b5aVar3 = b5a.G;
                    b5a b5aVar4 = b5a.I;
                    b5a b5aVar5 = b5a.H;
                    b5a b5aVar6 = b5a.J;
                    tnb tnbVar = tnb.F;
                    if (z2) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Iterator it = ((mqa) lqaVarC.entrySet()).iterator();
                        while (((jqa) it).hasNext()) {
                            Map.Entry entry = (Map.Entry) ((jqa) it).next();
                            if (((WindowStatus) entry.getValue()).getStatus() == WindowLimitStatus.EXCEEDED_LIMIT) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        if (!linkedHashMap.isEmpty()) {
                            WindowStatus windowStatus2 = (WindowStatus) linkedHashMap.get(b5aVar6);
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                                if (((b5a) entry2.getKey()) != b5aVar6) {
                                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                                }
                            }
                            if (windowStatus2 != null && !linkedHashMap2.isEmpty()) {
                                return new gne(b5aVar6, windowStatus2);
                            }
                            if (linkedHashMap2.size() > 1) {
                                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                                    if (a((b5a) entry3.getKey(), tnbVar)) {
                                        linkedHashMap3.put(entry3.getKey(), entry3.getValue());
                                    }
                                }
                                Iterator it2 = linkedHashMap3.entrySet().iterator();
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    if (it2.hasNext()) {
                                        Date resetsAt = ((WindowStatus) ((Map.Entry) next).getValue()).getResetsAt();
                                        long time = resetsAt != null ? resetsAt.getTime() : Long.MIN_VALUE;
                                        do {
                                            Object next2 = it2.next();
                                            Date resetsAt2 = ((WindowStatus) ((Map.Entry) next2).getValue()).getResetsAt();
                                            long time2 = resetsAt2 != null ? resetsAt2.getTime() : Long.MIN_VALUE;
                                            if (time < time2) {
                                                next = next2;
                                                time = time2;
                                            }
                                        } while (it2.hasNext());
                                    }
                                } else {
                                    next = null;
                                }
                                Map.Entry entry4 = (Map.Entry) next;
                                if (entry4 != null) {
                                    return new gne((b5a) entry4.getKey(), (WindowStatus) entry4.getValue());
                                }
                            }
                            for (b5a b5aVar7 : x44.X(b5aVar5, b5aVar4, b5aVar3, b5aVar2)) {
                                WindowStatus windowStatus3 = (WindowStatus) linkedHashMap.get(b5aVar7);
                                if (windowStatus3 != null && a(b5aVar7, tnbVar)) {
                                    return new gne(b5aVar7, windowStatus3);
                                }
                            }
                            if (windowStatus2 != null) {
                                return new gne(b5aVar6, windowStatus2);
                            }
                        }
                    } else if (z) {
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                        Iterator it3 = ((mqa) lqaVarC.entrySet()).iterator();
                        while (((jqa) it3).hasNext()) {
                            Map.Entry entry5 = (Map.Entry) ((jqa) it3).next();
                            if (((WindowStatus) entry5.getValue()).getStatus() == WindowLimitStatus.APPROACHING_LIMIT) {
                                linkedHashMap4.put(entry5.getKey(), entry5.getValue());
                            }
                        }
                        if (!linkedHashMap4.isEmpty()) {
                            for (b5a b5aVar8 : x44.X(b5aVar2, b5aVar3, b5aVar6, b5aVar5, b5aVar4)) {
                                WindowStatus windowStatus4 = (WindowStatus) linkedHashMap4.get(b5aVar8);
                                if (windowStatus4 != null && a(b5aVar8, tnbVar)) {
                                    return new gne(b5aVar8, windowStatus4);
                                }
                            }
                        }
                    } else {
                        wg6.i();
                    }
                }
            }
        }
        return null;
    }
}
