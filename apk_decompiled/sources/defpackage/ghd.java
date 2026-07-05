package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ghd {
    public final boolean a;

    public ghd(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ghd) && this.a == ((ghd) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qy1.g("ProcessInfo(isMainProcess=", ")", this.a);
    }
}
