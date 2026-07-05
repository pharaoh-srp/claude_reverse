package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d98 {
    public final hp1 a;
    public final List b;

    public d98(hp1 hp1Var, List list) {
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
        if (!(obj instanceof d98)) {
            return false;
        }
        d98 d98Var = (d98) obj;
        return x44.r(this.a, d98Var.a) && x44.r(this.b, d98Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        List list = this.b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "PurchasesUpdatedHolder(billingResult=" + this.a + ", purchases=" + this.b + ")";
    }
}
