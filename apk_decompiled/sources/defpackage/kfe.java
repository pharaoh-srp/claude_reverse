package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kfe extends mpk {
    public final int u;

    public kfe(int i) {
        this.u = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kfe) && this.u == ((kfe) obj).u;
    }

    public final int hashCode() {
        return Integer.hashCode(this.u);
    }

    public final String toString() {
        return grc.p(this.u, "intake-code-");
    }
}
