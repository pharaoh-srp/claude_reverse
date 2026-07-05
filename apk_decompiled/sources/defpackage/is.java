package defpackage;

import java.time.Instant;
import java.time.ZoneOffset;

/* JADX INFO: loaded from: classes2.dex */
public final class is {
    public final hs a;
    public final Instant b;
    public final Instant c;
    public final ZoneOffset d;

    public is(hs hsVar, Instant instant, Instant instant2, ZoneOffset zoneOffset, boolean z) {
        hsVar.getClass();
        instant.getClass();
        instant2.getClass();
        zoneOffset.getClass();
        this.a = hsVar;
        this.b = instant;
        this.c = instant2;
        this.d = zoneOffset;
        if (z || instant.isBefore(instant2)) {
            return;
        }
        sz6.p("start time must be before end time");
        throw null;
    }

    public final Instant a() {
        return this.c;
    }

    public final hs b() {
        return this.a;
    }

    public final Instant c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!is.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        is isVar = (is) obj;
        return x44.r(this.a, isVar.a) && x44.r(this.b, isVar.b) && x44.r(this.c, isVar.c) && x44.r(this.d, isVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ebh.i(this.c, ebh.i(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "AggregationResultGroupedByDuration(result=" + this.a + ", startTime=" + this.b + ", endTime=" + this.c + ", zoneOffset=" + this.d + ')';
    }
}
