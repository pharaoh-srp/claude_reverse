package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sz0 extends fz0 {
    public final String a;

    public sz0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sz0) && this.a.equals(((sz0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("AstStrongEmphasis(delimiter=", this.a, ")");
    }
}
