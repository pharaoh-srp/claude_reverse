package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class grg {
    public final LinkedHashMap a;

    public grg(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof grg) && this.a.equals(((grg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Plurals(items=" + this.a + ")";
    }
}
