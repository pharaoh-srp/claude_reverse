package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wuf implements fvf {
    public final String a;

    public wuf(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wuf) && x44.r(this.a, ((wuf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("Remove(id=", this.a, ")");
    }
}
