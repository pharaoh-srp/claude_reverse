package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class m3l {
    public static final sqb e = new sqb("AppUpdateService");
    public static final Intent f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");
    public final u5l a;
    public final String b;
    public final Context c;
    public final v4l d;

    public m3l(Context context, v4l v4lVar) {
        this.b = context.getPackageName();
        this.c = context;
        this.d = v4lVar;
        sqb sqbVar = mpj.a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (signatureArr.length) == 0) {
                    sqb sqbVar2 = mpj.a;
                    Object[] objArr = new Object[0];
                    sqbVar2.getClass();
                    if (Log.isLoggable("PlayCore", 5)) {
                        Log.w("PlayCore", sqb.d(sqbVar2.b, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
                        return;
                    }
                    return;
                }
                for (Signature signature : signatureArr) {
                    String strS = cok.s(signature.toByteArray());
                    if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strS)) {
                        String str = Build.TAGS;
                        if ((!str.contains("dev-keys") && !str.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strS)) {
                        }
                    }
                    Context applicationContext = context.getApplicationContext();
                    this.a = new u5l(applicationContext != null ? applicationContext : context, e, f);
                    return;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static Bundle a(m3l m3lVar, String str) {
        Integer numValueOf;
        Bundle bundle = new Bundle();
        bundle.putAll(b());
        bundle.putString("package.name", str);
        try {
            numValueOf = Integer.valueOf(m3lVar.c.getPackageManager().getPackageInfo(m3lVar.c.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            Object[] objArr = new Object[0];
            sqb sqbVar = e;
            sqbVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", sqb.d(sqbVar.b, "The current version of the app could not be retrieved", objArr));
            }
            numValueOf = null;
        }
        if (numValueOf != null) {
            bundle.putInt("app.version.code", numValueOf.intValue());
        }
        return bundle;
    }

    public static Bundle b() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        Map mapA = dnk.a();
        bundle2.putInt("playcore_version_code", ((Integer) mapA.get("java")).intValue());
        if (mapA.containsKey("native")) {
            bundle2.putInt("playcore_native_version", ((Integer) mapA.get("native")).intValue());
        }
        if (mapA.containsKey("unity")) {
            bundle2.putInt("playcore_unity_version", ((Integer) mapA.get("unity")).intValue());
        }
        bundle.putAll(bundle2);
        bundle.putInt("playcore.version.code", 11004);
        return bundle;
    }
}
