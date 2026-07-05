package defpackage;

import android.app.Activity;
import android.app.Application;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ly7 implements Application.ActivityLifecycleCallbacks, bd9 {
    public final List E;
    public final h99 F;
    public final dd8 G;
    public final jz1 H;
    public final WeakHashMap I;
    public final WeakHashMap J;
    public Display K;
    public jy7 L;
    public final hy7 M;

    public ly7(List list, h99 h99Var) {
        jz1.a.getClass();
        hz1 hz1Var = iz1.b;
        h99Var.getClass();
        this.E = list;
        this.F = h99Var;
        this.G = hd9.a;
        this.H = hz1Var;
        this.I = new WeakHashMap();
        this.J = new WeakHashMap();
        hy7 hy7Var = new hy7();
        hy7Var.a = 0;
        hy7Var.b = 0L;
        hy7Var.c = 0L;
        hy7Var.d = 0L;
        hy7Var.e = 0L;
        hy7Var.f = 0L;
        hy7Var.g = 0L;
        hy7Var.h = 0L;
        hy7Var.i = 0L;
        hy7Var.j = 0L;
        hy7Var.k = false;
        hy7Var.l = 0L;
        hy7Var.m = 0L;
        hy7Var.n = 0L;
        hy7Var.o = 0L;
        hy7Var.p = 60.0d;
        this.M = hy7Var;
    }

    @Override // defpackage.bd9
    public final void a(ey7 ey7Var) {
        List list = this.E;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((iy7) list.get(i)).a(ey7Var);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
        Window window = activity.getWindow();
        WeakHashMap weakHashMap = this.J;
        Collection collection = (Collection) weakHashMap.get(window);
        if (collection == null || collection.isEmpty()) {
            this.I.remove(activity.getWindow());
            weakHashMap.remove(activity.getWindow());
            if (((hz1) this.H).h) {
                Window window2 = activity.getWindow();
                window2.getClass();
                try {
                    window2.removeOnFrameMetricsAvailableListener(this.L);
                } catch (IllegalArgumentException e) {
                    dch.H(this.F, 5, g99.F, qs7.P, e, false, 48);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
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
        cd9 cd9Var;
        Object next;
        activity.getClass();
        Window window = activity.getWindow();
        window.getClass();
        WeakHashMap weakHashMap = this.J;
        List arrayList = (List) weakHashMap.get(window);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        Iterator it = arrayList.iterator();
        while (true) {
            cd9Var = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (x44.r(((WeakReference) next).get(), activity)) {
                    break;
                }
            }
        }
        if (next == null) {
            arrayList.add(new WeakReference(activity));
            weakHashMap.put(window, arrayList);
        }
        WeakHashMap weakHashMap2 = this.I;
        boolean zContainsKey = weakHashMap2.containsKey(window);
        cd9 cd9Var2 = (cd9) weakHashMap2.get(window);
        g99 g99Var = g99.F;
        h99 h99Var = this.F;
        if (cd9Var2 != null) {
            dch.H(h99Var, 2, g99Var, new ky7(window, 1), null, false, 56);
            cd9Var2.a(true);
        } else {
            dch.H(h99Var, 2, g99Var, new l4(16, window), null, false, 56);
            this.G.getClass();
            h99 h99Var2 = this.F;
            h99Var2.getClass();
            try {
                cd9Var = new cd9(window, this);
            } catch (IllegalStateException e) {
                dch.H(h99Var2, 5, g99Var, qs7.U, e, false, 48);
            }
            if (cd9Var == null) {
                dch.H(this.F, 4, g99Var, qs7.O, null, false, 56);
                g99Var = g99Var;
            } else {
                weakHashMap2.put(window, cd9Var);
            }
        }
        hz1 hz1Var = (hz1) this.H;
        if (!hz1Var.h || zContainsKey) {
            if (this.K == null && hz1Var.b == 30) {
                Object systemService = activity.getSystemService("display");
                systemService.getClass();
                this.K = ((DisplayManager) systemService).getDisplay(0);
                return;
            }
            return;
        }
        if (this.L == null) {
            this.L = new jy7(this);
        }
        Handler handler = new Handler(Looper.getMainLooper());
        View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView != null) {
            viewPeekDecorView.post(new oj5(viewPeekDecorView, this, window, handler, 1));
        } else {
            dch.H(this.F, 4, g99Var, qs7.L, null, false, 56);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        g99 g99Var = g99.G;
        activity.getClass();
        Window window = activity.getWindow();
        WeakHashMap weakHashMap = this.J;
        boolean zContainsKey = weakHashMap.containsKey(window);
        g99 g99Var2 = g99.F;
        if (!zContainsKey) {
            dch.H(this.F, 4, g99Var2, qs7.H, null, false, 56);
        }
        List arrayList = (List) weakHashMap.get(window);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        b54.w0(new h4(17, activity), arrayList);
        weakHashMap.put(window, arrayList);
        if (arrayList.isEmpty()) {
            dch.H(this.F, 2, g99Var2, new ky7(window, 0), null, false, 56);
            try {
                cd9 cd9Var = (cd9) this.I.get(window);
                if (cd9Var != null) {
                    if (cd9Var.c) {
                        cd9Var.a(false);
                    } else {
                        dch.H(this.F, 5, g99Var, qs7.I, null, false, 56);
                    }
                }
            } catch (IllegalArgumentException e) {
                dch.H(this.F, 5, g99Var, qs7.J, e, false, 48);
            } catch (NullPointerException e2) {
                dch.H(this.F, 5, g99Var, qs7.K, e2, false, 48);
            }
        }
    }
}
