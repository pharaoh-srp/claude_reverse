package defpackage;

import java.time.Instant;
import java.time.ZoneOffset;

/* JADX INFO: loaded from: classes2.dex */
public final class j89 implements i69 {
    public final Instant a;
    public final ZoneOffset b;
    public final ijb c;

    public j89(Instant instant, ZoneOffset zoneOffset, ijb ijbVar) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = ijbVar;
    }

    @Override // defpackage.i69
    public final Instant a() {
        return this.a;
    }

    @Override // defpackage.i69
    public final ZoneOffset c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j89)) {
            return false;
        }
        j89 j89Var = (j89) obj;
        return this.a.equals(j89Var.a) && x44.r(this.b, j89Var.b) && this.c.equals(j89Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ZoneOffset zoneOffset = this.b;
        return this.c.hashCode() + ((iHashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }

    @Override // defpackage.y7e
    public final ijb m() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntermenstrualBleedingRecord(time=");
        sb.append(this.a);
        sb.append(", zoneOffset=");
        sb.append(this.b);
        sb.append(", metadata=");
        return ebh.q(sb, this.c, ')');
    }
}
