package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kbh {
    public final String a;

    public kbh(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kbh) && x44.r(this.a, ((kbh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("Application(id=", this.a, ")");
    }
}
