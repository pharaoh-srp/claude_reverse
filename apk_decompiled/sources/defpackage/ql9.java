package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class ql9 {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static final String a(pl9 pl9Var) {
        pl9Var.getClass();
        ConcurrentHashMap concurrentHashMap = a;
        String str = (String) concurrentHashMap.get(pl9Var);
        if (str != null) {
            return str;
        }
        String name = ez1.I(pl9Var).getName();
        concurrentHashMap.put(pl9Var, name);
        return name;
    }
}
