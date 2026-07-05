package defpackage;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes3.dex */
public final class na2 implements pa2 {
    public final ScheduledFuture E;

    public na2(ScheduledFuture scheduledFuture) {
        this.E = scheduledFuture;
    }

    @Override // defpackage.pa2
    public final void b(Throwable th) {
        this.E.cancel(false);
    }

    public final String toString() {
        return "CancelFutureOnCancel[" + this.E + ']';
    }
}
