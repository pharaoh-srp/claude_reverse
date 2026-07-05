package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class moe {
    public final noe a;
    public final goe b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Number h;
    public final Boolean i;

    public moe(noe noeVar, goe goeVar, String str, String str2, String str3, String str4, String str5, Number number, Boolean bool) {
        this.a = noeVar;
        this.b = goeVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = number;
        this.i = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof moe)) {
            return false;
        }
        moe moeVar = (moe) obj;
        return x44.r(this.a, moeVar.a) && x44.r(this.b, moeVar.b) && x44.r(this.c, moeVar.c) && x44.r(this.d, moeVar.d) && x44.r(this.e, moeVar.e) && x44.r(this.f, moeVar.f) && x44.r(this.g, moeVar.g) && x44.r(this.h, moeVar.h) && x44.r(this.i, moeVar.i);
    }

    public final int hashCode() {
        noe noeVar = this.a;
        int iHashCode = (noeVar == null ? 0 : noeVar.hashCode()) * 31;
        goe goeVar = this.b;
        int iHashCode2 = (iHashCode + (goeVar == null ? 0 : goeVar.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Number number = this.h;
        int iHashCode8 = (iHashCode7 + (number == null ? 0 : number.hashCode())) * 31;
        Boolean bool = this.i;
        return iHashCode8 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Dd(session=");
        sb.append(this.a);
        sb.append(", configuration=");
        sb.append(this.b);
        sb.append(", browserSdkVersion=");
        kgh.u(sb, this.c, ", sdkName=", this.d, ", spanId=");
        kgh.u(sb, this.e, ", parentSpanId=", this.f, ", traceId=");
        sb.append(this.g);
        sb.append(", rulePsr=");
        sb.append(this.h);
        sb.append(", discarded=");
        return qy1.h(sb, this.i, ")");
    }
}
