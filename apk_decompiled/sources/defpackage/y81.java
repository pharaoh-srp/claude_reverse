package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y81 {
    public final long a;
    public final g91 b;
    public final o81 c;

    public y81(long j, g91 g91Var, o81 o81Var) {
        this.a = j;
        this.b = g91Var;
        this.c = o81Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y81)) {
            return false;
        }
        y81 y81Var = (y81) obj;
        return this.a == y81Var.a && this.b.equals(y81Var.b) && this.c.equals(y81Var.c);
    }

    public final int hashCode() {
        long j = this.a;
        return this.c.hashCode() ^ ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
