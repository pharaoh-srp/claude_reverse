package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xa {
    public final long a;
    public final long b;

    public xa(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final qh9 a() {
        qh9 qh9Var = new qh9();
        qh9Var.p(Long.valueOf(this.a), "x");
        qh9Var.p(Long.valueOf(this.b), "y");
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa)) {
            return false;
        }
        xa xaVar = (xa) obj;
        return this.a == xaVar.a && this.b == xaVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return grc.r(this.b, ")", grc.w(this.a, "Position(x=", ", y="));
    }
}
