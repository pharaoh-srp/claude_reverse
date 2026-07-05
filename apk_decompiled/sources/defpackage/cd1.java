package defpackage;

import java.time.Instant;
import java.time.ZoneOffset;

/* JADX INFO: loaded from: classes2.dex */
public final class cd1 implements i69 {
    public static final sch f = new sch(0.0d);
    public static final sch g = new sch(100.0d);
    public final Instant a;
    public final ZoneOffset b;
    public final ijb c;
    public final sch d;
    public final int e;

    public cd1(Instant instant, ZoneOffset zoneOffset, ijb ijbVar, sch schVar, int i) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = ijbVar;
        this.d = schVar;
        this.e = i;
        quj.l(schVar, f, "temperature");
        quj.m(schVar, g, "temperature");
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
        if (!(obj instanceof cd1)) {
            return false;
        }
        cd1 cd1Var = (cd1) obj;
        return this.d.equals(cd1Var.d) && this.e == cd1Var.e && this.a.equals(cd1Var.a) && x44.r(this.b, cd1Var.b) && this.c.equals(cd1Var.c);
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
        StringBuilder sb = new StringBuilder("BasalBodyTemperatureRecord(time=");
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
