package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sog extends xn5 {
    public final String f;
    public final Long g;

    public sog(Long l, String str) {
        this.f = str;
        this.g = l;
    }

    public final String M0() {
        return this.f;
    }

    public final Long N0() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sog)) {
            return false;
        }
        sog sogVar = (sog) obj;
        return x44.r(this.f, sogVar.f) && x44.r(this.g, sogVar.g);
    }

    public final int hashCode() {
        String str = this.f;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.g;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "Error(resourceId=" + this.f + ", resourceStopTimestampInNanos=" + this.g + ")";
    }
}
