package com.google.android.gms.net;

import android.content.Context;
import android.os.Trace;
import android.util.Log;
import com.anthropic.claude.api.tasks.TaskSessionEvent;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import defpackage.c5a;
import defpackage.dgj;
import defpackage.f3k;
import defpackage.g88;
import defpackage.j5h;
import defpackage.r5l;
import defpackage.si6;
import java.lang.reflect.Method;
import org.chromium.net.ApiVersion;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final g88 a = g88.b;
    public static final Object b = new Object();
    public static si6 c = null;
    public static String d = TaskSessionEvent.REPLAY_FROM_START;
    public static boolean e;

    public static r5l a(Context context) {
        j5h j5hVar = new j5h();
        if (HttpEngineProviderSingleton.getInstance(context).shouldUseHttpEngine()) {
            j5hVar.b(null);
            synchronized (b) {
                e = true;
            }
            return j5hVar.a;
        }
        if (b()) {
            j5hVar.b(null);
            return j5hVar.a;
        }
        Trace.beginSection("PlayServices CronetProviderInstaller#installProvider starting thread");
        try {
            new Thread(new c5a(context, j5hVar, false, 3)).start();
            Trace.endSection();
            return j5hVar.a;
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static boolean b() {
        boolean z;
        Object obj = b;
        synchronized (obj) {
            try {
                if (e) {
                    return true;
                }
                synchronized (obj) {
                    z = c != null;
                }
                return z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void c(Context context) {
        synchronized (b) {
            try {
                if (b()) {
                    return;
                }
                f3k f3kVar = new f3k(context, 37401, 1.0f);
                try {
                    Trace.beginSection("PlayServices CronetProviderInstaller#installIfNeeded");
                    try {
                        dgj.w("Context must not be null", context);
                        if (HttpEngineProviderSingleton.getInstance(context).shouldUseHttpEngine()) {
                            e = true;
                            f3kVar.J = 0;
                            Trace.endSection();
                            f3kVar.close();
                            return;
                        }
                        ClassLoader classLoader = a.class.getClassLoader();
                        dgj.v(classLoader);
                        try {
                            classLoader.loadClass("org.chromium.net.CronetEngine");
                            int apiLevel = ApiVersion.getApiLevel();
                            Trace.beginSection("PlayServices CronetProviderInstaller#installIfNeeded verifyGooglePlayServicesIsAvailable");
                            try {
                                g88 g88Var = a;
                                g88Var.getClass();
                                g88.d(context);
                                Trace.endSection();
                                try {
                                    Trace.beginSection("CronetProviderInstaller#installIfNeeded DynamiteModule#load");
                                    try {
                                        si6 si6VarC = si6.c(context, si6.b, "com.google.android.gms.cronet_dynamite");
                                        Trace.endSection();
                                        try {
                                            Trace.beginSection("PlayServices CronetProviderInstaller#installIfNeeded loading class");
                                            try {
                                                Class<?> clsLoadClass = si6VarC.a.getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                                                if (clsLoadClass.getClassLoader() == a.class.getClassLoader()) {
                                                    Log.e("a", "ImplVersion class is missing from Cronet module.");
                                                    throw new GooglePlayServicesNotAvailableException(8);
                                                }
                                                Method method = clsLoadClass.getMethod("getApiLevel", null);
                                                Method method2 = clsLoadClass.getMethod("getCronetVersion", null);
                                                Integer num = (Integer) method.invoke(null, null);
                                                dgj.v(num);
                                                int iIntValue = num.intValue();
                                                String str = (String) method2.invoke(null, null);
                                                dgj.v(str);
                                                d = str;
                                                Trace.endSection();
                                                if (apiLevel <= iIntValue) {
                                                    c = si6VarC;
                                                    f3kVar.J = 0;
                                                    Trace.endSection();
                                                    f3kVar.close();
                                                    return;
                                                }
                                                if (g88Var.b(2, context, "cr") == null) {
                                                    Log.e("a", "Unable to fetch error resolution intent");
                                                    throw new GooglePlayServicesNotAvailableException(2);
                                                }
                                                String str2 = d;
                                                StringBuilder sb = new StringBuilder(String.valueOf(apiLevel).length() + 113 + String.valueOf(iIntValue).length() + 39 + String.valueOf(str2).length());
                                                sb.append("Google Play Services update is required. The API Level of the client is ");
                                                sb.append(apiLevel);
                                                sb.append(". The API Level of the implementation is ");
                                                sb.append(iIntValue);
                                                sb.append(". The Cronet implementation version is ");
                                                sb.append(str2);
                                                throw new GooglePlayServicesRepairableException(sb.toString());
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        } catch (Exception e2) {
                                            Log.e("a", "Unable to read Cronet version from the Cronet module ", e2);
                                            throw ((GooglePlayServicesNotAvailableException) new GooglePlayServicesNotAvailableException(8).initCause(e2));
                                        }
                                    } finally {
                                        try {
                                            Trace.endSection();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                    }
                                } catch (DynamiteModule$LoadingException e3) {
                                    Log.e("a", "Unable to load Cronet module", e3);
                                    throw ((GooglePlayServicesNotAvailableException) new GooglePlayServicesNotAvailableException(8).initCause(e3));
                                }
                            } finally {
                            }
                        } catch (ClassNotFoundException e4) {
                            Log.e("a", "Cronet API is not available. Have you included all required dependencies?");
                            throw ((GooglePlayServicesNotAvailableException) new GooglePlayServicesNotAvailableException(10).initCause(e4));
                        }
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
