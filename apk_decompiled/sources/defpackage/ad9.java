package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ad9 {
    public final String a;
    public final String b;
    public final String c;

    public ad9(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        if (bsg.v0(str, '=') || bsg.v0(str2, '=')) {
            sz6.p("JankStateTag key/value cannot contain '='");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad9)) {
            return false;
        }
        ad9 ad9Var = (ad9) obj;
        return x44.r(this.a, ad9Var.a) && x44.r(this.b, ad9Var.b) && x44.r(this.c, ad9Var.c);
    }

    public final int hashCode() {
        int iL = kgh.l(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iL + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return ij0.m(kgh.r("JankStateTag(key=", this.a, ", value=", this.b, ", traceName="), this.c, ")");
    }
}
