package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hid {
    public final hp1 a;
    public final List b;

    public hid(hp1 hp1Var, List list) {
        hp1Var.getClass();
        this.a = hp1Var;
        this.b = list;
    }

    public final hp1 a() {
        return this.a;
    }

    public final List b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hid)) {
            return false;
        }
        hid hidVar = (hid) obj;
        return x44.r(this.a, hidVar.a) && x44.r(this.b, hidVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        List list = this.b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductDetailsResult(billingResult=");
        sb.append(this.a);
        sb.append(", productDetailsList=");
        return gid.q(sb, this.b, ")");
    }
}
