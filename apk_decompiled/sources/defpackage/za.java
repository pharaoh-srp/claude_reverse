package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class za {
    public static final String[] e = {"test_id", "result_id", "injected"};
    public final String a;
    public final String b;
    public final Boolean c;
    public final LinkedHashMap d;

    public za(String str, String str2, Boolean bool, LinkedHashMap linkedHashMap) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = bool;
        this.d = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za)) {
            return false;
        }
        za zaVar = (za) obj;
        return x44.r(this.a, zaVar.a) && x44.r(this.b, zaVar.b) && x44.r(this.c, zaVar.c) && this.d.equals(zaVar.d);
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
}
