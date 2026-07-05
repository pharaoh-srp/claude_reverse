package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class grh {
    public final long a;
    public final long b;

    public grh(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final long a() {
        return this.b;
    }

    public final long b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof grh)) {
            return false;
        }
        grh grhVar = (grh) obj;
        return this.a == grhVar.a && this.b == grhVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return grc.r(this.b, ")", grc.w(this.a, "Timing(startTime=", ", duration="));
    }
}
