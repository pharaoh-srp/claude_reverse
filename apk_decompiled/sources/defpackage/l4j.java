package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class l4j {
    public final String a;

    public l4j(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l4j) && this.a.equals(((l4j) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("ShowAddedSupport(code=", this.a, ")");
    }
}
