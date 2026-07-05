package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yn0 {
    public final Object a;
    public final Object b;

    public yn0(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yn0)) {
            return false;
        }
        yn0 yn0Var = (yn0) obj;
        return x44.r(this.a, yn0Var.a) && x44.r(this.b, yn0Var.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "ApproximationBounds(lower=" + this.a + ", upper=" + this.b + ')';
    }
}
