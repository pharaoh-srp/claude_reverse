package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ie9 {
    public static final ie9 d = new ie9(iie.STRICT, 6);
    public final iie a;
    public final gs9 b;
    public final iie c;

    public ie9(iie iieVar, int i) {
        this(iieVar, (i & 2) != 0 ? new gs9(1, 0, 0) : null, iieVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ie9)) {
            return false;
        }
        ie9 ie9Var = (ie9) obj;
        return this.a == ie9Var.a && x44.r(this.b, ie9Var.b) && this.c == ie9Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        gs9 gs9Var = this.b;
        return this.c.hashCode() + ((iHashCode + (gs9Var == null ? 0 : gs9Var.H)) * 31);
    }

    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.a + ", sinceVersion=" + this.b + ", reportLevelAfter=" + this.c + ')';
    }

    public ie9(iie iieVar, gs9 gs9Var, iie iieVar2) {
        this.a = iieVar;
        this.b = gs9Var;
        this.c = iieVar2;
    }
}
