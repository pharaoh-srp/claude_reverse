package defpackage;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tzj implements Map, Serializable {
    public static final Map.Entry[] F = new Map.Entry[0];
    public transient b0k E;

    @Override // java.util.Map
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final b0k entrySet() {
        b0k n0kVar = this.E;
        if (n0kVar == null) {
            o0k o0kVar = (o0k) this;
            n0kVar = o0kVar.isEmpty() ? j2k.P : new n0k(o0kVar);
            this.E = n0kVar;
        }
        return n0kVar;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return ((o0k) this).H.contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return ((o0k) this).entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return tpk.l(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((o0k) this).size() == 0;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        o0k o0kVar = (o0k) this;
        int size = o0kVar.size();
        if (size < 0) {
            sz6.p(grc.p(size, "size cannot be negative but was: "));
            return null;
        }
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : o0kVar.entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
