package io.sentry.util;

import io.sentry.l0;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static boolean a(String str, List list) {
        if (str != null && list != null && !list.isEmpty()) {
            ConcurrentHashMap concurrentHashMap = a;
            if (concurrentHashMap.containsKey(str)) {
                return ((Boolean) concurrentHashMap.get(str)).booleanValue();
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((l0) it.next()).a().equalsIgnoreCase(str)) {
                    concurrentHashMap.put(str, Boolean.TRUE);
                    return true;
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    if (((l0) it2.next()).b(str)) {
                        concurrentHashMap.put(str, Boolean.TRUE);
                        return true;
                    }
                    continue;
                } catch (Throwable unused) {
                }
            }
            concurrentHashMap.put(str, Boolean.FALSE);
        }
        return false;
    }
}
