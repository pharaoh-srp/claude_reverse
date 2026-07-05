package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hwi {
    public final long a;

    public hwi(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hwi) && this.a == ((hwi) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return grc.q(this.a, "Error(count=", ")");
    }
}
