package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dqh implements Comparable {
    public final long E;

    public /* synthetic */ dqh(long j) {
        this.E = j;
    }

    public static long a(long j) {
        return (1 | (j - 1)) == Long.MAX_VALUE ? uh6.q(xn5.l0(j)) : xn5.s0(brb.a(), j);
    }

    public static final long b(long j, long j2) {
        int i = brb.F;
        if (((j2 - 1) | 1) != Long.MAX_VALUE) {
            return (1 | (j - 1)) == Long.MAX_VALUE ? xn5.l0(j) : xn5.s0(j, j2);
        }
        if (j != j2) {
            return uh6.q(xn5.l0(j2));
        }
        lz1 lz1Var = uh6.F;
        return 0L;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ int compareTo(Object obj) {
        return cpk.f(this, (dqh) obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dqh) {
            return this.E == ((dqh) obj).E;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.E);
    }

    public final String toString() {
        return "ValueTimeMark(reading=" + this.E + ')';
    }
}
