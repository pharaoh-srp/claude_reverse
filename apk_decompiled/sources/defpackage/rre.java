package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rre {
    public final long a;

    public rre(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rre) && uh6.e(this.a, ((rre) obj).a);
    }

    public final int hashCode() {
        lz1 lz1Var = uh6.F;
        return Integer.hashCode(5) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return ij0.j("RetryPolicy(linearBackOff=", uh6.p(this.a), ", maxRetries=5)");
    }
}
