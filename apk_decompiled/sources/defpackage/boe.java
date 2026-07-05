package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class boe {
    public static final String[] d = {"id", "name"};
    public final String a;
    public final String b;
    public final Map c;

    public boe(String str, String str2, Map map) {
        this.a = str;
        this.b = str2;
        this.c = map;
    }

    public static boe a(boe boeVar, LinkedHashMap linkedHashMap) {
        String str = boeVar.a;
        String str2 = boeVar.b;
        boeVar.getClass();
        return new boe(str, str2, linkedHashMap);
    }

    public final Map b() {
        return this.c;
    }

    public final qh9 c() {
        qh9 qh9Var = new qh9();
        qh9Var.r("id", this.a);
        String str = this.b;
        if (str != null) {
            qh9Var.r("name", str);
        }
        for (Map.Entry entry : this.c.entrySet()) {
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            if (!mp0.o0(str2, d)) {
                qh9Var.o(str2, vz8.M(value));
            }
        }
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof boe)) {
            return false;
        }
        boe boeVar = (boe) obj;
        return this.a.equals(boeVar.a) && x44.r(this.b, boeVar.b) && this.c.equals(boeVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return qy1.i(kgh.r("Account(id=", this.a, ", name=", this.b, ", additionalProperties="), this.c, ")");
    }
}
