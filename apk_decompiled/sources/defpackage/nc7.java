package defpackage;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class nc7 {
    public static volatile nc7 a;
    public static final nc7 b;

    static {
        nc7 nc7Var = new nc7();
        Map map = Collections.EMPTY_MAP;
        b = nc7Var;
    }

    public static nc7 a() {
        nc7 nc7Var;
        nc7 nc7Var2 = a;
        if (nc7Var2 != null) {
            return nc7Var2;
        }
        synchronized (nc7.class) {
            try {
                nc7Var = a;
                if (nc7Var == null) {
                    Class cls = hc7.a;
                    nc7 nc7Var3 = null;
                    if (cls != null) {
                        try {
                            nc7Var3 = (nc7) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    nc7Var = nc7Var3 != null ? nc7Var3 : b;
                    a = nc7Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return nc7Var;
    }
}
