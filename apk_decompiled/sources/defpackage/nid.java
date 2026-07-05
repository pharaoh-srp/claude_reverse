package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class nid {
    public final List a;
    public final List b;

    public nid(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nid)) {
            return false;
        }
        nid nidVar = (nid) obj;
        return this.a.equals(nidVar.a) && this.b.equals(nidVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "View(id=" + this.a + ", name=" + this.b + ")";
    }
}
