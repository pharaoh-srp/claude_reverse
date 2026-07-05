package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ifg {
    public final qfg a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public ifg(qfg qfgVar, String str, String str2, String str3, String str4) {
        this.a = qfgVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ifg)) {
            return false;
        }
        ifg ifgVar = (ifg) obj;
        return x44.r(this.a, ifgVar.a) && x44.r(this.b, ifgVar.b) && x44.r(this.c, ifgVar.c) && x44.r(this.d, ifgVar.d) && x44.r(this.e, ifgVar.e);
    }

    public final int hashCode() {
        qfg qfgVar = this.a;
        int iHashCode = (qfgVar == null ? 0 : qfgVar.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Client(simCarrier=");
        sb.append(this.a);
        sb.append(", signalStrength=");
        sb.append(this.b);
        sb.append(", downlinkKbps=");
        kgh.u(sb, this.c, ", uplinkKbps=", this.d, ", connectivity=");
        return ij0.m(sb, this.e, ")");
    }
}
