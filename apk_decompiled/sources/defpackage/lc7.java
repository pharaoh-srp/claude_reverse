package defpackage;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class lc7 {
    public static volatile lc7 a;
    public static final lc7 b;

    static {
        lc7 lc7Var = new lc7();
        Map map = Collections.EMPTY_MAP;
        b = lc7Var;
    }

    public static lc7 a() {
        lc7 lc7Var;
        oud oudVar = oud.c;
        lc7 lc7Var2 = a;
        if (lc7Var2 != null) {
            return lc7Var2;
        }
        synchronized (lc7.class) {
            try {
                lc7Var = a;
                if (lc7Var == null) {
                    Class cls = fc7.a;
                    lc7 lc7Var3 = null;
                    if (cls != null) {
                        try {
                            lc7Var3 = (lc7) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    lc7Var = lc7Var3 != null ? lc7Var3 : b;
                    a = lc7Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return lc7Var;
    }
}
