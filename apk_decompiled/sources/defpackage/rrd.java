package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rrd {
    public final String a;
    public final boolean b;

    public rrd(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rrd)) {
            return false;
        }
        rrd rrdVar = (rrd) obj;
        return x44.r(this.a, rrdVar.a) && this.b == rrdVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ProseSegment(text=" + this.a + ", isFileMention=" + this.b + ")";
    }
}
