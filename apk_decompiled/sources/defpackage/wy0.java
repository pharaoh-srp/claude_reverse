package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wy0 extends fz0 {
    public final String a;

    public wy0(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wy0) && x44.r(this.a, ((wy0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("AstEmphasis(delimiter=", this.a, ")");
    }
}
