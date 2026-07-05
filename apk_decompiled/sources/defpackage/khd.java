package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class khd implements Application.ActivityLifecycleCallbacks {
    public final jhd E;
    public final AtomicInteger F = new AtomicInteger(0);
    public final AtomicInteger G = new AtomicInteger(0);
    public final AtomicBoolean H = new AtomicBoolean(true);
    public final AtomicBoolean I = new AtomicBoolean(true);

    public khd(jhd jhdVar) {
        this.E = jhdVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
        if (this.F.decrementAndGet() != 0 || this.H.getAndSet(true)) {
            return;
        }
        this.E.d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
        if (this.F.incrementAndGet() == 1 && this.H.getAndSet(false)) {
            this.E.h();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
        if (this.G.incrementAndGet() == 1 && this.I.getAndSet(false)) {
            this.E.g();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
        if (this.G.decrementAndGet() == 0 && this.H.get()) {
            this.E.k();
            this.I.set(true);
        }
    }
}
