package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c0j {
    public static final String[] d = {"test_id", "result_id", "injected"};
    public final String a;
    public final String b;
    public final Map c;

    public c0j(String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0j)) {
            return false;
        }
        c0j c0jVar = (c0j) obj;
        return x44.r(this.a, c0jVar.a) && x44.r(this.b, c0jVar.b) && x44.r(this.c, c0jVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kgh.l(this.a.hashCode() * 31, 961, this.b);
    }

    public final String toString() {
        return qy1.i(kgh.r("Synthetics(testId=", this.a, ", resultId=", this.b, ", injected=null, additionalProperties="), this.c, ")");
    }
}
