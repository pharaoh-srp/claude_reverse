package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ln4 {
    public final int a;
    public final long b;
    public final mn4 c;
    public final xzd d;

    public ln4(int i, long j, mn4 mn4Var, xzd xzdVar) {
        this.a = i;
        this.b = j;
        this.c = mn4Var;
        this.d = xzdVar;
    }

    public final int a() {
        return this.a;
    }

    public final xzd b() {
        return this.d;
    }

    public final mn4 c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ln4)) {
            return false;
        }
        ln4 ln4Var = (ln4) obj;
        return this.a == ln4Var.a && this.b == ln4Var.b && this.c == ln4Var.c && x44.r(this.d, ln4Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + vb7.e(Integer.hashCode(this.a) * 31, 31, this.b)) * 31;
        xzd xzdVar = this.d;
        return iHashCode + (xzdVar == null ? 0 : xzdVar.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.a + ", timestamp=" + this.b + ", type=" + this.c + ", structureCompat=" + this.d + ')';
    }
}
