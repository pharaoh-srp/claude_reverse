package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class a42 implements d42 {
    public final Throwable a;

    public a42(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a42) && x44.r(this.a, ((a42) obj).a);
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }

    public final String toString() {
        return "Failed(cause=" + this.a + ")";
    }
}
