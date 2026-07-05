package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bo7 implements do7 {
    public final long a;
    public final long b;

    public bo7(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bo7)) {
            return false;
        }
        bo7 bo7Var = (bo7) obj;
        return this.a == bo7Var.a && this.b == bo7Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return grc.r(this.b, ")", grc.w(this.a, "Downloading(bytesDownloaded=", ", totalBytes="));
    }
}
