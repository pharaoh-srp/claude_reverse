package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lci implements Comparable {
    public final int E;

    public /* synthetic */ lci(int i) {
        this.E = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return x44.z(this.E ^ Integer.MIN_VALUE, ((lci) obj).E ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lci) {
            return this.E == ((lci) obj).E;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.E);
    }

    public final String toString() {
        return String.valueOf(((long) this.E) & 4294967295L);
    }
}
