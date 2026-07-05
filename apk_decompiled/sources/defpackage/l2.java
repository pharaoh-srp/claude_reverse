package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class l2 implements Map, mm9 {
    public abstract Set a();

    public abstract Set c();

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set setA = a();
        if (setA.isEmpty()) {
            return false;
        }
        Iterator it = setA.iterator();
        while (it.hasNext()) {
            if (x44.r(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract int d();

    public abstract Collection e();

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return a();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (d() != map.size()) {
            return false;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : setEntrySet) {
            if (entry == null) {
                return false;
            }
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object obj2 = get(key);
            if (!x44.r(value, obj2)) {
                return false;
            }
            if (obj2 == null && !containsKey(key)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public int hashCode() {
        return a().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return d() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return c();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return d();
    }

    public final String toString() {
        return w44.S0(a(), ", ", "{", "}", new v0(1, this), 24);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return e();
    }
}
