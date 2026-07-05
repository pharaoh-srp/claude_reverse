package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vye {
    public final uye a;
    public final long b;
    public final boolean c;

    public vye(uye uyeVar, long j, boolean z) {
        uyeVar.getClass();
        this.a = uyeVar;
        this.b = j;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vye)) {
            return false;
        }
        vye vyeVar = (vye) obj;
        return x44.r(this.a, vyeVar.a) && this.b == vyeVar.b && this.c == vyeVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + vb7.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "RumTTIDInfo(scenario=" + this.a + ", durationNs=" + this.b + ", wasForwarded=" + this.c + ")";
    }
}
