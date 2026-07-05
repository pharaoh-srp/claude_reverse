package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dxc {
    public final long a;
    public final long b;
    public final String c;
    public final String d;

    public dxc(long j, long j2, String str, String str2) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxc)) {
            return false;
        }
        dxc dxcVar = (dxc) obj;
        return this.a == dxcVar.a && this.b == dxcVar.b && this.c.equals(dxcVar.c) && this.d.equals(dxcVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kgh.l(vb7.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbW = grc.w(this.a, "PerfettoResult(start=", ", end=");
        qy1.m(this.b, ", tag=", this.c, sbW);
        return kgh.q(sbW, ", resultFilePath=", this.d, ")");
    }
}
