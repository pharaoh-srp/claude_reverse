package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class af7 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ int E;
    public final Object F;

    public af7() {
        this.E = 0;
        this.F = new ArrayDeque(10);
    }

    private final void a(Activity activity) {
    }

    private final void b(Activity activity) {
    }

    private final void c(Activity activity) {
    }

    private final void d(Activity activity, Bundle bundle) {
    }

    private final void e(Activity activity) {
    }

    private final void f(Activity activity) {
    }

    private final void g(Activity activity) {
    }

    private final void h(Activity activity) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Uri uri;
        int i = this.E;
        Bundle bundle2 = null;
        bundle2 = null;
        uri = null;
        Uri uri2 = null;
        Object obj = this.F;
        switch (i) {
            case 0:
                Intent intent = activity.getIntent();
                if (intent == null) {
                    return;
                }
                ArrayDeque arrayDeque = (ArrayDeque) obj;
                try {
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        String string = extras.getString("google.message_id");
                        if (string == null) {
                            string = extras.getString("message_id");
                        }
                        if (!TextUtils.isEmpty(string)) {
                            if (arrayDeque.contains(string)) {
                                return;
                            } else {
                                arrayDeque.add(string);
                            }
                        }
                        bundle2 = extras.getBundle("gcm.n.analytics_data");
                    }
                    break;
                } catch (RuntimeException e) {
                    Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e);
                }
                if (bundle2 == null ? false : "1".equals(bundle2.getString("google.c.a.e"))) {
                    if (bundle2 != null) {
                        if ("1".equals(bundle2.getString("google.c.a.tc"))) {
                            hx hxVar = (hx) pl7.c().b(hx.class);
                            Log.isLoggable("FirebaseMessaging", 3);
                            if (hxVar != null) {
                                String string2 = bundle2.getString("google.c.a.c_id");
                                ix ixVar = (ix) hxVar;
                                if (j3k.c()) {
                                    j6k j6kVar = (j6k) ixVar.a.F;
                                    j6kVar.c(new p6k(j6kVar, string2, i));
                                }
                                Bundle bundle3 = new Bundle();
                                bundle3.putString("source", "Firebase");
                                bundle3.putString("medium", "notification");
                                bundle3.putString("campaign", string2);
                                ixVar.a("_cmp", bundle3);
                            } else {
                                Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                            }
                        } else {
                            Log.isLoggable("FirebaseMessaging", 3);
                        }
                    }
                    zni.N("_no", bundle2);
                    return;
                }
                return;
            case 1:
                ((j6k) obj).c(new u6k(this, bundle, activity));
                return;
            default:
                jsk jskVar = (jsk) obj;
                try {
                    try {
                        jskVar.b0().R.b("onActivityCreated");
                        Intent intent2 = activity.getIntent();
                        if (intent2 == null) {
                            jskVar.M0().T0(activity, bundle);
                            return;
                        }
                        Uri data = intent2.getData();
                        if (data == null || !data.isHierarchical()) {
                            Bundle extras2 = intent2.getExtras();
                            if (extras2 != null) {
                                String string3 = extras2.getString("com.android.vending.referral_url");
                                if (!TextUtils.isEmpty(string3)) {
                                    uri2 = Uri.parse(string3);
                                }
                            }
                            uri = uri2;
                        } else {
                            uri = data;
                        }
                        if (uri != null && uri.isHierarchical()) {
                            jskVar.J0();
                            jskVar.O().T0(new vvk(this, bundle == null ? 1 : 0, uri, h1l.s1(intent2) ? "gs" : "auto", uri.getQueryParameter("referrer")));
                            jskVar.M0().T0(activity, bundle);
                            return;
                        }
                        return;
                    } catch (RuntimeException e2) {
                        jskVar.b0().J.c("Throwable caught in onActivityCreated", e2);
                        jskVar.M0().T0(activity, bundle);
                        return;
                    }
                } finally {
                    jskVar.M0().T0(activity, bundle);
                }
                jskVar.M0().T0(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.E) {
            case 0:
                return;
            case 1:
                ((j6k) this.F).c(new gck(this, activity, 2));
                return;
            default:
                vxk vxkVarM0 = ((jsk) this.F).M0();
                synchronized (vxkVarM0.P) {
                    try {
                        if (activity == vxkVarM0.K) {
                            vxkVarM0.K = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (((umk) vxkVarM0.E).K.a1()) {
                    vxkVarM0.J.remove(activity);
                    return;
                }
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int i;
        switch (this.E) {
            case 0:
                return;
            case 1:
                ((j6k) this.F).c(new gck(this, activity, 0));
                return;
            default:
                vxk vxkVarM0 = ((jsk) this.F).M0();
                synchronized (vxkVarM0.P) {
                    vxkVarM0.O = false;
                    i = 1;
                    vxkVarM0.L = true;
                    break;
                }
                ((umk) vxkVarM0.E).R.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (((umk) vxkVarM0.E).K.a1()) {
                    xxk xxkVarX0 = vxkVarM0.X0(activity);
                    vxkVarM0.H = vxkVarM0.G;
                    vxkVarM0.G = null;
                    vxkVarM0.O().T0(new etk(vxkVarM0, xxkVarX0, jElapsedRealtime));
                } else {
                    vxkVarM0.G = null;
                    vxkVarM0.O().T0(new c7k(vxkVarM0, jElapsedRealtime, i));
                }
                yzk yzkVarN0 = ((jsk) this.F).N0();
                ((umk) yzkVarN0.E).R.getClass();
                yzkVarN0.O().T0(new c7k(yzkVarN0, SystemClock.elapsedRealtime(), 2));
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        int i;
        switch (this.E) {
            case 0:
                return;
            case 1:
                ((j6k) this.F).c(new zbk(this, activity, 1));
                return;
            default:
                yzk yzkVarN0 = ((jsk) this.F).N0();
                ((umk) yzkVarN0.E).R.getClass();
                yzkVarN0.O().T0(new wzk(yzkVarN0, SystemClock.elapsedRealtime()));
                vxk vxkVarM0 = ((jsk) this.F).M0();
                synchronized (vxkVarM0.P) {
                    vxkVarM0.O = true;
                    i = 0;
                    if (activity != vxkVarM0.K) {
                        synchronized (vxkVarM0.P) {
                            vxkVarM0.K = activity;
                            vxkVarM0.L = false;
                            break;
                        }
                        if (((umk) vxkVarM0.E).K.a1()) {
                            vxkVarM0.M = null;
                            vxkVarM0.O().T0(new k51(22, vxkVarM0));
                        }
                    }
                }
                if (!((umk) vxkVarM0.E).K.a1()) {
                    vxkVarM0.G = vxkVarM0.M;
                    vxkVarM0.O().T0(new m(7, vxkVarM0));
                    return;
                }
                vxkVarM0.U0(activity, vxkVarM0.X0(activity), false);
                xoj xojVarH = ((umk) vxkVarM0.E).h();
                ((umk) xojVarH.E).R.getClass();
                xojVarH.O().T0(new c7k(xojVarH, SystemClock.elapsedRealtime(), i));
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        xxk xxkVar;
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                break;
            case 1:
                n4k n4kVar = new n4k();
                ((j6k) obj).c(new hak(this, activity, n4kVar));
                Bundle bundleC = n4kVar.c(50L);
                if (bundleC != null) {
                    bundle.putAll(bundleC);
                }
                break;
            default:
                vxk vxkVarM0 = ((jsk) obj).M0();
                if (((umk) vxkVarM0.E).K.a1() && bundle != null && (xxkVar = (xxk) vxkVarM0.J.get(activity)) != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("id", xxkVar.c);
                    bundle2.putString("name", xxkVar.a);
                    bundle2.putString("referrer_name", xxkVar.b);
                    bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.E) {
            case 1:
                ((j6k) this.F).c(new zbk(this, activity, 0));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.E) {
            case 1:
                ((j6k) this.F).c(new gck(this, activity, 1));
                break;
        }
    }

    public /* synthetic */ af7(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }
}
