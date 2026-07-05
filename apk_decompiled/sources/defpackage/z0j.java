package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class z0j implements c1j {
    public final String a;

    public z0j(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z0j) && this.a.equals(((z0j) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("Human(text=", this.a, ")");
    }
}
