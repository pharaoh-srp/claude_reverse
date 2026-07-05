package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pxi {
    public final Long a;
    public final int b;
    public final a5c c;

    public pxi(Long l, int i, a5c a5cVar) {
        sq6.a(i);
        this.a = l;
        this.b = i;
        this.c = a5cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxi)) {
            return false;
        }
        pxi pxiVar = (pxi) obj;
        return x44.r(this.a, pxiVar.a) && this.b == pxiVar.b && x44.r(this.c, pxiVar.c);
    }

    public final int hashCode() {
        Long l = this.a;
        int iC = qy1.c(this.b, (l == null ? 0 : l.hashCode()) * 31, 31);
        a5c a5cVar = this.c;
        return iC + (a5cVar != null ? a5cVar.hashCode() : 0);
    }

    public final String toString() {
        return "ViewInitializationMetricsState(initializationTime=" + this.a + ", config=" + fsh.I(this.b) + ", noValueReason=" + this.c + ")";
    }
}
