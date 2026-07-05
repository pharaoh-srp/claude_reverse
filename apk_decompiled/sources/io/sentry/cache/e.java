package io.sentry.cache;

import io.sentry.b1;
import io.sentry.w6;

/* JADX INFO: loaded from: classes.dex */
public final class e implements b1 {
    public final w6 a;

    public e(w6 w6Var) {
        this.a = w6Var;
    }

    public final void a(String str) {
        a.a(this.a, ".options-cache", str);
    }

    public final void b(String str, Object obj) {
        a.d(this.a, obj, ".options-cache", str);
    }
}
