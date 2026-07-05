package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class n29 {
    public final List a;
    public final nf0 b;
    public final List c;

    public n29(List list, nf0 nf0Var, List list2) {
        list.getClass();
        list2.getClass();
        this.a = list;
        this.b = nf0Var;
        this.c = list2;
    }

    public final nf0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n29)) {
            return false;
        }
        n29 n29Var = (n29) obj;
        return x44.r(this.a, n29Var.a) && x44.r(this.b, n29Var.b) && x44.r(this.c, n29Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        nf0 nf0Var = this.b;
        return this.c.hashCode() + ((iHashCode + (nf0Var == null ? 0 : nf0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InitialEventsResult(events=");
        sb.append(this.a);
        sb.append(", partialLoadError=");
        sb.append(this.b);
        sb.append(", stateScanEvents=");
        return gid.q(sb, this.c, ")");
    }

    public /* synthetic */ n29(List list, nf0 nf0Var) {
        this(list, nf0Var, list);
    }
}
