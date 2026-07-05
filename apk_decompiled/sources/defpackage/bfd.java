package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bfd {
    public final z9 a;
    public final long b;
    public final Long c;

    public bfd(z9 z9Var, long j, Long l) {
        z9Var.getClass();
        this.a = z9Var;
        this.b = j;
        this.c = l;
    }

    public final Long a() {
        return this.c;
    }

    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfd)) {
            return false;
        }
        bfd bfdVar = (bfd) obj;
        return this.a == bfdVar.a && this.b == bfdVar.b && this.c.equals(bfdVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + vb7.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "PreviousViewLastInteractionContext(actionType=" + this.a + ", eventCreatedAtNanos=" + this.b + ", currentViewCreationTimestamp=" + this.c + ")";
    }
}
