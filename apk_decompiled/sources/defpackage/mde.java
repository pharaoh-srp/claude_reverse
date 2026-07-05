package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mde implements szd {
    public final String E;

    public mde(String str) {
        str.getClass();
        this.E = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mde.class != obj.getClass()) {
            return false;
        }
        return x44.r(this.E, ((mde) obj).E);
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    public final String toString() {
        return ij0.j("RegionQualifier(region='", this.E, "')");
    }
}
