package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sy0 extends fz0 {
    public final String a;

    public sy0(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sy0) && x44.r(this.a, ((sy0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("AstCode(literal=", this.a, ")");
    }
}
