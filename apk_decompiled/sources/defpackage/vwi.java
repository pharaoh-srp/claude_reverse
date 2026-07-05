package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vwi {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public vwi(String str, String str2, String str3, String str4) {
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
        if (!(obj instanceof vwi)) {
            return false;
        }
        vwi vwiVar = (vwi) obj;
        return x44.r(this.a, vwiVar.a) && x44.r(this.b, vwiVar.b) && x44.r(this.c, vwiVar.c) && x44.r(this.d, vwiVar.d);
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
