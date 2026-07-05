package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class xf4 {
    public static final xf4 b;
    public static final AtomicReferenceFieldUpdater c;
    public volatile Map a;

    static {
        xf4 xf4Var = new xf4();
        xf4Var.a = new ConcurrentHashMap();
        b = xf4Var;
        c = AtomicReferenceFieldUpdater.newUpdater(xf4.class, Map.class, "a");
    }

    public final void a(int i, Object obj, String str) {
        this.a.put(str, new ag4(i, obj, str));
    }
}
