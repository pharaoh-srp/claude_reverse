package io.sentry.android.replay;

import defpackage.ts9;
import defpackage.x44;
import defpackage.zy7;
import io.sentry.p0;
import io.sentry.w6;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class p extends ts9 implements zy7 {
    public final /* synthetic */ ReplayIntegration F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ReplayIntegration replayIntegration) {
        super(0);
        this.F = replayIntegration;
    }

    @Override // defpackage.zy7
    public final Object a() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new p0(1));
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.getClass();
        w6 w6Var = this.F.H;
        if (w6Var != null) {
            return new io.sentry.android.replay.util.d(scheduledExecutorServiceNewSingleThreadScheduledExecutor, w6Var);
        }
        x44.o0("options");
        throw null;
    }
}
