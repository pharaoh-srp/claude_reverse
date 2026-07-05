package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nwi {
    public final long a;

    public nwi(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nwi) && this.a == ((nwi) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return grc.q(this.a, "Frustration(count=", ")");
    }
}
