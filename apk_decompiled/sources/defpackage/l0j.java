package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class l0j {
    public final LinkedHashMap a;

    public l0j(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    public static l0j a(LinkedHashMap linkedHashMap) {
        return new l0j(linkedHashMap);
    }

    public final Map b() {
        return this.a;
    }

    public final qh9 c() {
        qh9 qh9Var = new qh9();
        for (Map.Entry entry : this.a.entrySet()) {
            qh9Var.o((String) entry.getKey(), vz8.M(entry.getValue()));
        }
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0j) && this.a.equals(((l0j) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Context(additionalProperties=" + this.a + ")";
    }
}
