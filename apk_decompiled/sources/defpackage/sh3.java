package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class sh3 {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public sh3(HashMap map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            y3a y3aVar = (y3a) entry.getValue();
            List arrayList = (List) this.a.get(y3aVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.a.put(y3aVar, arrayList);
            }
            arrayList.add((th3) entry.getKey());
        }
    }

    public static void a(List list, m4a m4aVar, y3a y3aVar, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                th3 th3Var = (th3) list.get(size);
                Method method = th3Var.b;
                try {
                    int i = th3Var.a;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, m4aVar);
                    } else if (i == 2) {
                        method.invoke(obj, m4aVar, y3aVar);
                    }
                } catch (IllegalAccessException e) {
                    xh6.h(e);
                    return;
                } catch (InvocationTargetException e2) {
                    xh6.f("Failed to call observer method", e2.getCause());
                    return;
                }
            }
        }
    }
}
