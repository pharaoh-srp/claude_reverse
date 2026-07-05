package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class i7a implements Map.Entry {
    public i7a E;
    public i7a F;
    public i7a G;
    public i7a H;
    public i7a I;
    public final Object J;
    public final int K;
    public Object L;
    public int M;

    public i7a(i7a i7aVar, Object obj, int i, i7a i7aVar2, i7a i7aVar3) {
        this.E = i7aVar;
        this.J = obj;
        this.K = i;
        this.M = 1;
        this.H = i7aVar2;
        this.I = i7aVar3;
        i7aVar3.H = this;
        i7aVar2.I = this;
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
        Object obj2 = this.L;
        this.L = obj;
        return obj2;
    }

    public final String toString() {
        return this.J + "=" + this.L;
    }

    public i7a() {
        this.J = null;
        this.K = -1;
        this.I = this;
        this.H = this;
    }
}
