package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xoe {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public xoe(String str, String str2, String str3, String str4) {
        grc.B(str, str2, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xoe)) {
            return false;
        }
        xoe xoeVar = (xoe) obj;
        return x44.r(this.a, xoeVar.a) && x44.r(this.b, xoeVar.b) && x44.r(this.c, xoeVar.c) && x44.r(this.d, xoeVar.d);
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
