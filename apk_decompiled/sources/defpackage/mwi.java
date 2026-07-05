package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mwi {
    public final long a;

    public mwi(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mwi) && this.a == ((mwi) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return grc.q(this.a, "FrozenFrame(count=", ")");
    }
}
