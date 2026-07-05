package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class kj5 {
    public static final cbf a = new cbf(kze.a, 0);
    public static final lja b = new lja(28);
    public static final int c = Integer.MAX_VALUE;

    public static final k99 a(String str) {
        k99 k99Var;
        cbf cbfVar = a;
        synchronized (cbfVar) {
            if (str == null) {
                str = "_dd.sdk_core.default";
            }
            try {
                k99Var = (k99) ((LinkedHashMap) cbfVar.G).get(str);
                if (k99Var == null) {
                    dch.H(kze.a, 4, g99.E, new xz(str, 7, new Throwable().fillInStackTrace()), null, false, 56);
                    k99Var = q4c.a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return k99Var;
    }

    public static boolean b() {
        boolean z;
        cbf cbfVar = a;
        synchronized (cbfVar) {
            z = ((k99) ((LinkedHashMap) cbfVar.G).get("_dd.sdk_core.default")) != null;
        }
        return z;
    }
}
