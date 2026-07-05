package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import defpackage.kd4;
import io.sentry.t5;
import io.sentry.w6;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class u0 {
    public static volatile u0 i;
    public static final io.sentry.util.a j = new io.sentry.util.a();
    public final Context a;
    public final SentryAndroidOptions b;
    public final l0 c;
    public final Boolean d;
    public final kd4 e;
    public final kd4 f;
    public final io.sentry.protocol.q g;
    public final Long h;

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c1, code lost:
    
        r6 = "su";
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c9, code lost:
    
        r6 = r9.f.exec(new java.lang.String[]{"/system/xbin/which", "su"});
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cf, code lost:
    
        r10 = new java.io.BufferedReader(new java.io.InputStreamReader(r6.getInputStream(), io.sentry.android.core.internal.util.k.g));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e3, code lost:
    
        if (r10.readLine() == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e5, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e7, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e8, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00eb, code lost:
    
        r6.destroy();
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ef, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00fc, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fd, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ff, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0101, code lost:
    
        r13.d(io.sentry.t5.DEBUG, "Error when trying to check if SU exists.", r0);
        r6 = r6;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x010e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0110, code lost:
    
        r13.h(io.sentry.t5.DEBUG, "SU isn't found on this Device.", new java.lang.Object[0]);
        r6 = r6;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0119, code lost:
    
        if (r6 != null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011c, code lost:
    
        r0 = false;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x011d, code lost:
    
        if (r0 != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x011f, code lost:
    
        io.sentry.p.v("The ILogger object is required.", r13);
        r0 = r9.a.getPackageManager();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012a, code lost:
    
        if (r0 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x012c, code lost:
    
        r6 = r9.e;
        r9 = r6.length;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0132, code lost:
    
        r11 = r6[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0136, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 33) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0138, code lost:
    
        r0.getPackageInfo(r11, android.content.pm.PackageManager.PackageInfoFlags.of(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0140, code lost:
    
        r0.getPackageInfo(r11, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0144, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0147, code lost:
    
        r0 = false;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0151, code lost:
    
        if (r6 != 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0153, code lost:
    
        r6.destroy();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0156, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010a A[DONT_GENERATE, PHI: r6
      0x010a: PHI (r6v11 java.lang.Process) = (r6v35 java.lang.Process), (r6v36 java.lang.Process) binds: [B:60:0x0108, B:65:0x0119] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0149 A[EDGE_INSN: B:143:0x0149->B:81:0x0149 BREAK  A[LOOP:0: B:29:0x009f->B:37:0x00be], EDGE_INSN: B:81:0x0149->B:82:0x014a BREAK  A[LOOP:1: B:72:0x0130->B:79:0x0144], PHI: r6
      0x0149: PHI (r6v23 ??) = (r6v14 ??), (r6v16 ??), (r6v6 ??), (r6v2 ??) binds: [B:68:0x011d, B:125:0x0149, B:143:0x0149, B:26:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0171 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0190  */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public u0(android.content.Context r17, io.sentry.android.core.SentryAndroidOptions r18) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.u0.<init>(android.content.Context, io.sentry.android.core.SentryAndroidOptions):void");
    }

    public static Float b(Intent intent, w6 w6Var) {
        try {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra != -1 && intExtra2 != -1) {
                return Float.valueOf((intExtra / intExtra2) * 100.0f);
            }
            return null;
        } catch (Throwable th) {
            w6Var.getLogger().d(t5.ERROR, "Error getting device battery level.", th);
            return null;
        }
    }

    public static u0 c(Context context, SentryAndroidOptions sentryAndroidOptions) {
        if (i == null) {
            io.sentry.v vVarA = j.a();
            try {
                if (i == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    i = new u0(context, sentryAndroidOptions);
                }
                vVarA.close();
            } catch (Throwable th) {
                try {
                    vVarA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return i;
    }

    public static Boolean d(Intent intent, w6 w6Var) {
        try {
            int intExtra = intent.getIntExtra("plugged", -1);
            boolean z = true;
            if (intExtra != 1 && intExtra != 2) {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (Throwable th) {
            w6Var.getLogger().d(t5.ERROR, "Error getting device charging state.", th);
            return null;
        }
    }

    public final io.sentry.protocol.h a(boolean z, boolean z2) {
        io.sentry.protocol.g gVarR;
        DisplayMetrics displayMetrics;
        Date dateL;
        String strA;
        Long lValueOf;
        File file;
        Long lValueOf2;
        Long lValueOf3;
        int intExtra;
        Context context = this.a;
        io.sentry.protocol.h hVar = new io.sentry.protocol.h();
        hVar.F = Build.MANUFACTURER;
        hVar.G = Build.BRAND;
        SentryAndroidOptions sentryAndroidOptions = this.b;
        hVar.H = p0.b(sentryAndroidOptions.getLogger());
        hVar.I = Build.MODEL;
        hVar.J = Build.ID;
        hVar.K = Build.SUPPORTED_ABIS;
        this.c.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            hVar.l0 = Build.SOC_MANUFACTURER + " " + Build.SOC_MODEL;
        }
        Long lValueOf4 = null;
        try {
            gVarR = io.sentry.config.a.r(context.getResources().getConfiguration().orientation);
            if (gVarR == null) {
                try {
                    sentryAndroidOptions.getLogger().h(t5.INFO, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", new Object[0]);
                    gVarR = null;
                } catch (Throwable th) {
                    th = th;
                    sentryAndroidOptions.getLogger().d(t5.ERROR, "Error getting device orientation.", th);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            gVarR = null;
        }
        hVar.O = gVarR;
        Boolean bool = this.d;
        if (bool != null) {
            hVar.P = bool;
        }
        io.sentry.a1 logger = sentryAndroidOptions.getLogger();
        try {
            displayMetrics = context.getResources().getDisplayMetrics();
        } catch (Throwable th3) {
            logger.d(t5.ERROR, "Error getting DisplayMetrics.", th3);
            displayMetrics = null;
        }
        if (displayMetrics != null) {
            hVar.Y = Integer.valueOf(displayMetrics.widthPixels);
            hVar.Z = Integer.valueOf(displayMetrics.heightPixels);
            hVar.a0 = Float.valueOf(displayMetrics.density);
            hVar.b0 = Integer.valueOf(displayMetrics.densityDpi);
        }
        try {
            dateL = io.sentry.p.l(System.currentTimeMillis() - SystemClock.elapsedRealtime());
        } catch (IllegalArgumentException e) {
            sentryAndroidOptions.getLogger().b(t5.ERROR, e, "Error getting the device's boot time.", new Object[0]);
            dateL = null;
        }
        hVar.c0 = dateL;
        LocaleList locales = context.getResources().getConfiguration().getLocales();
        hVar.d0 = !locales.isEmpty() ? Calendar.getInstance(locales.get(0)).getTimeZone() : Calendar.getInstance().getTimeZone();
        if (hVar.e0 == null) {
            try {
                strA = z0.a(context);
            } catch (Throwable th4) {
                sentryAndroidOptions.getLogger().d(t5.ERROR, "Error getting installationId.", th4);
                strA = null;
            }
            hVar.e0 = strA;
        }
        Locale locale = Locale.getDefault();
        if (hVar.f0 == null) {
            hVar.f0 = locale.toString();
        }
        ArrayList arrayListA = io.sentry.android.core.internal.util.g.c.a();
        if (!arrayListA.isEmpty()) {
            hVar.j0 = Double.valueOf(((Integer) Collections.max(arrayListA)).doubleValue());
            hVar.i0 = Integer.valueOf(arrayListA.size());
        }
        hVar.Q = this.h;
        if (z && sentryAndroidOptions.isCollectAdditionalContext()) {
            boolean zIsCollectExternalStorageContext = sentryAndroidOptions.isCollectExternalStorageContext();
            IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
            Intent intentRegisterReceiver = Build.VERSION.SDK_INT >= 33 ? context.registerReceiver(null, intentFilter, null, null, 4) : context.registerReceiver(null, intentFilter, null, null);
            if (intentRegisterReceiver != null) {
                hVar.L = b(intentRegisterReceiver, sentryAndroidOptions);
                hVar.M = d(intentRegisterReceiver, sentryAndroidOptions);
                try {
                    intExtra = intentRegisterReceiver.getIntExtra("temperature", -1);
                } catch (Throwable th5) {
                    sentryAndroidOptions.getLogger().d(t5.ERROR, "Error getting battery temperature.", th5);
                }
                Float fValueOf = intExtra != -1 ? Float.valueOf(intExtra / 10.0f) : null;
                hVar.h0 = fValueOf;
            }
            int i2 = t0.a[sentryAndroidOptions.getConnectionStatusProvider().e0().ordinal()];
            hVar.N = i2 != 1 ? i2 != 2 ? null : Boolean.TRUE : Boolean.FALSE;
            ActivityManager.MemoryInfo memoryInfoC = p0.c(context, sentryAndroidOptions.getLogger());
            if (memoryInfoC != null && z2) {
                hVar.R = Long.valueOf(memoryInfoC.availMem);
                hVar.T = Boolean.valueOf(memoryInfoC.lowMemory);
            }
            File dataDirectory = Environment.getDataDirectory();
            if (dataDirectory != null) {
                StatFs statFs = new StatFs(dataDirectory.getPath());
                try {
                    lValueOf2 = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                } catch (Throwable th6) {
                    sentryAndroidOptions.getLogger().d(t5.ERROR, "Error getting total internal storage amount.", th6);
                    lValueOf2 = null;
                }
                hVar.U = lValueOf2;
                try {
                    lValueOf3 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                } catch (Throwable th7) {
                    sentryAndroidOptions.getLogger().d(t5.ERROR, "Error getting unused internal storage amount.", th7);
                    lValueOf3 = null;
                }
                hVar.V = lValueOf3;
            }
            if (zIsCollectExternalStorageContext) {
                File externalFilesDir = context.getExternalFilesDir(null);
                try {
                    File[] externalFilesDirs = context.getExternalFilesDirs(null);
                    if (externalFilesDirs != null) {
                        String absolutePath = externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null;
                        int length = externalFilesDirs.length;
                        for (int i3 = 0; i3 < length; i3++) {
                            file = externalFilesDirs[i3];
                            if (file != null) {
                                if (absolutePath == null || absolutePath.isEmpty() || !file.getAbsolutePath().contains(absolutePath)) {
                                    break;
                                }
                            }
                        }
                    } else {
                        sentryAndroidOptions.getLogger().h(t5.INFO, "Not possible to read getExternalFilesDirs", new Object[0]);
                    }
                    file = null;
                } catch (Throwable unused) {
                    sentryAndroidOptions.getLogger().h(t5.INFO, "Not possible to read external files directory", new Object[0]);
                }
                StatFs statFs2 = file != null ? new StatFs(file.getPath()) : null;
                if (statFs2 != null) {
                    try {
                        lValueOf = Long.valueOf(statFs2.getBlockCountLong() * statFs2.getBlockSizeLong());
                    } catch (Throwable th8) {
                        sentryAndroidOptions.getLogger().d(t5.ERROR, "Error getting total external storage amount.", th8);
                        lValueOf = null;
                    }
                    hVar.W = lValueOf;
                    try {
                        lValueOf4 = Long.valueOf(statFs2.getAvailableBlocksLong() * statFs2.getBlockSizeLong());
                    } catch (Throwable th9) {
                        sentryAndroidOptions.getLogger().d(t5.ERROR, "Error getting unused external storage amount.", th9);
                    }
                    hVar.X = lValueOf4;
                }
            }
            if (hVar.g0 == null) {
                hVar.g0 = sentryAndroidOptions.getConnectionStatusProvider().w();
            }
        }
        return hVar;
    }
}
