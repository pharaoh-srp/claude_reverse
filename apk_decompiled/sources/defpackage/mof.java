package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mof {
    public final long a;
    public final long b;

    public mof(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mof)) {
            return false;
        }
        mof mofVar = (mof) obj;
        return this.a == mofVar.a && this.b == mofVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return grc.r(this.b, ")", grc.w(this.a, "Anchor(serverTimeMs=", ", atClientElapsedMs="));
    }
}
