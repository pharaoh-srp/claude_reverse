package io.sentry.android.core.performance;

import android.os.Handler;
import android.os.SystemClock;
import defpackage.pya;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements Runnable {
    public final /* synthetic */ Handler E;
    public final /* synthetic */ h F;

    public f(h hVar, Handler handler) {
        this.F = hVar;
        this.E = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.F.G = SystemClock.uptimeMillis();
        this.E.post(new pya(22, this));
    }
}
