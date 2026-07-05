package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dz0 extends ty0 {
    public final String a;

    public dz0(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dz0) && x44.r(this.a, ((dz0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("AstIndentedCodeBlock(literal=", this.a, ")");
    }
}
