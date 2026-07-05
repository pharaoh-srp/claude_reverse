package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ofg {
    public final String a;
    public final String b;
    public final String c;

    public ofg(String str, String str2, String str3) {
        grc.B(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ofg)) {
            return false;
        }
        ofg ofgVar = (ofg) obj;
        return x44.r(this.a, ofgVar.a) && x44.r(this.b, ofgVar.b) && x44.r(this.c, ofgVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kgh.l(this.a.hashCode() * 31, 961, this.b);
    }

    public final String toString() {
        return ij0.m(kgh.r("Os(name=", this.a, ", version=", this.b, ", build=null, versionMajor="), this.c, ")");
    }
}
