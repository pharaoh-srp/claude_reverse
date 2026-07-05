package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b19 {
    public final int a;
    public final Object b;

    public b19(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b19)) {
            return false;
        }
        b19 b19Var = (b19) obj;
        return this.a == b19Var.a && x44.r(this.b, b19Var.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Object obj = this.b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.a + ", value=" + this.b + ')';
    }
}
