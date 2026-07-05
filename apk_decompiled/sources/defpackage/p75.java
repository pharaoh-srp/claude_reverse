package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class p75 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public p75(String str, String str2, String str3, String str4) {
        ij0.z(str, str2, str3, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p75)) {
            return false;
        }
        p75 p75Var = (p75) obj;
        return x44.r(this.a, p75Var.a) && x44.r(this.b, p75Var.b) && x44.r(this.c, p75Var.c) && x44.r(this.d, p75Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kgh.l(kgh.l(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return vb7.t(kgh.r("CreateProjectText(title=", this.a, ", description=", this.b, ", projectTitleInputHeader="), this.c, ", projectTitleInputHint=", this.d, ")");
    }
}
