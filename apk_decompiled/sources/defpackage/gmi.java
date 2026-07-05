package defpackage;

import android.app.Activity;
import android.view.Window;

/* JADX INFO: loaded from: classes3.dex */
public final class gmi extends gc implements emi {
    public final xj5 F;

    public gmi(xj5 xj5Var) {
        this.F = xj5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!gmi.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.F.equals(((gmi) obj).F);
    }

    public final int hashCode() {
        return this.F.hashCode();
    }

    @Override // defpackage.gc, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
        Window window = activity.getWindow();
        if (window == null) {
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof lbj) {
            Window.Callback callback2 = ((lbj) callback).G;
            if (callback2 instanceof v4c) {
                window.setCallback(null);
            } else {
                window.setCallback(callback2);
            }
        }
    }

    @Override // defpackage.gc, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
        if (this.E != null) {
            this.F.a(activity.getWindow(), activity, c());
        } else {
            h99.k.getClass();
            dch.H(f99.b, 3, g99.E, n.K, null, false, 56);
        }
    }

    public final String toString() {
        return "UserActionTrackingStrategyLegacy(" + this.F + ")";
    }
}
