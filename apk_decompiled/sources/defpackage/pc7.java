package defpackage;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class pc7 {
    public static volatile pc7 a;
    public static final pc7 b;

    static {
        pc7 pc7Var = new pc7();
        Map map = Collections.EMPTY_MAP;
        b = pc7Var;
    }

    public static pc7 a() {
        pc7 pc7Var;
        Class cls = az.a;
        pc7 pc7Var2 = a;
        if (pc7Var2 != null) {
            return pc7Var2;
        }
        synchronized (pc7.class) {
            try {
                pc7Var = a;
                if (pc7Var == null) {
                    Class cls2 = ic7.a;
                    pc7 pc7Var3 = null;
                    if (cls2 != null) {
                        try {
                            pc7Var3 = (pc7) cls2.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    pc7Var = pc7Var3 != null ? pc7Var3 : b;
                    a = pc7Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return pc7Var;
    }
}
