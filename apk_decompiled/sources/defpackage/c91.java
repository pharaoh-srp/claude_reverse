package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c91 {
    public final wp3 a;
    public final HashMap b;

    public c91(wp3 wp3Var, HashMap map) {
        this.a = wp3Var;
        this.b = map;
    }

    public final long a(agd agdVar, long j, int i) {
        long jA = j - this.a.a();
        d91 d91Var = (d91) this.b.get(agdVar);
        long j2 = d91Var.a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i - 1) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * ((long) r12)))), jA), d91Var.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c91)) {
            return false;
        }
        c91 c91Var = (c91) obj;
        return this.a.equals(c91Var.a) && this.b.equals(c91Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
