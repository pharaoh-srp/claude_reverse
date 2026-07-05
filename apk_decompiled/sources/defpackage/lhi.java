package defpackage;

import io.sentry.l6;
import io.sentry.n0;
import io.sentry.protocol.e0;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lhi implements l6 {
    public volatile List a = lm6.E;

    @Override // io.sentry.l6
    public e0 a(e0 e0Var, n0 n0Var) {
        List list = this.a;
        if (list.isEmpty()) {
            return e0Var;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e0Var = ((l6) it.next()).a(e0Var, n0Var);
            if (e0Var == null) {
                return null;
            }
        }
        return e0Var;
    }
}
