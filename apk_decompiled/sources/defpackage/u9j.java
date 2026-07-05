package defpackage;

import android.os.Build;
import java.time.Instant;
import java.time.ZoneOffset;

/* JADX INFO: loaded from: classes2.dex */
public final class u9j implements sa9 {
    public static final vr g = new vr(new or(), "WheelchairPushes", nr.TOTAL, "count");
    public final Instant a;
    public final ZoneOffset b;
    public final Instant c;
    public final ZoneOffset d;
    public final long e;
    public final ijb f;

    public u9j(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, long j, ijb ijbVar) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = instant2;
        this.d = zoneOffset2;
        this.e = j;
        this.f = ijbVar;
        if (!instant.isBefore(instant2)) {
            sz6.p("startTime must be before endTime.");
            throw null;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            h0c.c(this);
        } else if (j >= 0) {
            quj.m(Long.valueOf(j), 1000000L, "count");
        } else {
            mr9.q("count".concat(" must not be negative"));
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
        if (!(obj instanceof u9j)) {
            return false;
        }
        u9j u9jVar = (u9j) obj;
        return this.e == u9jVar.e && this.a.equals(u9jVar.a) && x44.r(this.b, u9jVar.b) && this.c.equals(u9jVar.c) && x44.r(this.d, u9jVar.d) && this.f.equals(u9jVar.f);
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
        int iHashCode = Long.hashCode(this.e) * 31;
        ZoneOffset zoneOffset = this.b;
        int i = ebh.i(this.c, (iHashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.d;
        return this.f.hashCode() + ((i + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31);
    }

    @Override // defpackage.y7e
    public final ijb m() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WheelchairPushesRecord(startTime=");
        sb.append(this.a);
        sb.append(", startZoneOffset=");
        sb.append(this.b);
        sb.append(", endTime=");
        sb.append(this.c);
        sb.append(", endZoneOffset=");
        sb.append(this.d);
        sb.append(", count=");
        sb.append(this.e);
        sb.append(", metadata=");
        return ebh.q(sb, this.f, ')');
    }
}
