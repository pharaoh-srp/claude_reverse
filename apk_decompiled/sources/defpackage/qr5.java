package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class qr5 extends uok implements Map {
    public final Map G;

    public qr5(Map map) {
        this.G = map;
    }

    @Override // java.util.Map
    public final void clear() {
        this.G.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.G.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Iterator it = ((axf) entrySet()).iterator();
        it.getClass();
        if (obj == null) {
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(((Map.Entry) it.next()).getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return uj5.i(this.G.entrySet(), new pr5(0));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && dlk.k(obj, this);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.G.get(obj);
    }

    @Override // defpackage.uok
    public final Object h() {
        return this.G;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return uj5.k(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.G;
        return map.isEmpty() || (map.size() == 1 && map.containsKey(null));
    }

    @Override // java.util.Map
    public final Set keySet() {
        return uj5.i(this.G.keySet(), new pr5(1));
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.G.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.G.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.G.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        Map map = this.G;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.G.values();
    }
}
