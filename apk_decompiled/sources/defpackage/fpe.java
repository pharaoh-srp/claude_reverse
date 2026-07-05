package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class fpe {
    public final LinkedHashMap a;

    public fpe(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    public final qh9 a() {
        qh9 qh9Var = new qh9();
        for (Map.Entry entry : this.a.entrySet()) {
            qh9Var.r((String) entry.getKey(), (String) entry.getValue());
        }
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fpe) && this.a.equals(((fpe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RequestHeaders(additionalProperties=" + this.a + ")";
    }
}
