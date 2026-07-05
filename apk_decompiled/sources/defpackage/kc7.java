package defpackage;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class kc7 {
    public static volatile kc7 a;
    public static final kc7 b;

    static {
        kc7 kc7Var = new kc7();
        Map map = Collections.EMPTY_MAP;
        b = kc7Var;
    }

    public static kc7 a() {
        kc7 kc7Var;
        nud nudVar = nud.c;
        kc7 kc7Var2 = a;
        if (kc7Var2 != null) {
            return kc7Var2;
        }
        synchronized (kc7.class) {
            try {
                kc7Var = a;
                if (kc7Var == null) {
                    Class cls = ec7.a;
                    kc7 kc7Var3 = null;
                    if (cls != null) {
                        try {
                            kc7Var3 = (kc7) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    kc7Var = kc7Var3 != null ? kc7Var3 : b;
                    a = kc7Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kc7Var;
    }
}
