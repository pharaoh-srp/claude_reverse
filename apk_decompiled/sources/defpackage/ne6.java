package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ne6 implements oe6 {
    public final uf6 a;

    public ne6(uf6 uf6Var) {
        uf6Var.getClass();
        this.a = uf6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ne6) && x44.r(this.a, ((ne6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Enabled(preferences=" + this.a + ")";
    }
}
