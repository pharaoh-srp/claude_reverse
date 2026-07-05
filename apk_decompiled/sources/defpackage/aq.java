package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class aq implements dq {
    public final Throwable a;

    public aq(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aq) && x44.r(this.a, ((aq) obj).a);
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
