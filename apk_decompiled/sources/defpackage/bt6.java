package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bt6 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public bt6(String str, String str2, String str3, String str4) {
        grc.B(str, str2, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final qh9 a() {
        qh9 qh9Var = new qh9();
        qh9Var.r("name", this.a);
        qh9Var.r("version", this.b);
        String str = this.c;
        if (str != null) {
            qh9Var.r("build", str);
        }
        qh9Var.r("version_major", this.d);
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bt6)) {
            return false;
        }
        bt6 bt6Var = (bt6) obj;
        return x44.r(this.a, bt6Var.a) && x44.r(this.b, bt6Var.b) && x44.r(this.c, bt6Var.c) && x44.r(this.d, bt6Var.d);
    }

    public final int hashCode() {
        int iL = kgh.l(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((iL + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return vb7.t(kgh.r("Os(name=", this.a, ", version=", this.b, ", build="), this.c, ", versionMajor=", this.d, ")");
    }
}
