package com.google.firebase.messaging;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import defpackage.af7;
import defpackage.bm7;
import defpackage.bp0;
import defpackage.cd;
import defpackage.d5h;
import defpackage.dgj;
import defpackage.do0;
import defpackage.et5;
import defpackage.ez1;
import defpackage.g5e;
import defpackage.gxe;
import defpackage.hjb;
import defpackage.hx;
import defpackage.ja4;
import defpackage.jvd;
import defpackage.mvg;
import defpackage.o5l;
import defpackage.pa4;
import defpackage.pl7;
import defpackage.q28;
import defpackage.rl;
import defpackage.s0h;
import defpackage.sf5;
import defpackage.tqh;
import defpackage.vk5;
import defpackage.x2g;
import defpackage.yl7;
import defpackage.z46;
import defpackage.zni;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessaging {
    public static x2g j;
    public static jvd k = new pa4(5);
    public static ScheduledThreadPoolExecutor l;
    public final pl7 a;
    public final Context b;
    public final rl c;
    public final q28 d;
    public final bm7 e;
    public final ScheduledThreadPoolExecutor f;
    public final ThreadPoolExecutor g;
    public final hjb h;
    public boolean i;

    public FirebaseMessaging(pl7 pl7Var, jvd jvdVar, jvd jvdVar2, yl7 yl7Var, jvd jvdVar3, mvg mvgVar) {
        pl7Var.a();
        Context context = pl7Var.a;
        final hjb hjbVar = new hjb();
        final int i = 0;
        hjbVar.b = 0;
        hjbVar.c = context;
        pl7Var.a();
        gxe gxeVar = new gxe(pl7Var.a);
        final rl rlVar = new rl();
        rlVar.F = pl7Var;
        rlVar.G = hjbVar;
        rlVar.H = gxeVar;
        rlVar.I = jvdVar;
        rlVar.E = jvdVar2;
        rlVar.J = yl7Var;
        final int i2 = 1;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new vk5("Firebase-Messaging-Task", 1));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new vk5("Firebase-Messaging-Init", 1));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new vk5("Firebase-Messaging-File-Io", 1));
        this.i = false;
        k = jvdVar3;
        this.a = pl7Var;
        this.e = new bm7(this, mvgVar);
        pl7Var.a();
        final Context context2 = pl7Var.a;
        this.b = context2;
        af7 af7Var = new af7();
        this.h = hjbVar;
        this.c = rlVar;
        this.d = new q28(executorServiceNewSingleThreadExecutor);
        this.f = scheduledThreadPoolExecutor;
        this.g = threadPoolExecutor;
        pl7Var.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(af7Var);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: am7
            public final /* synthetic */ FirebaseMessaging F;

            {
                this.F = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                r5l r5lVarD;
                int i3 = i;
                FirebaseMessaging firebaseMessaging = this.F;
                switch (i3) {
                    case 0:
                        if (firebaseMessaging.e.b() && firebaseMessaging.i(firebaseMessaging.e())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.i) {
                                    firebaseMessaging.h(0L);
                                }
                                break;
                            }
                            return;
                        }
                        return;
                    default:
                        final Context context3 = firebaseMessaging.b;
                        sf5.J(context3);
                        rl rlVar2 = firebaseMessaging.c;
                        final boolean zG = firebaseMessaging.g();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences sharedPreferencesH0 = xn5.h0(context3);
                            if (!sharedPreferencesH0.contains("proxy_retention") || sharedPreferencesH0.getBoolean("proxy_retention", false) != zG) {
                                gxe gxeVar2 = (gxe) rlVar2.H;
                                if (gxeVar2.c.c() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", zG);
                                    r5lVarD = o5l.j(gxeVar2.b).l(4, bundle);
                                } else {
                                    r5lVarD = ez1.D(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                r5lVarD.c(new ao0(1), new mec() { // from class: lvd
                                    @Override // defpackage.mec
                                    public final void onSuccess(Object obj) {
                                        SharedPreferences.Editor editorEdit = xn5.h0(context3).edit();
                                        editorEdit.putBoolean("proxy_retention", zG);
                                        editorEdit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging.g()) {
                            firebaseMessaging.f();
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new vk5("Firebase-Messaging-Topics-Io", 1));
        ez1.v(scheduledThreadPoolExecutor2, new Callable() { // from class: x2i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                w2i w2iVar;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                hjb hjbVar2 = hjbVar;
                rl rlVar2 = rlVar;
                synchronized (w2i.class) {
                    try {
                        WeakReference weakReference = w2i.c;
                        w2i w2iVar2 = weakReference != null ? (w2i) weakReference.get() : null;
                        if (w2iVar2 == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            w2iVar = new w2i(sharedPreferences, scheduledThreadPoolExecutor3);
                            synchronized (w2iVar) {
                                w2iVar.a = el5.u(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            w2i.c = new WeakReference(w2iVar);
                        } else {
                            w2iVar = w2iVar2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new y2i(firebaseMessaging, hjbVar2, w2iVar, rlVar2, context3, scheduledThreadPoolExecutor3);
            }
        }).c(scheduledThreadPoolExecutor, new cd(4, this));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: am7
            public final /* synthetic */ FirebaseMessaging F;

            {
                this.F = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                r5l r5lVarD;
                int i3 = i2;
                FirebaseMessaging firebaseMessaging = this.F;
                switch (i3) {
                    case 0:
                        if (firebaseMessaging.e.b() && firebaseMessaging.i(firebaseMessaging.e())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.i) {
                                    firebaseMessaging.h(0L);
                                }
                                break;
                            }
                            return;
                        }
                        return;
                    default:
                        final Context context3 = firebaseMessaging.b;
                        sf5.J(context3);
                        rl rlVar2 = firebaseMessaging.c;
                        final boolean zG = firebaseMessaging.g();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences sharedPreferencesH0 = xn5.h0(context3);
                            if (!sharedPreferencesH0.contains("proxy_retention") || sharedPreferencesH0.getBoolean("proxy_retention", false) != zG) {
                                gxe gxeVar2 = (gxe) rlVar2.H;
                                if (gxeVar2.c.c() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", zG);
                                    r5lVarD = o5l.j(gxeVar2.b).l(4, bundle);
                                } else {
                                    r5lVarD = ez1.D(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                r5lVarD.c(new ao0(1), new mec() { // from class: lvd
                                    @Override // defpackage.mec
                                    public final void onSuccess(Object obj) {
                                        SharedPreferences.Editor editorEdit = xn5.h0(context3).edit();
                                        editorEdit.putBoolean("proxy_retention", zG);
                                        editorEdit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging.g()) {
                            firebaseMessaging.f();
                            return;
                        }
                        return;
                }
            }
        });
    }

    public static void b(Runnable runnable, long j2) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (l == null) {
                    l = new ScheduledThreadPoolExecutor(1, new vk5("TAG", 1));
                }
                l.schedule(runnable, j2, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized x2g c(Context context) {
        try {
            if (j == null) {
                j = new x2g(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return j;
    }

    public static synchronized FirebaseMessaging getInstance(pl7 pl7Var) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) pl7Var.b(FirebaseMessaging.class);
        dgj.w("Firebase Messaging component is not present", firebaseMessaging);
        return firebaseMessaging;
    }

    public final String a() {
        d5h d5hVarK;
        g5e g5eVarE = e();
        if (!i(g5eVarE)) {
            return (String) g5eVarE.b;
        }
        String strC = hjb.c(this.a);
        q28 q28Var = this.d;
        synchronized (q28Var) {
            d5hVarK = (d5h) ((bp0) q28Var.G).get(strC);
            if (d5hVarK != null) {
                Log.isLoggable("FirebaseMessaging", 3);
            } else {
                Log.isLoggable("FirebaseMessaging", 3);
                rl rlVar = this.c;
                d5hVarK = rlVar.t(rlVar.V(hjb.c((pl7) rlVar.F), "*", new Bundle())).l(this.g, new et5(this, strC, g5eVarE, 2)).k((Executor) q28Var.F, new ja4(q28Var, strC));
                ((bp0) q28Var.G).put(strC, d5hVarK);
            }
        }
        try {
            return (String) ez1.r(d5hVarK);
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException(e);
        }
    }

    public final String d() {
        pl7 pl7Var = this.a;
        pl7Var.a();
        return "[DEFAULT]".equals(pl7Var.b) ? "" : pl7Var.d();
    }

    public final g5e e() {
        g5e g5eVarB;
        x2g x2gVarC = c(this.b);
        String strD = d();
        String strC = hjb.c(this.a);
        synchronized (x2gVarC) {
            g5eVarB = g5e.b(x2gVarC.a.getString(x2g.a(strD, strC), null));
        }
        return g5eVarB;
    }

    public final void f() {
        gxe gxeVar = (gxe) this.c.H;
        (gxeVar.c.c() >= 241100000 ? o5l.j(gxeVar.b).m(5, Bundle.EMPTY).j(z46.G, tqh.X) : ez1.D(new IOException("SERVICE_NOT_AVAILABLE"))).c(this.f, new do0(24, this));
    }

    public final boolean g() {
        Context context = this.b;
        sf5.J(context);
        if (Build.VERSION.SDK_INT < 29) {
            Log.isLoggable("FirebaseMessaging", 3);
            return false;
        }
        if (Binder.getCallingUid() != context.getApplicationInfo().uid) {
            Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
            return false;
        }
        if ("com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
            Log.isLoggable("FirebaseMessaging", 3);
            if (this.a.b(hx.class) != null) {
                return true;
            }
            if (zni.r() && k != null) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void h(long j2) {
        b(new s0h(this, Math.min(Math.max(30L, 2 * j2), 28800L)), j2);
        this.i = true;
    }

    public final boolean i(g5e g5eVar) {
        if (g5eVar != null) {
            return System.currentTimeMillis() > g5eVar.a + 604800000 || !this.h.b().equals((String) g5eVar.c);
        }
        return true;
    }
}
