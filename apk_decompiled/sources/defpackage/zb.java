package defpackage;

import java.time.Instant;
import java.time.ZoneOffset;

/* JADX INFO: loaded from: classes2.dex */
public final class zb implements sa9 {
    public static final yn6 g;
    public static final vr h;
    public final Instant a;
    public final ZoneOffset b;
    public final Instant c;
    public final ZoneOffset d;
    public final yn6 e;
    public final ijb f;

    static {
        sn6 sn6Var = yn6.G;
        g = sn6.a(1000000.0d);
        h = new vr(new ur(new yb(1, yn6.G, sn6.class, "kilocalories", "kilocalories(D)Landroidx/health/connect/client/units/Energy;", 0, 0)), "ActiveCaloriesBurned", nr.TOTAL, "energy");
    }

    public zb(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, yn6 yn6Var, ijb ijbVar) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = instant2;
        this.d = zoneOffset2;
        this.e = yn6Var;
        this.f = ijbVar;
        quj.l(yn6Var, (yn6) sta.f0(yn6Var.F, yn6.H), "energy");
        quj.m(yn6Var, g, "energy");
        if (instant.isBefore(instant2)) {
            return;
        }
        sz6.p("startTime must be before endTime.");
        throw null;
    }

    @Override // defpackage.sa9
    public final Instant b() {
        return this.a;
    }

    @Override // defpackage.sa9
    public final Instant e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zb)) {
            return false;
        }
        zb zbVar = (zb) obj;
        return this.e.equals(zbVar.e) && this.a.equals(zbVar.a) && x44.r(this.b, zbVar.b) && this.c.equals(zbVar.c) && x44.r(this.d, zbVar.d) && this.f.equals(zbVar.f);
    }

    @Override // defpackage.sa9
    public final ZoneOffset f() {
        return this.d;
    }

    @Override // defpackage.sa9
    public final ZoneOffset g() {
        return this.b;
    }

    public final int hashCode() {
        int i = ebh.i(this.a, this.e.hashCode() * 31, 31);
        ZoneOffset zoneOffset = this.b;
        int i2 = ebh.i(this.c, (i + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.d;
        return this.f.hashCode() + ((i2 + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31);
    }

    @Override // defpackage.y7e
    public final ijb m() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActiveCaloriesBurnedRecord(startTime=");
        sb.append(this.a);
        sb.append(", startZoneOffset=");
        sb.append(this.b);
        sb.append(", endTime=");
        sb.append(this.c);
        sb.append(", endZoneOffset=");
        sb.append(this.d);
        sb.append(", energy=");
        sb.append(this.e);
        sb.append(", metadata=");
        return ebh.q(sb, this.f, ')');
    }
}
