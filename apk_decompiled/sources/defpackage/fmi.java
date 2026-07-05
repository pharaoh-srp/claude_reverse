package defpackage;

import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class fmi extends gc implements emi {
    public final xj5 F;

    public fmi(xj5 xj5Var) {
        this.F = xj5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!fmi.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.F.equals(((fmi) obj).F);
    }

    public final int hashCode() {
        return this.F.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (this.E != null) {
            this.F.a(activity.getWindow(), activity, c());
        } else {
            h99.k.getClass();
            dch.H(f99.b, 3, g99.E, n.K, null, false, 56);
        }
        super.onActivityPreCreated(activity, bundle);
    }

    public final String toString() {
        return "UserActionTrackingStrategyApi29(" + this.F + ")";
    }
}
