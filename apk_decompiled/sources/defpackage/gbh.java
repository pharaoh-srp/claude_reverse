package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gbh {
    public final String a;

    public gbh(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gbh) && x44.r(this.a, ((gbh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("View(id=", this.a, ")");
    }
}
