package defpackage;

import io.sentry.j5;
import io.sentry.j6;
import io.sentry.l6;
import io.sentry.n0;
import io.sentry.protocol.e0;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class lmf {
    public final AtomicBoolean a;
    public final imf b = new j6() { // from class: imf
        @Override // io.sentry.j6
        public final j5 a(j5 j5Var, n0 n0Var) {
            if (this.a.a.get()) {
                return j5Var;
            }
            return null;
        }
    };
    public final jmf c = new l6() { // from class: jmf
        @Override // io.sentry.l6
        public final e0 a(e0 e0Var, n0 n0Var) {
            if (this.a.a.get()) {
                return e0Var;
            }
            return null;
        }
    };
    public final kmf d = new kmf(this, 0);

    /* JADX WARN: Type inference failed for: r2v1, types: [imf] */
    /* JADX WARN: Type inference failed for: r2v2, types: [jmf] */
    public lmf(boolean z) {
        this.a = new AtomicBoolean(z);
    }
}
