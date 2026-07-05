package defpackage;

import java.time.Instant;
import java.time.ZoneOffset;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class r9g implements sa9 {
    public static final vr i = new vr(qr.F, "SleepSession", nr.DURATION, null);
    public static final Map j;
    public final Instant a;
    public final ZoneOffset b;
    public final Instant c;
    public final ZoneOffset d;
    public final ijb e;
    public final String f;
    public final String g;
    public final List h;

    static {
        Map mapH0 = sta.h0(new cpc("awake", 1), new cpc("sleeping", 2), new cpc("out_of_bed", 3), new cpc("light", 4), new cpc("deep", 5), new cpc("rem", 6), new cpc("awake_in_bed", 7), new cpc("unknown", 0));
        j = mapH0;
        Set<Map.Entry> setEntrySet = mapH0.entrySet();
        int iD0 = tta.d0(x44.y(setEntrySet, 10));
        if (iD0 < 16) {
            iD0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (String) entry.getKey());
        }
    }

    public r9g(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, ijb ijbVar, String str, String str2, List list) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = instant2;
        this.d = zoneOffset2;
        this.e = ijbVar;
        this.f = str;
        this.g = str2;
        this.h = list;
        if (!instant.isBefore(instant2)) {
            sz6.p("startTime must be before endTime.");
            throw null;
        }
        if (list.isEmpty()) {
            return;
        }
        List listI1 = w44.i1(list, new z31(15));
        int size = listI1.size() - 1;
        int i2 = 0;
        while (i2 < size) {
            Instant instant3 = ((q9g) listI1.get(i2)).b;
            i2++;
            if (instant3.isAfter(((q9g) listI1.get(i2)).a)) {
                sz6.p("Failed requirement.");
                throw null;
            }
        }
        if (((q9g) w44.L0(listI1)).a.isBefore(this.a)) {
            sz6.p("Failed requirement.");
            throw null;
        }
        if (((q9g) w44.U0(listI1)).b.isAfter(this.c)) {
            sz6.p("Failed requirement.");
            throw null;
        }
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
        if (!(obj instanceof r9g)) {
            return false;
        }
        r9g r9gVar = (r9g) obj;
        return x44.r(this.f, r9gVar.f) && x44.r(this.g, r9gVar.g) && this.h.equals(r9gVar.h) && this.a.equals(r9gVar.a) && x44.r(this.b, r9gVar.b) && this.c.equals(r9gVar.c) && x44.r(this.d, r9gVar.d) && this.e.equals(r9gVar.e);
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
        String str = this.f;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.g;
        int iM = kgh.m((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.h);
        ZoneOffset zoneOffset = this.b;
        int i2 = ebh.i(this.c, (iM + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.d;
        return this.e.hashCode() + ((i2 + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31);
    }

    @Override // defpackage.y7e
    public final ijb m() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SleepSessionRecord(startTime=");
        sb.append(this.a);
        sb.append(", startZoneOffset=");
        sb.append(this.b);
        sb.append(", endTime=");
        sb.append(this.c);
        sb.append(", endZoneOffset=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.f);
        sb.append(", notes=");
        sb.append(this.g);
        sb.append(", stages=");
        sb.append(this.h);
        sb.append(", metadata=");
        return ebh.q(sb, this.e, ')');
    }
}
