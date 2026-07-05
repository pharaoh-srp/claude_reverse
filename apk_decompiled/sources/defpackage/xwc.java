package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xwc implements Comparable {
    public final double E;

    public xwc(double d) {
        this.E = d;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        xwc xwcVar = (xwc) obj;
        xwcVar.getClass();
        return Double.compare(this.E, xwcVar.E);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xwc) {
            return this.E == ((xwc) obj).E;
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.E);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.E);
        sb.append('%');
        return sb.toString();
    }
}
