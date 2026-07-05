package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ra {
    public final long a;

    public ra(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ra) && this.a == ((ra) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return grc.q(this.a, "Error(count=", ")");
    }
}
