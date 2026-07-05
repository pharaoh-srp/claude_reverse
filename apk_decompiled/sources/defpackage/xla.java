package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class xla {
    public static final String[] f = {"id", "name", "email", "anonymous_id"};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Map e;

    public xla(String str, String str2, String str3, String str4, Map map) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = map;
    }

    public static xla a(xla xlaVar, LinkedHashMap linkedHashMap) {
        String str = xlaVar.a;
        String str2 = xlaVar.b;
        String str3 = xlaVar.c;
        String str4 = xlaVar.d;
        xlaVar.getClass();
        return new xla(str, str2, str3, str4, linkedHashMap);
    }

    public final Map b() {
        return this.e;
    }

    public final qh9 c() {
        qh9 qh9Var = new qh9();
        String str = this.a;
        if (str != null) {
            qh9Var.r("id", str);
        }
        String str2 = this.b;
        if (str2 != null) {
            qh9Var.r("name", str2);
        }
        String str3 = this.c;
        if (str3 != null) {
            qh9Var.r("email", str3);
        }
        String str4 = this.d;
        if (str4 != null) {
            qh9Var.r("anonymous_id", str4);
        }
        for (Map.Entry entry : this.e.entrySet()) {
            String str5 = (String) entry.getKey();
            Object value = entry.getValue();
            if (!mp0.o0(str5, f)) {
                qh9Var.o(str5, vz8.M(value));
            }
        }
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xla)) {
            return false;
        }
        xla xlaVar = (xla) obj;
        return x44.r(this.a, xlaVar.a) && x44.r(this.b, xlaVar.b) && x44.r(this.c, xlaVar.c) && x44.r(this.d, xlaVar.d) && this.e.equals(xlaVar.e);
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
