package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xef {
    public static final xef c = new xef(0, 0);
    public final long a;
    public final long b;

    public xef(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xef.class == obj.getClass()) {
            xef xefVar = (xef) obj;
            if (this.a == xefVar.a && this.b == xefVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.a);
        sb.append(", position=");
        return grc.r(this.b, "]", sb);
    }
}
