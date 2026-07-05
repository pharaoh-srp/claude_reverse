package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qof {
    public final long a;
    public final long b;
    public final long c;

    public qof(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qof)) {
            return false;
        }
        qof qofVar = (qof) obj;
        return this.a == qofVar.a && this.b == qofVar.b && this.c == qofVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + vb7.e(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbW = grc.w(this.a, "Persisted(serverTimeMs=", ", observedAtElapsedMs=");
        sbW.append(this.b);
        sbW.append(", bootCount=");
        sbW.append(this.c);
        sbW.append(")");
        return sbW.toString();
    }
}
