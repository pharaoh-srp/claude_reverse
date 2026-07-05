package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dxi {
    public final Long a;
    public final Long b;
    public final Long c;

    public dxi(Long l, Long l2, Long l3) {
        this.a = l;
        this.b = l2;
        this.c = l3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxi)) {
            return false;
        }
        dxi dxiVar = (dxi) obj;
        return x44.r(this.a, dxiVar.a) && x44.r(this.b, dxiVar.b) && x44.r(this.c, dxiVar.c);
    }

    public final int hashCode() {
        Long l = this.a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.c;
        return iHashCode2 + (l3 != null ? l3.hashCode() : 0);
    }

    public final String toString() {
        return "ReplayStats(recordsCount=" + this.a + ", segmentsCount=" + this.b + ", segmentsTotalRawSize=" + this.c + ")";
    }
}
