package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jph {
    public final long a;
    public final long b;

    public /* synthetic */ jph() {
        this(System.currentTimeMillis(), System.nanoTime());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jph)) {
            return false;
        }
        jph jphVar = (jph) obj;
        return this.a == jphVar.a && this.b == jphVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return grc.r(this.b, ")", grc.w(this.a, "Time(timestamp=", ", nanoTime="));
    }

    public jph(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
