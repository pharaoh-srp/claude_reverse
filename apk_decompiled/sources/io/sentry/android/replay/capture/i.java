package io.sentry.android.replay.capture;

import io.sentry.d4;
import io.sentry.h1;
import io.sentry.n0;
import io.sentry.y6;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends k {
    public final y6 a;
    public final d4 b;

    public i(y6 y6Var, d4 d4Var) {
        this.a = y6Var;
        this.b = d4Var;
    }

    public final void a(h1 h1Var, n0 n0Var) {
        if (h1Var != null) {
            n0Var.h = this.b;
            h1Var.y(this.a, n0Var);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a.equals(iVar.a) && this.b.equals(iVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Created(replay=" + this.a + ", recording=" + this.b + ')';
    }
}
