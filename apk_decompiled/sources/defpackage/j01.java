package defpackage;

import android.app.Activity;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Process;
import android.os.StrictMode;
import android.view.Choreographer;
import android.view.View;
import android.view.Window;
import androidx.core.app.FrameMetricsAggregator;
import androidx.health.platform.client.proto.g;
import com.google.firebase.messaging.FirebaseMessaging;
import com.lyft.kronos.internal.ntp.a;
import io.sentry.ShutdownHookIntegration;
import io.sentry.a1;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.android.core.c;
import io.sentry.android.core.f0;
import io.sentry.android.core.internal.util.d;
import io.sentry.j7;
import io.sentry.ndk.NativeScope;
import io.sentry.p;
import io.sentry.p1;
import io.sentry.protocol.e;
import io.sentry.protocol.i0;
import io.sentry.t5;
import io.sentry.w6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j01 implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    public /* synthetic */ j01(ActivityLifecycleIntegration activityLifecycleIntegration, p1 p1Var, p1 p1Var2) {
        this.E = 18;
        this.F = p1Var;
        this.G = p1Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mr9 mr9Var;
        Context contextCreateDeviceProtectedStorageContext;
        int i = 0;
        switch (this.E) {
            case 0:
                k01 k01Var = (k01) this.F;
                bz7 bz7Var = (bz7) this.G;
                synchronized (k01Var.G) {
                    bz7Var.invoke(k01Var.F);
                }
                return;
            case 1:
                ba4 ba4Var = (ba4) this.F;
                ba4Var.E.a(new s94((vdc) this.G, i, ba4Var));
                return;
            case 2:
                pjc pjcVar = (pjc) this.F;
                jvd jvdVar = (jvd) this.G;
                if (pjcVar.b != pjc.d) {
                    sz6.j("provide() can be called only once.");
                    return;
                }
                synchronized (pjcVar) {
                    mr9Var = pjcVar.a;
                    pjcVar.a = null;
                    pjcVar.b = jvdVar;
                    break;
                }
                mr9Var.getClass();
                return;
            case 3:
                i1a i1aVar = (i1a) this.F;
                jvd jvdVar2 = (jvd) this.G;
                synchronized (i1aVar) {
                    try {
                        if (i1aVar.b == null) {
                            i1aVar.a.add(jvdVar2);
                        } else {
                            i1aVar.b.add(jvdVar2.get());
                        }
                    } finally {
                    }
                }
                return;
            case 4:
                o25 o25Var = (o25) this.F;
                Context context = (Context) this.G;
                h99 h99Var = o25Var.a;
                if (((hz1) o25Var.e).c && (contextCreateDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext()) != null) {
                    context = contextCreateDeviceProtectedStorageContext;
                }
                List listX = x44.X(kk5.NTP_0, kk5.NTP_1, kk5.NTP_2, kk5.NTP_3);
                ArrayList arrayList = new ArrayList(x44.y(listX, 10));
                Iterator it = listX.iterator();
                while (it.hasNext()) {
                    arrayList.add(((kk5) it.next()).E);
                }
                rga rgaVar = new rga(h99Var, 0);
                long j = ys5.a;
                long j2 = ys5.b;
                context.getClass();
                unb unbVar = new unb(12);
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.lyft.kronos.shared_preferences", 0);
                sharedPreferences.getClass();
                wdg wdgVar = new wdg(new a(unbVar, new k2e(17), new k2e(16)), unbVar, new cbf(new x2g(sharedPreferences), 7, unbVar), rgaVar, arrayList, j, 300000L, 1800000L, j2);
                hs9 hs9Var = new hs9(wdgVar, unbVar);
                try {
                    wdgVar.b();
                    break;
                } catch (IllegalStateException e) {
                    dch.H(o25Var.a, 5, g99.F, n.f0, e, false, 48);
                }
                o25Var.l = new js9(hs9Var, h99Var);
                o25Var.s = hs9Var;
                return;
            case 5:
                he5 he5Var = (he5) this.F;
                Runnable runnable = (Runnable) this.G;
                Process.setThreadPriority(he5Var.c);
                StrictMode.ThreadPolicy threadPolicy = he5Var.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 6:
                ((qj5) this.F).C().m.g((l4i) this.G);
                return;
            case 7:
                qj5 qj5Var = (qj5) this.F;
                UUID uuid = (UUID) this.G;
                qj5Var.C().n.m(uuid != null ? uuid.toString() : null);
                return;
            case 8:
                qj5 qj5Var2 = (qj5) this.F;
                dg4 dg4Var = (dg4) this.G;
                gbf feature = qj5Var2.getFeature("rum");
                if (feature == null) {
                    return;
                }
                boolean z = dg4Var.f;
                bg4 bg4Var = dg4Var.a;
                feature.a(new ea9(z, ij0.b(bg4Var.c), kgh.b(bg4Var.d), false, ij0.a(bg4Var.g)));
                return;
            case 9:
                jk5 jk5Var = (jk5) this.F;
                qj5 qj5Var3 = (qj5) this.G;
                uzb uzbVar = (uzb) jk5Var.L;
                if (uzbVar != null) {
                    qh9 qh9Var = (qh9) jk5Var.K;
                    String str = String.format(Locale.US, "NDK crash detected with signal: %s", Arrays.copyOf(new Object[]{uzbVar.a()}, 1));
                    if (qh9Var != null) {
                        gbf feature2 = qj5Var3.getFeature("rum");
                        if (feature2 != null) {
                            feature2.a(sta.h0(new cpc("type", "ndk_crash"), new cpc("sourceType", (String) jk5Var.I), new cpc("timestamp", Long.valueOf(uzbVar.d())), new cpc("timeSinceAppStartMs", uzbVar.c()), new cpc("signalName", uzbVar.a()), new cpc("stacktrace", uzbVar.b()), new cpc("message", str), new cpc("lastViewEvent", qh9Var)));
                        } else {
                            dch.H((h99) jk5Var.G, 3, g99.E, yf5.b0, null, false, 56);
                        }
                    }
                    jk5Var.K = null;
                    jk5Var.L = null;
                    return;
                }
                return;
            case 10:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.F;
                j5h j5hVar = (j5h) this.G;
                try {
                    j5hVar.b(firebaseMessaging.a());
                    return;
                } catch (Exception e2) {
                    j5hVar.a(e2);
                    return;
                }
            case 11:
                ((ua2) this.F).F((ye8) this.G, iei.a);
                return;
            case 12:
                ((zff) ((agf) this.F)).k((oec) this.G, iei.a);
                return;
            case 13:
                aye ayeVar = (aye) this.F;
                ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) this.G;
                k99 k99Var = ayeVar.E;
                k99Var.getClass();
                qh9 qh9VarZ = k99Var.z();
                if (qh9VarZ != null) {
                    ((gk5) ayeVar.k0.getValue()).c(applicationExitInfo, qh9VarZ, ayeVar.K);
                    return;
                } else {
                    dch.H(k99Var.t(), 3, g99.E, uxe.K, null, false, 56);
                    return;
                }
            case 14:
                ((bye) this.F).b((View) this.G);
                return;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                gij gijVar = (gij) this.F;
                c4a c4aVar = (c4a) this.G;
                if (gijVar.G) {
                    return;
                }
                gijVar.H = c4aVar;
                c4aVar.a(gijVar);
                return;
            case 16:
                ShutdownHookIntegration shutdownHookIntegration = (ShutdownHookIntegration) this.F;
                w6 w6Var = (w6) this.G;
                shutdownHookIntegration.E.addShutdownHook(shutdownHookIntegration.F);
                w6Var.getLogger().h(t5.DEBUG, "ShutdownHookIntegration installed.", new Object[0]);
                p.a("ShutdownHook");
                return;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((FrameMetricsAggregator) ((c) this.F).a.a()).a.a((Activity) this.G);
                return;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ActivityLifecycleIntegration.d((p1) this.F, (p1) this.G);
                return;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ((f0) this.F).d((a1) this.G);
                return;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                io.sentry.android.core.internal.util.p pVar = (io.sentry.android.core.internal.util.p) this.F;
                Window window = (Window) this.G;
                if (pVar.F.add(window)) {
                    try {
                        d dVar = pVar.L;
                        ed9 ed9Var = pVar.M;
                        Handler handler = pVar.H;
                        dVar.getClass();
                        if (ed9Var == null) {
                            return;
                        }
                        window.addOnFrameMetricsAvailableListener(ed9Var, handler);
                        return;
                    } catch (Throwable th) {
                        pVar.G.d(t5.ERROR, "Failed to add frameMetricsAvailableListener", th);
                        return;
                    }
                }
                return;
            case 21:
                io.sentry.android.core.internal.util.p pVar2 = (io.sentry.android.core.internal.util.p) this.F;
                a1 a1Var = (a1) this.G;
                try {
                    pVar2.N = Choreographer.getInstance();
                    return;
                } catch (Throwable th2) {
                    a1Var.d(t5.ERROR, "Error retrieving Choreographer instance. Slow and frozen frames will not be reported.", th2);
                    return;
                }
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                io.sentry.android.ndk.c cVar = (io.sentry.android.ndk.c) this.F;
                i0 i0Var = (i0) this.G;
                NativeScope nativeScope = cVar.b;
                if (i0Var == null) {
                    nativeScope.getClass();
                    NativeScope.nativeRemoveUser();
                    return;
                }
                String str2 = i0Var.F;
                String str3 = i0Var.E;
                String str4 = i0Var.H;
                String str5 = i0Var.G;
                nativeScope.getClass();
                NativeScope.nativeSetUser(str2, str3, str4, str5);
                return;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                io.sentry.android.ndk.c cVar2 = (io.sentry.android.ndk.c) this.F;
                io.sentry.g gVar = (io.sentry.g) this.G;
                w6 w6Var2 = cVar2.a;
                t5 t5Var = gVar.M;
                String lowerCase = t5Var != null ? t5Var.name().toLowerCase(Locale.ROOT) : null;
                String strO = p.o(gVar.b());
                try {
                    ConcurrentHashMap concurrentHashMap = gVar.J;
                    if (!concurrentHashMap.isEmpty()) {
                        strB = w6Var2.getSerializer().b(concurrentHashMap);
                    }
                    break;
                } catch (Throwable th3) {
                    w6Var2.getLogger().b(t5.ERROR, th3, "Breadcrumb data is not serializable.", new Object[0]);
                }
                String str6 = strB;
                NativeScope nativeScope2 = cVar2.b;
                String str7 = gVar.H;
                String str8 = gVar.K;
                String str9 = gVar.I;
                nativeScope2.getClass();
                NativeScope.nativeAddBreadcrumb(lowerCase, str7, str8, str9, strO, str6);
                return;
            case 24:
                io.sentry.android.ndk.c cVar3 = (io.sentry.android.ndk.c) this.F;
                j7 j7Var = (j7) this.G;
                NativeScope nativeScope3 = cVar3.b;
                String string = j7Var.E.toString();
                String string2 = j7Var.F.toString();
                nativeScope3.getClass();
                NativeScope.nativeSetTrace(string, string2);
                return;
            case BuildConfig.VERSION_CODE /* 25 */:
                io.sentry.cache.g gVar2 = (io.sentry.cache.g) this.F;
                i0 i0Var2 = (i0) this.G;
                if (i0Var2 == null) {
                    gVar2.a("user.json");
                    return;
                } else {
                    gVar2.d("user.json", i0Var2);
                    return;
                }
            case 26:
                ((io.sentry.cache.g) this.F).d("contexts.json", (e) this.G);
                return;
            case 27:
                ((io.sentry.cache.g) this.F).d("tags.json", (Map) this.G);
                return;
            default:
                io.sentry.cache.g gVar3 = (io.sentry.cache.g) this.F;
                try {
                    ((Runnable) this.G).run();
                    return;
                } catch (Throwable th4) {
                    gVar3.a.getLogger().d(t5.ERROR, "Serialization task failed", th4);
                    return;
                }
        }
    }

    public /* synthetic */ j01(Object obj, int i, Object obj2) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }
}
