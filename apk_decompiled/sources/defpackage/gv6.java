package defpackage;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class gv6 implements mvg, uwd {
    public final HashMap a = new HashMap();
    public ArrayDeque b = new ArrayDeque();
    public final Executor c;

    public gv6(Executor executor) {
        this.c = executor;
    }

    public final synchronized void a(Executor executor, kz6 kz6Var) {
        try {
            executor.getClass();
            if (!this.a.containsKey(sf5.class)) {
                this.a.put(sf5.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.a.get(sf5.class)).put(kz6Var, executor);
        } catch (Throwable th) {
            throw th;
        }
    }
}
