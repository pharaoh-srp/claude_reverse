package defpackage;

import java.time.Instant;
import java.time.ZoneOffset;

/* JADX INFO: loaded from: classes2.dex */
public final class kt1 implements i69 {
    public final Instant a;
    public final ZoneOffset b;
    public final ijb c;
    public final sch d;
    public final int e;

    public kt1(Instant instant, ZoneOffset zoneOffset, ijb ijbVar, sch schVar, int i) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = ijbVar;
        this.d = schVar;
        this.e = i;
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
        if (!(obj instanceof kt1)) {
            return false;
        }
        kt1 kt1Var = (kt1) obj;
        return this.d.equals(kt1Var.d) && this.e == kt1Var.e && this.a.equals(kt1Var.a) && x44.r(this.b, kt1Var.b) && this.c.equals(kt1Var.c);
    }

    public final int hashCode() {
        int i = ebh.i(this.a, ((this.d.hashCode() * 31) + this.e) * 31, 31);
        ZoneOffset zoneOffset = this.b;
        return this.c.hashCode() + ((i + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }

    @Override // defpackage.y7e
    public final ijb m() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BodyTemperatureRecord(time=");
        sb.append(this.a);
        sb.append(", zoneOffset=");
        sb.append(this.b);
        sb.append(", temperature=");
        sb.append(this.d);
        sb.append(", measurementLocation=");
        sb.append(this.e);
        sb.append(", metadata=");
        return ebh.q(sb, this.c, ')');
    }
}
