package defpackage;

import android.os.Build;
import java.time.Instant;
import java.time.ZoneOffset;

/* JADX INFO: loaded from: classes2.dex */
public final class ong implements sa9 {
    public static final vr g = new vr(new or(), "Steps", nr.TOTAL, "count");
    public final Instant a;
    public final ZoneOffset b;
    public final Instant c;
    public final ZoneOffset d;
    public final long e;
    public final ijb f;

    public ong(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, long j, ijb ijbVar) {
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
        } else {
            quj.l(Long.valueOf(j), 1L, "count");
            quj.m(Long.valueOf(j), 1000000L, "count");
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
        if (!(obj instanceof ong)) {
            return false;
        }
        ong ongVar = (ong) obj;
        return this.e == ongVar.e && this.a.equals(ongVar.a) && x44.r(this.b, ongVar.b) && this.c.equals(ongVar.c) && x44.r(this.d, ongVar.d) && this.f.equals(ongVar.f);
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
        StringBuilder sb = new StringBuilder("StepsRecord(startTime=");
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
