package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wbh {
    public final String a;

    public wbh(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wbh) && x44.r(this.a, ((wbh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("Session(id=", this.a, ")");
    }
}
