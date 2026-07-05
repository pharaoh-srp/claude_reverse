package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dpe {
    public final long a;
    public final long b;

    public dpe(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final qh9 a() {
        qh9 qh9Var = new qh9();
        qh9Var.p(Long.valueOf(this.a), "duration");
        qh9Var.p(Long.valueOf(this.b), "start");
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpe)) {
            return false;
        }
        dpe dpeVar = (dpe) obj;
        return this.a == dpeVar.a && this.b == dpeVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return grc.r(this.b, ")", grc.w(this.a, "Redirect(duration=", ", start="));
    }
}
