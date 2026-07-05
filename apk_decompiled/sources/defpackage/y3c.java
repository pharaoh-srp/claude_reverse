package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class y3c {
    public final String a;
    public final long b;
    public final int c;

    public y3c(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3c)) {
            return false;
        }
        y3c y3cVar = (y3c) obj;
        return this.a.equals(y3cVar.a) && this.b == y3cVar.b && this.c == y3cVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + vb7.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbW = vb7.w("PendingSend(text=", this.a, ", acceptedAtMillis=", this.b);
        sbW.append(", generation=");
        sbW.append(this.c);
        sbW.append(")");
        return sbW.toString();
    }
}
