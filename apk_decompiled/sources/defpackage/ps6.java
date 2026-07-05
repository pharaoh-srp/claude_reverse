package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ps6 {
    public final Map a;

    public ps6(Map map) {
        this.a = map;
    }

    public static ps6 a(LinkedHashMap linkedHashMap) {
        return new ps6(linkedHashMap);
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
        return (obj instanceof ps6) && this.a.equals(((ps6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Context(additionalProperties=" + this.a + ")";
    }
}
