package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jch {
    public final String a;
    public final String b;
    public final String c;

    public jch(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jch)) {
            return false;
        }
        jch jchVar = (jch) obj;
        return x44.r(this.a, jchVar.a) && x44.r(this.b, jchVar.b) && x44.r(this.c, jchVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return ij0.m(kgh.r("Os(build=", this.a, ", name=", this.b, ", version="), this.c, ")");
    }
}
