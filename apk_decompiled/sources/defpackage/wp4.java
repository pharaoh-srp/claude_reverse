package defpackage;

import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class wp4 extends AtomicBoolean implements OutcomeReceiver {
    public final ua2 E;

    public wp4(ua2 ua2Var) {
        super(false);
        this.E = ua2Var;
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.E.resumeWith(sf5.u(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.E.resumeWith(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
