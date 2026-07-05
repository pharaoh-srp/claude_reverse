package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class exi {
    public final long a;

    public exi(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof exi) && this.a == ((exi) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return grc.q(this.a, "Resource(count=", ")");
    }
}
