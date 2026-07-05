package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hlf implements jlf {
    public final Exception a;

    public hlf(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hlf) && this.a.equals(((hlf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(error=" + this.a + ")";
    }
}
