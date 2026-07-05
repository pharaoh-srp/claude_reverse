package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class v7h implements z7h {
    public final Throwable a;

    public v7h(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v7h) && x44.r(this.a, ((v7h) obj).a);
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }

    public final String toString() {
        return "Ended(error=" + this.a + ")";
    }
}
