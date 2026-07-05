package defpackage;

import io.sentry.j5;
import io.sentry.j6;
import io.sentry.n0;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class khi implements j6 {
    public volatile List a = lm6.E;

    @Override // io.sentry.j6
    public j5 a(j5 j5Var, n0 n0Var) {
        List list = this.a;
        if (list.isEmpty()) {
            return j5Var;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j5Var = ((j6) it.next()).a(j5Var, n0Var);
            if (j5Var == null) {
                return null;
            }
        }
        return j5Var;
    }
}
