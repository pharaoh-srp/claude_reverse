package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pa6 {
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof pa6) {
            return this.a == ((pa6) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return grc.q(this.a, "DownloadId(value=", ")");
    }
}
