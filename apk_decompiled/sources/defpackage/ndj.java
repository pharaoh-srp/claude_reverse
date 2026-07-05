package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class ndj {
    public static zvi a(qh9 qh9Var) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((m7a) qh9Var.E.entrySet()).iterator();
            while (((o7a) it).hasNext()) {
                p7a p7aVarA = ((l7a) it).a();
                Object key = p7aVarA.getKey();
                key.getClass();
                linkedHashMap.put(key, p7aVarA.getValue());
            }
            return new zvi(linkedHashMap);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Context", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Context", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Context", e3);
            return null;
        }
    }

    public static final o59 b(f59 f59Var) {
        return new o59(f59Var.a, f59Var.b, f59Var.c, f59Var.d);
    }
}
