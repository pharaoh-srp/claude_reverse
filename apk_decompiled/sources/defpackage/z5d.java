package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z5d {
    public final r5d a;
    public final i5d b;

    public z5d(r5d r5dVar, i5d i5dVar) {
        this.a = r5dVar;
        this.b = i5dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5d)) {
            return false;
        }
        z5d z5dVar = (z5d) obj;
        return x44.r(this.b, z5dVar.b) && x44.r(this.a, z5dVar.a);
    }

    public final int hashCode() {
        r5d r5dVar = this.a;
        int iHashCode = (r5dVar != null ? r5dVar.hashCode() : 0) * 31;
        i5d i5dVar = this.b;
        return iHashCode + (i5dVar != null ? i5dVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.a + ", paragraphSyle=" + this.b + ')';
    }
}
