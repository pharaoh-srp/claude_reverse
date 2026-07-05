package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class wra implements Map.Entry, mm9 {
    public final Object E;
    public final Object F;

    public wra(Object obj, Object obj2) {
        this.E = obj;
        this.F = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && x44.r(entry.getKey(), this.E) && x44.r(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.E;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.F;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.E;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.E);
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
