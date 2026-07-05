package defpackage;

import java.time.Instant;
import java.time.ZoneOffset;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mad implements jof {
    public static final jad g;
    public static final vr h;
    public static final vr i;
    public static final vr j;
    public final Instant a;
    public final ZoneOffset b;
    public final Instant c;
    public final ZoneOffset d;
    public final List e;
    public final ijb f;

    static {
        fad fadVar = jad.G;
        g = fad.a(100000.0d);
        int i2 = 0;
        h = pok.g("PowerSeries", nr.AVERAGE, "power", new pac(1, fadVar, fad.class, "watts", "watts(D)Landroidx/health/connect/client/units/Power;", i2, 14));
        i = pok.g("PowerSeries", nr.MINIMUM, "power", new pac(1, fadVar, fad.class, "watts", "watts(D)Landroidx/health/connect/client/units/Power;", i2, 16));
        j = pok.g("PowerSeries", nr.MAXIMUM, "power", new pac(1, fadVar, fad.class, "watts", "watts(D)Landroidx/health/connect/client/units/Power;", i2, 15));
    }

    public mad(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, List list, ijb ijbVar) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = instant2;
        this.d = zoneOffset2;
        this.e = list;
        this.f = ijbVar;
        if (instant.isAfter(instant2)) {
            sz6.p("startTime must not be after endTime.");
            throw null;
        }
    }

    @Override // defpackage.sa9
    public final Instant b() {
        return this.a;
    }

    @Override // defpackage.jof
    public final List d() {
        return this.e;
    }

    @Override // defpackage.sa9
    public final Instant e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mad)) {
            return false;
        }
        mad madVar = (mad) obj;
        return this.a.equals(madVar.a) && x44.r(this.b, madVar.b) && this.c.equals(madVar.c) && x44.r(this.d, madVar.d) && this.e.equals(madVar.e) && this.f.equals(madVar.f);
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
        int iHashCode = this.a.hashCode() * 31;
        ZoneOffset zoneOffset = this.b;
        int i2 = ebh.i(this.c, (iHashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.d;
        return this.f.hashCode() + kgh.m((i2 + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31, 31, this.e);
    }

    @Override // defpackage.y7e
    public final ijb m() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PowerRecord(startTime=");
        sb.append(this.a);
        sb.append(", startZoneOffset=");
        sb.append(this.b);
        sb.append(", endTime=");
        sb.append(this.c);
        sb.append(", endZoneOffset=");
        sb.append(this.d);
        sb.append(", samples=");
        sb.append(this.e);
        sb.append(", metadata=");
        return ebh.q(sb, this.f, ')');
    }
}
