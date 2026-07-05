package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class bsa implements Map.Entry, mm9 {
    public final Object E;
    public final Object F;

    public bsa(Object obj, Object obj2) {
        this.E = obj;
        this.F = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsa)) {
            return false;
        }
        bsa bsaVar = (bsa) obj;
        return x44.r(this.E, bsaVar.E) && x44.r(this.F, bsaVar.F);
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
        Object obj = this.E;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.F;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "MapEntry(key=" + this.E + ", value=" + this.F + ')';
    }
}
