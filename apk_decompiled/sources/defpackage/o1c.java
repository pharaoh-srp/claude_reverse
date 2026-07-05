package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o1c {
    public final String a;
    public final long b;
    public final Long c;

    public o1c(String str, long j, Long l) {
        this.a = str;
        this.b = j;
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1c)) {
            return false;
        }
        o1c o1cVar = (o1c) obj;
        return this.a.equals(o1cVar.a) && this.b == o1cVar.b && x44.r(this.c, o1cVar.c);
    }

    public final int hashCode() {
        int iE = vb7.e(this.a.hashCode() * 31, 31, this.b);
        Long l = this.c;
        return iE + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sbW = vb7.w("NetworkSettledResourceContext(resourceId=", this.a, ", eventCreatedAtNanos=", this.b);
        sbW.append(", viewCreatedTimestamp=");
        sbW.append(this.c);
        sbW.append(")");
        return sbW.toString();
    }
}
