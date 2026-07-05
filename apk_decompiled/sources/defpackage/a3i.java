package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class a3i implements Runnable {
    public static final Object K = new Object();
    public static Boolean L;
    public static Boolean M;
    public final /* synthetic */ int E;
    public final long F;
    public final Object G;
    public final Object H;
    public final Object I;
    public final Object J;

    public a3i(y2i y2iVar, Context context, hjb hjbVar, long j) {
        this.E = 0;
        this.J = y2iVar;
        this.G = context;
        this.F = j;
        this.H = hjbVar;
        this.I = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean zBooleanValue;
        synchronized (K) {
            try {
                Boolean bool = M;
                if (bool == null && bool == null) {
                    zBooleanValue = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0;
                    if (!zBooleanValue) {
                        Log.isLoggable("FirebaseMessaging", 3);
                    }
                } else {
                    zBooleanValue = bool.booleanValue();
                }
                M = Boolean.valueOf(zBooleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public static boolean b(Context context) {
        boolean zBooleanValue;
        synchronized (K) {
            try {
                Boolean bool = L;
                if (bool == null && bool == null) {
                    zBooleanValue = context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0;
                    if (!zBooleanValue) {
                        Log.isLoggable("FirebaseMessaging", 3);
                    }
                } else {
                    zBooleanValue = bool.booleanValue();
                }
                L = Boolean.valueOf(zBooleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean c() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.Object r0 = r2.G     // Catch: java.lang.Throwable -> L14
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L14
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L16
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r0 = move-exception
            goto L24
        L16:
            r0 = 0
        L17:
            if (r0 == 0) goto L21
            boolean r0 = r0.isConnected()     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L21
            r0 = 1
            goto L22
        L21:
            r0 = 0
        L22:
            monitor-exit(r2)
            return r0
        L24:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a3i.c():boolean");
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        long j = this.F;
        Object obj = this.I;
        Object obj2 = this.H;
        Object obj3 = this.G;
        Object obj4 = this.J;
        switch (i) {
            case 0:
                y2i y2iVar = (y2i) obj4;
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) obj;
                Context context = (Context) obj3;
                if (b(context)) {
                    wakeLock.acquire(180000L);
                }
                try {
                    try {
                        y2iVar.d(true);
                        if (!((hjb) obj2).e()) {
                            y2iVar.d(false);
                            if (!b(context)) {
                                return;
                            }
                        } else if (!a(context) || c()) {
                            if (y2iVar.e()) {
                                y2iVar.d(false);
                            } else {
                                y2iVar.f(j);
                            }
                            if (!b(context)) {
                                return;
                            }
                        } else {
                            z2i z2iVar = new z2i();
                            z2iVar.a = this;
                            Log.isLoggable("FirebaseMessaging", 3);
                            context.registerReceiver(z2iVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                            if (!b(context)) {
                                return;
                            }
                        }
                    } catch (IOException e) {
                        Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e.getMessage());
                        y2iVar.d(false);
                        if (!b(context)) {
                            return;
                        }
                    }
                    try {
                        wakeLock.release();
                        return;
                    } catch (RuntimeException unused) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        return;
                    }
                } catch (Throwable th) {
                    if (b(context)) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                        break;
                    }
                    throw th;
                }
            case 1:
                String str = (String) obj2;
                o0l o0lVar = ((mnk) obj4).i;
                String str2 = (String) obj3;
                if (str2 == null) {
                    o0lVar.O().K0();
                    String str3 = o0lVar.j0;
                    if (str3 == null || str3.equals(str)) {
                        o0lVar.j0 = str;
                        o0lVar.i0 = null;
                        return;
                    }
                    return;
                }
                xxk xxkVar = new xxk((String) obj, str2, j);
                o0lVar.O().K0();
                String str4 = o0lVar.j0;
                if (str4 != null) {
                    str4.equals(str);
                }
                o0lVar.j0 = str;
                o0lVar.i0 = xxkVar;
                return;
            case 2:
                ((jsk) obj4).S0(this.F, this.I, (String) obj3, (String) obj2);
                return;
            default:
                vxk vxkVar = (vxk) obj4;
                Bundle bundle = (Bundle) obj3;
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                vxkVar.V0((xxk) obj2, (xxk) obj, this.F, true, vxkVar.J0().U0("screen_view", bundle, null, false));
                return;
        }
    }

    public /* synthetic */ a3i(Object obj, Object obj2, Object obj3, Object obj4, long j, int i) {
        this.E = i;
        this.G = obj2;
        this.H = obj3;
        this.I = obj4;
        this.F = j;
        this.J = obj;
    }
}
