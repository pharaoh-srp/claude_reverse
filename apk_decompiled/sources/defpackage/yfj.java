package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class yfj {
    public final long a;
    public final long b;

    public yfj(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yfj.class.equals(obj.getClass())) {
            yfj yfjVar = (yfj) obj;
            if (yfjVar.a == this.a && yfjVar.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PeriodicityInfo{repeatIntervalMillis=");
        sb.append(this.a);
        sb.append(", flexIntervalMillis=");
        return ebh.p(sb, this.b, '}');
    }
}
