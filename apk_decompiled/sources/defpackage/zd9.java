package defpackage;

import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class zd9 {
    public final q9c a;
    public final Collection b;
    public final boolean c;

    public zd9(q9c q9cVar, Collection collection) {
        this(q9cVar, collection, q9cVar.a == p9c.G);
    }

    public static zd9 a(zd9 zd9Var, q9c q9cVar) {
        Collection collection = zd9Var.b;
        boolean z = zd9Var.c;
        collection.getClass();
        return new zd9(q9cVar, collection, z);
    }

    public final q9c b() {
        return this.a;
    }

    public final Collection c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zd9)) {
            return false;
        }
        zd9 zd9Var = (zd9) obj;
        return x44.r(this.a, zd9Var.a) && x44.r(this.b, zd9Var.b) && this.c == zd9Var.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        boolean z = this.c;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return iHashCode + r2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JavaDefaultQualifiers(nullabilityQualifier=");
        sb.append(this.a);
        sb.append(", qualifierApplicabilityTypes=");
        sb.append(this.b);
        sb.append(", definitelyNotNull=");
        return y6a.p(sb, this.c, ')');
    }

    public zd9(q9c q9cVar, Collection collection, boolean z) {
        collection.getClass();
        this.a = q9cVar;
        this.b = collection;
        this.c = z;
    }
}
