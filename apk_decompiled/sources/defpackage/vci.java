package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vci implements Comparable {
    public final short E;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return x44.z(this.E & 65535, ((vci) obj).E & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vci) {
            return this.E == ((vci) obj).E;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.E);
    }

    public final String toString() {
        return String.valueOf(this.E & 65535);
    }
}
