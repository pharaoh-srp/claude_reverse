package defpackage;

import android.app.Activity;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class gd extends gc implements pyi {
    public final a5 F = new a5(0);
    public final u0h G = new u0h(new l4(1, this));

    public final cye d() {
        if (this.E != null) {
            return t78.a(c());
        }
        h99.k.getClass();
        dch.H(f99.b, 3, g99.E, n.K, null, false, 56);
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!gd.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.F.equals(((gd) obj).F);
    }

    public final int hashCode() {
        return a5.class.hashCode() + (Boolean.hashCode(false) * 31);
    }

    @Override // defpackage.gc, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
        h99 h99VarB = b();
        try {
            String strL = tik.l(activity);
            nm6 nm6Var = nm6.E;
            cye cyeVarD = d();
            if (cyeVarD != null) {
                cyeVarD.d(activity, strL, nm6Var);
            }
        } catch (Exception e) {
            dch.I(h99VarB, 5, x44.X(g99.F, g99.G), n.d0, e, 48);
        }
    }

    @Override // defpackage.gc, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
        v40.N((ScheduledExecutorService) this.G.getValue(), "Delayed view stop", 200L, b(), new fd(this, 0, activity));
    }
}
