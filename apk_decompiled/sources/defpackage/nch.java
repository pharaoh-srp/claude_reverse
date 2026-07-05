package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nch {
    public final String a;

    public nch(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nch) && x44.r(this.a, ((nch) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("View(id=", this.a, ")");
    }
}
