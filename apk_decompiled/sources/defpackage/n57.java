package defpackage;

import java.time.Duration;

/* JADX INFO: loaded from: classes2.dex */
public final class n57 extends hjk {
    public final f3a c;
    public final Duration d;

    public n57(f3a f3aVar, Duration duration) {
        this.c = f3aVar;
        this.d = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n57)) {
            return false;
        }
        n57 n57Var = (n57) obj;
        return this.c.equals(n57Var.c) && this.d.equals(n57Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "DistanceAndDurationGoal(distance=" + this.c + ", duration=" + this.d + ')';
    }
}
