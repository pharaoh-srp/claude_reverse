package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ibg implements Map.Entry, Comparable {
    public final Comparable E;
    public Object F;
    public final /* synthetic */ dbg G;

    public ibg(dbg dbgVar, Comparable comparable, Object obj) {
        this.G = dbgVar;
        this.E = comparable;
        this.F = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.E.compareTo(((ibg) obj).E);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.E;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.F;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.E;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.F;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.E;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.F;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.G.c();
        Object obj2 = this.F;
        this.F = obj;
        return obj2;
    }

    public final String toString() {
        return this.E + "=" + this.F;
    }
}
