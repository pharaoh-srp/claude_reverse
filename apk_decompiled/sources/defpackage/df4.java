package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class df4 extends dgj {
    public final bz7 o;
    public final ConcurrentHashMap p = new ConcurrentHashMap();

    public df4(bz7 bz7Var) {
        this.o = bz7Var;
    }

    public final Object X(Class cls) {
        cls.getClass();
        ConcurrentHashMap concurrentHashMap = this.p;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return obj;
        }
        Object objInvoke = this.o.invoke(cls);
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, objInvoke);
        return objPutIfAbsent == null ? objInvoke : objPutIfAbsent;
    }
}
