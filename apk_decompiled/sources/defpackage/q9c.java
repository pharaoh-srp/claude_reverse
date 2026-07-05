package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class q9c {
    public final p9c a;
    public final boolean b;

    public q9c(p9c p9cVar) {
        this.a = p9cVar;
        this.b = false;
    }

    public static q9c a(q9c q9cVar, p9c p9cVar, boolean z, int i) {
        if ((i & 1) != 0) {
            p9cVar = q9cVar.a;
        }
        if ((i & 2) != 0) {
            z = q9cVar.b;
        }
        q9cVar.getClass();
        p9cVar.getClass();
        return new q9c(p9cVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9c)) {
            return false;
        }
        q9c q9cVar = (q9c) obj;
        return this.a == q9cVar.a && this.b == q9cVar.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NullabilityQualifierWithMigrationStatus(qualifier=");
        sb.append(this.a);
        sb.append(", isForWarningOnly=");
        return y6a.p(sb, this.b, ')');
    }

    public q9c(p9c p9cVar, boolean z) {
        this.a = p9cVar;
        this.b = z;
    }
}
