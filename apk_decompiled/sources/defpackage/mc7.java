package defpackage;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class mc7 {
    public static volatile mc7 a;
    public static final mc7 b;

    static {
        mc7 mc7Var = new mc7();
        Map map = Collections.EMPTY_MAP;
        b = mc7Var;
    }

    public static mc7 a() {
        mc7 mc7Var;
        mc7 mc7Var2 = a;
        if (mc7Var2 != null) {
            return mc7Var2;
        }
        synchronized (mc7.class) {
            try {
                mc7Var = a;
                if (mc7Var == null) {
                    Class cls = gc7.a;
                    mc7 mc7Var3 = null;
                    if (cls != null) {
                        try {
                            mc7Var3 = (mc7) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    mc7Var = mc7Var3 != null ? mc7Var3 : b;
                    a = mc7Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mc7Var;
    }
}
