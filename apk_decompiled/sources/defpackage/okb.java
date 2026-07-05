package defpackage;

import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class okb implements sa9 {
    public static final vr i = new vr(qr.F, "MindfulnessSession", nr.DURATION, null);
    public static final Map j;
    public final Instant a;
    public final ZoneOffset b;
    public final Instant c;
    public final ZoneOffset d;
    public final ijb e;
    public final int f;
    public final String g;
    public final String h;

    static {
        Map mapH0 = sta.h0(new cpc("breathing", 2), new cpc("meditation", 1), new cpc("movement", 4), new cpc("music", 3), new cpc("unguided", 5), new cpc("unknown", 0));
        j = mapH0;
        quj.n(mapH0);
    }

    public okb(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, ijb ijbVar, int i2, String str, String str2) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = instant2;
        this.d = zoneOffset2;
        this.e = ijbVar;
        this.f = i2;
        this.g = str;
        this.h = str2;
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
        if (!(obj instanceof okb)) {
            return false;
        }
        okb okbVar = (okb) obj;
        return this.f == okbVar.f && x44.r(this.g, okbVar.g) && x44.r(this.h, okbVar.h) && this.a.equals(okbVar.a) && x44.r(this.b, okbVar.b) && this.c.equals(okbVar.c) && x44.r(this.d, okbVar.d) && this.e.equals(okbVar.e);
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
        int iHashCode = Integer.hashCode(this.f) * 31;
        String str = this.g;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.h;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        ZoneOffset zoneOffset = this.b;
        int i2 = ebh.i(this.c, (iHashCode3 + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.d;
        return this.e.hashCode() + ((i2 + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31);
    }

    @Override // defpackage.y7e
    public final ijb m() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MindfulnessSessionRecord(startTime=");
        sb.append(this.a);
        sb.append(", startZoneOffset=");
        sb.append(this.b);
        sb.append(", endTime=");
        sb.append(this.c);
        sb.append(", endZoneOffset=");
        sb.append(this.d);
        sb.append(", mindfulnessSessionType=");
        sb.append(this.f);
        sb.append(", title=");
        sb.append(this.g);
        sb.append(", notes=");
        sb.append(this.h);
        sb.append(", metadata=");
        return ebh.q(sb, this.e, ')');
    }
}
