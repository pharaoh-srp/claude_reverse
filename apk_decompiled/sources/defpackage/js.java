package defpackage;

import java.time.Instant;

/* JADX INFO: loaded from: classes2.dex */
public final class js {
    public final is a;
    public final Instant b;

    public js(is isVar, Instant instant) {
        this.a = isVar;
        this.b = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof js)) {
            return false;
        }
        js jsVar = (js) obj;
        return this.a.equals(jsVar.a) && this.b.equals(jsVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AggregationResultGroupedByDurationWithMinTime(aggregationResultGroupedByDuration=" + this.a + ", minTime=" + this.b + ')';
    }
}
