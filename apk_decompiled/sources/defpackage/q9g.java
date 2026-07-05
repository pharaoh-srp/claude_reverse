package defpackage;

import java.time.Instant;

/* JADX INFO: loaded from: classes2.dex */
public final class q9g {
    public final Instant a;
    public final Instant b;
    public final int c;

    public q9g(Instant instant, Instant instant2, int i) {
        this.a = instant;
        this.b = instant2;
        this.c = i;
        if (instant.isBefore(instant2)) {
            return;
        }
        sz6.p("startTime must be before endTime.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9g)) {
            return false;
        }
        q9g q9gVar = (q9g) obj;
        return this.c == q9gVar.c && this.a.equals(q9gVar.a) && this.b.equals(q9gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ebh.i(this.a, Integer.hashCode(this.c) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stage(startTime=");
        sb.append(this.a);
        sb.append(", endTime=");
        sb.append(this.b);
        sb.append(", stage=");
        return vb7.r(sb, this.c, ')');
    }
}
