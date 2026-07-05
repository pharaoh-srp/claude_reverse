package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class xfg implements wfg {
    public static final xfg F = new xfg();
    public final ConcurrentHashMap E = new ConcurrentHashMap();

    @Override // defpackage.wfg
    public final zfg get() {
        ConcurrentHashMap concurrentHashMap = this.E;
        Object aggVar = concurrentHashMap.get("datadog");
        if (aggVar == null) {
            aggVar = new agg();
            concurrentHashMap.put("datadog", aggVar);
        }
        return (zfg) aggVar;
    }
}
