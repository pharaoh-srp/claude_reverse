package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qqf implements rqf {
    public final long a;

    public qqf(long j) {
        this.a = j;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qqf) && this.a == ((qqf) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return grc.q(this.a, "WsOpen(openedAt=", ")");
    }
}
