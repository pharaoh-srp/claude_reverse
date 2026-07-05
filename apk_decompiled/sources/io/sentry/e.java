package io.sentry;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class e {
    public static void a(HashMap map, String str, y yVar, String str2, a1 a1Var) {
        Object obj = map.get(str);
        yVar.r(str2);
        yVar.x(a1Var, obj);
    }

    public static void b(ConcurrentHashMap concurrentHashMap, String str, y yVar, String str2, a1 a1Var) {
        Object obj = concurrentHashMap.get(str);
        yVar.r(str2);
        yVar.x(a1Var, obj);
    }
}
