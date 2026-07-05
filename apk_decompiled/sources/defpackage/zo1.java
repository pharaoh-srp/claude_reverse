package defpackage;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import io.sentry.w6;
import io.sentry.y4;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class zo1 {
    public final boolean A;
    public volatile bp1 B;
    public ExecutorService C;
    public final Long D;
    public final pwj E;
    public final String c;
    public final String d;
    public volatile y4 f;
    public final Context g;
    public final cbf h;
    public volatile ksj i;
    public volatile uxj j;
    public boolean k;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public final a5 y;
    public final boolean z;
    public final Object a = new Object();
    public volatile int b = 0;
    public final Handler e = new Handler(Looper.getMainLooper());
    public int l = 0;

    public zo1(a5 a5Var, Context context, txd txdVar, yo1 yo1Var) {
        long jNextLong = new Random().nextLong();
        this.D = Long.valueOf(jNextLong);
        this.E = evj.a;
        this.c = "8.3.0";
        String strH = h();
        this.d = strH;
        this.g = context.getApplicationContext();
        atk atkVarZ = itk.z();
        atkVarZ.b();
        itk.x((itk) atkVarZ.F);
        if (strH != null) {
            atkVarZ.b();
            itk.y((itk) atkVarZ.F, strH);
        }
        String packageName = this.g.getPackageName();
        atkVarZ.b();
        itk.q((itk) atkVarZ.F, packageName);
        atkVarZ.b();
        itk.D((itk) atkVarZ.F, jNextLong);
        boolean z = yo1Var.d;
        atkVarZ.b();
        itk.w((itk) atkVarZ.F, z);
        int i = Build.VERSION.SDK_INT;
        atkVarZ.b();
        itk.A((itk) atkVarZ.F, i);
        atkVarZ.c();
        x(atkVarZ, context);
        try {
            int i2 = this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode;
            atkVarZ.b();
            itk.B((itk) atkVarZ.F, i2);
        } catch (Throwable th) {
            jyj.i("BillingClient", "Error getting app version code.", th);
        }
        this.h = new cbf(this.g, (itk) atkVarZ.a());
        if (txdVar == null) {
            jyj.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f = new y4(this.g, txdVar, this.h);
        this.y = a5Var;
        this.A = false;
        this.g.getPackageName();
        this.z = yo1Var.d;
    }

    public static Future f(Callable callable, long j, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future futureSubmit = executorService.submit(callable);
            handler.postDelayed(new s2k(futureSubmit, 12, runnable), (long) (j * 0.95d));
            return futureSubmit;
        } catch (Exception e) {
            jyj.i("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    public static String h() {
        try {
            return (String) ez1.class.getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void j(zo1 zo1Var, int i) {
        if (i != 0) {
            zo1Var.s(0);
            return;
        }
        synchronized (zo1Var.a) {
            try {
                if (zo1Var.b == 3) {
                    return;
                }
                zo1Var.s(2);
                y4 y4Var = zo1Var.f != null ? zo1Var.f : null;
                if (y4Var != null) {
                    boolean z = zo1Var.v;
                    IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                    IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                    intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                    y4Var.a = z;
                    lpj lpjVar = (lpj) y4Var.f;
                    Context context = (Context) y4Var.b;
                    lpjVar.a(context, intentFilter2);
                    boolean z2 = y4Var.a;
                    lpj lpjVar2 = (lpj) y4Var.e;
                    if (!z2) {
                        lpjVar2.a(context, intentFilter);
                        return;
                    }
                    synchronized (lpjVar2) {
                        try {
                            if (lpjVar2.b) {
                                return;
                            }
                            if (Build.VERSION.SDK_INT >= 33) {
                                context.registerReceiver(lpjVar2, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != lpjVar2.c ? 4 : 2);
                            } else {
                                context.registerReceiver(lpjVar2, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                            }
                            lpjVar2.b = true;
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    public static final void x(atk atkVar, Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                int i = (int) (memoryInfo.totalMem / w6.MAX_EVENT_SIZE_BYTES);
                atkVar.b();
                itk.v((itk) atkVar.F, i);
                String str = Build.BRAND;
                atkVar.b();
                itk.r((itk) atkVar.F);
                String str2 = Build.MODEL;
                atkVar.b();
                itk.u((itk) atkVar.F);
                String str3 = Build.MANUFACTURER;
                atkVar.b();
                itk.t((itk) atkVar.F);
                String str4 = Build.FINGERPRINT;
                atkVar.b();
                itk.s((itk) atkVar.F);
            }
        } catch (RuntimeException e) {
            jyj.i("BillingClient", "Runtime error while populating device info.", e);
        }
    }

    public final void A(int i, hp1 hp1Var, long j) {
        try {
            int i2 = a3k.a;
            try {
                this.h.x(a3k.b(i, 2, hp1Var, null, isk.BROADCAST_ACTION_UNSPECIFIED), this.l, j);
            } catch (Throwable th) {
                jyj.i("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            jyj.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void B(int i, int i2, hp1 hp1Var, String str) {
        try {
            int i3 = a3k.a;
            p(a3k.b(i, i2, hp1Var, str, isk.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            jyj.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void C(int i, hp1 hp1Var, long j, boolean z) {
        try {
            int i2 = a3k.a;
            try {
                this.h.z(a3k.b(i, 2, hp1Var, null, isk.BROADCAST_ACTION_UNSPECIFIED), this.l, j, z);
            } catch (Throwable th) {
                jyj.i("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            jyj.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void D(int i, hp1 hp1Var, String str, long j, boolean z) {
        try {
            int i2 = a3k.a;
            try {
                this.h.z(a3k.b(i, 2, hp1Var, str, isk.BROADCAST_ACTION_UNSPECIFIED), this.l, j, z);
            } catch (Throwable th) {
                jyj.i("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            jyj.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void E(hp1 hp1Var) {
        if (Thread.interrupted()) {
            return;
        }
        this.e.post(new s2k(this, 11, hp1Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            r6 = this;
            int r0 = defpackage.a3k.a     // Catch: java.lang.Throwable -> Le
            isk r0 = defpackage.isk.BROADCAST_ACTION_UNSPECIFIED     // Catch: java.lang.Throwable -> Le
            r1 = 12
            irk r0 = defpackage.a3k.c(r1, r0)     // Catch: java.lang.Throwable -> Le
            r6.q(r0)     // Catch: java.lang.Throwable -> Le
            goto L16
        Le:
            r0 = move-exception
            java.lang.String r1 = "BillingClient"
            java.lang.String r2 = "Unable to log."
            defpackage.jyj.i(r1, r2, r0)
        L16:
            java.lang.Object r0 = r6.a
            monitor-enter(r0)
            io.sentry.y4 r1 = r6.f     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L3a
            io.sentry.y4 r1 = r6.f     // Catch: java.lang.Throwable -> L32
            java.lang.Object r2 = r1.e     // Catch: java.lang.Throwable -> L32
            lpj r2 = (defpackage.lpj) r2     // Catch: java.lang.Throwable -> L32
            java.lang.Object r3 = r1.b     // Catch: java.lang.Throwable -> L32
            android.content.Context r3 = (android.content.Context) r3     // Catch: java.lang.Throwable -> L32
            r2.c(r3)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.f     // Catch: java.lang.Throwable -> L32
            lpj r1 = (defpackage.lpj) r1     // Catch: java.lang.Throwable -> L32
            r1.c(r3)     // Catch: java.lang.Throwable -> L32
            goto L3a
        L32:
            r1 = move-exception
            java.lang.String r2 = "BillingClient"
            java.lang.String r3 = "There was an exception while shutting down broadcast manager while ending connection!"
            defpackage.jyj.i(r2, r3, r1)     // Catch: java.lang.Throwable -> L63
        L3a:
            java.lang.String r1 = "BillingClient"
            java.lang.String r2 = "Unbinding from service."
            defpackage.jyj.g(r1, r2)     // Catch: java.lang.Throwable -> L45
            r6.u()     // Catch: java.lang.Throwable -> L45
            goto L4d
        L45:
            r1 = move-exception
            java.lang.String r2 = "BillingClient"
            java.lang.String r3 = "There was an exception while unbinding from the service while ending connection!"
            defpackage.jyj.i(r2, r3, r1)     // Catch: java.lang.Throwable -> L63
        L4d:
            r1 = 3
            r2 = 0
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L67
            java.util.concurrent.ExecutorService r3 = r6.C     // Catch: java.lang.Throwable -> L5b
            if (r3 == 0) goto L59
            r3.shutdownNow()     // Catch: java.lang.Throwable -> L5b
            r6.C = r2     // Catch: java.lang.Throwable -> L5b
        L59:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L67
            goto L5d
        L5b:
            r3 = move-exception
            goto L65
        L5d:
            r6.s(r1)     // Catch: java.lang.Throwable -> L63
            r6.B = r2     // Catch: java.lang.Throwable -> L63
            goto L70
        L63:
            r6 = move-exception
            goto L79
        L65:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L5b
            throw r3     // Catch: java.lang.Throwable -> L67
        L67:
            r3 = move-exception
            java.lang.String r4 = "BillingClient"
            java.lang.String r5 = "There was an exception while shutting down the executor service while ending connection!"
            defpackage.jyj.i(r4, r5, r3)     // Catch: java.lang.Throwable -> L72
            goto L5d
        L70:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L63
            return
        L72:
            r3 = move-exception
            r6.s(r1)     // Catch: java.lang.Throwable -> L63
            r6.B = r2     // Catch: java.lang.Throwable -> L63
            throw r3     // Catch: java.lang.Throwable -> L63
        L79:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L63
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zo1.a():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0531 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r26v0, types: [zo1] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v56 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v0, types: [long] */
    /* JADX WARN: Type inference failed for: r5v1, types: [long] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.hp1 b(android.app.Activity r27, final defpackage.fp1 r28) {
        /*
            Method dump skipped, instruction units count: 1472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zo1.b(android.app.Activity, fp1):hp1");
    }

    public void c(ro6 ro6Var, ap1 ap1Var) {
        int i = 1;
        if (f(new rqj(this, ap1Var, ro6Var, i), 30000L, new t08(this, 11, ap1Var), k(), e()) == null) {
            hp1 hp1VarN = n();
            z(25, 7, hp1VarN);
            szj szjVarP = txj.p();
            txj.p();
            ap1Var.a(hp1VarN, new xzd(i, szjVarP));
        }
    }

    public void d(bp1 bp1Var) {
        t(bp1Var, 0);
    }

    public final synchronized ExecutorService e() {
        try {
            if (this.C == null) {
                this.C = Executors.newFixedThreadPool(jyj.a, new pe9(this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.C;
    }

    public final void g() {
        if (TextUtils.isEmpty(null)) {
            this.g.getPackageName();
        }
    }

    public final void i(z22 z22Var, hp1 hp1Var, int i, Exception exc) {
        jyj.i("BillingClient", "getBillingConfig got an exception.", exc);
        B(i, 13, hp1Var, a3k.a(exc));
        z22Var.b(hp1Var, null);
    }

    public final Handler k() {
        return Looper.myLooper() == null ? this.e : new Handler(Looper.myLooper());
    }

    public final s20 l(hp1 hp1Var, int i, String str, Exception exc) {
        jyj.i("BillingClient", str, exc);
        B(i, 7, hp1Var, a3k.a(exc));
        return new s20(hp1Var.a, hp1Var.c, new ArrayList(), new ArrayList());
    }

    public final hp1 m(int i) {
        jyj.g("BillingClient", "Service connection is valid. No need to re-initialize.");
        qqk qqkVarQ = irk.q();
        qqkVarQ.g(6);
        owk owkVarP = swk.p();
        owkVarP.b();
        swk.u((swk) owkVarP.F);
        owkVarP.c(i > 0);
        owkVarP.d(i);
        qqkVarQ.f(owkVarP);
        q((irk) qqkVarQ.a());
        return y3k.g;
    }

    public final hp1 n() {
        int[] iArr = {0, 3};
        synchronized (this.a) {
            for (int i = 0; i < 2; i++) {
                if (this.b == iArr[i]) {
                    return y3k.h;
                }
            }
            return y3k.f;
        }
    }

    public final x3k o(int i) {
        if (this.z && !w()) {
            return osk.u(new at(this, i, 14));
        }
        jyj.g("BillingClient", "Already connected or not opted into auto reconnection.");
        return spk.h(y3k.g);
    }

    public final void p(lqk lqkVar) {
        try {
            this.h.w(lqkVar, this.l);
        } catch (Throwable th) {
            jyj.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void q(irk irkVar) {
        try {
            cbf cbfVar = this.h;
            int i = this.l;
            cbfVar.getClass();
            try {
                atk atkVar = (atk) ((itk) cbfVar.F).l();
                atkVar.b();
                itk.C((itk) atkVar.F, i);
                itk itkVar = (itk) atkVar.a();
                cbfVar.F = itkVar;
                try {
                    cbfVar.E(irkVar, itkVar);
                } catch (Throwable th) {
                    jyj.i("BillingLogger", "Unable to log.", th);
                }
            } catch (Throwable th2) {
                jyj.i("BillingLogger", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            jyj.i("BillingClient", "Unable to log.", th3);
        }
    }

    public final void r(int i, int i2, hp1 hp1Var) {
        try {
            int i3 = a3k.a;
            hqk hqkVar = (hqk) a3k.b(i, 6, hp1Var, null, isk.BROADCAST_ACTION_UNSPECIFIED).l();
            owk owkVarP = swk.p();
            owkVarP.c(i2 > 0);
            owkVarP.d(i2);
            hqkVar.d(owkVarP);
            p((lqk) hqkVar.a());
        } catch (Throwable th) {
            jyj.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void s(int i) {
        synchronized (this.a) {
            try {
                if (this.b == 3) {
                    return;
                }
                int i2 = this.b;
                jyj.g("BillingClient", "Setting clientState from " + (i2 != 0 ? i2 != 1 ? i2 != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED") + " to " + (i != 0 ? i != 1 ? i != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED"));
                this.b = i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void t(bp1 bp1Var, int i) {
        int i2;
        hp1 hp1VarM;
        hp1 hp1Var;
        synchronized (this.a) {
            try {
                if (w()) {
                    hp1VarM = m(i);
                } else {
                    if (this.b == 1) {
                        jyj.h("BillingClient", "Client is already in the process of connecting to billing service.");
                        hp1Var = y3k.c;
                        r(37, i, hp1Var);
                    } else if (this.b == 3) {
                        jyj.h("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                        hp1Var = y3k.h;
                        r(38, i, hp1Var);
                    } else {
                        s(1);
                        if (i == 0) {
                            this.B = bp1Var;
                            i = 0;
                        }
                        u();
                        jyj.g("BillingClient", "Starting in-app billing setup.");
                        this.j = new uxj(this, bp1Var, i);
                        uxj uxjVar = this.j;
                        synchronized (uxjVar.I.a) {
                            hwj hwjVar = uxjVar.F;
                            hwjVar.c = 0L;
                            hwjVar.b = false;
                            hwjVar.a();
                        }
                        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                        intent.setPackage("com.android.vending");
                        List<ResolveInfo> listQueryIntentServices = this.g.getPackageManager().queryIntentServices(intent, 0);
                        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                            i2 = 41;
                        } else {
                            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                            i2 = 40;
                            if (serviceInfo != null) {
                                String str = serviceInfo.packageName;
                                String str2 = serviceInfo.name;
                                if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                    jyj.h("BillingClient", "The device doesn't have valid Play Store.");
                                } else {
                                    ComponentName componentName = new ComponentName(str, str2);
                                    Intent intent2 = new Intent(intent);
                                    intent2.setComponent(componentName);
                                    intent2.putExtra("playBillingLibraryVersion", this.c);
                                    synchronized (this.a) {
                                        try {
                                            if (this.b == 2) {
                                                hp1VarM = m(i);
                                            } else if (this.b != 1) {
                                                jyj.h("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                                hp1Var = y3k.h;
                                                r(105, i, hp1Var);
                                            } else {
                                                uxj uxjVar2 = this.j;
                                                if ((i <= 0 || Build.VERSION.SDK_INT < 29) ? this.g.bindService(intent2, uxjVar2, 1) : this.g.bindService(intent2, 1, e(), uxjVar2)) {
                                                    jyj.g("BillingClient", "Service was bonded successfully.");
                                                    hp1VarM = null;
                                                } else {
                                                    jyj.h("BillingClient", "Connection to Billing service is blocked.");
                                                    i2 = 39;
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                }
                            } else {
                                jyj.h("BillingClient", "The device doesn't have valid Play Store.");
                            }
                        }
                        s(0);
                        jyj.g("BillingClient", "Billing service unavailable on device.");
                        hp1 hp1Var2 = y3k.a;
                        r(i2, i, hp1Var2);
                        hp1VarM = hp1Var2;
                    }
                    hp1VarM = hp1Var;
                }
            } finally {
            }
        }
        if (hp1VarM != null) {
            bp1Var.d(hp1VarM);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u() {
        synchronized (this.a) {
            if (this.j != null) {
                try {
                    this.g.unbindService(this.j);
                } catch (Throwable th) {
                    try {
                        jyj.i("BillingClient", "There was an exception while unbinding service!", th);
                        this.i = null;
                        this.j = null;
                    } finally {
                        this.i = null;
                        this.j = null;
                    }
                }
            }
        }
    }

    public final boolean v() {
        long jMax;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        pwj pwjVar = this.E;
        if (pwjVar == null) {
            mr9.h("ticker");
            return false;
        }
        long jB = pwjVar.b();
        long j = 30000;
        int i = 1;
        long jB2 = 30000;
        while (i <= 3) {
            try {
                jMax = Math.max(0L, jB2);
            } catch (Exception e) {
                if (e instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                jyj.i("BillingClient", "Error during reconnection attempt: ", e);
            }
            if (jMax <= 0) {
                jyj.h("BillingClient", "No time remaining for reconnection attempt.");
                return w();
            }
            int i2 = ((hp1) o(i).get(jMax, timeUnit)).a;
            if (i2 == 0) {
                jyj.g("BillingClient", "Reconnection succeeded with result: " + i2);
                return w();
            }
            jyj.h("BillingClient", "Reconnection failed with result: " + i2);
            jB2 = j - (((pwjVar.b() - jB) + 0) / 1000000);
            long j2 = j;
            long jPow = ((long) Math.pow(2.0d, i - 1)) * 1000;
            if (jB2 < jPow) {
                jyj.h("BillingClient", "Reconnection failed due to timeout limit reached.");
                return w();
            }
            if (i < 3 && jPow > 0) {
                try {
                    Thread.sleep(jPow);
                    jB2 = j2 - (((pwjVar.b() - jB) + 0) / 1000000);
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    jyj.i("BillingClient", "Error sleeping during reconnection attempt: ", e2);
                }
            }
            i++;
            j = j2;
        }
        jyj.h("BillingClient", "Max retries reached.");
        return w();
    }

    public final boolean w() {
        boolean z;
        synchronized (this.a) {
            try {
                z = false;
                if (this.b == 2 && this.i != null && this.j != null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    public final dke y(hp1 hp1Var, int i, String str, Exception exc) {
        B(i, 9, hp1Var, a3k.a(exc));
        jyj.i("BillingClient", str, exc);
        return new dke(hp1Var, null, false);
    }

    public final void z(int i, int i2, hp1 hp1Var) {
        try {
            int i3 = a3k.a;
            p(a3k.b(i, i2, hp1Var, null, isk.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            jyj.i("BillingClient", "Unable to log.", th);
        }
    }

    public zo1(a5 a5Var, Context context, yo1 yo1Var) {
        long jNextLong = new Random().nextLong();
        this.D = Long.valueOf(jNextLong);
        this.E = evj.a;
        this.c = "8.3.0";
        String strH = h();
        this.d = strH;
        this.g = context.getApplicationContext();
        atk atkVarZ = itk.z();
        atkVarZ.b();
        itk.x((itk) atkVarZ.F);
        if (strH != null) {
            atkVarZ.b();
            itk.y((itk) atkVarZ.F, strH);
        }
        String packageName = this.g.getPackageName();
        atkVarZ.b();
        itk.q((itk) atkVarZ.F, packageName);
        atkVarZ.b();
        itk.D((itk) atkVarZ.F, jNextLong);
        boolean z = yo1Var.d;
        atkVarZ.b();
        itk.w((itk) atkVarZ.F, z);
        int i = Build.VERSION.SDK_INT;
        atkVarZ.b();
        itk.A((itk) atkVarZ.F, i);
        atkVarZ.c();
        x(atkVarZ, context);
        try {
            int i2 = this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode;
            atkVarZ.b();
            itk.B((itk) atkVarZ.F, i2);
        } catch (Throwable th) {
            jyj.i("BillingClient", "Error getting app version code.", th);
        }
        this.h = new cbf(this.g, (itk) atkVarZ.a());
        jyj.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f = new y4(this.g, null, this.h);
        this.y = a5Var;
        this.g.getPackageName();
        this.z = yo1Var.d;
    }
}
