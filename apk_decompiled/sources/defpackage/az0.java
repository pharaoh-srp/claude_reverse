package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class az0 extends ty0 {
    public final String a;

    public az0(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof az0) && x44.r(this.a, ((az0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("AstHtmlBlock(literal=", this.a, ")");
    }
}
