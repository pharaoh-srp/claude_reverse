package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class xmi {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Map e;

    public /* synthetic */ xmi(String str, int i) {
        this((i & 1) != 0 ? null : str, null, null, null, nm6.E);
    }

    public static xmi a(xmi xmiVar, String str, String str2, String str3, Map map, int i) {
        if ((i & 1) != 0) {
            str = xmiVar.a;
        }
        String str4 = str;
        if ((i & 2) != 0) {
            str2 = xmiVar.b;
        }
        String str5 = str2;
        String str6 = (i & 4) != 0 ? xmiVar.c : null;
        if ((i & 8) != 0) {
            str3 = xmiVar.d;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            map = xmiVar.e;
        }
        Map map2 = map;
        xmiVar.getClass();
        map2.getClass();
        return new xmi(str4, str5, str6, str7, map2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xmi)) {
            return false;
        }
        xmi xmiVar = (xmi) obj;
        return x44.r(this.a, xmiVar.a) && x44.r(this.b, xmiVar.b) && x44.r(this.c, xmiVar.c) && x44.r(this.d, xmiVar.d) && x44.r(this.e, xmiVar.e);
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
        StringBuilder sbR = kgh.r("UserInfo(anonymousId=", this.a, ", id=", this.b, ", name=");
        kgh.u(sbR, this.c, ", email=", this.d, ", additionalProperties=");
        return qy1.i(sbR, this.e, ")");
    }

    public xmi(String str, String str2, String str3, String str4, Map map) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = map;
    }
}
