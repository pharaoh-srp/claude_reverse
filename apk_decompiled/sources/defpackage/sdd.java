package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sdd implements Comparable {
    public static final rdd F = new rdd();
    public final double E;

    public sdd(double d) {
        this.E = d;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        sdd sddVar = (sdd) obj;
        sddVar.getClass();
        return Double.compare(this.E, sddVar.E);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sdd) {
            return this.E == ((sdd) obj).E;
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.E);
    }

    public final String toString() {
        return this.E + " mmHg";
    }
}
