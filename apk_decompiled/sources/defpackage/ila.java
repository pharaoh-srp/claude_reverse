package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ila {
    public final String a;

    public ila(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ila) && this.a.equals(((ila) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("ContainerView(id=", this.a, ")");
    }
}
