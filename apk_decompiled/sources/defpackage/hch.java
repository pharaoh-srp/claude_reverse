package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hch {
    public final String a;

    public hch(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hch) && x44.r(this.a, ((hch) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("Application(id=", this.a, ")");
    }
}
