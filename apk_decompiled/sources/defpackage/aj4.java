package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aj4 implements ej4 {
    public final Throwable a;

    public aj4(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aj4) && this.a.equals(((aj4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(throwable=" + this.a + ")";
    }
}
