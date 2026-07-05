package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.datadog.android.rum.internal.domain.scope.RumRawEvent;

/* JADX INFO: loaded from: classes.dex */
public abstract class gc implements Application.ActivityLifecycleCallbacks, m4i {
    public k99 E;

    @Override // defpackage.m4i
    public final void a(Context context) {
        if (context instanceof Application) {
            ((Application) context).unregisterActivityLifecycleCallbacks(this);
        }
    }

    public final h99 b() {
        if (this.E != null) {
            return c().t();
        }
        h99.k.getClass();
        return f99.b;
    }

    public final k99 c() {
        k99 k99Var = this.E;
        if (k99Var != null) {
            return k99Var;
        }
        x44.o0("sdkCore");
        throw null;
    }

    @Override // defpackage.m4i
    public final void k(k99 k99Var, Context context) {
        k99Var.getClass();
        context.getClass();
        if (context instanceof Application) {
            this.E = k99Var;
            ((Application) context).registerActivityLifecycleCallbacks(this);
        } else {
            dch.H(k99Var.t(), 5, g99.E, n.J, null, false, 56);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent;
        vkj g;
        Bundle extras;
        activity.getClass();
        if (this.E == null || (intent = activity.getIntent()) == null || (g = t78.a(c()).getG()) == null) {
            return;
        }
        try {
            extras = intent.getExtras();
        } catch (Exception unused) {
            extras = null;
        }
        String string = extras != null ? extras.getString("_dd.synthetics.test_id") : null;
        String string2 = extras != null ? extras.getString("_dd.synthetics.result_id") : null;
        if (g.b) {
            return;
        }
        g.b = true;
        if (string == null || bsg.I0(string) || string2 == null || bsg.I0(string2)) {
            return;
        }
        g.a.D(new RumRawEvent.SetSyntheticsTestAttribute(string, string2));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        activity.getClass();
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
    public void onActivityStopped(Activity activity) {
        activity.getClass();
    }
}
