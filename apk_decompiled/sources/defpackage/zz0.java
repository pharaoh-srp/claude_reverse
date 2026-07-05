package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zz0 extends fz0 {
    public final String a;

    public zz0(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zz0) && x44.r(this.a, ((zz0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("AstText(literal=", this.a, ")");
    }
}
