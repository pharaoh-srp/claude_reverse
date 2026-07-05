package io.sentry.android.core;

import io.sentry.t5;
import io.sentry.w6;
import io.sentry.y4;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends io.sentry.logger.c implements c0 {
    public m(w6 w6Var, y4 y4Var) {
        super(w6Var, y4Var);
        f0.I.c(this);
    }

    @Override // io.sentry.logger.c, io.sentry.logger.a
    public final void a(boolean z) {
        f0.I.f(this);
        super.a(z);
    }

    @Override // io.sentry.android.core.c0
    public final void i() {
    }

    @Override // io.sentry.android.core.c0
    public final void x() {
        w6 w6Var = this.E;
        try {
            w6Var.getExecutorService().submit(new l(0, this));
        } catch (Throwable th) {
            w6Var.getLogger().b(t5.ERROR, th, "Failed to submit log flush in onBackground()", new Object[0]);
        }
    }
}
