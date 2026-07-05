package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lbh {
    public final String a;
    public final String b;
    public final String c;
    public final Number d;
    public final Number e;
    public final Boolean f;

    public lbh(String str, String str2, String str3, Number number, Number number2, Boolean bool) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = number;
        this.e = number2;
        this.f = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lbh)) {
            return false;
        }
        lbh lbhVar = (lbh) obj;
        return x44.r(this.a, lbhVar.a) && x44.r(this.b, lbhVar.b) && x44.r(this.c, lbhVar.c) && x44.r(this.d, lbhVar.d) && x44.r(this.e, lbhVar.e) && x44.r(this.f, lbhVar.f);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Number number = this.d;
        int iHashCode4 = (iHashCode3 + (number == null ? 0 : number.hashCode())) * 31;
        Number number2 = this.e;
        int iHashCode5 = (iHashCode4 + (number2 == null ? 0 : number2.hashCode())) * 31;
        Boolean bool = this.f;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("Device(architecture=", this.a, ", brand=", this.b, ", model=");
        sbR.append(this.c);
        sbR.append(", logicalCpuCount=");
        sbR.append(this.d);
        sbR.append(", totalRam=");
        sbR.append(this.e);
        sbR.append(", isLowRam=");
        sbR.append(this.f);
        sbR.append(")");
        return sbR.toString();
    }
}
