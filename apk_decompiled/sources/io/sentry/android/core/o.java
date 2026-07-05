package io.sentry.android.core;

import defpackage.rl;
import io.sentry.t5;
import io.sentry.w6;

/* JADX INFO: loaded from: classes.dex */
public final class o extends rl implements c0 {
    @Override // defpackage.rl, io.sentry.metrics.a
    public final void a(boolean z) {
        f0.I.f(this);
        super.a(z);
    }

    @Override // io.sentry.android.core.c0
    public final void i() {
    }

    @Override // io.sentry.android.core.c0
    public final void x() {
        w6 w6Var = (w6) this.F;
        try {
            w6Var.getExecutorService().submit(new l(1, this));
        } catch (Throwable th) {
            w6Var.getLogger().b(t5.ERROR, th, "Failed to submit metrics flush in onBackground()", new Object[0]);
        }
    }
}
