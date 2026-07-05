package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h6d extends i6d {
    public final Exception a;

    public h6d(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h6d) && x44.r(this.a, ((h6d) obj).a);
    }

    public final int hashCode() {
        Exception exc = this.a;
        if (exc == null) {
            return 0;
        }
        return exc.hashCode();
    }

    public final String toString() {
        return "UpdateNotAvailable(playUpdateException=" + this.a + ")";
    }
}
