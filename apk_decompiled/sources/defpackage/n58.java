package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class n58 {
    public final String a;
    public final String b;
    public final d68 c;

    public n58(String str, String str2, d68 d68Var) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = d68Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n58)) {
            return false;
        }
        n58 n58Var = (n58) obj;
        return x44.r(this.a, n58Var.a) && x44.r(this.b, n58Var.b) && this.c.equals(n58Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kgh.l(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("GitInfo(repo=", this.a, ", branch=", this.b, ", status=");
        sbR.append(this.c);
        sbR.append(")");
        return sbR.toString();
    }
}
