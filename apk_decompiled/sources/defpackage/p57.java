package defpackage;

import java.time.Duration;

/* JADX INFO: loaded from: classes2.dex */
public final class p57 extends hjk {
    public final Duration c;

    public p57(Duration duration) {
        this.c = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p57)) {
            return false;
        }
        return this.c.equals(((p57) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "DurationGoal(duration=" + this.c + ')';
    }
}
