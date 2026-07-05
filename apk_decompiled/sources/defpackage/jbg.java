package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class jbg implements Comparable, Map.Entry {
    public final Comparable E;
    public Object F;
    public final /* synthetic */ ebg G;

    public jbg(ebg ebgVar, Comparable comparable, Object obj) {
        this.G = ebgVar;
        this.E = comparable;
        this.F = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.E.compareTo(((jbg) obj).E);
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
        String strValueOf = String.valueOf(this.E);
        String strValueOf2 = String.valueOf(this.F);
        return kgh.q(new StringBuilder(strValueOf2.length() + strValueOf.length() + 1), strValueOf, "=", strValueOf2);
    }
}
