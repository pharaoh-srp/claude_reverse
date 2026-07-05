package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.kd4;
import defpackage.nj5;
import io.sentry.a6;
import io.sentry.t5;
import io.sentry.w4;
import io.sentry.y6;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class r0 implements io.sentry.i0 {
    public final Context E;
    public final l0 F;
    public final SentryAndroidOptions G;
    public final Future H;

    public r0(Context context, l0 l0Var, SentryAndroidOptions sentryAndroidOptions) {
        Future futureSubmit;
        new io.sentry.util.a();
        Context applicationContext = context.getApplicationContext();
        this.E = applicationContext != null ? applicationContext : context;
        this.F = l0Var;
        io.sentry.p.v("The options object is required.", sentryAndroidOptions);
        this.G = sentryAndroidOptions;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        try {
            futureSubmit = executorServiceNewSingleThreadExecutor.submit(new nj5(this, 2, sentryAndroidOptions));
        } catch (RejectedExecutionException e) {
            sentryAndroidOptions.getLogger().d(t5.WARNING, "Device info caching task rejected.", e);
            futureSubmit = null;
        }
        this.H = futureSubmit;
        executorServiceNewSingleThreadExecutor.shutdown();
    }

    public final void a(w4 w4Var, io.sentry.n0 n0Var) {
        PackageInfo packageInfo;
        Boolean bool;
        io.sentry.protocol.a aVarD = w4Var.F.d();
        if (aVarD == null) {
            aVarD = new io.sentry.protocol.a();
        }
        aVarD.I = (String) p0.c.a(this.E);
        io.sentry.android.core.performance.i iVarB = io.sentry.android.core.performance.h.c().b(this.G);
        u0 u0Var = null;
        if (iVarB.b()) {
            aVarD.F = (iVarB.b() ? new a6(iVarB.F * 1000000) : null) == null ? null : io.sentry.p.l(Double.valueOf(r2.E / 1000000.0d).longValue());
        }
        if (!io.sentry.util.c.f(n0Var) && aVarD.O == null && (bool = f0.I.H) != null) {
            aVarD.O = Boolean.valueOf(!bool.booleanValue());
        }
        Context context = this.E;
        SentryAndroidOptions sentryAndroidOptions = this.G;
        io.sentry.a1 logger = sentryAndroidOptions.getLogger();
        l0 l0Var = this.F;
        try {
            l0Var.getClass();
            packageInfo = Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(4096L)) : context.getPackageManager().getPackageInfo(context.getPackageName(), FreeTypeConstants.FT_LOAD_MONOCHROME);
        } catch (Throwable th) {
            logger.d(t5.ERROR, "Error getting package info.", th);
            packageInfo = null;
        }
        if (packageInfo != null) {
            String strE = p0.e(packageInfo, l0Var);
            if (w4Var.P == null) {
                w4Var.P = strE;
            }
            Future future = this.H;
            if (future != null) {
                try {
                    u0Var = (u0) future.get();
                } catch (Throwable th2) {
                    sentryAndroidOptions.getLogger().d(t5.ERROR, "Failed to retrieve device info", th2);
                }
            } else {
                sentryAndroidOptions.getLogger().h(t5.ERROR, "Failed to retrieve device info", new Object[0]);
            }
            aVarD.E = packageInfo.packageName;
            aVarD.J = packageInfo.versionName;
            aVarD.K = p0.e(packageInfo, l0Var);
            HashMap map = new HashMap();
            String[] strArr = packageInfo.requestedPermissions;
            int[] iArr = packageInfo.requestedPermissionsFlags;
            if (strArr != null && strArr.length > 0 && iArr != null && iArr.length > 0) {
                for (int i = 0; i < strArr.length; i++) {
                    String str = strArr[i];
                    map.put(str.substring(str.lastIndexOf(46) + 1), (iArr[i] & 2) == 2 ? "granted" : "not_granted");
                }
            }
            aVarD.L = map;
            if (u0Var != null) {
                try {
                    kd4 kd4Var = u0Var.f;
                    if (kd4Var != null) {
                        aVarD.P = Boolean.valueOf(kd4Var.a);
                        String[] strArr2 = (String[]) kd4Var.b;
                        if (strArr2 != null) {
                            aVarD.Q = Arrays.asList(strArr2);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
        w4Var.F.m(aVarD);
    }

    public final void b(w4 w4Var, boolean z, boolean z2) {
        io.sentry.protocol.i0 i0Var = w4Var.M;
        if (i0Var == null) {
            i0Var = new io.sentry.protocol.i0();
            w4Var.M = i0Var;
        }
        if (i0Var.F == null) {
            i0Var.F = z0.a(this.E);
        }
        String str = i0Var.H;
        SentryAndroidOptions sentryAndroidOptions = this.G;
        if (str == null && sentryAndroidOptions.isSendDefaultPii()) {
            i0Var.H = "{{auto}}";
        }
        io.sentry.protocol.e eVar = w4Var.F;
        io.sentry.protocol.h hVarE = eVar.e();
        Future future = this.H;
        if (hVarE == null) {
            if (future != null) {
                try {
                    eVar.o(((u0) future.get()).a(z, z2));
                } catch (Throwable th) {
                    sentryAndroidOptions.getLogger().d(t5.ERROR, "Failed to retrieve device info", th);
                }
            } else {
                sentryAndroidOptions.getLogger().h(t5.ERROR, "Failed to retrieve device info", new Object[0]);
            }
            io.sentry.protocol.q qVarG = eVar.g();
            if (future != null) {
                try {
                    eVar.r(((u0) future.get()).g);
                } catch (Throwable th2) {
                    sentryAndroidOptions.getLogger().d(t5.ERROR, "Failed to retrieve os system", th2);
                }
            } else {
                sentryAndroidOptions.getLogger().h(t5.ERROR, "Failed to retrieve device info", new Object[0]);
            }
            if (qVarG != null) {
                String str2 = qVarG.E;
                eVar.k((str2 == null || str2.isEmpty()) ? "os_1" : "os_" + str2.trim().toLowerCase(Locale.ROOT), qVarG);
            }
        }
        if (future == null) {
            sentryAndroidOptions.getLogger().h(t5.ERROR, "Failed to retrieve device info", new Object[0]);
            return;
        }
        try {
            kd4 kd4Var = ((u0) future.get()).e;
            if (kd4Var != null) {
                HashMap map = new HashMap();
                map.put("isSideLoaded", String.valueOf(kd4Var.a));
                String str3 = (String) kd4Var.b;
                if (str3 != null) {
                    map.put("installerStore", str3);
                }
                for (Map.Entry entry : map.entrySet()) {
                    w4Var.c((String) entry.getKey(), (String) entry.getValue());
                }
            }
        } catch (Throwable th3) {
            sentryAndroidOptions.getLogger().d(t5.ERROR, "Error getting side loaded info.", th3);
        }
    }

    @Override // io.sentry.i0
    public final y6 c(y6 y6Var, io.sentry.n0 n0Var) {
        boolean zF = f(y6Var, n0Var);
        if (zF) {
            a(y6Var, n0Var);
        }
        b(y6Var, false, zF);
        return y6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    @Override // io.sentry.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.sentry.j5 d(io.sentry.j5 r10, io.sentry.n0 r11) {
        /*
            r9 = this;
            boolean r0 = r9.f(r10, r11)
            r1 = 1
            if (r0 == 0) goto L6a
            r9.a(r10, r11)
            java.util.ArrayList r2 = r10.f()
            if (r2 == 0) goto L6a
            boolean r11 = io.sentry.util.c.f(r11)
            java.util.ArrayList r2 = r10.f()
            java.util.Iterator r2 = r2.iterator()
        L1c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L6a
            java.lang.Object r3 = r2.next()
            io.sentry.protocol.d0 r3 = (io.sentry.protocol.d0) r3
            io.sentry.android.core.internal.util.f r4 = io.sentry.android.core.internal.util.f.a
            r4.getClass()
            java.lang.Long r4 = r3.E
            if (r4 == 0) goto L52
            long r4 = r4.longValue()
            android.os.Looper r6 = android.os.Looper.getMainLooper()
            java.lang.Thread r6 = r6.getThread()
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 36
            if (r7 < r8) goto L48
            long r6 = defpackage.cz1.b(r6)
            goto L4c
        L48:
            long r6 = r6.getId()
        L4c:
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 != 0) goto L52
            r4 = r1
            goto L53
        L52:
            r4 = 0
        L53:
            java.lang.Boolean r5 = r3.J
            if (r5 != 0) goto L5d
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            r3.J = r5
        L5d:
            if (r11 != 0) goto L1c
            java.lang.Boolean r5 = r3.L
            if (r5 != 0) goto L1c
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r3.L = r4
            goto L1c
        L6a:
            r9.b(r10, r1, r0)
            java.util.ArrayList r9 = r10.e()
            if (r9 == 0) goto Lb3
            int r11 = r9.size()
            if (r11 <= r1) goto Lb3
            int r11 = r9.size()
            int r11 = r11 - r1
            java.lang.Object r11 = r9.get(r11)
            io.sentry.protocol.v r11 = (io.sentry.protocol.v) r11
            java.lang.String r0 = "java.lang"
            java.lang.String r1 = r11.G
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb3
            io.sentry.protocol.c0 r11 = r11.I
            if (r11 == 0) goto Lb3
            java.util.List r11 = r11.E
            if (r11 == 0) goto Lb3
            java.util.Iterator r11 = r11.iterator()
        L9a:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Lb3
            java.lang.Object r0 = r11.next()
            io.sentry.protocol.a0 r0 = (io.sentry.protocol.a0) r0
            java.lang.String r1 = "com.android.internal.os.RuntimeInit$MethodAndArgsCaller"
            java.lang.String r0 = r0.J
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9a
            java.util.Collections.reverse(r9)
        Lb3:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.r0.d(io.sentry.j5, io.sentry.n0):io.sentry.j5");
    }

    @Override // io.sentry.i0
    public final io.sentry.protocol.e0 e(io.sentry.protocol.e0 e0Var, io.sentry.n0 n0Var) {
        boolean zF = f(e0Var, n0Var);
        if (zF) {
            a(e0Var, n0Var);
        }
        b(e0Var, false, zF);
        return e0Var;
    }

    public final boolean f(w4 w4Var, io.sentry.n0 n0Var) {
        if (io.sentry.util.c.m(n0Var)) {
            return true;
        }
        this.G.getLogger().h(t5.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", w4Var.E);
        return false;
    }
}
