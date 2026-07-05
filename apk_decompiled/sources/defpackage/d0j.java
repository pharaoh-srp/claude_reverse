package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d0j {
    public static final String[] f = {"id", "name", "email", "anonymous_id"};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Map e;

    public d0j(String str, String str2, String str3, String str4, Map map) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0j)) {
            return false;
        }
        d0j d0jVar = (d0j) obj;
        return x44.r(this.a, d0jVar.a) && x44.r(this.b, d0jVar.b) && x44.r(this.c, d0jVar.c) && x44.r(this.d, d0jVar.d) && this.e.equals(d0jVar.e);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return this.e.hashCode() + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("Usr(id=", this.a, ", name=", this.b, ", email=");
        kgh.u(sbR, this.c, ", anonymousId=", this.d, ", additionalProperties=");
        return qy1.i(sbR, this.e, ")");
    }
}
