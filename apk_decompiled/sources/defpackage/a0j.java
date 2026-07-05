package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a0j {
    public final String a;
    public final String b;
    public final String c;

    public a0j(String str, String str2, String str3) {
        grc.B(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0j)) {
            return false;
        }
        a0j a0jVar = (a0j) obj;
        return x44.r(this.a, a0jVar.a) && x44.r(this.b, a0jVar.b) && x44.r(this.c, a0jVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kgh.l(this.a.hashCode() * 31, 961, this.b);
    }

    public final String toString() {
        return ij0.m(kgh.r("Os(name=", this.a, ", version=", this.b, ", build=null, versionMajor="), this.c, ")");
    }
}
