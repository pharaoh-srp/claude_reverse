package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class p7a implements Map.Entry {
    public p7a E;
    public p7a F;
    public p7a G;
    public p7a H;
    public p7a I;
    public final Object J;
    public final boolean K;
    public Object L;
    public int M;

    public p7a(boolean z, p7a p7aVar, Object obj, p7a p7aVar2, p7a p7aVar3) {
        this.E = p7aVar;
        this.J = obj;
        this.K = z;
        this.M = 1;
        this.H = p7aVar2;
        this.I = p7aVar3;
        p7aVar3.H = this;
        p7aVar2.I = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.J;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.L;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.J;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.L;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.J;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.L;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.K) {
            mr9.h("value == null");
            return null;
        }
        Object obj2 = this.L;
        this.L = obj;
        return obj2;
    }

    public final String toString() {
        return this.J + "=" + this.L;
    }

    public p7a(boolean z) {
        this.J = null;
        this.K = z;
        this.I = this;
        this.H = this;
    }
}
