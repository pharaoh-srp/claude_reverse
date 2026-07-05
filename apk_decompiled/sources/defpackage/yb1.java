package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class yb1 implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final yb1 I = new yb1();
    public final AtomicBoolean E = new AtomicBoolean();
    public final AtomicBoolean F = new AtomicBoolean();
    public final ArrayList G = new ArrayList();
    public boolean H = false;

    public static void a(Application application) {
        yb1 yb1Var = I;
        synchronized (yb1Var) {
            try {
                if (!yb1Var.H) {
                    application.registerActivityLifecycleCallbacks(yb1Var);
                    application.registerComponentCallbacks(yb1Var);
                    yb1Var.H = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(boolean z) {
        synchronized (I) {
            try {
                Iterator it = this.G.iterator();
                while (it.hasNext()) {
                    ((xb1) it.next()).a(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean zCompareAndSet = this.E.compareAndSet(true, false);
        this.F.set(true);
        if (zCompareAndSet) {
            b(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean zCompareAndSet = this.E.compareAndSet(true, false);
        this.F.set(true);
        if (zCompareAndSet) {
            b(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.E.compareAndSet(false, true)) {
            this.F.set(true);
            b(true);
        }
    }
}
