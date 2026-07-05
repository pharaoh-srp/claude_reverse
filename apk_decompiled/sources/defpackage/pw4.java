package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pw4 {
    public final String a;
    public final String b;
    public final String c;

    public pw4(String str, String str2, String str3) {
        grc.B(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pw4)) {
            return false;
        }
        pw4 pw4Var = (pw4) obj;
        return x44.r(this.a, pw4Var.a) && x44.r(this.b, pw4Var.b) && x44.r(this.c, pw4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kgh.l(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ij0.m(kgh.r("ConwayImagePreview(url=", this.a, ", label=", this.b, ", orgId="), this.c, ")");
    }
}
