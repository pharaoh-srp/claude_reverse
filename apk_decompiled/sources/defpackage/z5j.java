package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.stats.zzi;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class z5j {
    public static volatile ScheduledExecutorService n;
    public static final Object o = new Object();
    public final Object a;
    public final PowerManager.WakeLock b;
    public int c;
    public ScheduledFuture d;
    public long e;
    public final HashSet f;
    public boolean g;
    public euj h;
    public final ql8 i;
    public final String j;
    public final HashMap k;
    public final AtomicInteger l;
    public final ScheduledExecutorService m;

    public z5j(Context context) {
        boolean zBooleanValue;
        String packageName = context.getPackageName();
        this.a = new Object();
        this.c = 0;
        this.f = new HashSet();
        this.g = true;
        this.i = ql8.G;
        this.k = new HashMap();
        this.l = new AtomicInteger(0);
        dgj.t("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.h = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.j = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new zzi(sb.toString());
        }
        this.b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        Method method = qgj.a;
        synchronized (qgj.class) {
            Boolean bool = qgj.e;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = x44.x(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
                qgj.e = Boolean.valueOf(zBooleanValue);
            }
        }
        if (zBooleanValue) {
            int i = zrg.a;
            packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfoC = nij.a(context).C(0, packageName);
                    if (applicationInfoC == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i2 = applicationInfoC.uid;
                        workSource = new WorkSource();
                        qgj.a(workSource, i2, packageName);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                }
            }
            if (workSource != null) {
                try {
                    this.b.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                    Log.wtf("WakeLock", e.toString());
                }
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = n;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (o) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = n;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        n = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.m = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    public final void a() {
        this.l.incrementAndGet();
        long jMin = Math.min(60000L, Math.max(Math.min(Long.MAX_VALUE, 31622400000L), 1L));
        synchronized (this.a) {
            try {
                if (!b()) {
                    this.h = euj.E;
                    this.b.acquire();
                    this.i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.c++;
                if (this.g) {
                    TextUtils.isEmpty(null);
                }
                oyj oyjVar = (oyj) this.k.get(null);
                if (oyjVar == null) {
                    oyjVar = new oyj();
                    this.k.put(null, oyjVar);
                }
                oyjVar.a++;
                this.i.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = Long.MAX_VALUE - jElapsedRealtime > jMin ? jElapsedRealtime + jMin : Long.MAX_VALUE;
                if (j > this.e) {
                    this.e = j;
                    ScheduledFuture scheduledFuture = this.d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.d = this.m.schedule(new k51(16, this), jMin, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (this.a) {
            z = this.c > 0;
        }
        return z;
    }

    public final void c() {
        if (this.l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.j).concat(" release without a matched acquire!"));
        }
        synchronized (this.a) {
            try {
                if (this.g) {
                    TextUtils.isEmpty(null);
                }
                if (this.k.containsKey(null)) {
                    oyj oyjVar = (oyj) this.k.get(null);
                    if (oyjVar != null) {
                        int i = oyjVar.a - 1;
                        oyjVar.a = i;
                        if (i == 0) {
                            this.k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        mr9.o();
    }

    public final void e() {
        synchronized (this.a) {
            try {
                if (b()) {
                    if (this.g) {
                        int i = this.c - 1;
                        this.c = i;
                        if (i > 0) {
                            return;
                        }
                    } else {
                        this.c = 0;
                    }
                    d();
                    Iterator it = this.k.values().iterator();
                    while (it.hasNext()) {
                        ((oyj) it.next()).a = 0;
                    }
                    this.k.clear();
                    ScheduledFuture scheduledFuture = this.d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.d = null;
                        this.e = 0L;
                    }
                    if (this.b.isHeld()) {
                        try {
                            try {
                                this.b.release();
                                if (this.h != null) {
                                    this.h = null;
                                }
                            } catch (RuntimeException e) {
                                if (!e.getClass().equals(RuntimeException.class)) {
                                    throw e;
                                }
                                Log.e("WakeLock", String.valueOf(this.j).concat(" failed to release!"), e);
                                if (this.h != null) {
                                    this.h = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.h != null) {
                                this.h = null;
                            }
                            throw th;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.j).concat(" should be held!"));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
