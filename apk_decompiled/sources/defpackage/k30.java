package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.segment.analytics.kotlin.core.BaseEvent;
import com.segment.analytics.kotlin.core.Settings;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes.dex */
public final class k30 implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver, n7d {
    public static final c30 Companion = new c30();
    public static final b30 P;
    public gx E;
    public PackageInfo F;
    public Application G;
    public boolean I;
    public p4a N;
    public oog O;
    public boolean H = true;
    public final AtomicBoolean J = new AtomicBoolean(false);
    public final AtomicInteger K = new AtomicInteger(1);
    public final AtomicBoolean L = new AtomicBoolean(false);
    public final AtomicBoolean M = new AtomicBoolean(false);

    static {
        b30 b30Var = new b30();
        b30Var.E = new a30();
        P = b30Var;
    }

    @Override // defpackage.n7d
    public final BaseEvent a(BaseEvent baseEvent) {
        baseEvent.getClass();
        return baseEvent;
    }

    @Override // defpackage.n7d
    public final void b(gx gxVar) {
        this.E = gxVar;
        Context context = gxVar.E.b;
        tp4 tp4Var = null;
        Application application = context instanceof Application ? (Application) context : null;
        if (application == null) {
            sz6.j("no android application context registered");
            return;
        }
        this.G = application;
        int i = 0;
        this.H = false;
        this.I = true;
        this.O = gxVar.a();
        Application application2 = this.G;
        if (application2 == null) {
            x44.o0("application");
            throw null;
        }
        PackageManager packageManager = application2.getPackageManager();
        packageManager.getClass();
        try {
            Application application3 = this.G;
            if (application3 == null) {
                x44.o0("application");
                throw null;
            }
            PackageInfo packageInfo = packageManager.getPackageInfo(application3.getPackageName(), 0);
            packageInfo.getClass();
            this.F = packageInfo;
            Application application4 = this.G;
            if (application4 == null) {
                x44.o0("application");
                throw null;
            }
            application4.registerActivityLifecycleCallbacks(this);
            if (this.I) {
                this.N = ProcessLifecycleOwner.M.J;
                l4 l4Var = new l4(2, this);
                mp4 mp4Var = (mp4) e().F.I;
                ft5 ft5Var = g86.a;
                gb9.D(mp4Var, tpa.a, null, new i30(l4Var, tp4Var, i), 2);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            StringBuilder sb = new StringBuilder("Package not found: ");
            Application application5 = this.G;
            if (application5 == null) {
                x44.o0("application");
                throw null;
            }
            sb.append(application5.getPackageName());
            AssertionError assertionError = new AssertionError(sb.toString());
            bjk.g(gxVar, assertionError);
            throw assertionError;
        }
    }

    @Override // defpackage.n7d
    public final void c(Settings settings, int i) {
        mwa.X(settings, i);
    }

    @Override // defpackage.n7d
    public final gx e() {
        gx gxVar = this.E;
        if (gxVar != null) {
            return gxVar;
        }
        x44.o0("analytics");
        throw null;
    }

    public final void f(bz7 bz7Var) {
        el5 el5Var = e().F;
        gb9.D((mp4) el5Var.I, (e45) el5Var.F, null, new h30(0, null, bz7Var), 2);
    }

    @Override // defpackage.n7d
    public final m7d getType() {
        return m7d.I;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent;
        activity.getClass();
        f(new d30(this, activity, bundle, 0 == true ? 1 : 0, 0));
        if (!this.I) {
            onCreate(P);
        }
        if (!this.H || (intent = activity.getIntent()) == null) {
            return;
        }
        Uri referrer = activity.getReferrer();
        new ive(29, e()).C(intent, referrer != null ? referrer.toString() : null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
        f(new e30(this, activity, null, 0));
        if (this.I) {
            return;
        }
        P.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
        f(new e30(this, activity, null, 1));
        if (this.I) {
            return;
        }
        P.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
        f(new f30(this, activity, null, 0));
        if (this.I) {
            return;
        }
        onStart(P);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
        f(new g30(this, activity, bundle, null));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
        f(new f30(this, activity, null, 1));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
        f(new e30(this, activity, null, 2));
        if (this.I) {
            return;
        }
        onStop(P);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(m4a m4aVar) {
        m4aVar.getClass();
        if (this.J.getAndSet(true)) {
            return;
        }
        this.K.set(0);
        this.L.set(true);
        PackageInfo packageInfo = this.F;
        tp4 tp4Var = null;
        if (packageInfo == null) {
            x44.o0("packageInfo");
            throw null;
        }
        String str = packageInfo.versionName;
        String string = (Build.VERSION.SDK_INT >= 28 ? Long.valueOf(packageInfo.getLongVersionCode()) : Integer.valueOf(packageInfo.versionCode)).toString();
        oog oogVar = this.O;
        if (oogVar == null) {
            x44.o0("storage");
            throw null;
        }
        String strA = oogVar.a(6);
        oog oogVar2 = this.O;
        if (oogVar2 == null) {
            x44.o0("storage");
            throw null;
        }
        String strA2 = oogVar2.a(7);
        oog oogVar3 = this.O;
        if (oogVar3 == null) {
            x44.o0("storage");
            throw null;
        }
        String strA3 = oogVar3.a(8);
        if (strA2 == null && strA3 == null) {
            gx gxVarE = e();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JsonPrimitive jsonPrimitiveC = ch9.c(str);
            jsonPrimitiveC.getClass();
            JsonPrimitive jsonPrimitiveC2 = ch9.c(string);
            jsonPrimitiveC2.getClass();
            gx.e(gxVarE, "Application Installed", new JsonObject(linkedHashMap), 4);
        } else if (!x44.r(string, strA2)) {
            gx gxVarE2 = e();
            rh9 rh9Var = new rh9();
            mpk.U(rh9Var, "version", str);
            mpk.U(rh9Var, "build", string);
            mpk.U(rh9Var, "previous_version", strA);
            mpk.U(rh9Var, "previous_build", String.valueOf(strA2));
            gx.e(gxVarE2, "Application Updated", rh9Var.a(), 4);
        }
        f(new j30(this, str, string, tp4Var, 0));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(m4a m4aVar) {
        m4aVar.getClass();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(m4a m4aVar) {
        m4aVar.getClass();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(m4a m4aVar) {
        m4aVar.getClass();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(m4a m4aVar) {
        m4aVar.getClass();
        if (this.K.incrementAndGet() != 1 || this.M.get()) {
            return;
        }
        rh9 rh9Var = new rh9();
        AtomicBoolean atomicBoolean = this.L;
        if (atomicBoolean.get()) {
            PackageInfo packageInfo = this.F;
            if (packageInfo == null) {
                x44.o0("packageInfo");
                throw null;
            }
            mpk.U(rh9Var, "version", packageInfo.versionName);
            PackageInfo packageInfo2 = this.F;
            if (packageInfo2 == null) {
                x44.o0("packageInfo");
                throw null;
            }
            mpk.U(rh9Var, "build", (Build.VERSION.SDK_INT >= 28 ? Long.valueOf(packageInfo2.getLongVersionCode()) : Integer.valueOf(packageInfo2.versionCode)).toString());
        }
        mpk.V(rh9Var, "from_background", Boolean.valueOf(true ^ atomicBoolean.getAndSet(false)));
        gx.e(e(), "Application Opened", rh9Var.a(), 4);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(m4a m4aVar) {
        m4aVar.getClass();
        if (this.K.decrementAndGet() != 0 || this.M.get()) {
            return;
        }
        gx.e(e(), "Application Backgrounded", null, 6);
    }
}
