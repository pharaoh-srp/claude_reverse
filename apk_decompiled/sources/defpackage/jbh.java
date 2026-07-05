package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jbh {
    public final String a;

    public jbh(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jbh) && x44.r(this.a, ((jbh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("Action(id=", this.a, ")");
    }
}
