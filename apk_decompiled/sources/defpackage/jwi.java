package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jwi {
    public final long a;

    public jwi(long j) {
        this.a = j;
    }

    public final qh9 a() {
        qh9 qh9Var = new qh9();
        qh9Var.p(Long.valueOf(this.a), "timestamp");
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jwi) && this.a == ((jwi) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return grc.q(this.a, "Fcp(timestamp=", ")");
    }
}
