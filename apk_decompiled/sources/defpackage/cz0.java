package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cz0 extends fz0 {
    public final String a;
    public final String b;

    public cz0(String str, String str2) {
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz0)) {
            return false;
        }
        cz0 cz0Var = (cz0) obj;
        return this.a.equals(cz0Var.a) && x44.r(this.b, cz0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return ij0.l("AstImage(title=", this.a, ", destination=", this.b, ")");
    }
}
