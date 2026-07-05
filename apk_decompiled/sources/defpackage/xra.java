package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class xra implements Map.Entry, mm9 {
    public final /* synthetic */ int E;
    public final Object F;
    public final Object G;

    public xra(Object obj, Object obj2) {
        this.E = 2;
        obj.getClass();
        this.F = obj;
        obj2.getClass();
        this.G = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.E) {
            case 0:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && x44.r(entry.getKey(), this.F) && x44.r(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.E) {
        }
        return this.F;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.E) {
        }
        return this.G;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.E) {
            case 0:
                Object obj = this.F;
                int iHashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return iHashCode ^ (value != null ? value.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.E) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        switch (this.E) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(this.F);
                sb.append('=');
                sb.append(getValue());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ xra(Object obj, int i, Object obj2) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }
}
