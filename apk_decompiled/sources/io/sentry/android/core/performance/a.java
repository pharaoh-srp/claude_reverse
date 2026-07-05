package io.sentry.android.core.performance;

import android.os.Build;
import android.os.Looper;
import io.sentry.a5;
import io.sentry.p1;
import io.sentry.w1;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final String a;
    public a5 b = null;
    public a5 c = null;
    public p1 d = null;
    public p1 e = null;

    public a(String str) {
        this.a = str;
    }

    public static p1 a(p1 p1Var, String str, a5 a5Var) {
        p1 p1VarG = p1Var.g(str, a5Var, w1.SENTRY);
        Thread thread = Looper.getMainLooper().getThread();
        io.sentry.android.core.internal.util.f fVar = io.sentry.android.core.internal.util.f.a;
        p1VarG.f("thread.id", Long.valueOf(Build.VERSION.SDK_INT >= 36 ? thread.threadId() : thread.getId()));
        p1VarG.f("thread.name", "main");
        Boolean bool = Boolean.TRUE;
        p1VarG.f("ui.contributes_to_ttid", bool);
        p1VarG.f("ui.contributes_to_ttfd", bool);
        return p1VarG;
    }
}
