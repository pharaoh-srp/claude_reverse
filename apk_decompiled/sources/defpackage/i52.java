package defpackage;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class i52 {
    public Map a;
    public LinkedHashMap b;

    public final Object a(hj6 hj6Var, Object... objArr) {
        hj6Var.getClass();
        objArr.getClass();
        String strC = hj6Var.C(Arrays.copyOf(objArr, objArr.length));
        Object obj = this.a.get(strC);
        if (obj != null) {
            this.b.put(strC, obj);
        }
        return obj;
    }

    public final void b(hj6 hj6Var, Object[] objArr, Object obj) {
        hj6Var.getClass();
        objArr.getClass();
        obj.getClass();
        String strC = hj6Var.C(Arrays.copyOf(objArr, objArr.length));
        this.a.put(strC, obj);
        this.b.put(strC, obj);
    }
}
