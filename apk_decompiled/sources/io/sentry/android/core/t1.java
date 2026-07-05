package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.HandlerThread;
import defpackage.u95;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class t1 implements Application.ActivityLifecycleCallbacks {
    public final WeakReference E;
    public final /* synthetic */ u1 F;

    public t1(u1 u1Var, WeakReference weakReference) {
        this.F = u1Var;
        this.E = weakReference;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Activity activity2;
        if (activity == this.E.get()) {
            u1 u1Var = this.F;
            p1 p1Var = u1Var.I;
            if (p1Var != null) {
                p1Var.c();
                HandlerThread handlerThread = p1Var.c;
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                    p1Var.c = null;
                    p1Var.d = null;
                }
                u1Var.I = null;
            }
            if (u1Var.J != null) {
                Context context = u1Var.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        activity2 = null;
                        break;
                    } else {
                        if (context instanceof Activity) {
                            activity2 = (Activity) context;
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                if (activity2 != null) {
                    activity2.getApplication().unregisterActivityLifecycleCallbacks(u1Var.J);
                }
                u1Var.J = null;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        p1 p1Var;
        if (activity != this.E.get() || (p1Var = this.F.I) == null) {
            return;
        }
        p1Var.c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        u1 u1Var;
        p1 p1Var;
        WeakReference weakReference = this.E;
        if (activity != weakReference.get() || (p1Var = (u1Var = this.F).I) == null) {
            return;
        }
        p1Var.b(activity, new u95(u1Var, 26, weakReference));
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
}
