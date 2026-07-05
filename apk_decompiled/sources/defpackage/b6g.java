package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.anthropic.claude.types.environment.AppEnvironment;
import kotlin.NoWhenBranchMatchedException;
import siftscience.android.Sift;

/* JADX INFO: loaded from: classes.dex */
public final class b6g implements Application.ActivityLifecycleCallbacks {
    public final g6g E;

    public b6g(g6g g6gVar) {
        this.E = g6gVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        e6g e6gVar;
        activity.getClass();
        g6g g6gVar = this.E;
        synchronized (g6gVar) {
            try {
                if (g6gVar.b) {
                    int i = f6g.a[((AppEnvironment) g6gVar.a.a()).ordinal()];
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        e6gVar = d6g.a;
                    } else {
                        e6gVar = c6g.a;
                    }
                    Sift.open(activity, new Sift.Config.Builder().withAccountId(e6gVar.a()).withBeaconKey(e6gVar.b()).build());
                    Sift.collect();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
        g6g g6gVar = this.E;
        synchronized (g6gVar) {
            if (g6gVar.b) {
                Sift.close();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
        g6g g6gVar = this.E;
        synchronized (g6gVar) {
            if (g6gVar.b) {
                Sift.pause();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
        g6g g6gVar = this.E;
        synchronized (g6gVar) {
            if (g6gVar.b) {
                Sift.resume(activity);
            }
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
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
    }
}
