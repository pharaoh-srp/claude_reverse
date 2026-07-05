package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dwa {
    public final long a;
    public final r35 b;

    public dwa(long j, r35 r35Var) {
        this.a = j;
        this.b = r35Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dwa)) {
            return false;
        }
        dwa dwaVar = (dwa) obj;
        return fcc.c(this.a, dwaVar.a) && x44.r(this.b, dwaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PointNRound(o=" + ((Object) fcc.k(this.a)) + ", r=" + this.b + ')';
    }
}
