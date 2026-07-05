package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xpf {
    public final String a;
    public final long b;
    public final long c;
    public final boolean d;

    public xpf(long j, long j2, String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xpf)) {
            return false;
        }
        xpf xpfVar = (xpf) obj;
        return x44.r(this.a, xpfVar.a) && this.b == xpfVar.b && this.c == xpfVar.c && this.d == xpfVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + vb7.e(vb7.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbW = vb7.w("TrackedView(viewUrl=", this.a, ", startMs=", this.b);
        ij0.u(this.c, ", durationNs=", ", hasReplay=", sbW);
        return sq6.v(")", sbW, this.d);
    }
}
