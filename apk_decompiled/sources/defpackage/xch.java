package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xch implements Comparable {
    public static final tch F = new tch();
    public final double E;

    public xch(double d) {
        this.E = d;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        xch xchVar = (xch) obj;
        xchVar.getClass();
        return Double.compare(this.E, xchVar.E);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xch) && this.E == ((xch) obj).E;
    }

    public final int hashCode() {
        return Double.hashCode(this.E);
    }

    public final String toString() {
        return this.E + " Celsius";
    }
}
