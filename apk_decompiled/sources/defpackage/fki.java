package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fki implements hki {
    public final String a;
    public final Throwable b;

    public fki(String str, Throwable th) {
        this.a = str;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fki)) {
            return false;
        }
        fki fkiVar = (fki) obj;
        return this.a.equals(fkiVar.a) && x44.r(this.b, fkiVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Throwable th = this.b;
        return iHashCode + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        return "RetryableError(message=" + this.a + ", cause=" + this.b + ")";
    }
}
