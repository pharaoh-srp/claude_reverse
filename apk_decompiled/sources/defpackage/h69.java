package defpackage;

import java.time.Instant;

/* JADX INFO: loaded from: classes2.dex */
public final class h69 implements aqh {
    public final Instant a;
    public final Instant b;

    public h69(Instant instant, Instant instant2) {
        this.a = instant;
        this.b = instant2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h69)) {
            return false;
        }
        h69 h69Var = (h69) obj;
        return this.a.equals(h69Var.a) && this.b.equals(h69Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InstantTimeRange(startTime=" + this.a + ", endTime=" + this.b + ')';
    }
}
