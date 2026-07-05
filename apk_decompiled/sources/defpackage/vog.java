package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vog extends xn5 {
    public final String f;
    public final long g;

    public vog(String str, long j) {
        str.getClass();
        this.f = str;
        this.g = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vog)) {
            return false;
        }
        vog vogVar = (vog) obj;
        return x44.r(this.f, vogVar.f) && this.g == vogVar.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + (this.f.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbW = vb7.w("Resource(resourceId=", this.f, ", resourceStopTimestampInNanos=", this.g);
        sbW.append(")");
        return sbW.toString();
    }
}
