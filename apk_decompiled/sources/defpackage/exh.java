package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class exh {
    public final Object a;
    public final boolean b;

    public exh(Object obj, boolean z) {
        this.a = obj;
        this.b = z;
    }

    public final Object a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof exh)) {
            return false;
        }
        exh exhVar = (exh) obj;
        return x44.r(this.a, exhVar.a) && this.b == exhVar.b;
    }

    public final int hashCode() {
        Object obj = this.a;
        return Boolean.hashCode(this.b) + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "ExecutionResult(response=" + this.a + ", success=" + this.b + ")";
    }
}
