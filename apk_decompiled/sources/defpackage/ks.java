package defpackage;

import java.time.LocalDateTime;

/* JADX INFO: loaded from: classes2.dex */
public final class ks {
    public final hs a;
    public final LocalDateTime b;
    public final LocalDateTime c;

    public ks(hs hsVar, LocalDateTime localDateTime, LocalDateTime localDateTime2, boolean z) {
        hsVar.getClass();
        localDateTime.getClass();
        localDateTime2.getClass();
        this.a = hsVar;
        this.b = localDateTime;
        this.c = localDateTime2;
        if (z || localDateTime.isBefore(localDateTime2)) {
            return;
        }
        sz6.p("start time must be before end time");
        throw null;
    }

    public final LocalDateTime a() {
        return this.c;
    }

    public final hs b() {
        return this.a;
    }

    public final LocalDateTime c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ks.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        ks ksVar = (ks) obj;
        return x44.r(this.a, ksVar.a) && x44.r(this.b, ksVar.b) && x44.r(this.c, ksVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AggregationResultGroupedByPeriod(result=" + this.a + ", startTime=" + this.b + ", endTime=" + this.c + ')';
    }
}
