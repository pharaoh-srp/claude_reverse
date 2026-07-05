package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nkh {
    public final long a;
    public final long b;

    public nkh(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nkh)) {
            return false;
        }
        nkh nkhVar = (nkh) obj;
        return d54.c(this.a, nkhVar.a) && d54.c(this.b, nkhVar.b);
    }

    public final int hashCode() {
        int i = d54.i;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        y6a.q(this.a, ", selectionBackgroundColor=", sb);
        sb.append((Object) d54.i(this.b));
        sb.append(')');
        return sb.toString();
    }
}
