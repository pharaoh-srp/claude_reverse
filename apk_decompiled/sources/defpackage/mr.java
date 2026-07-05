package defpackage;

import java.time.Period;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class mr {
    public final Set a;
    public final bqh b;
    public final Period c;
    public final Set d;

    public mr(Set set, bqh bqhVar, Period period, Set set2) {
        bqhVar.getClass();
        period.getClass();
        set2.getClass();
        this.a = set;
        this.b = bqhVar;
        this.c = period;
        this.d = set2;
        if (bqhVar.a == null) {
            return;
        }
        sz6.p("Either use TimeRangeFilter with LocalDateTime or AggregateGroupByDurationRequest");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!mr.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        mr mrVar = (mr) obj;
        return x44.r(this.a, mrVar.a) && x44.r(this.b, mrVar.b) && x44.r(this.c, mrVar.c) && x44.r(this.d, mrVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public /* synthetic */ mr(Set set, bqh bqhVar, Period period) {
        this(set, bqhVar, period, um6.E);
    }
}
