package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sch implements Comparable {
    public final double E;

    public sch(double d) {
        this.E = d;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        sch schVar = (sch) obj;
        schVar.getClass();
        return Double.compare(this.E, schVar.E);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sch) && this.E == ((sch) obj).E;
    }

    public final int hashCode() {
        return Double.hashCode(this.E);
    }

    public final String toString() {
        return this.E + " Celsius";
    }
}
