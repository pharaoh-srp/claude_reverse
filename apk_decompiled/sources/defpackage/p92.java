package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p92 {
    public final bz7 a;

    public p92(bz7 bz7Var) {
        this.a = bz7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p92) && x44.r(this.a, ((p92) obj).a);
    }

    public final int hashCode() {
        bz7 bz7Var = this.a;
        if (bz7Var == null) {
            return 0;
        }
        return bz7Var.hashCode();
    }

    public final String toString() {
        return "Callbacks(onClose=" + this.a + ')';
    }
}
