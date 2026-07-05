package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class a1d implements c1d {
    public final int a;

    public a1d(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a1d) && this.a == ((a1d) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return grc.u("Other(code=", this.a, ")");
    }
}
