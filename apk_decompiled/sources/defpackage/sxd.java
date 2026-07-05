package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class sxd {
    public final hp1 a;
    public final List b;

    public sxd(hp1 hp1Var, List list) {
        hp1Var.getClass();
        list.getClass();
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
        if (!(obj instanceof sxd)) {
            return false;
        }
        sxd sxdVar = (sxd) obj;
        return x44.r(this.a, sxdVar.a) && x44.r(this.b, sxdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PurchasesResult(billingResult=");
        sb.append(this.a);
        sb.append(", purchasesList=");
        return gid.q(sb, this.b, ")");
    }
}
