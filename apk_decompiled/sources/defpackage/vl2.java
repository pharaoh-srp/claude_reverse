package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class vl2 {
    public final long a;
    public final long b;

    public vl2(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final long a() {
        return this.a;
    }

    public final long b(bj0 bj0Var) {
        Long l;
        xi0 xi0VarA = bj0Var.a();
        return (xi0VarA.d + ((xi0VarA.a || (l = xi0VarA.b) == null) ? 0L : bj0Var.E.a() - l.longValue())) - this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vl2)) {
            return false;
        }
        vl2 vl2Var = (vl2) obj;
        return this.a == vl2Var.a && this.b == vl2Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return grc.r(this.b, ")", grc.w(this.a, "TimingMark(startTime=", ", backgroundMsAtStart="));
    }
}
