package defpackage;

import java.time.Duration;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class lr {
    public final Set a;
    public final bqh b;
    public final Duration c;
    public final Set d;

    public lr(Set set, bqh bqhVar, Duration duration, Set set2) {
        bqhVar.getClass();
        duration.getClass();
        set2.getClass();
        this.a = set;
        this.b = bqhVar;
        this.c = duration;
        this.d = set2;
        if (duration.equals(Duration.ofMinutes(duration.toMinutes()))) {
            return;
        }
        sz6.p("Either set Duration with at least MINUTE units or use AggregateGroupByPeriodRequest");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!lr.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        lr lrVar = (lr) obj;
        return x44.r(this.a, lrVar.a) && x44.r(this.b, lrVar.b) && x44.r(this.c, lrVar.c) && x44.r(this.d, lrVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public /* synthetic */ lr(Set set, bqh bqhVar, Duration duration) {
        this(set, bqhVar, duration, um6.E);
    }
}
