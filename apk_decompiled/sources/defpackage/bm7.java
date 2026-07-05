package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class bm7 {
    public boolean a;
    public final Object b;
    public Object c;
    public Object d;

    public bm7() {
        this.b = new Object();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.a = true;
    }

    public synchronized void a() {
        try {
            if (this.a) {
                return;
            }
            Boolean boolC = c();
            this.c = boolC;
            if (boolC == null) {
                xh6 xh6Var = new xh6(16);
                gv6 gv6Var = (gv6) ((mvg) this.b);
                gv6Var.a(gv6Var.c, xh6Var);
            }
            this.a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean b() {
        boolean z;
        boolean zBooleanValue;
        try {
            a();
            Boolean bool = (Boolean) this.c;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                pl7 pl7Var = ((FirebaseMessaging) this.d).a;
                pl7Var.a();
                rf5 rf5Var = (rf5) pl7Var.g.get();
                synchronized (rf5Var) {
                    z = rf5Var.a;
                }
                zBooleanValue = z;
            }
        } catch (Throwable th) {
            throw th;
        }
        return zBooleanValue;
    }

    public Boolean c() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        pl7 pl7Var = ((FirebaseMessaging) this.d).a;
        pl7Var.a();
        Context context = pl7Var.a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), FreeTypeConstants.FT_LOAD_PEDANTIC)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public String d() {
        if (!this.a) {
            this.a = true;
            this.c = ((vik) this.d).T0().getString((String) this.b, null);
        }
        return (String) this.c;
    }

    public iqk e(long j, String str) {
        Long lValueOf = Long.valueOf(j);
        Object obj = iqk.g;
        return new iqk(this, str, lValueOf, 1);
    }

    public iqk f(String str, String str2) {
        Object obj = iqk.g;
        return new iqk(this, str, str2, 2);
    }

    public iqk g(String str, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Object obj = iqk.g;
        return new iqk(this, str, boolValueOf, 0);
    }

    public void h(String str) {
        SharedPreferences.Editor editorEdit = ((vik) this.d).T0().edit();
        editorEdit.putString((String) this.b, str);
        editorEdit.apply();
        this.c = str;
    }

    public bm7(vik vikVar, String str) {
        this.d = vikVar;
        dgj.s(str);
        this.b = str;
    }

    public bm7(Object obj) {
        this.b = new efk(20);
        this.c = obj;
        this.d = nm6.E;
    }

    public bm7(Uri uri, String str, String str2, boolean z, boolean z2) {
        this.b = uri;
        this.c = str;
        this.d = str2;
        this.a = z;
    }

    public /* synthetic */ bm7(Object obj, Object obj2, Object obj3, boolean z) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.a = z;
    }

    public bm7(jz9 jz9Var, fvg fvgVar, lcd lcdVar) {
        this.b = jz9Var;
        this.c = fvgVar;
        this.d = lcdVar;
        this.a = true;
    }

    public bm7(FirebaseMessaging firebaseMessaging, mvg mvgVar) {
        this.d = firebaseMessaging;
        this.b = mvgVar;
    }
}
