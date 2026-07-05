package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class cx5 extends z3 implements ScheduledFuture {
    public final ScheduledFuture L;

    public cx5(bx5 bx5Var) {
        this.L = bx5Var.a(new ax5(0, this));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.L.compareTo(delayed);
    }

    @Override // defpackage.z3
    public final void d() {
        ScheduledFuture scheduledFuture = this.L;
        Object obj = this.E;
        scheduledFuture.cancel((obj instanceof u3) && ((u3) obj).a);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.L.getDelay(timeUnit);
    }
}
