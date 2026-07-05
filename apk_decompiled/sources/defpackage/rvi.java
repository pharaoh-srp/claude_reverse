package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rvi {
    public final long a;

    public rvi(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rvi) && this.a == ((rvi) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return grc.q(this.a, "Action(count=", ")");
    }
}
