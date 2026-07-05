package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ptc {
    public final String a;
    public final String b;
    public final String c;

    public ptc(String str, String str2, String str3) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ptc)) {
            return false;
        }
        ptc ptcVar = (ptc) obj;
        return x44.r(this.a, ptcVar.a) && x44.r(this.b, ptcVar.b) && x44.r(this.c, ptcVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return ij0.m(kgh.r("ParsedModelIdLabel(base=", this.a, ", suffix=", this.b, ", context="), this.c, ")");
    }
}
