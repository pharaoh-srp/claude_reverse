package io.sentry.android.core;

import android.content.Context;
import io.sentry.k5;
import io.sentry.w6;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h0 implements io.sentry.i0 {
    public final Context E;
    public final SentryAndroidOptions F;
    public final l0 G;
    public final k5 H;
    public final io.sentry.cache.g I;
    public final List J = Collections.singletonList(new g0(this));

    public h0(Context context, l0 l0Var, SentryAndroidOptions sentryAndroidOptions) {
        Context applicationContext = context.getApplicationContext();
        this.E = applicationContext != null ? applicationContext : context;
        this.F = sentryAndroidOptions;
        this.G = l0Var;
        this.I = sentryAndroidOptions.findPersistingScopeObserver();
        this.H = new k5(new io.sentry.x(sentryAndroidOptions));
    }

    public final Object a(w6 w6Var, String str, Class cls) {
        io.sentry.cache.g gVar = this.I;
        if (gVar == null) {
            return null;
        }
        return gVar.b(w6Var, str, cls);
    }

    /* JADX WARN: Removed duplicated region for block: B:186:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0820  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x088e  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x08a4  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x08b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c9  */
    @Override // io.sentry.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.sentry.j5 d(io.sentry.j5 r30, io.sentry.n0 r31) {
        /*
            Method dump skipped, instruction units count: 2231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.h0.d(io.sentry.j5, io.sentry.n0):io.sentry.j5");
    }

    @Override // io.sentry.i0
    public final io.sentry.protocol.e0 e(io.sentry.protocol.e0 e0Var, io.sentry.n0 n0Var) {
        return e0Var;
    }
}
