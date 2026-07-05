package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b0j {
    public final int a;

    public b0j(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0j) && this.a == ((b0j) obj).a;
    }

    public final int hashCode() {
        int i = this.a;
        return (i == 0 ? 0 : sq6.F(i)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Profiling(status=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "ERROR" : "STOPPED" : "RUNNING" : "STARTING");
        sb.append(", errorReason=");
        sb.append("null");
        sb.append(")");
        return sb.toString();
    }
}
