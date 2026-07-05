package defpackage;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes3.dex */
public final class x86 implements y86 {
    public final ScheduledFuture E;

    public x86(ScheduledFuture scheduledFuture) {
        this.E = scheduledFuture;
    }

    @Override // defpackage.y86
    public final void a() {
        this.E.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.E + ']';
    }
}
