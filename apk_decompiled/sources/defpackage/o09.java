package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class o09 {
    public final LinkedHashSet a;
    public final boolean b;

    public o09(LinkedHashSet linkedHashSet, boolean z) {
        this.a = linkedHashSet;
        this.b = z;
    }

    public final boolean a() {
        return this.b;
    }

    public final Set b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o09)) {
            return false;
        }
        o09 o09Var = (o09) obj;
        return this.a.equals(o09Var.a) && this.b == o09Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "IncompleteTurnCleanup(uuidsToRemove=" + this.a + ", restoreAbandoned=" + this.b + ")";
    }
}
