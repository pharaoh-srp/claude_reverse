package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class nc implements Application.ActivityLifecycleCallbacks {
    public Object E;
    public Activity F;
    public final int G;
    public boolean H = false;
    public boolean I = false;
    public boolean J = false;

    public nc(Activity activity) {
        this.F = activity;
        this.G = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.F == activity) {
            this.F = null;
            this.I = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.I || this.J || this.H) {
            return;
        }
        Object obj = this.E;
        try {
            Object obj2 = oc.c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.G) {
                oc.g.postAtFrontOfQueue(new s2k(oc.b.get(activity), 2, obj2));
                this.J = true;
                this.E = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.F == activity) {
            this.H = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
