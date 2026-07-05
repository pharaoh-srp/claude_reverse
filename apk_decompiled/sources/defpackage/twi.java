package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class twi {
    public final long a;
    public final long b;
    public final long c;

    public twi(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof twi)) {
            return false;
        }
        twi twiVar = (twi) obj;
        return this.a == twiVar.a && this.b == twiVar.b && this.c == twiVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + vb7.e(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbW = grc.w(this.a, "LcpSubParts(loadDelay=", ", loadTime=");
        sbW.append(this.b);
        sbW.append(", renderDelay=");
        sbW.append(this.c);
        sbW.append(")");
        return sbW.toString();
    }
}
