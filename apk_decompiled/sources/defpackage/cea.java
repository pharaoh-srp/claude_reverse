package defpackage;

import java.time.LocalDateTime;

/* JADX INFO: loaded from: classes2.dex */
public final class cea implements aqh {
    public final LocalDateTime a;
    public final LocalDateTime b;

    public cea(LocalDateTime localDateTime, LocalDateTime localDateTime2) {
        localDateTime.getClass();
        this.a = localDateTime;
        this.b = localDateTime2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cea)) {
            return false;
        }
        cea ceaVar = (cea) obj;
        return x44.r(this.a, ceaVar.a) && this.b.equals(ceaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LocalTimeRange(startTime=" + this.a + ", endTime=" + this.b + ')';
    }
}
