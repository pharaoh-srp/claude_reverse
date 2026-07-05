package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wlf implements ylf {
    public final Throwable a;
    public final nf0 b;

    public wlf(Throwable th, nf0 nf0Var) {
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
        if (!(obj instanceof wlf)) {
            return false;
        }
        wlf wlfVar = (wlf) obj;
        return x44.r(this.a, wlfVar.a) && x44.r(this.b, wlfVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        nf0 nf0Var = this.b;
        return iHashCode + (nf0Var == null ? 0 : nf0Var.hashCode());
    }

    public final String toString() {
        return "Failure(error=" + this.a + ", apiFailure=" + this.b + ")";
    }

    public /* synthetic */ wlf(Throwable th) {
        this(th, null);
    }
}
