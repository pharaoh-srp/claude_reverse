package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class t78 {
    public static final LinkedHashMap a = new LinkedHashMap();

    public static final cye a(k99 k99Var) {
        cye h4cVar;
        k99Var.getClass();
        LinkedHashMap linkedHashMap = a;
        synchronized (linkedHashMap) {
            try {
                h4cVar = (cye) linkedHashMap.get(k99Var);
                if (h4cVar == null) {
                    h99 h99VarT = k99Var.t();
                    if (h99VarT != null) {
                        dch.H(h99VarT, 4, g99.E, new v01(16, k99Var), null, false, 56);
                    }
                    h4cVar = new h4c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h4cVar;
    }
}
