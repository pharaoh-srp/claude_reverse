package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h78 implements l78 {
    public final nf0 a;

    public h78(nf0 nf0Var) {
        this.a = nf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h78) && this.a.equals(((h78) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(failure=" + this.a + ")";
    }
}
