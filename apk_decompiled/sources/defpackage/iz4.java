package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class iz4 {
    public final List a;
    public final List b;

    public iz4(List list, List list2) {
        list2.getClass();
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iz4)) {
            return false;
        }
        iz4 iz4Var = (iz4) obj;
        return this.a.equals(iz4Var.a) && x44.r(this.b, iz4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ConwaySegmentResult(segments=" + this.a + ", actions=" + this.b + ")";
    }
}
