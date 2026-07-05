package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.StrictMode;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class qj5 implements k99 {
    public final String a;
    public final String b;
    public final jz1 c;
    public o25 d;
    public Thread e;
    public final ConcurrentHashMap f;
    public final Context g;
    public lp4 h;
    public khd i;
    public final Set j;
    public final h99 k;
    public boolean l;

    public qj5(Context context, String str, String str2) {
        bx bxVar = bx.d0;
        jz1.a.getClass();
        hz1 hz1Var = iz1.b;
        this.a = str;
        this.b = str2;
        this.c = hz1Var;
        this.f = new ConcurrentHashMap();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.g = applicationContext;
        this.h = new i4c();
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        setNewSetFromMap.getClass();
        this.j = setNewSetFromMap;
        this.k = (h99) bxVar.invoke(this);
    }

    @Override // defpackage.k99
    public final long A() {
        qp5 qp5Var = C().b;
        ((iuj) qp5Var.a.a()).getClass();
        return System.nanoTime() - ((Number) qp5Var.b.getValue()).longValue();
    }

    @Override // defpackage.k99
    public final void B(p0j p0jVar) {
        Set set = this.j;
        if (set.contains(p0jVar)) {
            dch.H(this.k, 4, g99.E, new v01(8, p0jVar), null, false, 56);
        }
        for (Map.Entry entry : this.f.entrySet()) {
            Map mapD = D((String) entry.getKey());
            if (!mapD.isEmpty()) {
                String str = (String) entry.getKey();
                str.getClass();
                if (str.equals("rum")) {
                    String str2 = sxe.p;
                    p0jVar.J = zni.y(mapD);
                }
            }
        }
        set.add(p0jVar);
    }

    public final o25 C() {
        o25 o25Var = this.d;
        if (o25Var != null) {
            return o25Var;
        }
        x44.o0("coreFeature");
        throw null;
    }

    public final Map D(String str) {
        str.getClass();
        return (Map) new nj5(this, 0, str).call();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31, types: [android.app.ActivityManager$RunningAppProcessInfo] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v78 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.concurrent.atomic.AtomicBoolean] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17, types: [android.app.ActivityManager] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v54 */
    /* JADX WARN: Type inference failed for: r6v55 */
    /* JADX WARN: Type inference failed for: r6v56 */
    /* JADX WARN: Type inference failed for: r6v57 */
    /* JADX WARN: Type inference failed for: r6v58 */
    /* JADX WARN: Type inference failed for: r6v59, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v60 */
    /* JADX WARN: Type inference failed for: r6v61 */
    /* JADX WARN: Type inference failed for: r6v62 */
    /* JADX WARN: Type inference failed for: r6v64 */
    /* JADX WARN: Type inference failed for: r6v65 */
    /* JADX WARN: Type inference failed for: r6v66 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 3 */
    public final void E(dg4 dg4Var) {
        int i;
        int i2;
        PackageInfo packageInfo;
        String str;
        int i3;
        String str2;
        String str3;
        ?? r0;
        ?? r02;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        Object next;
        ?? r15;
        ?? r6;
        int i4;
        IllegalStateException illegalStateException;
        ?? r62;
        int i5;
        IllegalArgumentException illegalArgumentException;
        ?? r63;
        Runtime runtime;
        Thread thread;
        String str4 = dg4Var.c;
        Pattern patternCompile = Pattern.compile("[a-zA-Z0-9_:./-]{0,195}[a-zA-Z0-9_./-]");
        patternCompile.getClass();
        if (!patternCompile.matcher(str4).matches()) {
            sz6.p("The environment name should contain maximum 196 of the following allowed characters [a-zA-Z0-9_:./-] and should never finish with a semicolon.In this case the Datadog SDK will not be initialised.");
            return;
        }
        int i6 = this.g.getApplicationInfo().flags;
        dg4Var.a.getClass();
        sz6 sz6Var = o25.O;
        h99 h99Var = this.k;
        qp5 qp5Var = new qp5(new l4(9, this));
        sz6 sz6Var2 = o25.O;
        this.d = new o25(h99Var, qp5Var, sz6Var);
        o25 o25VarC = C();
        Context context = this.g;
        String str5 = this.a;
        g99 g99Var = g99.E;
        context.getClass();
        str5.getClass();
        int i7 = 2;
        if (o25VarC.g.get()) {
            r15 = 0;
        } else {
            bg4 bg4Var = dg4Var.a;
            o25VarC.L = bg4Var.c;
            o25VarC.M = bg4Var.d;
            o25VarC.B = bg4Var.f;
            o25VarC.G = bg4Var.h;
            try {
                String packageName = context.getPackageName();
                PackageManager packageManager = context.getPackageManager();
                packageInfo = ((hz1) o25VarC.e).i ? packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(0L)) : packageManager.getPackageInfo(packageName, 0);
                i2 = 5;
                i = 0;
            } catch (PackageManager.NameNotFoundException e) {
                i = 0;
                i2 = 5;
                dch.H(o25VarC.a, 5, g99Var, n.e0, e, false, 48);
                packageInfo = null;
            }
            Integer numValueOf = packageInfo != null ? Integer.valueOf(packageInfo.versionCode) : null;
            String string = dg4Var.h;
            if (string == null) {
                string = packageInfo != null ? packageInfo.versionName : null;
                if (string == null) {
                    string = numValueOf != null ? numValueOf.toString() : null;
                    if (string == null) {
                        string = "?";
                    }
                }
            }
            o25VarC.p = new g11(string, numValueOf != null ? numValueOf.intValue() : i);
            o25VarC.t = dg4Var.b;
            String packageName2 = dg4Var.e;
            if (packageName2 == null) {
                packageName2 = context.getPackageName();
                packageName2.getClass();
            }
            o25VarC.u = packageName2;
            o25VarC.y = dg4Var.c;
            o25VarC.z = dg4Var.d;
            try {
                InputStream inputStreamOpen = context.getAssets().open("datadog.buildId");
                inputStreamOpen.getClass();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, dj2.a), FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
                try {
                    String string2 = bsg.k1(d4c.g0(bufferedReader)).toString();
                    bufferedReader.close();
                    int i8 = i;
                    str3 = null;
                    i3 = i8;
                    str2 = string2;
                } finally {
                }
            } catch (FileNotFoundException unused) {
                i3 = i;
                str = null;
                dch.H(o25VarC.a, 3, g99Var, re4.M, null, false, 56);
                str2 = str;
                str3 = str;
            } catch (Exception e2) {
                int i9 = i;
                dch.I(o25VarC.a, i2, x44.X(g99Var, g99.G), n.g0, e2, 48);
                str = null;
                i3 = i9;
                str2 = str;
                str3 = str;
            }
            o25VarC.C = str2;
            o25VarC.h = new WeakReference(context);
            int iMyPid = Process.myPid();
            Object systemService = context.getSystemService("activity");
            ?? r64 = systemService instanceof ActivityManager ? (ActivityManager) systemService : str3;
            if (r64 == 0 || (runningAppProcesses = r64.getRunningAppProcesses()) == null) {
                r0 = str3;
            } else {
                Iterator it = runningAppProcesses.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((ActivityManager.RunningAppProcessInfo) next).pid == iMyPid) {
                            break;
                        }
                    } else {
                        next = str3;
                        break;
                    }
                }
                r0 = (ActivityManager.RunningAppProcessInfo) next;
            }
            o25VarC.x = r0 == 0 ? true : x44.r(context.getPackageName(), ((ActivityManager.RunningAppProcessInfo) r0).processName);
            if (o25VarC.x) {
                r02 = 1;
            } else {
                r02 = 1;
                dch.H(o25VarC.a, 4, g99Var, n.h0, null, false, 56);
            }
            h99 h99Var2 = o25VarC.a;
            pb1 pb1Var = o25VarC.G;
            if (pb1Var == null) {
                ?? r65 = str3;
                x44.o0("backpressureStrategy");
                throw r65;
            }
            o25VarC.D = new qga(pb1Var, h99Var2, "upload");
            sz6 sz6Var3 = o25VarC.c;
            pb1 pb1Var2 = o25VarC.G;
            if (pb1Var2 == null) {
                ?? r66 = str3;
                x44.o0("backpressureStrategy");
                throw r66;
            }
            iuj iujVar = o25VarC.l;
            sz6Var3.getClass();
            iujVar.getClass();
            o25VarC.E = new ob1(h99Var2, "storage", pb1Var2, iujVar);
            o25VarC.F = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new sb1(o25VarC.a, "context", FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM, Integer.MAX_VALUE, re4.N, bx.a0, 0, o25VarC.l), new vk5("context", i3));
            int i10 = 4;
            v40.p(o25VarC.b(), "NTP Sync initialization", kze.a, new j01(o25VarC, i10, context));
            o25VarC.r = new m25(new mx1(o25VarC, 3, dg4Var.a));
            hr5 hr5Var = o25VarC.i;
            Map map = dg4Var.a.b;
            hr5Var.getClass();
            LinkedHashMap linkedHashMap = hr5Var.a;
            Set<Map.Entry> setEntrySet = map.entrySet();
            int iD0 = tta.d0(x44.y(setEntrySet, 10));
            if (iD0 < 16) {
                iD0 = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iD0);
            for (Map.Entry entry : setEntrySet) {
                String str6 = (String) entry.getKey();
                Locale locale = Locale.US;
                linkedHashMap2.put(ij0.n(locale, str6, locale), entry.getValue());
            }
            hr5Var.a = sta.l0(linkedHashMap, linkedHashMap2);
            o25VarC.q = new mp5(context);
            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                File file = new File(context.getCacheDir(), String.format(Locale.US, "datadog-%s", Arrays.copyOf(new Object[]{str5}, (int) r02)));
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                o25VarC.H = file;
                Object obj = dg4Var.g.get("_dd.native_source_type");
                String str7 = obj instanceof String ? (String) obj : str3;
                if (o25VarC.x) {
                    File fileC = o25VarC.c();
                    ob1 ob1VarB = o25VarC.b();
                    rga rgaVar = new rga(o25VarC.a, r02);
                    h99 h99Var3 = o25VarC.a;
                    n25 n25Var = new n25(o25VarC, i10);
                    String str8 = str7;
                    if (str7 == null) {
                        str8 = "ndk";
                    }
                    jk5 jk5Var = new jk5(fileC, ob1VarB, rgaVar, h99Var3, n25Var, str8);
                    o25VarC.A = jk5Var;
                    v40.p(ob1VarB, "NDK crash check", h99Var3, new y0(6, jk5Var));
                }
                o25VarC.m = new ki6(2);
                gy1 gy1Var = new gy1(o25VarC.a, o25VarC.a());
                o25VarC.k = gy1Var;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
                Intent intentB = gy1Var.b(context, intentFilter);
                if (intentB != null) {
                    gy1Var.d(context, intentB);
                }
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                Intent intentB2 = gy1Var.b(context, intentFilter2);
                if (intentB2 != null) {
                    gy1Var.d(context, intentB2);
                }
                b1c l92Var = ((hz1) o25VarC.e).c ? new l92(o25VarC.a) : new ey1(o25VarC.a, o25VarC.a());
                o25VarC.j = l92Var;
                l92Var.i(context);
                cl5 cl5Var = new cl5();
                cl5Var.E = new xmi(str3, 31);
                o25VarC.n = cl5Var;
                o25VarC.a.getClass();
                o25VarC.o = new ql8(16);
                o25VarC.g.set(r02);
                r15 = str3;
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                throw th;
            }
        }
        this.h = new nyj(C(), 18, new cd(i7, this));
        Map map2 = dg4Var.g;
        Object obj2 = map2.get("_dd.source");
        if (obj2 != null && (obj2 instanceof String) && !bsg.I0((CharSequence) obj2)) {
            C().v = (String) obj2;
        }
        Object obj3 = map2.get("_dd.sdk_version");
        if (obj3 != null && (obj3 instanceof String) && !bsg.I0((CharSequence) obj3)) {
            C().w = (String) obj3;
        }
        Object obj4 = map2.get("_dd.version");
        if (obj4 != null && (obj4 instanceof String) && !bsg.I0((CharSequence) obj4)) {
            C().p.c((String) obj4);
        }
        if (dg4Var.f) {
            d(new dpf(this));
        }
        Context context2 = this.g;
        if (context2 instanceof Application) {
            khd khdVar = new khd(new w3c(context2, this.b, this.k));
            ((Application) context2).registerActivityLifecycleCallbacks(khdVar);
            this.i = khdVar;
        }
        g99 g99Var2 = g99.F;
        try {
            try {
            } catch (SecurityException e3) {
                r63 = r15;
                dch.H(this.k, 5, g99Var2, yf5.Q, e3, false, 48);
            }
        } catch (IllegalArgumentException e4) {
            r62 = r15;
            i5 = 5;
            illegalArgumentException = e4;
        } catch (IllegalStateException e5) {
            r6 = r15;
            i4 = 5;
            illegalStateException = e5;
        }
        try {
            this.e = new Thread(new y0(5, this), "datadog_shutdown");
            runtime = Runtime.getRuntime();
            thread = this.e;
        } catch (IllegalArgumentException e6) {
            illegalArgumentException = e6;
            r62 = r15;
            i5 = 5;
            dch.H(this.k, i5, g99Var2, yf5.P, illegalArgumentException, false, 48);
            r63 = r62;
        } catch (IllegalStateException e7) {
            illegalStateException = e7;
            r6 = r15;
            i4 = 5;
            dch.H(this.k, i4, g99Var2, yf5.O, illegalStateException, false, 48);
            F();
            r63 = r6;
        }
        if (thread == null) {
            x44.o0("shutdownHook");
            throw r15;
        }
        runtime.addShutdownHook(thread);
        r63 = r15;
        j01 j01Var = new j01(this, 8, dg4Var);
        qga qgaVar = C().D;
        if (qgaVar == null) {
            x44.o0("uploadExecutorService");
            throw r63;
        }
        v40.N(qgaVar, "Configuration telemetry", 5000L, this.k, j01Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F() {
        int i;
        int i2;
        int i3;
        IllegalStateException illegalStateException;
        qga qgaVar;
        khd khdVar;
        g99 g99Var = g99.F;
        Iterator it = this.f.keySet().iterator();
        while (true) {
            int i4 = 24;
            i = 23;
            int i5 = 22;
            if (!it.hasNext()) {
                break;
            }
            gbf gbfVar = (gbf) this.f.remove((String) it.next());
            if (gbfVar != null) {
                o25 o25Var = gbfVar.a;
                if7 if7Var = gbfVar.c;
                AtomicBoolean atomicBoolean = gbfVar.f;
                if (atomicBoolean.get()) {
                    if7Var.b();
                    if (if7Var instanceof wk4) {
                        o25Var.m.c((wk4) if7Var);
                    }
                    gbfVar.j.m();
                    gbfVar.j = new a5(i4);
                    gbfVar.h = new efk(23);
                    gbfVar.e = new ql8(i5);
                    gbfVar.i = new vz8(i5);
                    gbfVar.k = new dd8(23);
                    Object obj = o25Var.h.get();
                    Application application = obj instanceof Application ? (Application) obj : null;
                    if (application != null) {
                        application.unregisterActivityLifecycleCallbacks(gbfVar.l);
                    }
                    gbfVar.l = null;
                    gbfVar.n.clear();
                    atomicBoolean.set(false);
                }
            }
        }
        Context context = this.g;
        if ((context instanceof Application) && (khdVar = this.i) != null) {
            ((Application) context).unregisterActivityLifecycleCallbacks(khdVar);
        }
        this.h = new i4c();
        o25 o25VarC = C();
        if (o25VarC.g.get()) {
            Context context2 = (Context) o25VarC.h.get();
            if (context2 != null) {
                o25VarC.j.a(context2);
                o25VarC.k.a(context2);
            }
            o25VarC.h.clear();
            o25VarC.m.b();
            o25VarC.t = "";
            o25VarC.p = new lja(22);
            o25VarC.u = "";
            o25VarC.v = "android";
            o25VarC.w = "3.10.0";
            o25VarC.x = true;
            o25VarC.y = "";
            o25VarC.z = "";
            o25VarC.i = new hr5(0);
            o25VarC.j = new k2e(i);
            o25VarC.k = new lz1(24);
            o25VarC.l = new uu5();
            o25VarC.m = new dd8(22);
            o25VarC.n = new vz8(i);
            o25VarC.q = new lz1(22);
            qga qgaVar2 = o25VarC.D;
            if (qgaVar2 == null) {
                x44.o0("uploadExecutorService");
                throw null;
            }
            qgaVar2.shutdownNow();
            o25VarC.a().shutdownNow();
            o25VarC.b().shutdownNow();
            try {
                try {
                    qgaVar = o25VarC.D;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            } catch (SecurityException e) {
                dch.H(o25VarC.a, 5, g99Var, n.i0, e, false, 48);
            }
            if (qgaVar == null) {
                x44.o0("uploadExecutorService");
                throw null;
            }
            TimeUnit timeUnit = TimeUnit.SECONDS;
            qgaVar.awaitTermination(1L, timeUnit);
            o25VarC.a().awaitTermination(1L, timeUnit);
            o25VarC.b().awaitTermination(1L, timeUnit);
            i2 = 5;
            try {
                hs9 hs9Var = o25VarC.s;
                if (hs9Var != null) {
                    wdg wdgVar = hs9Var.a;
                    wdgVar.a();
                    wdgVar.a.set(udg.G);
                    wdgVar.c.shutdown();
                }
            } catch (IllegalStateException e2) {
                dch.H(o25VarC.a, 4, g99Var, n.j0, e2, false, 48);
            }
            o25VarC.g.set(false);
            o25VarC.A = new unb(23);
            o25VarC.m = new dd8(22);
        } else {
            i2 = 5;
        }
        this.l = false;
        if (this.e == null) {
            return;
        }
        try {
            try {
                Runtime runtime = Runtime.getRuntime();
                try {
                    Thread thread = this.e;
                    if (thread != null) {
                        runtime.removeShutdownHook(thread);
                    } else {
                        x44.o0("shutdownHook");
                        throw null;
                    }
                } catch (IllegalStateException e3) {
                    illegalStateException = e3;
                    i3 = i2;
                    dch.H(this.k, i3, g99Var, yf5.M, illegalStateException, false, 48);
                }
            } catch (IllegalStateException e4) {
                i3 = i2;
                illegalStateException = e4;
            }
        } catch (SecurityException e5) {
            dch.H(this.k, i2, g99Var, yf5.N, e5, false, 48);
        }
    }

    @Override // defpackage.k99
    public final wph a() {
        iuj iujVar = C().l;
        iujVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jY = iujVar.y();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j = jY - jCurrentTimeMillis;
        return new wph(timeUnit.toNanos(jCurrentTimeMillis), timeUnit.toNanos(jY), timeUnit.toNanos(j), j);
    }

    @Override // defpackage.k99
    public final void b() {
        v40.p(C().a(), "DatadogCore.clearUserInfo", this.k, new fc(12, this));
    }

    @Override // defpackage.k99
    public final void c(String str, String str2, Map map) {
        str.getClass();
        Map mapQ0 = sta.q0(map);
        v40.p(C().a(), "DatadogCore.setUserInfo", this.k, new oj5(this, str, str2, mapQ0, 0));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d9 A[PHI: r14
      0x00d9: PHI (r14v19 java.lang.String) = 
      (r14v2 java.lang.String)
      (r14v3 java.lang.String)
      (r14v4 java.lang.String)
      (r14v5 java.lang.String)
      (r14v7 java.lang.String)
      (r14v20 java.lang.String)
     binds: [B:28:0x00d7, B:24:0x00ca, B:58:?, B:57:?, B:56:?, B:9:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.k99
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.if7 r37) {
        /*
            Method dump skipped, instruction units count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qj5.d(if7):void");
    }

    @Override // defpackage.k99
    public final void e(String str, vf7 vf7Var) {
        str.getClass();
        gbf gbfVar = (gbf) this.f.get(str);
        g99 g99Var = g99.E;
        if (gbfVar == null) {
            dch.H(this.k, 4, g99Var, new rb1(str, 8), null, false, 56);
            return;
        }
        AtomicReference atomicReference = gbfVar.g;
        if (atomicReference.get() != null) {
            dch.H(this.k, 4, g99Var, new rb1(str, 9), null, false, 56);
        }
        atomicReference.set(vf7Var);
    }

    @Override // defpackage.k99
    public final List f() {
        return w44.p1(this.f.values());
    }

    @Override // defpackage.k99
    public final a1c g() {
        return C().j.k();
    }

    @Override // defpackage.k99
    public final gbf getFeature(String str) {
        str.getClass();
        return (gbf) this.f.get(str);
    }

    @Override // defpackage.k99
    public final String getName() {
        return this.b;
    }

    @Override // defpackage.k99
    public final void h(l4i l4iVar) {
        v40.p(C().a(), "DatadogCore.setTrackingConsent", this.k, new j01(this, 6, l4iVar));
    }

    @Override // defpackage.k99
    public final void i(p0j p0jVar) {
        p0jVar.getClass();
        this.j.remove(p0jVar);
    }

    @Override // defpackage.k99
    public final Long j() {
        String strP0;
        o25 o25VarC = C();
        File file = new File(o25VarC.c(), "last_fatal_anr_sent");
        h99 h99Var = o25VarC.a;
        if (!fd9.T(file, h99Var) || (strP0 = fd9.p0(file, dj2.a, h99Var)) == null) {
            return null;
        }
        return isg.t0(strP0);
    }

    @Override // defpackage.k99
    public final boolean k() {
        return this.l;
    }

    @Override // defpackage.k99
    public final long l() {
        return ((Number) C().b.b.getValue()).longValue();
    }

    @Override // defpackage.k99
    public final ScheduledExecutorService m(String str) {
        o25 o25VarC = C();
        sz6 sz6Var = o25VarC.d;
        h99 h99Var = o25VarC.a;
        pb1 pb1Var = o25VarC.G;
        if (pb1Var == null) {
            x44.o0("backpressureStrategy");
            throw null;
        }
        sz6Var.getClass();
        h99Var.getClass();
        return new qga(pb1Var, h99Var, str);
    }

    @Override // defpackage.k99
    public final void n(String str) {
        AtomicReference atomicReference;
        str.getClass();
        gbf gbfVar = (gbf) this.f.get(str);
        if (gbfVar == null || (atomicReference = gbfVar.g) == null) {
            return;
        }
        atomicReference.set(null);
    }

    @Override // defpackage.k99
    public final void o(UUID uuid) {
        v40.p(C().a(), "DatadogCore.setAnonymousId", this.k, new j01(this, 7, uuid));
    }

    @Override // defpackage.k99
    public final void p(bz7 bz7Var, String str, boolean z) {
        ag5 ag5Var = new ag5(this, str, bz7Var, 1);
        if (!z) {
            ag5Var.a();
            return;
        }
        v40.p(C().a(), "DatadogCore.updateFeatureContext-".concat(str), this.k, new y0(4, ag5Var));
    }

    @Override // defpackage.k99
    public final String q() {
        return C().u;
    }

    @Override // defpackage.k99
    public final void r(byte[] bArr) {
        if (((hz1) this.c).g || this.f.containsKey("ndk-crash-reporting")) {
            o25 o25VarC = C();
            ((g4d) o25VarC.K.getValue()).h((File) o25VarC.J.getValue(), new x1e(bArr, x1e.c), false);
        } else {
            dch.H(this.k, 3, g99.F, yf5.R, null, false, 56);
        }
    }

    @Override // defpackage.k99
    public final void s(long j) {
        o25 o25VarC = C();
        File file = new File(o25VarC.c(), "last_fatal_anr_sent");
        String strValueOf = String.valueOf(j);
        Charset charset = dj2.a;
        h99 h99Var = o25VarC.a;
        strValueOf.getClass();
        charset.getClass();
        h99Var.getClass();
        if (fd9.T(file, h99Var) && fd9.y(file, h99Var)) {
            g99 g99Var = g99.G;
            g99 g99Var2 = g99.F;
            try {
                nk7.r0(file, strValueOf, charset);
            } catch (SecurityException e) {
                dch.I(h99Var, 5, x44.X(g99Var2, g99Var), new fh1(file, 4), e, 48);
            } catch (Exception e2) {
                dch.I(h99Var, 5, x44.X(g99Var2, g99Var), new fh1(file, 5), e2, 48);
            }
        }
    }

    @Override // defpackage.k99
    public final h99 t() {
        return this.k;
    }

    @Override // defpackage.k99
    public final lj5 u(Set set) {
        set.getClass();
        ThreadPoolExecutor threadPoolExecutorA = C().a();
        mj5 mj5Var = new mj5(this, 0, set);
        h99 h99Var = this.k;
        return (lj5) v40.B(v40.P(threadPoolExecutorA, "getDatadogContext", h99Var, mj5Var), "getDatadogContext", h99Var);
    }

    @Override // defpackage.k99
    public final hr5 v() {
        return C().i;
    }

    @Override // defpackage.k99
    public final ExecutorService w(String str) {
        o25 o25VarC = C();
        sz6 sz6Var = o25VarC.c;
        h99 h99Var = o25VarC.a;
        pb1 pb1Var = o25VarC.G;
        if (pb1Var == null) {
            x44.o0("backpressureStrategy");
            throw null;
        }
        iuj iujVar = o25VarC.l;
        sz6Var.getClass();
        h99Var.getClass();
        iujVar.getClass();
        return new ob1(h99Var, str, pb1Var, iujVar);
    }

    @Override // defpackage.k99
    public final ExecutorService x() {
        return C().b();
    }

    @Override // defpackage.k99
    public final iuj y() {
        return C().l;
    }

    @Override // defpackage.k99
    public final qh9 z() {
        return (qh9) C().I.getValue();
    }
}
