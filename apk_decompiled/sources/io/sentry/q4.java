package io.sentry;

/* JADX INFO: loaded from: classes.dex */
public final class q4 {
    public final /* synthetic */ int a;
    public final io.sentry.android.core.p b;

    public /* synthetic */ q4(io.sentry.android.core.p pVar, int i) {
        this.a = i;
        this.b = pVar;
    }

    public static boolean b(a1 a1Var, String str) {
        if (str != null && !str.isEmpty()) {
            return true;
        }
        a1Var.h(t5.INFO, "No cached dir path is defined in options.", new Object[0]);
        return false;
    }

    public final p4 a(h1 h1Var, w6 w6Var) {
        int i = this.a;
        io.sentry.android.core.p pVar = this.b;
        switch (i) {
            case 0:
                p.v("Scopes are required", h1Var);
                p.v("SentryOptions is required", w6Var);
                String cacheDirPath = pVar.F.getCacheDirPath();
                if (cacheDirPath == null || !b(w6Var.getLogger(), cacheDirPath)) {
                    w6Var.getLogger().h(t5.ERROR, "No cache dir path is defined in options.", new Object[0]);
                }
                break;
            default:
                p.v("Scopes are required", h1Var);
                p.v("SentryOptions is required", w6Var);
                String outboxPath = pVar.F.getOutboxPath();
                if (outboxPath == null || !b(w6Var.getLogger(), outboxPath)) {
                    w6Var.getLogger().h(t5.ERROR, "No outbox dir path is defined in options.", new Object[0]);
                }
                break;
        }
        return null;
    }
}
