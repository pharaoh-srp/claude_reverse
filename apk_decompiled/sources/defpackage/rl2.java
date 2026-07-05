package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rl2 extends qik {
    public final Exception d;

    public rl2(Exception exc) {
        this.d = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rl2) && this.d.equals(((rl2) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final Throwable p() {
        return this.d;
    }

    public final String toString() {
        return "UnknownError(exception=" + this.d + ")";
    }
}
