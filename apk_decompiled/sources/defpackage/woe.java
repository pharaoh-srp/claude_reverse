package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class woe {
    public final long a;
    public final long b;

    public woe(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof woe)) {
            return false;
        }
        woe woeVar = (woe) obj;
        return this.a == woeVar.a && this.b == woeVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return grc.r(this.b, ")", grc.w(this.a, "Location(line=", ", column="));
    }
}
