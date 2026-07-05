package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ia9 extends ja9 {
    public final String a;
    public final LinkedHashMap b;

    public ia9(String str, LinkedHashMap linkedHashMap) {
        str.getClass();
        this.a = str;
        this.b = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia9)) {
            return false;
        }
        ia9 ia9Var = (ia9) obj;
        return x44.r(this.a, ia9Var.a) && this.b.equals(ia9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Metric(message=" + this.a + ", additionalProperties=" + this.b + ")";
    }
}
