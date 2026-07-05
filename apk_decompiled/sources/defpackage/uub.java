package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class uub {
    public static final uub b = new uub();
    public final LinkedHashMap a;

    public uub(Map map) {
        map.getClass();
        this.a = new LinkedHashMap(map);
    }

    public final Object a(yl4 yl4Var) {
        yl4Var.getClass();
        Object obj = this.a.get(yl4Var);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public final void b(yl4 yl4Var, Object obj) {
        yl4Var.getClass();
        this.a.put(yl4Var, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uub) {
            return x44.r(this.a, ((uub) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public uub() {
        this(nm6.E);
    }
}
