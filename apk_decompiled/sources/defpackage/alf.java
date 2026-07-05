package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class alf implements clf {
    public final Throwable a;
    public final nf0 b;

    public alf(Throwable th, nf0 nf0Var) {
        th.getClass();
        this.a = th;
        this.b = nf0Var;
    }

    public final nf0 a() {
        return this.b;
    }

    public final Throwable b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alf)) {
            return false;
        }
        alf alfVar = (alf) obj;
        return x44.r(this.a, alfVar.a) && x44.r(this.b, alfVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        nf0 nf0Var = this.b;
        return iHashCode + (nf0Var == null ? 0 : nf0Var.hashCode());
    }

    public final String toString() {
        return "Failure(error=" + this.a + ", apiFailure=" + this.b + ")";
    }

    public /* synthetic */ alf(Throwable th) {
        this(th, null);
    }
}
