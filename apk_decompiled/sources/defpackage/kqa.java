package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class kqa implements Map.Entry, pm9 {
    public final lqa E;
    public final int F;
    public final int G;

    public kqa(lqa lqaVar, int i) {
        lqaVar.getClass();
        this.E = lqaVar;
        this.F = i;
        this.G = lqaVar.L;
    }

    public final void a() {
        if (this.E.L != this.G) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return x44.r(entry.getKey(), getKey()) && x44.r(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.E.E[this.F];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.E.F;
        objArr.getClass();
        return objArr[this.F];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        lqa lqaVar = this.E;
        lqaVar.d();
        Object[] objArr = lqaVar.F;
        if (objArr == null) {
            int length = lqaVar.E.length;
            if (length < 0) {
                sz6.p("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            lqaVar.F = objArr;
        }
        int i = this.F;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
