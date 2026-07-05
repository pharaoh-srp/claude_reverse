package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ucg {
    public final n6e a;
    public final List b;

    public ucg(n6e n6eVar, List list) {
        n6eVar.getClass();
        list.getClass();
        this.a = n6eVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ucg)) {
            return false;
        }
        ucg ucgVar = (ucg) obj;
        return this.a == ucgVar.a && x44.r(this.b, ucgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SnapshotGroup(section=" + this.a + ", snapshots=" + this.b + ")";
    }
}
