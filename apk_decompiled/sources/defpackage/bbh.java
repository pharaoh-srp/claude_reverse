package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bbh {
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;
    public final Number e;
    public final Boolean f;

    public bbh(String str, String str2, String str3, Integer num, Number number, Boolean bool) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
        this.e = number;
        this.f = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbh)) {
            return false;
        }
        bbh bbhVar = (bbh) obj;
        return x44.r(this.a, bbhVar.a) && x44.r(this.b, bbhVar.b) && x44.r(this.c, bbhVar.c) && this.d.equals(bbhVar.d) && x44.r(this.e, bbhVar.e) && x44.r(this.f, bbhVar.f);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (this.d.hashCode() + ((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        Number number = this.e;
        int iHashCode4 = (iHashCode3 + (number == null ? 0 : number.hashCode())) * 31;
        Boolean bool = this.f;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
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
