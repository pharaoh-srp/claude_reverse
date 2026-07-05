package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class x50 implements Application.ActivityLifecycleCallbacks {
    public final double E;
    public final /* synthetic */ y50 F;

    public x50(y50 y50Var, r4e r4eVar) {
        this.F = y50Var;
        n4e n4eVar = r4eVar.a;
        efe efeVar = bx8.a;
        Object obj = n4eVar.b.n.a.get(bx8.d);
        this.E = ((Number) (obj == null ? Double.valueOf(1.0d) : obj)).doubleValue();
    }

    public final void a(Context context) {
        long j;
        double d = this.E;
        if (d == 1.0d) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
        y50 y50Var = this.F;
        r4e r4eVar = (r4e) ((WeakReference) y50Var.b).get();
        if (r4eVar == null) {
            y50Var.c();
            return;
        }
        w4e w4eVarC = r4eVar.c();
        if (w4eVarC != null) {
            synchronized (w4eVarC.c) {
                j = w4eVarC.a.a;
            }
            w4eVarC.c((long) (d * j));
        }
    }

    public final void b(Context context) {
        long j;
        if (this.E == 1.0d) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
        y50 y50Var = this.F;
        r4e r4eVar = (r4e) ((WeakReference) y50Var.b).get();
        if (r4eVar == null) {
            y50Var.c();
            return;
        }
        w4e w4eVarC = r4eVar.c();
        if (w4eVarC != null) {
            synchronized (w4eVarC.c) {
                j = w4eVarC.a.a;
            }
            w4eVarC.c(j);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
