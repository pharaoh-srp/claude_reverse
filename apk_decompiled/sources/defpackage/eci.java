package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eci implements Comparable {
    public final byte E;

    public /* synthetic */ eci(byte b) {
        this.E = b;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return x44.z(this.E & 255, ((eci) obj).E & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eci) {
            return this.E == ((eci) obj).E;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.E);
    }

    public final String toString() {
        return String.valueOf(this.E & 255);
    }
}
