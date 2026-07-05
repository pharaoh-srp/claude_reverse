package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class gt6 {
    public static final String[] e = {"test_id", "result_id", "injected"};
    public final String a;
    public final String b;
    public final Boolean c;
    public final LinkedHashMap d;

    public gt6(String str, String str2, Boolean bool, LinkedHashMap linkedHashMap) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = bool;
        this.d = linkedHashMap;
    }

    public final qh9 a() {
        qh9 qh9Var = new qh9();
        qh9Var.r("test_id", this.a);
        qh9Var.r("result_id", this.b);
        Boolean bool = this.c;
        if (bool != null) {
            qh9Var.q("injected", bool);
        }
        for (Map.Entry entry : this.d.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (!mp0.o0(str, e)) {
                qh9Var.o(str, vz8.M(value));
            }
        }
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gt6)) {
            return false;
        }
        gt6 gt6Var = (gt6) obj;
        return x44.r(this.a, gt6Var.a) && x44.r(this.b, gt6Var.b) && x44.r(this.c, gt6Var.c) && x44.r(this.d, gt6Var.d);
    }

    public final int hashCode() {
        int iL = kgh.l(this.a.hashCode() * 31, 31, this.b);
        Boolean bool = this.c;
        return this.d.hashCode() + ((iL + (bool == null ? 0 : bool.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("Synthetics(testId=", this.a, ", resultId=", this.b, ", injected=");
        sbR.append(this.c);
        sbR.append(", additionalProperties=");
        sbR.append(this.d);
        sbR.append(")");
        return sbR.toString();
    }

    public /* synthetic */ gt6(String str, String str2) {
        this(str, str2, null, new LinkedHashMap());
    }
}
