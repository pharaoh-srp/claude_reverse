package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class qxe implements Application.ActivityLifecycleCallbacks {
    public static final long O;
    public final Application E;
    public final h35 F;
    public final gmf G;
    public final dpf H;
    public int I;
    public boolean J;
    public boolean K;
    public uye L;
    public final Set M;
    public final WeakHashMap N;

    static {
        lz1 lz1Var = uh6.F;
        O = uh6.g(v40.Q(10, zh6.SECONDS));
    }

    public qxe(Application application, h35 h35Var, gmf gmfVar, dd8 dd8Var, dpf dpfVar) {
        iz1 iz1Var = iz1.a;
        this.E = application;
        this.F = h35Var;
        this.G = gmfVar;
        this.H = dpfVar;
        this.K = true;
        this.M = Collections.newSetFromMap(new WeakHashMap());
        this.N = new WeakHashMap();
        application.registerActivityLifecycleCallbacks(this);
    }

    public final void a() {
        this.L = null;
        this.E.unregisterActivityLifecycleCallbacks(this);
        WeakHashMap weakHashMap = this.N;
        Iterator it = weakHashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((bye) ((Map.Entry) it.next()).getValue()).c();
        }
        weakHashMap.clear();
    }

    public final void b(Activity activity, Bundle bundle) {
        boolean z;
        uye syeVar;
        this.I++;
        jph jphVar = new jph();
        Set set = this.M;
        set.add(activity);
        uye uyeVar = this.L;
        long j = jphVar.b;
        if (uyeVar != null && j - uyeVar.c().b > qye.j) {
            this.L = null;
        }
        if (set.size() == 1 && !this.J && this.L == null) {
            jph jphVar2 = (jph) this.F.a();
            long j2 = j - jphVar2.b;
            boolean z2 = bundle != null;
            WeakReference weakReference = new WeakReference(activity);
            if (!this.K) {
                z = false;
                syeVar = new sye(z2, weakReference, jphVar);
            } else if (j2 > O) {
                syeVar = new tye(z2, weakReference, j2, jphVar);
                z = false;
            } else {
                z = false;
                syeVar = new rye(z2, weakReference, j2, jphVar2);
            }
            this.L = syeVar;
            cye cyeVarA = t78.a(((aye) this.G.F).E);
            hf hfVar = cyeVarA instanceof hf ? (hf) cyeVarA : null;
            if (hfVar != null) {
                hfVar.j(syeVar);
            }
            c(syeVar, activity, z);
            this.K = z;
        }
        uye uyeVar2 = this.L;
        if (uyeVar2 == null || uyeVar2.b().get() == activity) {
            return;
        }
        c(uyeVar2, activity, true);
    }

    public final void c(uye uyeVar, Activity activity, boolean z) {
        bm7 bm7Var = new bm7(this, activity, uyeVar, z);
        dpf dpfVar = this.H;
        this.N.put(activity, new bye(bm7Var, activity, (h99) dpfVar.F, (h35) dpfVar.G, (n78) dpfVar.H, (Handler) dpfVar.I));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (iz1.b.f) {
            return;
        }
        b(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
        this.I--;
        this.M.remove(activity);
        bye byeVar = (bye) this.N.remove(activity);
        if (byeVar != null) {
            byeVar.c();
        }
        if (this.I == 0) {
            this.J = activity.isChangingConfigurations();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (iz1.b.f) {
            b(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
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
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
    }
}
