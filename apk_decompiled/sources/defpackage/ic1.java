package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ic1 {
    public final long a;
    public final double b;
    public final long c;

    public ic1(long j, double d, long j2) {
        this.a = j;
        this.b = d;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic1)) {
            return false;
        }
        ic1 ic1Var = (ic1) obj;
        return this.a == ic1Var.a && Double.compare(this.b, ic1Var.b) == 0 && this.c == ic1Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + fsh.o(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbW = grc.w(this.a, "Exponential(initialDelayMs=", ", factor=");
        sbW.append(this.b);
        sbW.append(", maxDelayMs=");
        sbW.append(this.c);
        sbW.append(")");
        return sbW.toString();
    }
}
