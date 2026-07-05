package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class z88 {
    public static boolean b = false;
    public static boolean c = false;
    public static final AtomicBoolean a = new AtomicBoolean();
    public static final AtomicBoolean d = new AtomicBoolean();

    public static boolean a(Context context) {
        try {
            if (!c) {
                try {
                    PackageInfo packageInfoE = nij.a(context).E(Build.VERSION.SDK_INT >= 28 ? 134217792 : 64, "com.google.android.gms");
                    u98.a(context);
                    if (packageInfoE == null || u98.d(packageInfoE, false) || !u98.d(packageInfoE, true)) {
                        b = false;
                    } else {
                        b = true;
                    }
                    c = true;
                } catch (PackageManager.NameNotFoundException e) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
                    c = true;
                }
            }
            return b || !"user".equals(Build.TYPE);
        } catch (Throwable th) {
            c = true;
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(android.content.Context r9, int r10) {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z88.b(android.content.Context, int):int");
    }
}
