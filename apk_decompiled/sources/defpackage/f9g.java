package defpackage;

import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class f9g implements sa9 {
    public static final sch i = new sch(0.0d);
    public static final sch j = new sch(100.0d);
    public static final vr k;
    public static final vr l;
    public static final vr m;
    public static final Map n;
    public final Instant a;
    public final ZoneOffset b;
    public final Instant c;
    public final ZoneOffset d;
    public final ijb e;
    public final List f;
    public final sch g;
    public final int h;

    static {
        tch tchVar = xch.F;
        k = pok.g("SkinTemperature", nr.AVERAGE, "temperatureDelta", new b2g(1, tchVar, tch.class, "celsius", "celsius(D)Landroidx/health/connect/client/units/TemperatureDelta;", 0, 2));
        int i2 = 0;
        int i3 = 1;
        l = pok.g("SkinTemperature", nr.MINIMUM, "temperatureDelta", new b2g(i3, tchVar, tch.class, "celsius", "celsius(D)Landroidx/health/connect/client/units/TemperatureDelta;", i2, 4));
        m = pok.g("SkinTemperature", nr.MAXIMUM, "temperatureDelta", new b2g(i3, tchVar, tch.class, "celsius", "celsius(D)Landroidx/health/connect/client/units/TemperatureDelta;", i2, 3));
        Map mapH0 = sta.h0(new cpc("finger", 1), new cpc("toe", 2), new cpc("wrist", 3));
        n = mapH0;
        quj.n(mapH0);
    }

    public f9g(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, ijb ijbVar, List list, sch schVar, int i2) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = instant2;
        this.d = zoneOffset2;
        this.e = ijbVar;
        this.f = list;
        this.g = schVar;
        this.h = i2;
        if (!instant.isBefore(instant2)) {
            sz6.p("startTime must be before endTime.");
            throw null;
        }
        if (schVar != null) {
            quj.l(schVar, i, "temperature");
            quj.m(schVar, j, "temperature");
        }
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            pmf.d();
            throw null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            Instant instant3 = ((e9g) next).a;
            do {
                Object next2 = it.next();
                Instant instant4 = ((e9g) next2).a;
                if (instant3.compareTo(instant4) > 0) {
                    next = next2;
                    instant3 = instant4;
                }
            } while (it.hasNext());
        }
        if (((e9g) next).a.isBefore(this.a)) {
            sz6.p("deltas can not be out of parent time range.");
            throw null;
        }
        Iterator it2 = this.f.iterator();
        if (!it2.hasNext()) {
            pmf.d();
            throw null;
        }
        Object next3 = it2.next();
        if (it2.hasNext()) {
            Instant instant5 = ((e9g) next3).a;
            do {
                Object next4 = it2.next();
                Instant instant6 = ((e9g) next4).a;
                if (instant5.compareTo(instant6) < 0) {
                    next3 = next4;
                    instant5 = instant6;
                }
            } while (it2.hasNext());
        }
        if (((e9g) next3).a.isBefore(this.c)) {
            return;
        }
        sz6.p("deltas can not be out of parent time range.");
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
        if (!(obj instanceof f9g)) {
            return false;
        }
        f9g f9gVar = (f9g) obj;
        return this.a.equals(f9gVar.a) && this.c.equals(f9gVar.c) && x44.r(this.b, f9gVar.b) && x44.r(this.d, f9gVar.d) && x44.r(this.g, f9gVar.g) && this.h == f9gVar.h && this.f.equals(f9gVar.f) && this.e.equals(f9gVar.e);
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
        int i2 = ebh.i(this.c, this.a.hashCode() * 31, 31);
        ZoneOffset zoneOffset = this.b;
        int iHashCode = (i2 + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31;
        ZoneOffset zoneOffset2 = this.d;
        int iHashCode2 = (iHashCode + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31;
        sch schVar = this.g;
        return this.e.hashCode() + kgh.m(vb7.c(this.h, (iHashCode2 + (schVar != null ? schVar.hashCode() : 0)) * 31, 31), 31, this.f);
    }

    @Override // defpackage.y7e
    public final ijb m() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SkinTemperatureRecord(startTime=");
        sb.append(this.a);
        sb.append(", startZoneOffset=");
        sb.append(this.b);
        sb.append(", endTime=");
        sb.append(this.c);
        sb.append(", endZoneOffset=");
        sb.append(this.d);
        sb.append(", deltas=");
        sb.append(this.f);
        sb.append(", baseline=");
        sb.append(this.g);
        sb.append(", measurementLocation=");
        sb.append(this.h);
        sb.append(", metadata=");
        return ebh.q(sb, this.e, ')');
    }
}
