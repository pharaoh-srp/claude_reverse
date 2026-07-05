package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class s0d implements t0d {
    public final c1d a;

    public s0d(c1d c1dVar) {
        this.a = c1dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s0d) && this.a.equals(((s0d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Terminal(code=" + this.a + ")";
    }
}
