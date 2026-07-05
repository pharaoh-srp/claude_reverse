package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tkf implements vkf {
    public final Exception a;

    public tkf(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tkf) && this.a.equals(((tkf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(error=" + this.a + ")";
    }
}
