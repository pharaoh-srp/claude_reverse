package defpackage;

import java.time.Instant;
import java.time.LocalDateTime;

/* JADX INFO: loaded from: classes2.dex */
public final class bqh {
    public final Instant a;
    public final LocalDateTime b;
    public final LocalDateTime c;

    public bqh(Instant instant, LocalDateTime localDateTime, LocalDateTime localDateTime2) {
        this.a = instant;
        this.b = localDateTime;
        this.c = localDateTime2;
    }

    public final LocalDateTime a() {
        return this.c;
    }

    public final LocalDateTime b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqh)) {
            return false;
        }
        bqh bqhVar = (bqh) obj;
        return x44.r(this.a, bqhVar.a) && x44.r(this.b, bqhVar.b) && this.c.equals(bqhVar.c);
    }

    public final int hashCode() {
        Instant instant = this.a;
        int iHashCode = (instant != null ? instant.hashCode() : 0) * 961;
        LocalDateTime localDateTime = this.b;
        return this.c.hashCode() + ((iHashCode + (localDateTime != null ? localDateTime.hashCode() : 0)) * 31);
    }
}
