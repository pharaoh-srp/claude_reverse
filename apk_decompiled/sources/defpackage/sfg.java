package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class sfg {
    public static final String[] e = {"id", "name", "email"};
    public final String a;
    public final String b;
    public final String c;
    public final Map d;

    public sfg(String str, String str2, String str3, Map map) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sfg)) {
            return false;
        }
        sfg sfgVar = (sfg) obj;
        return x44.r(this.a, sfgVar.a) && x44.r(this.b, sfgVar.b) && x44.r(this.c, sfgVar.c) && this.d.equals(sfgVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return this.d.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("Usr(id=", this.a, ", name=", this.b, ", email=");
        sbR.append(this.c);
        sbR.append(", additionalProperties=");
        sbR.append(this.d);
        sbR.append(")");
        return sbR.toString();
    }
}
