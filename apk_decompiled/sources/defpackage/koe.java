package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class koe {
    public final String a;

    public koe(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof koe) && this.a.equals(((koe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("ContainerView(id=", this.a, ")");
    }
}
