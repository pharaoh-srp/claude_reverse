package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dg5 {
    public long a;
    public float b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dg5)) {
            return false;
        }
        dg5 dg5Var = (dg5) obj;
        return this.a == dg5Var.a && Float.compare(this.b, dg5Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.a);
        sb.append(", dataPoint=");
        return ebh.o(sb, this.b, ')');
    }
}
