package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gz0 extends fz0 {
    public final String a;
    public final String b;

    public gz0(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gz0)) {
            return false;
        }
        gz0 gz0Var = (gz0) obj;
        return x44.r(this.a, gz0Var.a) && this.b.equals(gz0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return ij0.l("AstLink(destination=", this.a, ", title=", this.b, ")");
    }
}
