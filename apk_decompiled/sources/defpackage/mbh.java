package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mbh {
    public final String a;
    public final String b;
    public final String c;

    public mbh(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbh)) {
            return false;
        }
        mbh mbhVar = (mbh) obj;
        return x44.r(this.a, mbhVar.a) && x44.r(this.b, mbhVar.b) && x44.r(this.c, mbhVar.c);
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
