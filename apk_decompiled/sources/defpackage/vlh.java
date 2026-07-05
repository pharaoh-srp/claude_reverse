package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class vlh {
    public final long a;
    public final long b;
    public final long c;

    public vlh(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vlh)) {
            return false;
        }
        vlh vlhVar = (vlh) obj;
        return this.a == vlhVar.a && this.b == vlhVar.b && this.c == vlhVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + vb7.e(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbW = grc.w(this.a, "ThinkingBlockBounds(startedAtMillis=", ", endedAtMillis=");
        sbW.append(this.b);
        sbW.append(", closedAtMillis=");
        sbW.append(this.c);
        sbW.append(")");
        return sbW.toString();
    }
}
